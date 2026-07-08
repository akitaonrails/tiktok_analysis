package com.squareup.wire;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.WireEnum;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes21.dex */
public final class RuntimeEnumAdapter<E extends WireEnum> extends EnumAdapter<E> {
    public final Class<E> LIZ;
    public Method LIZIZ;

    public final Method LIZIZ() {
        Method method = this.LIZIZ;
        if (method != null) {
            return method;
        }
        try {
            Method method2 = this.LIZ.getMethod("fromValue", Integer.TYPE);
            this.LIZIZ = method2;
            return method2;
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public int hashCode() {
        return this.LIZ.hashCode();
    }

    public RuntimeEnumAdapter(Class<E> cls) {
        super(cls);
        this.LIZ = cls;
    }

    @Override // com.squareup.wire.EnumAdapter
    public final E LIZ(int i) {
        try {
            return (E) C2204961BRm.a0(LIZIZ(), null, new Object[]{Integer.valueOf(i)}, new C0WZX("dzBzEhErSsvOUEIxCwWNdMpcWI8IXuRpTrRE0u8D8Hio+0Ks", null));
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new AssertionError(e);
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RuntimeEnumAdapter) && ((RuntimeEnumAdapter) obj).LIZ == this.LIZ) {
            return true;
        }
        return false;
    }
}
