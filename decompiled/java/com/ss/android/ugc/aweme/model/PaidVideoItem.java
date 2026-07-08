package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidVideoItem implements Serializable {

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("full_paid_videos_for_partial_preview")
    public final Aweme fullAweme;

    @C09CT("is_completed_bool")
    public final boolean isComplete;

    @C09CT("is_intro")
    public final boolean isIntro;

    @C09CT("is_last_watched")
    public final boolean isLastWatched;

    @C09CT("is_reported")
    public final boolean isReported;

    @C09CT("is_safety_selected")
    public final boolean isSafetySelected;

    @C09CT("last_watch_time")
    public final long lastWatchTime;

    @C09CT("max_timestamp")
    public final long maxTimestamp;

    @C09CT("paid_video_id")
    public final long paidVideoId;

    @C09CT("seq_id")
    public final int seqId;

    @C09CT("video_duration")
    public final long videoDuration;

    @C09CT("video_views")
    public final int videoViews;

    public PaidVideoItem() {
        this(0L, false, false, null, null, false, 0L, 0L, 0L, 0, false, 0, true);
    }

    public final PaidVideoItem copy(long j, boolean z, boolean z2, Aweme aweme, Aweme aweme2, boolean z3, long j2, long j3, long j4, int i, boolean z4, int i2, boolean z5) {
        return new PaidVideoItem(j, z, z2, aweme, aweme2, z3, j2, j3, j4, i, z4, i2, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidVideoItem)) {
            return false;
        }
        PaidVideoItem paidVideoItem = (PaidVideoItem) obj;
        return this.paidVideoId == paidVideoItem.paidVideoId && this.isIntro == paidVideoItem.isIntro && this.isReported == paidVideoItem.isReported && Intrinsics.LJFF(this.aweme, paidVideoItem.aweme) && Intrinsics.LJFF(this.fullAweme, paidVideoItem.fullAweme) && this.isComplete == paidVideoItem.isComplete && this.maxTimestamp == paidVideoItem.maxTimestamp && this.lastWatchTime == paidVideoItem.lastWatchTime && this.videoDuration == paidVideoItem.videoDuration && this.seqId == paidVideoItem.seqId && this.isLastWatched == paidVideoItem.isLastWatched && this.videoViews == paidVideoItem.videoViews && this.isSafetySelected == paidVideoItem.isSafetySelected;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final boolean isIntro() {
        return this.isIntro;
    }

    public final boolean isLastWatched() {
        return this.isLastWatched;
    }

    public final boolean isReported() {
        return this.isReported;
    }

    public final boolean isSafetySelected() {
        return this.isSafetySelected;
    }

    public PaidVideoItem(long j, boolean z, boolean z2, Aweme aweme, Aweme aweme2, boolean z3, long j2, long j3, long j4, int i, boolean z4, int i2, boolean z5) {
        this.paidVideoId = j;
        this.isIntro = z;
        this.isReported = z2;
        this.aweme = aweme;
        this.fullAweme = aweme2;
        this.isComplete = z3;
        this.maxTimestamp = j2;
        this.lastWatchTime = j3;
        this.videoDuration = j4;
        this.seqId = i;
        this.isLastWatched = z4;
        this.videoViews = i2;
        this.isSafetySelected = z5;
    }
}
