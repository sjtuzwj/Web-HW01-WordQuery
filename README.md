#单词查询程序
=========================

程序设计与数据结构课程的第一次习题课作业。
## 主要功能
对于输入的文件进行解析，此后由用户进行单词查询。查询结果为其行号，前后文，出现总次数。

## 项目历史

原程序使用c++，移植至java版本后，作为maven项目，添加了Junit的单元测试。

## Preview

### OpenFonts for Chinese

中文字体方面，选择了[思源黑体](https://github.com/adobe-fonts/source-han-sans)和[思源宋体](https://github.com/adobe-fonts/source-han-serif)，是目前比较流行的开源字体选择。

<div align="center">
	<img src="./OpenFonts.Chinese/sample-image.png" width="550">
</div>

### OpenFonts

在上游 repo 中，作者选择了 [Lato](https://fonts.google.com/specimen/Lato) 和 [Raleway](https://fonts.google.com/specimen/Raleway)。个人并不是很喜欢 Raleway 字体中 `W` 的形状，因此选择了更换了 [source-sans-pro](https://github.com/adobe-fonts/source-sans-pro)，而为了配套，将 Lato 更换成了 [source-serif-pro](https://github.com/adobe-fonts/source-serif-pro)。

如果你想自己选择字体，推荐阅读 [Resume: A Tale of Desire, Intrigue, and Formatting](http://www.zackgrossbart.com/hackito/resume/)，这篇文章列举了很多开源的字体选择。

<div align="center">
	<img src="./OpenFonts/sample-image.png" width="550">
</div>

### MacFonts

由于机器原因不维护该版本模板，请前往[上游](https://github.com/deedy/Deedy-Resume/tree/master/MacFonts)查看。

## Dependencies

1. Compiles only with **XeTeX** and required **BibTex** for compiling publications and the .bib filetype.

## Known Issues:

1. Hacky space on the first bullet point on the second column.
1. Hacky redefinition of \refname to omit 'References' text for publications in the MacFonts version.

## 致谢

* 感谢 [Deedy-Resume](https://github.com/deedydas/Deedy-Resume) 提供的模板主体
* 感谢 [adobe-fonts](https://github.com/adobe-fonts) 的开源字体[思源黑体](https://github.com/adobe-fonts/source-han-sans)，[思源宋体](https://github.com/adobe-fonts/source-han-serif)，[source-sans-pro](https://github.com/adobe-fonts/source-sans-pro) 和 [source-serif-pro](https://github.com/adobe-fonts/source-serif-pro)
