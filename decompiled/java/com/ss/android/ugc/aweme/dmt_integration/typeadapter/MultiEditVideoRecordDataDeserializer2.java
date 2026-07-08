package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C201955140j;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MultiEditVideoRecordDataDeserializer2 implements j<MultiEditVideoRecordData> {
    @Override // com.google.gson.j
    public final MultiEditVideoRecordData deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("new_concat_video");
            if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof q)) {
                nVarLJIILIIL.LJJIJL("concat_video");
                nVarLJIILIIL.LJJIFFI("concat_video", kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
            }
            k kVarLJJIIZ2 = nVarLJIILIIL.LJJIIZ("concat_video");
            if (kVarLJJIIZ2 != null && !(kVarLJJIIZ2 instanceof q)) {
                nVarLJIILIIL.LJJIJL("concat_video");
                nVarLJIILIIL.LJJIFFI("concat_video", kVarLJJIIZ2.LJIILIIL().LJJIIZ("path"));
            }
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LIZJ(new MultiEditVideoSegmentRecordDataDeserializer2(), MultiEditVideoSegmentRecordData.class);
            return (MultiEditVideoRecordData) eVar.LIZ().LIZJ(nVarLJIILIIL, MultiEditVideoRecordData.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MultiEditVideoRecordDataDeserializer2 error :");
            sbLIZ.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
