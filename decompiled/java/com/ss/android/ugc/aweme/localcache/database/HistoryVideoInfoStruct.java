package com.ss.android.ugc.aweme.localcache.database;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class HistoryVideoInfoStruct {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;

    @C09CT("aweme")
    public final Aweme aweme;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("behaviors")
    public final Integer behaviors;

    @C09CT("playback_duration")
    public final long playbackDuration;

    @C09CT("video_duration")
    public final int videoDuration;

    public HistoryVideoInfoStruct() {
        this("", null, 0, 0L, 0);
    }

    public static long LIZ(Long l) {
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    public HistoryVideoInfoStruct(String str, Aweme aweme, int i, long j, Integer num) {
        this.awemeId = str;
        this.aweme = aweme;
        this.videoDuration = i;
        this.playbackDuration = j;
        this.behaviors = num;
        this.LIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 897));
        this.LIZIZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 898));
        this.LIZJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 896));
    }
}
