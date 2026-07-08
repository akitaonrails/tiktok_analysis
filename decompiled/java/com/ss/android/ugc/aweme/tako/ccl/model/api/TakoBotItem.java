package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBotItem {

    @C09CT("bot_info")
    public final TakoBotInfo botInfo;

    @C09CT("bot_session_id")
    public final String botSessionId;

    public TakoBotItem() {
        this(null, "");
    }

    public TakoBotItem(TakoBotInfo takoBotInfo, String str) {
        this.botInfo = takoBotInfo;
        this.botSessionId = str;
    }
}
