package com.ss.android.ugc.aweme.services;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicEntranceResult {
    public final List<Aweme> awemeList;
    public final String fromGroupId;
    public int hasMore;
    public final String musicId;
    public String pageToken;
    public String requestId;
    public int totalCount;
    public final List<String> unreadStoryIds;

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    public final void setPageToken(String str) {
        this.pageToken = str;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final void setTotalCount(int i) {
        this.totalCount = i;
    }

    public MusicEntranceResult(String str, String str2, List<Aweme> list, List<String> list2, String str3, String str4, int i, int i2) {
        this.musicId = str;
        this.fromGroupId = str2;
        this.awemeList = list;
        this.unreadStoryIds = list2;
        this.pageToken = str3;
        this.requestId = str4;
        this.totalCount = i;
        this.hasMore = i2;
    }
}
