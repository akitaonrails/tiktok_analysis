package com.ss.android.ugc.aweme.net.control;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C15442062u;
import X.C452501pT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class DispatchConfig {

    @C09CT("api_throttle_limited_domain_list")
    public final Set<String> apiThrottleLimitedDomainList;

    @C09CT("black_list")
    public final Set<String> blackList;

    @C09CT("default_priority_apis")
    public final Set<String> defaultPriorityApis;

    @C09CT("delay_disable_time_ms")
    public final int delayDisableTimeMs;

    @C09CT("drop_list")
    public final Set<String> dropList;

    @C09CT("high_priority_apis")
    public final Set<String> highPriorityApis;

    @C09CT("low_priority_apis")
    public final Set<String> lowPriorityApis;

    @C09CT("max_delay_time_ms")
    public final int maxDelayTimeMs;

    @C09CT("scene_name")
    public final String sceneName;

    @C09CT("sparse_send_interval_ms")
    public final int sparseSendIntervalMs;

    @C09CT("throttle_limit_by_path")
    public final Map<String, Integer> throttleConfigByPath;

    @C09CT("white_list")
    public final Set<String> whiteList;

    @C09CT("ws_throttle_limited_domain_list")
    public final Set<String> wsThrottleLimitedDomainList;

    public DispatchConfig() {
        this(null, 0, null, null, null, 0, 0, null, null, null, null, null, null, 8191, null);
    }

    public final void LIZ(DispatchConfig dispatchConfig) {
        if (dispatchConfig == null) {
            return;
        }
        Set setLJIIIZ = C15442062u.LJIIIZ(this.dropList, dispatchConfig.dropList);
        int iMax = Math.max(this.delayDisableTimeMs, dispatchConfig.delayDisableTimeMs);
        Set setLJIIIZ2 = C15442062u.LJIIIZ(this.blackList, dispatchConfig.blackList);
        Set setLJIIIZ3 = C15442062u.LJIIIZ(this.whiteList, dispatchConfig.whiteList);
        int iMax2 = Math.max(this.sparseSendIntervalMs, dispatchConfig.sparseSendIntervalMs);
        Set setLJIIIZ4 = C15442062u.LJIIIZ(this.highPriorityApis, dispatchConfig.highPriorityApis);
        Set setLJIIIZ5 = C15442062u.LJIIIZ(this.defaultPriorityApis, dispatchConfig.defaultPriorityApis);
        Set setLJIIIZ6 = C15442062u.LJIIIZ(this.lowPriorityApis, dispatchConfig.lowPriorityApis);
        Map<String, Integer> map = this.throttleConfigByPath;
        Map<String, Integer> map2 = dispatchConfig.throttleConfigByPath;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(73));
        if (map != null) {
            ((HashMap) c01gwLIZIZ.getValue()).putAll(map);
        }
        if (map2 != null) {
            ((HashMap) c01gwLIZIZ.getValue()).putAll(map2);
        }
        new DispatchConfig("", iMax, setLJIIIZ, setLJIIIZ2, setLJIIIZ3, 0, iMax2, setLJIIIZ4, setLJIIIZ5, setLJIIIZ6, (HashMap) c01gwLIZIZ.getValue(), C15442062u.LJIIIZ(this.apiThrottleLimitedDomainList, dispatchConfig.apiThrottleLimitedDomainList), C15442062u.LJIIIZ(this.wsThrottleLimitedDomainList, dispatchConfig.wsThrottleLimitedDomainList), 32, null);
    }

    public DispatchConfig(String str, int i, Set<String> set, Set<String> set2, Set<String> set3, int i2, int i3, Set<String> set4, Set<String> set5, Set<String> set6, Map<String, Integer> map, Set<String> set7, Set<String> set8) {
        this.sceneName = str;
        this.delayDisableTimeMs = i;
        this.dropList = set;
        this.blackList = set2;
        this.whiteList = set3;
        this.maxDelayTimeMs = i2;
        this.sparseSendIntervalMs = i3;
        this.highPriorityApis = set4;
        this.defaultPriorityApis = set5;
        this.lowPriorityApis = set6;
        this.throttleConfigByPath = map;
        this.apiThrottleLimitedDomainList = set7;
        this.wsThrottleLimitedDomainList = set8;
    }

    public DispatchConfig(String str, int i, Set set, Set set2, Set set3, int i2, int i3, Set set4, Set set5, Set set6, Map map, Set set7, Set set8, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 10000 : i, (i4 & 4) != 0 ? C08CX.INSTANCE : set, (i4 & 8) != 0 ? C08CX.INSTANCE : set2, (i4 & 16) != 0 ? C08CX.INSTANCE : set3, (i4 & 32) == 0 ? i2 : 10000, (i4 & 64) != 0 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : i3, (i4 & 128) != 0 ? C08CX.INSTANCE : set4, (i4 & 256) != 0 ? C08CX.INSTANCE : set5, (i4 & 512) != 0 ? C08CX.INSTANCE : set6, (i4 & 1024) != 0 ? new HashMap() : map, (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C08CX.INSTANCE : set7, (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C08CX.INSTANCE : set8);
    }
}
