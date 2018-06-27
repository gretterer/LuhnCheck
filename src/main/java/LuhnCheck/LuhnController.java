package LuhnCheck;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LuhnController {

    //This code runs, but the display is currently only a test screen - need to add js to make functional
    @GetMapping("/ccCheck")
    public void ccCheck(@RequestParam(value="ccNumber", required = false, defaultValue = "4111111111111111") String value, Model model) {
        model.addAttribute("ccNumber", value);
        Long ccNumber = Long.parseLong(value);

        //add try block to and handle error

        LuhnChecker LuhnCheck = new LuhnChecker();
        String result = LuhnCheck.CardResult(ccNumber);
        model.addAttribute("result", result);
    }

}
