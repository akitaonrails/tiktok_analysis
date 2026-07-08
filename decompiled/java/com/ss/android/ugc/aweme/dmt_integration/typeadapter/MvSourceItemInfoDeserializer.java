package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MvSourceItemInfoDeserializer implements j<MvSourceItemInfo> {
    @Override // com.google.gson.j
    public final MvSourceItemInfo deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "photo_path");
            C2346009He.LIZJ(nVarLJIILIIL, "source");
            C2346009He.LIZJ(nVarLJIILIIL, "origin_file_path");
            return (MvSourceItemInfo) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, MvSourceItemInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
