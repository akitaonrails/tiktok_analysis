package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class LogErrorInfo {
    public static final int $stable = 8;

    @C09CT("code")
    public final Integer code;

    @C09CT("failedItems")
    public final List<LogFailedItem> failedItems;

    @C09CT("message")
    public final String message;

    @C09CT("stackTrace")
    public final String stackTrace;

    public LogErrorInfo(Integer num, String str, String str2, List<LogFailedItem> list) {
        this.code = num;
        this.message = str;
        this.stackTrace = str2;
        this.failedItems = list;
    }
}
