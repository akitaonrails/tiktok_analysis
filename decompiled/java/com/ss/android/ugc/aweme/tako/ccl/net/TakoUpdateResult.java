package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C09CT;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoUpdateResult {

    @C09CT("msg")
    public final Message hintMessage;

    @C09CT("toast")
    public final String toastContent;

    public TakoUpdateResult() {
        this(null, null);
    }

    public TakoUpdateResult(String str, Message message) {
        this.toastContent = str;
        this.hintMessage = message;
    }
}
