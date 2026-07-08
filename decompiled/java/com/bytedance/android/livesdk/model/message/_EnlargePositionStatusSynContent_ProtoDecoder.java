package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common._LinkerMediaChangeOperator_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EnlargePositionStatusSynContent_ProtoDecoder implements C0IMD<EnlargePositionStatusSynContent> {
    public static EnlargePositionStatusSynContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnlargePositionStatusSynContent enlargePositionStatusSynContent = new EnlargePositionStatusSynContent();
        enlargePositionStatusSynContent.linkedUserUiPositions = new ArrayList();
        enlargePositionStatusSynContent.enlargedPositions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        enlargePositionStatusSynContent.isEnlarge = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        enlargePositionStatusSynContent.targetPosition = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        enlargePositionStatusSynContent.scene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        enlargePositionStatusSynContent.operatorInfo = _LinkerMediaChangeOperator_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        enlargePositionStatusSynContent.layoutId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        enlargePositionStatusSynContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        enlargePositionStatusSynContent.enlargedPositions.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 8:
                        enlargePositionStatusSynContent.targetPosIdentity = _PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enlargePositionStatusSynContent;
            }
        }
    }

    public static void LJ(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        if (enlargePositionStatusSynContent.linkedUserUiPositions == null) {
            enlargePositionStatusSynContent.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = enlargePositionStatusSynContent.enlargedPositions;
        if (list == null) {
            enlargePositionStatusSynContent.enlargedPositions = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PosIdentity> it2 = enlargePositionStatusSynContent.enlargedPositions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnlargePositionStatusSynContent enlargePositionStatusSynContent) {
        LJ(enlargePositionStatusSynContent);
    }

    @Override // X.C0IMD
    public final EnlargePositionStatusSynContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnlargePositionStatusSynContent enlargePositionStatusSynContent, List list) {
    }
}
