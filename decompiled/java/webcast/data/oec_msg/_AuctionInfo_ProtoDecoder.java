package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AuctionInfo_ProtoDecoder implements C0IMD<AuctionInfo> {
    public static AuctionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AuctionInfo auctionInfo = new AuctionInfo();
        auctionInfo.traceTimeMap = new HashMap();
        auctionInfo.scrollElementList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            auctionInfo.auctionId = c1516680pZS.LJIIJJI();
                            break;
                        case 2:
                            auctionInfo.productId = c1516680pZS.LJIIJJI();
                            break;
                        case 3:
                            auctionInfo.versionTime = c1516680pZS.LJIIJJI();
                            break;
                        case 4:
                            auctionInfo.startTime = c1516680pZS.LJIIJJI();
                            break;
                        case 5:
                            auctionInfo.endTime = c1516680pZS.LJIIJJI();
                            break;
                        case 6:
                            auctionInfo.auctionWinner = _UserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 7:
                            auctionInfo.winnerBidPrice = _PriceItem_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 8:
                            auctionInfo.nextBidPrice = _PriceItem_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            auctionInfo.suffix = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            auctionInfo.extendAuctionCfg = _ExtendAuctionCfg_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            auctionInfo.auctionTextType = c1516680pZS.LJIIJ();
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            auctionInfo.scrollElementList.add(_ScrollElement_ProtoDecoder.LIZLLL(c1516680pZS));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            auctionInfo.rewardItem = _ScrollElement_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 14:
                            auctionInfo.drawingStateTextType = c1516680pZS.LJIIJ();
                            break;
                        case 15:
                            auctionInfo.auctionConfigId = c1516680pZS.LJIIJJI();
                            break;
                        case 16:
                            auctionInfo.auctionType = c1516680pZS.LJIIJ();
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            auctionInfo.auctionStatus = c1516680pZS.LJIIJ();
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            auctionInfo.isCarousel = C1516700pZU.LIZ(c1516680pZS);
                            break;
                        case 19:
                            auctionInfo.carouselCfg = _CarouselCfg_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            auctionInfo.auctionTextTypeInt = c1516680pZS.LJIIJ();
                            break;
                        case 21:
                            auctionInfo.drawingStateTextTypeInt = c1516680pZS.LJIIJ();
                            break;
                        case 22:
                            auctionInfo.versionTimeStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 23:
                            long jLIZJ2 = c1516680pZS.LIZJ();
                            String strLIZLLL = null;
                            String strLIZLLL2 = null;
                            while (true) {
                                int iLJI2 = c1516680pZS.LJI();
                                if (iLJI2 != -1) {
                                    if (iLJI2 != 1) {
                                        if (iLJI2 == 2) {
                                            strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                        }
                                    } else {
                                        strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    c1516680pZS.LJ(jLIZJ2);
                                    if (strLIZLLL != null) {
                                        if (strLIZLLL2 != null) {
                                            auctionInfo.traceTimeMap.put(strLIZLLL, strLIZLLL2);
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
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            auctionInfo.easterEgg = _EasterEgg_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 25:
                            auctionInfo.auctionKnockPerformMiddleTextType = c1516680pZS.LJIIJ();
                            break;
                        case 26:
                            auctionInfo.auctionKnockPerformBottomRightTextType = c1516680pZS.LJIIJ();
                            break;
                        case 27:
                            auctionInfo.auctionIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 28:
                            auctionInfo.auctionConfigIdStr = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 29:
                            auctionInfo.auctionCardBottomTextType = c1516680pZS.LJIIJ();
                            break;
                        case 30:
                            auctionInfo.auctionCardTitleTextType = c1516680pZS.LJIIJ();
                            break;
                        case 31:
                            auctionInfo.surpriseSetRemainItemCount = c1516680pZS.LJIIJ();
                            break;
                        case 32:
                            auctionInfo.auctionEventTypeInt = c1516680pZS.LJIIJ();
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            auctionInfo.bidPanel = _BidPanel_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    auctionInfo.lynxCardInfo = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return auctionInfo;
            }
        }
    }

    public static void LJ(AuctionInfo auctionInfo) {
        ImageModel imageModel;
        UserInfo userInfo = auctionInfo.auctionWinner;
        if (userInfo != null && (imageModel = userInfo.avatar) != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        List<ScrollElement> list = auctionInfo.scrollElementList;
        if (list == null) {
            auctionInfo.scrollElementList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<ScrollElement> it2 = auctionInfo.scrollElementList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        CarouselCfg carouselCfg = auctionInfo.carouselCfg;
        if (carouselCfg != null && carouselCfg.textStatusList == null) {
            carouselCfg.textStatusList = new ArrayList();
        }
        if (auctionInfo.traceTimeMap == null) {
            auctionInfo.traceTimeMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(AuctionInfo auctionInfo) {
        LJ(auctionInfo);
    }

    @Override // X.C0IMD
    public final AuctionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AuctionInfo auctionInfo, List list) {
    }
}
