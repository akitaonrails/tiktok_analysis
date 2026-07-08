package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C0CHQ;
import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes35.dex */
public final class AVUploadSaveModelDeserializer implements j<AVUploadSaveModel> {
    @Override // com.google.gson.j
    public final AVUploadSaveModel deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "local_final_path");
            return (AVUploadSaveModel) C0CHQ.LIZ().LJJIJL().LIZJ(nVarLJIILIIL, AVUploadSaveModel.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
