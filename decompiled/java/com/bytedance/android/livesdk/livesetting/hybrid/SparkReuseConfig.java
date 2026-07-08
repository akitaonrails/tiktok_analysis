package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkReuseConfig {
    public static final TypeAdapter ADAPTER = new SparkReuseConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("allow_schema_list")
    public String[] allowSchemaList;

    @C09CT("deny_schema_list")
    public String[] denySchemaList;

    @C09CT("enable")
    public boolean enable;

    @C09CT("match_rule")
    public int matchRule;

    @C09CT("volume")
    public int volume = Integer.MAX_VALUE;

    @C09CT("biz")
    public String biz = "";

    @C09CT("expired_time_in_seconds")
    public int expiredTimeInSeconds = -1;
}
