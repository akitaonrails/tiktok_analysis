package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class LocalDraftLog {
    public static final int $stable = 8;

    @C09CT("created_at")
    public final String createdAt;

    @C09CT("current_count")
    public final int currentCount;

    @C09CT("available_size")
    public final String internalAvailable;

    @C09CT("last_modified")
    public final String lastModified;

    @C09CT("name")
    public final String name;

    @C09CT("other_count_list")
    public final List<Integer> otherCountList;

    @C09CT("total_count")
    public final int totalCount;

    public LocalDraftLog() {
        this(null, null, null, 0, 0, null, null, 127, null);
    }

    public LocalDraftLog(String str, String str2, String str3, int i, int i2, List<Integer> list, String str4) {
        this.name = str;
        this.createdAt = str2;
        this.lastModified = str3;
        this.currentCount = i;
        this.totalCount = i2;
        this.otherCountList = list;
        this.internalAvailable = str4;
    }

    public LocalDraftLog(String str, String str2, String str3, int i, int i2, List list, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? C13BV.INSTANCE : list, (i3 & 64) != 0 ? "Unknown" : str4);
    }
}
