package com.ss.android.ugc.aweme.shortvideo.ui.viewmodel;

import X.C004I;
import X.C0LCS;
import X.C2188811AlT;
import X.C861910XrZ;
import X.C861950Xrd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class VideoPublishState implements C004I {
    public static final int $stable = 8;
    public final C0LCS<C861950Xrd> backEvent;
    public final C0LCS<C861910XrZ> cancelEvent;

    public VideoPublishState() {
        this(null, null);
    }

    public final VideoPublishState copy(C0LCS<C861950Xrd> c0lcs, C0LCS<C861910XrZ> c0lcs2) {
        return new VideoPublishState(c0lcs, c0lcs2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoPublishState)) {
            return false;
        }
        VideoPublishState videoPublishState = (VideoPublishState) obj;
        return Intrinsics.LJFF(this.backEvent, videoPublishState.backEvent) && Intrinsics.LJFF(this.cancelEvent, videoPublishState.cancelEvent);
    }

    public int hashCode() {
        C0LCS<C861950Xrd> c0lcs = this.backEvent;
        int iHashCode = (c0lcs == null ? 0 : c0lcs.hashCode()) * 31;
        C0LCS<C861910XrZ> c0lcs2 = this.cancelEvent;
        return iHashCode + (c0lcs2 != null ? c0lcs2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishState(backEvent=");
        sbLIZ.append(this.backEvent);
        sbLIZ.append(", cancelEvent=");
        sbLIZ.append(this.cancelEvent);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0LCS<C861950Xrd> getBackEvent() {
        return this.backEvent;
    }

    public final C0LCS<C861910XrZ> getCancelEvent() {
        return this.cancelEvent;
    }

    public VideoPublishState(C0LCS<C861950Xrd> c0lcs, C0LCS<C861910XrZ> c0lcs2) {
        this.backEvent = c0lcs;
        this.cancelEvent = c0lcs2;
    }
}
