package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RTCExtraInfo_ProtoDecoder implements C0IMD<RTCExtraInfo> {
    public static RTCExtraInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RTCExtraInfo rTCExtraInfo = new RTCExtraInfo();
        rTCExtraInfo.rtcVideoParam = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rTCExtraInfo.config = _RTCEngineConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        rTCExtraInfo.rtcVideoParam.add(_RTCLiveVideoParam_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        rTCExtraInfo.rtcBitRateMap = _RTCBitRateMap_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        rTCExtraInfo.rtcFps = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        rTCExtraInfo.rtcMixBase = _RTCMixBase_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        rTCExtraInfo.byteRtcExtInfo = _ByteRTCExtInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        rTCExtraInfo.rtcInfoExtra = _RTCInfoExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        rTCExtraInfo.rtcBusinessId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        rTCExtraInfo.rtcOther = _RTCOther_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        rTCExtraInfo.interactClientType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rTCExtraInfo;
            }
        }
    }

    public static void LJ(RTCExtraInfo rTCExtraInfo) {
        List<RTCLiveVideoParam> list = rTCExtraInfo.rtcVideoParam;
        if (list == null) {
            rTCExtraInfo.rtcVideoParam = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<RTCLiveVideoParam> it2 = rTCExtraInfo.rtcVideoParam.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RTCExtraInfo rTCExtraInfo) {
        LJ(rTCExtraInfo);
    }

    @Override // X.C0IMD
    public final RTCExtraInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RTCExtraInfo rTCExtraInfo, List list) {
    }
}
