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
public final class _CommentReplyMessage_ProtoDecoder implements C0IMD<CommentReplyMessage> {
    @Override // X.C0IMD
    public final void LIZ(CommentReplyMessage commentReplyMessage) {
        CommentReplyMessage commentReplyMessage2 = commentReplyMessage;
        CommonMessageData commonMessageData = commentReplyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        ImageModel imageModel = commentReplyMessage2.icon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        PublicAreaMessageCommon publicAreaMessageCommon = commentReplyMessage2.publicAreaMessageCommon;
        if (publicAreaMessageCommon != null) {
            _PublicAreaMessageCommon_ProtoDecoder.LJ(publicAreaMessageCommon);
        }
    }

    @Override // X.C0IMD
    public final CommentReplyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CommentReplyMessage commentReplyMessage = new CommentReplyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commentReplyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        commentReplyMessage.commentContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        commentReplyMessage.icon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        commentReplyMessage.stayDurationMs = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        commentReplyMessage.source = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        commentReplyMessage.commentId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        commentReplyMessage.replyContent = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        commentReplyMessage.publicAreaMessageCommon = _PublicAreaMessageCommon_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commentReplyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommentReplyMessage commentReplyMessage, List list) {
    }
}
