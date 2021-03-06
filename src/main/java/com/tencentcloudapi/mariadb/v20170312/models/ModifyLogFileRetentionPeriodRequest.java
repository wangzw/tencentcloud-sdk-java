package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ModifyLogFileRetentionPeriodRequest  extends AbstractModel{


    /**
    * 实例 ID，形如：tdsql-ow728lmc。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 保存的天数,不能超过30
    */
    @SerializedName("Days")
    @Expose
    private Integer Days;
    

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取保存的天数,不能超过30
     * @return Days 保存的天数,不能超过30
     */
    public Integer getDays() {
        return this.Days;
    }

    /**
     * 设置保存的天数,不能超过30
     * @param Days 保存的天数,不能超过30
     */
    public void setDays(Integer Days) {
        this.Days = Days;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Days", this.Days);

    }
}

