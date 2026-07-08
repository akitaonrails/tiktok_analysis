package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class RtcParams {

    @C09CT("android_cap_fps_max")
    public final int capFpsMax;

    @C09CT("android_cap_fps_min")
    public final int capFpsMin;

    @C09CT("res_cap_height")
    public final int capHeight;

    @C09CT("res_cap_width")
    public final int capWidth;

    @C09CT("rtc_video_param_server_define")
    public final Map<String, Integer> codecParam;

    @C09CT("effect_fps")
    public final int effectFps;

    @C09CT("res_effect_height")
    public final int effectHeight;

    @C09CT("res_effect_width")
    public final int effectWidth;

    public RtcParams() {
        this(0, 0, 0, 0, 0, 0, 0, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RtcParams(capWidth=");
        sbLIZ.append(this.capWidth);
        sbLIZ.append(", capHeight=");
        sbLIZ.append(this.capHeight);
        sbLIZ.append(", capFpsMin=");
        sbLIZ.append(this.capFpsMin);
        sbLIZ.append(", capFpsMax=");
        sbLIZ.append(this.capFpsMax);
        sbLIZ.append(", effectWidth=");
        sbLIZ.append(this.effectWidth);
        sbLIZ.append(", effectHeight=");
        sbLIZ.append(this.effectHeight);
        sbLIZ.append(", effectFps=");
        sbLIZ.append(this.effectFps);
        sbLIZ.append(", codecParam=");
        sbLIZ.append(this.codecParam);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RtcParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, Map<String, Integer> map) {
        this.capWidth = i;
        this.capHeight = i2;
        this.capFpsMin = i3;
        this.capFpsMax = i4;
        this.effectWidth = i5;
        this.effectHeight = i6;
        this.effectFps = i7;
        this.codecParam = map;
    }
}
