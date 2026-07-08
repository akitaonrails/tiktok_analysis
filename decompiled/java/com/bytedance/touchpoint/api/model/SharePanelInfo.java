package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class SharePanelInfo extends C1893670zNV {

    @C09CT("share_panel_jump_link")
    public final String jumpLink;

    @C09CT("share_button_pic")
    public final String shareButtonIcon;

    @C09CT("share_panel_icon")
    public final String sharePanelIcon;

    @C09CT("share_panel_text")
    public final String sharePanelText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePanelInfo)) {
            return false;
        }
        SharePanelInfo sharePanelInfo = (SharePanelInfo) obj;
        return Intrinsics.LJFF(this.shareButtonIcon, sharePanelInfo.shareButtonIcon) && Intrinsics.LJFF(this.sharePanelIcon, sharePanelInfo.sharePanelIcon) && Intrinsics.LJFF(this.sharePanelText, sharePanelInfo.sharePanelText) && Intrinsics.LJFF(this.jumpLink, sharePanelInfo.jumpLink);
    }

    public final int hashCode() {
        String str = this.shareButtonIcon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sharePanelIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sharePanelText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jumpLink;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelInfo(shareButtonIcon=");
        sbLIZ.append(this.shareButtonIcon);
        sbLIZ.append(", sharePanelIcon=");
        sbLIZ.append(this.sharePanelIcon);
        sbLIZ.append(", sharePanelText=");
        sbLIZ.append(this.sharePanelText);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SharePanelInfo(String str, String str2, String str3, String str4) {
        this.shareButtonIcon = str;
        this.sharePanelIcon = str2;
        this.sharePanelText = str3;
        this.jumpLink = str4;
    }
}
