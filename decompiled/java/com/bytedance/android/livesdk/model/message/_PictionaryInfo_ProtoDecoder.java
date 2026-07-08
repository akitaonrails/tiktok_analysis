package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PictionaryInfo_ProtoDecoder implements C0IMD<PictionaryInfo> {
    public static PictionaryInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PictionaryInfo pictionaryInfo = new PictionaryInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        pictionaryInfo.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        pictionaryInfo.word = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        pictionaryInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        pictionaryInfo.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        pictionaryInfo.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        pictionaryInfo.sessionId = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        pictionaryInfo.drawUrl = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        pictionaryInfo.pictionaryType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return pictionaryInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PictionaryInfo pictionaryInfo) {
        ImageModel imageModel = pictionaryInfo.drawUrl;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final PictionaryInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PictionaryInfo pictionaryInfo, List list) {
    }
}
