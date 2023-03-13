package com.techacademy;

//KadaiThymeleaf/OutputController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @GetMapping("/output")
    public String getInput(Model model) {
        // プロパティファイルの値をモデルに設定する
        model.addAttribute("kadai_title", "Thymeleaf課題");
        model.addAttribute("kadai_message", "入力画面");
        return "output";
    }


    @PostMapping("/output")
    public String postOutput(@RequestParam("inputValue") String inputValue, Model model) {
        // 入力値を受け取って、出力画面に表示するデータをモデルに設定する
        model.addAttribute("inputValue", inputValue);
        return "output";
    }

}