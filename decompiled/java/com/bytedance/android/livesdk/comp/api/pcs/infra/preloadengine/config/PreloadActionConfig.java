package com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class PreloadActionConfig {
    public static final TypeAdapter ADAPTER = new PreloadActionConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("access_key")
    public String accessKey;

    @C09CT("action_combine_value")
    public Integer actionCombineValue;

    @C09CT("api_path")
    public String apiPath;

    @C09CT("biz_key")
    public String bizKey;

    @C09CT("cache_duration")
    public Integer cacheDuration;

    @C09CT("channel")
    public String channel;

    @C09CT("enable_pending_js_task")
    public Integer enablePendingJsTask;

    @C09CT("expired_second")
    public Integer expiredSecond;

    @C09CT("force_fetch")
    public Boolean forceFetch;

    @C09CT("pending_load")
    public Boolean pendingLoad;

    @C09CT("scheme")
    public String scheme;

    @C09CT("scheme_unique_path")
    public String schemeUniquePath;

    @C09CT("volume")
    public Integer volume;

    public PreloadActionConfig() {
        this(0, "", "", "", "", "", 0, Boolean.FALSE, 0, 1, "", Boolean.FALSE, 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action_combine_value=");
        sbLIZ.append(this.actionCombineValue);
        sbLIZ.append(" channel=");
        sbLIZ.append(this.channel);
        sbLIZ.append(" schema=");
        sbLIZ.append(this.scheme);
        sbLIZ.append(" apiPath=");
        sbLIZ.append(this.apiPath);
        sbLIZ.append('=');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadActionConfig(Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Boolean bool, Integer num3, Integer num4, String str6, Boolean bool2, Integer num5) {
        this.actionCombineValue = num;
        this.accessKey = str;
        this.channel = str2;
        this.bizKey = str3;
        this.scheme = str4;
        this.schemeUniquePath = str5;
        this.expiredSecond = num2;
        this.pendingLoad = bool;
        this.enablePendingJsTask = num3;
        this.volume = num4;
        this.apiPath = str6;
        this.forceFetch = bool2;
        this.cacheDuration = num5;
    }
}
