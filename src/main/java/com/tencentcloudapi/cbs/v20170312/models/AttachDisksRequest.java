package com.tencentcloudapi.cbs.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AttachDisksRequest  extends AbstractModel{


    /**
    * 将要被挂载的弹性云盘ID。通过[DescribeDisks](/document/product/362/16315)接口查询。单次最多可挂载10块弹性云盘。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;
    

    /**
    * 云服务器实例ID。云盘将被挂载到此云服务器上，通过[DescribeInstances](/document/api/213/9388)接口查询。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
     * 获取将要被挂载的弹性云盘ID。通过[DescribeDisks](/document/product/362/16315)接口查询。单次最多可挂载10块弹性云盘。
     * @return DiskIds 将要被挂载的弹性云盘ID。通过[DescribeDisks](/document/product/362/16315)接口查询。单次最多可挂载10块弹性云盘。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * 设置将要被挂载的弹性云盘ID。通过[DescribeDisks](/document/product/362/16315)接口查询。单次最多可挂载10块弹性云盘。
     * @param DiskIds 将要被挂载的弹性云盘ID。通过[DescribeDisks](/document/product/362/16315)接口查询。单次最多可挂载10块弹性云盘。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * 获取云服务器实例ID。云盘将被挂载到此云服务器上，通过[DescribeInstances](/document/api/213/9388)接口查询。
     * @return InstanceId 云服务器实例ID。云盘将被挂载到此云服务器上，通过[DescribeInstances](/document/api/213/9388)接口查询。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云服务器实例ID。云盘将被挂载到此云服务器上，通过[DescribeInstances](/document/api/213/9388)接口查询。
     * @param InstanceId 云服务器实例ID。云盘将被挂载到此云服务器上，通过[DescribeInstances](/document/api/213/9388)接口查询。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

