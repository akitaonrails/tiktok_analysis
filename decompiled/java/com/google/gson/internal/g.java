package com.google.gson.internal;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements t<Object> {
    public final x LIZ = x.LIZIZ();
    public final /* synthetic */ Class LIZIZ;
    public final /* synthetic */ Type LIZJ;

    @Override // com.google.gson.internal.t
    public final Object LIZ() {
        try {
            return this.LIZ.LIZJ(this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to invoke no-args constructor for ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public g(Class cls, Type type) {
        this.LIZIZ = cls;
        this.LIZJ = type;
    }
}
