package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class Price  extends AbstractModel{


    /**
    * 描述了实例价格。
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;
    

    /**
    * 描述了网络价格。
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private ItemPrice BandwidthPrice;
    

    /**
     * 获取描述了实例价格。
     * @return InstancePrice 描述了实例价格。
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * 设置描述了实例价格。
     * @param InstancePrice 描述了实例价格。
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * 获取描述了网络价格。
     * @return BandwidthPrice 描述了网络价格。
     */
    public ItemPrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * 设置描述了网络价格。
     * @param BandwidthPrice 描述了网络价格。
     */
    public void setBandwidthPrice(ItemPrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);

    }
}

