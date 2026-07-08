package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class FavoriteRecommendedMusicResponse extends BaseResponse {

    @C09CT("cursor")
    public int cursor;

    @C09CT("has_more")
    public final int hasMore;

    @C09CT("music_list")
    public List<? extends Music> items;

    @C09CT("log_pb")
    public LogPbBean logPb;

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public final boolean isHasMore() {
        return this.hasMore == 1;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final List<Music> getItems() {
        return this.items;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setItems(List<? extends Music> list) {
        this.items = list;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
