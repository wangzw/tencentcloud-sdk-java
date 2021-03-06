package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class GetRulesRequest  extends AbstractModel{


    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;
    

    /**
    * 长度
    */
    @SerializedName("Length")
    @Expose
    private Integer Length;
    

    /**
     * 获取偏移
     * @return Offset 偏移
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移
     * @param Offset 偏移
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取长度
     * @return Length 长度
     */
    public Integer getLength() {
        return this.Length;
    }

    /**
     * 设置长度
     * @param Length 长度
     */
    public void setLength(Integer Length) {
        this.Length = Length;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

