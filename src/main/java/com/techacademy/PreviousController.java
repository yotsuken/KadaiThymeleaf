package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PreviousController {


    @GetMapping("/input/")
    public String getPrevious() {
        //input.htmlに画面遷移
        return "previous";
    }

    @PostMapping("/input/")
    public String postPrevious(@RequestParam("val") String val, Model model) {
        // フォームから送信されてきた値をModelに登録
        model.addAttribute("val", val);
        // confirm.htmlに画面遷移
        return "previous";
    }




}
