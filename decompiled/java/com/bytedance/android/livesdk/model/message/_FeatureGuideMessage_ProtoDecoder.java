package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FeatureGuideMessage_ProtoDecoder implements C0IMD<FeatureGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(FeatureGuideMessage featureGuideMessage) {
        CommonMessageData commonMessageData = featureGuideMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final FeatureGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FeatureGuideMessage featureGuideMessage = new FeatureGuideMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    featureGuideMessage.featureGuideTypeStr = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                featureGuideMessage.featureGuideType = c1516680pZS.LJIIJ();
                            }
                        } else {
                            featureGuideMessage.stayDurationMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        featureGuideMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    featureGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return featureGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FeatureGuideMessage featureGuideMessage, List list) {
    }
}
