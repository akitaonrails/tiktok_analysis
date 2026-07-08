package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LinkmicCountDownForAllConfig_OptTypeAdapter extends TypeAdapter<LinkmicCountDownForAllConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LinkmicCountDownForAllConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkmicCountDownForAllConfig linkmicCountDownForAllConfig = new LinkmicCountDownForAllConfig("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_banner%2Fpages%2Fcountdown-for-all-faq%2Ftemplate.js&height=60%25&use_spark=1", 1, 3, 8, 5, 1, 1, "countdown", "tiktok_live_interaction_normal_4", "count_down_for_all_start.zip", "count_down_for_all_end.zip");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2115335140:
                        if (strLJJJJ.equals("code_tech_switch_for_player_banner_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.codeTechSwitchForPlayerBannerShow = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1321694675:
                        if (strLJJJJ.equals("gecko_channel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.geckoChannel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -799023118:
                        if (strLJJJJ.equals("end_IM_lost_protect_backup_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.endIMLostProtectBackupDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -463583257:
                        if (strLJJJJ.equals("start_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.startAnimation = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -360605530:
                        if (strLJJJJ.equals("FAQ_url")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.faqUrl = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -44829226:
                        if (strLJJJJ.equals("effect_panel")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.effectPanel = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 473093221:
                        if (strLJJJJ.equals("code_tech_switch_for_android")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.codeTechSwitchForAndroid = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1119332403:
                        if (strLJJJJ.equals("rank_sync_IM_lost_protect_state_change_by_IM_backup_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.rankSyncIMLostProtectStateChangeByIMBackupDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1278762507:
                        if (strLJJJJ.equals("start_IM_lost_protect_retry_count")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.startIMLostProtectRetryCount = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1552655130:
                        if (strLJJJJ.equals("rank_sync_IM_lost_protect_state_change_by_client_backup_delay_time")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.rankSyncIMLostProtectStateChangeByClientBackupDelayTime = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2068351264:
                        if (strLJJJJ.equals("end_animation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                linkmicCountDownForAllConfig.endAnimation = c09cu.LJJJZ();
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
        return linkmicCountDownForAllConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkmicCountDownForAllConfig linkmicCountDownForAllConfig) {
        LinkmicCountDownForAllConfig linkmicCountDownForAllConfig2 = linkmicCountDownForAllConfig;
        if (linkmicCountDownForAllConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("FAQ_url");
        c09dl.LJJJJJ(linkmicCountDownForAllConfig2.faqUrl);
        c09dl.LJIILLIIL("start_IM_lost_protect_retry_count");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.startIMLostProtectRetryCount));
        c09dl.LJIILLIIL("end_IM_lost_protect_backup_delay_time");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.endIMLostProtectBackupDelayTime));
        c09dl.LJIILLIIL("rank_sync_IM_lost_protect_state_change_by_IM_backup_delay_time");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.rankSyncIMLostProtectStateChangeByIMBackupDelayTime));
        c09dl.LJIILLIIL("rank_sync_IM_lost_protect_state_change_by_client_backup_delay_time");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.rankSyncIMLostProtectStateChangeByClientBackupDelayTime));
        c09dl.LJIILLIIL("code_tech_switch_for_android");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.codeTechSwitchForAndroid));
        c09dl.LJIILLIIL("code_tech_switch_for_player_banner_show");
        c09dl.LJJJJ(Integer.valueOf(linkmicCountDownForAllConfig2.codeTechSwitchForPlayerBannerShow));
        c09dl.LJIILLIIL("effect_panel");
        c09dl.LJJJJJ(linkmicCountDownForAllConfig2.effectPanel);
        c09dl.LJIILLIIL("gecko_channel");
        c09dl.LJJJJJ(linkmicCountDownForAllConfig2.geckoChannel);
        c09dl.LJIILLIIL("start_animation");
        c09dl.LJJJJJ(linkmicCountDownForAllConfig2.startAnimation);
        c09dl.LJIILLIIL("end_animation");
        c09dl.LJJJJJ(linkmicCountDownForAllConfig2.endAnimation);
        c09dl.LJII();
    }
}
