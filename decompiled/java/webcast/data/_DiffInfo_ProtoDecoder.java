package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DiffInfo_ProtoDecoder implements C0IMD<DiffInfo> {
    public static DiffInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DiffInfo diffInfo = new DiffInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            diffInfo.extra = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        diffInfo.baseUrl = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    diffInfo.diffUrl = _UrlDataStruct_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return diffInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DiffInfo diffInfo) {
        DiffInfo diffInfo2 = diffInfo;
        UrlDataStruct urlDataStruct = diffInfo2.diffUrl;
        if (urlDataStruct != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct);
        }
        UrlDataStruct urlDataStruct2 = diffInfo2.baseUrl;
        if (urlDataStruct2 != null) {
            _UrlDataStruct_ProtoDecoder.LJ(urlDataStruct2);
        }
    }

    @Override // X.C0IMD
    public final DiffInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DiffInfo diffInfo, List list) {
    }
}
