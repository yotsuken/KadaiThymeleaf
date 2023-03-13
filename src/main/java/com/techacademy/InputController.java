package com.techacademy;

//KadaiThymeleaf/InputController.java

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

 @GetMapping("/input")
 public String getInput(Model model) {
     // プロパティファイルの値をモデルに設定する
     model.addAttribute("kadai_title", "Thymeleaf課題");
     model.addAttribute("kadai_message", "入力画面");
     return "input";
 }


 @PostMapping("/input")
 public String postForm(@RequestParam("val") String val, Model model) {
     // フォームから送信されてきた値をModelに登録
     model.addAttribute("val", val);
     // confirm.htmlに画面遷移
     return "input";
 }
}
