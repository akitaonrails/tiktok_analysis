package com.bytedance.android.livesdk.model.message;

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
public final class _MGOutsideInviteMessage_ProtoDecoder implements C0IMD<MGOutsideInviteMessage> {
    @Override // X.C0IMD
    public final void LIZ(MGOutsideInviteMessage mGOutsideInviteMessage) {
        MGOutsideInviteMessage mGOutsideInviteMessage2 = mGOutsideInviteMessage;
        CommonMessageData commonMessageData = mGOutsideInviteMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = mGOutsideInviteMessage2.anchorAvatar;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final MGOutsideInviteMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MGOutsideInviteMessage mGOutsideInviteMessage = new MGOutsideInviteMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        mGOutsideInviteMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        mGOutsideInviteMessage.roomId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        mGOutsideInviteMessage.anchorId = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        mGOutsideInviteMessage.anchorNickname = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        mGOutsideInviteMessage.anchorAvatar = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        mGOutsideInviteMessage.inviteTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        mGOutsideInviteMessage.followRelation = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mGOutsideInviteMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MGOutsideInviteMessage mGOutsideInviteMessage, List list) {
    }
}
