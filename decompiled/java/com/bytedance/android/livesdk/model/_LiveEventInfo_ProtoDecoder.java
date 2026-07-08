package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.EventUserInfo;
import webcast.data._EventUserInfo_ProtoDecoder;
import webcast.data._PaidEventPreview_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveEventInfo_ProtoDecoder implements C0IMD<LiveEventInfo> {
    public static LiveEventInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveEventInfo liveEventInfo = new LiveEventInfo();
        liveEventInfo.eventUserInfo = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveEventInfo.eventId = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 2:
                        liveEventInfo.startTime = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 3:
                        liveEventInfo.duration = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case 4:
                        liveEventInfo.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        liveEventInfo.description = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        liveEventInfo.subscribed = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 7:
                        liveEventInfo.isPaidEvent = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 8:
                        liveEventInfo.ticketAmount = Long.valueOf(c1516680pZS.LJIIJJI());
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        liveEventInfo.payMethod = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        WalletPackage walletPackageLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 != -1) {
                                if (iLJI2 != 1) {
                                    if (iLJI2 == 2) {
                                        walletPackageLIZLLL = _WalletPackage_ProtoDecoder.LIZLLL(c1516680pZS);
                                    }
                                } else {
                                    strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                c1516680pZS.LJ(jLIZJ2);
                                if (strLIZLLL != null) {
                                    if (walletPackageLIZLLL != null) {
                                        liveEventInfo.walletPkgDict.put(strLIZLLL, walletPackageLIZLLL);
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
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        liveEventInfo.eventUserInfo.add(_EventUserInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        liveEventInfo.subscribedCount = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        liveEventInfo.paidEventPreview = _PaidEventPreview_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        liveEventInfo.walletPackage = _WalletPackage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        liveEventInfo.registerType = c1516680pZS.LJIIJJI();
                        break;
                    case 16:
                        liveEventInfo.periodicSettings = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        liveEventInfo.periodicShows = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveEventInfo;
            }
        }
    }

    public static void LJ(LiveEventInfo liveEventInfo) {
        List<EventUserInfo> list = liveEventInfo.eventUserInfo;
        if (list == null) {
            liveEventInfo.eventUserInfo = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EventUserInfo> it2 = liveEventInfo.eventUserInfo.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveEventInfo liveEventInfo) {
        LJ(liveEventInfo);
    }

    @Override // X.C0IMD
    public final LiveEventInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveEventInfo liveEventInfo, List list) {
    }
}
