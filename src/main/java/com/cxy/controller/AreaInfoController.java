package com.cxy.controller;

import com.cxy.domain.*;
import com.cxy.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AreaInfoController {

    @Autowired
    AreaInfoService areaInfoService;
    @Autowired
    AgentManTopService agentManTopService;
    @Autowired
    CreatorTopService creatorTopService;
    @Autowired
    YearSumService yearSumService;
    @Autowired
    KeyWordsTopService keyWordsTopService;

    @RequestMapping("/area")
    public AreaInfo show(){
        return this.areaInfoService.getAreaInfoByID(1);
    }

    /*暂时把返回全部表数据的都写在这个controller里面*/
    @RequestMapping("/allarea")
    public List<AreaInfo> showAll(){
        return this.areaInfoService.getAllAreaInfo(1);
    }
    @RequestMapping("/allchinesearea")
    public List<AreaInfo> showAllChineseArea(){ return this.areaInfoService.getAllChineseInfo(1);}
    @RequestMapping("/agentmantop")
    public List<AgentManTop> showAllAgentManTop(){
        return this.agentManTopService.getAllAgentManTop(1);
    }
    @RequestMapping("/creatortop")
    public List<CreatorTop> showAllCreatorTop(){ return this.creatorTopService.getAllCreatorTop(1);}
    @RequestMapping("/yearsum")
    public List<YearSum> showAllYearSum(){ return this.yearSumService.getAllYearSum(1);}
    @RequestMapping("/keywordstop")
    public List<KeyWordsTop> showAllKeyWordsTop(){ return this.keyWordsTopService.getAllKeyWordsTop(1);}



}

