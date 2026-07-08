package com.ss.solution.gear_center;

import X.C13BV;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public final class LyraxGearCenterConfig {
    public final JSONObject abLabel;
    public final List<String> accessHosts;
    public final String appChannel;
    public final Context appContext;
    public final String appId;
    public final String appVersion;
    public final String deviceId;
    public final LyraxGearLiveType liveType;
    public final Function2<String, String, Unit> logCallback;
    public final String logWebsocketUrl;
    public final String rtcAppId;
    public final JSONObject strategyConfig;
    public final long syncTimeoutMs;

    public LyraxGearCenterConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0L, 8191, null);
    }

    public final JSONObject getAbLabel() {
        return this.abLabel;
    }

    public final List<String> getAccessHosts() {
        return this.accessHosts;
    }

    public final String getAppChannel() {
        return this.appChannel;
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final LyraxGearLiveType getLiveType() {
        return this.liveType;
    }

    public final Function2<String, String, Unit> getLogCallback() {
        return this.logCallback;
    }

    public final String getLogWebsocketUrl() {
        return this.logWebsocketUrl;
    }

    public final String getRtcAppId() {
        return this.rtcAppId;
    }

    public final JSONObject getStrategyConfig() {
        return this.strategyConfig;
    }

    public final long getSyncTimeoutMs() {
        return this.syncTimeoutMs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LyraxGearCenterConfig(LyraxGearLiveType lyraxGearLiveType, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, List<String> list, Context context, JSONObject jSONObject2, Function2<? super String, ? super String, Unit> function2, long j) {
        this.liveType = lyraxGearLiveType;
        this.appId = str;
        this.rtcAppId = str2;
        this.appVersion = str3;
        this.appChannel = str4;
        this.deviceId = str5;
        this.abLabel = jSONObject;
        this.logWebsocketUrl = str6;
        this.accessHosts = list;
        this.appContext = context;
        this.strategyConfig = jSONObject2;
        this.logCallback = function2;
        this.syncTimeoutMs = j;
    }

    public LyraxGearCenterConfig(LyraxGearLiveType lyraxGearLiveType, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, String str6, List list, Context context, JSONObject jSONObject2, Function2 function2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LyraxGearLiveType.Stage : lyraxGearLiveType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? new JSONObject() : jSONObject, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? C13BV.INSTANCE : list, (i & 512) != 0 ? null : context, (i & 1024) != 0 ? new JSONObject() : jSONObject2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? function2 : null, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 200L : j);
    }
}
