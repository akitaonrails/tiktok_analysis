package com.bytedance.android.livesdk.frequency.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.frequency.setting.LiveNotifyMessageFrequencySetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveNotifyMessageFrequencySetting_LiveNotifyMessageFrequencyConfig_OptTypeAdapter extends TypeAdapter<LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig> {
    public final Gson LIZ;

    public LiveNotifyMessageFrequencySetting_LiveNotifyMessageFrequencyConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig liveNotifyMessageFrequencyConfig = new LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig(Boolean.FALSE, 30000L, 0L, 10, 5000, 2, false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2053934205:
                        if (strLJJJJ.equals("min_report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.reportMinIntervalMs = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1923001892:
                        if (strLJJJJ.equals("report_cache_max")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.reportInfoMaxLength = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1298848381:
                        if (strLJJJJ.equals("enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.enable = (Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu);
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1104942223:
                        if (strLJJJJ.equals("enable_capsule")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.enableCapsule = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -576436362:
                        if (strLJJJJ.equals("report_interval_random_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.reportIntervalRandomDelayMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -166503568:
                        if (strLJJJJ.equals("report_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.reportIntervalMs = c09cu.LJJJ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 780314379:
                        if (strLJJJJ.equals("report_max_fail_times")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.reportMaxFailTimes = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 785048264:
                        if (strLJJJJ.equals("enable_bubble")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveNotifyMessageFrequencyConfig.enableBubble = ((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue();
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
        return liveNotifyMessageFrequencyConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig liveNotifyMessageFrequencyConfig) throws IOException {
        LiveNotifyMessageFrequencySetting.LiveNotifyMessageFrequencyConfig liveNotifyMessageFrequencyConfig2 = liveNotifyMessageFrequencyConfig;
        if (liveNotifyMessageFrequencyConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable");
        c09dl.LJJJ(liveNotifyMessageFrequencyConfig2.enable);
        c09dl.LJIILLIIL("report_interval");
        c09dl.LJJIZ(liveNotifyMessageFrequencyConfig2.reportIntervalMs);
        c09dl.LJIILLIIL("report_interval_random_delay");
        c09dl.LJJIZ(liveNotifyMessageFrequencyConfig2.reportIntervalRandomDelayMs);
        c09dl.LJIILLIIL("report_cache_max");
        c09dl.LJJJJ(Integer.valueOf(liveNotifyMessageFrequencyConfig2.reportInfoMaxLength));
        c09dl.LJIILLIIL("min_report_interval");
        c09dl.LJJJJ(Integer.valueOf(liveNotifyMessageFrequencyConfig2.reportMinIntervalMs));
        c09dl.LJIILLIIL("report_max_fail_times");
        c09dl.LJJJJ(Integer.valueOf(liveNotifyMessageFrequencyConfig2.reportMaxFailTimes));
        c09dl.LJIILLIIL("enable_bubble");
        c09dl.LJJJJJL(liveNotifyMessageFrequencyConfig2.enableBubble);
        c09dl.LJIILLIIL("enable_capsule");
        c09dl.LJJJJJL(liveNotifyMessageFrequencyConfig2.enableCapsule);
        c09dl.LJII();
    }
}
