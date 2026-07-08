package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes16.dex */
public final class StateConfig_OptTypeAdapter extends TypeAdapter<StateConfig> {
    public final Gson LIZ;

    public StateConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final StateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        StateConfig stateConfig = new StateConfig(15, false, true, true, 1, 60);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1096925525:
                        if (strLJJJJ.equals("state_sync_rtc")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setSyncWithRTC(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 157161169:
                        if (strLJJJJ.equals("state_stat_report")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setEnableStat(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 587372633:
                        if (strLJJJJ.equals("state_check_duration")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setCheckDuration(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 786409929:
                        if (strLJJJJ.equals("state_filter_by_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setFilterStateType(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1070646701:
                        if (strLJJJJ.equals("state_compare_recheck")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setDoubleCheck(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1397825679:
                        if (strLJJJJ.equals("state_im_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                stateConfig.setImConfig(c09cu.LJJIZ());
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
        return stateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, StateConfig stateConfig) throws IOException {
        StateConfig stateConfig2 = stateConfig;
        if (stateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("state_im_config");
        c09dl.LJJJJ(Integer.valueOf(stateConfig2.getImConfig()));
        c09dl.LJIILLIIL("state_stat_report");
        c09dl.LJJJJJL(stateConfig2.getEnableStat());
        c09dl.LJIILLIIL("state_sync_rtc");
        c09dl.LJJJJJL(stateConfig2.getSyncWithRTC());
        c09dl.LJIILLIIL("state_filter_by_type");
        c09dl.LJJJJJL(stateConfig2.getFilterStateType());
        c09dl.LJIILLIIL("state_compare_recheck");
        c09dl.LJJJJ(Integer.valueOf(stateConfig2.getDoubleCheck()));
        c09dl.LJIILLIIL("state_check_duration");
        c09dl.LJJJJ(Integer.valueOf(stateConfig2.getCheckDuration()));
        c09dl.LJII();
    }
}
