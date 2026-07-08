package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PermitOutsideApplyMessage_ProtoDecoder implements C0IMD<PermitOutsideApplyMessage> {
    @Override // X.C0IMD
    public final void LIZ(PermitOutsideApplyMessage permitOutsideApplyMessage) {
        PermitOutsideApplyMessage permitOutsideApplyMessage2 = permitOutsideApplyMessage;
        CommonMessageData commonMessageData = permitOutsideApplyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = permitOutsideApplyMessage2.anchorAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PermitOutsideApplyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PermitOutsideApplyMessage permitOutsideApplyMessage = new PermitOutsideApplyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        permitOutsideApplyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        permitOutsideApplyMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        permitOutsideApplyMessage.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        permitOutsideApplyMessage.anchorNickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        permitOutsideApplyMessage.anchorAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        permitOutsideApplyMessage.permitText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        permitOutsideApplyMessage.permitTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permitOutsideApplyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermitOutsideApplyMessage permitOutsideApplyMessage, List list) {
    }
}
