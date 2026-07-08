package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model._GameLiveFragment_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightFragmentReadyMessage_ProtoDecoder implements C0IMD<HighlightFragmentReadyMessage> {
    @Override // X.C0IMD
    public final void LIZ(HighlightFragmentReadyMessage highlightFragmentReadyMessage) {
        HighlightFragmentReadyMessage highlightFragmentReadyMessage2 = highlightFragmentReadyMessage;
        CommonMessageData commonMessageData = highlightFragmentReadyMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        GameLiveFragment gameLiveFragment = highlightFragmentReadyMessage2.gameLiveFragment;
        if (gameLiveFragment != null) {
            _GameLiveFragment_ProtoDecoder.LJ(gameLiveFragment);
        }
    }

    @Override // X.C0IMD
    public final HighlightFragmentReadyMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HighlightFragmentReadyMessage highlightFragmentReadyMessage = new HighlightFragmentReadyMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        highlightFragmentReadyMessage.gameLiveFragment = _GameLiveFragment_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    highlightFragmentReadyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightFragmentReadyMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightFragmentReadyMessage highlightFragmentReadyMessage, List list) {
    }
}
