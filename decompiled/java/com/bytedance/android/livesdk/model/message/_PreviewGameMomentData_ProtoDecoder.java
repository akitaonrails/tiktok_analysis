package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewGameMomentData_ProtoDecoder implements C0IMD<PreviewGameMomentData> {
    public static PreviewGameMomentData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewGameMomentData previewGameMomentData = new PreviewGameMomentData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        previewGameMomentData.previewGameInfoType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        previewGameMomentData.gameMomentMessageType = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        previewGameMomentData.eventTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        previewGameMomentData.maxTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        previewGameMomentData.momentUniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        previewGameMomentData.content = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        previewGameMomentData.gameTagName = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        previewGameMomentData.gameTagId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewGameMomentData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PreviewGameMomentData previewGameMomentData) {
        PreviewGameMomentData previewGameMomentData2 = previewGameMomentData;
        Text text = previewGameMomentData2.content;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = previewGameMomentData2.gameTagName;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final PreviewGameMomentData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewGameMomentData previewGameMomentData, List list) {
    }
}
