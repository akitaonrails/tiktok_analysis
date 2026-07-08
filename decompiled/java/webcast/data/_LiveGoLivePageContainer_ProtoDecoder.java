package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _LiveGoLivePageContainer_ProtoDecoder implements C0IMD<LiveGoLivePageContainer> {
    public static LiveGoLivePageContainer LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveGoLivePageContainer liveGoLivePageContainer = new LiveGoLivePageContainer();
        liveGoLivePageContainer.aboveGoLiveButtonContainer = new ArrayList();
        liveGoLivePageContainer.cleanUpFrequencyKey = new ArrayList();
        liveGoLivePageContainer.itemTypeName = new HashMap();
        liveGoLivePageContainer.bannerTypeName = new HashMap();
        liveGoLivePageContainer.bottomContainer = new ArrayList();
        liveGoLivePageContainer.topRightContainer = new ArrayList();
        liveGoLivePageContainer.topRightBannerContainerPriority = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                switch (iLJI) {
                    case 1:
                        liveGoLivePageContainer.topRightContainer.add(_TopRightContainerComponent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        liveGoLivePageContainer.topRightBannerContainer = _TopRightBannerContainerComponent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        liveGoLivePageContainer.bottomContainer.add(_BottomContainerComponent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 4:
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
                                        liveGoLivePageContainer.topRightBannerContainerPriority.put(strLIZLLL, strLIZLLL2);
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
                    case 5:
                        liveGoLivePageContainer.goLivePageStyle = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        liveGoLivePageContainer.liveGoalStyle = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveGoLivePageContainer.specialModeType = c1516680pZS.LJIIJ();
                        break;
                    case 8:
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
                                        liveGoLivePageContainer.itemTypeName.put(strLIZLLL, strLIZLLL3);
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
                    case BdTuring.TYPE_ECAF /* 9 */:
                        long jLIZJ4 = c1516680pZS.LIZJ();
                        String strLIZLLL4 = null;
                        while (true) {
                            int iLJI4 = c1516680pZS.LJI();
                            if (iLJI4 != -1) {
                                if (iLJI4 != 1) {
                                    if (iLJI4 == 2) {
                                        strLIZLLL4 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ4);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL4 != null) {
                                        liveGoLivePageContainer.bannerTypeName.put(strLIZLLL, strLIZLLL4);
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
                        liveGoLivePageContainer.cleanUpFrequencyKey.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveGoLivePageContainer.aboveGoLiveButtonContainer.add(_AboveGoLiveButtonComponent_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveGoLivePageContainer.secondaryBanner = _SecondaryBannerComponent_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveGoLivePageContainer;
            }
        }
    }

    public static void LJ(LiveGoLivePageContainer liveGoLivePageContainer) {
        List<TopRightContainerComponent> list = liveGoLivePageContainer.topRightContainer;
        if (list == null) {
            liveGoLivePageContainer.topRightContainer = new ArrayList();
        } else if (!list.isEmpty()) {
            for (TopRightContainerComponent topRightContainerComponent : liveGoLivePageContainer.topRightContainer) {
                if (topRightContainerComponent != null) {
                    if (topRightContainerComponent.extra == null) {
                        topRightContainerComponent.extra = new HashMap();
                    }
                    if (topRightContainerComponent.trackExtra == null) {
                        topRightContainerComponent.trackExtra = new HashMap();
                    }
                }
            }
        }
        TopRightBannerContainerComponent topRightBannerContainerComponent = liveGoLivePageContainer.topRightBannerContainer;
        if (topRightBannerContainerComponent != null) {
            _TopRightBannerContainerComponent_ProtoDecoder.LJ(topRightBannerContainerComponent);
        }
        List<BottomContainerComponent> list2 = liveGoLivePageContainer.bottomContainer;
        if (list2 == null) {
            liveGoLivePageContainer.bottomContainer = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (BottomContainerComponent bottomContainerComponent : liveGoLivePageContainer.bottomContainer) {
                if (bottomContainerComponent != null) {
                    _BottomContainerComponent_ProtoDecoder.LJ(bottomContainerComponent);
                }
            }
        }
        if (liveGoLivePageContainer.topRightBannerContainerPriority == null) {
            liveGoLivePageContainer.topRightBannerContainerPriority = new HashMap();
        }
        if (liveGoLivePageContainer.itemTypeName == null) {
            liveGoLivePageContainer.itemTypeName = new HashMap();
        }
        if (liveGoLivePageContainer.bannerTypeName == null) {
            liveGoLivePageContainer.bannerTypeName = new HashMap();
        }
        if (liveGoLivePageContainer.cleanUpFrequencyKey == null) {
            liveGoLivePageContainer.cleanUpFrequencyKey = new ArrayList();
        }
        List<AboveGoLiveButtonComponent> list3 = liveGoLivePageContainer.aboveGoLiveButtonContainer;
        if (list3 == null) {
            liveGoLivePageContainer.aboveGoLiveButtonContainer = new ArrayList();
        } else if (!list3.isEmpty()) {
            for (AboveGoLiveButtonComponent aboveGoLiveButtonComponent : liveGoLivePageContainer.aboveGoLiveButtonContainer) {
                if (aboveGoLiveButtonComponent != null) {
                    if (aboveGoLiveButtonComponent.extra == null) {
                        aboveGoLiveButtonComponent.extra = new HashMap();
                    }
                    if (aboveGoLiveButtonComponent.trackExtra == null) {
                        aboveGoLiveButtonComponent.trackExtra = new HashMap();
                    }
                }
            }
        }
        SecondaryBannerComponent secondaryBannerComponent = liveGoLivePageContainer.secondaryBanner;
        if (secondaryBannerComponent != null) {
            if (secondaryBannerComponent.extra == null) {
                secondaryBannerComponent.extra = new HashMap();
            }
            if (secondaryBannerComponent.trackExtra == null) {
                secondaryBannerComponent.trackExtra = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveGoLivePageContainer liveGoLivePageContainer) {
        LJ(liveGoLivePageContainer);
    }

    @Override // X.C0IMD
    public final LiveGoLivePageContainer LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveGoLivePageContainer liveGoLivePageContainer, List list) {
    }
}
