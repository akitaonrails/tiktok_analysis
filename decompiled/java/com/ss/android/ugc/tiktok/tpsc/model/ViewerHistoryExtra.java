package com.ss.android.ugc.tiktok.tpsc.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewerHistoryExtra extends PopupExtra {

    @C09CT("profile_view_history")
    public final int profileViewHistory;

    @C09CT("video_view_history")
    public final int videoViewHistory;

    public ViewerHistoryExtra() {
        this(1, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewerHistoryExtra)) {
            return false;
        }
        ViewerHistoryExtra viewerHistoryExtra = (ViewerHistoryExtra) obj;
        return this.profileViewHistory == viewerHistoryExtra.profileViewHistory && this.videoViewHistory == viewerHistoryExtra.videoViewHistory;
    }

    public final int hashCode() {
        return (this.profileViewHistory * 31) + this.videoViewHistory;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerHistoryExtra(profileViewHistory=");
        sbLIZ.append(this.profileViewHistory);
        sbLIZ.append(", videoViewHistory=");
        sbLIZ.append(this.videoViewHistory);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ViewerHistoryExtra(int i, int i2) {
        super(0);
        this.profileViewHistory = i;
        this.videoViewHistory = i2;
    }
}
