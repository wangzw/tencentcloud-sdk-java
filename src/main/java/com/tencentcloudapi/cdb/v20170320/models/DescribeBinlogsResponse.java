package com.tencentcloudapi.cdb.v20170320.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeBinlogsResponse  extends AbstractModel{


    /**
    * 符合查询条件的日志文件总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    

    /**
    * 符合查询条件的二进制日志文件详情
    */
    @SerializedName("Items")
    @Expose
    private BinlogInfo [] Items;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取符合查询条件的日志文件总数
     * @return TotalCount 符合查询条件的日志文件总数
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合查询条件的日志文件总数
     * @param TotalCount 符合查询条件的日志文件总数
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取符合查询条件的二进制日志文件详情
     * @return Items 符合查询条件的二进制日志文件详情
     */
    public BinlogInfo [] getItems() {
        return this.Items;
    }

    /**
     * 设置符合查询条件的二进制日志文件详情
     * @param Items 符合查询条件的二进制日志文件详情
     */
    public void setItems(BinlogInfo [] Items) {
        this.Items = Items;
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

