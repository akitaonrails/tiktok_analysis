package com.bytedance.retrofit2;

import X.AbstractC2343909Gj;
import X.AbstractC2394709Zx;
import X.AbstractC2396209aC;
import X.C09S8;
import X.C09SJ;
import X.C0X06;
import X.C1494570ozn;
import X.C2395309a3;
import X.C2395709a7;
import X.C2396109aB;
import X.InterfaceC1494860p0G;
import X.InterfaceC1501660pBE;
import X.InterfaceC1904907d9;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class Retrofit {
    public static volatile CopyOnWriteArrayList<InterfaceC1904907d9> LJIIIZ;
    public final Map<Method, AbstractC2396209aC<?>> LIZ = new ConcurrentHashMap();
    public final InterfaceC1494860p0G LIZIZ;
    public final C0X06 LIZJ;
    public final List<AbstractC2343909Gj> LIZLLL;
    public final List<C09S8> LJ;
    public final Executor LJFF;
    public final boolean LJI;
    public final Executor LJII;
    public final List<InterfaceC1904907d9> LJIIIIZZ;

    public final <T> T LIZ(final Class<T> cls) {
        if (cls.isInterface()) {
            if (cls.getInterfaces().length <= 0) {
                if (this.LJI) {
                    C2395309a3 c2395309a3 = C2395309a3.LIZ;
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!c2395309a3.LJ(method) && !Modifier.isStatic(method.getModifiers())) {
                            loadServiceMethod(method);
                        }
                    }
                }
                return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(cls) { // from class: X.09a4
                    public final C2395309a3 LL = C2395309a3.LIZ;
                    public final Object[] LLILLJJLI = new Object[0];

                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        if (method2.getDeclaringClass() == Object.class) {
                            return C2204961BRm.a0(method2, this, objArr, new C0WZX("dzBzEgAjS8/YVFkiQFyWY6+XRXBuTsTGjpVngceCPUc=", null));
                        }
                        if (!this.LL.LJ(method2)) {
                            AbstractC2396209aC<?> abstractC2396209aCLoadServiceMethod = this.LLILLL.loadServiceMethod(method2);
                            if (objArr == null) {
                                objArr = this.LLILLJJLI;
                            }
                            return abstractC2396209aCLoadServiceMethod.LIZ(objArr);
                        }
                        this.LL.getClass();
                        throw new UnsupportedOperationException();
                    }
                });
            }
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public AbstractC2396209aC<?> loadServiceMethod(Method method) {
        AbstractC2396209aC<?> abstractC2396209aCLIZIZ;
        AbstractC2396209aC<?> abstractC2396209aC = (AbstractC2396209aC) ((ConcurrentHashMap) this.LIZ).get(method);
        if (abstractC2396209aC != null) {
            if (abstractC2396209aC instanceof AbstractC2394709Zx) {
                C1494570ozn c1494570ozn = new C1494570ozn();
                c1494570ozn.LJFF(true);
                ((AbstractC2394709Zx) abstractC2396209aC).LIZ.setRetrofitMetrics(c1494570ozn);
            }
            return abstractC2396209aC;
        }
        synchronized (this.LIZ) {
            try {
                abstractC2396209aCLIZIZ = (AbstractC2396209aC) ((ConcurrentHashMap) this.LIZ).get(method);
                if (abstractC2396209aCLIZIZ == null) {
                    C1494570ozn c1494570ozn2 = new C1494570ozn();
                    c1494570ozn2.LJFF(false);
                    abstractC2396209aCLIZIZ = AbstractC2396209aC.LIZIZ(this, method, c1494570ozn2);
                    ((ConcurrentHashMap) this.LIZ).put(method, abstractC2396209aCLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return abstractC2396209aCLIZIZ;
    }

    public final <T> InterfaceC1501660pBE<T, Object> LIZJ(Type type, Annotation[] annotationArr) {
        C2396109aB.LIZ(type, "type == null");
        C2396109aB.LIZ(annotationArr, "annotations == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1501660pBE<T, Object> interfaceC1501660pBELIZJ = ((AbstractC2343909Gj) ListProtector.get(this.LIZLLL, i)).LIZJ(type);
            if (interfaceC1501660pBELIZJ != null) {
                return interfaceC1501660pBELIZJ;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public final <T> InterfaceC1501660pBE<TypedInput, T> LJ(Type type, Annotation[] annotationArr) {
        C2396109aB.LIZ(type, "type == null");
        C2396109aB.LIZ(annotationArr, "annotations == null");
        int iIndexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1501660pBE<TypedInput, T> interfaceC1501660pBE = (InterfaceC1501660pBE<TypedInput, T>) ((AbstractC2343909Gj) ListProtector.get(this.LIZLLL, i)).LJ(type, annotationArr, this);
            if (interfaceC1501660pBE != null) {
                return interfaceC1501660pBE;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypedInput converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC1501660pBE<T, String> LJFF(Type type, Annotation[] annotationArr) {
        C2396109aB.LIZ(type, "type == null");
        C2396109aB.LIZ(annotationArr, "annotations == null");
        int size = this.LIZLLL.size();
        for (int i = 0; i < size; i++) {
            InterfaceC1501660pBE<T, String> interfaceC1501660pBELJFF = ((AbstractC2343909Gj) ListProtector.get(this.LIZLLL, i)).LJFF(type);
            if (interfaceC1501660pBELJFF != null) {
                return interfaceC1501660pBELJFF;
            }
        }
        return new InterfaceC1501660pBE<Object, String>() { // from class: X.09Dn
            @Override // X.InterfaceC1501660pBE
            public final String LIZ(Object obj) {
                return obj.toString();
            }
        };
    }

    public final C09SJ<?, ?> LIZIZ(C09S8 c09s8, Type type, Annotation[] annotationArr) {
        C2396109aB.LIZ(type, "returnType == null");
        C2396109aB.LIZ(annotationArr, "annotations == null");
        int iIndexOf = this.LJ.indexOf(c09s8) + 1;
        int size = this.LJ.size();
        for (int i = iIndexOf; i < size; i++) {
            C09SJ<?, ?> c09sjLIZ = ((C09S8) ListProtector.get(this.LJ, i)).LIZ(type, annotationArr, this);
            if (c09sjLIZ != null) {
                return c09sjLIZ;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (c09s8 != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < iIndexOf; i2++) {
                sb.append("\n   * ");
                sb.append(ListProtector.get(this.LJ, i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.LJ.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LJ, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> InterfaceC1501660pBE<T, TypedOutput> LIZLLL(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        C2396109aB.LIZ(type, "type == null");
        C2396109aB.LIZ(annotationArr, "parameterAnnotations == null");
        C2396109aB.LIZ(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.LIZLLL.indexOf(null) + 1;
        int size = this.LIZLLL.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC1501660pBE<T, TypedOutput> interfaceC1501660pBE = (InterfaceC1501660pBE<T, TypedOutput>) ((AbstractC2343909Gj) ListProtector.get(this.LIZLLL, i)).LIZLLL(type, annotationArr, annotationArr2, this);
            if (interfaceC1501660pBE != null) {
                return interfaceC1501660pBE;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = this.LIZLLL.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(ListProtector.get(this.LIZLLL, iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Retrofit(C2395709a7 c2395709a7, InterfaceC1494860p0G interfaceC1494860p0G, List list, List list2, List list3, Executor executor, Executor executor2) {
        new ConcurrentHashMap();
        this.LIZJ = c2395709a7;
        this.LIZIZ = interfaceC1494860p0G;
        this.LJIIIIZZ = list;
        this.LIZLLL = Collections.unmodifiableList(list2);
        this.LJ = Collections.unmodifiableList(list3);
        this.LJII = executor;
        this.LJFF = executor2;
        this.LJI = false;
    }
}
