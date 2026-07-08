package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryDeleteRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("delete_all")
    public final Boolean deleteAll;

    @C09CT("unique_ids")
    public final List<Long> uniqueIds;

    public AdWebHistoryDeleteRequest() {
        this(null, null);
    }

    public AdWebHistoryDeleteRequest(List<Long> list, Boolean bool) {
        this.uniqueIds = list;
        this.deleteAll = bool;
    }
}
