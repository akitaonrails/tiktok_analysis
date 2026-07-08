package com.ss.android.ugc.aweme.setting.serverpush.api;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateEdmSubscribeStatusRequest {
    public static final int $stable = 8;

    @C09CT("subscribe_info")
    public final Map<String, Boolean> subscribeInfo;

    @C09CT("unsubscribe_all")
    public final boolean unsubscribeAll;

    public UpdateEdmSubscribeStatusRequest() {
        this(C2097608Jq.LJ(), false);
    }

    public UpdateEdmSubscribeStatusRequest(Map<String, Boolean> map, boolean z) {
        this.subscribeInfo = map;
        this.unsubscribeAll = z;
    }
}
