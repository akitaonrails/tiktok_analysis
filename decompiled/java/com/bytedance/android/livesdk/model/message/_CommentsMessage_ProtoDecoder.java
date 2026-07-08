package com.bytedance.android.livesdk.model.message;

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
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommentsMessage_ProtoDecoder implements C0IMD<CommentsMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommentsMessage commentsMessage) {
        CommentsMessage commentsMessage2 = commentsMessage;
        CommonMessageData commonMessageData = commentsMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = commentsMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        ImageModel imageModel = commentsMessage2.background;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final CommentsMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommentsMessage commentsMessage = new CommentsMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commentsMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commentsMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        commentsMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        commentsMessage.color = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        commentsMessage.background = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        commentsMessage.actionType = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        commentsMessage.actionContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentsMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentsMessage commentsMessage, List list) {
    }
}
