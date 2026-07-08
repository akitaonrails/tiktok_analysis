package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.AnchorPreFinishData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _AnchorPreFinishData_ConfirmBox_ProtoDecoder implements C0IMD<AnchorPreFinishData.ConfirmBox> {
    public static AnchorPreFinishData.ConfirmBox LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        AnchorPreFinishData.ConfirmBox confirmBox = new AnchorPreFinishData.ConfirmBox();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        confirmBox.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        confirmBox.value = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        confirmBox.schemaTitle = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        confirmBox.uniqueId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        confirmBox.content = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        confirmBox.confirmText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        confirmBox.cancelText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        confirmBox.schemaJumpLink = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return confirmBox;
            }
        }
    }

    @Override // X.C0IMD
    public final AnchorPreFinishData.ConfirmBox LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(AnchorPreFinishData.ConfirmBox confirmBox) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorPreFinishData.ConfirmBox confirmBox, List list) {
    }
}
