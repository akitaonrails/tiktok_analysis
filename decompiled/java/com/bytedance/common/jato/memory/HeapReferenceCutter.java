package com.bytedance.common.jato.memory;

import X.C2104908Ml;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes4.dex */
public class HeapReferenceCutter {
    public static native void nCutReference(Object[] objArr);

    public static native void nReplaceReference(Object[] objArr, Object[] objArr2);

    public static void LIZIZ(Object[] objArr) {
        if (!C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            nCutReference(objArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(Object[] objArr, Object[] objArr2) {
        if (objArr == null || objArr.length == 0 || objArr2 == null || objArr2.length == 0 || objArr2.length != objArr.length || !C2104908Ml.LIZIZ()) {
            return;
        }
        try {
            nReplaceReference(objArr, objArr2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static int ReplaceObjectReference(Object obj, Object obj2, Object obj3) {
        Class<?> superclass;
        int i;
        boolean z;
        Object obj4;
        Object obj5;
        int i2 = 0;
        if (obj == null || obj2 == null) {
            return 0;
        }
        Class<?> cls = obj.getClass();
        int i3 = 5;
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType != null && componentType.isPrimitive()) {
                return 0;
            }
            try {
                int length = Array.getLength(obj);
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    try {
                        if (Array.get(obj, i5) == obj2) {
                            Array.set(obj, i5, obj3);
                            i4++;
                            System.out.println(C786410Ut5.j4("%s, Start replacing array class: %s, index: %d, original object: %s, replaced object: %s", new Object[]{"HeapReferenceCutter", obj.getClass().getName(), Integer.valueOf(i5), obj2, obj3}));
                        }
                    } catch (Throwable th) {
                        th = th;
                        i2 = i4;
                        TryCatchGuardChecker.doCheck(th);
                        return i2;
                    }
                }
                return i4;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (obj instanceof Reference) {
                return 0;
            }
            if (obj instanceof Class) {
                superclass = (Class) obj;
                i = 0;
                z = true;
            } else {
                superclass = obj.getClass();
                i = 0;
                z = false;
            }
            while (superclass != null && superclass != Object.class) {
                Field[] declaredFields = superclass.getDeclaredFields();
                int length2 = declaredFields.length;
                int i6 = 0;
                while (i6 < length2) {
                    Field field = declaredFields[i6];
                    if (!field.getType().isPrimitive() && z == Modifier.isStatic(field.getModifiers())) {
                        try {
                            field.setAccessible(true);
                            if (z) {
                                obj4 = null;
                            } else {
                                obj4 = obj;
                            }
                            if (field.get(obj4) == obj2) {
                                if (z) {
                                    obj5 = null;
                                } else {
                                    obj5 = obj;
                                }
                                field.set(obj5, obj3);
                                i++;
                                try {
                                    Object[] objArr = new Object[i3];
                                    objArr[0] = "HeapReferenceCutter";
                                    objArr[1] = obj;
                                    try {
                                        objArr[2] = field.getName();
                                        try {
                                            objArr[3] = obj2;
                                            try {
                                                objArr[4] = obj3;
                                                System.out.println(C786410Ut5.j4("%s, Start replacing: %s field: %s, original object: %s, replaced object: %s", objArr));
                                            } catch (Throwable th3) {
                                                th = th3;
                                                TryCatchGuardChecker.doCheck(th);
                                                PrintStream printStream = System.out;
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("HeapReferenceCutter replace object failed, msg: ");
                                                sbLIZ.append(th.getMessage());
                                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    }
                    i6++;
                    i3 = 5;
                }
                superclass = superclass.getSuperclass();
            }
            return i;
        }
    }
}
