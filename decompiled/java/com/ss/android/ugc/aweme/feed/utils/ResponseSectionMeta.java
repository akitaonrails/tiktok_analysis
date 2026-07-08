package com.ss.android.ugc.aweme.feed.utils;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes25.dex */
public final class ResponseSectionMeta {
    public transient int LIZ;
    public transient int LIZIZ;

    @C09CT("exposure_items")
    public final ArrayList<String> items;

    @C09CT("log_id")
    public final String logId;

    @C09CT("ops")
    public final ArrayList<DataOperation> operations;

    @C09CT("pull_type")
    public final String pullType;

    public ResponseSectionMeta() {
        this(null, null);
    }

    public ResponseSectionMeta(String str, String str2) {
        this.logId = str;
        this.pullType = str2;
        this.items = new ArrayList<>();
        this.operations = new ArrayList<>();
    }
}
