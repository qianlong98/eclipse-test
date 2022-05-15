package cn.sdfirefly.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sdfirefly.crud.bean.Department;
import cn.sdfirefly.crud.bean.Msg;
import cn.sdfirefly.crud.service.DepartmentService;

/**
 * 
 * @Description处理和部门有关的请求
 * @author firefly Email:qianlong981@gmail.com
 * @version
 * @date 2022年5月13日下午3:54:22
 *
 */
@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	/**
	 * 返回所有的部门信息
	 */
	@RequestMapping("/depts")
	@ResponseBody
	public Msg getDepts(){
		//查出的所有部门信息
		List<Department> list = departmentService.getDepts();
		return Msg.success().add("depts", list);
	}
}
