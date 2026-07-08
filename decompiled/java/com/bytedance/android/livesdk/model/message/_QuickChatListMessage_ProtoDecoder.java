package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _QuickChatListMessage_ProtoDecoder implements C0IMD<QuickChatListMessage> {
    @Override // X.C0IMD
    public final void LIZ(QuickChatListMessage quickChatListMessage) {
        EmoteModel emoteModel;
        QuickChatListMessage quickChatListMessage2 = quickChatListMessage;
        CommonMessageData commonMessageData = quickChatListMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<QuickChatContent> list = quickChatListMessage2.contentList;
        if (list == null) {
            quickChatListMessage2.contentList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (QuickChatContent quickChatContent : quickChatListMessage2.contentList) {
            if (quickChatContent != null && (emoteModel = quickChatContent.emote) != null) {
                _EmoteModel_ProtoDecoder.LJ(emoteModel);
            }
        }
    }

    @Override // X.C0IMD
    public final QuickChatListMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        QuickChatListMessage quickChatListMessage = new QuickChatListMessage();
        quickChatListMessage.contentList = new ArrayList();
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
                                    quickChatListMessage.scene = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                quickChatListMessage.priority = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            quickChatListMessage.contentList.add(_QuickChatContent_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        quickChatListMessage.duration = c1516680pZS.LJIIJJI();
                    }
                } else {
                    quickChatListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return quickChatListMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, QuickChatListMessage quickChatListMessage, List list) {
    }
}
