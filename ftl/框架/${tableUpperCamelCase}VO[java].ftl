<#-- 生成VO -->
package ${moduleName}.vo;

import ${moduleName}.entity.${tableInfo.upperCamelCase}Entity;

/**
 * ${tableInfo.simpleRemark}VO
 * 
 * @author ${paramConfig.author}
 * @version 1.0.0 ${today}
 */
public class ${tableInfo.upperCamelCase}VO extends ${tableInfo.upperCamelCase}Entity {
    /** 版本号 */
    private static final long serialVersionUID = ${tableInfo.serialVersionUID!'1'}L;
    
}