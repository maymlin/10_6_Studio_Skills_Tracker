package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(method={ RequestMethod.POST, RequestMethod.GET})
public class SkillsController {

    public String listSkills() {
        String html =
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    public String skillsForm() {
        String html =
                "<html>" +
                    "<body>" +
                        "<form method='post' action='formresult'>" +
                            "<label for='name'>Name:</label><br>" +
                            "<input type='text' name='name' /><br>" +
                            "<label for='favoriteLanguage'>My favorite language:</label><br>" +
                            "<select name='favoriteLanguage'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select><br>" +
                            "<label for='secondFavoriteLanguage'>My second favorite language:</label><br>" +
                            "<select name='secondFavoriteLanguage'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select><br>" +
                            "<label for='thirdFavoriteLanguage'>My third favorite language:</label><br>" +
                            "<select name='thirdFavoriteLanguage'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javaScript'>JavaScript</option>" +
                                "<option value='python'>Python</option>" +
                            "</select><br>" +
                            "<input type='submit' value='Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";

        return html;
    }

    @PostMapping("formresult")
    public String formHandler(@RequestParam String name,
                              @RequestParam String favoriteLanguage,
                              @RequestParam String secondFavoriteLanguage,
                              @RequestParam String thirdFavoriteLanguage) {
        String html =
                "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "<ol>" +
                            "<li>" + favoriteLanguage+"</li>" +
                            "<li>" + secondFavoriteLanguage +"</li>" +
                            "<li>" + thirdFavoriteLanguage +"</li>" +
                        "</ol>" +
                    "</body>" +
                "</html>";

        return html;
    }

}
