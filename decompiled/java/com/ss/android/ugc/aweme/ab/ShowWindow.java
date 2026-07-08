package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes24.dex */
public final class ShowWindow {

    @C09CT("count")
    public final int count;

    @C09CT("disable_request")
    public final int disableRequest;

    @C09CT("duration")
    public final int duration;

    public ShowWindow() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowWindow)) {
            return false;
        }
        ShowWindow showWindow = (ShowWindow) obj;
        return this.duration == showWindow.duration && this.count == showWindow.count && this.disableRequest == showWindow.disableRequest;
    }

    public final int hashCode() {
        return (((this.duration * 31) + this.count) * 31) + this.disableRequest;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowWindow(duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", count=");
        sbLIZ.append(this.count);
        sbLIZ.append(", disableRequest=");
        sbLIZ.append(this.disableRequest);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ShowWindow(int i, int i2, int i3) {
        this.duration = i;
        this.count = i2;
        this.disableRequest = i3;
    }
}
