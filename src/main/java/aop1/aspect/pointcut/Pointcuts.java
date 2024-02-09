package aop1.aspect.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    @Pointcut("execution(* abc*(..))")
    public void allGetMethods() {}

    @Pointcut("execution(* return*(..))")
    public void allReturnMethods() {}

    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}
}
