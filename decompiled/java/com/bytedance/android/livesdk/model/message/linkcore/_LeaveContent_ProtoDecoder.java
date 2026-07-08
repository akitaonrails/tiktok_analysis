package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;
import tikcast.linkmic.common._SpotInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveContent_ProtoDecoder implements C0IMD<LeaveContent> {
    public static LeaveContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LeaveContent leaveContent = new LeaveContent();
        leaveContent.linkedUserUiPositions = new ArrayList();
        leaveContent.uiPos = new ArrayList();
        leaveContent.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        leaveContent.leftUser = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        leaveContent.leaveReason = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        leaveContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        leaveContent.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        leaveContent.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        leaveContent.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        leaveContent.leaverLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leaveContent;
            }
        }
    }

    public static void LJ(LeaveContent leaveContent) {
        if (leaveContent.linkedUserUiPositions == null) {
            leaveContent.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = leaveContent.uiPos;
        if (list == null) {
            leaveContent.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = leaveContent.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = leaveContent.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = leaveContent.spotList;
        if (list2 == null) {
            leaveContent.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : leaveContent.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LeaveContent leaveContent) {
        LJ(leaveContent);
    }

    @Override // X.C0IMD
    public final LeaveContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveContent leaveContent, List list) {
    }
}
