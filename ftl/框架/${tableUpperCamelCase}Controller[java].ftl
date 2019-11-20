<#-- 生成Controller -->
package ${moduleName}.controller;

import java.util.List;
import javax.validation.Valid;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import common.bean.Paging;
import common.bean.ResultJsonWrap;
import common.controller.BaseController;

import entity.${moduleName}.${tableInfo.upperCamelCase}Entity;
import ${moduleName}.service.${tableInfo.upperCamelCase}Service;

/**
 * ${tableInfo.simpleRemark}管理模块Controller
 * 
 * @author ${paramConfig.author}
 * @version 1.0.0 ${today}
 */
@Lazy
@RestController
@RequestMapping(value = "/${moduleName}/${tableInfo.lowerCamelCase}/*")
public class ${tableInfo.upperCamelCase}Controller extends BaseController {
	private Logger logger = Logger.getLogger(this.getClass());

	@Autowired
	private ${tableInfo.upperCamelCase}Service ${tableInfo.lowerCamelCase}Service;
	
    /**
     * 根据参数查询${tableInfo.simpleRemark}列表和分页数据
     * 
     * @param ${tableInfo.lowerCamelCase}
     *            查询参数
     * @param paging
     *            分页参数
     * @param rows
     *            EasyUI的分页组件传过来的PageSize
     * @return 分页数据
     */
	@RequestMapping(value = "/list")
	public Paging list(${tableInfo.upperCamelCase}Entity ${tableInfo.lowerCamelCase}, Paging paging, Integer rows) {
		paging.setPageSize(rows);
		paging.clearRows();

		try {
			paging = ${tableInfo.lowerCamelCase}Service.find${tableInfo.upperCamelCase}ByCondition(${tableInfo.lowerCamelCase}, paging);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		return paging;
	}
	    
    /**
     * 新增${tableInfo.simpleRemark}
     * 
     * @param ${tableInfo.lowerCamelCase}
     *            ${tableInfo.simpleRemark}信息
     * @return 结果数据
     */
    @RequestMapping(value = "/add")
    public ResultJsonWrap add(@Valid ${tableInfo.upperCamelCase}Entity ${tableInfo.lowerCamelCase}) {
        ResultJsonWrap result = new ResultJsonWrap();

        try {
            ${tableInfo.lowerCamelCase}Service.add${tableInfo.upperCamelCase}(${tableInfo.lowerCamelCase});
            result.setMsg("新增${tableInfo.simpleRemark}成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("新增${tableInfo.simpleRemark}失败！");
        }

        return result;
    }

    /**
     * 修改${tableInfo.simpleRemark}
     * 
     * @param ${tableInfo.lowerCamelCase}
     *            ${tableInfo.simpleRemark}信息
     * @return 结果数据
     */
    @RequestMapping(value = "/modify")
    public ResultJsonWrap modify(@Valid ${tableInfo.upperCamelCase}Entity ${tableInfo.lowerCamelCase}) {
        ResultJsonWrap result = new ResultJsonWrap();
        
        ${tableInfo.pkJavaType} id = ${tableInfo.lowerCamelCase}.getId();
        if (<#if tableInfo.pkJavaType == "String">StringUtils.isBlank(id)<#else>id == null</#if>) {
            result.setErrorMsg("请选择需要修改的数据！");
            return result;
        }

        try {
            ${tableInfo.lowerCamelCase}Service.modify${tableInfo.upperCamelCase}(${tableInfo.lowerCamelCase});
            result.setMsg("修改${tableInfo.simpleRemark}成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("修改${tableInfo.simpleRemark}失败！");
        }

        return result;
    }

    /**
     * 批量删除${tableInfo.simpleRemark}
     * 
     * @param idList
     *            ID列表
     * @return 结果数据
     */
    @RequestMapping(value = "/delete")
    public ResultJsonWrap delete(@RequestBody List<${tableInfo.pkJavaType}> idList) {
        ResultJsonWrap result = new ResultJsonWrap();

        if (CollectionUtils.isEmpty(idList)) {
            result.setErrorMsg("请选择需要删除的数据！");
            return result;
        }

        try {
            ${tableInfo.lowerCamelCase}Service.delete${tableInfo.upperCamelCase}ByIds(idList);
            result.setMsg("删除${tableInfo.simpleRemark}成功！");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            result.setErrorMsg("删除${tableInfo.simpleRemark}失败！");
        }

        return result;
    }

}