package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UrlDataStruct_ProtoDecoder implements C0IMD<UrlDataStruct> {
    public static UrlDataStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UrlDataStruct urlDataStruct = new UrlDataStruct();
        urlDataStruct.urlList = new ArrayList();
        urlDataStruct.urlPrefix = new ArrayList();
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
                                    urlDataStruct.urlPrefix.add(C1516700pZU.LIZLLL(c1516680pZS));
                                }
                            } else {
                                urlDataStruct.md5 = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            urlDataStruct.urlSubType = c1516680pZS.LJIIJ();
                        }
                    } else {
                        urlDataStruct.urlList.add(C1516700pZU.LIZLLL(c1516680pZS));
                    }
                } else {
                    urlDataStruct.uri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return urlDataStruct;
            }
        }
    }

    public static void LJ(UrlDataStruct urlDataStruct) {
        if (urlDataStruct.urlList == null) {
            urlDataStruct.urlList = new ArrayList();
        }
        if (urlDataStruct.urlPrefix == null) {
            urlDataStruct.urlPrefix = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(UrlDataStruct urlDataStruct) {
        LJ(urlDataStruct);
    }

    @Override // X.C0IMD
    public final UrlDataStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UrlDataStruct urlDataStruct, List list) {
    }
}
