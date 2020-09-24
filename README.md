SmartCloudDisk
====================

一个简单, 智能的个人网盘


需求规划
-----------------

1. 用户信息管理模块
    - 实现基本的注册, 登录, 基本信息关系等功能
    - 后期可以加入权限管理和控制功能
2. 文件管理模块
    - 核心功能: 实现文件的上传, 下载 / 文件浏览和管理(复制, 剪切等)
        - 上传下载的断点续传
        - md5计算 
    - 文件预览: 根据实际情况预览图片, 视频, 音乐, 文档等
        - 视频的直接播放等
        - 资源的转码 
        - 在线压缩, 解压
    - 权限和配额管理
3. 文件分享
    - 文件提供分享功能, 支持公开访问或密码访问
    - 支持取消分享
4. 回收站
    - 文件删除后进入回收站
    - 文件提供版本控制功能
5. 保险箱
    - 提供密码保护的私人空间
6. 云笔记
    - 提供基本的笔记操作, 支持多种格式
7. 离线下载
    - 提供各种离线下载功能
8. 博客文章
    - 在项目开发过程中, 同步写相应的文章
    - 记录技术要点, 算法原理, 组件性能等
    
技术架构分析
------------------

本项目初步考虑采取分布式的微服务架构, 大致分为四个模块
1. Eureka
2. FileCenter: 处理云盘中文件相关的核心服务
3. UserCenter: 处理用户相关的服务
4. Transcode: 转码工程, 处理文件预览相关任务, 在线压缩, 解压等

由于服务器配置越高费用越高, 所以开发过程中需要尽量控制内存消耗

在具体的技术上, 初步考虑使用如下的技术

1. Spring + MyBatis + MySQL : 业务核心框架
2. Redis : 对部分访问频率高的接口, 使用Redis处理
3. RabbitMQ: 对于转码任务, 考虑使用RabbitMQ传递消息
4. Bootstrap & Jquery : 在静态页面的基础上, 通过JQuery实现动态功能

其中 FileCenter作为核心项目, 是一个web项目, 携带相关的HTML资源文件, 
其他几个项目作为纯后端项目, 仅提供相应的服务


更远期的规划
----------------

由于项目目前处于初始阶段, 因此下面的构想都属于远期规划, 可能随着项目的开发而发生变化

1. 实现真正意义的分布式: 使用nginx或者Zuul作为网关
2. 自动化部署技术探索
3. 其他语言组合
    - 考虑组合Python, Scheme或者Scala语言的混合系统
4. 加入人工智能技术
    - 考虑加入自然语言处理相关 / 图像处理相关 的技术, 使项目更加智能

参考项目
-----------------
- https://github.com/BitInit/pnd
- https://github.com/Glovecc/JunianCloud (相关性比较低)
- https://github.com/ShawyerPeng/BitsCloudDisk (结构最接近)
- https://github.com/liantian-cn/FileStoreGAE (基于GAE的图床)
- https://github.com/zhaojun1998/zfile （前端界面很好看， 可惜没有源代码）
- https://github.com/Gepeng18/CloudDisk (功能完善)

相关博客
--------------------
- [Spring笔记之访问数据库](https://lizec.top/2019/01/13/Spring%E7%AC%94%E8%AE%B0%E4%B9%8B%E8%AE%BF%E9%97%AE%E6%95%B0%E6%8D%AE%E5%BA%93/)
- [Spring笔记之SpringCloud](https://lizec.top/2019/07/14/Spring%E7%AC%94%E8%AE%B0%E4%B9%8BSpringCloud/)


参考资料
--------------------


### Spring基础配置

- [Spring配置与环境切换](https://blog.csdn.net/Colton_Null/article/details/82145467)
- [Spring Boot静态资源访问和配置全解析](https://blog.csdn.net/u010358168/article/details/81205116)



### Swagger配置

- [超详细！使用swagger自动生成Api文档（swagger-ui）](https://blog.csdn.net/zhanggonglalala/article/details/98070986)
- [Spring Cloud Eureka控制台快速查看Swagger文档](http://c.biancheng.net/view/5534.html)




