package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.ContentPosition;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common._ContentPosition_ProtoDecoder;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _ChangeLayoutResp_ProtoDecoder implements C0IMD<ChangeLayoutResp> {
    @Override // X.C0IMD
    public final void LIZ(ChangeLayoutResp changeLayoutResp) {
        ChangeLayoutResp changeLayoutResp2 = changeLayoutResp;
        LinkMicCommonResp linkMicCommonResp = changeLayoutResp2.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
        List<UserPosition> list = changeLayoutResp2.userPosition;
        if (list == null) {
            changeLayoutResp2.userPosition = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<UserPosition> it2 = changeLayoutResp2.userPosition.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (changeLayoutResp2.linkedUserUiPositions == null) {
            changeLayoutResp2.linkedUserUiPositions = new ArrayList();
        }
        List<ContentPosition> list2 = changeLayoutResp2.contentPos;
        if (list2 == null) {
            changeLayoutResp2.contentPos = new ArrayList();
        } else if (!list2.isEmpty()) {
            Iterator<ContentPosition> it3 = changeLayoutResp2.contentPos.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
        List<PosIdentity> list3 = changeLayoutResp2.uiPos;
        if (list3 == null) {
            changeLayoutResp2.uiPos = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<PosIdentity> it4 = changeLayoutResp2.uiPos.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
        }
    }

    @Override // X.C0IMD
    public final ChangeLayoutResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ChangeLayoutResp changeLayoutResp = new ChangeLayoutResp();
        changeLayoutResp.linkedUserUiPositions = new ArrayList();
        changeLayoutResp.userPosition = new ArrayList();
        changeLayoutResp.uiPos = new ArrayList();
        changeLayoutResp.contentPos = new ArrayList();
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
                                    changeLayoutResp.uiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                                }
                            } else {
                                changeLayoutResp.contentPos.add(_ContentPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            changeLayoutResp.linkedUserUiPositions.add(C1516700pZU.LIZLLL(c1516680pZS));
                        }
                    } else {
                        changeLayoutResp.userPosition.add(_UserPosition_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    changeLayoutResp.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return changeLayoutResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ChangeLayoutResp changeLayoutResp, List list) {
    }
}
