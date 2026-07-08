package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data._MsgFilter_ProtoDecoder;
import webcast.data._UserIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EmoteChatMessage_ProtoDecoder implements C0IMD<EmoteChatMessage> {
    @Override // X.C0IMD
    public final void LIZ(EmoteChatMessage emoteChatMessage) {
        EmoteChatMessage emoteChatMessage2 = emoteChatMessage;
        CommonMessageData commonMessageData = emoteChatMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        User user = emoteChatMessage2.user;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
        List<EmoteModel> list = emoteChatMessage2.emoteList;
        if (list == null) {
            emoteChatMessage2.emoteList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EmoteModel emoteModel : emoteChatMessage2.emoteList) {
            if (emoteModel != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final EmoteChatMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EmoteChatMessage emoteChatMessage = new EmoteChatMessage();
        emoteChatMessage.emoteList = new ArrayList();
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
                                    emoteChatMessage.userIdentity = _UserIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                emoteChatMessage.msgFilter = _MsgFilter_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            emoteChatMessage.emoteList.add(_EmoteModel_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        emoteChatMessage.user = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    emoteChatMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return emoteChatMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EmoteChatMessage emoteChatMessage, List list) {
    }
}
