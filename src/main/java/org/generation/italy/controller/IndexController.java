/**
 * 
 */
package org.generation.italy.controller;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lucai
 *
 */

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping("/best")
	@ResponseBody
	public String best() {
		String name = "Luca";
		return "<html><body><h1>Best of 2021 by " + name + "</h1></body></html>";
	}

	@GetMapping
	public String index(Model model) {

		model.addAttribute("name", "Luca");

		return "index";
	}

	@GetMapping("/movies")
	public String moviesList(Model model) {

		model.addAttribute("movies", Arrays.asList("Spiderman", "Dune", "Boh"));

		return "movies";
	}

	@GetMapping("/songs")
	public String songsList(Model model) {

		model.addAttribute("songs", Arrays.asList("AAAA", "BBBB", "CCCC", "DDDD", "EEEE"));

		return "songs";
	}

}
