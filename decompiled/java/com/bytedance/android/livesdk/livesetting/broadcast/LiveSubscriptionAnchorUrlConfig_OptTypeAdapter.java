package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveSubscriptionAnchorUrlConfig_OptTypeAdapter extends TypeAdapter<LiveSubscriptionAnchorUrlConfig> {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.gson.TypeAdapter
    public final LiveSubscriptionAnchorUrlConfig read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig = new LiveSubscriptionAnchorUrlConfig("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (strLJJJJ != null) {
                switch (strLJJJJ.hashCode()) {
                    case -2025012904:
                        if (strLJJJJ.equals("perks_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.multiTierPerksList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1946797250:
                        if (strLJJJJ.equals("smb_lynx_booking_service")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.smbLynxBookingService = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1812985919:
                        if (strLJJJJ.equals("spotlight_intro")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.spotlightIntro = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1738813364:
                        if (strLJJJJ.equals("go_live_education")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.goLiveEducation = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1635521848:
                        if (strLJJJJ.equals("payout_unsupported_notice_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.payoutUnsupportedNoticePopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1597954551:
                        if (strLJJJJ.equals("board_customize_style_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.boardCustomizeStylePopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1382059053:
                        if (strLJJJJ.equals("board_intro")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.boardIntro = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1224287564:
                        if (strLJJJJ.equals("c2c_trans_guide_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.c2cTransGuidePage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1027190443:
                        if (strLJJJJ.equals("multi_tier_list")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.multiTierInSubSetting = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -1000709633:
                        if (strLJJJJ.equals("subonly_music_intro")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.subOnlyMusicIntro = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -915072701:
                        if (strLJJJJ.equals("smb_lynx_dm_ai_service")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.smbLynxDmAiService = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -363624916:
                        if (strLJJJJ.equals("sub_incentive")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.subIncentiveFullPage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -337085013:
                        if (strLJJJJ.equals("spotlight_faq")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.spotlightFaq = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -174247271:
                        if (strLJJJJ.equals("no_live_access")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.noLiveAccess = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case -88900772:
                        if (strLJJJJ.equals("sub_management_home")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.subManagementHome = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 187935751:
                        if (strLJJJJ.equals("custom_price_management")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.customPriceManagement = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 242795694:
                        if (strLJJJJ.equals("smb_lead_form_creation")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.smbLeadFormCreation = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 375957870:
                        if (strLJJJJ.equals("anchor_subscribers_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.anchorSubscriberList = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 539478610:
                        if (strLJJJJ.equals("sub_incentive_halfscreen")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.subIncentiveHalfScreen = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 573387114:
                        if (strLJJJJ.equals("emote_management")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.emoteManagement = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 584553057:
                        if (strLJJJJ.equals("pin_management_page")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.pinManagementPage = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 763766008:
                        if (strLJJJJ.equals("board_template_suggest")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.boardTemplateSuggest = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 841177609:
                        if (strLJJJJ.equals("sub_management_home_popup")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.subManagementHomePopup = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 842839987:
                        if (strLJJJJ.equals("anchor_subscribe_entry")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.anchorSubscribeEntry = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 935211226:
                        if (strLJJJJ.equals("pin_management_intro")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.pinManagementIntro = c09cu.LJJJZ();
                            } else {
                                c09cu.LJJJJJL();
                            }
                        }
                        break;
                    case 1979686495:
                        if (strLJJJJ.equals("badge_management")) {
                            if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                                liveSubscriptionAnchorUrlConfig.badgeManagement = c09cu.LJJJZ();
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
        return liveSubscriptionAnchorUrlConfig;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig) {
        LiveSubscriptionAnchorUrlConfig liveSubscriptionAnchorUrlConfig2 = liveSubscriptionAnchorUrlConfig;
        if (liveSubscriptionAnchorUrlConfig2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("emote_management");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.emoteManagement);
        c09dl.LJIILLIIL("badge_management");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.badgeManagement);
        c09dl.LJIILLIIL("c2c_trans_guide_page");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.c2cTransGuidePage);
        c09dl.LJIILLIIL("payout_unsupported_notice_popup");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.payoutUnsupportedNoticePopup);
        c09dl.LJIILLIIL("anchor_subscribers_popup");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.anchorSubscriberList);
        c09dl.LJIILLIIL("anchor_subscribe_entry");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.anchorSubscribeEntry);
        c09dl.LJIILLIIL("pin_management_page");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.pinManagementPage);
        c09dl.LJIILLIIL("pin_management_intro");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.pinManagementIntro);
        c09dl.LJIILLIIL("custom_price_management");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.customPriceManagement);
        c09dl.LJIILLIIL("spotlight_faq");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.spotlightFaq);
        c09dl.LJIILLIIL("spotlight_intro");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.spotlightIntro);
        c09dl.LJIILLIIL("subonly_music_intro");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.subOnlyMusicIntro);
        c09dl.LJIILLIIL("multi_tier_list");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.multiTierInSubSetting);
        c09dl.LJIILLIIL("perks_list");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.multiTierPerksList);
        c09dl.LJIILLIIL("sub_incentive");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.subIncentiveFullPage);
        c09dl.LJIILLIIL("sub_incentive_halfscreen");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.subIncentiveHalfScreen);
        c09dl.LJIILLIIL("board_intro");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.boardIntro);
        c09dl.LJIILLIIL("board_customize_style_popup");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.boardCustomizeStylePopup);
        c09dl.LJIILLIIL("board_template_suggest");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.boardTemplateSuggest);
        c09dl.LJIILLIIL("sub_management_home");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.subManagementHome);
        c09dl.LJIILLIIL("sub_management_home_popup");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.subManagementHomePopup);
        c09dl.LJIILLIIL("go_live_education");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.goLiveEducation);
        c09dl.LJIILLIIL("no_live_access");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.noLiveAccess);
        c09dl.LJIILLIIL("smb_lynx_booking_service");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.smbLynxBookingService);
        c09dl.LJIILLIIL("smb_lead_form_creation");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.smbLeadFormCreation);
        c09dl.LJIILLIIL("smb_lynx_dm_ai_service");
        c09dl.LJJJJJ(liveSubscriptionAnchorUrlConfig2.smbLynxDmAiService);
        c09dl.LJII();
    }
}
