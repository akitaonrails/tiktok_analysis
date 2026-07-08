package webcast.im;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuestInviteGuideMessage_ProtoDecoder implements C0IMD<GuestInviteGuideMessage> {
    @Override // X.C0IMD
    public final void LIZ(GuestInviteGuideMessage guestInviteGuideMessage) {
        GuestInviteGuideMessage guestInviteGuideMessage2 = guestInviteGuideMessage;
        CommonMessageData commonMessageData = guestInviteGuideMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<ImageModel> list = guestInviteGuideMessage2.inviteeAvatar;
        if (list == null) {
            guestInviteGuideMessage2.inviteeAvatar = new ArrayList();
        } else if (!list.isEmpty()) {
            for (ImageModel imageModel : guestInviteGuideMessage2.inviteeAvatar) {
                if (imageModel != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        User user = guestInviteGuideMessage2.inviteUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final GuestInviteGuideMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GuestInviteGuideMessage guestInviteGuideMessage = new GuestInviteGuideMessage();
        guestInviteGuideMessage.inviteeAvatar = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        guestInviteGuideMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        guestInviteGuideMessage.inviteeAvatar.add(_ImageModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        guestInviteGuideMessage.guestInviteDisplayType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        guestInviteGuideMessage.guestInviteClickAction = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        guestInviteGuideMessage.inviteUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        guestInviteGuideMessage.triggerType = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guestInviteGuideMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuestInviteGuideMessage guestInviteGuideMessage, List list) {
    }
}
