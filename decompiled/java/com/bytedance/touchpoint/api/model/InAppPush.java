package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InAppPush extends C1893670zNV {

    @C09CT("background_color")
    public String bgColor;

    @C09CT("button")
    public Button button;

    @C09CT("content")
    public Content content;

    @C09CT("control")
    public Control control;

    @C09CT("icon")
    public String icon;

    @C09CT("inapp_push_id")
    public Integer inAppPushId;

    @C09CT("inapp_push_name")
    public String inAppPushName;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("tasks")
    public String taskIds;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPush)) {
            return false;
        }
        InAppPush inAppPush = (InAppPush) obj;
        return Intrinsics.LJFF(this.inAppPushId, inAppPush.inAppPushId) && Intrinsics.LJFF(this.inAppPushName, inAppPush.inAppPushName) && Intrinsics.LJFF(this.taskIds, inAppPush.taskIds) && Intrinsics.LJFF(this.bgColor, inAppPush.bgColor) && Intrinsics.LJFF(this.icon, inAppPush.icon) && Intrinsics.LJFF(this.jumpLink, inAppPush.jumpLink) && Intrinsics.LJFF(this.content, inAppPush.content) && Intrinsics.LJFF(this.button, inAppPush.button) && Intrinsics.LJFF(this.control, inAppPush.control);
    }

    public final int hashCode() {
        Integer num = this.inAppPushId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.inAppPushName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.taskIds;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bgColor;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.jumpLink;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Content content = this.content;
        int iHashCode7 = (iHashCode6 + (content == null ? 0 : content.hashCode())) * 31;
        Button button = this.button;
        int iHashCode8 = (iHashCode7 + (button == null ? 0 : button.hashCode())) * 31;
        Control control = this.control;
        return iHashCode8 + (control != null ? control.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InAppPush(inAppPushId=");
        sbLIZ.append(this.inAppPushId);
        sbLIZ.append(", inAppPushName=");
        sbLIZ.append(this.inAppPushName);
        sbLIZ.append(", taskIds=");
        sbLIZ.append(this.taskIds);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", control=");
        sbLIZ.append(this.control);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public InAppPush(Integer num, String str, String str2, String str3, String str4, String str5, Content content, Button button, Control control) {
        this.inAppPushId = num;
        this.inAppPushName = str;
        this.taskIds = str2;
        this.bgColor = str3;
        this.icon = str4;
        this.jumpLink = str5;
        this.content = content;
        this.button = button;
        this.control = control;
    }
}
