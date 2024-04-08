package com.personal.controller;

import com.personal.dto.ResponseVO;
import com.personal.model.UserModel;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping(value = "saveUserDetails")
    private ResponseVO saveUserDetails(@RequestBody UserModel userModel){
        ResponseVO responseVO=new ResponseVO();
        boolean flag = userService.saveUserDetails(userModel);
        if(flag){
            responseVO.setMessage("Save Successfully");
            responseVO.setResult(flag);
            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
        }
        else{
            responseVO.setMessage("Save Failed");
            responseVO.setResult(flag);
            responseVO.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
        }
        return responseVO;
    }

    @PostMapping(value = "updateUserDetails")
    private ResponseVO updateUserDetails(@RequestBody UserModel userModel){
        ResponseVO responseVO=new ResponseVO();
        boolean flag = userService.updateUserDetails(userModel);
        if(flag){
            responseVO.setMessage("Update Successfully");
            responseVO.setResult(flag);
            responseVO.setStatusCode(String.valueOf(HttpStatus.OK));
        }
        else{
            responseVO.setMessage("Update Failed");
            responseVO.setResult(flag);
            responseVO.setStatusCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR));
        }
        return responseVO;
    }

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
