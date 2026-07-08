package com.bytedance.android.livesdk.livesetting.performance;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveFluencySupportSample_OptTypeAdapter extends TypeAdapter<LiveFluencySupportSample> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveFluencySupportSample read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveFluencySupportSample liveFluencySupportSample = new LiveFluencySupportSample(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 1, 10, 10, 10, 10, 10, 10, 10, 10, 1, 1);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2129721603:
                        if (strLJJJJ.equals("panel_gift_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelGiftSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -2016472982:
                        if (strLJJJJ.equals("board_metrics")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.boardMetrics = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1996340539:
                        if (strLJJJJ.equals("panel_broadcast_link_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelBroadcastLinkSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1826626983:
                        if (strLJJJJ.equals("panel_public_screen_auto_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelPublicScreenAutoSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1805143779:
                        if (strLJJJJ.equals("panel_comment_close")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelCommentClose = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1621579789:
                        if (strLJJJJ.equals("top_live_hangout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.topLiveHangout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1614317775:
                        if (strLJJJJ.equals("watch_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.watchPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1450071910:
                        if (strLJJJJ.equals("anchor_panel_gift_slide_compose")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.anchorPanelGiftSlideCompose = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1352547195:
                        if (strLJJJJ.equals("pk_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.pkPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1323763471:
                        if (strLJJJJ.equals("drawer")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.drawerOpenPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1172181026:
                        if (strLJJJJ.equals("panel_effect_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelEffectSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -840534151:
                        if (strLJJJJ.equals("panel_public_screen_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelPublicScreenSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -641727696:
                        if (strLJJJJ.equals("rank_show")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.rankShow = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -450928897:
                        if (strLJJJJ.equals("broadcast_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.broadcastPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -334964091:
                        if (strLJJJJ.equals("panel_comment_open")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelCommentOpen = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -200073325:
                        if (strLJJJJ.equals("watch_period_all")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.watchPeriodAll = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -103392873:
                        if (strLJJJJ.equals("panel_multi_guest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelMultiGuest = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 152487751:
                        if (strLJJJJ.equals("anchor_panel_gift_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.anchorPanelGiftSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 195105009:
                        if (strLJJJJ.equals("panel_hourly_rank_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelHourlyRankSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 240912188:
                        if (strLJJJJ.equals("panel_comment_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelCommentPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 318783000:
                        if (strLJJJJ.equals("preview_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.previewPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 481117549:
                        if (strLJJJJ.equals("link_mic_role_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.linkMicRolePeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 511107508:
                        if (strLJJJJ.equals("panel_recharge_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelRechargeSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 570497251:
                        if (strLJJJJ.equals("gift_play")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.giftPlay = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 651550345:
                        if (strLJJJJ.equals("panel_extended_public_screen_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelExtendedPublicScreenSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 693131169:
                        if (strLJJJJ.equals("preview_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.previewEnter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 693543095:
                        if (strLJJJJ.equals("multi_guest_layout")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.multiGuestLayout = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 778308916:
                        if (strLJJJJ.equals("panel_sticker_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelStickerSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1184962408:
                        if (strLJJJJ.equals("watch_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.watchEnter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1197821505:
                        if (strLJJJJ.equals("watch_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.watchSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1345501317:
                        if (strLJJJJ.equals("panel_filter_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelFilterSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1443259721:
                        if (strLJJJJ.equals("panel_extended_public_screen_auto_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelExtendedPublicScreenAutoSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1494082344:
                        if (strLJJJJ.equals("broadcast_link_period")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.broadcastLinkPeriod = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1588032819:
                        if (strLJJJJ.equals("panel_search_sticker_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelSearchStickerSlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1776680410:
                        if (strLJJJJ.equals("broadcast_enter")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.broadcastEnter = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2021027937:
                        if (strLJJJJ.equals("broadcast_period_all")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.broadcastPeriodAll = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2071145097:
                        if (strLJJJJ.equals("panel_beauty_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelBeautySlide = c09cu.LJJIZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 2092999878:
                        if (strLJJJJ.equals("panel_sound_slide")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveFluencySupportSample.panelSoundSlide = c09cu.LJJIZ();
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
        return liveFluencySupportSample;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveFluencySupportSample liveFluencySupportSample) {
        LiveFluencySupportSample liveFluencySupportSample2 = liveFluencySupportSample;
        if (liveFluencySupportSample2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("watch_enter");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.watchEnter));
        c09dl.LJIILLIIL("watch_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.watchSlide));
        c09dl.LJIILLIIL("watch_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.watchPeriod));
        c09dl.LJIILLIIL("watch_period_all");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.watchPeriodAll));
        c09dl.LJIILLIIL("broadcast_enter");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.broadcastEnter));
        c09dl.LJIILLIIL("broadcast_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.broadcastPeriod));
        c09dl.LJIILLIIL("broadcast_period_all");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.broadcastPeriodAll));
        c09dl.LJIILLIIL("preview_enter");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.previewEnter));
        c09dl.LJIILLIIL("preview_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.previewPeriod));
        c09dl.LJIILLIIL("broadcast_link_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.broadcastLinkPeriod));
        c09dl.LJIILLIIL("pk_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.pkPeriod));
        c09dl.LJIILLIIL("gift_play");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.giftPlay));
        c09dl.LJIILLIIL("panel_gift_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelGiftSlide));
        c09dl.LJIILLIIL("anchor_panel_gift_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.anchorPanelGiftSlide));
        c09dl.LJIILLIIL("anchor_panel_gift_slide_compose");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.anchorPanelGiftSlideCompose));
        c09dl.LJIILLIIL("panel_recharge_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelRechargeSlide));
        c09dl.LJIILLIIL("panel_hourly_rank_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelHourlyRankSlide));
        c09dl.LJIILLIIL("panel_broadcast_link_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelBroadcastLinkSlide));
        c09dl.LJIILLIIL("panel_public_screen_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelPublicScreenSlide));
        c09dl.LJIILLIIL("panel_public_screen_auto_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelPublicScreenAutoSlide));
        c09dl.LJIILLIIL("panel_extended_public_screen_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelExtendedPublicScreenSlide));
        c09dl.LJIILLIIL("panel_extended_public_screen_auto_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelExtendedPublicScreenAutoSlide));
        c09dl.LJIILLIIL("panel_beauty_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelBeautySlide));
        c09dl.LJIILLIIL("panel_filter_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelFilterSlide));
        c09dl.LJIILLIIL("panel_sticker_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelStickerSlide));
        c09dl.LJIILLIIL("panel_sound_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelSoundSlide));
        c09dl.LJIILLIIL("panel_multi_guest");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelMultiGuest));
        c09dl.LJIILLIIL("top_live_hangout");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.topLiveHangout));
        c09dl.LJIILLIIL("link_mic_role_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.linkMicRolePeriod));
        c09dl.LJIILLIIL("rank_show");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.rankShow));
        c09dl.LJIILLIIL("panel_effect_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelEffectSlide));
        c09dl.LJIILLIIL("panel_search_sticker_slide");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelSearchStickerSlide));
        c09dl.LJIILLIIL("drawer");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.drawerOpenPeriod));
        c09dl.LJIILLIIL("panel_comment_open");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelCommentOpen));
        c09dl.LJIILLIIL("panel_comment_period");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelCommentPeriod));
        c09dl.LJIILLIIL("panel_comment_close");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.panelCommentClose));
        c09dl.LJIILLIIL("multi_guest_layout");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.multiGuestLayout));
        c09dl.LJIILLIIL("board_metrics");
        c09dl.LJJJJ(Integer.valueOf(liveFluencySupportSample2.boardMetrics));
        c09dl.LJII();
    }
}
