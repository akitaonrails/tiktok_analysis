package com.ss.android.ugc.aweme.feed.model.offlinevideo;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class OfflineVideoInfo implements Serializable {

    @C09CT("download_comment_enable")
    public Boolean downloadCommentEnable;

    @C09CT("is_offline_video")
    public boolean isOfflineVideo;

    @C09CT("ug_review_passed")
    public boolean ugReviewPassed;

    public OfflineVideoInfo() {
        this(false, false, null);
    }

    public final boolean isOfflineVideo() {
        return this.isOfflineVideo;
    }

    public final void setOfflineVideo(boolean z) {
        this.isOfflineVideo = z;
    }

    public OfflineVideoInfo(boolean z, boolean z2, Boolean bool) {
        this.isOfflineVideo = z;
        this.ugReviewPassed = z2;
        this.downloadCommentEnable = bool;
    }
}
