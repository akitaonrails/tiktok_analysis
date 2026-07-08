package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPopUpInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BackupPaymentInfo {

    @C09CT("backup_tips_content")
    public String backupTipsContent;

    @C09CT("backup_tips_title")
    public String backupTipsTitle;

    @C09CT("backup_tips_type")
    public Integer backupTipsType;

    @C09CT("default_selected")
    public Boolean defaultSelected;

    @C09CT("switch_retain_popup_info")
    public PaymentPopUpInfo switchRetainPopupInfo;

    public BackupPaymentInfo() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackupPaymentInfo)) {
            return false;
        }
        BackupPaymentInfo backupPaymentInfo = (BackupPaymentInfo) obj;
        return Intrinsics.LJFF(this.backupTipsTitle, backupPaymentInfo.backupTipsTitle) && Intrinsics.LJFF(this.backupTipsContent, backupPaymentInfo.backupTipsContent) && Intrinsics.LJFF(this.backupTipsType, backupPaymentInfo.backupTipsType) && Intrinsics.LJFF(this.defaultSelected, backupPaymentInfo.defaultSelected) && Intrinsics.LJFF(this.switchRetainPopupInfo, backupPaymentInfo.switchRetainPopupInfo);
    }

    public final int hashCode() {
        String str = this.backupTipsTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backupTipsContent;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.backupTipsType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.defaultSelected;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentPopUpInfo paymentPopUpInfo = this.switchRetainPopupInfo;
        return iHashCode4 + (paymentPopUpInfo != null ? paymentPopUpInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackupPaymentInfo(backupTipsTitle=");
        sbLIZ.append(this.backupTipsTitle);
        sbLIZ.append(", backupTipsContent=");
        sbLIZ.append(this.backupTipsContent);
        sbLIZ.append(", backupTipsType=");
        sbLIZ.append(this.backupTipsType);
        sbLIZ.append(", defaultSelected=");
        sbLIZ.append(this.defaultSelected);
        sbLIZ.append(", switchRetainPopupInfo=");
        sbLIZ.append(this.switchRetainPopupInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BackupPaymentInfo(String str, String str2, Integer num, Boolean bool, PaymentPopUpInfo paymentPopUpInfo) {
        this.backupTipsTitle = str;
        this.backupTipsContent = str2;
        this.backupTipsType = num;
        this.defaultSelected = bool;
        this.switchRetainPopupInfo = paymentPopUpInfo;
    }
}
