package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageSyncSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter extends TypeAdapter<LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig> {
    public final Gson LIZ;

    public LivePublicScreenMessageSyncSetting_LivePublicScreenMessageSyncConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig = new LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig(false, 10000L, 10000L, Mp4ScreenVideoLoadTimeout.CONTROL, 0L, true, 1770L, 10000L);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -745811204:
                        if (strLJJJJ.equals("sei_enable_host")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.seiEnableHost = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -668033792:
                        if (strLJJJJ.equals("sei_max_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.seiMaxDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -585170883:
                        if (strLJJJJ.equals("c2c_delay_max")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.c2cDelayMax = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -489424012:
                        if (strLJJJJ.equals("sei_frequency")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.seiFrequency = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 173959606:
                        if (strLJJJJ.equals("final_gap_max_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.finalGapMaxDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 727590507:
                        if (strLJJJJ.equals("sei_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.seiEnable = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1959516945:
                        if (strLJJJJ.equals("sei_offset_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.seiOffsetTime = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2111878593:
                        if (strLJJJJ.equals("host_c2c_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                livePublicScreenMessageSyncConfig.hostC2CDelay = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                }
            }
            c09cu.LJJZ();
        }
        c09cu.LJII();
        return livePublicScreenMessageSyncConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig) throws IOException {
        LivePublicScreenMessageSyncSetting.LivePublicScreenMessageSyncConfig livePublicScreenMessageSyncConfig2 = livePublicScreenMessageSyncConfig;
        if (livePublicScreenMessageSyncConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("sei_enable");
        c09dl.LJJJJJL(livePublicScreenMessageSyncConfig2.seiEnable);
        c09dl.LJIILLIIL("sei_max_delay");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.seiMaxDelay);
        c09dl.LJIILLIIL("final_gap_max_delay");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.finalGapMaxDelay);
        c09dl.LJIILLIIL("sei_frequency");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.seiFrequency);
        c09dl.LJIILLIIL("sei_offset_time");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.seiOffsetTime);
        c09dl.LJIILLIIL("sei_enable_host");
        c09dl.LJJJJJL(livePublicScreenMessageSyncConfig2.seiEnableHost);
        c09dl.LJIILLIIL("host_c2c_delay");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.hostC2CDelay);
        c09dl.LJIILLIIL("c2c_delay_max");
        c09dl.LJJIZ(livePublicScreenMessageSyncConfig2.c2cDelayMax);
        c09dl.LJII();
    }
}
