package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedToast extends C1893670zNV {

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("description")
    public final Title description;

    @C09CT("dismiss_after")
    public final long dismissAfter;

    @C09CT("icon")
    public final String icon;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("title")
    public final Title title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedToast)) {
            return false;
        }
        FeedToast feedToast = (FeedToast) obj;
        return Intrinsics.LJFF(this.notificationId, feedToast.notificationId) && Intrinsics.LJFF(this.backgroundColor, feedToast.backgroundColor) && this.dismissAfter == feedToast.dismissAfter && Intrinsics.LJFF(this.icon, feedToast.icon) && Intrinsics.LJFF(this.title, feedToast.title) && Intrinsics.LJFF(this.description, feedToast.description);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.dismissAfter)) * 31;
        String str3 = this.icon;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.title.hashCode()) * 31;
        Title title = this.description;
        return iHashCode3 + (title != null ? title.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedToast(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", dismissAfter=");
        sbLIZ.append(this.dismissAfter);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", description=");
        sbLIZ.append(this.description);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedToast(String str, String str2, long j, String str3, Title title, Title title2) {
        this.notificationId = str;
        this.backgroundColor = str2;
        this.dismissAfter = j;
        this.icon = str3;
        this.title = title;
        this.description = title2;
    }
}
