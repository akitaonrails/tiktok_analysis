package com.bytedance.sdui.render.tasm.behavior.utils;

import X.C1291290jhv;
import X.C2188811AlT;
import X.InterfaceC1291270jht;
import X.InterfaceC1291280jhu;
import X.InterfaceC1314540kJQ;
import com.bytedance.sdui.render.bridge.ReadableArray;
import com.bytedance.sdui.render.bridge.ReadableMap;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public class e {
    public static final Map<Class, Map<String, j>> LIZ = new ConcurrentHashMap();
    public static final Map<String, j> LIZIZ = new HashMap();

    public static class a extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return c1291290jhv.LIZ(this.LIZ);
        }

        public a(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }

        public a(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i) {
            super(interfaceC1291280jhu, method, i);
        }
    }

    public static class b extends j {
        public final boolean LJFF;

        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            if (c1291290jhv.LIZIZ(this.LIZ, this.LJFF)) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public b(InterfaceC1291270jht interfaceC1291270jht, Method method, boolean z) {
            super(interfaceC1291270jht, method);
            this.LJFF = z;
        }
    }

    public static class c extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            if (!c1291290jhv.LJIIIIZZ(this.LIZ)) {
                if (c1291290jhv.LIZIZ(this.LIZ, false)) {
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return null;
        }

        public c(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }
    }

    public static class d extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            if (!c1291290jhv.LJIIIIZZ(this.LIZ)) {
                return Integer.valueOf(c1291290jhv.LJFF(this.LIZ, 0));
            }
            return null;
        }

        public d(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }

        public d(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i) {
            super(interfaceC1291280jhu, method, i);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdui.render.tasm.behavior.utils.e$e, reason: collision with other inner class name */
    public static class C0009e extends j {
        public final double LJFF;

        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return Double.valueOf(c1291290jhv.LIZJ(this.LIZ, this.LJFF));
        }

        public C0009e(InterfaceC1291270jht interfaceC1291270jht, Method method, double d) {
            super(interfaceC1291270jht, method);
            this.LJFF = d;
        }

        public C0009e(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i, double d) {
            super(interfaceC1291280jhu, method, i);
            this.LJFF = d;
        }
    }

    public static class f extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return c1291290jhv.LIZLLL(this.LIZ);
        }

        public f(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }

        public f(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i) {
            super(interfaceC1291280jhu, method, i);
        }
    }

    public static class g extends j {
        public final float LJFF;

        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return Float.valueOf(c1291290jhv.LJ(this.LIZ, this.LJFF));
        }

        public g(InterfaceC1291270jht interfaceC1291270jht, Method method, float f) {
            super(interfaceC1291270jht, method);
            this.LJFF = f;
        }

        public g(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i, float f) {
            super(interfaceC1291280jhu, method, i);
            this.LJFF = f;
        }
    }

    public static class h extends j {
        public final int LJFF;

        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return Integer.valueOf(c1291290jhv.LJFF(this.LIZ, this.LJFF));
        }

        public h(InterfaceC1291270jht interfaceC1291270jht, Method method, int i) {
            super(interfaceC1291270jht, method);
            this.LJFF = i;
        }

        public h(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i, int i2) {
            super(interfaceC1291280jhu, method, i);
            this.LJFF = i2;
        }
    }

    public static class i extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return c1291290jhv.LIZ.getMap(this.LIZ);
        }

        public i(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }
    }

    public static class k extends j {
        @Override // com.bytedance.sdui.render.tasm.behavior.utils.e.j
        public final Object LIZ(C1291290jhv c1291290jhv) {
            return c1291290jhv.LJI(this.LIZ);
        }

        public k(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            super(interfaceC1291270jht, method);
        }

        public k(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i) {
            super(interfaceC1291280jhu, method, i);
        }
    }

    public static Map<String, j> LIZ(Class<? extends SDUIBaseUI> cls) {
        Class<? super Object> superclass;
        Object iVar;
        if (cls == null) {
            return LIZIZ;
        }
        Map<String, j> map = (Map) ((ConcurrentHashMap) LIZ).get(cls);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        if (cls == SDUIBaseUI.class) {
            superclass = null;
        } else {
            superclass = cls.getSuperclass();
        }
        map2.putAll(LIZ(superclass));
        Method[] declaredMethods = cls.getDeclaredMethods();
        int length = declaredMethods.length;
        char c2 = 0;
        int i2 = 0;
        while (i2 < length) {
            Method method = declaredMethods[i2];
            InterfaceC1291270jht interfaceC1291270jht = (InterfaceC1291270jht) method.getAnnotation(InterfaceC1291270jht.class);
            if (interfaceC1291270jht != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    String strName = interfaceC1291270jht.name();
                    Class<?> cls2 = parameterTypes[c2];
                    if (cls2 == InterfaceC1314540kJQ.class) {
                        iVar = new f(interfaceC1291270jht, method);
                    } else if (cls2 == Boolean.TYPE) {
                        iVar = new b(interfaceC1291270jht, method, interfaceC1291270jht.defaultBoolean());
                    } else if (cls2 == Integer.TYPE) {
                        iVar = new h(interfaceC1291270jht, method, interfaceC1291270jht.defaultInt());
                    } else if (cls2 == Float.TYPE) {
                        iVar = new g(interfaceC1291270jht, method, interfaceC1291270jht.defaultFloat());
                    } else if (cls2 == Double.TYPE) {
                        iVar = new C0009e(interfaceC1291270jht, method, interfaceC1291270jht.defaultDouble());
                    } else if (cls2 == String.class) {
                        iVar = new k(interfaceC1291270jht, method);
                    } else if (cls2 == Boolean.class) {
                        iVar = new c(interfaceC1291270jht, method);
                    } else if (cls2 == Integer.class) {
                        iVar = new d(interfaceC1291270jht, method);
                    } else if (cls2 == ReadableArray.class) {
                        iVar = new a(interfaceC1291270jht, method);
                    } else if (cls2 == ReadableMap.class) {
                        iVar = new i(interfaceC1291270jht, method);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unrecognized type: ");
                        sbLIZ.append(cls2);
                        sbLIZ.append(" for method: ");
                        sbLIZ.append(method.getDeclaringClass().getName());
                        sbLIZ.append("#");
                        sbLIZ.append(method.getName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    map2.put(strName, iVar);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Wrong number of args for prop setter: ");
                    sbLIZ2.append(cls.getName());
                    sbLIZ2.append("#");
                    sbLIZ2.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            InterfaceC1291280jhu interfaceC1291280jhu = (InterfaceC1291280jhu) method.getAnnotation(InterfaceC1291280jhu.class);
            if (interfaceC1291280jhu != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length == 2) {
                    Class<?> cls3 = parameterTypes2[c2];
                    Class<?> cls4 = Integer.TYPE;
                    if (cls3 == cls4) {
                        Class<?> cls5 = parameterTypes2[1];
                        String[] strArrNames = interfaceC1291280jhu.names();
                        if (cls5 == InterfaceC1314540kJQ.class) {
                            for (int i3 = 0; i3 < strArrNames.length; i3++) {
                                map2.put(strArrNames[i3], new f(interfaceC1291280jhu, method, i3));
                            }
                        } else if (cls5 == cls4) {
                            for (int i4 = 0; i4 < strArrNames.length; i4++) {
                                map2.put(strArrNames[i4], new h(interfaceC1291280jhu, method, i4, interfaceC1291280jhu.defaultInt()));
                            }
                        } else if (cls5 == Float.TYPE) {
                            for (int i5 = 0; i5 < strArrNames.length; i5++) {
                                map2.put(strArrNames[i5], new g(interfaceC1291280jhu, method, i5, interfaceC1291280jhu.defaultFloat()));
                            }
                        } else if (cls5 == Double.TYPE) {
                            for (int i6 = 0; i6 < strArrNames.length; i6++) {
                                map2.put(strArrNames[i6], new C0009e(interfaceC1291280jhu, method, i6, interfaceC1291280jhu.defaultDouble()));
                            }
                        } else if (cls5 == Integer.class) {
                            for (int i7 = 0; i7 < strArrNames.length; i7++) {
                                map2.put(strArrNames[i7], new d(interfaceC1291280jhu, method, i7));
                            }
                        } else if (cls5 == String.class) {
                            for (int i8 = 0; i8 < strArrNames.length; i8++) {
                                map2.put(strArrNames[i8], new k(interfaceC1291280jhu, method, i8));
                            }
                        } else if (cls5 == ReadableArray.class) {
                            for (int i9 = 0; i9 < strArrNames.length; i9++) {
                                map2.put(strArrNames[i9], new a(interfaceC1291280jhu, method, i9));
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Unrecognized type: ");
                            sbLIZ3.append(cls5);
                            sbLIZ3.append(" for method: ");
                            sbLIZ3.append(method.getDeclaringClass().getName());
                            sbLIZ3.append("#");
                            sbLIZ3.append(method.getName());
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Second argument should be property index: ");
                        sbLIZ4.append(cls.getName());
                        sbLIZ4.append("#");
                        sbLIZ4.append(method.getName());
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Wrong number of args for group prop setter: ");
                    sbLIZ5.append(cls.getName());
                    sbLIZ5.append("#");
                    sbLIZ5.append(method.getName());
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ5));
                }
            }
            i2++;
            c2 = 0;
        }
        ((ConcurrentHashMap) LIZ).put(cls, map2);
        return map2;
    }

    public static abstract class j {
        public final String LIZ;
        public final Method LIZIZ;
        public final Integer LIZJ;
        public final Object[] LIZLLL;
        public final Object[] LJ;

        public abstract Object LIZ(C1291290jhv c1291290jhv);

        public j(InterfaceC1291270jht interfaceC1291270jht, Method method) {
            this.LIZLLL = new Object[1];
            this.LJ = new Object[2];
            this.LIZ = interfaceC1291270jht.name();
            if (!"__default_type__".equals(interfaceC1291270jht.customType())) {
                interfaceC1291270jht.customType();
            }
            this.LIZIZ = method;
            this.LIZJ = null;
        }

        public j(InterfaceC1291280jhu interfaceC1291280jhu, Method method, int i) {
            this.LIZLLL = new Object[1];
            this.LJ = new Object[2];
            this.LIZ = interfaceC1291280jhu.names()[i];
            if (!"__default_type__".equals(interfaceC1291280jhu.customType())) {
                interfaceC1291280jhu.customType();
            }
            this.LIZIZ = method;
            this.LIZJ = Integer.valueOf(i);
        }
    }
}
