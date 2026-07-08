package com.ss.android.ugc.aweme.memory.profiler.strategy;

import android.view.View;
import com.ss.android.ugc.aweme.memory.profiler.core.HprofBridge;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class LynxProfiler {
    public static boolean isOpen;
    public static volatile LynxProfilerListener listener;
    public static final LynxProfiler INSTANCE = new LynxProfiler();
    public static final List<WeakReference<View>> lynxViewWeakRefs = new ArrayList();
    public static final LinkedHashSet<String> detachedIdSet = new LinkedHashSet<>();
    public static final int $stable = 8;

    public interface LynxProfilerListener {
        void onCheck(Map<String, LinkedHashSet<String>> map, Set<String> set);

        void onCreate(String str, String str2, String str3);

        void onDetached(String str);

        void onReattached(String str);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void checkLynxViewReference() {
        /*
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.List<java.lang.ref.WeakReference<android.view.View>> r0 = com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.lynxViewWeakRefs
            java.util.Iterator r7 = r0.iterator()
        L10:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r0 = r7.next()
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r5 = r0.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 != 0) goto L28
            r7.remove()
            goto L10
        L28:
            boolean r0 = r5 instanceof X.InterfaceC1541990qEH
            if (r0 == 0) goto L87
            r6 = r5
            X.0qEH r6 = (X.InterfaceC1541990qEH) r6
            X.0q70 r0 = r6.getHybridContext()
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.LJIJI()
            if (r0 == 0) goto L6a
            java.lang.String r0 = X.C01CJ.LIZIZ(r0)
            java.lang.String r2 = X.C01CJ.LIZ(r0)
            if (r2 == 0) goto L6a
            int r0 = r2.length()
            if (r0 == 0) goto L6a
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r2)
            java.lang.String r0 = "_hasDestroyed_"
            r1.append(r0)
            boolean r0 = r6.T0()
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
        L62:
            if (r2 == 0) goto L6a
            int r0 = r2.length()
            if (r0 != 0) goto L6c
        L6a:
            java.lang.String r2 = "IKitView (unknown)"
        L6c:
            java.lang.String r1 = X.C2095108Ir.LIZ(r5)
            java.lang.Object r0 = r4.get(r2)
            if (r0 != 0) goto L7e
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r4.put(r2, r0)
        L7e:
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r1)
            r3.add(r1)
            goto L10
        L87:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " (unknown)"
            r1.append(r0)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r1)
            goto L62
        La0:
            com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler$LynxProfilerListener r0 = com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.listener
            if (r0 == 0) goto La7
            r0.onCheck(r4, r3)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.memory.profiler.strategy.LynxProfiler.checkLynxViewReference():void");
    }

    public static final void start() {
        if (isOpen) {
            return;
        }
        isOpen = true;
    }

    public static final void stop() {
        if (isOpen) {
            isOpen = false;
            detachedIdSet.clear();
        }
    }

    public static final boolean isOpen() {
        return isOpen;
    }

    public static final void onAttached(String str) {
        LynxProfilerListener lynxProfilerListener;
        if (detachedIdSet.remove(str) && (lynxProfilerListener = listener) != null) {
            lynxProfilerListener.onReattached(str);
        }
    }

    public static final void onDetached(String str) {
        detachedIdSet.add(str);
        LynxProfilerListener lynxProfilerListener = listener;
        if (lynxProfilerListener != null) {
            lynxProfilerListener.onDetached(str);
        }
    }

    public static final void setListener(LynxProfilerListener lynxProfilerListener) {
        listener = lynxProfilerListener;
    }

    public static final void onCreate(View view, String str, String str2, String str3) {
        LynxProfilerListener lynxProfilerListener = listener;
        if (lynxProfilerListener != null) {
            lynxProfilerListener.onCreate(str, str2, str3);
        }
        lynxViewWeakRefs.add(new WeakReference<>(view));
        HprofBridge.register(view);
    }
}
