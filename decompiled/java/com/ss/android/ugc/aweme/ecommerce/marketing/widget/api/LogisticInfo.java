package com.ss.android.ugc.aweme.ecommerce.marketing.widget.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class LogisticInfo {

    @C09CT("logistic_desc")
    public final String logisticDesc;

    @C09CT("logistic_schema")
    public final String logisticSchema;

    @C09CT("logistic_status")
    public final Integer logisticStatus;

    @C09CT("logistic_title")
    public final String logisticTitle;

    @C09CT("product_img")
    public final String productImg;

    public LogisticInfo() {
        this(null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogisticInfo)) {
            return false;
        }
        LogisticInfo logisticInfo = (LogisticInfo) obj;
        return Intrinsics.LJFF(this.productImg, logisticInfo.productImg) && Intrinsics.LJFF(this.logisticStatus, logisticInfo.logisticStatus) && Intrinsics.LJFF(this.logisticTitle, logisticInfo.logisticTitle) && Intrinsics.LJFF(this.logisticDesc, logisticInfo.logisticDesc) && Intrinsics.LJFF(this.logisticSchema, logisticInfo.logisticSchema);
    }

    public int hashCode() {
        String str = this.productImg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.logisticStatus;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.logisticTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logisticDesc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logisticSchema;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LogisticInfo(productImg=");
        sbLIZ.append(this.productImg);
        sbLIZ.append(", logisticStatus=");
        sbLIZ.append(this.logisticStatus);
        sbLIZ.append(", logisticTitle=");
        sbLIZ.append(this.logisticTitle);
        sbLIZ.append(", logisticDesc=");
        sbLIZ.append(this.logisticDesc);
        sbLIZ.append(", logisticSchema=");
        sbLIZ.append(this.logisticSchema);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LogisticInfo(String str, Integer num, String str2, String str3, String str4) {
        this.productImg = str;
        this.logisticStatus = num;
        this.logisticTitle = str2;
        this.logisticDesc = str3;
        this.logisticSchema = str4;
    }
}
