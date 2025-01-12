package com.hysea.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : hysea
 * @Description :
 **/
@RestController
public class SendMessageController {

    /**
     * 发送消息给 扇形交换机
     * curl -i http://localhost:8080/data
     * @return
     */
    @GetMapping("/data")
    public String sendFanoutMessage() {
        String res = "{\n" +
                "  \"introduce\": \"我是一名有着3年经验的Java后端开发，熟练使用主流SpringBoot开源框架，了解SpringCloud各个组件。会主动了解后端相关技术，思考并运用。擅长在压力下工作，有信心解决各种大大小小的bug。能沟通会听取同事意见（对接过上百来个接口）。遵守代码规范，坚信高质量的代码是构建强大软件的基础。\",\n" +
                "  \"technologies\":[\n" +
                "    \"熟练运用Java核心技术，包括反射、多线程执行、事件监听，以及函数式接口与Stream流处理\",\n" +
                "    \"掌握SpringBoot及其生态技术栈（如Mybatis、Shiro、RabbitMQ），对微服务架构和常用设计模式有深入理解，确保系统结构的合理性与扩展性\",\n" +
                "    \"精通MySQL数据库，擅长复杂查询操作，如联表查询、聚合函数应用、窗口函数和递归查询，以及自定义函数的编写，具备高效数据处理能力\",\n" +
                "    \"熟悉前端技术栈，包括HTML、CSS、JavaScript、Ajax及JQuery，对Vue框架和微信小程序有实践经验，能协同前后端开发\",\n" +
                "    \"拥有扎实的数据结构与算法基础，优化问题解决技巧\",\n" +
                "    \"熟练应用版本控制工具Git、性能诊断工具Arthas、容器化工具Docker及网络抓包工具Fiddler，能高效利用curl命令和各类Linux命令行操作\"\n" +
                "  ],\n" +
                "  \"educations\": [\n" +
                "    {\n" +
                "      \"companyName\": \"广东海洋大学寸金学院\",\n" +
                "      \"position\": \"数字媒体技术\",\n" +
                "      \"dateRanges\": \"2018.9-2022.6\",\n" +
                "      \"explain\":\"主修课程：JavaWeb、Java、C++、软件工程、JSP、网页设计（HTML+CSS+JS）、数据结构与算法、MySQL、离散数学\\n获得荣誉：校级一等奖学金、校级二等奖学金、优秀毕业生\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"experiences\": [\n" +
                "    {\n" +
                "      \"companyName\": \"广州文炬科技有限公司\",\n" +
                "      \"position\": \"Java后端开发工程师\",\n" +
                "      \"dateRanges\": \"2024.08-2024.10\",\n" +
                "      \"explains\": [\"负责从0到1搭建后端项目，利用SpringBoot+Mybatis快速开发出原型\",\"负责对接客户需求，与客户沟通并将需求梳理好，再将需求传达到前端，并与前端沟通和联调\",\"负责在沟通群及时反馈客户提的问题\",\"负责不断提高项目的健壮性，根据以往发现的bug找到根源并解决其他同类bug\",\"负责优化接口效率，优化查询，优化业务逻辑\"]\n" +
                "    },\n" +
                "    {\n" +
                "      \"companyName\": \"黑盒科技（广州）有限公司\",\n" +
                "      \"position\": \"Java后端开发工程师\",\n" +
                "      \"dateRanges\": \"2021.12-2023.08\",\n" +
                "      \"explains\": [\n" +
                "        \"负责所属模块的代码开发，调试与维护工作\",\"编写周报，周会汇报自己工作内容并制定下周工作规划\",\"编写接口与前端联调\",\"对接算法接口并与算法联调\",\"独立完成一次项目重构\",\"优化接口效率\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ],\n" +
                "  \"project\": [\n" +
                "    {\n" +
                "      \"projectNum\": \"2023.08-2024.10\",\n" +
                "      \"projectName\": \"佳育班级优化大师\",\n" +
                "      \"projectTypes\": [\n" +
                "        \"微信小程序\",\n" +
                "        \"PC客户端\",\n" +
                "        \"后台\"\n" +
                "      ],\n" +
                "      \"projectDesc\": \"佳育班级优化大师是一个学校数字化管理平台，老师可以在线点评，可以设置不同年级的评价体系，评价体系分为三层：维度，项目，选项。稳定的主体架构，可以通过班级查询班级下的学生，家长，老师，也可以查询年级下的全体教师和家长，可以查看某个班级下某个小组的学生，可以查看和家长关联的孩子。老师可以发送班级通知给家长。\",\n" +
                "      \"achievements\": [\n" +
                "        \"生成数据统计图表数据返回给前端直接展示（小程序有图表，PC 客户端有表格）(利用 JSONPath 生成 EChart JSON 对象)\",\"为服务号启用服务器配置，设置后端回调接口并验证，实现家长加入班级后利用自旋锁等待家长关注公众号再发送加入班级成功通知\",\"为服务号添加消息模版，调用获取access_token并缓存到redis，携带access_token调用发生模版消息接口，编写自定义事件，在老师评价学生时和老师发送通知时调用发送通知给相应对象\",\"基于POI和反射实现导出报表框架，Excel 单元格布局和数据解耦合，只需要关心业务方法（查询数据）的实现\",\"联合前端开发后台框架，无需生成代码，将不同菜单的表单内容持久化到数据库\",\"利用AOP将接口调用记录持久化到mysql，如果接口报错额外将记录id和异常栈保存\",\"测试项目，打包项目Jar包并上传，用docker部署，编写好Dockerfile和docker-compose.yml文件启动项目\",\"利用Linux命令查看Docker容器日志\",\"完善的全局异常处理。\"\n" +
                "      ],\n" +
                "      \"skillDescs\": [\"Java\",\"SpringBoot\",\"Shiro\",\"JWT\",\"Mybatis\",\"微信公众号开发\",\"POI\",\"Redis\",\"MySQL\",\"WebSocket\",\"Knife4j\",\"Arthas\",\"Docker\"\n" +
                "      ],\n" +
                "      \"responsibilityDesc\": []\n" +
                "    },\n" +
                "    {\n" +
                "      \"projectNum\": \"2021.12-2023.08\",\n" +
                "      \"projectName\": \"小黑智能学习平台\",\n" +
                "      \"projectTypes\": [\n" +
                "        \"小程序\",\n" +
                "        \"APP\",\n" +
                "        \"PC网站\",\n" +
                "        \"后台\",\n" +
                "        \"API开发平台\"\n" +
                "      ],\n" +
                "      \"projectDesc\": \"小黑智能学习平台旨在方便老师批改作业试卷，基于文字识别，答题卡识别，语义相似度匹配等技术完成智能批改试卷和作业。\",\n" +
                "      \"achievements\":[\n" +
                "        \"使用shiro实现登录鉴权，配置shiroFilterFactoryBean，配置redis作为缓存，使用jwt生成token\",\"封装grpc发送请求代码，和算法联调接口，将算法的API封装到业务，老师上传整个班级的全部答题卡图片进行答题卡匹配，开辟线程池调用算法文字识别进行识别学号和页码，识别到的学号不能达到百分百准确，后端调用fuzzywuzzy库对比本班学号最相似的学号匹配，join所有匹配线程完毕后，进行答题卡批改\",\"通过websocket发送答题卡状态给前端：包括排队中、匹配中、匹配完成、批改中、批改完成状态，编写自定义事件通过websocket发送状态给前端，让前端实时呈现进度给老师\",\"将班级圈信息持久化到MongoDB\",\"完成班级模块、考试模块、作业模块功能\",\"实现在纸质试卷上扫码展示题目解析\",\"利用redis缓存cos文件url，减少调用cos的接口产生的成本以及提高接口效率\",\"生成调用微信接口获取登录二维码，通过websocket和公众号接受事件推送扫码登录（API开发平台）\",\"封装好算法的接口，并使用MD5算法，服务端和客户端基于accessKey和secretKey生成签名，确保请求的完整性和安全性（API开发平台）。\"\n" +
                "      ],\n" +
                "      \"skillDescs\": [\"Java\",\"SpringBoot\",\"Shiro\",\"JWT\",\"Mybatis\",\"Redis\",\"MySQL\",\"GRPC\",\"微信公众号开发\",\"COS\",\"WebSocket\",\"MongoDB\",\"Knife4j\",\"Arthas\"],\n" +
                "      \"responsibilityDesc\": []\n" +
                "    }\n" +
                "  ],\n" +
                "  \"blog\": \"https://blog.csdn.net/weixin_44589374\",\n" +
                "  \"phone\": \"13168483618\",\"mail\": \"2350726260@qq.com\",\n" +
                "  \"github\": \"https://github.com/Crush07\",\n" +
                "  \"post\": \"Java后端工程师\",\n" +
                "  \"name\": \"黄艺洋\",\n" +
                "  \"sex\": \"男\",\n" +
                "  \"birthday\": \"2002.1\"\n" +
                "}";

        return res;
    }
}