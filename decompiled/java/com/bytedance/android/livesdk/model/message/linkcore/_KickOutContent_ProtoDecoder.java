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
public final class _KickOutContent_ProtoDecoder implements C0IMD<KickOutContent> {
    public static KickOutContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        KickOutContent kickOutContent = new KickOutContent();
        kickOutContent.linkedUserUiPositions = new ArrayList();
        kickOutContent.uiPos = new ArrayList();
        kickOutContent.spotList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        kickOutContent.leftUser = _Player_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        kickOutContent.kickOutReason = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        kickOutContent.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 4:
                        kickOutContent.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        kickOutContent.layout = _LayoutState_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        kickOutContent.spotList.add(_SpotInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        kickOutContent.offlinerLinkerSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return kickOutContent;
            }
        }
    }

    public static void LJ(KickOutContent kickOutContent) {
        if (kickOutContent.linkedUserUiPositions == null) {
            kickOutContent.linkedUserUiPositions = new ArrayList();
        }
        List<PosIdentity> list = kickOutContent.uiPos;
        if (list == null) {
            kickOutContent.uiPos = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<PosIdentity> it2 = kickOutContent.uiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        LayoutState layoutState = kickOutContent.layout;
        if (layoutState != null) {
            _LayoutState_ProtoDecoder.LJ(layoutState);
        }
        List<SpotInfo> list2 = kickOutContent.spotList;
        if (list2 == null) {
            kickOutContent.spotList = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (SpotInfo spotInfo : kickOutContent.spotList) {
            if (spotInfo != null) {
                _SpotInfo_ProtoDecoder.LJ(spotInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(KickOutContent kickOutContent) {
        LJ(kickOutContent);
    }

    @Override // X.C0IMD
    public final KickOutContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KickOutContent kickOutContent, List list) {
    }
}
