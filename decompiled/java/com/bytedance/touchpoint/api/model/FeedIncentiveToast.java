package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedIncentiveToast extends C1893670zNV {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("show_raw_icon_color")
    public final boolean showRawIconColor;

    @C09CT("title")
    public final Title title;

    @C09CT("tux_icon_name")
    public final String tuxIconName;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedIncentiveToast)) {
            return false;
        }
        FeedIncentiveToast feedIncentiveToast = (FeedIncentiveToast) obj;
        return Intrinsics.LJFF(this.title, feedIncentiveToast.title) && Intrinsics.LJFF(this.backgroundColor, feedIncentiveToast.backgroundColor) && Intrinsics.LJFF(this.notificationId, feedIncentiveToast.notificationId) && Intrinsics.LJFF(this.notificationName, feedIncentiveToast.notificationName) && Intrinsics.LJFF(this.type, feedIncentiveToast.type) && Intrinsics.LJFF(this.tuxIconName, feedIncentiveToast.tuxIconName) && this.showRawIconColor == feedIncentiveToast.showRawIconColor;
    }

    public final int hashCode() {
        Title title = this.title;
        int iHashCode = (title == null ? 0 : title.hashCode()) * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.notificationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notificationName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tuxIconName;
        return ((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.showRawIconColor);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedIncentiveToast(title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", tuxIconName=");
        sbLIZ.append(this.tuxIconName);
        sbLIZ.append(", showRawIconColor=");
        sbLIZ.append(this.showRawIconColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedIncentiveToast(Title title, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.title = title;
        this.backgroundColor = str;
        this.notificationId = str2;
        this.notificationName = str3;
        this.type = str4;
        this.tuxIconName = str5;
        this.showRawIconColor = z;
    }
}
