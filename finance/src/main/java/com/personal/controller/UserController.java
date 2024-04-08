package com.personal.controller;

import com.personal.dto.ResponseVO;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping(value = "/getUserList")
    public ResponseVO getUserList(){

        ResponseVO responseVO=new ResponseVO();
        List list= userService.getUserList();

        if(list!=null){
            responseVO.setMessage(" Details fetched");
            responseVO.setResult(list);
            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
        }
        else{
            responseVO.setMessage("Error");
            responseVO.setResult(list);
            responseVO.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
        }
        return responseVO;
    }

}
