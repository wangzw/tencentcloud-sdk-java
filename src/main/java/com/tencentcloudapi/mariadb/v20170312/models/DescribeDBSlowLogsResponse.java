package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBSlowLogsResponse  extends AbstractModel{


    /**
    * 慢查询日志数据
    */
    @SerializedName("Data")
    @Expose
    private SlowLogData [] Data;
    

    /**
    * 所有语句锁时间总和
    */
    @SerializedName("LockTimeSum")
    @Expose
    private String LockTimeSum;
    

    /**
    * 所有语句查询总次数
    */
    @SerializedName("QueryCount")
    @Expose
    private String QueryCount;
    

    /**
    * 总记录数
    */
    @SerializedName("Total")
    @Expose
    private String Total;
    

    /**
    * 所有语句查询时间总和
    */
    @SerializedName("QueryTimeSum")
    @Expose
    private String QueryTimeSum;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取慢查询日志数据
     * @return Data 慢查询日志数据
     */
    public SlowLogData [] getData() {
        return this.Data;
    }

    /**
     * 设置慢查询日志数据
     * @param Data 慢查询日志数据
     */
    public void setData(SlowLogData [] Data) {
        this.Data = Data;
    }

    /**
     * 获取所有语句锁时间总和
     * @return LockTimeSum 所有语句锁时间总和
     */
    public String getLockTimeSum() {
        return this.LockTimeSum;
    }

    /**
     * 设置所有语句锁时间总和
     * @param LockTimeSum 所有语句锁时间总和
     */
    public void setLockTimeSum(String LockTimeSum) {
        this.LockTimeSum = LockTimeSum;
    }

    /**
     * 获取所有语句查询总次数
     * @return QueryCount 所有语句查询总次数
     */
    public String getQueryCount() {
        return this.QueryCount;
    }

    /**
     * 设置所有语句查询总次数
     * @param QueryCount 所有语句查询总次数
     */
    public void setQueryCount(String QueryCount) {
        this.QueryCount = QueryCount;
    }

    /**
     * 获取总记录数
     * @return Total 总记录数
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * 设置总记录数
     * @param Total 总记录数
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * 获取所有语句查询时间总和
     * @return QueryTimeSum 所有语句查询时间总和
     */
    public String getQueryTimeSum() {
        return this.QueryTimeSum;
    }

    /**
     * 设置所有语句查询时间总和
     * @param QueryTimeSum 所有语句查询时间总和
     */
    public void setQueryTimeSum(String QueryTimeSum) {
        this.QueryTimeSum = QueryTimeSum;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "LockTimeSum", this.LockTimeSum);
        this.setParamSimple(map, prefix + "QueryCount", this.QueryCount);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "QueryTimeSum", this.QueryTimeSum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

