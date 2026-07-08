package com.ss.android.ugc.aweme.share.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Extra {

    @C09CT("fatal_item_ids")
    public final List<String> fatalItemIds;

    @C09CT("logid")
    public final String logId;

    @C09CT("now")
    public final Long now;

    public Extra() {
        this(null, null, null);
    }

    public Extra(Long l, String str, List<String> list) {
        this.now = l;
        this.logId = str;
        this.fatalItemIds = list;
    }
}
