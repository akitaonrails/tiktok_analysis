package com.google.gson.internal;

import X.C09CQ;
import X.C2188811AlT;
import X.C2277581ECu;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x {
    public abstract <T> T LIZJ(Class<T> cls);

    public static x LIZIZ() {
        if (!((Boolean) C2277581ECu.LJI.getValue()).booleanValue()) {
            try {
                Class<?> cls = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                return new a(declaredField.get(null), cls.getMethod("allocateInstance", Class.class));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(iIntValue, declaredMethod2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    try {
                        Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod3.setAccessible(true);
                        return new c(declaredMethod3);
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return new d();
                    }
                }
            }
        }
        try {
            C09CQ.LIZLLL();
            return new x() { // from class: X.09D7
                @Override // com.google.gson.internal.x
                public final <T> T LIZJ(Class<T> cls2) {
                    C09CQ.LIZJ(cls2);
                    return (T) C09CQ.LJIIJ.invoke(C09CQ.LJIIIZ, cls2);
                }
            };
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            try {
                Method declaredMethod4 = C09CQ.LJIIJJI;
                if (declaredMethod4 == null) {
                    declaredMethod4 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod4.setAccessible(true);
                    C09CQ.LJIIJJI = declaredMethod4;
                }
                final int iIntValue2 = ((Integer) declaredMethod4.invoke(null, Object.class)).intValue();
                final Method declaredMethod5 = C09CQ.LJIIL;
                if (declaredMethod5 == null) {
                    declaredMethod5 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod5.setAccessible(true);
                    C09CQ.LJIIL = declaredMethod5;
                }
                return new x() { // from class: X.09D8
                    @Override // com.google.gson.internal.x
                    public final <T> T LIZJ(Class<T> cls2) {
                        C09CQ.LIZJ(cls2);
                        return (T) declaredMethod5.invoke(null, cls2, Integer.valueOf(iIntValue2));
                    }
                };
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
                try {
                    final Method declaredMethod6 = C09CQ.LJIILIIL;
                    if (declaredMethod6 == null) {
                        declaredMethod6 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                        declaredMethod6.setAccessible(true);
                        C09CQ.LJIILIIL = declaredMethod6;
                    }
                    return new x() { // from class: X.09D9
                        @Override // com.google.gson.internal.x
                        public final <T> T LIZJ(Class<T> cls2) {
                            C09CQ.LIZJ(cls2);
                            return (T) declaredMethod6.invoke(null, cls2, Object.class);
                        }
                    };
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    return new x() { // from class: X.09DA
                        @Override // com.google.gson.internal.x
                        public final <T> T LIZJ(Class<T> cls2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Cannot allocate ");
                            sbLIZ.append(cls2);
                            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    };
                }
            }
        }
    }

    public final class a extends x {
        public final /* synthetic */ Method LIZ;
        public final /* synthetic */ Object LIZIZ;

        @Override // com.google.gson.internal.x
        public final <T> T LIZJ(Class<T> cls) {
            x.LIZ(cls);
            return (T) this.LIZ.invoke(this.LIZIZ, cls);
        }

        public a(Object obj, Method method) {
            this.LIZ = method;
            this.LIZIZ = obj;
        }
    }

    public final class b extends x {
        public final /* synthetic */ Method LIZ;
        public final /* synthetic */ int LIZIZ;

        @Override // com.google.gson.internal.x
        public final <T> T LIZJ(Class<T> cls) {
            x.LIZ(cls);
            return (T) this.LIZ.invoke(null, cls, Integer.valueOf(this.LIZIZ));
        }

        public b(int i, Method method) {
            this.LIZ = method;
            this.LIZIZ = i;
        }
    }

    public final class c extends x {
        public final /* synthetic */ Method LIZ;

        public c(Method method) {
            this.LIZ = method;
        }

        @Override // com.google.gson.internal.x
        public final <T> T LIZJ(Class<T> cls) {
            x.LIZ(cls);
            return (T) this.LIZ.invoke(null, cls, Object.class);
        }
    }

    public final class d extends x {
        @Override // com.google.gson.internal.x
        public final <T> T LIZJ(Class<T> cls) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot allocate ");
            sbLIZ.append(cls);
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LIZ(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Abstract class can't be instantiated! Class name: ");
            sbLIZ.append(cls.getName());
            throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Interface can't be instantiated! Interface name: ");
        sbLIZ2.append(cls.getName());
        throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
