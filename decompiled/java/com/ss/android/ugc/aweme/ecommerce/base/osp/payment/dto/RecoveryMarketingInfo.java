package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RecoveryMarketingInfo {

    @C09CT("channel")
    public String channel;

    @C09CT("is_need_recovery_marketing")
    public Boolean isNeedReimbursed;

    @C09CT("tip_button")
    public String tipButton;

    @C09CT("tip_content")
    public String tipContent;

    @C09CT("tip_title")
    public String tipTitle;

    @C09CT("voucher_id")
    public String voucherId;

    public RecoveryMarketingInfo() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecoveryMarketingInfo)) {
            return false;
        }
        RecoveryMarketingInfo recoveryMarketingInfo = (RecoveryMarketingInfo) obj;
        return Intrinsics.LJFF(this.isNeedReimbursed, recoveryMarketingInfo.isNeedReimbursed) && Intrinsics.LJFF(this.voucherId, recoveryMarketingInfo.voucherId) && Intrinsics.LJFF(this.channel, recoveryMarketingInfo.channel) && Intrinsics.LJFF(this.tipTitle, recoveryMarketingInfo.tipTitle) && Intrinsics.LJFF(this.tipContent, recoveryMarketingInfo.tipContent) && Intrinsics.LJFF(this.tipButton, recoveryMarketingInfo.tipButton);
    }

    public final int hashCode() {
        Boolean bool = this.isNeedReimbursed;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.voucherId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tipTitle;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tipContent;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tipButton;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecoveryMarketingInfo(isNeedReimbursed=");
        sbLIZ.append(this.isNeedReimbursed);
        sbLIZ.append(", voucherId=");
        sbLIZ.append(this.voucherId);
        sbLIZ.append(", channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(", tipTitle=");
        sbLIZ.append(this.tipTitle);
        sbLIZ.append(", tipContent=");
        sbLIZ.append(this.tipContent);
        sbLIZ.append(", tipButton=");
        sbLIZ.append(this.tipButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RecoveryMarketingInfo(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.isNeedReimbursed = bool;
        this.voucherId = str;
        this.channel = str2;
        this.tipTitle = str3;
        this.tipContent = str4;
        this.tipButton = str5;
    }
}
