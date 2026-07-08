package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import X.C570440MYw;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class LogFailedItem {

    @C09CT("detail")
    public final Map<String, Object> detail;

    @C09CT("errorCode")
    public final Integer errorCode;

    @C09CT("message")
    public final String message;

    @C09CT("type")
    public final String type;
    public static final C570440MYw Companion = new Object() { // from class: X.0MYw
    };
    public static final int $stable = 8;

    public LogFailedItem(String str, Integer num, String str2, Map<String, ? extends Object> map) {
        this.type = str;
        this.errorCode = num;
        this.message = str2;
        this.detail = map;
    }
}
