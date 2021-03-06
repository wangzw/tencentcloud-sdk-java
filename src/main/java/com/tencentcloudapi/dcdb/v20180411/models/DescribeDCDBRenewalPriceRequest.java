package com.tencentcloudapi.dcdb.v20180411.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DescribeDCDBRenewalPriceRequest  extends AbstractModel{


    /**
    * 待续费的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 续费时长，单位：月。不传则默认为1个月。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;
    

    /**
     * 获取待续费的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @return InstanceId 待续费的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置待续费的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @param InstanceId 待续费的实例ID。形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取续费时长，单位：月。不传则默认为1个月。
     * @return Period 续费时长，单位：月。不传则默认为1个月。
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置续费时长，单位：月。不传则默认为1个月。
     * @param Period 续费时长，单位：月。不传则默认为1个月。
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

