package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model._PlayTogetherBasicInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlayTogetherMessage_ProtoDecoder implements C0IMD<PlayTogetherMessage> {
    @Override // X.C0IMD
    public final void LIZ(PlayTogetherMessage playTogetherMessage) {
        PlayTogetherMessage playTogetherMessage2 = playTogetherMessage;
        CommonMessageData commonMessageData = playTogetherMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        PlayTogetherListChangeContent playTogetherListChangeContent = playTogetherMessage2.listChangeContent;
        if (playTogetherListChangeContent != null) {
            _PlayTogetherListChangeContent_ProtoDecoder.LJ(playTogetherListChangeContent);
        }
    }

    @Override // X.C0IMD
    public final PlayTogetherMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlayTogetherMessage playTogetherMessage = new PlayTogetherMessage();
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
                                    playTogetherMessage.permitNoticeContent = _PlayTogetherPermitNoticeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                playTogetherMessage.listChangeContent = _PlayTogetherListChangeContent_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            playTogetherMessage.basicInfo = _PlayTogetherBasicInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        playTogetherMessage.messageType = c1516680pZS.LJIIJ();
                    }
                } else {
                    playTogetherMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playTogetherMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlayTogetherMessage playTogetherMessage, List list) {
    }
}
