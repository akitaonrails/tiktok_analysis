package com.bytedance.android.livesdk.game.broadcast.setting;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MobileHighPingAdjustBitrateConfig_OptTypeAdapter extends TypeAdapter<MobileHighPingAdjustBitrateConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final MobileHighPingAdjustBitrateConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig = new MobileHighPingAdjustBitrateConfig(0, 1, 3, 100, 0.95f, 0.8f, 0.1f);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1667989983:
                        if (strLJJJJ.equals("high_ping_limit_bitrate_allow_range")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setHigh_ping_limit_bitrate_allow_range((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1406099806:
                        if (strLJJJJ.equals("high_ping_adjust_bitrate_scope")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_scope(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -395467072:
                        if (strLJJJJ.equals("high_ping_adjust_bitrate_trigger_continue_high_ping_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_trigger_continue_high_ping_count(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -83347593:
                        if (strLJJJJ.equals("ping_confidence")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setPing_confidence((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1147082852:
                        if (strLJJJJ.equals("ping_value")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setPing_value(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1151645908:
                        if (strLJJJJ.equals("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1360109826:
                        if (strLJJJJ.equals("high_ping_adjust_bitrate_decline_range")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                mobileHighPingAdjustBitrateConfig.setHigh_ping_adjust_bitrate_decline_range((float) c09cu.LJJIL());
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
        return mobileHighPingAdjustBitrateConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig) {
        MobileHighPingAdjustBitrateConfig mobileHighPingAdjustBitrateConfig2 = mobileHighPingAdjustBitrateConfig;
        if (mobileHighPingAdjustBitrateConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("high_ping_adjust_bitrate_scope");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_scope()));
        c09dl.LJIILLIIL("high_ping_adjust_bitrate_trigger_continue_high_ping_count");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_trigger_continue_high_ping_count()));
        c09dl.LJIILLIIL("high_ping_adjust_bitrate_trigger_continue_not_high_ping_count");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_trigger_continue_not_high_ping_count()));
        c09dl.LJIILLIIL("ping_value");
        c09dl.LJJJJ(Integer.valueOf(mobileHighPingAdjustBitrateConfig2.getPing_value()));
        c09dl.LJIILLIIL("ping_confidence");
        c09dl.LJJJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getPing_confidence()));
        c09dl.LJIILLIIL("high_ping_adjust_bitrate_decline_range");
        c09dl.LJJJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_adjust_bitrate_decline_range()));
        c09dl.LJIILLIIL("high_ping_limit_bitrate_allow_range");
        c09dl.LJJJJ(Float.valueOf(mobileHighPingAdjustBitrateConfig2.getHigh_ping_limit_bitrate_allow_range()));
        c09dl.LJII();
    }
}
