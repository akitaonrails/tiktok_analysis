package com.ss.android.ugc.aweme.feed.utils;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class DataOperation {

    @C09CT("diff_type")
    public final String diffType;

    @C09CT("new")
    public final List<String> newItems;

    @C09CT("old")
    public final List<String> oldItems;

    @C09CT("op")
    public final String operation;

    @C09CT("pos")
    public final int pos;

    public DataOperation() {
        this(null, null, 0, null, null);
    }

    public DataOperation(String str, String str2, int i, List<String> list, List<String> list2) {
        this.diffType = str;
        this.operation = str2;
        this.pos = i;
        this.oldItems = list;
        this.newItems = list2;
    }
}
