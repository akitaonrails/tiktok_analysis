package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StreamUrl_ProtoDecoder implements C0IMD<StreamUrl> {
    public static StreamUrl LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamUrl streamUrl = new StreamUrl();
        streamUrl.resolutionName = new HashMap();
        streamUrl.flvPullUrl = new HashMap();
        streamUrl.pushUrlList = new ArrayList();
        streamUrl.candidateResolution = new ArrayList();
        streamUrl.pullSdkParams = new HashMap();
        streamUrl.completePushUrls = new ArrayList();
        streamUrl.hlsPullUrlMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                String strLIZLLL = null;
                switch (iLJI) {
                    case 1:
                        streamUrl.provider = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        streamUrl.id = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        streamUrl.idStr = C1516700pZU.LIZLLL(c1516680pZS);
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
                                        streamUrl.resolutionName.put(strLIZLLL, strLIZLLL2);
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
                        streamUrl.defaultResolution = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        streamUrl.extra = _StreamUrlExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        streamUrl.rtmpPushUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        streamUrl.rtmpPullUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
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
                                        streamUrl.flvPullUrl.put(strLIZLLL, strLIZLLL3);
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
                        streamUrl.candidateResolution.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        streamUrl.hlsPullUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        streamUrl.hlsPullUrlParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        streamUrl.defaultPullSdkParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
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
                                        streamUrl.pullSdkParams.put(strLIZLLL, strLIZLLL4);
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
                        streamUrl.pushSdkParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                        streamUrl.pushUrlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        streamUrl.liveCoreSDKData = _LiveCoreSDKData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        long jLIZJ5 = c1516680pZS.LIZJ();
                        String strLIZLLL5 = null;
                        while (true) {
                            int iLJI5 = c1516680pZS.LJI();
                            if (iLJI5 != -1) {
                                if (iLJI5 != 1) {
                                    if (iLJI5 == 2) {
                                        strLIZLLL5 = C1516700pZU.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ5);
                                if (strLIZLLL != null) {
                                    if (strLIZLLL5 != null) {
                                        streamUrl.hlsPullUrlMap.put(strLIZLLL, strLIZLLL5);
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
                    case 19:
                        streamUrl.completePushUrls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        streamUrl.streamControlType = Integer.valueOf(c1516680pZS.LJIIJ());
                        break;
                    case 21:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case 22:
                        streamUrl.streamDelayMs = c1516680pZS.LJIIJJI();
                        break;
                    case 23:
                        streamUrl.pushResolution = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                        streamUrl.streamAppId = c1516680pZS.LJIIJJI();
                        break;
                    case 25:
                        streamUrl.aliveTimestamp = c1516680pZS.LJIIJJI();
                        break;
                    case 26:
                        streamUrl.streamSizeWidth = c1516680pZS.LJIIJJI();
                        break;
                    case 27:
                        streamUrl.streamSizeHeight = c1516680pZS.LJIIJJI();
                        break;
                    case 28:
                        streamUrl.drmType = c1516680pZS.LJIIJ();
                        break;
                    case 29:
                        streamUrl.streamLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamUrl;
            }
        }
    }

    public static void LJ(StreamUrl streamUrl) {
        LiveCoreSDKData.Options options;
        if (streamUrl.resolutionName == null) {
            streamUrl.resolutionName = new HashMap();
        }
        if (streamUrl.flvPullUrl == null) {
            streamUrl.flvPullUrl = new HashMap();
        }
        if (streamUrl.candidateResolution == null) {
            streamUrl.candidateResolution = new ArrayList();
        }
        if (streamUrl.pullSdkParams == null) {
            streamUrl.pullSdkParams = new HashMap();
        }
        if (streamUrl.pushUrlList == null) {
            streamUrl.pushUrlList = new ArrayList();
        }
        LiveCoreSDKData liveCoreSDKData = streamUrl.liveCoreSDKData;
        if (liveCoreSDKData != null) {
            LiveCoreSDKData.PullData pullData = liveCoreSDKData.pullData;
            if (pullData != null && (options = pullData.options) != null) {
                _LiveCoreSDKData_Options_ProtoDecoder.LJ(options);
            }
            LiveCoreSDKData.PushData pushData = liveCoreSDKData.pushData;
            if (pushData != null) {
                _LiveCoreSDKData_PushData_ProtoDecoder.LJ(pushData);
            }
        }
        if (streamUrl.hlsPullUrlMap == null) {
            streamUrl.hlsPullUrlMap = new HashMap();
        }
        if (streamUrl.completePushUrls == null) {
            streamUrl.completePushUrls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StreamUrl streamUrl) {
        LJ(streamUrl);
    }

    @Override // X.C0IMD
    public final StreamUrl LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamUrl streamUrl, List list) {
    }
}
