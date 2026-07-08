package webcast.data.multi_guest_play;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderRecordInfo_ProtoDecoder implements C0IMD<TextHeaderRecordInfo> {
    public static TextHeaderRecordInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderRecordInfo textHeaderRecordInfo = new TextHeaderRecordInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        textHeaderRecordInfo.textHeaderMaterialInfo = _TextHeaderMaterialInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        textHeaderRecordInfo.reviewStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        textHeaderRecordInfo.mediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        textHeaderRecordInfo.recordId = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        textHeaderRecordInfo.originMediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        textHeaderRecordInfo.originRecordId = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return textHeaderRecordInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TextHeaderRecordInfo textHeaderRecordInfo) {
    }

    @Override // X.C0IMD
    public final TextHeaderRecordInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderRecordInfo textHeaderRecordInfo, List list) {
    }
}
