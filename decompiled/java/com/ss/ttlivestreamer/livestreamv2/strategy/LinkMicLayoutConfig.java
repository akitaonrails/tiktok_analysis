package com.ss.ttlivestreamer.livestreamv2.strategy;

import X.C09CT;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LinkMicLayoutConfig {

    @C09CT("effect_fps")
    public int effectFps = 15;

    @C09CT("res_cap_height")
    public int captureHeight = 1280;

    @C09CT("res_cap_width")
    public int captureWidth = 720;

    @C09CT("res_effect_width")
    public int resEffectWidth = 720;

    @C09CT("res_effect_height")
    public int resEffectHeight = 720;

    @C09CT("android_cap_fps_min")
    public int captureFpsMin = 15;

    @C09CT("android_cap_fps_max")
    public int captureFpsMax = 15;

    @C09CT("simulcast")
    public SimulcastConfig simulcastConfig = new SimulcastConfig();

    @C09CT("smooth_simulcast")
    public SimulcastConfig smoothSimulcastConfig = new SimulcastConfig();

    @C09CT("balance_simulcast")
    public SimulcastConfig balanceSimulcastConfig = new SimulcastConfig();
    public JSONObject LIZ = null;
}
