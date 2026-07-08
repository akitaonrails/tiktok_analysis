package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AppealEntranceInfo {

    @C09CT("appeal_status")
    public final AppealStatus appealStatus;

    @C09CT("can_appeal")
    public final Boolean canAppeal;

    @C09CT("appeal_dialog_content")
    public final String dialogContent;

    @C09CT("appeal_dialog_title")
    public final String dialogTitle;

    @C09CT("appeal_dialog_primary_button")
    public final String primaryButton;

    @C09CT("appeal_dialog_secondary_button")
    public final String secondaryButton;

    public AppealEntranceInfo() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppealEntranceInfo)) {
            return false;
        }
        AppealEntranceInfo appealEntranceInfo = (AppealEntranceInfo) obj;
        return Intrinsics.LJFF(this.canAppeal, appealEntranceInfo.canAppeal) && this.appealStatus == appealEntranceInfo.appealStatus && Intrinsics.LJFF(this.dialogTitle, appealEntranceInfo.dialogTitle) && Intrinsics.LJFF(this.dialogContent, appealEntranceInfo.dialogContent) && Intrinsics.LJFF(this.primaryButton, appealEntranceInfo.primaryButton) && Intrinsics.LJFF(this.secondaryButton, appealEntranceInfo.secondaryButton);
    }

    public final int hashCode() {
        Boolean bool = this.canAppeal;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        AppealStatus appealStatus = this.appealStatus;
        int iHashCode2 = (iHashCode + (appealStatus == null ? 0 : appealStatus.hashCode())) * 31;
        String str = this.dialogTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dialogContent;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryButton;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondaryButton;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppealEntranceInfo(canAppeal=");
        sbLIZ.append(this.canAppeal);
        sbLIZ.append(", appealStatus=");
        sbLIZ.append(this.appealStatus);
        sbLIZ.append(", dialogTitle=");
        sbLIZ.append(this.dialogTitle);
        sbLIZ.append(", dialogContent=");
        sbLIZ.append(this.dialogContent);
        sbLIZ.append(", primaryButton=");
        sbLIZ.append(this.primaryButton);
        sbLIZ.append(", secondaryButton=");
        sbLIZ.append(this.secondaryButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AppealEntranceInfo(Boolean bool, AppealStatus appealStatus, String str, String str2, String str3, String str4) {
        this.canAppeal = bool;
        this.appealStatus = appealStatus;
        this.dialogTitle = str;
        this.dialogContent = str2;
        this.primaryButton = str3;
        this.secondaryButton = str4;
    }
}
