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
public final class _GuestInviteMessage_ProtoDecoder implements C0IMD<GuestInviteMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuestInviteMessage guestInviteMessage) {
        GuestInviteMessage guestInviteMessage2 = guestInviteMessage;
        CommonMessageData commonMessageData = guestInviteMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = guestInviteMessage2.inviterAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GuestInviteMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestInviteMessage guestInviteMessage = new GuestInviteMessage();
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
                                    guestInviteMessage.inviterAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                guestInviteMessage.inviterNickname = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            guestInviteMessage.inviterUserId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        guestInviteMessage.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    guestInviteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestInviteMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInviteMessage guestInviteMessage, List list) {
    }
}
