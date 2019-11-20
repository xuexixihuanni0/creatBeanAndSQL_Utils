<#-- 生成基于EasyUI的JSP管理页面引用的JS文件 -->
/** ${tableInfo.simpleRemark}JS */

// ${tableInfo.simpleRemark}数据列表
var tableGrid = null;

/** 初始化页面组件和数据 */
$(function(){
    initDataGrid();
    initCombobox();
    tableGridSearch();
});

/** 初始化数据列表组件 */
function initDataGrid() {
    tableGrid = $("#tableGrid").datagrid({
        fit:true,
        rownumbers:true,
        ctrlSelect:true,
        method:"post",
        pagination:true,
        pageSize:pageSize,
        pageList:pageList,
        toolbar:"#toolbar",
        columns:[[
<#list tableInfo.fieldInfos as fieldInfo>
    <#if fieldInfo.primaryKey>
            {field:"${fieldInfo.lowerCamelCase}",checkbox:true},
    <#else>
        <#if fieldInfo.isDictType>
            {field:"${fieldInfo.lowerCamelCase}",title:"${fieldInfo.simpleRemark}",width:100,align:"center",formatter:get${fieldInfo.upperCamelCase}Name},
        <#elseif fieldInfo.isMultiLineType>
            {field:"${fieldInfo.lowerCamelCase}",title:"${fieldInfo.simpleRemark}",width:200},
        <#elseif fieldInfo.lowerCamelCase == "creationDate" || fieldInfo.lowerCamelCase == "lastUpdateDate">
            {field:"${fieldInfo.lowerCamelCase}",title:"${fieldInfo.simpleRemark}",width:170,align:"center"},
        <#else>
            {field:"${fieldInfo.lowerCamelCase}",title:"${fieldInfo.simpleRemark}",width:130,align:"center"},
        </#if>
    </#if>
</#list>
       ]]
    });
}

/** 初始化下拉框组件 */
function initCombobox() {
<#list tableInfo.fieldInfos as fieldInfo>
    <#if fieldInfo.isDictType>
    // ${fieldInfo.simpleRemark}
    var ${fieldInfo.lowerCamelCase} = getComboboxDictData("${fieldInfo.lowerCamelCase}");
    ${"$"}("select[name='${fieldInfo.lowerCamelCase}']").combobox({
        data: recordStatus,
        panelHeight:"auto",
        editable:false,
        required:<#if fieldInfo.isNotNull>true<#else>false</#if>
    });

    </#if>
</#list>
}

/** ${tableInfo.simpleRemark}列表查询 */
function tableGridSearch() {
    tableGrid.datagrid("options").queryParams = getFormJson();
    tableGrid.datagrid("options").url = tableGridUrl;
    tableGrid.datagrid("reload");
}

/** 新增${tableInfo.simpleRemark} */
function showAddRowWindow() {
    showAddWindow("新增${tableInfo.simpleRemark}", addUrl);

<#list tableInfo.fieldInfos as fieldInfo>
    <#if fieldInfo.isDictType>
    getComboboxFirstValue("${fieldInfo.lowerCamelCase}Edit");
    </#if>
</#list>
}

/** 修改${tableInfo.simpleRemark} */
function showModifyRowWindow() {
    showModifyWindow("修改${tableInfo.simpleRemark}", modifyUrl, tableGrid);
}

/** 保存${tableInfo.simpleRemark} */
function addOrModifySave() {
    addOrModifyWindowSave("addOrModifyWindow", tableGrid);
}

/** 删除${tableInfo.simpleRemark} */
function deleteRows() {
    deleteGridRows(deleteUrl, tableGrid);
}
