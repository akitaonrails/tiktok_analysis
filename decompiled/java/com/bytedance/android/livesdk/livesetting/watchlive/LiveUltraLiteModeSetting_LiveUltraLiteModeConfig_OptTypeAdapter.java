package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveUltraLiteModeSetting;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveUltraLiteModeSetting_LiveUltraLiteModeConfig_OptTypeAdapter extends TypeAdapter<LiveUltraLiteModeSetting.LiveUltraLiteModeConfig> {
    public final Gson LIZ;

    public LiveUltraLiteModeSetting_LiveUltraLiteModeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveUltraLiteModeSetting.LiveUltraLiteModeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveUltraLiteModeSetting.LiveUltraLiteModeConfig liveUltraLiteModeConfig = new LiveUltraLiteModeSetting.LiveUltraLiteModeConfig(false, 60L, 2, 60L, 2, false, 1, "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1957286624:
                        if (strLJJJJ.equals("learn_more_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setLearnMoreUrl(c09cu.LJJJZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -640734589:
                        if (strLJJJJ.equals("enable_listeners")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -521725843:
                        if (strLJJJJ.equals("auto_toast_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setAutoToastInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 57474663:
                        if (strLJJJJ.equals("auto_toast_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setAutoToastCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 321705856:
                        if (strLJJJJ.equals("guide_toast_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setGuideToastInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1190401031:
                        if (strLJJJJ.equals("enable_setting_entry")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setEnableSettingEntry(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1910951988:
                        if (strLJJJJ.equals("guide_toast_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setGuideToastCount(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2138881734:
                        if (strLJJJJ.equals("default_auto_switch")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveUltraLiteModeConfig.setDefaultAutoSwitch(c09cu.LJJIZ());
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
        return liveUltraLiteModeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveUltraLiteModeSetting.LiveUltraLiteModeConfig liveUltraLiteModeConfig) throws IOException {
        LiveUltraLiteModeSetting.LiveUltraLiteModeConfig liveUltraLiteModeConfig2 = liveUltraLiteModeConfig;
        if (liveUltraLiteModeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("enable_setting_entry");
        c09dl.LJJJJJL(liveUltraLiteModeConfig2.getEnableSettingEntry());
        c09dl.LJIILLIIL("guide_toast_interval");
        c09dl.LJJIZ(liveUltraLiteModeConfig2.getGuideToastInterval());
        c09dl.LJIILLIIL("guide_toast_count");
        c09dl.LJJJJ(Integer.valueOf(liveUltraLiteModeConfig2.getGuideToastCount()));
        c09dl.LJIILLIIL("auto_toast_interval");
        c09dl.LJJIZ(liveUltraLiteModeConfig2.getAutoToastInterval());
        c09dl.LJIILLIIL("auto_toast_count");
        c09dl.LJJJJ(Integer.valueOf(liveUltraLiteModeConfig2.getAutoToastCount()));
        c09dl.LJIILLIIL("enable_listeners");
        c09dl.LJJJJJL(liveUltraLiteModeConfig2.getEnable());
        c09dl.LJIILLIIL("default_auto_switch");
        c09dl.LJJJJ(Integer.valueOf(liveUltraLiteModeConfig2.getDefaultAutoSwitch()));
        c09dl.LJIILLIIL("learn_more_url");
        c09dl.LJJJJJ(liveUltraLiteModeConfig2.getLearnMoreUrl());
        c09dl.LJII();
    }
}
