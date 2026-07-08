package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _IceShowdownInfo_ProtoDecoder implements C0IMD<IceShowdownInfo> {
    public static IceShowdownInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        IceShowdownInfo iceShowdownInfo = new IceShowdownInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            iceShowdownInfo.startTimeMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        iceShowdownInfo.promptTimeMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    iceShowdownInfo.settingType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return iceShowdownInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final IceShowdownInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(IceShowdownInfo iceShowdownInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, IceShowdownInfo iceShowdownInfo, List list) {
    }
}
