package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftListResult_ProtoDecoder implements C0IMD<GiftListResult> {
    @Override // X.C0IMD
    public final void LIZ(GiftListResult giftListResult) {
        ImageModel imageModel;
        Text text;
        GiftListResult giftListResult2 = giftListResult;
        GiftsInfo giftsInfo = giftListResult2.giftsInfo;
        if (giftsInfo != null) {
            _GiftsInfo_ProtoDecoder.LJ(giftsInfo);
        }
        List<Gift> list = giftListResult2.giftList;
        if (list == null) {
            giftListResult2.giftList = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Gift gift : giftListResult2.giftList) {
                if (gift != null) {
                    _Gift_ProtoDecoder.LJ(gift);
                }
            }
        }
        List<GiftPage> list2 = giftListResult2.giftPages;
        if (list2 == null) {
            giftListResult2.giftPages = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (GiftPage giftPage : giftListResult2.giftPages) {
                if (giftPage != null) {
                    _GiftPage_ProtoDecoder.LJ(giftPage);
                }
            }
        }
        List<DoodleTemplate> list3 = giftListResult2.doodleTemplates;
        if (list3 == null) {
            giftListResult2.doodleTemplates = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (DoodleTemplate doodleTemplate : giftListResult2.doodleTemplates) {
                if (doodleTemplate != null && (imageModel = doodleTemplate.image) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        if (giftListResult2.hotFields == null) {
            giftListResult2.hotFields = new ArrayList();
        }
        GiftConfigs giftConfigs = giftListResult2.giftConfigs;
        if (giftConfigs != null) {
            _GiftConfigs_ProtoDecoder.LJ(giftConfigs);
        }
        if (giftListResult2.tags == null) {
            giftListResult2.tags = new ArrayList();
        }
        DynamicRestriction dynamicRestriction = giftListResult2.dynamicRestriction;
        if (dynamicRestriction != null) {
            _DynamicRestriction_ProtoDecoder.LJ(dynamicRestriction);
        }
        if (giftListResult2.beaconBubblePriorities == null) {
            giftListResult2.beaconBubblePriorities = new HashMap();
        }
        if (giftListResult2.giftLabelPriorities == null) {
            giftListResult2.giftLabelPriorities = new HashMap();
        }
        if (giftListResult2.giftResourceGroupMap == null) {
            giftListResult2.giftResourceGroupMap = new HashMap();
        }
        if (giftListResult2.giftNameGroupMap == null) {
            giftListResult2.giftNameGroupMap = new HashMap();
        }
        Map<Long, GiftRecommendInfo> map = giftListResult2.exclusiveRecommendInfos;
        if (map == null) {
            giftListResult2.exclusiveRecommendInfos = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, GiftRecommendInfo>> it2 = giftListResult2.exclusiveRecommendInfos.entrySet().iterator();
            while (it2.hasNext()) {
                GiftRecommendInfo value = it2.next().getValue();
                if (value != null && (text = value.text) != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
            }
        }
        PanelRefreshData panelRefreshData = giftListResult2.panelRefreshData;
        if (panelRefreshData != null) {
            _PanelRefreshData_ProtoDecoder.LJ(panelRefreshData);
        }
    }

    @Override // X.C0IMD
    public final GiftListResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftListResult giftListResult = new GiftListResult();
        giftListResult.giftResourceGroupMap = new HashMap();
        giftListResult.giftLabelPriorities = new HashMap();
        giftListResult.tags = new ArrayList();
        giftListResult.giftNameGroupMap = new HashMap();
        giftListResult.doodleTemplates = new ArrayList();
        giftListResult.giftPages = new ArrayList();
        giftListResult.hotFields = new ArrayList();
        giftListResult.exclusiveRecommendInfos = new HashMap();
        giftListResult.beaconBubblePriorities = new HashMap();
        giftListResult.giftList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                switch (iLJI) {
                    case 1:
                        giftListResult.giftsInfo = _GiftsInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftListResult.giftList.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        giftListResult.giftPages.add(_GiftPage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        giftListResult.doodleTemplates.add(_DoodleTemplate_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        giftListResult.responseHash = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftListResult.refreshStatus = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        giftListResult.coldGiftHash = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftListResult.isFullGiftData = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftListResult.hotFields.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftListResult.giftConfigs = _GiftConfigs_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftListResult.tags.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftListResult.dynamicRestriction = _DynamicRestriction_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (lValueOf2 != null) {
                                        giftListResult.beaconBubblePriorities.put(lValueOf, lValueOf2);
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
                    case 14:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Long lValueOf3 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        lValueOf3 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (lValueOf3 != null) {
                                        giftListResult.giftLabelPriorities.put(lValueOf, lValueOf3);
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
                    case 15:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (lValueOf != null) {
                                    if (strLIZLLL != null) {
                                        giftListResult.giftResourceGroupMap.put(lValueOf, strLIZLLL);
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
                    case 16:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (lValueOf != null) {
                                    if (strLIZLLL2 != null) {
                                        giftListResult.giftNameGroupMap.put(lValueOf, strLIZLLL2);
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
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        long jLIZJ6 = c1516680pZS.LIZJ();
                        GiftRecommendInfo giftRecommendInfoLIZLLL = null;
                        while (true) {
                            int iLJI6 = c1516680pZS.LJI();
                            if (iLJI6 != -1) {
                                if (iLJI6 != 1) {
                                    if (iLJI6 == 2) {
                                        giftRecommendInfoLIZLLL = _GiftRecommendInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ6);
                                if (lValueOf != null) {
                                    if (giftRecommendInfoLIZLLL != null) {
                                        giftListResult.exclusiveRecommendInfos.put(lValueOf, giftRecommendInfoLIZLLL);
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
                        switch (iLJI) {
                            case 100:
                                giftListResult.strategyToken = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 101:
                                giftListResult.panelRefreshData = _PanelRefreshData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 102:
                                giftListResult.strategyData = _GiftStrategyData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 103:
                                giftListResult.realtimeServerPassthrough = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftListResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftListResult giftListResult, List list) {
    }
}
