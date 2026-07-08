package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _TopRightBannerContainerComponent_ProtoDecoder implements C0IMD<TopRightBannerContainerComponent> {
    public static TopRightBannerContainerComponent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopRightBannerContainerComponent topRightBannerContainerComponent = new TopRightBannerContainerComponent();
        topRightBannerContainerComponent.trackExtra = new HashMap();
        topRightBannerContainerComponent.extra = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                if (iLJI != 254) {
                    if (iLJI != 255) {
                        switch (iLJI) {
                            case 1:
                                topRightBannerContainerComponent.type = c1516680pZS.LJIIJ();
                                break;
                            case 2:
                                topRightBannerContainerComponent.style = c1516680pZS.LJIIJ();
                                break;
                            case 3:
                                topRightBannerContainerComponent.schema = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case 4:
                                topRightBannerContainerComponent.titleText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 5:
                                topRightBannerContainerComponent.subtitleText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 6:
                                topRightBannerContainerComponent.hasCloseButton = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case 7:
                                topRightBannerContainerComponent.hasRightArrow = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case 8:
                                topRightBannerContainerComponent.tuxUrl = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                topRightBannerContainerComponent.geckoKey = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                topRightBannerContainerComponent.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                topRightBannerContainerComponent.targetTopRightContainerItemType = c1516680pZS.LJIIJ();
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                topRightBannerContainerComponent.isCustomizedImage = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                topRightBannerContainerComponent.isCustomizedSchema = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case 14:
                                topRightBannerContainerComponent.imagePadding = _ImagePadding_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case 15:
                                topRightBannerContainerComponent.imageModeScale = c1516680pZS.LJIIJ();
                                break;
                            case 16:
                                topRightBannerContainerComponent.frequencyKey = C1516700pZU.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                topRightBannerContainerComponent.isClientBanner = C1516700pZU.LIZ(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                topRightBannerContainerComponent.imageCornerRadius = Float.intBitsToFloat(c1516680pZS.LJIIIIZZ());
                                break;
                            case 19:
                                topRightBannerContainerComponent.backgroundImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                topRightBannerContainerComponent.imageTypeAndroid = c1516680pZS.LJIIJ();
                                break;
                            case 21:
                                topRightBannerContainerComponent.imageModeScaleAndroid = c1516680pZS.LJIIJ();
                                break;
                            case 22:
                                topRightBannerContainerComponent.ecPreliveChecklist = _EcPreLiveChecklistData_ProtoDecoder.LIZLLL(c1516680pZS);
                                break;
                            default:
                                C1516700pZU.LJ(c1516680pZS);
                                break;
                        }
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
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
                                        topRightBannerContainerComponent.trackExtra.put(strLIZLLL, strLIZLLL2);
                                    } else {
                                        throw new IllegalStateException("Map value must not be null!");
                                    }
                                } else {
                                    throw new IllegalStateException("Map key must not be null!");
                                }
                            }
                        }
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    String strLIZLLL3 = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 != -1) {
                            if (iLJI3 != 1) {
                                if (iLJI3 == 2) {
                                    strLIZLLL3 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            c1516680pZS.LJ(jLIZJ3);
                            if (strLIZLLL != null) {
                                if (strLIZLLL3 != null) {
                                    topRightBannerContainerComponent.extra.put(strLIZLLL, strLIZLLL3);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topRightBannerContainerComponent;
            }
        }
    }

    public static void LJ(TopRightBannerContainerComponent topRightBannerContainerComponent) {
        Text text = topRightBannerContainerComponent.titleText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = topRightBannerContainerComponent.subtitleText;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        ImageModel imageModel = topRightBannerContainerComponent.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = topRightBannerContainerComponent.backgroundImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        EcPreLiveChecklistData ecPreLiveChecklistData = topRightBannerContainerComponent.ecPreliveChecklist;
        if (ecPreLiveChecklistData != null) {
            _EcPreLiveChecklistData_ProtoDecoder.LJ(ecPreLiveChecklistData);
        }
        if (topRightBannerContainerComponent.extra == null) {
            topRightBannerContainerComponent.extra = new HashMap();
        }
        if (topRightBannerContainerComponent.trackExtra == null) {
            topRightBannerContainerComponent.trackExtra = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopRightBannerContainerComponent topRightBannerContainerComponent) {
        LJ(topRightBannerContainerComponent);
    }

    @Override // X.C0IMD
    public final TopRightBannerContainerComponent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopRightBannerContainerComponent topRightBannerContainerComponent, List list) {
    }
}
