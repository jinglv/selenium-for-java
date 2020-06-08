# Selenium For Java

## Selenium的介绍
- 简介
    - Selenium支持web浏览器的自动化。它主要由三个工具构成：WebDriver、IDE、Gird
    - [官方网站](https://www.selenium.dev/)
    
## Selenium架构图
![image](image/selenium架构图.png)

## Driver的配置
- Driver的介绍
    - [Driver的介绍](https://www.selenium.dev/documentation/en/webdriver/driver_requirements/)
- Driver的下载
    - [淘宝镜像](https://npm.taobao.org/mirrors/chromedriver)
    - [官方网站](https://chromedriver.storage.googleapis.com/index.html)
- Driver的安装
    - 找到与自己本机浏览器适配的driver版本http://chromedriver.chromium.org/downloads/version-selection
    - 导入环境变量中
    ```
    # chromedrvier
    export PATH="$PATH:/Users/apple/Documents/webdriver" # chromedriver下载放置的目录
    ```

## Selenium IDE
### 下载及安装
- [官网](https://www.selenium.dev)
- [Chrome插件](https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd)
- [Firefox插件](https://addons.mozilla.org/en-US/firefox/addon/selenium-ide/)
- [github release](https://github.com/SeleniumHQ/selenium-ide/releases)
- [其他版本](https://addons.mozilla.org/en-GB/firefox/addon/selenium-ide/versions/)
- 注意：Chrome插件在国内无法下载，Firefox可以直接下载

### 启动IDE
- 安装完成后，通过在浏览器的菜单栏中点击它的图标来启动它
- 如果没看到图标，首先确保是否安装了Selenium IDE扩展插件，其次可以在下面的地址访问所有插件
    - Chrome:chrome://extensions
    - Firefox:about:addons

### 录制第一个用例
- 创建新项目后，系统将提示为其命名
- 然后要求提供URL：要录制测试脚本的网站URL。设置一次就可以在整个项目的所有测试中使用
- 在页面的操作都将记录在IDE中。操作完成后，请切换到IDE窗口，并单击[停止]录制图标
- 停止后，为刚录制的Test取名
    
### IDE的使用
![image](image/selenium ide.png)

1. 新建、保存、打开
2. 开始和停止录制
3. 运行8中的所有的实例
4. 运行单个实例
5. 调试模式
6. 调整案例的运行速度
7. 要录制的网址
8. 实例列表
9. 动作、目标、值
10. 对单条命令的解释
11. 运行日志

### 管理用例
- Suites
    - 当Test越来越多时，可以将多个Test归类到Suites中，Suites就像小柜子。
    - 创建项目时，IDE会创建一个默认Suite，并将第一个Test添加到其中，你可以点击Test，在下拉菜单中选中Test Suites管理界面
    - 首先进入Suites管理界面，点击[+]，提供名称，然后单击[add]
    - 将鼠标悬停到`suite1`上，点击[三个点]弹出Suites管理菜单
    - 可以对`suite1`进行管理，包括添加test，重命名，删除，设置，导出

### 扩展
- [代码导出](https://selenium.dev/selenium-ide/docs/en/introduction/code-export)
- [常见问题](https://selenium.dev/selenium-ide/docs/en/introduction/faq)
