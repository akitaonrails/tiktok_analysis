package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftActivityCreator_ProtoDecoder implements C0IMD<GiftActivityCreator> {
    public static GiftActivityCreator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftActivityCreator giftActivityCreator = new GiftActivityCreator();
        giftActivityCreator.giftIds = new ArrayList();
        giftActivityCreator.overrideGiftCardlets = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftActivityCreator.areaSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        giftActivityCreator.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        giftActivityCreator.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        giftActivityCreator.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        giftActivityCreator.subTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftActivityCreator.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftActivityCreator.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftActivityCreator.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftActivityCreator.targetSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftActivityCreator.eventId = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftActivityCreator.eventName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        giftActivityCreator.entranceName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        giftActivityCreator.height = c1516680pZS.LJIIJJI();
                        break;
                    case 14:
                        giftActivityCreator.backgroundRtl = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        giftActivityCreator.button = _GiftPanelCardletByCreator_CardletButton_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        GiftPanelCardletByCreator giftPanelCardletByCreatorLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        giftPanelCardletByCreatorLIZLLL = _GiftPanelCardletByCreator_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (lValueOf != null) {
                                    if (giftPanelCardletByCreatorLIZLLL != null) {
                                        giftActivityCreator.overrideGiftCardlets.put(lValueOf, giftPanelCardletByCreatorLIZLLL);
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
                        giftActivityCreator.bannerType = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        giftActivityCreator.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftActivityCreator;
            }
        }
    }

    public static void LJ(GiftActivityCreator giftActivityCreator) {
        ImageModel imageModel;
        ImageModel imageModel2 = giftActivityCreator.background;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        if (giftActivityCreator.giftIds == null) {
            giftActivityCreator.giftIds = new ArrayList();
        }
        ImageModel imageModel3 = giftActivityCreator.backgroundRtl;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        GiftPanelCardletByCreator.CardletButton cardletButton = giftActivityCreator.button;
        if (cardletButton != null && (imageModel = cardletButton.leftIcon) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Map<Long, GiftPanelCardletByCreator> map = giftActivityCreator.overrideGiftCardlets;
        if (map == null) {
            giftActivityCreator.overrideGiftCardlets = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, GiftPanelCardletByCreator>> it2 = giftActivityCreator.overrideGiftCardlets.entrySet().iterator();
        while (it2.hasNext()) {
            GiftPanelCardletByCreator value = it2.next().getValue();
            if (value != null) {
                _GiftPanelCardletByCreator_ProtoDecoder.LJ(value);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftActivityCreator giftActivityCreator) {
        LJ(giftActivityCreator);
    }

    @Override // X.C0IMD
    public final GiftActivityCreator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftActivityCreator giftActivityCreator, List list) {
    }
}
