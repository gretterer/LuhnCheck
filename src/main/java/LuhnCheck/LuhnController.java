package LuhnCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ccCheck/{value}")
public class LuhnController {

    //This code runs, but the display is currently only a test screen - need to add js to make functional
    @GetMapping
    public String ccCheck(@PathVariable String value) {

        Long ccNumber = Long.parseLong(value);

        //add try block to and handle error

        LuhnChecker LuhnCheck = new LuhnChecker();
        String result = LuhnCheck.CardResult(ccNumber);
        return(result);
    }

}
