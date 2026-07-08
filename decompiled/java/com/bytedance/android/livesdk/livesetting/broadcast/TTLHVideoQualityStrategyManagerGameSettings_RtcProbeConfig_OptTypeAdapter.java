package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.broadcast.TTLHVideoQualityStrategyManagerGameSettings;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TTLHVideoQualityStrategyManagerGameSettings_RtcProbeConfig_OptTypeAdapter extends TypeAdapter<TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig> {
    @Override // com.google.gson.TypeAdapter
    public final TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig rtcProbeConfig = new TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "enable_rtc_probe")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rtcProbeConfig.setEnableRtcProbe(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "enable_lyrax_prober")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    rtcProbeConfig.setEnableAnchorNetLyraxProbe(c09cu.LJJIZ());
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return rtcProbeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig rtcProbeConfig) {
        TTLHVideoQualityStrategyManagerGameSettings.RtcProbeConfig rtcProbeConfig2 = rtcProbeConfig;
        if (rtcProbeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_rtc_probe");
        c09dl.LJJJJ(Integer.valueOf(rtcProbeConfig2.getEnableRtcProbe()));
        c09dl.LJIILLIIL("enable_lyrax_prober");
        c09dl.LJJJJ(Integer.valueOf(rtcProbeConfig2.getEnableAnchorNetLyraxProbe()));
        c09dl.LJII();
    }
}
