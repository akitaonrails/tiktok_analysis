package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendBoardInfo_ProtoDecoder implements C0IMD<RecommendBoardInfo> {
    public static RecommendBoardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendBoardInfo recommendBoardInfo = new RecommendBoardInfo();
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
                                    recommendBoardInfo.businessIntent = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                recommendBoardInfo.sourcePb = _SourcePB_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            recommendBoardInfo.recommendReason = _RecommendReason_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        recommendBoardInfo.boardSource = c1516680pZS.LJIIJ();
                    }
                } else {
                    recommendBoardInfo.recommendBoardId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendBoardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendBoardInfo recommendBoardInfo) {
    }

    @Override // X.C0IMD
    public final RecommendBoardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendBoardInfo recommendBoardInfo, List list) {
    }
}
