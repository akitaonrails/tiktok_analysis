package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _DynamicRestriction_ProtoDecoder implements C0IMD<DynamicRestriction> {
    public static DynamicRestriction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        DynamicRestriction dynamicRestriction = new DynamicRestriction();
        dynamicRestriction.receivers = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        dynamicRestriction.receivers.add(_ReceiverRestriction_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    dynamicRestriction.scenes = _SceneRestriction_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return dynamicRestriction;
            }
        }
    }

    public static void LJ(DynamicRestriction dynamicRestriction) {
        SceneRestriction sceneRestriction = dynamicRestriction.scenes;
        if (sceneRestriction != null) {
            _SceneRestriction_ProtoDecoder.LJ(sceneRestriction);
        }
        List<ReceiverRestriction> list = dynamicRestriction.receivers;
        if (list == null) {
            dynamicRestriction.receivers = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ReceiverRestriction receiverRestriction : dynamicRestriction.receivers) {
            if (receiverRestriction != null && receiverRestriction.hiddenGids == null) {
                receiverRestriction.hiddenGids = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(DynamicRestriction dynamicRestriction) {
        LJ(dynamicRestriction);
    }

    @Override // X.C0IMD
    public final DynamicRestriction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, DynamicRestriction dynamicRestriction, List list) {
    }
}
