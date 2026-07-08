package com.ss.android.ugc.tiktok.tpsc.privacy.account.effectcount;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class InteractionVideoCount {

    @C09CT("comment")
    public final VideoCount comment;

    @C09CT("content_reuse_permission")
    public final VideoCount contentReusePermission;

    @C09CT("duet")
    public final VideoCount duet;

    @C09CT("stitch")
    public final VideoCount stitch;

    public InteractionVideoCount() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionVideoCount)) {
            return false;
        }
        InteractionVideoCount interactionVideoCount = (InteractionVideoCount) obj;
        return Intrinsics.LJFF(this.comment, interactionVideoCount.comment) && Intrinsics.LJFF(this.duet, interactionVideoCount.duet) && Intrinsics.LJFF(this.stitch, interactionVideoCount.stitch) && Intrinsics.LJFF(this.contentReusePermission, interactionVideoCount.contentReusePermission);
    }

    public InteractionVideoCount(VideoCount videoCount, VideoCount videoCount2, VideoCount videoCount3, VideoCount videoCount4) {
        this.comment = videoCount;
        this.duet = videoCount2;
        this.stitch = videoCount3;
        this.contentReusePermission = videoCount4;
    }
}
