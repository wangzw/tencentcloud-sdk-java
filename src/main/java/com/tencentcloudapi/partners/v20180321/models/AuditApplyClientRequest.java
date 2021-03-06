package com.tencentcloudapi.partners.v20180321.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AuditApplyClientRequest  extends AbstractModel{


    /**
    * 待审核客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;
    

    /**
    * 审核结果，可能的取值：accept/reject
    */
    @SerializedName("AuditResult")
    @Expose
    private String AuditResult;
    

    /**
    * 申请理由，B类客户审核通过时必须填写申请理由
    */
    @SerializedName("Note")
    @Expose
    private String Note;
    

    /**
     * 获取待审核客户账号ID
     * @return ClientUin 待审核客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置待审核客户账号ID
     * @param ClientUin 待审核客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取审核结果，可能的取值：accept/reject
     * @return AuditResult 审核结果，可能的取值：accept/reject
     */
    public String getAuditResult() {
        return this.AuditResult;
    }

    /**
     * 设置审核结果，可能的取值：accept/reject
     * @param AuditResult 审核结果，可能的取值：accept/reject
     */
    public void setAuditResult(String AuditResult) {
        this.AuditResult = AuditResult;
    }

    /**
     * 获取申请理由，B类客户审核通过时必须填写申请理由
     * @return Note 申请理由，B类客户审核通过时必须填写申请理由
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * 设置申请理由，B类客户审核通过时必须填写申请理由
     * @param Note 申请理由，B类客户审核通过时必须填写申请理由
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

