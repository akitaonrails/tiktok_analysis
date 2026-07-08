package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftRecommendInfo;
import com.bytedance.android.livesdk.gift.model._GiftRecommendInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecommendationMessage_ProtoDecoder implements C0IMD<GiftRecommendationMessage> {
    @Override // X.C0IMD
    public final void LIZ(GiftRecommendationMessage giftRecommendationMessage) {
        Text text;
        GiftRecommendationMessage giftRecommendationMessage2 = giftRecommendationMessage;
        CommonMessageData commonMessageData = giftRecommendationMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Map<Long, GiftRecommendInfo> map = giftRecommendationMessage2.recommendInfos;
        if (map == null) {
            giftRecommendationMessage2.recommendInfos = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, GiftRecommendInfo>> it2 = giftRecommendationMessage2.recommendInfos.entrySet().iterator();
        while (it2.hasNext()) {
            GiftRecommendInfo value = it2.next().getValue();
            if (value != null && (text = value.text) != null) {
                _Text_ProtoDecoder.LJ(text);
            }
        }
    }

    @Override // X.C0IMD
    public final GiftRecommendationMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftRecommendationMessage giftRecommendationMessage = new GiftRecommendationMessage();
        giftRecommendationMessage.recommendInfos = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        GiftRecommendInfo giftRecommendInfoLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    giftRecommendInfoLIZLLL = _GiftRecommendInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (giftRecommendInfoLIZLLL != null) {
                                giftRecommendationMessage.recommendInfos.put(lValueOf, giftRecommendInfoLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    giftRecommendationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftRecommendationMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecommendationMessage giftRecommendationMessage, List list) {
    }
}
