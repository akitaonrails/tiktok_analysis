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
public final class _AvatarStyleResultMessage_ProtoDecoder implements C0IMD<AvatarStyleResultMessage> {
    @Override // X.C0IMD
    public final void LIZ(AvatarStyleResultMessage avatarStyleResultMessage) {
        AvatarStyleResultMessage avatarStyleResultMessage2 = avatarStyleResultMessage;
        CommonMessageData commonMessageData = avatarStyleResultMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = avatarStyleResultMessage2.image;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final AvatarStyleResultMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarStyleResultMessage avatarStyleResultMessage = new AvatarStyleResultMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        avatarStyleResultMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        avatarStyleResultMessage.status = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        avatarStyleResultMessage.statusMessage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        avatarStyleResultMessage.image = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        avatarStyleResultMessage.styleId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        avatarStyleResultMessage.originImageUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        avatarStyleResultMessage.taskId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarStyleResultMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarStyleResultMessage avatarStyleResultMessage, List list) {
    }
}
