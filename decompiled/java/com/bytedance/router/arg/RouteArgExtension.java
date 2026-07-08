package com.bytedance.router.arg;

import X.C01GW;
import X.C098200Yq;
import X.C189200o6;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1294060jmO;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class RouteArgExtension {
    public static final RouteArgExtension INSTANCE = new RouteArgExtension();

    public static final class RouteArgLazy<T> extends RouteArgLifecycle<T> implements C01GW<T> {
        public final Function0<Bundle> bundleGetter;
        public final Class<T> cls;
        public final Function1<Boolean, T> defaultInvoker;
        public final String key;

        @Override // X.C01GW
        public T getValue() {
            T cached = getCached();
            if (cached != null) {
                return cached;
            }
            try {
                ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                T tInvoke = bundleParam.result;
                if (tInvoke == null) {
                    tInvoke = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                }
                setCached(tInvoke);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (getCached() == null) {
                setCached(this.defaultInvoker.invoke(Boolean.FALSE));
            }
            return getCached();
        }

        @Override // X.C01GW
        public boolean isInitialized() {
            return getCached() != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazy(LifecycleOwner lifecycleOwner, Function0<Bundle> function0, String str, Class<T> cls, Function1<? super Boolean, ? extends T> function1) {
            super(lifecycleOwner);
            this.bundleGetter = function0;
            this.key = str;
            this.cls = cls;
            this.defaultInvoker = function1;
        }
    }

    public static final class RouteArgLazyNullable<T> extends RouteArgLifecycle<T> implements C01GW<T> {
        public final Function0<Bundle> bundleGetter;
        public final Class<T> cls;
        public final Function1<Boolean, T> defaultInvoker;
        public final String key;

        @Override // X.C01GW
        public T getValue() {
            T cached = getCached();
            if (cached != null) {
                return cached;
            }
            try {
                ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                T tInvoke = bundleParam.result;
                if (tInvoke == null) {
                    tInvoke = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                }
                setCached(tInvoke);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (getCached() == null) {
                setCached(this.defaultInvoker.invoke(Boolean.FALSE));
            }
            return getCached();
        }

        @Override // X.C01GW
        public boolean isInitialized() {
            return getCached() != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazyNullable(LifecycleOwner lifecycleOwner, Function0<Bundle> function0, String str, Class<T> cls, Function1<? super Boolean, ? extends T> function1) {
            super(lifecycleOwner);
            this.bundleGetter = function0;
            this.key = str;
            this.cls = cls;
            this.defaultInvoker = function1;
        }
    }

    public static final class RouteArgLazyRequired<T> extends RouteArgLifecycle<T> implements C01GW<T> {
        public final Function0<Bundle> bundleGetter;
        public final Class<T> cls;
        public final Function0<T> defaultInvoker;
        public final String key;

        @Override // X.C01GW
        public T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    T tInvoke = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls).result;
                    if (tInvoke == null) {
                        Function0<T> function0 = this.defaultInvoker;
                        tInvoke = function0 != null ? function0.invoke() : null;
                    }
                    setCached(tInvoke);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                cached = getCached();
                if (cached == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("miss param for ");
                    sbLIZ.append(this.key);
                    sbLIZ.append(", please pass by intent or defaultValue ");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalArgumentException(strLIZIZ);
                }
            }
            return cached;
        }

        @Override // X.C01GW
        public boolean isInitialized() {
            return getCached() != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazyRequired(LifecycleOwner lifecycleOwner, Function0<Bundle> function0, String str, Class<T> cls, Function0<? extends T> function02) {
            super(lifecycleOwner);
            this.bundleGetter = function0;
            this.key = str;
            this.cls = cls;
            this.defaultInvoker = function02;
        }
    }

    public static class RouteArgNavLazy<T extends IRouteArg> extends RouteArgLifecycle<T> implements C01GW<T> {
        public final Function0<Bundle> bundleGetter;
        public final Function0<T> defaultValueGetter;
        public final WeakReference<LifecycleOwner> owner;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
        @Override // X.C01GW
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T getValue() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            /*
                r7 = this;
                java.lang.Object r0 = r7.getCached()
                com.bytedance.router.annotation.IRouteArg r0 = (com.bytedance.router.annotation.IRouteArg) r0
                if (r0 != 0) goto L6a
                kotlin.jvm.functions.Function0<android.os.Bundle> r0 = r7.bundleGetter
                java.lang.Object r6 = r0.invoke()
                android.os.Bundle r6 = (android.os.Bundle) r6
                r0 = 0
                if (r6 == 0) goto L6f
                java.lang.String r1 = "smart_key_route_arg"
                android.os.Parcelable r2 = r6.getParcelable(r1)
            L1a:
                boolean r1 = r2 instanceof com.bytedance.router.annotation.IRouteArg
                if (r1 == 0) goto L20
                if (r2 != 0) goto L50
            L20:
                java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r1 = r7.owner
                if (r1 == 0) goto L6d
                java.lang.Object r1 = r1.get()
                if (r1 == 0) goto L6d
                java.lang.Class r2 = r1.getClass()
                com.bytedance.router.arg.SmartRouteArgManager r1 = com.bytedance.router.arg.SmartRouteArgManager.INSTANCE
                java.lang.Class r5 = r1.getArgClassByClazz(r2)
                if (r5 == 0) goto L6b
                r4 = 1
                java.lang.Class[] r2 = new java.lang.Class[r4]
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                r3 = 0
                r2[r3] = r1
                java.lang.String r1 = "__fromBundle"
                java.lang.reflect.Method r2 = r5.getMethod(r1, r2)
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r1[r3] = r6
                java.lang.Object r2 = r2.invoke(r0, r1)
                boolean r1 = r2 instanceof com.bytedance.router.annotation.IRouteArg
                if (r1 == 0) goto L6b
            L50:
                r7.setCached(r2)
                java.lang.Object r1 = r7.getCached()
                if (r1 != 0) goto L64
                kotlin.jvm.functions.Function0<T extends com.bytedance.router.annotation.IRouteArg> r1 = r7.defaultValueGetter
                if (r1 == 0) goto L61
                java.lang.Object r0 = r1.invoke()
            L61:
                r7.setCached(r0)
            L64:
                java.lang.Object r0 = r7.getCached()
                com.bytedance.router.annotation.IRouteArg r0 = (com.bytedance.router.annotation.IRouteArg) r0
            L6a:
                return r0
            L6b:
                r2 = r0
                goto L50
            L6d:
                r2 = r0
                goto L50
            L6f:
                r2 = r0
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.arg.RouteArgExtension.RouteArgNavLazy.getValue():com.bytedance.router.annotation.IRouteArg");
        }

        @Override // X.C01GW
        public boolean isInitialized() {
            return getCached() != null;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgNavLazy(WeakReference<LifecycleOwner> weakReference, Function0<? extends T> function0, Function0<Bundle> function02) {
            LifecycleOwner lifecycleOwner;
            if (weakReference != null) {
                lifecycleOwner = weakReference.get();
            } else {
                lifecycleOwner = null;
            }
            super(lifecycleOwner);
            this.owner = weakReference;
            this.defaultValueGetter = function0;
            this.bundleGetter = function02;
        }
    }

    public static final class ParamResult<T> {
        public final boolean isPutNull;
        public final T result;

        public final boolean isPutNull() {
            return this.isPutNull;
        }

        public ParamResult(T t, boolean z) {
            this.result = t;
            this.isPutNull = z;
        }
    }

    public static class RouteArgLifecycle<T> {
        public T cached;

        public final T getCached() {
            return this.cached;
        }

        public RouteArgLifecycle(LifecycleOwner lifecycleOwner) {
            if (lifecycleOwner != null) {
                RouteArgInjector.INSTANCE.register(lifecycleOwner, new AwS579S0100000_35(this, 115));
            }
        }

        public final void setCached(T t) {
            this.cached = t;
        }
    }

    public final <T extends IRouteArg> C01GW<T> navArg(Activity activity) {
        return new RouteArgNavLazy(new WeakReference(activity), null, new AwS550S0100000_6(activity, 22));
    }

    public final <T> C01GW<T> requiredArg(Activity activity) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.requiredArg.1
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    public final <T extends IRouteArg> C01GW<T> navArg(Fragment fragment) {
        return new RouteArgNavLazy(new WeakReference(fragment), null, new AwS563S0100000_19(fragment, 63));
    }

    public final <T> C01GW<T> requiredArg(Fragment fragment) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.requiredArg.4
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    public static Object INVOKEVIRTUAL_com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final <T extends IRouteArg> C01GW<T> navArg(Activity activity, Function0<? extends T> function0) {
        return new RouteArgNavLazy(new WeakReference(activity), function0, new AwS550S0100000_6(activity, 23));
    }

    public final <T> C01GW<T> optionalArg(Activity activity, Function1<? super Boolean, ? extends T> function1) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.optionalArg.1
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("optionalArg is illegal");
            }
        };
    }

    public final <T> C01GW<T> optionalArgNotNull(Activity activity, Function1<? super Boolean, ? extends T> function1) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.optionalArgNotNull.1
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("optionalArgNotNull is illegal");
            }
        };
    }

    public final <T> C01GW<T> requiredArg(Activity activity, Function0<? extends T> function0) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.requiredArg.2
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    public final void withNavArg(Fragment fragment, IRouteArg iRouteArg) {
        if (fragment.getArguments() == null) {
            fragment.setArguments(new Bundle());
        }
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            C786410Ut5.LJJIJL(arguments, "smart_key_route_arg", iRouteArg);
        }
    }

    public final <T extends IRouteArg> C01GW<T> navArg(Fragment fragment, Function0<? extends T> function0) {
        return new RouteArgNavLazy(new WeakReference(fragment), function0, new AwS548S0100000_4(fragment, 40));
    }

    public final <T> C01GW<T> optionalArg(Fragment fragment, Function1<? super Boolean, ? extends T> function1) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.optionalArg.3
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("optionalArg is illegal");
            }
        };
    }

    public final <T> C01GW<T> optionalArgNotNull(Fragment fragment, Function1<? super Boolean, ? extends T> function1) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.optionalArgNotNull.3
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("optionalArgNotNull is illegal");
            }
        };
    }

    public final <T> C01GW<T> requiredArg(Fragment fragment, Function0<? extends T> function0) {
        return new C01GW<T>() { // from class: com.bytedance.router.arg.RouteArgExtension.requiredArg.5
            @Override // X.C01GW
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C01GW
            public T getValue() throws IllegalAccessException {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        return new com.bytedance.router.arg.RouteArgExtension.ParamResult<>(r1, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.bytedance.router.arg.RouteArgExtension.ParamResult<T> getBundleParam(android.os.Bundle r5, java.lang.String r6, java.lang.Class<T> r7) {
        /*
            r4 = this;
            r3 = 0
            r2 = 0
            if (r5 == 0) goto L2e
            boolean r0 = r5.containsKey(r6)
            if (r0 == 0) goto L2e
            java.lang.Object r1 = INVOKEVIRTUAL_com_bytedance_router_arg_RouteArgExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get(r5, r6)
            if (r1 == 0) goto L2d
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L22
            com.bytedance.router.arg.RouteParser r0 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r1 = r0.parse(r1, r7)
            if (r1 == 0) goto L2d
        L1c:
            com.bytedance.router.arg.RouteArgExtension$ParamResult r0 = new com.bytedance.router.arg.RouteArgExtension$ParamResult
            r0.<init>(r1, r2)
            return r0
        L22:
            java.lang.Class r0 = r1.getClass()
            boolean r0 = r7.isAssignableFrom(r0)
            if (r0 == 0) goto L2d
            goto L1c
        L2d:
            r2 = 1
        L2e:
            com.bytedance.router.arg.RouteArgExtension$ParamResult r0 = new com.bytedance.router.arg.RouteArgExtension$ParamResult
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.arg.RouteArgExtension.getBundleParam(android.os.Bundle, java.lang.String, java.lang.Class):com.bytedance.router.arg.RouteArgExtension$ParamResult");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public final <T> C01GW<T> optionalArg(Activity activity, Function1<? super Boolean, ? extends T> function1, String str, Class<T> cls) {
        LifecycleOwner lifecycleOwner;
        if (activity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activity;
        } else {
            lifecycleOwner = null;
        }
        return new RouteArgLazyNullable(lifecycleOwner, new AwS548S0100000_4(activity, 41), str, cls, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public final <T> C01GW<T> optionalArgNotNull(Activity activity, Function1<? super Boolean, ? extends T> function1, String str, Class<T> cls) {
        LifecycleOwner lifecycleOwner;
        if (activity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activity;
        } else {
            lifecycleOwner = null;
        }
        return new RouteArgLazy(lifecycleOwner, new AwS557S0100000_13(activity, 25), str, cls, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public final <T> C01GW<T> requiredArg(Activity activity, Function0<? extends T> function0, String str, Class<T> cls) {
        LifecycleOwner lifecycleOwner;
        if (activity instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) activity;
        } else {
            lifecycleOwner = null;
        }
        return new RouteArgLazyRequired(lifecycleOwner, new AwS562S0100000_18(activity, 84), str, cls, function0);
    }

    @InterfaceC1294060jmO
    public final <T> C01GW<T> optionalArg(Fragment fragment, Function1<? super Boolean, ? extends T> function1, String str, Class<T> cls) {
        Fragment fragment2;
        if (fragment instanceof LifecycleOwner) {
            fragment2 = fragment;
        } else {
            fragment2 = null;
        }
        return new RouteArgLazyNullable(fragment2, new AwS556S0100000_12(fragment, 363), str, cls, function1);
    }

    @InterfaceC1294060jmO
    public final <T> C01GW<T> optionalArgNotNull(Fragment fragment, Function1<? super Boolean, ? extends T> function1, String str, Class<T> cls) {
        Fragment fragment2;
        if (fragment instanceof LifecycleOwner) {
            fragment2 = fragment;
        } else {
            fragment2 = null;
        }
        return new RouteArgLazy(fragment2, new AwS563S0100000_19(fragment, 64), str, cls, function1);
    }

    @InterfaceC1294060jmO
    public final <T> C01GW<T> requiredArg(Fragment fragment, Function0<? extends T> function0, String str, Class<T> cls) {
        Fragment fragment2;
        if (fragment instanceof LifecycleOwner) {
            fragment2 = fragment;
        } else {
            fragment2 = null;
        }
        return new RouteArgLazyRequired(fragment2, new AwS560S0100000_16(fragment, 46), str, cls, function0);
    }
}
