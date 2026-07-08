package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_ProtoDecoder implements C0IMD<GiftsInfo> {
    public static GiftsInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo giftsInfo = new GiftsInfo();
        giftsInfo.giftGroupInfos = new ArrayList();
        giftsInfo.comboBar = new HashMap();
        giftsInfo.limitedTimeRewardGiftInfos = new ArrayList();
        giftsInfo.giftComboInfos = new ArrayList();
        giftsInfo.giftIconGuideInfos = new ArrayList();
        giftsInfo.musicGiftMoods = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 10) {
                                    if (iLJI != 11) {
                                        Long lValueOf = null;
                                        switch (iLJI) {
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                giftsInfo.giftComboInfos.add(_GiftComboInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                break;
                                            case 14:
                                                giftsInfo.showFirstRechargeEntrance = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                                break;
                                            case 15:
                                                giftsInfo.enableFirstRechargeDynamicEffect = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                                                break;
                                            case 16:
                                                giftsInfo.firstRechargeGiftInfo = _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                giftsInfo.compensationGiftInfo = _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                giftsInfo.giftIconInfo = _GiftIconInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 19:
                                                giftsInfo.recentlySentColorGiftId = Long.valueOf(c1516680pZS.LJIIJJI());
                                                break;
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                giftsInfo.defaultLocColorGiftId = Long.valueOf(c1516680pZS.LJIIJJI());
                                                break;
                                            case 21:
                                                giftsInfo.colorGiftIconAnimation = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 22:
                                                giftsInfo.recommendRandomGiftId = Long.valueOf(c1516680pZS.LJIIJJI());
                                                break;
                                            case 23:
                                                giftsInfo.giftPollInfo = _GiftPollInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                giftsInfo.riskCtl = _RiskCtl_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 25:
                                                giftsInfo.freqLimitGiftInfo = _FreqLimitGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 26:
                                                giftsInfo.isUniversal = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case 27:
                                                giftsInfo.bannerGiftBoxIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 28:
                                                giftsInfo.isDisplayGiftBox = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case 29:
                                                giftsInfo.giftBoxSchemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 30:
                                                giftsInfo.liveGoalLabelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 31:
                                                giftsInfo.liveGoalBanner = _GiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 32:
                                                giftsInfo.limitedTimeRewardGiftInfos.add(_GiftsInfo_LimitedTimeRewardGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                break;
                                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                giftsInfo.teamRankProgress = _TeamRankProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                giftsInfo.panelGiftGalleryIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 35:
                                                giftsInfo.giftGalleryDetailPageSchemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                giftsInfo.strategyContext = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 37:
                                                giftsInfo.giftChallengeProgress = _GiftChallengeProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 38:
                                                giftsInfo.giftGalleryInfo = _GiftsInfo_GiftGalleryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 39:
                                                giftsInfo.batchGiftInfo = _GiftsInfo_BatchGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 40:
                                                giftsInfo.isVaultEoyBonusEligible = C1516700pZU.LIZ(c1516680pZS);
                                                break;
                                            case 41:
                                                giftsInfo.pointsGiftInfo = _GiftsInfo_UGPointsGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 42:
                                                giftsInfo.levelUpGiftInfo = _GiftsInfo_LevelUpGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 43:
                                                giftsInfo.beaconBubbleInfo = _GiftsInfo_BeaconBubbleInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 44:
                                                giftsInfo.serverStrategyContext = _GiftsInfo_ServerStrategyContext_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 45:
                                                giftsInfo.viewerPicksInfo = _GiftsInfo_ViewerPicksInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 46:
                                                giftsInfo.speedyGiftGreyIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 47:
                                                giftsInfo.speedyGiftDefaultIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 48:
                                                long jLIZJ2 = c1516680pZS.LIZJ();
                                                ComboBar comboBarLIZLLL = null;
                                                while (true) {
                                                    int iLJI2 = c1516680pZS.LJI();
                                                    if (iLJI2 != -1) {
                                                        if (iLJI2 != 1) {
                                                            if (iLJI2 == 2) {
                                                                comboBarLIZLLL = _ComboBar_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            }
                                                        } else {
                                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                                        }
                                                    } else {
                                                        c1516680pZS.LJ(jLIZJ2);
                                                        if (lValueOf != null) {
                                                            if (comboBarLIZLLL != null) {
                                                                giftsInfo.comboBar.put(lValueOf, comboBarLIZLLL);
                                                            } else {
                                                                throw new IllegalStateException("Map value must not be null!");
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Map key must not be null!");
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            case 49:
                                                giftsInfo.giftIconGuideInfos.add(_GiftIconGuideInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                break;
                                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                giftsInfo.giftCampaignProgress = _GiftCampaignProgress_ProtoDecoder.LIZLLL(c1516680pZS);
                                                break;
                                            case 51:
                                                long jLIZJ3 = c1516680pZS.LIZJ();
                                                MusicGiftMood musicGiftMoodLIZLLL = null;
                                                while (true) {
                                                    int iLJI3 = c1516680pZS.LJI();
                                                    if (iLJI3 != -1) {
                                                        if (iLJI3 != 1) {
                                                            if (iLJI3 == 2) {
                                                                musicGiftMoodLIZLLL = _MusicGiftMood_ProtoDecoder.LIZLLL(c1516680pZS);
                                                            }
                                                        } else {
                                                            lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                                        }
                                                    } else {
                                                        c1516680pZS.LJ(jLIZJ3);
                                                        if (lValueOf != null) {
                                                            if (musicGiftMoodLIZLLL != null) {
                                                                giftsInfo.musicGiftMoods.put(lValueOf, musicGiftMoodLIZLLL);
                                                            } else {
                                                                throw new IllegalStateException("Map value must not be null!");
                                                            }
                                                        } else {
                                                            throw new IllegalStateException("Map key must not be null!");
                                                        }
                                                        break;
                                                    }
                                                }
                                                break;
                                            default:
                                                C1516700pZU.LJ(c1516680pZS);
                                                break;
                                        }
                                    } else {
                                        giftsInfo.giftEntranceIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    giftsInfo.hideRecharge = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                giftsInfo.giftGroupInfos.add(_GiftGroupCount_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            giftsInfo.giftWords = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftsInfo.mFastGiftId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftsInfo.newGiftId = Long.valueOf(c1516680pZS.LJIIJJI());
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftsInfo;
            }
        }
    }

    public static void LJ(GiftsInfo giftsInfo) {
        ImageModel imageModel;
        GiftPanelBanner giftPanelBanner;
        ImageModel imageModel2;
        List<GiftGroupCount> list = giftsInfo.giftGroupInfos;
        if (list == null) {
            giftsInfo.giftGroupInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<GiftGroupCount> it2 = giftsInfo.giftGroupInfos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        ImageModel imageModel3 = giftsInfo.giftEntranceIcon;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        List<GiftComboInfo> list2 = giftsInfo.giftComboInfos;
        if (list2 == null) {
            giftsInfo.giftComboInfos = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (GiftComboInfo giftComboInfo : giftsInfo.giftComboInfos) {
                if (giftComboInfo != null && (imageModel = giftComboInfo.comboEffectImg) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        GiftIconInfo giftIconInfo = giftsInfo.giftIconInfo;
        if (giftIconInfo != null) {
            ImageModel imageModel4 = giftIconInfo.mIcon;
            if (imageModel4 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel4);
            }
            ImageModel imageModel5 = giftIconInfo.mEffect;
            if (imageModel5 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel5);
            }
        }
        ImageModel imageModel6 = giftsInfo.colorGiftIconAnimation;
        if (imageModel6 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel6);
        }
        GiftPollInfo giftPollInfo = giftsInfo.giftPollInfo;
        if (giftPollInfo != null) {
            _GiftPollInfo_ProtoDecoder.LJ(giftPollInfo);
        }
        FreqLimitGiftInfo freqLimitGiftInfo = giftsInfo.freqLimitGiftInfo;
        if (freqLimitGiftInfo != null) {
            _FreqLimitGiftInfo_ProtoDecoder.LJ(freqLimitGiftInfo);
        }
        ImageModel imageModel7 = giftsInfo.bannerGiftBoxIcon;
        if (imageModel7 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel7);
        }
        ImageModel imageModel8 = giftsInfo.liveGoalLabelIcon;
        if (imageModel8 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel8);
        }
        GiftPanelBanner giftPanelBanner2 = giftsInfo.liveGoalBanner;
        if (giftPanelBanner2 != null) {
            _GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner2);
        }
        List<GiftsInfo.LimitedTimeRewardGiftInfo> list3 = giftsInfo.limitedTimeRewardGiftInfos;
        if (list3 == null) {
            giftsInfo.limitedTimeRewardGiftInfos = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo : giftsInfo.limitedTimeRewardGiftInfos) {
                if (limitedTimeRewardGiftInfo != null && (giftPanelBanner = limitedTimeRewardGiftInfo.giftPanelBanner) != null) {
                    _GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner);
                }
            }
        }
        TeamRankProgress teamRankProgress = giftsInfo.teamRankProgress;
        if (teamRankProgress != null && teamRankProgress.giftIds == null) {
            teamRankProgress.giftIds = new ArrayList();
        }
        ImageModel imageModel9 = giftsInfo.panelGiftGalleryIcon;
        if (imageModel9 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel9);
        }
        GiftChallengeProgress giftChallengeProgress = giftsInfo.giftChallengeProgress;
        if (giftChallengeProgress != null) {
            _GiftChallengeProgress_ProtoDecoder.LJ(giftChallengeProgress);
        }
        GiftsInfo.BeaconBubbleInfo beaconBubbleInfo = giftsInfo.beaconBubbleInfo;
        if (beaconBubbleInfo != null) {
            ImageModel imageModel10 = beaconBubbleInfo.liveGoalIcon;
            if (imageModel10 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel10);
            }
            ImageModel imageModel11 = beaconBubbleInfo.anchorGalleryIcon;
            if (imageModel11 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel11);
            }
        }
        GiftsInfo.ServerStrategyContext serverStrategyContext = giftsInfo.serverStrategyContext;
        if (serverStrategyContext != null && serverStrategyContext.previousSentGiftIds == null) {
            serverStrategyContext.previousSentGiftIds = new ArrayList();
        }
        ImageModel imageModel12 = giftsInfo.speedyGiftGreyIcon;
        if (imageModel12 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel12);
        }
        ImageModel imageModel13 = giftsInfo.speedyGiftDefaultIcon;
        if (imageModel13 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel13);
        }
        Map<Long, ComboBar> map = giftsInfo.comboBar;
        if (map == null) {
            giftsInfo.comboBar = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, ComboBar>> it3 = giftsInfo.comboBar.entrySet().iterator();
            while (it3.hasNext()) {
                ComboBar value = it3.next().getValue();
                if (value != null && (imageModel2 = value.leftIcon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel2);
                }
            }
        }
        List<GiftIconGuideInfo> list4 = giftsInfo.giftIconGuideInfos;
        if (list4 == null) {
            giftsInfo.giftIconGuideInfos = new ArrayList();
        } else if (!list4.isEmpty()) {
            Iterator<GiftIconGuideInfo> it4 = giftsInfo.giftIconGuideInfos.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
        GiftCampaignProgress giftCampaignProgress = giftsInfo.giftCampaignProgress;
        if (giftCampaignProgress != null) {
            _GiftCampaignProgress_ProtoDecoder.LJ(giftCampaignProgress);
        }
        Map<Long, MusicGiftMood> map2 = giftsInfo.musicGiftMoods;
        if (map2 == null) {
            giftsInfo.musicGiftMoods = new HashMap();
            return;
        }
        if (map2.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, MusicGiftMood>> it5 = giftsInfo.musicGiftMoods.entrySet().iterator();
        while (it5.hasNext()) {
            MusicGiftMood value2 = it5.next().getValue();
            if (value2 != null) {
                ImageModel imageModel14 = value2.icon;
                if (imageModel14 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel14);
                }
                ImageModel imageModel15 = value2.disc;
                if (imageModel15 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel15);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftsInfo giftsInfo) {
        LJ(giftsInfo);
    }

    @Override // X.C0IMD
    public final GiftsInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo giftsInfo, List list) {
    }
}
