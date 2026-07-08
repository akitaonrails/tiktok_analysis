package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C01GW;
import X.C2097608Jq;
import X.C452501pT;
import com.bytedance.android.live.annotation.SettingsKey;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("feed_request_params")
public final class FeedRequestParamsSetting {
    public static final FeedRequestParamsSetting INSTANCE = new FeedRequestParamsSetting();
    public static final FeedRequestParams DEFAULT = new FeedRequestParams(C2097608Jq.LJ());
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(73));

    private final FeedRequestParams getValue() {
        return (FeedRequestParams) value$delegate.getValue();
    }

    public final boolean reqFeedV3(String str) {
        Boolean bool;
        FeedRequestParams value = getValue();
        if (value != null && (bool = value.reqFeedV3.get(str)) != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
