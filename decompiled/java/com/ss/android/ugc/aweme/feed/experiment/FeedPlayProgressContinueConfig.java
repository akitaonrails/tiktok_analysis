package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FeedPlayProgressContinueConfig {

    @C09CT("duration")
    public final long duration;

    @C09CT("enable")
    public final int enable;

    @C09CT("event_type_list")
    public final List<String> event_type_list;

    @C09CT("maxcount")
    public final int maxCount;

    @C09CT("playback")
    public final long position;

    public FeedPlayProgressContinueConfig() {
        this(0, 0L, 0L, 16, C1697810uHb.LJIIJJI("homepage_hot", "others_homepage", "personal_homepage", "landscape_mode", "account_history", "collection_video"));
    }

    public FeedPlayProgressContinueConfig(int i, long j, long j2, int i2, List<String> list) {
        this.enable = i;
        this.duration = j;
        this.position = j2;
        this.maxCount = i2;
        this.event_type_list = list;
    }
}
