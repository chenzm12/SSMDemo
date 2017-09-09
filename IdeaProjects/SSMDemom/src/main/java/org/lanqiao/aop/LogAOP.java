package org.lanqiao.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;


/**
 * Created by chen on 2017/9/7.
 */
public class LogAOP {
    Logger logger= Logger.getLogger(LogAOP.class);
    String strLog=null;
    public void somethingBefore(JoinPoint joinPoint){
        System.out.println("进入了前置通知");
        strLog="log Begining method:"+joinPoint.getTarget().getClass().getName()+"."
                +joinPoint.getSignature().getName();
        logger.info(strLog);
    }
}
