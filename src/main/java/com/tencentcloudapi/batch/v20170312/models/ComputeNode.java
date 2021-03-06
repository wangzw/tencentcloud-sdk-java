package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ComputeNode  extends AbstractModel{


    /**
    * 计算节点ID
    */
    @SerializedName("ComputeNodeId")
    @Expose
    private String ComputeNodeId;
    

    /**
    * 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
    */
    @SerializedName("ComputeNodeInstanceId")
    @Expose
    private String ComputeNodeInstanceId;
    

    /**
    * 计算节点状态
    */
    @SerializedName("ComputeNodeState")
    @Expose
    private String ComputeNodeState;
    

    /**
    * CPU核数
    */
    @SerializedName("Cpu")
    @Expose
    private Integer Cpu;
    

    /**
    * 内存容量，单位GiB
    */
    @SerializedName("Mem")
    @Expose
    private Integer Mem;
    

    /**
    * 资源创建完成时间
    */
    @SerializedName("ResourceCreatedTime")
    @Expose
    private String ResourceCreatedTime;
    

    /**
    * 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
    */
    @SerializedName("TaskInstanceNumAvailable")
    @Expose
    private Integer TaskInstanceNumAvailable;
    

    /**
    * Batch Agent 版本
    */
    @SerializedName("AgentVersion")
    @Expose
    private String AgentVersion;
    

    /**
     * 获取计算节点ID
     * @return ComputeNodeId 计算节点ID
     */
    public String getComputeNodeId() {
        return this.ComputeNodeId;
    }

    /**
     * 设置计算节点ID
     * @param ComputeNodeId 计算节点ID
     */
    public void setComputeNodeId(String ComputeNodeId) {
        this.ComputeNodeId = ComputeNodeId;
    }

    /**
     * 获取计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     * @return ComputeNodeInstanceId 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     */
    public String getComputeNodeInstanceId() {
        return this.ComputeNodeInstanceId;
    }

    /**
     * 设置计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     * @param ComputeNodeInstanceId 计算节点实例ID，对于CVM场景，即为CVM的InstanceId
     */
    public void setComputeNodeInstanceId(String ComputeNodeInstanceId) {
        this.ComputeNodeInstanceId = ComputeNodeInstanceId;
    }

    /**
     * 获取计算节点状态
     * @return ComputeNodeState 计算节点状态
     */
    public String getComputeNodeState() {
        return this.ComputeNodeState;
    }

    /**
     * 设置计算节点状态
     * @param ComputeNodeState 计算节点状态
     */
    public void setComputeNodeState(String ComputeNodeState) {
        this.ComputeNodeState = ComputeNodeState;
    }

    /**
     * 获取CPU核数
     * @return Cpu CPU核数
     */
    public Integer getCpu() {
        return this.Cpu;
    }

    /**
     * 设置CPU核数
     * @param Cpu CPU核数
     */
    public void setCpu(Integer Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * 获取内存容量，单位GiB
     * @return Mem 内存容量，单位GiB
     */
    public Integer getMem() {
        return this.Mem;
    }

    /**
     * 设置内存容量，单位GiB
     * @param Mem 内存容量，单位GiB
     */
    public void setMem(Integer Mem) {
        this.Mem = Mem;
    }

    /**
     * 获取资源创建完成时间
     * @return ResourceCreatedTime 资源创建完成时间
     */
    public String getResourceCreatedTime() {
        return this.ResourceCreatedTime;
    }

    /**
     * 设置资源创建完成时间
     * @param ResourceCreatedTime 资源创建完成时间
     */
    public void setResourceCreatedTime(String ResourceCreatedTime) {
        this.ResourceCreatedTime = ResourceCreatedTime;
    }

    /**
     * 获取计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     * @return TaskInstanceNumAvailable 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     */
    public Integer getTaskInstanceNumAvailable() {
        return this.TaskInstanceNumAvailable;
    }

    /**
     * 设置计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     * @param TaskInstanceNumAvailable 计算节点运行  TaskInstance 可用容量。0表示计算节点忙碌。
     */
    public void setTaskInstanceNumAvailable(Integer TaskInstanceNumAvailable) {
        this.TaskInstanceNumAvailable = TaskInstanceNumAvailable;
    }

    /**
     * 获取Batch Agent 版本
     * @return AgentVersion Batch Agent 版本
     */
    public String getAgentVersion() {
        return this.AgentVersion;
    }

    /**
     * 设置Batch Agent 版本
     * @param AgentVersion Batch Agent 版本
     */
    public void setAgentVersion(String AgentVersion) {
        this.AgentVersion = AgentVersion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComputeNodeId", this.ComputeNodeId);
        this.setParamSimple(map, prefix + "ComputeNodeInstanceId", this.ComputeNodeInstanceId);
        this.setParamSimple(map, prefix + "ComputeNodeState", this.ComputeNodeState);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "ResourceCreatedTime", this.ResourceCreatedTime);
        this.setParamSimple(map, prefix + "TaskInstanceNumAvailable", this.TaskInstanceNumAvailable);
        this.setParamSimple(map, prefix + "AgentVersion", this.AgentVersion);

    }
}

