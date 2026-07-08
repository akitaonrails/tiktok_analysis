package com.bytedance.android.livesdkapi.host;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.TypeAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveDispatchConfig {
    public static final int $stable = 8;
    public static final TypeAdapter ADAPTER = new LiveDispatchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("api_throttle_limited_domain_list")
    public List<String> apiThrottleLimitedDomainList;

    @C09CT("black_list")
    public List<String> blackList;

    @C09CT("default_priority_apis")
    public List<String> defaultPriorityApis;

    @C09CT("delay_disable_time_ms")
    public int delayDisableTimeMs;

    @C09CT("drop_list")
    public List<String> dropList;

    @C09CT("high_priority_apis")
    public List<String> highPriorityApis;

    @C09CT("low_priority_apis")
    public List<String> lowPriorityApis;

    @C09CT("max_delay_time_ms")
    public int maxDelayTimeMs;

    @C09CT("scene_name")
    public String sceneName;

    @C09CT("sparse_send_interval_ms")
    public int sparseSendIntervalMs;

    @C09CT("throttle_limit_by_path")
    public Map<String, Integer> throttleConfigByPath;

    @C09CT("white_list")
    public List<String> whiteList;

    @C09CT("ws_throttle_limited_domain_list")
    public List<String> wsThrottleLimitedDomainList;

    public LiveDispatchConfig() {
        this(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
    }

    public final List<String> getApiThrottleLimitedDomainList() {
        return this.apiThrottleLimitedDomainList;
    }

    public final List<String> getBlackList() {
        return this.blackList;
    }

    public final List<String> getDefaultPriorityApis() {
        return this.defaultPriorityApis;
    }

    public final int getDelayDisableTimeMs() {
        return this.delayDisableTimeMs;
    }

    public final List<String> getDropList() {
        return this.dropList;
    }

    public final List<String> getHighPriorityApis() {
        return this.highPriorityApis;
    }

    public final List<String> getLowPriorityApis() {
        return this.lowPriorityApis;
    }

    public final int getMaxDelayTimeMs() {
        return this.maxDelayTimeMs;
    }

    public final String getSceneName() {
        return this.sceneName;
    }

    public final int getSparseSendIntervalMs() {
        return this.sparseSendIntervalMs;
    }

    public final Map<String, Integer> getThrottleConfigByPath() {
        return this.throttleConfigByPath;
    }

    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    public final List<String> getWsThrottleLimitedDomainList() {
        return this.wsThrottleLimitedDomainList;
    }

    public final void setApiThrottleLimitedDomainList(List<String> list) {
        this.apiThrottleLimitedDomainList = list;
    }

    public final void setBlackList(List<String> list) {
        this.blackList = list;
    }

    public final void setDefaultPriorityApis(List<String> list) {
        this.defaultPriorityApis = list;
    }

    public final void setDelayDisableTimeMs(int i) {
        this.delayDisableTimeMs = i;
    }

    public final void setDropList(List<String> list) {
        this.dropList = list;
    }

    public final void setHighPriorityApis(List<String> list) {
        this.highPriorityApis = list;
    }

    public final void setLowPriorityApis(List<String> list) {
        this.lowPriorityApis = list;
    }

    public final void setMaxDelayTimeMs(int i) {
        this.maxDelayTimeMs = i;
    }

    public final void setSceneName(String str) {
        this.sceneName = str;
    }

    public final void setSparseSendIntervalMs(int i) {
        this.sparseSendIntervalMs = i;
    }

    public final void setThrottleConfigByPath(Map<String, Integer> map) {
        this.throttleConfigByPath = map;
    }

    public final void setWhiteList(List<String> list) {
        this.whiteList = list;
    }

    public final void setWsThrottleLimitedDomainList(List<String> list) {
        this.wsThrottleLimitedDomainList = list;
    }

    public LiveDispatchConfig(String str, int i, List<String> list, List<String> list2, List<String> list3, int i2, int i3, List<String> list4, List<String> list5, List<String> list6, Map<String, Integer> map, List<String> list7, List<String> list8) {
        this.sceneName = str;
        this.delayDisableTimeMs = i;
        this.dropList = list;
        this.blackList = list2;
        this.whiteList = list3;
        this.maxDelayTimeMs = i2;
        this.sparseSendIntervalMs = i3;
        this.highPriorityApis = list4;
        this.defaultPriorityApis = list5;
        this.lowPriorityApis = list6;
        this.throttleConfigByPath = map;
        this.apiThrottleLimitedDomainList = list7;
        this.wsThrottleLimitedDomainList = list8;
    }

    public LiveDispatchConfig(String str, int i, List list, List list2, List list3, int i2, int i3, List list4, List list5, List list6, Map map, List list7, List list8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 10000 : i, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? C13BV.INSTANCE : list2, (i4 & 16) != 0 ? C13BV.INSTANCE : list3, (i4 & 32) == 0 ? i2 : 10000, (i4 & 64) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i3, (i4 & 128) != 0 ? C13BV.INSTANCE : list4, (i4 & 256) != 0 ? C13BV.INSTANCE : list5, (i4 & 512) != 0 ? C13BV.INSTANCE : list6, (i4 & 1024) != 0 ? new HashMap() : map, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list7, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list8);
    }
}
