package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftFullInfo_ProtoDecoder implements C0IMD<CollabGiftFullInfo> {
    public static CollabGiftFullInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftFullInfo collabGiftFullInfo = new CollabGiftFullInfo();
        collabGiftFullInfo.userInfo = new HashMap();
        collabGiftFullInfo.stages = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                Object objLIZLLL = null;
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        CollabGiftContributor collabGiftContributorLIZLLL = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    collabGiftContributorLIZLLL = _CollabGiftContributor_ProtoDecoder.LIZLLL(c1516680pZS);
                                }
                            } else {
                                objLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (objLIZLLL != null) {
                            if (collabGiftContributorLIZLLL != null) {
                                collabGiftFullInfo.userInfo.put((String) objLIZLLL, collabGiftContributorLIZLLL);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long jLIZJ3 = c1516680pZS.LIZJ();
                    CollabGiftStage collabGiftStageLIZLLL = null;
                    while (true) {
                        int iLJI3 = c1516680pZS.LJI();
                        if (iLJI3 == -1) {
                            break;
                        }
                        if (iLJI3 != 1) {
                            if (iLJI3 == 2) {
                                collabGiftStageLIZLLL = _CollabGiftStage_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            objLIZLLL = Long.valueOf(c1516680pZS.LJIIJJI());
                        }
                    }
                    c1516680pZS.LJ(jLIZJ3);
                    if (objLIZLLL != null) {
                        if (collabGiftStageLIZLLL != null) {
                            collabGiftFullInfo.stages.put((Long) objLIZLLL, collabGiftStageLIZLLL);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftFullInfo;
            }
        }
    }

    public static void LJ(CollabGiftFullInfo collabGiftFullInfo) {
        Map<Long, CollabGiftStage> map = collabGiftFullInfo.stages;
        if (map == null) {
            collabGiftFullInfo.stages = new HashMap();
        } else if (!map.isEmpty()) {
            Iterator<Map.Entry<Long, CollabGiftStage>> it2 = collabGiftFullInfo.stages.entrySet().iterator();
            while (it2.hasNext()) {
                CollabGiftStage value = it2.next().getValue();
                if (value != null && value.contributors == null) {
                    value.contributors = new ArrayList();
                }
            }
        }
        Map<String, CollabGiftContributor> map2 = collabGiftFullInfo.userInfo;
        if (map2 == null) {
            collabGiftFullInfo.userInfo = new HashMap();
        } else {
            if (map2.isEmpty()) {
                return;
            }
            Iterator<Map.Entry<String, CollabGiftContributor>> it3 = collabGiftFullInfo.userInfo.entrySet().iterator();
            while (it3.hasNext()) {
                it3.next().getValue();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CollabGiftFullInfo collabGiftFullInfo) {
        LJ(collabGiftFullInfo);
    }

    @Override // X.C0IMD
    public final CollabGiftFullInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftFullInfo collabGiftFullInfo, List list) {
    }
}
