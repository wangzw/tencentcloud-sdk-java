package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBackupDatabasesRequest  extends AbstractModel{


    /**
    * 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 开始时间，格式为：2017-07-12 10:29:20。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;
    

    /**
    * 要查询的数据库名前缀。
    */
    @SerializedName("SearchDatabase")
    @Expose
    private String SearchDatabase;
    

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 分页大小，最大值为2000。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;
    

    /**
     * 获取实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @return InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     * @param InstanceId 实例ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取开始时间，格式为：2017-07-12 10:29:20。
     * @return StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，格式为：2017-07-12 10:29:20。
     * @param StartTime 开始时间，格式为：2017-07-12 10:29:20。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取要查询的数据库名前缀。
     * @return SearchDatabase 要查询的数据库名前缀。
     */
    public String getSearchDatabase() {
        return this.SearchDatabase;
    }

    /**
     * 设置要查询的数据库名前缀。
     * @param SearchDatabase 要查询的数据库名前缀。
     */
    public void setSearchDatabase(String SearchDatabase) {
        this.SearchDatabase = SearchDatabase;
    }

    /**
     * 获取分页偏移量。
     * @return Offset 分页偏移量。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页大小，最大值为2000。
     * @return Limit 分页大小，最大值为2000。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页大小，最大值为2000。
     * @param Limit 分页大小，最大值为2000。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SearchDatabase", this.SearchDatabase);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

