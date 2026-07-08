package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedBottomButton extends C1893670zNV {

    @C09CT("button")
    public FeedButton button;

    @C09CT("notification_id")
    public String notificationId;

    @C09CT("notification_name")
    public String notificationName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedBottomButton)) {
            return false;
        }
        FeedBottomButton feedBottomButton = (FeedBottomButton) obj;
        return Intrinsics.LJFF(this.notificationId, feedBottomButton.notificationId) && Intrinsics.LJFF(this.notificationName, feedBottomButton.notificationName) && Intrinsics.LJFF(this.button, feedBottomButton.button);
    }

    public final int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notificationName;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.button.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedBottomButton(notificationId=");
        sbLIZ.append(this.notificationId);
        sbLIZ.append(", notificationName=");
        sbLIZ.append(this.notificationName);
        sbLIZ.append(", button=");
        sbLIZ.append(this.button);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedBottomButton(String str, String str2, FeedButton feedButton) {
        this.notificationId = str;
        this.notificationName = str2;
        this.button = feedButton;
    }
}
