package com.bytedance.android.livesdk.livesetting.other;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes33.dex */
public final class LivePitayaTaskFrequentControlManager {
    public static final TypeAdapter ADAPTER = new LivePitayaTaskFrequentControlManager_OptTypeAdapter(NormalGson.singleton());

    @C09CT("cpu_rate_limit")
    public double cpuRateLimit;

    @C09CT("cpu_rate_limit_anchor")
    public double cpuRateLimitAnchor;

    @C09CT("cpu_speed_limit")
    public double cpuSpeedLimit;

    @C09CT("cpu_speed_limit_anchor")
    public double cpuSpeedLimitAnchor;

    @C09CT("enable_frequent_control")
    public boolean enableFrequentControl;

    @C09CT("enable_frequent_control_white_list")
    public List<String> enableFrequentControlWhiteList;

    @C09CT("fps_limit")
    public double fpsLimit;

    @C09CT("fps_limit_anchor")
    public double fpsLimitAnchor;

    @C09CT("memory_limit")
    public double memoryLimit;

    @C09CT("memory_limit_anchor")
    public double memoryLimitAnchor;

    public LivePitayaTaskFrequentControlManager() {
        this(false, null, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
    }

    public LivePitayaTaskFrequentControlManager(boolean z, List<String> list, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.enableFrequentControl = z;
        this.enableFrequentControlWhiteList = list;
        this.fpsLimit = d;
        this.cpuRateLimit = d2;
        this.cpuSpeedLimit = d3;
        this.memoryLimit = d4;
        this.fpsLimitAnchor = d5;
        this.cpuRateLimitAnchor = d6;
        this.cpuSpeedLimitAnchor = d7;
        this.memoryLimitAnchor = d8;
    }

    public LivePitayaTaskFrequentControlManager(boolean z, List list, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 100.0d : d, (i & 8) != 0 ? 100.0d : d2, (i & 16) != 0 ? 100.0d : d3, (i & 32) != 0 ? 100.0d : d4, (i & 64) != 0 ? 100.0d : d5, (i & 128) != 0 ? 100.0d : d6, (i & 256) != 0 ? 100.0d : d7, (i & 512) == 0 ? d8 : 100.0d);
    }
}
