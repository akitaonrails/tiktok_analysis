package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AvatarReportDeleteMessage_ProtoDecoder implements C0IMD<AvatarReportDeleteMessage> {
    @Override // X.C0IMD
    public final void LIZ(AvatarReportDeleteMessage avatarReportDeleteMessage) {
        CommonMessageData commonMessageData = avatarReportDeleteMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final AvatarReportDeleteMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AvatarReportDeleteMessage avatarReportDeleteMessage = new AvatarReportDeleteMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            avatarReportDeleteMessage.avatarOwnerUserId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        avatarReportDeleteMessage.avatarId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    avatarReportDeleteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return avatarReportDeleteMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AvatarReportDeleteMessage avatarReportDeleteMessage, List list) {
    }
}
