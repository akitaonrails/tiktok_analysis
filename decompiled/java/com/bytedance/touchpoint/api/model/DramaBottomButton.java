package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class DramaBottomButton extends C1893670zNV {

    @C09CT("highlight_title")
    public Title highlightTitle;

    @C09CT("notification_id")
    public final String notificationId;

    @C09CT("notification_name")
    public final String notificationName;

    @C09CT("show_times")
    public Integer showTimes;

    @C09CT("task_event_key")
    public String taskEventKey;

    @C09CT("title")
    public final Title title;

    public DramaBottomButton() {
        this("", "", null, null, 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DramaBottomButton)) {
            return false;
        }
        DramaBottomButton dramaBottomButton = (DramaBottomButton) obj;
        return Intrinsics.LJFF(this.notificationId, dramaBottomButton.notificationId) && Intrinsics.LJFF(this.notificationName, dramaBottomButton.notificationName) && Intrinsics.LJFF(this.title, dramaBottomButton.title) && Intrinsics.LJFF(this.highlightTitle, dramaBottomButton.highlightTitle) && Intrinsics.LJFF(this.showTimes, dramaBottomButton.showTimes) && Intrinsics.LJFF(this.taskEventKey, dramaBottomButton.taskEventKey);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Title title = this.title;
        int iHashCode3 = (iHashCode2 + (title == null ? 0 : title.hashCode())) * 31;
        Title title2 = this.highlightTitle;
        int iHashCode4 = (iHashCode3 + (title2 == null ? 0 : title2.hashCode())) * 31;
        Integer num = this.showTimes;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.taskEventKey;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaBottomButton(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(", highlightTitle=");
        sbLIZ.append(this.highlightTitle);
        sbLIZ.append(", showTimes=");
        sbLIZ.append(this.showTimes);
        sbLIZ.append(", taskEventKey=");
        sbLIZ.append(this.taskEventKey);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DramaBottomButton(String str, String str2, Title title, Title title2, Integer num, String str3) {
        this.notificationId = str;
        this.notificationName = str2;
        this.title = title;
        this.highlightTitle = title2;
        this.showTimes = num;
        this.taskEventKey = str3;
    }
}
