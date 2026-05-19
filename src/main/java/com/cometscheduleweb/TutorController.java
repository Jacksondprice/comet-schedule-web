package com.cometscheduleweb;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tutors")
public class TutorController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
