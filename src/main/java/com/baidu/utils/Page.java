package com.baidu.utils;

import org.springframework.ui.Model;

import com.github.pagehelper.PageInfo;

public class Page {

	// 作用 : 把列表页面中的四个超链接封装起来

	public static void fenye(Model model, PageInfo info,String url) {
		//如果当前页大于等一最后一页
		if(info.getPageNum()>=info.getPages()){
			//下一页时就是最后一页
			info.setNextPage(info.getPages());
		}
		if(info.getPageNum()<=1){
			info.setPrePage(1);
		}
			
		
		String fenye = "当前是" + info.getPageNum() + "/" + info.getPages() + "页--共" + info.getTotal()
				+ "条数据&nbsp;&nbsp;<a href='gettlist.do?pageNum=1"+url+"'>首页</a>&nbsp;&nbsp;<a href='gettlist.do?pageNum=" + info.getPrePage()
				+ ""+url+"'>上一页</a> &nbsp;&nbsp;<a href='gettlist.do?pageNum=" + info.getNextPage()
				+ ""+url+"'>下一页</a> &nbsp;&nbsp;<a href='gettlist.do?pageNum=" + info.getPages()
				+ ""+url+"'>尾页</a>";
		
		model.addAttribute("fenye", fenye);
	}
}
