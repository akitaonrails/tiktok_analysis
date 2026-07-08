package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes30.dex */
public final class EditPreviewInfoDeserializer implements j<EditPreviewInfo> {
    @Override // com.google.gson.j
    public final EditPreviewInfo deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZ(nVarLJIILIIL, "reverseVideoArray");
            C2346009He.LIZ(nVarLJIILIIL, "tempVideoArray");
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LIZJ(new EditVideoSegmentDeserializer(), EditVideoSegment.class);
            return (EditPreviewInfo) eVar.LIZ().LIZJ(nVarLJIILIIL, EditPreviewInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
