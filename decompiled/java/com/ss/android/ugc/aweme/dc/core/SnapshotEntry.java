package com.ss.android.ugc.aweme.dc.core;

import X.C09CT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class SnapshotEntry {

    @C09CT("po_refs")
    public final List<PORef> poRefs;

    @C09CT("states")
    public final Map<String, String> states;

    @C09CT("vo_type")
    public final String voType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SnapshotEntry)) {
            return false;
        }
        SnapshotEntry snapshotEntry = (SnapshotEntry) obj;
        return Intrinsics.LJFF(this.poRefs, snapshotEntry.poRefs) && Intrinsics.LJFF(this.voType, snapshotEntry.voType) && Intrinsics.LJFF(this.states, snapshotEntry.states);
    }

    public SnapshotEntry(List<PORef> list, String str, Map<String, String> map) {
        this.poRefs = list;
        this.voType = str;
        this.states = map;
    }
}
