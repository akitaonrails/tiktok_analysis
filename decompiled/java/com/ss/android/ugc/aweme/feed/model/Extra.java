package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Extra {

    @C09CT("fatal_item_ids")
    public List<String> fatalItemIds;
    public long now;

    public List<String> getFatalItemIds() {
        return this.fatalItemIds;
    }

    public long getNow() {
        return this.now;
    }

    public void setFatalItemIds(List<String> list) {
        this.fatalItemIds = list;
    }

    public void setNow(long j) {
        this.now = j;
    }
}
