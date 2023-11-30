package pl.mschielmann.setup.ui;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
class MainController {

    @GetMapping("/ui/")
    String getMain(Model model, HttpServletRequest request) {
        return "outline";
    }
}
