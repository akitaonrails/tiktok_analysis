package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _JoinDirectContent_ProtoDecoder implements C0IMD<JoinDirectContent> {
    public static JoinDirectContent LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        JoinDirectContent joinDirectContent = new JoinDirectContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        joinDirectContent.allUsers = _AllListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    joinDirectContent.joiner = _LinkLayerListUser_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return joinDirectContent;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(JoinDirectContent joinDirectContent) {
        AllListUser allListUser = joinDirectContent.allUsers;
        if (allListUser != null) {
            _AllListUser_ProtoDecoder.LJ(allListUser);
        }
    }

    @Override // X.C0IMD
    public final JoinDirectContent LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, JoinDirectContent joinDirectContent, List list) {
    }
}
