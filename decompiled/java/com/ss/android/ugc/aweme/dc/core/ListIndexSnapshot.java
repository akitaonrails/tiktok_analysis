package com.ss.android.ugc.aweme.dc.core;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class ListIndexSnapshot {

    @C09CT("entries")
    public final List<SnapshotEntry> entries;

    @C09CT("meta")
    public final SnapshotMeta meta;

    public ListIndexSnapshot(SnapshotMeta snapshotMeta, List<SnapshotEntry> list) {
        this.meta = snapshotMeta;
        this.entries = list;
    }
}
