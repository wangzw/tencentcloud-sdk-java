package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class DBBackupTimeConfig  extends AbstractModel{


    /**
    * 实例 Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
    */
    @SerializedName("StartBackupTime")
    @Expose
    private String StartBackupTime;
    

    /**
    * 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
    */
    @SerializedName("EndBackupTime")
    @Expose
    private String EndBackupTime;
    

    /**
     * 获取实例 Id
     * @return InstanceId 实例 Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 Id
     * @param InstanceId 实例 Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     * @return StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     */
    public String getStartBackupTime() {
        return this.StartBackupTime;
    }

    /**
     * 设置每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     * @param StartBackupTime 每天备份执行的区间的开始时间，格式 mm:ss，形如 22:00
     */
    public void setStartBackupTime(String StartBackupTime) {
        this.StartBackupTime = StartBackupTime;
    }

    /**
     * 获取每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     * @return EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     */
    public String getEndBackupTime() {
        return this.EndBackupTime;
    }

    /**
     * 设置每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     * @param EndBackupTime 每天备份执行的区间的结束时间，格式 mm:ss，形如 23:00
     */
    public void setEndBackupTime(String EndBackupTime) {
        this.EndBackupTime = EndBackupTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartBackupTime", this.StartBackupTime);
        this.setParamSimple(map, prefix + "EndBackupTime", this.EndBackupTime);

    }
}

