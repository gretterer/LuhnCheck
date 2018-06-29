package LuhnCheck;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ccCheck/{value}")
public class LuhnController {

    //This code runs, but the display is currently only a test screen - need to add js to make functional
    @GetMapping
    @CrossOrigin(origins = "*")
    public String[] ccCheck(@PathVariable String value) {

        Long ccNumber = Long.parseLong(value);

        //add try block to and handle error

        LuhnChecker LuhnCheck = new LuhnChecker();
        String[] result = new String[]{"result", LuhnCheck.CardResult(ccNumber)};
        return(result);
    }

}
