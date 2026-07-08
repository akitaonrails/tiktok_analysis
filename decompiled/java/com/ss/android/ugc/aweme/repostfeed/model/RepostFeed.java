package com.ss.android.ugc.aweme.repostfeed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class RepostFeed implements Serializable {

    @C09CT("feed_do_aweme")
    public Aweme aweme;

    @C09CT("feed_recall_type")
    public int feedRecallType;

    @C09CT("feed_do_type")
    public int feedType;

    @C09CT("recall_uid")
    public long recallUid;

    @C09CT("source")
    public int source;

    public RepostFeed() {
        this(null, 0, 0, 0L, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepostFeed)) {
            return false;
        }
        RepostFeed repostFeed = (RepostFeed) obj;
        return Intrinsics.LJFF(this.aweme, repostFeed.aweme) && this.source == repostFeed.source && this.feedType == repostFeed.feedType && this.recallUid == repostFeed.recallUid && this.feedRecallType == repostFeed.feedRecallType;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setSource(int i) {
        this.source = i;
    }

    public RepostFeed(Aweme aweme, int i, int i2, long j, int i3) {
        this.aweme = aweme;
        this.source = i;
        this.feedType = i2;
        this.recallUid = j;
        this.feedRecallType = i3;
    }
}
