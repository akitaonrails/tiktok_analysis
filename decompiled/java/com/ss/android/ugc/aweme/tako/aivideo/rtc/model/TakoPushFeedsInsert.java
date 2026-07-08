package com.ss.android.ugc.aweme.tako.aivideo.rtc.model;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class TakoPushFeedsInsert {

    @C09CT("feeds")
    public final List<String> feeds;

    public TakoPushFeedsInsert() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakoPushFeedsInsert) && Intrinsics.LJFF(this.feeds, ((TakoPushFeedsInsert) obj).feeds);
    }

    public final int hashCode() {
        return this.feeds.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPushFeedsInsert(feeds=");
        sbLIZ.append(this.feeds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TakoPushFeedsInsert(List<String> list) {
        this.feeds = list;
    }

    public TakoPushFeedsInsert(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
