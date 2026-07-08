package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendedPlaybookInfo_PlaybookBizExtra_ProtoDecoder implements C0IMD<RecommendedPlaybookInfo.PlaybookBizExtra> {
    public static RecommendedPlaybookInfo.PlaybookBizExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtra = new RecommendedPlaybookInfo.PlaybookBizExtra();
        playbookBizExtra.customAtomicCapabilities = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    String strLIZLLL = null;
                    String strLIZLLL2 = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (strLIZLLL != null) {
                        if (strLIZLLL2 != null) {
                            playbookBizExtra.customAtomicCapabilities.put(strLIZLLL, strLIZLLL2);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return playbookBizExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtra) {
        RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtra2 = playbookBizExtra;
        if (playbookBizExtra2.customAtomicCapabilities == null) {
            playbookBizExtra2.customAtomicCapabilities = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final RecommendedPlaybookInfo.PlaybookBizExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtra, List list) {
    }
}
