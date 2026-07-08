package com.sun.jna;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes31.dex */
public abstract class VarArgsChecker {
    public abstract int fixedArgs(Method method);

    public abstract boolean isVarArgs(Method method);

    public static VarArgsChecker create() {
        try {
            return Method.class.getMethod("isVarArgs", new Class[0]) != null ? new RealVarArgsChecker() : new NoVarArgsChecker();
        } catch (NoSuchMethodException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return new NoVarArgsChecker();
        }
    }

    public static final class NoVarArgsChecker extends VarArgsChecker {
        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return false;
        }

        public NoVarArgsChecker() {
        }
    }

    public static final class RealVarArgsChecker extends VarArgsChecker {
        public RealVarArgsChecker() {
        }

        @Override // com.sun.jna.VarArgsChecker
        public int fixedArgs(Method method) {
            if (method.isVarArgs()) {
                return method.getParameterTypes().length - 1;
            }
            return 0;
        }

        @Override // com.sun.jna.VarArgsChecker
        public boolean isVarArgs(Method method) {
            return method.isVarArgs();
        }
    }

    public VarArgsChecker() {
    }
}
