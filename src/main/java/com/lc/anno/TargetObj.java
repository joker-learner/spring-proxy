package com.lc.anno;

import org.springframework.stereotype.Component;

@Component("targetObj")   //载入容器  id= targetObj
public class TargetObj implements TargetObjInterface {
    public void save() {  //切点 （即待增强的方法）

        System.out.println("save .....ing");
    }
}
