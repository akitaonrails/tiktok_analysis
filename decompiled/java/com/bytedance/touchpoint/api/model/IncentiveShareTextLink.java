package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class IncentiveShareTextLink extends C1893670zNV {

    @C09CT("icon")
    public String icon;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("notification_name")
    public String notificationName;

    @C09CT("text")
    public String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveShareTextLink)) {
            return false;
        }
        IncentiveShareTextLink incentiveShareTextLink = (IncentiveShareTextLink) obj;
        return Intrinsics.LJFF(this.notificationId, incentiveShareTextLink.notificationId) && Intrinsics.LJFF(this.notificationName, incentiveShareTextLink.notificationName) && Intrinsics.LJFF(this.icon, incentiveShareTextLink.icon) && Intrinsics.LJFF(this.text, incentiveShareTextLink.text) && Intrinsics.LJFF(this.jumpLink, incentiveShareTextLink.jumpLink);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveShareTextLink(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveShareTextLink(String str, String str2, String str3, String str4, String str5) {
        this.notificationId = str;
        this.notificationName = str2;
        this.icon = str3;
        this.text = str4;
        this.jumpLink = str5;
    }
}
