package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex;
import com.bytedance.android.livesdk.chatroom.api._EmoteWithIndex_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StarCommentMessage_ProtoDecoder implements C0IMD<StarCommentMessage> {
    public static StarCommentMessage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StarCommentMessage starCommentMessage = new StarCommentMessage();
        starCommentMessage.f315emotes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        starCommentMessage.starCommentId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        starCommentMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        starCommentMessage.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        starCommentMessage.duration = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        starCommentMessage.startTimeMs = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        starCommentMessage.commentOption = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        starCommentMessage.contentLanguage = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        starCommentMessage.f315emotes.add(_EmoteWithIndex_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        starCommentMessage.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return starCommentMessage;
            }
        }
    }

    public static void LJ(StarCommentMessage starCommentMessage) {
        EmoteModel emoteModel;
        User user = starCommentMessage.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        List<EmoteWithIndex> list = starCommentMessage.f315emotes;
        if (list == null) {
            starCommentMessage.f315emotes = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteWithIndex emoteWithIndex : starCommentMessage.f315emotes) {
            if (emoteWithIndex != null && (emoteModel = emoteWithIndex.emote) != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StarCommentMessage starCommentMessage) {
        LJ(starCommentMessage);
    }

    @Override // X.C0IMD
    public final StarCommentMessage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StarCommentMessage starCommentMessage, List list) {
    }
}
