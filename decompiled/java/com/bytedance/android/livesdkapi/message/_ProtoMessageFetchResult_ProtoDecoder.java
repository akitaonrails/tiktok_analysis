package com.bytedance.android.livesdkapi.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class _ProtoMessageFetchResult_ProtoDecoder implements C0IMD<ProtoMessageFetchResult> {
    @Override // X.C0IMD
    public final void LIZ(ProtoMessageFetchResult protoMessageFetchResult) {
        ProtoMessageFetchResult protoMessageFetchResult2 = protoMessageFetchResult;
        List<ProtoMessageFetchResult.BaseProtoMessage> list = protoMessageFetchResult2.messages;
        if (list == null) {
            protoMessageFetchResult2.messages = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<ProtoMessageFetchResult.BaseProtoMessage> it2 = protoMessageFetchResult2.messages.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (protoMessageFetchResult2.routeParams == null) {
            protoMessageFetchResult2.routeParams = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final ProtoMessageFetchResult LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ProtoMessageFetchResult protoMessageFetchResult = new ProtoMessageFetchResult();
        protoMessageFetchResult.routeParams = new HashMap();
        protoMessageFetchResult.messages = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        protoMessageFetchResult.messages.add(_ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 2:
                        protoMessageFetchResult.cursor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        protoMessageFetchResult.fetchInterval = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        protoMessageFetchResult.now = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        protoMessageFetchResult.internalExt = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        protoMessageFetchResult.fetchType = c1516680pZS.LJIIJ();
                        break;
                    case 7:
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
                                        protoMessageFetchResult.routeParams.put(strLIZLLL, strLIZLLL2);
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
                    case 8:
                        protoMessageFetchResult.heartbeatDuration = c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        protoMessageFetchResult.needAck = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        protoMessageFetchResult.pushServer = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        protoMessageFetchResult.isFirst = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        protoMessageFetchResult.historyCommentCursor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        protoMessageFetchResult.historyNoMore = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return protoMessageFetchResult;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ProtoMessageFetchResult protoMessageFetchResult, List list) {
    }
}
