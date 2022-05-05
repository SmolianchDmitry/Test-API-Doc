package by.itsm.controllers;

import by.itsm.dto.ParamSearchDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/auto-search")
public class AutoSearchController {

    @GetMapping
    public List<ParamSearchDto> getAll() {
        ParamSearchDto paramSearchDto = new ParamSearchDto( "bmv", "5", "black", 2000);
        return new ArrayList<>(Collections.singleton(paramSearchDto));
    }
}
