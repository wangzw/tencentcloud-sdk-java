package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDBResourceUsageDetailsResponse  extends AbstractModel{


    /**
    * 主节点资源使用情况监控数据
    */
    @SerializedName("Master")
    @Expose
    private ResourceUsageMonitorSet Master;
    

    /**
    * 备机1资源使用情况监控数据
    */
    @SerializedName("Slave1")
    @Expose
    private ResourceUsageMonitorSet Slave1;
    

    /**
    * 备机2资源使用情况监控数据
    */
    @SerializedName("Slave2")
    @Expose
    private ResourceUsageMonitorSet Slave2;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取主节点资源使用情况监控数据
     * @return Master 主节点资源使用情况监控数据
     */
    public ResourceUsageMonitorSet getMaster() {
        return this.Master;
    }

    /**
     * 设置主节点资源使用情况监控数据
     * @param Master 主节点资源使用情况监控数据
     */
    public void setMaster(ResourceUsageMonitorSet Master) {
        this.Master = Master;
    }

    /**
     * 获取备机1资源使用情况监控数据
     * @return Slave1 备机1资源使用情况监控数据
     */
    public ResourceUsageMonitorSet getSlave1() {
        return this.Slave1;
    }

    /**
     * 设置备机1资源使用情况监控数据
     * @param Slave1 备机1资源使用情况监控数据
     */
    public void setSlave1(ResourceUsageMonitorSet Slave1) {
        this.Slave1 = Slave1;
    }

    /**
     * 获取备机2资源使用情况监控数据
     * @return Slave2 备机2资源使用情况监控数据
     */
    public ResourceUsageMonitorSet getSlave2() {
        return this.Slave2;
    }

    /**
     * 设置备机2资源使用情况监控数据
     * @param Slave2 备机2资源使用情况监控数据
     */
    public void setSlave2(ResourceUsageMonitorSet Slave2) {
        this.Slave2 = Slave2;
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
        this.setParamObj(map, prefix + "Master.", this.Master);
        this.setParamObj(map, prefix + "Slave1.", this.Slave1);
        this.setParamObj(map, prefix + "Slave2.", this.Slave2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

