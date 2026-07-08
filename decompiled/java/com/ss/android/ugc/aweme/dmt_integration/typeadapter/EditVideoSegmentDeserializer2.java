package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C201955140j;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class EditVideoSegmentDeserializer2 implements j<EditVideoSegment> {
    @Override // com.google.gson.j
    public final EditVideoSegment deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("videoPath");
            if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof q)) {
                nVarLJIILIIL.LJJIJL("videoPath");
                nVarLJIILIIL.LJJIFFI("videoPath", kVarLJJIIZ.LJIILIIL().LJJIIZ("path"));
            }
            return (EditVideoSegment) new Gson().LIZJ(nVarLJIILIIL, EditVideoSegment.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditVideoSegmentDeserializer2 error :");
            sbLIZ.append(e);
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
