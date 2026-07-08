package com.ss.android.ugc.aweme.search.df.api.incentivetask.model;

import X.C09CT;
import X.C2188811AlT;
import X.C733802tk;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VoucherInfo implements Serializable {
    public static final C733802tk Companion = new Object() { // from class: X.02tk
    };

    @C09CT("discount_text")
    public final String discountText;

    @C09CT("face_value")
    public final String faceValue;

    @C09CT("reduction_type")
    public final int reductionType;

    @C09CT("threshold_value")
    public final int thresholdValue;

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_status")
    public final int voucherStatus;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) obj;
        return Intrinsics.LJFF(this.voucherId, voucherInfo.voucherId) && Intrinsics.LJFF(this.voucherTypeId, voucherInfo.voucherTypeId) && this.reductionType == voucherInfo.reductionType && Intrinsics.LJFF(this.faceValue, voucherInfo.faceValue) && Intrinsics.LJFF(this.discountText, voucherInfo.discountText) && this.thresholdValue == voucherInfo.thresholdValue && this.voucherStatus == voucherInfo.voucherStatus;
    }

    public int hashCode() {
        return (((((((((((this.voucherId.hashCode() * 31) + this.voucherTypeId.hashCode()) * 31) + this.reductionType) * 31) + this.faceValue.hashCode()) * 31) + this.discountText.hashCode()) * 31) + this.thresholdValue) * 31) + this.voucherStatus;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoucherInfo(voucherId=");
        sbLIZ.append(this.voucherId);
        sbLIZ.append(", voucherTypeId=");
        sbLIZ.append(this.voucherTypeId);
        sbLIZ.append(", reductionType=");
        sbLIZ.append(this.reductionType);
        sbLIZ.append(", faceValue=");
        sbLIZ.append(this.faceValue);
        sbLIZ.append(", discountText=");
        sbLIZ.append(this.discountText);
        sbLIZ.append(", thresholdValue=");
        sbLIZ.append(this.thresholdValue);
        sbLIZ.append(", voucherStatus=");
        sbLIZ.append(this.voucherStatus);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VoucherInfo() {
        this("", "", 0, "", "", 0, 0);
    }

    public VoucherInfo(String str, String str2, int i, String str3, String str4, int i2, int i3) {
        this.voucherId = str;
        this.voucherTypeId = str2;
        this.reductionType = i;
        this.faceValue = str3;
        this.discountText = str4;
        this.thresholdValue = i2;
        this.voucherStatus = i3;
    }
}
