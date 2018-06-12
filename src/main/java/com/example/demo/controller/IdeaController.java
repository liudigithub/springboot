package com.example.demo.controller;

import com.example.demo.dao.GirlRep;
import com.example.demo.dao.IdeaRep;
import com.example.demo.model.Girl;
import com.example.demo.model.Idea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by bus on 2018/6/6.
 */
@RestController
@RequestMapping("/idea")
public class IdeaController {
    @Autowired
    private IdeaRep ideaRep;

    /**
     * 查询所有
     *
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Idea> getGirlList() {
        return ideaRep.findAll();
    }


    /**
     * 添加
     *
     * @param idea
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Idea addGirls(Idea idea) {
        return ideaRep.save(idea);
    }


}
