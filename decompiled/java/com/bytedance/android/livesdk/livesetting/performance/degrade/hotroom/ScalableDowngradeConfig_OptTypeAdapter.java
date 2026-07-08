package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public final class ScalableDowngradeConfig_OptTypeAdapter extends TypeAdapter<ScalableDowngradeConfig> {
    public final Gson LIZ;

    public ScalableDowngradeConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final ScalableDowngradeConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        ScalableDowngradeConfig scalableDowngradeConfig = new ScalableDowngradeConfig(false, 0, false, false, false, 2000, false, false, false, false, false, false, 0L, 0L, false, false, 2L, 43, 21, 30, 10, 10, 60000L, true, 1, false, new ProgressiveDowngradeConfig(40.0f, 60.0f));
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2067636382:
                        if (strLJJJJ.equals("disable_gift_tray_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableGiftTrayAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2020613101:
                        if (strLJJJJ.equals("disable_self_like")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableSelfLike(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1988694741:
                        if (strLJJJJ.equals("downgradeByScoreInterval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDowngradeByScoreInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1804615242:
                        if (strLJJJJ.equals("level_serious_fps_start")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setLevelSeriousFpsStart(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1613626395:
                        if (strLJJJJ.equals("disable_public_screen_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisablePublicScreenAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1574465176:
                        if (strLJJJJ.equals("progressive_upgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setProgressiveUpgrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1416391533:
                        if (strLJJJJ.equals("level_serious_fps")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setLevelSeriousFps(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1291630147:
                        if (strLJJJJ.equals("upgrade_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setUpgradeIntervalMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1216843956:
                        if (strLJJJJ.equals("disable_apm_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableApmLog(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1196722697:
                        if (strLJJJJ.equals("disable_public_screen_avatar_preload")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisablePublicAvatarPreload(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -986455494:
                        if (strLJJJJ.equals("disable_alog")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableAlog(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -919174314:
                        if (strLJJJJ.equals("down_refer_type")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDownReferType(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -672281809:
                        if (strLJJJJ.equals("level_serious_fps_end")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setLevelSeriousFpsEnd(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -502888514:
                        if (strLJJJJ.equals("msg_qps_heavy")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setMsgQpsHeavy(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -458670363:
                        if (strLJJJJ.equals("user_info_like_count_update_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setUserInfoLikeCountUpdateIntervalMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -294682637:
                        if (strLJJJJ.equals("disable_other_like_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableOtherLikeAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -109284052:
                        if (strLJJJJ.equals("is_enabled")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setEnabled(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 538617107:
                        if (strLJJJJ.equals("rank_entry_anim_loop_interval_ms")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setRankEntryAnimLoopIntervalMs(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 551154991:
                        if (strLJJJJ.equals("disable_gift_notify_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableGiftNotifyAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1071439174:
                        if (strLJJJJ.equals("public_screen_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setPublicScreenRefreshInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1222493283:
                        if (strLJJJJ.equals("disable_banner")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisableBanner(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1272866223:
                        if (strLJJJJ.equals("disable_public_screen_fading_edge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setDisablePublicScreenFadingEdge(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1514970963:
                        if (strLJJJJ.equals("public_screen_anim_recover")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setPublicScreenAnimRecover(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1726433176:
                        if (strLJJJJ.equals("online_audience_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setOnlineAudienceRefreshInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1908780162:
                        if (strLJJJJ.equals("hot_temperature")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setHotTemperature(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2024689792:
                        if (strLJJJJ.equals("progressive_downgrade_config")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setProgressiveDowngradeConfig((ProgressiveDowngradeConfig) this.LIZ.LJIIJ(ProgressiveDowngradeConfig.class).read(c09cu));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2080633537:
                        if (strLJJJJ.equals("progressive_downgrade_enable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                scalableDowngradeConfig.setProgressiveDowngradeEnable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return scalableDowngradeConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, ScalableDowngradeConfig scalableDowngradeConfig) throws IOException {
        ScalableDowngradeConfig scalableDowngradeConfig2 = scalableDowngradeConfig;
        if (scalableDowngradeConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("is_enabled");
        c09dl.LJJJJJL(scalableDowngradeConfig2.isEnabled());
        c09dl.LJIILLIIL("down_refer_type");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getDownReferType()));
        c09dl.LJIILLIIL("disable_public_screen_anim");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisablePublicScreenAnim());
        c09dl.LJIILLIIL("disable_public_screen_fading_edge");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisablePublicScreenFadingEdge());
        c09dl.LJIILLIIL("public_screen_anim_recover");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getPublicScreenAnimRecover());
        c09dl.LJIILLIIL("public_screen_refresh_interval");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getPublicScreenRefreshInterval()));
        c09dl.LJIILLIIL("disable_public_screen_avatar_preload");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisablePublicAvatarPreload());
        c09dl.LJIILLIIL("disable_other_like_anim");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableOtherLikeAnim());
        c09dl.LJIILLIIL("disable_banner");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableBanner());
        c09dl.LJIILLIIL("disable_alog");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableAlog());
        c09dl.LJIILLIIL("disable_apm_log");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableApmLog());
        c09dl.LJIILLIIL("disable_self_like");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableSelfLike());
        c09dl.LJIILLIIL("rank_entry_anim_loop_interval_ms");
        c09dl.LJJIZ(scalableDowngradeConfig2.getRankEntryAnimLoopIntervalMs());
        c09dl.LJIILLIIL("user_info_like_count_update_interval_ms");
        c09dl.LJJIZ(scalableDowngradeConfig2.getUserInfoLikeCountUpdateIntervalMs());
        c09dl.LJIILLIIL("disable_gift_tray_anim");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableGiftTrayAnim());
        c09dl.LJIILLIIL("disable_gift_notify_anim");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getDisableGiftNotifyAnim());
        c09dl.LJIILLIIL("online_audience_refresh_interval");
        c09dl.LJJIZ(scalableDowngradeConfig2.getOnlineAudienceRefreshInterval());
        c09dl.LJIILLIIL("hot_temperature");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getHotTemperature()));
        c09dl.LJIILLIIL("level_serious_fps_start");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFpsStart()));
        c09dl.LJIILLIIL("level_serious_fps_end");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFpsEnd()));
        c09dl.LJIILLIIL("level_serious_fps");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getLevelSeriousFps()));
        c09dl.LJIILLIIL("msg_qps_heavy");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getMsgQpsHeavy()));
        c09dl.LJIILLIIL("upgrade_interval_ms");
        c09dl.LJJIZ(scalableDowngradeConfig2.getUpgradeIntervalMs());
        c09dl.LJIILLIIL("progressive_upgrade");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getProgressiveUpgrade());
        c09dl.LJIILLIIL("downgradeByScoreInterval");
        c09dl.LJJJJ(Integer.valueOf(scalableDowngradeConfig2.getDowngradeByScoreInterval()));
        c09dl.LJIILLIIL("progressive_downgrade_enable");
        c09dl.LJJJJJL(scalableDowngradeConfig2.getProgressiveDowngradeEnable());
        c09dl.LJIILLIIL("progressive_downgrade_config");
        this.LIZ.LJIIJ(ProgressiveDowngradeConfig.class).write(c09dl, scalableDowngradeConfig2.getProgressiveDowngradeConfig());
        c09dl.LJII();
    }
}
