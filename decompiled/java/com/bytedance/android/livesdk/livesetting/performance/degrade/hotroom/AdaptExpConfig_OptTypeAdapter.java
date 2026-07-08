package com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C2097608Jq;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.io.IOException;

/* JADX INFO: loaded from: classes36.dex */
public final class AdaptExpConfig_OptTypeAdapter extends TypeAdapter<AdaptExpConfig> {
    public final Gson LIZ;

    public AdaptExpConfig_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final AdaptExpConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        AdaptExpConfig adaptExpConfig = new AdaptExpConfig(false, false, false, false, false, false, false, false, false, false, 0, false, 2L, false, false, false, 2L, false, false, false, 2000L, false, false, false, false, false, false, Mp4ScreenVideoLoadTimeout.CONTROL, false, 80, 0.6f, false, false, false, false, C2097608Jq.LJ(), false, false);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -1953234787:
                        if (strLJJJJ.equals("adapt_rank_anim_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptRankAnimInterval(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1718540273:
                        if (strLJJJJ.equals("adapt_wish_list_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptWishListDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1595258279:
                        if (strLJJJJ.equals("adapt_voice_wave_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptVoiceWaveDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1126825271:
                        if (strLJJJJ.equals("brightness_downgrade_target")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setBrightnessDowngradeTarget((float) c09cu.LJJIL());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1063673797:
                        if (strLJJJJ.equals("public_screen_refresh_map")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setPublicScreenRefreshMap(C473040Igo.LIZIZ(this.LIZ, c09cu, Float.TYPE));
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -970399786:
                        if (strLJJJJ.equals("adapt_room_sticker")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableRoomSticker(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -953490071:
                        if (strLJJJJ.equals("adapt_public_screen_fading_edge")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnablePublicScreenFadingEdge(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -739415971:
                        if (strLJJJJ.equals("adapt_screen_brightness_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptScreenBrightnessDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -567205827:
                        if (strLJJJJ.equals("adapt_like_anim_audience_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableLikeAnimAudienceDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -105741704:
                        if (strLJJJJ.equals("adapt_like_progress_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableLikeProgressAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -72668144:
                        if (strLJJJJ.equals("adapt_rank_anim_disable")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptRankAnimDisable(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -37934543:
                        if (strLJJJJ.equals("adapt_short_touch_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableShortTouchAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -35328969:
                        if (strLJJJJ.equals("adapt_epi_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptEpiDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 59412714:
                        if (strLJJJJ.equals("adapt_public_screen_emoji_message_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptEmojiMessageDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 334520683:
                        if (strLJJJJ.equals("adapt_public_screen_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnablePublicScreenAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 574339629:
                        if (strLJJJJ.equals("adapt_live_player_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableLivePlayerDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 673257519:
                        if (strLJJJJ.equals("adapt_disable_apm_log")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptDisableApmLog(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 673640963:
                        if (strLJJJJ.equals("adapt_public_screen_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnablePublicScreenRefreshInterval(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 937935982:
                        if (strLJJJJ.equals("adapt_like_anim_anchor_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableLikeAnimAnchorDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 991880304:
                        if (strLJJJJ.equals("adapt_live_survey")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableLiveSurvey(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1019761513:
                        if (strLJJJJ.equals("adapt_public_screen_message_limit")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnablePublicScreenMessageLimit(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1057318924:
                        if (strLJJJJ.equals("adapt_comment_combo_tray_anim")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableCommentComboTrayAnim(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1071439174:
                        if (strLJJJJ.equals("public_screen_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setPublicScreenRefreshInterval(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1073397866:
                        if (strLJJJJ.equals("brightness_downgrade_upper")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setBrightnessDowngradeUpper(c09cu.LJJIZ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1126997820:
                        if (strLJJJJ.equals("adapt_live_gift_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptLiveGiftDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1218221104:
                        if (strLJJJJ.equals("wish_list_downgrade_delay")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setWishListDowngradeDelay(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1250384736:
                        if (strLJJJJ.equals("advanced_message_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdvacedMessageDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1261473921:
                        if (strLJJJJ.equals("like_count_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setLikeCountRefreshInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1266659462:
                        if (strLJJJJ.equals("adapt_public_screen_first_message_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnablePublicScreenFirstMsgInterval(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1279995818:
                        if (strLJJJJ.equals("gift_tray_combo_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setGiftTrayComboDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1349941344:
                        if (strLJJJJ.equals("rank_anim_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setRankAnimInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1380763558:
                        if (strLJJJJ.equals("adapt_banner_expand_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptBannerExpandDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1657634748:
                        if (strLJJJJ.equals("adapt_badge_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptBadgeDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1694441749:
                        if (strLJJJJ.equals("adapt_online_audience_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setEnableOnlineAudienceRefreshInterval(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1714920503:
                        if (strLJJJJ.equals("adapt_disable_alog")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptDisableAlog(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1726433176:
                        if (strLJJJJ.equals("online_audience_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setOnlineAudienceRefreshInterval(c09cu.LJJJ());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1997762085:
                        if (strLJJJJ.equals("adapt_live_match_downgrade")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptLiveMatchDowngrade(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2051800292:
                        if (strLJJJJ.equals("adapt_like_count_refresh_interval")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                adaptExpConfig.setAdaptLikeCountRefreshInterval(((Boolean) this.LIZ.LJIIJ(Boolean.TYPE).read(c09cu)).booleanValue());
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
        return adaptExpConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, AdaptExpConfig adaptExpConfig) throws IOException {
        AdaptExpConfig adaptExpConfig2 = adaptExpConfig;
        if (adaptExpConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("adapt_public_screen_fading_edge");
        c09dl.LJJJJJL(adaptExpConfig2.getEnablePublicScreenFadingEdge());
        c09dl.LJIILLIIL("adapt_public_screen_anim");
        c09dl.LJJJJJL(adaptExpConfig2.getEnablePublicScreenAnim());
        c09dl.LJIILLIIL("adapt_public_screen_refresh_interval");
        c09dl.LJJJJJL(adaptExpConfig2.getEnablePublicScreenRefreshInterval());
        c09dl.LJIILLIIL("adapt_public_screen_first_message_interval");
        c09dl.LJJJJJL(adaptExpConfig2.getEnablePublicScreenFirstMsgInterval());
        c09dl.LJIILLIIL("adapt_public_screen_message_limit");
        c09dl.LJJJJJL(adaptExpConfig2.getEnablePublicScreenMessageLimit());
        c09dl.LJIILLIIL("adapt_short_touch_anim");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableShortTouchAnim());
        c09dl.LJIILLIIL("adapt_comment_combo_tray_anim");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableCommentComboTrayAnim());
        c09dl.LJIILLIIL("adapt_like_progress_anim");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableLikeProgressAnim());
        c09dl.LJIILLIIL("adapt_live_survey");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableLiveSurvey());
        c09dl.LJIILLIIL("adapt_room_sticker");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableRoomSticker());
        c09dl.LJIILLIIL("public_screen_refresh_interval");
        c09dl.LJJJJ(Integer.valueOf(adaptExpConfig2.getPublicScreenRefreshInterval()));
        c09dl.LJIILLIIL("adapt_online_audience_refresh_interval");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableOnlineAudienceRefreshInterval());
        c09dl.LJIILLIIL("online_audience_refresh_interval");
        c09dl.LJJIZ(adaptExpConfig2.getOnlineAudienceRefreshInterval());
        c09dl.LJIILLIIL("adapt_disable_alog");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptDisableAlog());
        c09dl.LJIILLIIL("adapt_disable_apm_log");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptDisableApmLog());
        c09dl.LJIILLIIL("adapt_like_count_refresh_interval");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptLikeCountRefreshInterval());
        c09dl.LJIILLIIL("like_count_refresh_interval");
        c09dl.LJJIZ(adaptExpConfig2.getLikeCountRefreshInterval());
        c09dl.LJIILLIIL("adapt_live_gift_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptLiveGiftDowngrade());
        c09dl.LJIILLIIL("adapt_live_match_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptLiveMatchDowngrade());
        c09dl.LJIILLIIL("adapt_rank_anim_interval");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptRankAnimInterval());
        c09dl.LJIILLIIL("rank_anim_interval");
        c09dl.LJJIZ(adaptExpConfig2.getRankAnimInterval());
        c09dl.LJIILLIIL("adapt_rank_anim_disable");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptRankAnimDisable());
        c09dl.LJIILLIIL("adapt_like_anim_audience_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableLikeAnimAudienceDowngrade());
        c09dl.LJIILLIIL("adapt_like_anim_anchor_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableLikeAnimAnchorDowngrade());
        c09dl.LJIILLIIL("adapt_live_player_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getEnableLivePlayerDowngrade());
        c09dl.LJIILLIIL("adapt_banner_expand_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptBannerExpandDowngrade());
        c09dl.LJIILLIIL("adapt_wish_list_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptWishListDowngrade());
        c09dl.LJIILLIIL("wish_list_downgrade_delay");
        c09dl.LJJIZ(adaptExpConfig2.getWishListDowngradeDelay());
        c09dl.LJIILLIIL("adapt_screen_brightness_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptScreenBrightnessDowngrade());
        c09dl.LJIILLIIL("brightness_downgrade_upper");
        c09dl.LJJJJ(Integer.valueOf(adaptExpConfig2.getBrightnessDowngradeUpper()));
        c09dl.LJIILLIIL("brightness_downgrade_target");
        c09dl.LJJJJ(Float.valueOf(adaptExpConfig2.getBrightnessDowngradeTarget()));
        c09dl.LJIILLIIL("adapt_voice_wave_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptVoiceWaveDowngrade());
        c09dl.LJIILLIIL("adapt_badge_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptBadgeDowngrade());
        c09dl.LJIILLIIL("adapt_public_screen_emoji_message_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptEmojiMessageDowngrade());
        c09dl.LJIILLIIL("adapt_epi_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdaptEpiDowngrade());
        c09dl.LJIILLIIL("public_screen_refresh_map");
        C473040Igo.LJ(this.LIZ, c09dl, adaptExpConfig2.getPublicScreenRefreshMap(), Float.TYPE);
        c09dl.LJIILLIIL("gift_tray_combo_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getGiftTrayComboDowngrade());
        c09dl.LJIILLIIL("advanced_message_downgrade");
        c09dl.LJJJJJL(adaptExpConfig2.getAdvacedMessageDowngrade());
        c09dl.LJII();
    }
}
