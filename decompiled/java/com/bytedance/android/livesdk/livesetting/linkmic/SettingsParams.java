package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes18.dex */
public final class SettingsParams {
    public static final TypeAdapter ADAPTER;

    @C09CT("duration_opt_business_name")
    public String durationOptBusinessName;

    @C09CT("feature_collect_business_name")
    public String featureCollectBusinessName;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    static {
        NormalGson.singleton();
        ADAPTER = new SettingsParams_OptTypeAdapter();
    }

    public SettingsParams() {
        this(0, "", "");
    }

    public SettingsParams(int i, String str, String str2) {
        this.status = i;
        this.featureCollectBusinessName = str;
        this.durationOptBusinessName = str2;
    }
}
