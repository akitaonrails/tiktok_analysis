package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class ImportVideoInfoDeserializer implements j<ImportVideoInfo> {
    @Override // com.google.gson.j
    public final ImportVideoInfo deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("e");
            if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof q)) {
                nVarLJIILIIL.LJJIJL("e");
                nVarLJIILIIL.LJJIFFI("e", kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
            }
            return (ImportVideoInfo) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, ImportVideoInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
