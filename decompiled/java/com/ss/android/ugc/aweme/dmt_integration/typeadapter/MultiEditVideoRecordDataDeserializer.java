package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiEditVideoRecordDataDeserializer implements j<MultiEditVideoRecordData> {
    @Override // com.google.gson.j
    public final MultiEditVideoRecordData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "concat_video");
            C2346009He.LIZLLL(nVarLJIILIIL, "concat_video", "new_concat_video");
            return (MultiEditVideoRecordData) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, MultiEditVideoRecordData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
