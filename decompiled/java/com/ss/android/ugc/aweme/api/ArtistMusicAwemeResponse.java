package com.ss.android.ugc.aweme.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.MusicBaseResponse;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistMusicAwemeResponse extends MusicBaseResponse implements Serializable {

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("cursor")
    public final String cursor;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }
}
