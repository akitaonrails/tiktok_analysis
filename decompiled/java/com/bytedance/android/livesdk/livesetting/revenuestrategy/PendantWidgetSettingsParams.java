package com.bytedance.android.livesdk.livesetting.revenuestrategy;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class PendantWidgetSettingsParams {
    public static final TypeAdapter ADAPTER = new PendantWidgetSettingsParams_OptTypeAdapter(NormalGson.singleton());

    @C09CT("widget_default_icon")
    public PendantWidgetResParams defaultWidgetBg;

    @C09CT("preload_delay_seconds")
    public long preloadDelaySeconds;

    @C09CT("widget_reward_animation")
    public Map<String, PendantWidgetResParams> rewardAnimRes;

    public PendantWidgetSettingsParams() {
        this(0L, null, null, 7, null);
    }

    public PendantWidgetSettingsParams(long j, PendantWidgetResParams pendantWidgetResParams, Map<String, PendantWidgetResParams> map) {
        this.preloadDelaySeconds = j;
        this.defaultWidgetBg = pendantWidgetResParams;
        this.rewardAnimRes = map;
    }

    public PendantWidgetSettingsParams(long j, PendantWidgetResParams pendantWidgetResParams, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 5L : j, (i & 2) != 0 ? new PendantWidgetResParams("", "") : pendantWidgetResParams, (i & 4) != 0 ? C2097608Jq.LJIIJ(new Pair("1", new PendantWidgetResParams("tiktok_live_incentive_task_resource", "widget_task_finish_coin_drop_animation.webp")), new Pair("2", new PendantWidgetResParams("tiktok_live_incentive_task_resource", "widget_task_finish_coin_drop_animation.webp")), new Pair("3", new PendantWidgetResParams("tiktok_live_incentive_task_resource", "widget_task_finish_coin_drop_animation.webp")), new Pair("4", new PendantWidgetResParams("tiktok_live_incentive_task_resource", "widget_task_finish_coin_drop_animation.webp"))) : map);
    }
}
