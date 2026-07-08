package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class FanSpotlightPickVideoResponse extends MusicBaseResponse implements Serializable {

    @C09CT("aweme_list")
    public List<? extends Aweme> awemeList;

    @C09CT("cursor")
    public long cursor;

    @C09CT("has_more")
    public boolean hasMore;
    public boolean preload;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getPreload() {
        return this.preload;
    }

    public final void setAwemeList(List<? extends Aweme> list) {
        this.awemeList = list;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setPreload(boolean z) {
        this.preload = z;
    }
}
