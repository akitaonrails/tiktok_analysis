package webcast.api.sub;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FormInfo_ProtoDecoder implements C0IMD<FormInfo> {
    public static FormInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FormInfo formInfo = new FormInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 5) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                formInfo.skuId = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            formInfo.formId = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        formInfo.schema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    formInfo.serviceInfo = _ServiceInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return formInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FormInfo formInfo) {
    }

    @Override // X.C0IMD
    public final FormInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FormInfo formInfo, List list) {
    }
}
