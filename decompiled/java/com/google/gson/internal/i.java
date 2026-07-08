package com.google.gson.internal;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements t {
    public final /* synthetic */ Constructor LIZ;

    @Override // com.google.gson.internal.t
    public final Object LIZ() {
        try {
            return this.LIZ.newInstance(null);
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to invoke ");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" with no args");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e2);
        } catch (InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Failed to invoke ");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(" with no args");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e3.getTargetException());
        }
    }

    public i(Constructor constructor) {
        this.LIZ = constructor;
    }
}
