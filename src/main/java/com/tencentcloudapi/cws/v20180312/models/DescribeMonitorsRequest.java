package com.tencentcloudapi.cws.v20180312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeMonitorsRequest  extends AbstractModel{


    /**
    * 监控任务ID列表
    */
    @SerializedName("MonitorIds")
    @Expose
    private Integer [] MonitorIds;
    

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;
    

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 返回数量，默认为10，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取监控任务ID列表
     * @return MonitorIds 监控任务ID列表
     */
    public Integer [] getMonitorIds() {
        return this.MonitorIds;
    }

    /**
     * 设置监控任务ID列表
     * @param MonitorIds 监控任务ID列表
     */
    public void setMonitorIds(Integer [] MonitorIds) {
        this.MonitorIds = MonitorIds;
    }

    /**
     * 获取过滤条件
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量，默认为0
     * @return Offset 偏移量，默认为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为10，最大值为100
     * @return Limit 返回数量，默认为10，最大值为100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为10，最大值为100
     * @param Limit 返回数量，默认为10，最大值为100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MonitorIds.", this.MonitorIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

