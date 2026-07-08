package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class LogDiffInfo {
    public static final int $stable = 8;

    @C09CT("added")
    public final List<LogFieldChange> added;

    @C09CT("modified")
    public final List<LogFieldChange> modified;

    @C09CT("removed")
    public final List<LogFieldChange> removed;

    public LogDiffInfo() {
        this(null, null, null);
    }

    public final boolean isEmpty() {
        List<LogFieldChange> list = this.added;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        List<LogFieldChange> list2 = this.removed;
        if (list2 != null && !list2.isEmpty()) {
            return false;
        }
        List<LogFieldChange> list3 = this.modified;
        return list3 == null || list3.isEmpty();
    }

    public final int totalChanges() {
        List<LogFieldChange> list = this.added;
        int size = list != null ? list.size() : 0;
        List<LogFieldChange> list2 = this.removed;
        int size2 = size + (list2 != null ? list2.size() : 0);
        List<LogFieldChange> list3 = this.modified;
        return size2 + (list3 != null ? list3.size() : 0);
    }

    public LogDiffInfo(List<LogFieldChange> list, List<LogFieldChange> list2, List<LogFieldChange> list3) {
        this.added = list;
        this.removed = list2;
        this.modified = list3;
    }
}
