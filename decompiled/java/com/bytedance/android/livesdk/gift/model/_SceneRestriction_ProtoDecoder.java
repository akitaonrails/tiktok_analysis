package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SceneRestriction_ProtoDecoder implements C0IMD<SceneRestriction> {
    public static SceneRestriction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SceneRestriction sceneRestriction = new SceneRestriction();
        sceneRestriction.matchHiddenGids = new ArrayList();
        sceneRestriction.cohostHiddenGids = new ArrayList();
        sceneRestriction.normalHiddenGids = new ArrayList();
        sceneRestriction.multiguestHiddenGids = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                sceneRestriction.multiguestHiddenGids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                            }
                        } else {
                            sceneRestriction.cohostHiddenGids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        }
                    } else {
                        sceneRestriction.matchHiddenGids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                    }
                } else {
                    sceneRestriction.normalHiddenGids.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sceneRestriction;
            }
        }
    }

    public static void LJ(SceneRestriction sceneRestriction) {
        if (sceneRestriction.normalHiddenGids == null) {
            sceneRestriction.normalHiddenGids = new ArrayList();
        }
        if (sceneRestriction.matchHiddenGids == null) {
            sceneRestriction.matchHiddenGids = new ArrayList();
        }
        if (sceneRestriction.cohostHiddenGids == null) {
            sceneRestriction.cohostHiddenGids = new ArrayList();
        }
        if (sceneRestriction.multiguestHiddenGids == null) {
            sceneRestriction.multiguestHiddenGids = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SceneRestriction sceneRestriction) {
        LJ(sceneRestriction);
    }

    @Override // X.C0IMD
    public final SceneRestriction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SceneRestriction sceneRestriction, List list) {
    }
}
