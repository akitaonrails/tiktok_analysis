package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.match.RecommendedPlaybookInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _RecommendedPlaybookInfo_ProtoDecoder implements C0IMD<RecommendedPlaybookInfo> {
    public static RecommendedPlaybookInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RecommendedPlaybookInfo recommendedPlaybookInfo = new RecommendedPlaybookInfo();
        recommendedPlaybookInfo.playbookBizExtras = new HashMap();
        recommendedPlaybookInfo.playbookIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        Long lValueOf = null;
                        RecommendedPlaybookInfo.PlaybookBizExtra playbookBizExtraLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    playbookBizExtraLIZLLL = _RecommendedPlaybookInfo_PlaybookBizExtra_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lValueOf = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (lValueOf != null) {
                            if (playbookBizExtraLIZLLL != null) {
                                recommendedPlaybookInfo.playbookBizExtras.put(lValueOf, playbookBizExtraLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    recommendedPlaybookInfo.playbookIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return recommendedPlaybookInfo;
            }
        }
    }

    public static void LJ(RecommendedPlaybookInfo recommendedPlaybookInfo) {
        if (recommendedPlaybookInfo.playbookIds == null) {
            recommendedPlaybookInfo.playbookIds = new ArrayList();
        }
        Map<Long, RecommendedPlaybookInfo.PlaybookBizExtra> map = recommendedPlaybookInfo.playbookBizExtras;
        if (map == null) {
            recommendedPlaybookInfo.playbookBizExtras = new HashMap();
            return;
        }
        if (map.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<Long, RecommendedPlaybookInfo.PlaybookBizExtra>> it2 = recommendedPlaybookInfo.playbookBizExtras.entrySet().iterator();
        while (it2.hasNext()) {
            RecommendedPlaybookInfo.PlaybookBizExtra value = it2.next().getValue();
            if (value != null && value.customAtomicCapabilities == null) {
                value.customAtomicCapabilities = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RecommendedPlaybookInfo recommendedPlaybookInfo) {
        LJ(recommendedPlaybookInfo);
    }

    @Override // X.C0IMD
    public final RecommendedPlaybookInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RecommendedPlaybookInfo recommendedPlaybookInfo, List list) {
    }
}
