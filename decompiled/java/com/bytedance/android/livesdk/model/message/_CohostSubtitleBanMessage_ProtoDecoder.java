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
public final class _CohostSubtitleBanMessage_ProtoDecoder implements C0IMD<CohostSubtitleBanMessage> {
    @Override // X.C0IMD
    public final void LIZ(CohostSubtitleBanMessage cohostSubtitleBanMessage) {
        CohostSubtitleBanMessage cohostSubtitleBanMessage2 = cohostSubtitleBanMessage;
        CommonMessageData commonMessageData = cohostSubtitleBanMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        Text text = cohostSubtitleBanMessage2.toastText;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final CohostSubtitleBanMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CohostSubtitleBanMessage cohostSubtitleBanMessage = new CohostSubtitleBanMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            cohostSubtitleBanMessage.subtitleBanType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        cohostSubtitleBanMessage.toastText = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    cohostSubtitleBanMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostSubtitleBanMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostSubtitleBanMessage cohostSubtitleBanMessage, List list) {
    }
}
