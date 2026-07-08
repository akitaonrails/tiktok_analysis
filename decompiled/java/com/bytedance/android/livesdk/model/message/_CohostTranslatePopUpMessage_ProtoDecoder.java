package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostTranslatePopUpMessage_ProtoDecoder implements C0IMD<CohostTranslatePopUpMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostTranslatePopUpMessage cohostTranslatePopUpMessage) {
        CohostTranslatePopUpMessage cohostTranslatePopUpMessage2 = cohostTranslatePopUpMessage;
        CommonMessageData commonMessageData = cohostTranslatePopUpMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = cohostTranslatePopUpMessage2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = cohostTranslatePopUpMessage2.content;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final CohostTranslatePopUpMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostTranslatePopUpMessage cohostTranslatePopUpMessage = new CohostTranslatePopUpMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostTranslatePopUpMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        cohostTranslatePopUpMessage.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostTranslatePopUpMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostTranslatePopUpMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostTranslatePopUpMessage cohostTranslatePopUpMessage, List list) {
    }
}
