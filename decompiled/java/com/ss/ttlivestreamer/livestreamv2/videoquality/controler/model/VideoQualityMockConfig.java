package com.ss.ttlivestreamer.livestreamv2.videoquality.controler.model;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes36.dex */
public class VideoQualityMockConfig {

    @C09CT("mock_probe_switch")
    public int mockProbeSwitch = -1;

    @C09CT("mock_probe_network_type")
    public int mockProbeNetworkType = -1;

    @C09CT("mock_probe_status_code")
    public int mockProbeStatusCode = -1;

    @C09CT("mock_probe_net_speed")
    public int mockProbeNetSpeed = -1;

    @C09CT("mock_probe_duration")
    public int mockProbeDuration = -1;

    @C09CT("mock_gear_adaptive_encode_level")
    public int gearEncodeLevel = -1;

    @C09CT("mock_gear_adaptive_effect_level")
    public int gearEffectLevel = -1;

    @C09CT("mock_gear_adaptive_capture_level")
    public int gearCaptureLevel = -1;

    @C09CT("mock_async_release_sleep_ms")
    public int mockAsyncReleaseSleepMs = -1;

    @C09CT("ignore_wifi_probe_cache")
    public int ignoreWifiProbeCache = -1;

    @C09CT("ignore_mobile_probe_cache")
    public int ignoreMobileProbeCache = -1;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoQualityMockConfig{mockProbeSwitch=");
        sbLIZ.append(this.mockProbeSwitch);
        sbLIZ.append(", mockProbeNetworkType=");
        sbLIZ.append(this.mockProbeNetworkType);
        sbLIZ.append(", mockProbeStatusCode=");
        sbLIZ.append(this.mockProbeStatusCode);
        sbLIZ.append(", mockProbeNetSpeed=");
        sbLIZ.append(this.mockProbeNetSpeed);
        sbLIZ.append(", mockProbeDuration=");
        sbLIZ.append(this.mockProbeDuration);
        sbLIZ.append(", gearEncodeLevel=");
        sbLIZ.append(this.gearEncodeLevel);
        sbLIZ.append(", gearEffectLevel=");
        sbLIZ.append(this.gearEffectLevel);
        sbLIZ.append(", gearCaptureLevel=");
        sbLIZ.append(this.gearCaptureLevel);
        sbLIZ.append(", ignoreWifiProbeCache=");
        sbLIZ.append(this.ignoreWifiProbeCache);
        sbLIZ.append(", ignoreMobileProbeCache=");
        sbLIZ.append(this.ignoreMobileProbeCache);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
