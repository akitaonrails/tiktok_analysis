package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PaymentModel implements Serializable {

    @C09CT("node_name")
    public String nodeName;

    @C09CT("node_number")
    public int nodeNumber;

    @C09CT("node_status")
    public PaymentNodeStatusModel nodeStatus;

    @C09CT("payment_id")
    public String paymentId;

    @C09CT("payment_method")
    public String paymentMethod;

    @C09CT("payment_type")
    public String paymentType;

    @C09CT("trigger_source")
    public String triggerSource;

    public PaymentModel() {
        this(null, null, null, null, null, 0, null);
    }

    public int hashCode() {
        String str = this.paymentId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paymentType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethod;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.triggerSource;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.nodeName;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.nodeNumber) * 31;
        PaymentNodeStatusModel paymentNodeStatusModel = this.nodeStatus;
        return iHashCode5 + (paymentNodeStatusModel != null ? paymentNodeStatusModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentModel(paymentId=");
        sbLIZ.append(this.paymentId);
        sbLIZ.append(", paymentType=");
        sbLIZ.append(this.paymentType);
        sbLIZ.append(", paymentMethod=");
        sbLIZ.append(this.paymentMethod);
        sbLIZ.append(", triggerSource=");
        sbLIZ.append(this.triggerSource);
        sbLIZ.append(", nodeName=");
        sbLIZ.append(this.nodeName);
        sbLIZ.append(", nodeNumber=");
        sbLIZ.append(this.nodeNumber);
        sbLIZ.append(", nodeStatus=");
        sbLIZ.append(this.nodeStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setNodeName(String str) {
        this.nodeName = str;
    }

    public final void setNodeNumber(int i) {
        this.nodeNumber = i;
    }

    public final void setNodeStatus(PaymentNodeStatusModel paymentNodeStatusModel) {
        this.nodeStatus = paymentNodeStatusModel;
    }

    public final void setPaymentId(String str) {
        this.paymentId = str;
    }

    public final void setPaymentMethod(String str) {
        this.paymentMethod = str;
    }

    public final void setPaymentType(String str) {
        this.paymentType = str;
    }

    public final void setTriggerSource(String str) {
        this.triggerSource = str;
    }

    public PaymentModel(String str, String str2, String str3, String str4, String str5, int i, PaymentNodeStatusModel paymentNodeStatusModel) {
        this.paymentId = str;
        this.paymentType = str2;
        this.paymentMethod = str3;
        this.triggerSource = str4;
        this.nodeName = str5;
        this.nodeNumber = i;
        this.nodeStatus = paymentNodeStatusModel;
    }
}
