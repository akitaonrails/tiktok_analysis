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
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewGameMomentMessage_ProtoDecoder implements C0IMD<PreviewGameMomentMessage> {
    @Override // X.C0IMD
    public final void LIZ(PreviewGameMomentMessage previewGameMomentMessage) {
        PreviewGameMomentMessage previewGameMomentMessage2 = previewGameMomentMessage;
        CommonMessageData commonMessageData = previewGameMomentMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<PreviewGameMomentData> list = previewGameMomentMessage2.momentDataList;
        if (list == null) {
            previewGameMomentMessage2.momentDataList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (PreviewGameMomentData previewGameMomentData : previewGameMomentMessage2.momentDataList) {
            if (previewGameMomentData != null) {
                Text text = previewGameMomentData.content;
                if (text != null) {
                    _Text_ProtoDecoder.LJ(text);
                }
                Text text2 = previewGameMomentData.gameTagName;
                if (text2 != null) {
                    _Text_ProtoDecoder.LJ(text2);
                }
            }
        }
    }

    @Override // X.C0IMD
    public final PreviewGameMomentMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PreviewGameMomentMessage previewGameMomentMessage = new PreviewGameMomentMessage();
        previewGameMomentMessage.momentDataList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        previewGameMomentMessage.momentDataList.add(_PreviewGameMomentData_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    previewGameMomentMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewGameMomentMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewGameMomentMessage previewGameMomentMessage, List list) {
    }
}
