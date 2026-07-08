package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftPanelBeaconBubble_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model._GiftResource_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_ProtoDecoder implements C0IMD<Gift> {
    public static Gift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift gift = new Gift();
        gift.giftSkins = new ArrayList();
        gift.giftResources = new HashMap();
        gift.giftSkinToGiftTextsInfos = new ArrayList();
        gift.giftTexts = new ArrayList();
        gift.trackerParams = new HashMap();
        gift.colorInfos = new ArrayList();
        gift.giftVerticalScenarios = new ArrayList();
        gift.bizExtra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                if (iLJI != 7) {
                                    if (iLJI != 21) {
                                        if (iLJI != 24) {
                                            if (iLJI != 201) {
                                                if (iLJI != 140) {
                                                    if (iLJI != 141) {
                                                        switch (iLJI) {
                                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                                gift.combo = C1516700pZU.LIZ(c1516680pZS);
                                                                break;
                                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                                gift.type = c1516680pZS.LJIIJ();
                                                                break;
                                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                                gift.diamondCount = c1516680pZS.LJIIJ();
                                                                break;
                                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                                gift.isDisplayedOnPanel = C1516700pZU.LIZ(c1516680pZS);
                                                                break;
                                                            case 14:
                                                                gift.primaryEffectId = c1516680pZS.LJIIJJI();
                                                                break;
                                                            case 15:
                                                                gift.leftLogo = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                break;
                                                            case 16:
                                                                gift.name = C1516700pZU.LIZLLL(c1516680pZS);
                                                                break;
                                                            default:
                                                                switch (iLJI) {
                                                                    case 47:
                                                                        gift.previewImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                        break;
                                                                    case 48:
                                                                        gift.giftPanelBanner = _GiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                        break;
                                                                    case 49:
                                                                        gift.isBroadcastGift = C1516700pZU.LIZ(c1516680pZS);
                                                                        break;
                                                                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                                                        gift.isEffectBEFView = C1516700pZU.LIZ(c1516680pZS);
                                                                        break;
                                                                    case 51:
                                                                        gift.isRandomGift = C1516700pZU.LIZ(c1516680pZS);
                                                                        break;
                                                                    case 52:
                                                                        gift.isBoxGift = C1516700pZU.LIZ(c1516680pZS);
                                                                        break;
                                                                    case 53:
                                                                        gift.canPutInGiftBox = C1516700pZU.LIZ(c1516680pZS);
                                                                        break;
                                                                    case 54:
                                                                        gift.giftBoxInfo = _GiftBoxInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                        break;
                                                                    default:
                                                                        Object objValueOf = null;
                                                                        switch (iLJI) {
                                                                            case 100:
                                                                                long jLIZJ2 = c1516680pZS.LIZJ();
                                                                                String strLIZLLL = null;
                                                                                while (true) {
                                                                                    int iLJI2 = c1516680pZS.LJI();
                                                                                    if (iLJI2 != -1) {
                                                                                        if (iLJI2 != 1) {
                                                                                            if (iLJI2 == 2) {
                                                                                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                            }
                                                                                        } else {
                                                                                            objValueOf = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                        }
                                                                                    } else {
                                                                                        c1516680pZS.LJ(jLIZJ2);
                                                                                        if (objValueOf != null) {
                                                                                            if (strLIZLLL != null) {
                                                                                                gift.trackerParams.put((String) objValueOf, strLIZLLL);
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
                                                                            case 101:
                                                                                gift.giftSubInfo = _GiftLockInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 102:
                                                                                gift.colorInfos.add(_GiftColorInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                break;
                                                                            case 103:
                                                                                gift.recommendInfo = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 104:
                                                                                gift.randomEffectInfo = _GiftRandomEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 105:
                                                                                gift.giftSubType = c1516680pZS.LJIIJ();
                                                                                break;
                                                                            case 106:
                                                                                gift.giftVerticalScenarios.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                                                                                break;
                                                                            case 107:
                                                                                gift.groupInTab = c1516680pZS.LJIIJ();
                                                                                break;
                                                                            case 108:
                                                                                gift.isGalleryGift = C1516700pZU.LIZ(c1516680pZS);
                                                                                break;
                                                                            case 109:
                                                                                gift.giftSponsorInfo = _Gift_GiftSponsorInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 110:
                                                                                gift.giftSkins.add(_Gift_GiftSkin_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                break;
                                                                            case 111:
                                                                                gift.giftLabelType = c1516680pZS.LJIIJ();
                                                                                break;
                                                                            case 112:
                                                                                gift.giftTexts.add(_Gift_GiftText_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                break;
                                                                            case 113:
                                                                                gift.giftSkinToGiftTextsInfos.add(_Gift_GiftSkinToGiftTextsInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                                                                                break;
                                                                            case 114:
                                                                                gift.expirationTimestamp = c1516680pZS.LJIIJJI();
                                                                                break;
                                                                            case 115:
                                                                                gift.batchGiftInfo = _Gift_BatchGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 116:
                                                                                gift.isGlobalGift = C1516700pZU.LIZ(c1516680pZS);
                                                                                break;
                                                                            case 117:
                                                                                gift.disableGalleryBanner = C1516700pZU.LIZ(c1516680pZS);
                                                                                break;
                                                                            case 118:
                                                                                gift.ugGiftInfo = _Gift_UGGiftStructInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 119:
                                                                                gift.crossScreenEffectInfo = _Gift_CrossScreenEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 120:
                                                                                gift.beaconBubble = _GiftPanelBeaconBubble_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 121:
                                                                                long jLIZJ3 = c1516680pZS.LIZJ();
                                                                                GiftResource giftResourceLIZLLL = null;
                                                                                while (true) {
                                                                                    int iLJI3 = c1516680pZS.LJI();
                                                                                    if (iLJI3 != -1) {
                                                                                        if (iLJI3 != 1) {
                                                                                            if (iLJI3 == 2) {
                                                                                                giftResourceLIZLLL = _GiftResource_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                            }
                                                                                        } else {
                                                                                            objValueOf = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                        }
                                                                                    } else {
                                                                                        c1516680pZS.LJ(jLIZJ3);
                                                                                        if (objValueOf != null) {
                                                                                            if (giftResourceLIZLLL != null) {
                                                                                                gift.giftResources.put((String) objValueOf, giftResourceLIZLLL);
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
                                                                            case 122:
                                                                                gift.resourceId = c1516680pZS.LJIIJJI();
                                                                                break;
                                                                            case 123:
                                                                                long jLIZJ4 = c1516680pZS.LIZJ();
                                                                                String strLIZLLL2 = null;
                                                                                while (true) {
                                                                                    int iLJI4 = c1516680pZS.LJI();
                                                                                    if (iLJI4 != -1) {
                                                                                        if (iLJI4 != 1) {
                                                                                            if (iLJI4 == 2) {
                                                                                                strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                            }
                                                                                        } else {
                                                                                            objValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                                                                        }
                                                                                    } else {
                                                                                        c1516680pZS.LJ(jLIZJ4);
                                                                                        if (objValueOf != null) {
                                                                                            if (strLIZLLL2 != null) {
                                                                                                gift.bizExtra.put((Long) objValueOf, strLIZLLL2);
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
                                                                            case 124:
                                                                                gift.lynxCrossScreenEffectInfo = _Gift_LynxCrossScreenEffectInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 125:
                                                                                gift.giftStructHash = C1516700pZU.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 126:
                                                                                gift.schemeInfo = _Gift_SchemeInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 127:
                                                                                gift.seriesInfo = _Gift_GiftSeriesInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            case 128:
                                                                                gift.colorPickerInfo = _Gift_ColorPickerInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                                                break;
                                                                            default:
                                                                                C1516700pZU.LJ(c1516680pZS);
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        gift.giftBottomRightLabelIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                                    }
                                                } else {
                                                    gift.musicInfo = _Gift_MusicGiftInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                                }
                                            } else {
                                                gift.strategyEvent = C1516700pZU.LIZLLL(c1516680pZS);
                                            }
                                        } else {
                                            gift.liveUserPngInfo = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        gift.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    gift.forLinkMic = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                gift.id = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            gift.duration = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        gift.describe = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    gift.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gift;
            }
        }
    }

    public static void LJ(Gift gift) {
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3 = gift.image;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        ImageModel imageModel4 = gift.leftLogo;
        if (imageModel4 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel4);
        }
        ImageModel imageModel5 = gift.icon;
        if (imageModel5 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel5);
        }
        ImageModel imageModel6 = gift.previewImage;
        if (imageModel6 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel6);
        }
        GiftPanelBanner giftPanelBanner = gift.giftPanelBanner;
        if (giftPanelBanner != null) {
            _GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner);
        }
        if (gift.trackerParams == null) {
            gift.trackerParams = new HashMap();
        }
        List<GiftColorInfo> list = gift.colorInfos;
        if (list == null) {
            gift.colorInfos = new ArrayList();
        } else if (!list.isEmpty()) {
            for (GiftColorInfo giftColorInfo : gift.colorInfos) {
                if (giftColorInfo != null) {
                    _GiftColorInfo_ProtoDecoder.LJ(giftColorInfo);
                }
            }
        }
        GiftRandomEffectInfo giftRandomEffectInfo = gift.randomEffectInfo;
        if (giftRandomEffectInfo != null) {
            RandomGiftPanelBanner randomGiftPanelBanner = giftRandomEffectInfo.randomGiftPanelBanner;
            if (randomGiftPanelBanner != null) {
                ImageModel imageModel7 = randomGiftPanelBanner.shadingImage;
                if (imageModel7 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel7);
                }
                ImageModel imageModel8 = randomGiftPanelBanner.leftIcon;
                if (imageModel8 != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel8);
                }
                if (randomGiftPanelBanner.bgColors == null) {
                    randomGiftPanelBanner.bgColors = new ArrayList();
                }
            }
            if (giftRandomEffectInfo.effectIds == null) {
                giftRandomEffectInfo.effectIds = new ArrayList();
            }
            RandomGiftBubble randomGiftBubble = giftRandomEffectInfo.randomGiftBubble;
            if (randomGiftBubble != null && (imageModel2 = randomGiftBubble.image) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        if (gift.giftVerticalScenarios == null) {
            gift.giftVerticalScenarios = new ArrayList();
        }
        List<Gift.GiftSkin> list2 = gift.giftSkins;
        if (list2 == null) {
            gift.giftSkins = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Gift.GiftSkin giftSkin : gift.giftSkins) {
                if (giftSkin != null) {
                    ImageModel imageModel9 = giftSkin.staticImage;
                    if (imageModel9 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel9);
                    }
                    ImageModel imageModel10 = giftSkin.animatedImage;
                    if (imageModel10 != null) {
                        _ImageModel_ProtoDecoder.LJ(imageModel10);
                    }
                }
            }
        }
        List<Gift.GiftText> list3 = gift.giftTexts;
        if (list3 == null) {
            gift.giftTexts = new ArrayList();
        } else if (!list3.isEmpty()) {
            Iterator<Gift.GiftText> it2 = gift.giftTexts.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<Gift.GiftSkinToGiftTextsInfo> list4 = gift.giftSkinToGiftTextsInfos;
        if (list4 == null) {
            gift.giftSkinToGiftTextsInfos = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (Gift.GiftSkinToGiftTextsInfo giftSkinToGiftTextsInfo : gift.giftSkinToGiftTextsInfos) {
                if (giftSkinToGiftTextsInfo != null && giftSkinToGiftTextsInfo.giftTextIds == null) {
                    giftSkinToGiftTextsInfo.giftTextIds = new ArrayList();
                }
            }
        }
        Gift.BatchGiftInfo batchGiftInfo = gift.batchGiftInfo;
        if (batchGiftInfo != null && batchGiftInfo.availableCounts == null) {
            batchGiftInfo.availableCounts = new ArrayList();
        }
        Gift.CrossScreenEffectInfo crossScreenEffectInfo = gift.crossScreenEffectInfo;
        if (crossScreenEffectInfo != null) {
            _Gift_CrossScreenEffectInfo_ProtoDecoder.LJ(crossScreenEffectInfo);
        }
        Map<String, GiftResource> map = gift.giftResources;
        if (map == null) {
            gift.giftResources = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<String, GiftResource>> it3 = gift.giftResources.entrySet().iterator();
            while (it3.hasNext()) {
                GiftResource value = it3.next().getValue();
                if (value != null && (imageModel = value.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        if (gift.bizExtra == null) {
            gift.bizExtra = new HashMap();
        }
        Gift.LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo = gift.lynxCrossScreenEffectInfo;
        if (lynxCrossScreenEffectInfo != null && lynxCrossScreenEffectInfo.effectIds == null) {
            lynxCrossScreenEffectInfo.effectIds = new ArrayList();
        }
        Gift.GiftSeriesInfo giftSeriesInfo = gift.seriesInfo;
        if (giftSeriesInfo != null) {
            if (giftSeriesInfo.giftIds == null) {
                giftSeriesInfo.giftIds = new ArrayList();
            }
            ImageModel imageModel11 = giftSeriesInfo.containerBackground;
            if (imageModel11 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel11);
            }
        }
        Gift.ColorPickerInfo colorPickerInfo = gift.colorPickerInfo;
        if (colorPickerInfo != null) {
            _Gift_ColorPickerInfo_ProtoDecoder.LJ(colorPickerInfo);
        }
        ImageModel imageModel12 = gift.giftBottomRightLabelIcon;
        if (imageModel12 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel12);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift gift) {
        LJ(gift);
    }

    @Override // X.C0IMD
    public final Gift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift gift, List list) {
    }
}
