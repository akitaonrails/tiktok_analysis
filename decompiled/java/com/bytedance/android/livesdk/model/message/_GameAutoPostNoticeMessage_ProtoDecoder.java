package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameAutoPostNoticeMessage_ProtoDecoder implements C0IMD<GameAutoPostNoticeMessage> {
    @Override // X.C0IMD
    public final void LIZ(GameAutoPostNoticeMessage gameAutoPostNoticeMessage) {
        GameAutoPostNoticeMessage gameAutoPostNoticeMessage2 = gameAutoPostNoticeMessage;
        List<LiveFragment> list = gameAutoPostNoticeMessage2.fragments;
        if (list == null) {
            gameAutoPostNoticeMessage2.fragments = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<LiveFragment> it2 = gameAutoPostNoticeMessage2.fragments.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        Text text = gameAutoPostNoticeMessage2.mainTitle;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = gameAutoPostNoticeMessage2.subTitle;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
        CommonMessageData commonMessageData = gameAutoPostNoticeMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final GameAutoPostNoticeMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GameAutoPostNoticeMessage gameAutoPostNoticeMessage = new GameAutoPostNoticeMessage();
        gameAutoPostNoticeMessage.fragments = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 100) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                gameAutoPostNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            gameAutoPostNoticeMessage.subTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameAutoPostNoticeMessage.mainTitle = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    gameAutoPostNoticeMessage.fragments.add(_LiveFragment_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameAutoPostNoticeMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameAutoPostNoticeMessage gameAutoPostNoticeMessage, List list) {
    }
}
