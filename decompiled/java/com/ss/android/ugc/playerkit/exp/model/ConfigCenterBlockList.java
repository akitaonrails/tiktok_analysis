package com.ss.android.ugc.playerkit.exp.model;

import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class ConfigCenterBlockList {
    public final List<Integer> list;
    public final Range range;

    public ConfigCenterBlockList() {
        this(null, null);
    }

    public final boolean isBlocked(int i) {
        Range range = this.range;
        if (range != null) {
            long j = range.start;
            long j2 = range.end;
            long j3 = i;
            if (j <= j3 && j3 <= j2) {
                return true;
            }
        }
        List<Integer> list = this.list;
        if (list != null && list.contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public ConfigCenterBlockList(Range range, List<Integer> list) {
        this.range = range;
        this.list = list;
    }
}
