# 上海交通大学主页性能分析
=========================

软件工程课程的第一次作业

## 整体描述
交大首页的loading时间相对较少，仅190.6ms，但实际总加载时间很长，约7s，主要时间开销为渲染。
清华大学的loading时间为121.8ms，相比之下总加载时间仅为1s。
<div align="left">
	<img src="./sample/sj.JPG" width="450">
</div>
<div align="right">
	<img src="./sample/th.JPG" width="450">
</div>
## 项目历史

原程序使用c++，移植至java版本后，作为maven项目，添加了Junit的单元测试。
## Preview

### 程序运行

1、输入带查询的文件路径。 
2、输入你想要查询的单词。 
3、输出查询结果。   
4、go to 2. 
### 程序演示

以下为使用and作为查询单词的输出结果，仅截取最后部分。  

<div align="center">
	<img src="./sample/and.jpg" width="550">
</div>

### 程序结构

本程序由三个部分组成  
Judger负责判断单词的性质，持有两个方法，分别判断单词是否为数字，单词是否为新文章标识符。  
Resolver负责对于单词进行解析重组，持有两个方法，分别将单词的标点进行清洗，行拆分为单词组。  
EP1负责程序主体，持有三个方法，除作为入口的main外，分别处理程序的解析部分与查询部分。

### 程序测试

本程序对处理逻辑的Judger与Resolver进行了测试，结果与预期一致。  
<div align="center">
	<img src="./sample/test.jpg" width="550">
</div>

## 依赖

JB idea 2018.3  
Junit 4  
Java 9  

## 文档

函数使用方法见项目内部注释。  

## 致谢

* 感谢 我自己提供的C++源代码
