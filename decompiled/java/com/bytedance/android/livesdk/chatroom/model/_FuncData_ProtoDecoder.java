package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FuncData_ProtoDecoder implements C0IMD<FuncData> {
    public static FuncData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FuncData funcData = new FuncData();
        funcData.specialEntrances = new ArrayList();
        funcData.funcConfs = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        funcData.funcConfs.add(_FuncConf_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    funcData.specialEntrances.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return funcData;
            }
        }
    }

    public static void LJ(FuncData funcData) {
        if (funcData.specialEntrances == null) {
            funcData.specialEntrances = new ArrayList();
        }
        List<FuncConf> list = funcData.funcConfs;
        if (list == null) {
            funcData.funcConfs = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<FuncConf> it2 = funcData.funcConfs.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FuncData funcData) {
        LJ(funcData);
    }

    @Override // X.C0IMD
    public final FuncData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FuncData funcData, List list) {
    }
}
