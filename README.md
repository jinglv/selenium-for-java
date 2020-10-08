# Selenium3.0 For Java

什么叫框架？
- 框架是整个或部分系统的**可重用**设计，表现为一组抽象构建及构建实例间交互的方法。
- 框架是被应用开发者定制的**应用骨架**。

什么叫自动化测试框架？
- 定义：由一个或多个自动化测试基础模块、自动化测试管理模块、自动化测试统计模块等组成的**工具集合**。

自动化测试框架设计原则
- 通用性
- 易维护性
- 定时处理
- 持续集成
- 调试
- 测试结果

框架设计思想和设计模式
- 外部框架：主要是指以WebDriver为核心，辅以外部第三方框架和工具，用以实现持续集成、自动部署、脚本执行、远程调用、报告优化、邮件发送等功能性框架
    - Maven：自动编译、执行TestNG、集成邮件发送等
    - TESTNG：调用WebDriver、执行自动化测试用例
    - SELENIUM：自动化测试脚本
    - REPORTNG：报告优化模板
    - MAIL：自定义html邮件通知
    - 除了上面的外部框架外，也会使用其他组件来进行摘要日志的记录以及大数据执行的数据分析过程
    - 使用Log4j分级日志来进行日志的整理
    - 使用EXTENTX来进行数据收集及分析
- 内部框架：又称为分层框架，目的在于更好的优化和管理测试用例、更便捷的进行数据、元素、脚本的维护和更快捷的创建新脚本。

## Selenium3.0的变动
- 只支持Java8以上
- Selenium RC下线
- 对于WebDriver方面变动较大
    - FireFox浏览器需要继承GeckoDriver
    - Safari浏览器由苹果公司提供了原生的SafariDriver
    - Edge浏览器由MS提供了EdgeDriver
    - IE8及以下版本不再兼容