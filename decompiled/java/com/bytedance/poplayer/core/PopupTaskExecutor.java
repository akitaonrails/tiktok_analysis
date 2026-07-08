package com.bytedance.poplayer.core;

import X.AbstractC1563340qmi;
import X.AbstractC20656215sG;
import X.C01GW;
import X.C098200Yq;
import X.C0WZX;
import X.C13LP;
import X.C1565730qqZ;
import X.C16H8;
import X.C16HO;
import X.C189200o6;
import X.C199Y;
import X.C19EG;
import X.C1C7U;
import X.C20651915rZ;
import X.C20656115sF;
import X.C20656615sK;
import X.C20657515sT;
import X.C20659515sn;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.C688120Qyw;
import X.C786410Ut5;
import X.EnumC20656715sL;
import X.EnumC20656815sM;
import X.EnumC20656915sN;
import X.EnumC20657015sO;
import X.EnumC20657115sP;
import X.EnumC682280QpW;
import X.InterfaceC1600600rko;
import X.InterfaceC20658015sY;
import X.InterfaceC20658115sZ;
import X.InterfaceC20658915sh;
import X.InterfaceC20659015si;
import X.InterfaceC20660415sw;
import X.InterfaceC20660515sx;
import X.InterfaceRunnableC20659215sk;
import X.RunnableC20655715sB;
import Y.ARunnableS131S0100000_31;
import Y.ARunnableS39S0400000_31;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.poplayer.IPopupTask;
import com.bytedance.poplayer.IStandardPopupTask;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupTaskExecutor implements InterfaceRunnableC20659215sk, Function2<EnumC20657015sO, EnumC20657015sO, Unit> {
    public static final Method LLIZLLLIL;
    public static final Method LLJ;
    public static final Method LLJI;
    public final C688120Qyw LL;
    public final InterfaceC20658015sY LLILLJJLI;
    public final CopyOnWriteArrayList<C20656115sF> LLILLL;
    public volatile boolean LLILZ;
    public final AtomicBoolean LLILZIL = new AtomicBoolean(true);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C20657515sT());
    public C20656115sF LLIZ;

    static {
        Method method;
        Method method2;
        Method method3;
        Method[] declaredMethods = IPopupTask.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            method = null;
            if (i2 >= length) {
                method2 = null;
                break;
            }
            method2 = declaredMethods[i2];
            if (Intrinsics.LJFF(method2.getName(), "getRootView")) {
                break;
            } else {
                i2++;
            }
        }
        LLIZLLLIL = method2;
        Method[] declaredMethods2 = IStandardPopupTask.class.getDeclaredMethods();
        int length2 = declaredMethods2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length2) {
                method3 = null;
                break;
            }
            method3 = declaredMethods2[i3];
            if (Intrinsics.LJFF(method3.getName(), "showRootView")) {
                break;
            } else {
                i3++;
            }
        }
        LLJ = method3;
        Method[] declaredMethods3 = IStandardPopupTask.class.getDeclaredMethods();
        int length3 = declaredMethods3.length;
        while (true) {
            if (i >= length3) {
                break;
            }
            Method method4 = declaredMethods3[i];
            if (Intrinsics.LJFF(method4.getName(), "getRealShowView")) {
                method = method4;
                break;
            }
            i++;
        }
        LLJI = method;
    }

    public final void LIZ() {
        if (this.LLILZIL.get()) {
            CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList = this.LLILLL;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<C20656115sF> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    EnumC20657015sO state = it2.next().LLILZLL.getState();
                    if (state == EnumC20657015sO.PENDING || state == EnumC20657015sO.SHOWED) {
                        return;
                    }
                }
            }
            this.LLILZIL.set(false);
            ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
            PopupManager.LJIILL(this.LLILLJJLI);
            for (C20656115sF c20656115sF : this.LLILLL) {
                c20656115sF.getClass();
                c20656115sF.LLILZLL = C20659515sn.LL;
            }
            C786410Ut5.LJJZZIII((Handler) this.LLILZLL.getValue(), new Runnable() { // from class: X.15sD
                public static void LIZ() {
                    InterfaceC20658015sY next;
                    CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList2 = PopupManager.LJFF;
                    if (copyOnWriteArrayList2.isEmpty()) {
                        C20651915rZ.LIZ("startPendingList: empty, pop show finish");
                        return;
                    }
                    Iterator<InterfaceC20658015sY> it3 = copyOnWriteArrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            if (next.Xu()) {
                                break;
                            }
                        }
                    }
                    InterfaceC20658015sY interfaceC20658015sY = next;
                    if (interfaceC20658015sY == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("startPendingList: no active scene in pending(size=");
                        sbLIZ.append(PopupManager.LJFF.size());
                        sbLIZ.append(')');
                        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("startPendingList: trigger scene=");
                    sbLIZ2.append(interfaceC20658015sY.getSceneId());
                    sbLIZ2.append(" remaining_pending=");
                    CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList3 = PopupManager.LJFF;
                    sbLIZ2.append(copyOnWriteArrayList3.size() - 1);
                    C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    PopupManager.LJIILLIIL(interfaceC20658015sY);
                    copyOnWriteArrayList3.remove(interfaceC20658015sY);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PopupTaskExecutor@ad7d.ends$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PopupTaskExecutor@ad7d.ends$1");
                }
            });
        }
    }

    public final void LJIIJ() {
        Object c098200Yq;
        synchronized (this.LLILLL) {
            try {
                LIZ();
                try {
                    c098200Yq = (C20656115sF) C13LP.LJJJLL(this.LLILLL);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C20656115sF c20656115sF = (C20656115sF) c098200Yq;
                this.LLIZ = c20656115sF;
                if (c20656115sF != null) {
                    this.LLILLL.remove(c20656115sF);
                    C688120Qyw c688120QywLJIIIIZZ = LJIIIIZZ(c20656115sF);
                    if (c688120QywLJIIIIZZ != null) {
                        LIZLLL(c20656115sF, c688120QywLJIIIIZZ);
                    } else {
                        LJIIJ();
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    @Override // X.InterfaceRunnableC20659215sk
    public final boolean isRunning() {
        return this.LLILZIL.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("PopupTaskExecutor@ad7d.run");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executor.run: scene=");
        sbLIZ.append(this.LLILLJJLI.getSceneId());
        sbLIZ.append(" task_count=");
        sbLIZ.append(this.LLILLL.size());
        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIIJ();
        C1C7U.LIZIZ("PopupTaskExecutor@ad7d.run");
    }

    public final void LJFF() {
        PopupManager.LIZLLL().LJIIIZ.execute(new Runnable() { // from class: X.10na
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PopupTaskExecutor@ad7d.onTaskWrapperFinished$1");
                try {
                    this.LL.LJIIJ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PopupTaskExecutor@ad7d.onTaskWrapperFinished$1");
            }
        });
    }

    @Override // X.InterfaceRunnableC20659215sk
    public final void interrupt() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI.getSceneId());
        sbLIZ.append(" is interrupted.");
        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZ = true;
        this.LLILZIL.set(false);
        for (C20656115sF c20656115sF : this.LLILLL) {
            c20656115sF.getClass();
            c20656115sF.LLILZLL = C20659515sn.LL;
        }
    }

    public static boolean LIZIZ(InterfaceC20660415sw interfaceC20660415sw) {
        C19EG c19egLIZIZ;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        C688120Qyw c688120QywI2;
        C19EG c19egLIZIZ2;
        C688120Qyw c688120QywI22 = interfaceC20660415sw.i2();
        Lifecycle.State currentState = null;
        if (c688120QywI22 != null) {
            c19egLIZIZ = c688120QywI22.LIZIZ();
        } else {
            c19egLIZIZ = null;
        }
        if (c19egLIZIZ != null && (!PopupManager.LIZLLL().LJIIJ || (c688120QywI2 = interfaceC20660415sw.i2()) == null || (c19egLIZIZ2 = c688120QywI2.LIZIZ()) == null || !c19egLIZIZ2.isDestroyed())) {
            C688120Qyw c688120QywI23 = interfaceC20660415sw.i2();
            if (c688120QywI23 != null && (lifecycleOwner = c688120QywI23.LIZIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                currentState = lifecycle.getCurrentState();
            }
            if (currentState != Lifecycle.State.DESTROYED) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e A[Catch: all -> 0x006c, TryCatch #1 {all -> 0x006c, blocks: (B:3:0x0005, B:5:0x0009, B:7:0x0011, B:8:0x0017, B:10:0x0020, B:12:0x0026, B:14:0x0034, B:16:0x0040, B:20:0x0054, B:22:0x005c, B:24:0x0060, B:18:0x004e, B:26:0x0069), top: B:42:0x0005 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final X.C688120Qyw LJIIIIZZ(X.C20656115sF r9) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.poplayer.core.PopupTaskExecutor.LJIIIIZZ(X.15sF):X.0Qyw");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0330 A[PHI: r9
      0x0330: PHI (r9v1 boolean) = (r9v3 boolean), (r9v4 boolean) binds: [B:23:0x0093, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final X.C20656115sF r11, final X.C688120Qyw r12) {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.poplayer.core.PopupTaskExecutor.LIZLLL(X.15sF, X.0Qyw):void");
    }

    public final void LJIIIZ(final C20656115sF c20656115sF, final C688120Qyw c688120Qyw) throws Throwable {
        Object objA0;
        Object objA02;
        C20656615sK stateWrapper = c20656115sF.LLILZLL.getStateWrapper();
        synchronized (stateWrapper) {
            ((ArrayList) stateWrapper.LIZIZ).add(this);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task=");
        sbLIZ.append(c20656115sF.LLILLJJLI);
        sbLIZ.append(" showPopLayer");
        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (PopupManager.LJIIIIZZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("task=");
            sbLIZ2.append(c20656115sF.LLILLJJLI);
            sbLIZ2.append(" show failed: manager_stopped");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c20656115sF.LLIZLLLIL.LIZIZ[EnumC20656915sN.ALL.ordinal()] = System.currentTimeMillis();
        PopupManager.LIZLLL().LJIIIZ.execute(new Runnable() { // from class: X.15sA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MobHelper@b873.mobPopupShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MobHelper@b873.mobPopupShow$1");
            }

            public final void LIZ() {
                Function2<String, HashMap<String, String>, Unit> function2 = PopupManager.LIZLLL().LJIIIIZZ;
                if (function2 != null) {
                    C20656115sF c20656115sF2 = c20656115sF;
                    HashMap<String, String> map = new HashMap<>();
                    C20655815sC.LIZ.put(c20656115sF2.LLILLJJLI, Long.valueOf(System.currentTimeMillis()));
                    map.put("use_pop_sdk", "1");
                    map.put("task_id", c20656115sF2.LLILLJJLI);
                    map.put("distance_launch", String.valueOf(System.currentTimeMillis() - PopupManager.LIZ));
                    InterfaceC20647615qs interfaceC20647615qs = (InterfaceC20647615qs) c20656115sF2.LLILZLL.getClass().getAnnotation(InterfaceC20647615qs.class);
                    if (interfaceC20647615qs != null) {
                        map.put("popup_key", interfaceC20647615qs.value());
                    }
                    map.put("element_label", c20656115sF2.LLILZLL.elementLabel);
                    map.put("trigger_id", c20656115sF2.LLILZLL.triggerId);
                    c20656115sF2.LLIZLLLIL.LIZ(map);
                    function2.invoke("popup_show", map);
                }
                InterfaceC20655515s9 interfaceC20655515s9 = PopupManager.LIZLLL().LJII;
                if (interfaceC20655515s9 != null) {
                    C20656115sF c20656115sF3 = c20656115sF;
                    interfaceC20655515s9.LIZIZ(c20656115sF3.LLILZLL, c688120Qyw, c20656115sF3.LLIZ);
                }
            }
        });
        InterfaceC20658115sZ interfaceC20658115sZ = PopupManager.LIZLLL().LJI;
        if (interfaceC20658115sZ != null) {
            interfaceC20658115sZ.LIZIZ(c20656115sF.LLILZLL);
        }
        AbstractC20656215sG abstractC20656215sG = c20656115sF.LLILZLL;
        Iterator<InterfaceC20658915sh> it2 = PopupManager.LJIILJJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(abstractC20656215sG);
        }
        ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
        PopupManager.LJIIIZ(c20656115sF.LLILZLL, true);
        InterfaceC20660515sx interfaceC20660515sx = c20656115sF.LLILZLL;
        if (interfaceC20660515sx instanceof InterfaceC20659015si) {
            interfaceC20660515sx.getStateWrapper().LIZJ();
            InterfaceC20660515sx interfaceC20660515sx2 = c20656115sF.LLILZLL;
            ((InterfaceC20659015si) interfaceC20660515sx2).LJFF(c688120Qyw, interfaceC20660515sx2.getStateWrapper());
            PopupManager.LJ.add(c20656115sF.LLILZLL.getId());
            return;
        }
        View view = null;
        if (interfaceC20660515sx instanceof IPopupTask) {
            Object objShowPopup = ((IPopupTask) interfaceC20660515sx).showPopup(c688120Qyw);
            if (objShowPopup == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("task=");
                sbLIZ3.append(c20656115sF.LLILLJJLI);
                sbLIZ3.append(" show failed: showPopup_returns_null");
                C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                c20656115sF.LLILZLL.getStateWrapper().LIZIZ();
                LJFF();
                return;
            }
            Method method = LLIZLLLIL;
            if (method != null) {
                objA02 = C2204961BRm.a0(method, c20656115sF.LLILZLL, new Object[]{objShowPopup}, new C0WZX("dzBzEgAjS8/YVFkiQFyUaTx+nDE3uF1zoslidQ4UDVt7WdPfIPAVKZPsJiuJ", null));
            } else {
                objA02 = null;
            }
            if (objA02 instanceof View) {
                view = (View) objA02;
            }
            c20656115sF.LLILZLL.getStateWrapper().LIZJ();
            PopupManager.LJ.add(c20656115sF.LLILZLL.getId());
            if (view == null) {
                C786410Ut5.LJJZZIII((Handler) this.LLILZLL.getValue(), new ARunnableS39S0400000_31(c20656115sF, objShowPopup, this, c688120Qyw, 0));
                return;
            } else {
                LJII(c20656115sF, view, c688120Qyw);
                return;
            }
        }
        if (!(interfaceC20660515sx instanceof IStandardPopupTask)) {
            return;
        }
        Object objLJII = ((IStandardPopupTask) interfaceC20660515sx).LJII(c688120Qyw);
        if (objLJII == null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("task=");
            sbLIZ4.append(c20656115sF.LLILLJJLI);
            sbLIZ4.append(" show failed: buildPopupView_returns_null");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            c20656115sF.LLILZLL.getStateWrapper().LIZIZ();
            LJFF();
            return;
        }
        Method method2 = LLJ;
        if (method2 != null) {
            objA0 = C2204961BRm.a0(method2, c20656115sF.LLILZLL, new Object[]{objLJII, c688120Qyw}, new C0WZX("dzBzEgAjS8/YVFkiQFyUaTx+nDE3uF1zoslidQ4UDVt7WdPfIPAVKZPsJiuJ", null));
        } else {
            objA0 = null;
        }
        if (objA0 instanceof View) {
            view = (View) objA0;
        }
        c20656115sF.LLILZLL.getStateWrapper().LIZJ();
        PopupManager.LJ.add(c20656115sF.LLILZLL.getId());
        ((IStandardPopupTask) c20656115sF.LLILZLL).LIZIZ();
        if (view == null) {
            C786410Ut5.LJJZZIII((Handler) this.LLILZLL.getValue(), new ARunnableS39S0400000_31(c20656115sF, objLJII, this, c688120Qyw, 3));
        } else {
            LJII(c20656115sF, view, c688120Qyw);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(EnumC20657015sO enumC20657015sO, EnumC20657015sO enumC20657015sO2) {
        String str;
        AbstractC20656215sG abstractC20656215sG;
        if (enumC20657015sO2 == EnumC20657015sO.DISMISSED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("task=");
            C20656115sF c20656115sF = this.LLIZ;
            if (c20656115sF != null) {
                str = c20656115sF.LLILLJJLI;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(" dismissed");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C20656115sF c20656115sF2 = this.LLIZ;
            if (c20656115sF2 != null) {
                PopupManager.LIZLLL().LJIIIZ.execute(new ARunnableS131S0100000_31(c20656115sF2, 131));
            }
            C20656115sF c20656115sF3 = this.LLIZ;
            if (c20656115sF3 != null && (abstractC20656215sG = c20656115sF3.LLILZLL) != null) {
                InterfaceC20658115sZ interfaceC20658115sZ = PopupManager.LIZLLL().LJI;
                if (interfaceC20658115sZ != null) {
                    interfaceC20658115sZ.LIZJ(abstractC20656215sG);
                }
                Iterator<InterfaceC1600600rko> it2 = PopupManager.LJIILL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(abstractC20656215sG);
                }
            }
            LJFF();
        }
        return Unit.LIZ;
    }

    public PopupTaskExecutor(C688120Qyw c688120Qyw, InterfaceC20658015sY interfaceC20658015sY, CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList) {
        this.LL = c688120Qyw;
        this.LLILLJJLI = interfaceC20658015sY;
        this.LLILLL = copyOnWriteArrayList;
    }

    public static void LIZJ(C20656115sF c20656115sF, final View view, final C688120Qyw c688120Qyw) {
        if (PopupManager.LJIILIIL) {
            PopupTaskObserver popupTaskObserver = new PopupTaskObserver(c20656115sF, view, c688120Qyw);
            c688120Qyw.LIZIZ.getLifecycle().addObserver(popupTaskObserver);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(popupTaskObserver);
                C2187701Ajg.LIZ(viewTreeObserver, popupTaskObserver, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            view.addOnAttachStateChangeListener(popupTaskObserver);
            return;
        }
        final C16HO c16ho = new C16HO(view, c20656115sF, 1);
        final C16H8 c16h8 = new C16H8(view, c20656115sF, 0);
        c688120Qyw.LIZIZ.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupTaskExecutor$registerObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                c688120Qyw.LIZIZ.getLifecycle().removeObserver(this);
                C786410Ut5.C3(view.getViewTreeObserver(), c16ho);
                view.removeOnAttachStateChangeListener(c16h8);
            }
        });
        ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(c16ho);
            C2187701Ajg.LIZ(viewTreeObserver2, c16ho, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        view.addOnAttachStateChangeListener(c16h8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(C20656115sF c20656115sF, View view, C688120Qyw c688120Qyw) {
        Context context;
        Integer numLIZ;
        LifecycleOwner lifecycleOwner = c688120Qyw.LIZIZ;
        if (lifecycleOwner instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) lifecycleOwner.getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.ADD_OBSERVER;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), (context = (Context) lifecycleOwner))) != null) {
                LIZJ(c20656115sF, view, c688120Qyw);
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        LIZJ(c20656115sF, view, c688120Qyw);
    }

    public final void LJ(C20656115sF c20656115sF, boolean z, boolean z2) {
        EnumC20656815sM enumC20656815sM;
        String errMsg;
        EnumC20657115sP enumC20657115sP;
        if (!z && !z2) {
            enumC20656815sM = EnumC20656815sM.DISPERSION;
            errMsg = EnumC20656715sL.DISPERSION.getErrMsg();
        } else {
            enumC20656815sM = EnumC20656815sM.INTERCEPT;
            errMsg = EnumC20656715sL.INTERCEPT.getErrMsg();
        }
        AbstractC20656215sG abstractC20656215sG = c20656115sF.LLILZLL;
        int errCode = enumC20656815sM.getErrCode();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(errMsg);
        sbLIZ.append('.');
        abstractC20656215sG.showPopupFailed(errCode, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20658115sZ interfaceC20658115sZ = PopupManager.LIZLLL().LJI;
        if (interfaceC20658115sZ != null) {
            AbstractC20656215sG abstractC20656215sG2 = c20656115sF.LLILZLL;
            int errCode2 = enumC20656815sM.getErrCode();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(errMsg);
            sbLIZ2.append('.');
            interfaceC20658115sZ.LIZ(abstractC20656215sG2, errCode2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (z) {
            enumC20657115sP = EnumC20657115sP.POPUP_INTERCEPTOR;
        } else {
            enumC20657115sP = EnumC20657115sP.POPUP_DISPERSION;
        }
        PopupManager.LIZLLL().LJIIIZ.execute(new RunnableC20655715sB(c20656115sF, enumC20657115sP, this.LLILLJJLI.getSceneId(), "Interceptor", null));
    }
}
