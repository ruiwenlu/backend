[#ftl]
<div class="ibox float-e-margins" id="ibox">
    <div class="ibox-content p-t-md">
        <div class="m-b-sm">
            <a href="#add_rslide" class="btn btn-primary" data-id="555555" data-toggle="rslide" role="button" data-title="新增产品"  >新增产品 <i class="fa fa-plus"></i></a>
        </div>
        <div class="table-responsive ">
            <table class="table table-centerbody table-striped table-condensed text-nowrap border-top" id="editable-sample">
                <thead>
                <tr>
                    <th>产品id</th>
                    <th>中文名称</th>
                [#--<th>英文名称</th>--]
                    <th>货期（天）</th>
                    <th>库存</th>
                    <th>市场价</th>
                    <th>销售价</th>
                [#--<th>简介</th>--]
                [#--<th>详情</th>--]
                    <th>浏览数</th>
                    <th>销售类型</th>
                    <th>星级</th>
                    <th>创建时间</th>
                    <th>更新时间</th>
                    <th class="text-right">操作</th>
                </tr>
                </thead>
                <tbody>
                [#if page?? && page.list?? && (page.list?size > 0) ]
                    [#list page.list as n]
                    <tr>
                        <td>${n.id }</td>
                        <td>${n.nameZH }</td>
                    [#--<td>${n.nameEN }</td>--]
                        <td>${n.deliveryTime }</td>
                        <td>${n.stock }</td>
                        <td>${n.marketPrice }</td>
                        <td>${n.salePrice }</td>
                    [#--<td>${n.description }</td>--]
                    [#--<td>${n.longDescription }</td>--]
                        <td>${n.reviews }</td>
                        <td>${n.saleType }</td>
                        <td>${n.stars }</td>
                        <td>${n.createTime?string("yyyy-MM-dd HH:mm") }</td>
                        <td>${n.updateTime?string("yyyy-MM-dd HH:mm") }</td>
                        <td class="text-right text-nowrap">
                            <div class="btn-group ">
                                <a href="#edit_rslide" class="btn btn-white btn-sm" data-id="555555" data-toggle="rslide" data-title="阳光两房5555 信息编辑"><i class="fa fa-pencil" ></i>  编辑</a>
                                <a href="view.html" class="btn btn-white btn-sm"><i class="fa fa-trash"></i>  删除</a>
                            </div>
                        </td>
                    </tr>
                    [/#list]
                [/#if]
                </tbody>
            </table>
        </div>
        <!-- 分页表单 -->
        <form action="${ctx }/product/page" id="productsPageForm">
            <!-- 查询条件，用隐藏表单域 -->
            <input type="hidden" value="${keywords! }" name="keywords" />

            [#assign formId = "productsPageForm"]<!-- formId: 分页控件表单ID -->
            [#assign showPageId = "ibox"]<!-- showPageId: ajax异步分页获取的数据需要加载到指定的位置 -->
            [#include "/common/page.ftl"/]<!-- 分页控键 -->
        </form>

    </div>
</div>