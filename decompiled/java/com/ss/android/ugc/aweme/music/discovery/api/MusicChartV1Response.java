package com.ss.android.ugc.aweme.music.discovery.api;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicChartV1Response {

    @C09CT("cursor")
    public final Integer cursor;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("msg")
    public final String msg;

    @C09CT("music_list")
    public final List<MusicChartStruct> musicList;

    @C09CT("status_code")
    public final Integer statusCode;

    public MusicChartV1Response(Integer num, String str, List<MusicChartStruct> list, Integer num2, Integer num3, LogPbBean logPbBean) {
        this.statusCode = num;
        this.msg = str;
        this.musicList = list;
        this.cursor = num2;
        this.hasMore = num3;
        this.logPb = logPbBean;
    }
}
