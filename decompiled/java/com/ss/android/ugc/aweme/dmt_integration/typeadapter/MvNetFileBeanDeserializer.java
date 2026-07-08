package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import X.C2346009He;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class MvNetFileBeanDeserializer implements j<MvNetFileBean> {
    @Override // com.google.gson.j
    public final MvNetFileBean deserialize(k kVar, Type type, i iVar) {
        try {
            n nVarLJIILIIL = kVar.LJIILIIL();
            C2346009He.LIZJ(nVarLJIILIIL, "photo_path");
            C2346009He.LIZJ(nVarLJIILIIL, "filePath");
            return (MvNetFileBean) new Gson().LIZJ(nVarLJIILIIL, MvNetFileBean.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
