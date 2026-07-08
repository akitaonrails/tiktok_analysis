package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftOperation;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model._GiftOperation_ProtoDecoder;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
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
public final class _GiftPage_ProtoDecoder implements C0IMD<GiftPage> {
    public static GiftPage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPage giftPage = new GiftPage();
        giftPage.frequentlyUsedGifts = new ArrayList();
        giftPage.forceInsertPriorityMap = new HashMap();
        giftPage.matchGameGifts = new ArrayList();
        giftPage.giftDynamicFields = new ArrayList();
        giftPage.backfillGifts = new ArrayList();
        giftPage.favouriteGifts = new ArrayList();
        giftPage.forceInsertMetrics = new HashMap();
        giftPage.groupsInTab = new ArrayList();
        giftPage.gifts = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Long lValueOf = null;
                switch (iLJI) {
                    case 1:
                        giftPage.pageType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        giftPage.pageName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftPage.gifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        giftPage.display = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftPage.operation = _GiftOperation_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftPage.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftPage.pagePanelBanner = _GiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftPage.frequentlyUsedGifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        ForceInsertMetricsItem forceInsertMetricsItemLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        forceInsertMetricsItemLIZLLL = _ForceInsertMetricsItem_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (forceInsertMetricsItemLIZLLL != null) {
                                        giftPage.forceInsertMetrics.put(lValueOf, forceInsertMetricsItemLIZLLL);
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
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftPage.region = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        long jLIZJ3 = c1516680pZS.LIZJ();
                        Long lValueOf2 = null;
                        while (true) {
                            int iLJI3 = c1516680pZS.LJI();
                            if (iLJI3 != -1) {
                                if (iLJI3 != 1) {
                                    if (iLJI3 == 2) {
                                        lValueOf2 = Long.valueOf(c1516680pZS.LJIIJJI());
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ3);
                                if (lValueOf != null) {
                                    if (lValueOf2 != null) {
                                        giftPage.forceInsertPriorityMap.put(lValueOf, lValueOf2);
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
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftPage.favouriteGifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        giftPage.backfillGifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 14:
                        giftPage.useBackfillSpecialText = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        giftPage.groupsInTab.add(_GiftPage_GiftGroupInTab_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 16:
                        giftPage.matchGameGifts.add(_Gift_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        giftPage.giftDynamicFields.add(_GiftPage_GiftDynamicField_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        giftPage.clientCanReorder = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPage;
            }
        }
    }

    public static void LJ(GiftPage giftPage) {
        GiftPage.GiftDynamicField.GiftPanelBanner giftPanelBanner;
        List<Gift> list = giftPage.gifts;
        if (list == null) {
            giftPage.gifts = new ArrayList();
        } else if (!list.isEmpty()) {
            for (Gift gift : giftPage.gifts) {
                if (gift != null) {
                    _Gift_ProtoDecoder.LJ(gift);
                }
            }
        }
        GiftOperation giftOperation = giftPage.operation;
        if (giftOperation != null) {
            ImageModel imageModel = giftOperation.leftImage;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
            ImageModel imageModel2 = giftOperation.rightImage;
            if (imageModel2 != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel2);
            }
        }
        GiftPanelBanner giftPanelBanner2 = giftPage.pagePanelBanner;
        if (giftPanelBanner2 != null) {
            _GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner2);
        }
        List<Gift> list2 = giftPage.frequentlyUsedGifts;
        if (list2 == null) {
            giftPage.frequentlyUsedGifts = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (Gift gift2 : giftPage.frequentlyUsedGifts) {
                if (gift2 != null) {
                    _Gift_ProtoDecoder.LJ(gift2);
                }
            }
        }
        Map<Long, ForceInsertMetricsItem> map = giftPage.forceInsertMetrics;
        if (map == null) {
            giftPage.forceInsertMetrics = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, ForceInsertMetricsItem>> it2 = giftPage.forceInsertMetrics.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue();
            }
        }
        if (giftPage.forceInsertPriorityMap == null) {
            giftPage.forceInsertPriorityMap = new HashMap();
        }
        List<Gift> list3 = giftPage.favouriteGifts;
        if (list3 == null) {
            giftPage.favouriteGifts = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (Gift gift3 : giftPage.favouriteGifts) {
                if (gift3 != null) {
                    _Gift_ProtoDecoder.LJ(gift3);
                }
            }
        }
        List<Gift> list4 = giftPage.backfillGifts;
        if (list4 == null) {
            giftPage.backfillGifts = new ArrayList();
        } else if (!list4.isEmpty()) {
            for (Gift gift4 : giftPage.backfillGifts) {
                if (gift4 != null) {
                    _Gift_ProtoDecoder.LJ(gift4);
                }
            }
        }
        List<GiftPage.GiftGroupInTab> list5 = giftPage.groupsInTab;
        if (list5 == null) {
            giftPage.groupsInTab = new ArrayList();
        } else if (!list5.isEmpty()) {
            for (GiftPage.GiftGroupInTab giftGroupInTab : giftPage.groupsInTab) {
                if (giftGroupInTab != null) {
                    Text text = giftGroupInTab.title;
                    if (text != null) {
                        _Text_ProtoDecoder.LJ(text);
                    }
                    Text text2 = giftGroupInTab.description;
                    if (text2 != null) {
                        _Text_ProtoDecoder.LJ(text2);
                    }
                }
            }
        }
        List<Gift> list6 = giftPage.matchGameGifts;
        if (list6 == null) {
            giftPage.matchGameGifts = new ArrayList();
        } else if (!list6.isEmpty()) {
            for (Gift gift5 : giftPage.matchGameGifts) {
                if (gift5 != null) {
                    _Gift_ProtoDecoder.LJ(gift5);
                }
            }
        }
        List<GiftPage.GiftDynamicField> list7 = giftPage.giftDynamicFields;
        if (list7 == null) {
            giftPage.giftDynamicFields = new ArrayList();
            return;
        }
        if (list7.isEmpty()) {
            return;
        }
        for (GiftPage.GiftDynamicField giftDynamicField : giftPage.giftDynamicFields) {
            if (giftDynamicField != null && (giftPanelBanner = giftDynamicField.giftPanelBanner) != null) {
                _GiftPage_GiftDynamicField_GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPage giftPage) {
        LJ(giftPage);
    }

    @Override // X.C0IMD
    public final GiftPage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPage giftPage, List list) {
    }
}
