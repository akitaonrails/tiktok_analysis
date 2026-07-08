package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class MobileHighPingOptimizeConfig_OptTypeAdapter extends TypeAdapter<MobileHighPingOptimizeConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MobileHighPingOptimizeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig = new MobileHighPingOptimizeConfig(15, 5, 100, 0.95f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1704969391:
                        if (strLJJJJ.equals("high_ping_tips_trigger_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingOptimizeConfig.setHigh_ping_tips_trigger_count(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1053092063:
                        if (strLJJJJ.equals("high_ping_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingOptimizeConfig.setHigh_ping_value(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -83347593:
                        if (strLJJJJ.equals("ping_confidence")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingOptimizeConfig.setPing_confidence((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 50880072:
                        if (strLJJJJ.equals("valid_high_ping_reference_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingOptimizeConfig.setValid_high_ping_reference_count(c09cu.LJJIZ());
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
        return mobileHighPingOptimizeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig) {
        MobileHighPingOptimizeConfig mobileHighPingOptimizeConfig2 = mobileHighPingOptimizeConfig;
        if (mobileHighPingOptimizeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("valid_high_ping_reference_count");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getValid_high_ping_reference_count()));
        c09dl.LJIILLIIL("high_ping_tips_trigger_count");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getHigh_ping_tips_trigger_count()));
        c09dl.LJIILLIIL("high_ping_value");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingOptimizeConfig2.getHigh_ping_value()));
        c09dl.LJIILLIIL("ping_confidence");
        c09dl.LJJJJ(Float.valueOf(mobileHighPingOptimizeConfig2.getPing_confidence()));
        c09dl.LJII();
    }
}
