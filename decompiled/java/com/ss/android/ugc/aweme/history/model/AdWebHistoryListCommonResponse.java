package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryListCommonResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("iab_history_infos")
    public List<AdWebHistoryEntity> adWebHistoryEntities;

    @C09CT("has_more")
    public final Boolean hasMore;

    @C09CT("next_cursor")
    public final Long nextCursor;

    @C09CT("status_code")
    public final Integer statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public AdWebHistoryListCommonResponse() {
        this(null, null, null, null, null);
    }

    public final void setAdWebHistoryEntities(List<AdWebHistoryEntity> list) {
        this.adWebHistoryEntities = list;
    }

    public AdWebHistoryListCommonResponse(Integer num, String str, Long l, Boolean bool, List<AdWebHistoryEntity> list) {
        this.statusCode = num;
        this.statusMsg = str;
        this.nextCursor = l;
        this.hasMore = bool;
        this.adWebHistoryEntities = list;
    }
}
