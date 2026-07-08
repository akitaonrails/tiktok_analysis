package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcBarrageMessage_ProtoDecoder implements C0IMD<EcBarrageMessage> {
    @Override // X.C0IMD
    public final void LIZ(EcBarrageMessage ecBarrageMessage) {
        EcBarrageMessage ecBarrageMessage2 = ecBarrageMessage;
        CommonMessageData commonMessageData = ecBarrageMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = ecBarrageMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        Text text = ecBarrageMessage2.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final EcBarrageMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EcBarrageMessage ecBarrageMessage = new EcBarrageMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        ecBarrageMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        ecBarrageMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        ecBarrageMessage.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        ecBarrageMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        ecBarrageMessage.backgroundColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        ecBarrageMessage.backgroundOpacity = Double.longBitsToDouble(c1516680pZS.LJIIIZ());
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecBarrageMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcBarrageMessage ecBarrageMessage, List list) {
    }
}
