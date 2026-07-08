package com.ss.android.ugc.aweme.series.feed.tab.feed;

import X.C09CT;
import X.C1576710r8H;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import java.util.Set;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaTabCacheWrapper {
    public volatile transient Set<String> LIZ;

    @C09CT("resp")
    public final SeriesFeedResp resp;

    @C09CT("slot_index")
    public final int slotIndex;

    @C09CT("time_stamp")
    public final Long timeStamp;

    public final boolean LIZIZ(long j) {
        return C1576710r8H.LIZ(this.timeStamp, j, this);
    }

    public MiniDramaTabCacheWrapper(Long l, SeriesFeedResp seriesFeedResp, int i) {
        this.timeStamp = l;
        this.resp = seriesFeedResp;
        this.slotIndex = i;
    }

    public static MiniDramaTabCacheWrapper LIZ(MiniDramaTabCacheWrapper miniDramaTabCacheWrapper, SeriesFeedResp seriesFeedResp, int i, int i2) {
        Long l;
        if ((i2 & 1) != 0) {
            l = miniDramaTabCacheWrapper.timeStamp;
        } else {
            l = null;
        }
        if ((i2 & 2) != 0) {
            seriesFeedResp = miniDramaTabCacheWrapper.resp;
        }
        if ((i2 & 4) != 0) {
            i = miniDramaTabCacheWrapper.slotIndex;
        }
        return new MiniDramaTabCacheWrapper(l, seriesFeedResp, i);
    }
}
