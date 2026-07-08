package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.TypeAdapter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
@SettingsKey(preciseExperiment = false, value = "live_host_net_control_configs")
public final class LiveHostNetControlConfig {
    public static final LiveHostNetControlConfig INSTANCE = new LiveHostNetControlConfig();
    public static final List<LiveHostDispatchConfig> DEFAULT = C13BV.INSTANCE;

    private final List<LiveHostDispatchConfig> value() {
        List<LiveHostDispatchConfig> list = (List) SettingsManager.INSTANCE.getValueSafely("live_host_net_control_configs", Collections.singletonList(new LiveHostDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null)));
        return list == null ? DEFAULT : list;
    }

    public final LiveDispatchConfig getConfigByScene(String str) {
        LiveHostDispatchConfig next;
        try {
            Iterator<LiveHostDispatchConfig> it2 = value().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.sceneName, str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            LiveHostDispatchConfig liveHostDispatchConfig = next;
            if (liveHostDispatchConfig == null) {
                return null;
            }
            LiveDispatchConfig liveDispatchConfig = new LiveDispatchConfig(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
            liveDispatchConfig.setSceneName(liveHostDispatchConfig.sceneName);
            liveDispatchConfig.setDelayDisableTimeMs(liveHostDispatchConfig.delayDisableTimeMs);
            liveDispatchConfig.setDropList(liveHostDispatchConfig.dropList);
            liveDispatchConfig.setBlackList(liveHostDispatchConfig.blackList);
            liveDispatchConfig.setWhiteList(liveHostDispatchConfig.whiteList);
            liveDispatchConfig.setMaxDelayTimeMs(liveHostDispatchConfig.maxDelayTimeMs);
            liveDispatchConfig.setSparseSendIntervalMs(liveHostDispatchConfig.sparseSendIntervalMs);
            liveDispatchConfig.setHighPriorityApis(liveHostDispatchConfig.highPriorityApis);
            liveDispatchConfig.setDefaultPriorityApis(liveHostDispatchConfig.defaultPriorityApis);
            liveDispatchConfig.setLowPriorityApis(liveHostDispatchConfig.lowPriorityApis);
            liveDispatchConfig.setThrottleConfigByPath(liveHostDispatchConfig.throttleConfigByPath);
            liveDispatchConfig.setApiThrottleLimitedDomainList(liveHostDispatchConfig.apiThrottleLimitedDomainList);
            liveDispatchConfig.setWsThrottleLimitedDomainList(liveHostDispatchConfig.wsThrottleLimitedDomainList);
            return liveDispatchConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final class LiveHostDispatchConfig {
        public static final TypeAdapter ADAPTER = new LiveHostNetControlConfig_LiveHostDispatchConfig_OptTypeAdapter(NormalGson.singleton());

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

        public LiveHostDispatchConfig() {
            this(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
        }

        public LiveHostDispatchConfig(String str, int i, List<String> list, List<String> list2, List<String> list3, int i2, int i3, List<String> list4, List<String> list5, List<String> list6, Map<String, Integer> map, List<String> list7, List<String> list8) {
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

        public LiveHostDispatchConfig(String str, int i, List list, List list2, List list3, int i2, int i3, List list4, List list5, List list6, Map map, List list7, List list8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 10000 : i, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? C13BV.INSTANCE : list2, (i4 & 16) != 0 ? C13BV.INSTANCE : list3, (i4 & 32) == 0 ? i2 : 10000, (i4 & 64) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i3, (i4 & 128) != 0 ? C13BV.INSTANCE : list4, (i4 & 256) != 0 ? C13BV.INSTANCE : list5, (i4 & 512) != 0 ? C13BV.INSTANCE : list6, (i4 & 1024) != 0 ? new HashMap() : map, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list7, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list8);
        }
    }
}
