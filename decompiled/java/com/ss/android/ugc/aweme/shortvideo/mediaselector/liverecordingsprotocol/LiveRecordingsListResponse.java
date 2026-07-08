package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LiveRecordingsListResponse {

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("highlight_list")
    public final List<LiveRecordingsListHighlightItem> highlightList;

    @C09CT("last_id")
    public final Long lastId;

    public LiveRecordingsListResponse(Boolean bool, Long l, List<LiveRecordingsListHighlightItem> list) {
        this.hasMore = bool;
        this.lastId = l;
        this.highlightList = list;
    }
}
