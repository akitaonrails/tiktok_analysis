package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveCommon extends C1893670zNV {

    @C09CT("age_gate_popup_view")
    public final AgeGatePopup ageGatePopup;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("now_need_retry")
    public final Boolean nowFeedRetry;

    @C09CT("now_inviter_code")
    public final String nowInviterCode;

    @C09CT("retention_popup_view")
    public final RetentionPopup retentionPopupView;

    @C09CT("share_panel_info")
    public final SharePanelData sharePanelData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveCommon)) {
            return false;
        }
        IncentiveCommon incentiveCommon = (IncentiveCommon) obj;
        return Intrinsics.LJFF(this.nowFeedRetry, incentiveCommon.nowFeedRetry) && Intrinsics.LJFF(this.notificationName, incentiveCommon.notificationName) && Intrinsics.LJFF(this.nowInviterCode, incentiveCommon.nowInviterCode) && Intrinsics.LJFF(this.ageGatePopup, incentiveCommon.ageGatePopup) && Intrinsics.LJFF(this.sharePanelData, incentiveCommon.sharePanelData) && Intrinsics.LJFF(this.retentionPopupView, incentiveCommon.retentionPopupView);
    }

    public final int hashCode() {
        Boolean bool = this.nowFeedRetry;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.notificationName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nowInviterCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AgeGatePopup ageGatePopup = this.ageGatePopup;
        int iHashCode4 = (iHashCode3 + (ageGatePopup == null ? 0 : ageGatePopup.hashCode())) * 31;
        SharePanelData sharePanelData = this.sharePanelData;
        return ((iHashCode4 + (sharePanelData != null ? sharePanelData.hashCode() : 0)) * 31) + this.retentionPopupView.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveCommon(nowFeedRetry=");
        sbLIZ.append(this.nowFeedRetry);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", nowInviterCode=");
        sbLIZ.append(this.nowInviterCode);
        sbLIZ.append(", ageGatePopup=");
        sbLIZ.append(this.ageGatePopup);
        sbLIZ.append(", sharePanelData=");
        sbLIZ.append(this.sharePanelData);
        sbLIZ.append(", retentionPopupView=");
        sbLIZ.append(this.retentionPopupView);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveCommon(Boolean bool, String str, String str2, AgeGatePopup ageGatePopup, SharePanelData sharePanelData, RetentionPopup retentionPopup) {
        this.nowFeedRetry = bool;
        this.notificationName = str;
        this.nowInviterCode = str2;
        this.ageGatePopup = ageGatePopup;
        this.sharePanelData = sharePanelData;
        this.retentionPopupView = retentionPopup;
    }
}
