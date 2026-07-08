package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class LogStepInfo {
    public static final int $stable = 8;

    @C09CT("diff")
    public final LogDiffInfo diff;

    @C09CT("duration")
    public final Long duration;

    @C09CT("errorCode")
    public final Integer errorCode;

    @C09CT("failedItems")
    public final List<LogFailedItem> failedItems;

    @C09CT("name")
    public final String name;

    @C09CT("success")
    public final Boolean success;

    public LogStepInfo(String str, Boolean bool, Long l, Integer num, List<LogFailedItem> list, LogDiffInfo logDiffInfo) {
        this.name = str;
        this.success = bool;
        this.duration = l;
        this.errorCode = num;
        this.failedItems = list;
        this.diff = logDiffInfo;
    }
}
