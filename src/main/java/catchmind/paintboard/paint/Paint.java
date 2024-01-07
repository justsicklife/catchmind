package catchmind.paintboard.paint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paint")
public class Paint {

    @GetMapping("/user")
    public String paint() {
        return "paint/paint";
    }
}
