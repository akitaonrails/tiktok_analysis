package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPressPreloadConfig implements Serializable {

    @C09CT("long_press_control_time_interval")
    public final long longPressControlTimeInterval;

    @C09CT("press_white_list")
    public final List<String> pressWhiteList;

    public CommentPressPreloadConfig() {
        this(null, 0L, 3, null);
    }

    public CommentPressPreloadConfig(List<String> list, long j) {
        this.pressWhiteList = list;
        this.longPressControlTimeInterval = j;
    }

    public CommentPressPreloadConfig(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? 604800L : j);
    }
}
