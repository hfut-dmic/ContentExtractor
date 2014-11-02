ContentExtractor
================

##简介
ContentExtractor是一个开源的网页正文抽取工具，用JAVA实现，具有非常高的抽取精度。


##算法
ContentExtractor的网页正文抽取算法使用的是CEPR，适用于几乎所有的包含正文的网页。
算法简介：[http://dl.acm.org/citation.cfm?id=2505558](http://dl.acm.org/citation.cfm?id=2505558)


##教程
ContentExtractor的接口非常简单，用户可以根据网页的url，或者网页的html，来进行网页正文抽取：

根据url，抽取网页的正文：

	public static void main(String[] args) throws Exception {
	        String content=ContentExtractor.getContentByURL("http://news.
	        	xinhuanet.com/world/2014-11/02/c_127166728.htm");
	        System.out.println(content);
	}

根据html，抽取网页的正文：

	public static void main(String[] args) throws Exception {
	        String html="获取到的html源码";
	        String content=ContentExtractor.getContentByHtml(html);
	        System.out.println(content);
	}


##导入项目
从ContentExtractor的github主页[https://github.com/hfut-dmic/ContentExtractor](https://github.com/hfut-dmic/ContentExtractor)上下载ContentExtractor-{版本号}-bin.zip,将解压后得到的jar包全部放到工程的build path即可。


##联系我们
欢迎加入讨论群：385105758

邮箱:[wugq@hfut.edu.cn](wugq@hfut.edu.cn)

##开发者
ContentExtractor由合肥工业大学dmic团队开发
