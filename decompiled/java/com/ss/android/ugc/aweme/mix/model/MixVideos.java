package com.ss.android.ugc.aweme.mix.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MixVideos implements Serializable {

    @C09CT("has_more")
    public int hasMore;

    @C09CT("log_pb")
    public LogPbBean logPb;

    @C09CT("max_cursor")
    public long maxCursor;

    @C09CT("min_cursor")
    public long minCursor;

    @C09CT("mix_label")
    public int mixLabel;

    @C09CT("status_code")
    public int statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    @C09CT("videos")
    public List<? extends Aweme> videos;

    public final int getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final long getMaxCursor() {
        return this.maxCursor;
    }

    public final long getMinCursor() {
        return this.minCursor;
    }

    public final int getMixLabel() {
        return this.mixLabel;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final List<Aweme> getVideos() {
        return this.videos;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public final void setMinCursor(long j) {
        this.minCursor = j;
    }

    public final void setMixLabel(int i) {
        this.mixLabel = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setVideos(List<? extends Aweme> list) {
        this.videos = list;
    }
}
