package co.grandcircus.Pizza.Lab;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	private static final DecimalFormat df = new DecimalFormat("0.00");

	@RequestMapping("PizzaApp")
	public String showPizzaApp() {
		return "PizzaApp";
	}

	@RequestMapping("specialty")
	public String showSpecialty(@RequestParam String type, @RequestParam String price, Model model) {
		model.addAttribute("type", type);
		model.addAttribute("price", price);

		return "DisplaySpecialty";
	}

	@RequestMapping("/review")
	public String showReview() {
		return "DisplayReview";
	}

	@PostMapping("/review")
	public String YourReview(@RequestParam String name, @RequestParam String comment, @RequestParam int rating,
			Model model) {

		if (name.length() == 0) {
			name = "Error, please fill out name field";
		}
		if (comment.length() < 5) {
			comment = "Error, comment field must have at least 5 characters";
		}
		model.addAttribute("name", name);
		model.addAttribute("comment", comment);
		model.addAttribute("rating", rating);
		return "YourReview";
	}

	@RequestMapping("/custom")
	public String showCustom() {
		return "CustomOrder";
	}

	@PostMapping("/custom")
	public String submitCustom(@RequestParam String size, @RequestParam int toppingCount,
			@RequestParam(required = false) boolean glutenFree, @RequestParam(required = false) String special,
			Model model) {
		String glutenFreeString = "";
		model.addAttribute("size", size);
		model.addAttribute("toppingCount", toppingCount);
		model.addAttribute("glutenFree", glutenFree);
		model.addAttribute("special", special);
		if (glutenFree) {
			glutenFreeString = "yes";
		} else {
			glutenFreeString = "no";
		}
		model.addAttribute("glutenFreeString", glutenFreeString);

		double price = 0.0;
		switch (size) {
		case ("small"):
			price = 7 + (.5 * toppingCount);
			break;
		case ("medium"):
			price = 10 + toppingCount;
			break;
		case ("large"):
			price = 12 + (1.25 * toppingCount);
			break;
		}
		if (glutenFree) {
			price += 2;
		}
		model.addAttribute("price", df.format(price));
		return "YourCustomOrder";
	}
}