package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorMemoryCleanConfig {
    public static final TypeAdapter ADAPTER = new AnchorMemoryCleanConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("interval")
    public long interval;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("threshold_config")
    public Map<String, Integer> thresholds;

    public AnchorMemoryCleanConfig() {
        this(false, null, 0L, 7, null);
    }

    public final long getInterval() {
        return this.interval;
    }

    public final Map<String, Integer> getThresholds() {
        return this.thresholds;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setInterval(long j) {
        this.interval = j;
    }

    public final void setThresholds(Map<String, Integer> map) {
        this.thresholds = map;
    }

    public AnchorMemoryCleanConfig(boolean z, Map<String, Integer> map, long j) {
        this.isEnabled = z;
        this.thresholds = map;
        this.interval = j;
    }

    public AnchorMemoryCleanConfig(boolean z, Map map, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C2097608Jq.LJIIJ(new Pair("0.5", Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)), new Pair("1.0", 500), new Pair("2.0", 500), new Pair("3.0", Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT)), new Pair("4.0", 900), new Pair("6.0", 900), new Pair("8.0", 900)) : map, (i & 4) != 0 ? 30000L : j);
    }
}
