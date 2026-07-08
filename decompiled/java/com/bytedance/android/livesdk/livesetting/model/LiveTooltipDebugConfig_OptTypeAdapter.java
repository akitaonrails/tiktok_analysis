package com.bytedance.android.livesdk.livesetting.model;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveTooltipDebugConfig_OptTypeAdapter extends TypeAdapter<LiveTooltipDebugConfig> {
    public final Gson LIZ;

    public LiveTooltipDebugConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveTooltipDebugConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveTooltipDebugConfig liveTooltipDebugConfig = new LiveTooltipDebugConfig(false, false, 0, 0, true, true, true);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1302391935:
                        if (strLJJJJ.equals("outdated_version")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setOutdatedVersion(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -993930302:
                        if (strLJJJJ.equals("position_count_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setPositionCheck(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -243538091:
                        if (strLJJJJ.equals("close_all_frequency_control")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setAllClose(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 88856085:
                        if (strLJJJJ.equals("daily_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setDailyLimit(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 389198888:
                        if (strLJJJJ.equals("page_count_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setPageCheck(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1652398823:
                        if (strLJJJJ.equals("bubble_change_color")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setChangeColor(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1796460505:
                        if (strLJJJJ.equals("business_count_check")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveTooltipDebugConfig.setBusinessCheck(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return liveTooltipDebugConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveTooltipDebugConfig liveTooltipDebugConfig) throws IOException {
        LiveTooltipDebugConfig liveTooltipDebugConfig2 = liveTooltipDebugConfig;
        if (liveTooltipDebugConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("bubble_change_color");
        c09dl.LJJJJJL(liveTooltipDebugConfig2.getChangeColor());
        c09dl.LJIILLIIL("close_all_frequency_control");
        c09dl.LJJJJJL(liveTooltipDebugConfig2.getAllClose());
        c09dl.LJIILLIIL("daily_limit");
        c09dl.LJJJJ(Integer.valueOf(liveTooltipDebugConfig2.getDailyLimit()));
        c09dl.LJIILLIIL("outdated_version");
        c09dl.LJJJJ(Integer.valueOf(liveTooltipDebugConfig2.getOutdatedVersion()));
        c09dl.LJIILLIIL("position_count_check");
        c09dl.LJJJJJL(liveTooltipDebugConfig2.getPositionCheck());
        c09dl.LJIILLIIL("page_count_check");
        c09dl.LJJJJJL(liveTooltipDebugConfig2.getPageCheck());
        c09dl.LJIILLIIL("business_count_check");
        c09dl.LJJJJJL(liveTooltipDebugConfig2.getBusinessCheck());
        c09dl.LJII();
    }
}
