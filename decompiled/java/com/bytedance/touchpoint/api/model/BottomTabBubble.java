package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1894340zOa;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class BottomTabBubble extends C1893670zNV {

    @C09CT("anchor_index")
    public String anchorIndex;

    @C09CT("background_color")
    public List<String> backgroundColor;

    @C09CT("disappear_countdown")
    public int disappearCountDown;

    @C09CT("gradient_type")
    public int gradientType;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("need_login_gate")
    public boolean needLoginGate;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("show_after")
    public int showAfter;

    @C09CT("show_times")
    public int showTimes;

    @C09CT("title")
    public Title title;

    public BottomTabBubble() {
        this(null, 0, null, null, 0, 0, false, 10, "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTabBubble)) {
            return false;
        }
        BottomTabBubble bottomTabBubble = (BottomTabBubble) obj;
        return Intrinsics.LJFF(this.backgroundColor, bottomTabBubble.backgroundColor) && this.gradientType == bottomTabBubble.gradientType && Intrinsics.LJFF(this.title, bottomTabBubble.title) && Intrinsics.LJFF(this.jumpLink, bottomTabBubble.jumpLink) && this.showTimes == bottomTabBubble.showTimes && this.showAfter == bottomTabBubble.showAfter && this.needLoginGate == bottomTabBubble.needLoginGate && this.disappearCountDown == bottomTabBubble.disappearCountDown && Intrinsics.LJFF(this.anchorIndex, bottomTabBubble.anchorIndex) && Intrinsics.LJFF(this.notificationId, bottomTabBubble.notificationId);
    }

    public final int hashCode() {
        List<String> list = this.backgroundColor;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.gradientType) * 31;
        Title title = this.title;
        int iHashCode2 = (iHashCode + (title == null ? 0 : title.hashCode())) * 31;
        String str = this.jumpLink;
        int iHashCode3 = (((((((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.showTimes) * 31) + this.showAfter) * 31) + C786410Ut5.Z2(this.needLoginGate)) * 31) + this.disappearCountDown) * 31) + this.anchorIndex.hashCode()) * 31;
        String str2 = this.notificationId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomTabBubble(backgroundColor=");
        sbLIZ.append(this.backgroundColor);
        sbLIZ.append(", gradientType=");
        sbLIZ.append(this.gradientType);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", showTimes=");
        sbLIZ.append(this.showTimes);
        sbLIZ.append(", showAfter=");
        sbLIZ.append(this.showAfter);
        sbLIZ.append(", needLoginGate=");
        sbLIZ.append(this.needLoginGate);
        sbLIZ.append(", disappearCountDown=");
        sbLIZ.append(this.disappearCountDown);
        sbLIZ.append(", anchorIndex=");
        sbLIZ.append(this.anchorIndex);
        sbLIZ.append(", notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.anchorIndex, EnumC1894340zOa.TAB_COIN.getValue()) || Intrinsics.LJFF(this.anchorIndex, "");
    }

    public BottomTabBubble(List<String> list, int i, Title title, String str, int i2, int i3, boolean z, int i4, String str2, String str3) {
        this.backgroundColor = list;
        this.gradientType = i;
        this.title = title;
        this.jumpLink = str;
        this.showTimes = i2;
        this.showAfter = i3;
        this.needLoginGate = z;
        this.disappearCountDown = i4;
        this.anchorIndex = str2;
        this.notificationId = str3;
    }
}
