package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.CommercialCustomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommercialCustomMessage_ProtoDecoder implements C0IMD<CommercialCustomMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommercialCustomMessage commercialCustomMessage) {
        Text text;
        CommercialCustomMessage commercialCustomMessage2 = commercialCustomMessage;
        CommonMessageData commonMessageData = commercialCustomMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = commercialCustomMessage2.brandLogo;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text2 = commercialCustomMessage2.brandName;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        Text text3 = commercialCustomMessage2.content;
        if (text3 != null) {
            _Text_ProtoDecoder.LJ(text3);
        }
        CommercialCustomMessage.RightLabel rightLabel = commercialCustomMessage2.rightLabel;
        if (rightLabel != null && (text = rightLabel.content) != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final CommercialCustomMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommercialCustomMessage commercialCustomMessage = new CommercialCustomMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commercialCustomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commercialCustomMessage.customMessageId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        commercialCustomMessage.brandLogo = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        commercialCustomMessage.brandName = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        commercialCustomMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        commercialCustomMessage.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        commercialCustomMessage.borderColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        commercialCustomMessage.rightLabel = _CommercialCustomMessage_RightLabel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        commercialCustomMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commercialCustomMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommercialCustomMessage commercialCustomMessage, List list) {
    }
}
