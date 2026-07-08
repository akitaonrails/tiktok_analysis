package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import X.C0TU7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class HistoryResponse implements Serializable {
    public static final int $stable = 0;
    public static final C0TU7 Companion = new Object() { // from class: X.0TU7
    };

    @C09CT("err_code")
    public final Integer code;

    @C09CT("data")
    public final HistoryData data;

    @C09CT("message")
    public final String message;

    public HistoryResponse() {
        this(0, "success", null);
    }

    public HistoryResponse(Integer num, String str, HistoryData historyData) {
        this.code = num;
        this.message = str;
        this.data = historyData;
    }
}
