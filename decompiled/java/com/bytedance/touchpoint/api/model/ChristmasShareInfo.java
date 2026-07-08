package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ChristmasShareInfo extends C1893670zNV {

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("share_bubble")
    public ShareBubble shareBubble;

    @C09CT("share_panel_top")
    public ShareTopPanel shareTopPanel;

    @C09CT("task_event_key")
    public String taskEventKey;

    public ChristmasShareInfo() {
        this(null, null, "", null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChristmasShareInfo)) {
            return false;
        }
        ChristmasShareInfo christmasShareInfo = (ChristmasShareInfo) obj;
        return Intrinsics.LJFF(this.notificationId, christmasShareInfo.notificationId) && Intrinsics.LJFF(this.notificationName, christmasShareInfo.notificationName) && Intrinsics.LJFF(this.taskEventKey, christmasShareInfo.taskEventKey) && Intrinsics.LJFF(this.shareBubble, christmasShareInfo.shareBubble) && Intrinsics.LJFF(this.shareTopPanel, christmasShareInfo.shareTopPanel);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taskEventKey;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ShareBubble shareBubble = this.shareBubble;
        int iHashCode4 = (iHashCode3 + (shareBubble == null ? 0 : shareBubble.hashCode())) * 31;
        ShareTopPanel shareTopPanel = this.shareTopPanel;
        return iHashCode4 + (shareTopPanel != null ? shareTopPanel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChristmasShareInfo(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", taskEventKey=");
        sbLIZ.append(this.taskEventKey);
        sbLIZ.append(", shareBubble=");
        sbLIZ.append(this.shareBubble);
        sbLIZ.append(", shareTopPanel=");
        sbLIZ.append(this.shareTopPanel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ChristmasShareInfo(String str, String str2, String str3, ShareBubble shareBubble, ShareTopPanel shareTopPanel) {
        this.notificationId = str;
        this.notificationName = str2;
        this.taskEventKey = str3;
        this.shareBubble = shareBubble;
        this.shareTopPanel = shareTopPanel;
    }
}
