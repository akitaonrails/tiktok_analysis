package com.ss.android.ugc.aweme.iap.component.api;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PaymentComponentResponse {

    @C09CT("biz_params")
    public final BizParams bizParams;

    @C09CT("business_line")
    public final Integer businessLine;

    @C09CT("component")
    public final PaymentComponent component;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("schema_version")
    public final Integer schemaVersion;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    @C09CT("version")
    public final Integer version;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentComponentResponse)) {
            return false;
        }
        PaymentComponentResponse paymentComponentResponse = (PaymentComponentResponse) obj;
        return Intrinsics.LJFF(this.statusCode, paymentComponentResponse.statusCode) && Intrinsics.LJFF(this.statusMsg, paymentComponentResponse.statusMsg) && Intrinsics.LJFF(this.scene, paymentComponentResponse.scene) && Intrinsics.LJFF(this.businessLine, paymentComponentResponse.businessLine) && Intrinsics.LJFF(this.version, paymentComponentResponse.version) && Intrinsics.LJFF(this.schemaVersion, paymentComponentResponse.schemaVersion) && Intrinsics.LJFF(this.component, paymentComponentResponse.component) && Intrinsics.LJFF(this.bizParams, paymentComponentResponse.bizParams);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.statusMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.scene;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.businessLine;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.version;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.schemaVersion;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        PaymentComponent paymentComponent = this.component;
        int iHashCode7 = (iHashCode6 + (paymentComponent == null ? 0 : paymentComponent.hashCode())) * 31;
        BizParams bizParams = this.bizParams;
        return iHashCode7 + (bizParams != null ? bizParams.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentComponentResponse(statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.statusMsg);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.scene);
        sbLIZ.append(", businessLine=");
        sbLIZ.append(this.businessLine);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(", schemaVersion=");
        sbLIZ.append(this.schemaVersion);
        sbLIZ.append(", component=");
        sbLIZ.append(this.component);
        sbLIZ.append(", bizParams=");
        sbLIZ.append(this.bizParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaymentComponentResponse(Integer num, String str, String str2, Integer num2, Integer num3, Integer num4, PaymentComponent paymentComponent, BizParams bizParams) {
        this.statusCode = num;
        this.statusMsg = str;
        this.scene = str2;
        this.businessLine = num2;
        this.version = num3;
        this.schemaVersion = num4;
        this.component = paymentComponent;
        this.bizParams = bizParams;
    }
}
