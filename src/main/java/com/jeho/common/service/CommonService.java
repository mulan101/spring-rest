package com.jeho.common.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@RestController
@XRayEnabled
@RequestMapping(value = "/rest")
public class CommonService {

}
