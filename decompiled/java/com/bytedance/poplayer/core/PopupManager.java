package com.bytedance.poplayer.core;

import X.AbstractC20656215sG;
import X.C08XD;
import X.C1390590mI5;
import X.C20651815rY;
import X.C20651915rZ;
import X.C20653015rk;
import X.C20656115sF;
import X.C20656615sK;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C443120HZe;
import X.C688120Qyw;
import X.C786410Ut5;
import X.EnumC20656715sL;
import X.EnumC20656815sM;
import X.EnumC20656915sN;
import X.EnumC20657015sO;
import X.InterfaceC1600600rko;
import X.InterfaceC20647615qs;
import X.InterfaceC20655315s7;
import X.InterfaceC20658015sY;
import X.InterfaceC20658115sZ;
import X.InterfaceC20658915sh;
import X.InterfaceC20659115sj;
import X.InterfaceC20660615sy;
import X.InterfaceC20660715sz;
import X.InterfaceC20661315t5;
import X.InterfaceC20661415t6;
import X.InterfaceRunnableC20659215sk;
import Y.ARunnableS100S0200000_31;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupManager {
    public static long LIZ;
    public static C20651815rY LJI;
    public static InterfaceC20659115sj LJII;
    public static InterfaceC20655315s7 LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static final ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<InterfaceC20658015sY, InterfaceRunnableC20659215sk> LIZJ = new ConcurrentHashMap<>();
    public static final CopyOnWriteArraySet<InterfaceC20658015sY> LIZLLL = new CopyOnWriteArraySet<>();
    public static final CopyOnWriteArrayList<String> LJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC20658015sY> LJFF = new CopyOnWriteArrayList<>();
    public static final AtomicBoolean LJIIIIZZ = new AtomicBoolean(false);
    public static final ConcurrentLinkedDeque<C1390590mI5> LJIIIZ = new ConcurrentLinkedDeque<>();
    public static final CopyOnWriteArrayList<C443120HZe<String, Boolean, Long>> LJIIJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC20658915sh> LJIILJJIL = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC1600600rko> LJIILL = new CopyOnWriteArrayList<>();

    public static C20651815rY LIZLLL() {
        C20651815rY c20651815rY = LJI;
        return c20651815rY == null ? C20653015rk.LIZ : c20651815rY;
    }

    public static final AbstractC20656215sG LJ() {
        PopupTaskExecutor popupTaskExecutor;
        C20656115sF c20656115sF;
        Iterator<InterfaceC20658015sY> it2 = LIZLLL.iterator();
        if (!it2.hasNext()) {
            return null;
        }
        InterfaceRunnableC20659215sk interfaceRunnableC20659215sk = LIZJ.get(it2.next());
        if (!(interfaceRunnableC20659215sk instanceof PopupTaskExecutor) || (popupTaskExecutor = (PopupTaskExecutor) interfaceRunnableC20659215sk) == null || (c20656115sF = popupTaskExecutor.LLIZ) == null) {
            return null;
        }
        return c20656115sF.LLILZLL;
    }

    public static final boolean LJI() {
        return !LIZLLL.isEmpty();
    }

    public static boolean LJIIIIZZ() {
        return LJIIIIZZ.get();
    }

    public static String LJFF() {
        InterfaceC20647615qs interfaceC20647615qs;
        AbstractC20656215sG abstractC20656215sGLJ = LJ();
        if (abstractC20656215sGLJ == null || (interfaceC20647615qs = (InterfaceC20647615qs) abstractC20656215sGLJ.getClass().getAnnotation(InterfaceC20647615qs.class)) == null) {
            return null;
        }
        return interfaceC20647615qs.value();
    }

    public static final void LJIIJJI() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0T16
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PopupManager@9e7f.restart$1");
                    try {
                        PopupManager.LJIIJJI();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PopupManager@9e7f.restart$1");
                }
            });
        } else if (LJIIIIZZ.compareAndSet(true, false)) {
            C20651915rZ.LIZ("PopupManager restart.");
        }
    }

    public static final void LJIILJJIL() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0T1F
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PopupManager@9e7f.stop$2");
                    try {
                        PopupManager.LJIILJJIL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PopupManager@9e7f.stop$2");
                }
            });
            return;
        }
        if (LJIIIIZZ.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PopupManager stopped. running=");
            sbLIZ.append(LIZLLL.size());
            sbLIZ.append(" pending=");
            sbLIZ.append(LJFF.size());
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            Iterator<T> it2 = LIZJ.values().iterator();
            while (it2.hasNext()) {
                ((InterfaceRunnableC20659215sk) it2.next()).interrupt();
            }
            LIZJ.clear();
        }
    }

    public static boolean LIZIZ(final InterfaceC20658015sY interfaceC20658015sY) throws Exception {
        LifecycleOwner lifecycleOwner;
        final Lifecycle lifecycle;
        if (!interfaceC20658015sY.Xu()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scene=");
            sbLIZ.append(interfaceC20658015sY.getSceneId());
            sbLIZ.append(" aborted reason=scene_inactive");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (LIZLLL.contains(interfaceC20658015sY)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("the scene ");
            sbLIZ2.append(interfaceC20658015sY.getSceneId());
            sbLIZ2.append(" is running.");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        if (!r1.isEmpty()) {
            C688120Qyw c688120QywI2 = interfaceC20658015sY.i2();
            if (c688120QywI2 != null && (lifecycleOwner = c688120QywI2.LIZIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                try {
                    lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$checkSceneCanShowDirect$1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                onDestroy();
                            }
                        }

                        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                        public final void onDestroy() {
                            CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList = PopupManager.LJFF;
                            if (copyOnWriteArrayList.contains(interfaceC20658015sY)) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("pending scene removed on owner destroy: scene=");
                                sbLIZ3.append(interfaceC20658015sY.getSceneId());
                                C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                copyOnWriteArrayList.remove(interfaceC20658015sY);
                            }
                            lifecycle.removeObserver(this);
                        }
                    });
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("scene ");
                    sbLIZ3.append(interfaceC20658015sY.getSceneId());
                    sbLIZ3.append(" add observer failed: ");
                    sbLIZ3.append(e.getMessage());
                    LIZLLL().LIZLLL.invoke(C2188811AlT.LIZIZ(sbLIZ3));
                    if (!LIZLLL().LJIIJJI) {
                        throw e;
                    }
                }
            }
            if (interfaceC20658015sY instanceof InterfaceC20661415t6) {
                int i2 = C2187451AjH.LIZ;
                C20651915rZ.LIZIZ(interfaceC20658015sY.getSceneId() + " is pending because " + LJ() + " is showing.");
                CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList = LJFF;
                if (!copyOnWriteArrayList.contains(interfaceC20658015sY)) {
                    copyOnWriteArrayList.add(0, interfaceC20658015sY);
                }
                return false;
            }
            if (interfaceC20658015sY instanceof InterfaceC20660615sy) {
                if (((InterfaceC20660615sy) interfaceC20658015sY).t2()) {
                    int i3 = C2187451AjH.LIZ;
                    C20651915rZ.LIZIZ(interfaceC20658015sY.getSceneId() + " is pending because " + LJ() + " is showing.");
                    CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList2 = LJFF;
                    if (!copyOnWriteArrayList2.contains(interfaceC20658015sY)) {
                        copyOnWriteArrayList2.add(interfaceC20658015sY);
                    }
                    return false;
                }
            } else if ((interfaceC20658015sY instanceof InterfaceC20660715sz) && ((InterfaceC20660715sz) interfaceC20658015sY).t2()) {
                int i4 = C2187451AjH.LIZ;
                C20651915rZ.LIZIZ(interfaceC20658015sY.getSceneId() + " is pending because " + LJ() + " is showing.");
                CopyOnWriteArrayList<InterfaceC20658015sY> copyOnWriteArrayList3 = LJFF;
                if (!copyOnWriteArrayList3.contains(interfaceC20658015sY)) {
                    copyOnWriteArrayList3.add(interfaceC20658015sY);
                }
                return false;
            }
        }
        return true;
    }

    public static final synchronized void LIZJ(Class<?> cls) {
        C20656115sF c20656115sF;
        C20656615sK stateWrapper;
        PopupTaskExecutor popupTaskExecutor;
        for (InterfaceC20658015sY interfaceC20658015sY : LIZLLL) {
            InterfaceRunnableC20659215sk interfaceRunnableC20659215sk = LIZJ.get(interfaceC20658015sY);
            String str = null;
            if ((interfaceRunnableC20659215sk instanceof PopupTaskExecutor) && (popupTaskExecutor = (PopupTaskExecutor) interfaceRunnableC20659215sk) != null) {
                c20656115sF = popupTaskExecutor.LLIZ;
                if (c20656115sF != null) {
                    str = c20656115sF.LLILLJJLI;
                }
            } else {
                c20656115sF = null;
            }
            if (Intrinsics.LJFF(str, cls.getName())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("dismissRunningTask: scene=");
                sbLIZ.append(interfaceC20658015sY.getSceneId());
                sbLIZ.append(" task=");
                sbLIZ.append(c20656115sF.LLILLJJLI);
                C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                AbstractC20656215sG abstractC20656215sG = c20656115sF.LLILZLL;
                if (abstractC20656215sG != null && (stateWrapper = abstractC20656215sG.getStateWrapper()) != null) {
                    stateWrapper.LIZ();
                }
            }
        }
    }

    public static final boolean LJII(Class<?> cls) {
        PopupTaskExecutor popupTaskExecutor;
        C20656115sF c20656115sF;
        Iterator<InterfaceC20658015sY> it2 = LIZLLL.iterator();
        while (it2.hasNext()) {
            InterfaceRunnableC20659215sk interfaceRunnableC20659215sk = LIZJ.get(it2.next());
            String str = null;
            if ((interfaceRunnableC20659215sk instanceof PopupTaskExecutor) && (popupTaskExecutor = (PopupTaskExecutor) interfaceRunnableC20659215sk) != null && (c20656115sF = popupTaskExecutor.LLIZ) != null) {
                str = c20656115sF.LLILLJJLI;
            }
            if (Intrinsics.LJFF(str, cls.getName())) {
                return true;
            }
        }
        return false;
    }

    public static void LJIIL(InterfaceC20658015sY interfaceC20658015sY) {
        ConcurrentHashMap<InterfaceC20658015sY, InterfaceRunnableC20659215sk> concurrentHashMap = LIZJ;
        InterfaceRunnableC20659215sk interfaceRunnableC20659215sk = concurrentHashMap.get(interfaceC20658015sY);
        if (interfaceRunnableC20659215sk != null && interfaceRunnableC20659215sk.isRunning()) {
            return;
        }
        C688120Qyw c688120QywI2 = interfaceC20658015sY.i2();
        CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList = LIZIZ.get(interfaceC20658015sY);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        PopupTaskExecutor popupTaskExecutor = new PopupTaskExecutor(c688120QywI2, interfaceC20658015sY, copyOnWriteArrayList);
        LIZLLL().LJIIIZ.execute(popupTaskExecutor);
        concurrentHashMap.put(interfaceC20658015sY, popupTaskExecutor);
    }

    public static void LJIILIIL(final InterfaceC20658015sY interfaceC20658015sY) {
        LifecycleOwner lifecycleOwner;
        final Lifecycle lifecycle;
        if (interfaceC20658015sY instanceof InterfaceC20661415t6) {
            LJIIL(interfaceC20658015sY);
            return;
        }
        C688120Qyw c688120QywI2 = interfaceC20658015sY.i2();
        if (c688120QywI2 == null || (lifecycleOwner = c688120QywI2.LIZIZ) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$startShowLayer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                InterfaceRunnableC20659215sk interfaceRunnableC20659215sk = PopupManager.LIZJ.get(interfaceC20658015sY);
                if (interfaceRunnableC20659215sk != null) {
                    interfaceRunnableC20659215sk.interrupt();
                }
                PopupManager.LJIILL(interfaceC20658015sY);
                lifecycle.removeObserver(this);
            }
        });
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LJIIL(interfaceC20658015sY);
        } else {
            if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                return;
            }
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.poplayer.core.PopupManager$startShowLayer$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    } else if (event == Lifecycle.Event.ON_START) {
                        onStart();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    lifecycle.removeObserver(this);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_START)
                public final void onStart() {
                    ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
                    PopupManager.LJIIL(interfaceC20658015sY);
                    lifecycle.removeObserver(this);
                }
            });
        }
    }

    public static void LJIILL(InterfaceC20658015sY interfaceC20658015sY) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopScene: scene=");
        sbLIZ.append(interfaceC20658015sY.getSceneId());
        sbLIZ.append(" remaining_running=");
        CopyOnWriteArraySet<InterfaceC20658015sY> copyOnWriteArraySet = LIZLLL;
        sbLIZ.append(copyOnWriteArraySet.size() - 1);
        sbLIZ.append(" remaining_pending=");
        sbLIZ.append(LJFF.size());
        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ.remove(interfaceC20658015sY);
        LIZJ.remove(interfaceC20658015sY);
        copyOnWriteArraySet.remove(interfaceC20658015sY);
    }

    public static final synchronized void LJIILLIIL(InterfaceC20658015sY interfaceC20658015sY) {
        if (LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerShowScene aborted: scene=");
            sbLIZ.append(interfaceC20658015sY.getSceneId());
            sbLIZ.append(" reason=manager_stopped");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (LIZIZ(interfaceC20658015sY)) {
            if (interfaceC20658015sY instanceof InterfaceC20661415t6) {
                LIZLLL.add(interfaceC20658015sY);
            }
            if ((interfaceC20658015sY instanceof InterfaceC20660615sy) && ((InterfaceC20660615sy) interfaceC20658015sY).t2()) {
                LIZLLL.add(interfaceC20658015sY);
            }
            if ((interfaceC20658015sY instanceof InterfaceC20660715sz) && ((InterfaceC20660715sz) interfaceC20658015sY).t2()) {
                LIZLLL.add(interfaceC20658015sY);
            }
            LJIILIIL(interfaceC20658015sY);
        }
    }

    public static final synchronized void LIZ(AbstractC20656215sG abstractC20656215sG, boolean z) {
        C20656115sF next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addTask: === element_label=");
        sbLIZ.append(abstractC20656215sG.elementLabel);
        sbLIZ.append(" trigger_id=");
        sbLIZ.append(abstractC20656215sG.triggerId);
        sbLIZ.append(" id=");
        sbLIZ.append(abstractC20656215sG.getId());
        C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC20658015sY interfaceC20658015sY = abstractC20656215sG.scene;
        ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.containsKey(interfaceC20658015sY)) {
            CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList = concurrentHashMap.get(interfaceC20658015sY);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            }
            if (!abstractC20656215sG.enableDuplication()) {
                Iterator<C20656115sF> it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LLILLJJLI, abstractC20656215sG.getId())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C20656115sF c20656115sF = next;
                if (c20656115sF != null) {
                    copyOnWriteArrayList.remove(c20656115sF);
                }
            }
            C20656115sF c20656115sF2 = new C20656115sF(abstractC20656215sG);
            c20656115sF2.LLIZLLLIL.LIZ[EnumC20656915sN.ALL.ordinal()] = System.currentTimeMillis();
            c20656115sF2.LLILZLL = abstractC20656215sG;
            C20656615sK stateWrapper = abstractC20656215sG.getStateWrapper();
            stateWrapper.getClass();
            stateWrapper.LIZLLL(EnumC20657015sO.PENDING);
            copyOnWriteArrayList.add(c20656115sF2);
            try {
                C08XD.LJIL(copyOnWriteArrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i = C2187451AjH.LIZ;
                C20651915rZ.LIZIZ(e.toString());
            }
        } else {
            CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            C20656115sF c20656115sF3 = new C20656115sF(abstractC20656215sG);
            c20656115sF3.LLIZLLLIL.LIZ[EnumC20656915sN.ALL.ordinal()] = System.currentTimeMillis();
            c20656115sF3.LLILZLL = abstractC20656215sG;
            C20656615sK stateWrapper2 = abstractC20656215sG.getStateWrapper();
            stateWrapper2.getClass();
            stateWrapper2.LIZLLL(EnumC20657015sO.PENDING);
            copyOnWriteArrayList2.add(c20656115sF3);
            concurrentHashMap.put(interfaceC20658015sY, copyOnWriteArrayList2);
        }
        if (LJI()) {
            abstractC20656215sG.onConflict();
        }
    }

    public static void LJIIIZ(AbstractC20656215sG abstractC20656215sG, boolean z) {
        C443120HZe<String, Boolean, Long> next;
        if (abstractC20656215sG.elementLabel.length() == 0) {
            return;
        }
        InterfaceC20659115sj interfaceC20659115sj = LJII;
        if (interfaceC20659115sj != null) {
            interfaceC20659115sj.LIZIZ(abstractC20656215sG.elementLabel, abstractC20656215sG.triggerId, z);
        }
        Iterator<C443120HZe<String, Boolean, Long>> it2 = LJIIJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getFirst(), abstractC20656215sG.elementLabel)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C443120HZe<String, Boolean, Long> c443120HZe = next;
        if (c443120HZe != null && Intrinsics.LJFF(c443120HZe.getFirst(), abstractC20656215sG.elementLabel) && !z) {
            LJIIJ.remove(c443120HZe);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeTask: ");
            sbLIZ.append(abstractC20656215sG.elementLabel);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LJIIJ.add(new C443120HZe<>(abstractC20656215sG.elementLabel, Boolean.valueOf(z), Long.valueOf(System.currentTimeMillis())));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("addTask: ");
        sbLIZ2.append(abstractC20656215sG.elementLabel);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final synchronized void LJIIJ(Class<?> cls, InterfaceC20658015sY interfaceC20658015sY) {
        C20656115sF next;
        int size;
        CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList = LIZIZ.get(interfaceC20658015sY);
        if (copyOnWriteArrayList != null) {
            Iterator<C20656115sF> it2 = copyOnWriteArrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LLILLJJLI, cls.getName())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C20656115sF c20656115sF = next;
            if (c20656115sF != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("removeTask: scene=");
                sbLIZ.append(interfaceC20658015sY.getSceneId());
                sbLIZ.append(" task=");
                sbLIZ.append(cls.getName());
                sbLIZ.append(" remaining_in_scene=");
                ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = LIZIZ;
                CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList2 = concurrentHashMap.get(interfaceC20658015sY);
                if (copyOnWriteArrayList2 != null) {
                    size = copyOnWriteArrayList2.size();
                } else {
                    size = 0;
                }
                sbLIZ.append(size - 1);
                C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                CopyOnWriteArrayList<C20656115sF> copyOnWriteArrayList3 = concurrentHashMap.get(interfaceC20658015sY);
                if (copyOnWriteArrayList3 != null) {
                    copyOnWriteArrayList3.remove(c20656115sF);
                }
            }
        }
    }

    public static final synchronized void LJIIZILJ(AbstractC20656215sG abstractC20656215sG, InterfaceC20661315t5 interfaceC20661315t5) {
        InterfaceC20647615qs interfaceC20647615qs = (InterfaceC20647615qs) abstractC20656215sG.getClass().getAnnotation(InterfaceC20647615qs.class);
        if (interfaceC20647615qs != null) {
            abstractC20656215sG.setElementLabel(interfaceC20647615qs.value());
        }
        abstractC20656215sG.setTriggerId(interfaceC20661315t5.getTriggerId());
        LJIJI(abstractC20656215sG, true);
    }

    public static final synchronized void LJIJI(AbstractC20656215sG abstractC20656215sG, boolean z) {
        if (LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerShowTask aborted: scene=");
            sbLIZ.append(abstractC20656215sG.scene.getSceneId());
            sbLIZ.append(" task=");
            sbLIZ.append(abstractC20656215sG.getId());
            sbLIZ.append(" reason=manager_stopped");
            C20651915rZ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            EnumC20656815sM enumC20656815sM = EnumC20656815sM.STOP_SWITCH_OPEN;
            int errCode = enumC20656815sM.getErrCode();
            EnumC20656715sL enumC20656715sL = EnumC20656715sL.STOP_SWITCH_OPEN;
            abstractC20656215sG.showPopupFailed(errCode, enumC20656715sL.getErrMsg());
            InterfaceC20658115sZ interfaceC20658115sZ = LIZLLL().LJI;
            if (interfaceC20658115sZ != null) {
                interfaceC20658115sZ.LIZ(abstractC20656215sG, enumC20656815sM.getErrCode(), enumC20656715sL.getErrMsg());
            }
            return;
        }
        InterfaceC20658015sY interfaceC20658015sY = abstractC20656215sG.scene;
        if (!LIZLLL().LJIIJJI || interfaceC20658015sY.Xu()) {
            LIZ(abstractC20656215sG, z);
        }
        if (LIZIZ(interfaceC20658015sY)) {
            if (interfaceC20658015sY instanceof InterfaceC20661415t6) {
                LIZLLL.add(interfaceC20658015sY);
            }
            if ((interfaceC20658015sY instanceof InterfaceC20660615sy) && ((InterfaceC20660615sy) interfaceC20658015sY).t2()) {
                LIZLLL.add(interfaceC20658015sY);
            }
            if ((interfaceC20658015sY instanceof InterfaceC20660715sz) && ((InterfaceC20660715sz) interfaceC20658015sY).t2()) {
                LIZLLL.add(interfaceC20658015sY);
            }
            LJIILIIL(interfaceC20658015sY);
        } else {
            CopyOnWriteArraySet<InterfaceC20658015sY> copyOnWriteArraySet = LIZLLL;
            if (LIZLLL().LJIIJJI) {
                LIZLLL().LJIIIZ.execute(new ARunnableS100S0200000_31(interfaceC20658015sY, copyOnWriteArraySet, 54));
            }
        }
    }

    public static final synchronized void LJIJ(AbstractC20656215sG abstractC20656215sG, String str, InterfaceC20661315t5 interfaceC20661315t5) {
        abstractC20656215sG.setElementLabel(str);
        abstractC20656215sG.setTriggerId(interfaceC20661315t5.getTriggerId());
        LJIJI(abstractC20656215sG, false);
    }
}
