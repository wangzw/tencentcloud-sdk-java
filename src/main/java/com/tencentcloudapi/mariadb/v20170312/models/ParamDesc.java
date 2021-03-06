package com.tencentcloudapi.mariadb.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ParamDesc  extends AbstractModel{


    /**
    * 参数名字
    */
    @SerializedName("Param")
    @Expose
    private String Param;
    

    /**
    * 当前参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;
    

    /**
    * 设置过的值，参数生效后，该值和value一样。未设置过就不返回该字段。
    */
    @SerializedName("SetValue")
    @Expose
    private String SetValue;
    

    /**
    * 系统默认值
    */
    @SerializedName("Default")
    @Expose
    private String Default;
    

    /**
    * 参数限制
    */
    @SerializedName("Constraint")
    @Expose
    private ParamConstraint Constraint;
    

    /**
     * 获取参数名字
     * @return Param 参数名字
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * 设置参数名字
     * @param Param 参数名字
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * 获取当前参数值
     * @return Value 当前参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置当前参数值
     * @param Value 当前参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 获取设置过的值，参数生效后，该值和value一样。未设置过就不返回该字段。
     * @return SetValue 设置过的值，参数生效后，该值和value一样。未设置过就不返回该字段。
     */
    public String getSetValue() {
        return this.SetValue;
    }

    /**
     * 设置设置过的值，参数生效后，该值和value一样。未设置过就不返回该字段。
     * @param SetValue 设置过的值，参数生效后，该值和value一样。未设置过就不返回该字段。
     */
    public void setSetValue(String SetValue) {
        this.SetValue = SetValue;
    }

    /**
     * 获取系统默认值
     * @return Default 系统默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * 设置系统默认值
     * @param Default 系统默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * 获取参数限制
     * @return Constraint 参数限制
     */
    public ParamConstraint getConstraint() {
        return this.Constraint;
    }

    /**
     * 设置参数限制
     * @param Constraint 参数限制
     */
    public void setConstraint(ParamConstraint Constraint) {
        this.Constraint = Constraint;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "SetValue", this.SetValue);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamObj(map, prefix + "Constraint.", this.Constraint);

    }
}

