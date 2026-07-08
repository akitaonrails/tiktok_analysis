package com.ss.android.ugc.aweme.nxet.vtree.v2;

import X.C01GW;
import X.C0VP2;
import X.C1489040oqs;
import X.C1697810uHb;
import X.C1808610xAJ;
import X.C1845130y7D;
import X.C1845150y7F;
import X.C1845160y7G;
import X.C1846540y9U;
import X.C1846600y9a;
import X.C1846620y9c;
import X.C1847207Li;
import X.C1847610yBD;
import X.C1847620yBE;
import X.C1847640yBG;
import X.C1847660yBI;
import X.C1847710yBN;
import X.C1847720yBO;
import X.C1847740yBQ;
import X.C1847750yBR;
import X.C1847770yBT;
import X.C1847780yBU;
import X.C1847800yBW;
import X.C1847820yBY;
import X.C1847960yBm;
import X.C1847990yBp;
import X.C1848060yBw;
import X.C1848300yCK;
import X.C19EG;
import X.C2188811AlT;
import X.C452501pT;
import X.C588030N4n;
import X.C786410Ut5;
import X.C787070Uu9;
import X.EnumC1847970yBn;
import X.InterfaceC1846560y9W;
import X.InterfaceC1847507Ll;
import X.InterfaceC1847650yBH;
import X.InterfaceC1848190yC9;
import X.InterfaceC1848420yCW;
import X.RunnableC514801zW;
import Y.ARunnableS25S0100100_27;
import Y.ARunnableS35S0400000_27;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Rect;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxet.event.EventDispatch;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class VTreeBuildManager implements InterfaceC1848190yC9, InterfaceC1848420yCW {
    public static C1847800yBW LIZJ;
    public static C1847800yBW LIZLLL;
    public static volatile int LJ;
    public static volatile boolean LJFF;
    public static WeakReference<Activity> LJIIIZ;
    public static long LJIIJ;
    public static volatile Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> LJIIJJI;
    public static final VTreeBuildManager LIZ = new VTreeBuildManager();
    public static boolean LIZIZ = true;
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(157));
    public static final VTreeBuildManager$mainIdleSignal$1 LJII = new VTreeBuildManager$mainIdleSignal$1();
    public static final List<InterfaceC1847507Ll> LJIIIIZZ = new ArrayList();

    public static void LJFF() {
        HashMap<Integer, C1845160y7G> second;
        Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> pair;
        Window window;
        View decorView;
        C1847770yBT c1847770yBT;
        InterfaceC1847650yBH interfaceC1847650yBH;
        View viewLJFF;
        C1847640yBG c1847640yBG;
        C1847640yBG c1847640yBG2;
        int i;
        LJ = 0;
        if (System.currentTimeMillis() - LJIIJ < 100) {
            return;
        }
        Activity activityLJII = LJII();
        if (activityLJII == null || !C1847990yBp.LIZJ.contains(activityLJII)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildTree unable to detect activity: ");
            sbLIZ.append(activityLJII != null ? activityLJII.getClass().getSimpleName() : null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> pair2 = LJIIJJI;
        if (pair2 == null || (second = pair2.getSecond()) == null || (pair = LJIIJJI) == null || pair.getFirst().intValue() != activityLJII.hashCode()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("buildTree viewNodePair error first:");
            Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> pair3 = LJIIJJI;
            sbLIZ2.append(pair3 != null ? pair3.getFirst() : null);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (!C1847990yBp.LIZIZ || (window = activityLJII.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("buildTree start build act: ");
        sbLIZ3.append(activityLJII.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ3);
        long jNanoTime = System.nanoTime();
        WeakHashMap weakHashMap = new WeakHashMap();
        C1847770yBT c1847770yBT2 = new C1847770yBT(null, new C1847740yBQ(), true, false);
        Rect rect = new Rect(0, 0, decorView.getWidth(), decorView.getHeight());
        c1847770yBT2.LJ = rect;
        c1847770yBT2.LIZLLL = rect;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(C1848060yBw.LIZ(c1847770yBT2, C1846620y9c.LIZIZ(decorView), decorView, true));
        C1847770yBT c1847770yBTLIZIZ = C1847750yBR.LIZIZ(arrayDeque, weakHashMap, second);
        if (c1847770yBTLIZIZ != null) {
            List<WeakReference<View>> list = C588030N4n.LIZ.get(Integer.valueOf(activityLJII.hashCode()));
            if (list != null && list.size() > 0) {
                Iterator<WeakReference<View>> it2 = list.iterator();
                while (it2.hasNext()) {
                    View view = it2.next().get();
                    if (view != null) {
                        C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
                        if (view.isAttachedToWindow()) {
                            arrayDeque.push(C1848060yBw.LIZ(c1847770yBTLIZIZ, c1847740yBQLIZIZ, view, false));
                        }
                    }
                }
                C1847750yBR.LIZIZ(arrayDeque, weakHashMap, second);
            }
        }
        for (C1847770yBT c1847770yBT3 : (ArrayList) c1847770yBT2.LJI) {
            if (c1847770yBT3.LJIIIIZZ() && (viewLJFF = c1847770yBT3.LJFF()) != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("[TopPage.oid: ");
                sbLIZ4.append(c1847770yBT3.LJI());
                sbLIZ4.append("] => `");
                sbLIZ4.append(c1847770yBT3.LIZIZ());
                sbLIZ4.append('`');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                Object tag = viewLJFF.getTag(R.id.phd);
                if (!(tag instanceof C1847640yBG) || (c1847640yBG = (C1847640yBG) tag) == null) {
                    c1847640yBG = new C1847640yBG();
                    viewLJFF.setTag(R.id.phd, c1847640yBG);
                } else {
                    C1847710yBN c1847710yBN = c1847640yBG.LIZ;
                    if (c1847710yBN != null && (!Intrinsics.LJFF(c1847710yBN.LIZ, c1847770yBT3.LJI()) || !Intrinsics.LJFF(c1847710yBN.LIZIZ, strLIZIZ))) {
                        c1847640yBG.LIZ = null;
                    }
                }
                if (c1847770yBT3.LIZ.LJIIIZ) {
                    C01GW c01gw = C1847750yBR.LIZ;
                    C1848300yCK c1848300yCK = (C1848300yCK) ((Map) c01gw.getValue()).get(strLIZIZ);
                    if (c1848300yCK != null) {
                        c1847770yBT3.LJIIIIZZ = c1848300yCK;
                    } else {
                        C1847710yBN c1847710yBN2 = new C1847710yBN(c1847770yBT3.LJI(), strLIZIZ, C1847610yBD.LIZ.LIZIZ());
                        c1847770yBT3.LJIIIIZZ = c1847710yBN2;
                        ((Map) c01gw.getValue()).put(strLIZIZ, c1847710yBN2);
                        Object tag2 = viewLJFF.getTag(R.id.phd);
                        if ((tag2 instanceof C1847640yBG) && (c1847640yBG2 = (C1847640yBG) tag2) != null) {
                            c1847640yBG2.LIZ = null;
                        }
                    }
                } else {
                    C1847710yBN c1847710yBN3 = c1847640yBG.LIZ;
                    if (c1847710yBN3 != null) {
                        c1847770yBT3.LJIIIIZZ = c1847710yBN3;
                    } else {
                        String strLJI = c1847770yBT3.LJI();
                        synchronized (C1847610yBD.LIZ) {
                            try {
                                i = C1847610yBD.LIZIZ + 1;
                                C1847610yBD.LIZIZ = i;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        C1847710yBN c1847710yBN4 = new C1847710yBN(strLJI, strLIZIZ, i);
                        c1847770yBT3.LJIIIIZZ = c1847710yBN4;
                        c1847640yBG.LIZ = c1847710yBN4;
                    }
                }
            }
        }
        C1847800yBW c1847800yBW = c1847770yBTLIZIZ != null ? new C1847800yBW(c1847770yBT2, weakHashMap, c1847770yBTLIZIZ) : null;
        if (c1847800yBW != null && (c1847770yBT = c1847800yBW.LIZJ) != null && jNanoTime > 0) {
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
            if (interfaceC1846560y9WLIZ != null && interfaceC1846560y9WLIZ.LIZJ()) {
                ARunnableS25S0100100_27 aRunnableS25S0100100_27 = new ARunnableS25S0100100_27(jNanoTime2, c1847770yBT, 6);
                C1847960yBm c1847960yBm = C1847960yBm.LJII;
                if (c1847960yBm != null && (interfaceC1847650yBH = c1847960yBm.LJFF) != null) {
                    interfaceC1847650yBH.LIZ(aRunnableS25S0100100_27);
                }
            }
        }
        LJIIJ = System.currentTimeMillis();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("buildTree: VTree = ");
        sbLIZ5.append(c1847800yBW);
        C2188811AlT.LIZIZ(sbLIZ5);
        LIZJ = c1847800yBW;
        ArrayList arrayList = new ArrayList();
        List<InterfaceC1847507Ll> list2 = LJIIIIZZ;
        arrayList.addAll(list2);
        ((ArrayList) list2).clear();
        EventDispatch.ExposureHandler exposureHandler = EventDispatch.LIZ;
        exposureHandler.sendMessage(Message.obtain(exposureHandler, 1, c1847800yBW));
        ((C1489040oqs) EventDispatch.LIZJ.getValue()).LIZIZ(new C1846600y9a(c1847800yBW));
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLL() {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZLZ(View view) {
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZIL(View view) {
    }

    public static Activity LJII() {
        Activity activity;
        WeakReference<Activity> weakReference = LJIIIZ;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            return activity;
        }
        WeakReference<Activity> weakReference2 = C1847990yBp.LJ;
        if (weakReference2 != null) {
            return weakReference2.get();
        }
        return null;
    }

    public static C1847800yBW LJIIIIZZ() {
        return C1847990yBp.LIZIZ ? LIZJ : LIZLLL;
    }

    @Override // X.InterfaceC1848420yCW
    public final void LIZ() {
        LIZLLL = LIZJ;
        LIZJ = null;
        new ArrayList();
        EventDispatch.ExposureHandler exposureHandler = EventDispatch.LIZ;
        exposureHandler.sendMessage(Message.obtain(exposureHandler, 1, null));
        ((C1489040oqs) EventDispatch.LIZJ.getValue()).LIZIZ(new C1846600y9a(null));
        C1847820yBY.LJFF++;
        final int i = 0;
        C1847780yBU.LIZ(new InterfaceC1847507Ll(i) { // from class: X.07Lk
            public final Map<String, Object> LIZ = null;

            @Override // X.InterfaceC1847507Ll
            public final String getEvent() {
                return "nxet_app_stay";
            }

            @Override // X.InterfaceC1847507Ll
            public final Map<String, Object> getParams() {
                Map<String, Object> map = this.LIZ;
                return map == null ? C2097608Jq.LJ() : map;
            }
        }, null, null);
    }

    @Override // X.InterfaceC1848420yCW
    public final void LJ() {
        String strLIZIZ;
        final int i = 0;
        InterfaceC1847507Ll interfaceC1847507Ll = LIZIZ ? new InterfaceC1847507Ll(i) { // from class: X.07Li
            public final Map<String, Object> LIZ = null;

            @Override // X.InterfaceC1847507Ll
            public final String getEvent() {
                return "nxet_app_init";
            }

            @Override // X.InterfaceC1847507Ll
            public final Map<String, Object> getParams() {
                Map<String, Object> map = this.LIZ;
                return map == null ? C2097608Jq.LJ() : map;
            }
        } : new InterfaceC1847507Ll(i) { // from class: X.07Lj
            public final Map<String, Object> LIZ = null;

            @Override // X.InterfaceC1847507Ll
            public final String getEvent() {
                return "nxet_app_show";
            }

            @Override // X.InterfaceC1847507Ll
            public final Map<String, Object> getParams() {
                Map<String, Object> map = this.LIZ;
                return map == null ? C2097608Jq.LJ() : map;
            }
        };
        String event = interfaceC1847507Ll.getEvent();
        if (C1847820yBY.LJFF > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(event);
            sbLIZ.append(':');
            sbLIZ.append(C1847820yBY.LJFF);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = event;
        }
        C1847720yBO c1847720yBO = new C1847720yBO();
        c1847720yBO.LJIIIZ("s");
        c1847720yBO.LJFF(String.valueOf(C1847610yBD.LIZ.LIZ()));
        c1847720yBO.LIZLLL(event);
        c1847720yBO.LJIIIIZZ(strLIZIZ);
        String strLIZ = c1847720yBO.LIZ();
        C1847820yBY.LJ = strLIZ;
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("acrefer=");
            sbLIZ2.append(strLIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (interfaceC1847507Ll instanceof C1847207Li) {
            C1847820yBY.LIZ.LIZ(C1697810uHb.LJIILJJIL(new C0VP2(strLIZ, EnumC1847970yBn.APP_EVENT)));
        }
        C1847780yBU.LIZ(interfaceC1847507Ll, null, null);
        LIZIZ = false;
    }

    public static boolean LJIIIZ() {
        Activity activityLJII = LJII();
        if (LJIIJJI == null) {
            return true;
        }
        Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> pair = LJIIJJI;
        return !Intrinsics.LJFF(pair != null ? pair.getFirst() : null, activityLJII != null ? Integer.valueOf(activityLJII.hashCode()) : null);
    }

    public static void LJIIJJI() {
        View decorView;
        View viewFindViewById;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startBuildTree State: ");
        sbLIZ.append(LJ);
        sbLIZ.append("  hasLayout: ");
        sbLIZ.append(LJFF);
        sbLIZ.append(" isAutoRefer: ");
        InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
        sbLIZ.append(interfaceC1846560y9WLIZ != null ? Boolean.valueOf(interfaceC1846560y9WLIZ.LJII()) : null);
        sbLIZ.append(" viewNodeMap actCode: ");
        Pair<Integer, ? extends HashMap<Integer, C1845160y7G>> pair = LJIIJJI;
        sbLIZ.append(pair != null ? pair.getFirst() : null);
        sbLIZ.append("  curActivity:");
        Activity activityLJII = LJII();
        sbLIZ.append(activityLJII != null ? Integer.valueOf(activityLJII.hashCode()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        if (LJ != 1 || LJFF) {
            return;
        }
        if (!LJIIIZ()) {
            LJFF();
            LJIIJJI = null;
            return;
        }
        final C1845150y7F c1845150y7F = (C1845150y7F) LJI.getValue();
        Activity activityLJII2 = LJII();
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(136);
        c1845150y7F.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("prepareVTreeData needRefreshTag: ");
        InterfaceC1846560y9W interfaceC1846560y9WLIZ2 = C1847660yBI.LIZ();
        sbLIZ2.append(interfaceC1846560y9WLIZ2 != null ? Boolean.valueOf(interfaceC1846560y9WLIZ2.LJII()) : null);
        sbLIZ2.append("  act: ");
        sbLIZ2.append(activityLJII2 != null ? activityLJII2.getClass().getSimpleName() : null);
        sbLIZ2.append(" isRunning: ");
        sbLIZ2.append(c1845150y7F.LIZ);
        sbLIZ2.append("  isNeedTagFragment: ");
        sbLIZ2.append(c1845150y7F.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (c1845150y7F.LIZ) {
            return;
        }
        c1845150y7F.LIZ = true;
        InterfaceC1846560y9W interfaceC1846560y9WLIZ3 = C1847660yBI.LIZ();
        if (interfaceC1846560y9WLIZ3 == null || !interfaceC1846560y9WLIZ3.LJII() || !(activityLJII2 instanceof C19EG) || !c1845150y7F.LIZIZ) {
            c1845150y7F.LIZ(activityLJII2, aFwS269S0000000_27);
            return;
        }
        final C19EG c19eg = (C19EG) activityLJII2;
        final AwS271S0300000_27 awS271S0300000_27 = new AwS271S0300000_27(c1845150y7F, activityLJII2, aFwS269S0000000_27, 25);
        Window window = c19eg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null && (viewFindViewById = decorView.findViewById(android.R.id.content)) != null) {
            final int height = viewFindViewById.getHeight();
            final int width = viewFindViewById.getWidth();
            if (width > 0 && height > 0) {
                C786410Ut5.LJJZZIII(EventDispatch.LIZ, new Runnable() { // from class: X.0y7I
                    public final void LIZ() {
                        InterfaceC1845190y7J interfaceC1845190y7J;
                        Pair<String, String> pair2;
                        String str;
                        View view;
                        C1847740yBQ c1847740yBQLIZIZ;
                        String str2;
                        C1845150y7F c1845150y7F2 = c1845150y7F;
                        C19EG c19eg2 = c19eg;
                        int i = width;
                        int i2 = height;
                        Function0<Unit> function0 = awS271S0300000_27;
                        c1845150y7F2.getClass();
                        List<Fragment> listLIZIZ = C2432009fy.LIZIZ(c19eg2);
                        ArrayList<Fragment> arrayList = new ArrayList();
                        for (Fragment fragment : (ArrayList) listLIZIZ) {
                            View view2 = fragment.getView();
                            if (view2 != null) {
                                float height2 = (view2.getHeight() * view2.getWidth()) / (i2 * i);
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("realTagFragment f: ");
                                sbLIZ3.append(fragment.getClass().getSimpleName());
                                sbLIZ3.append(" ratio:");
                                sbLIZ3.append(view2.isLaidOut());
                                sbLIZ3.append(" ratio: ");
                                sbLIZ3.append(height2);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                if (height2 >= 0.9f) {
                                    arrayList.add(fragment);
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Fragment fragment2 : arrayList) {
                            if (!arrayList.isEmpty()) {
                                View view3 = fragment2.getView();
                                if ((view3 instanceof ViewGroup) && view3 != null) {
                                    for (Fragment fragment3 : arrayList) {
                                        if (!Intrinsics.LJFF(fragment3, fragment2)) {
                                            View view4 = fragment3.getView();
                                            Object parent = view4 != null ? view4.getParent() : null;
                                            if (parent instanceof View) {
                                                View view5 = (View) parent;
                                                while (view5 != null) {
                                                    if (Intrinsics.LJFF(view5, view3)) {
                                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                        sbLIZ4.append(fragment2.getClass().getSimpleName());
                                                        sbLIZ4.append(" is ");
                                                        sbLIZ4.append(fragment3.getClass().getSimpleName());
                                                        sbLIZ4.append(" parent!!");
                                                        C2188811AlT.LIZIZ(sbLIZ4);
                                                        break;
                                                    }
                                                    Object parent2 = view5.getParent();
                                                    if (parent2 instanceof View) {
                                                        view5 = (View) parent2;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                for (Fragment fragment4 : arrayList) {
                                    if (!Intrinsics.LJFF(fragment4, fragment2) && (view = fragment4.getView()) != null && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view)) != null && (str2 = c1847740yBQLIZIZ.LIZIZ) != null && str2.length() != 0) {
                                        View view6 = fragment2.getView();
                                        Object parent3 = view6 != null ? view6.getParent() : null;
                                        if (parent3 instanceof View) {
                                            View view7 = (View) parent3;
                                            while (view7 != null) {
                                                if (!Intrinsics.LJFF(view7, view)) {
                                                    Object parent4 = view7.getParent();
                                                    if (parent4 instanceof View) {
                                                        view7 = (View) parent4;
                                                    }
                                                } else if (C1847960yBm.LJIIIIZZ) {
                                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                                    sbLIZ5.append(fragment2.getClass().getSimpleName());
                                                    sbLIZ5.append(" has parent oid：");
                                                    sbLIZ5.append(str2);
                                                    sbLIZ5.append("  parentFragment ");
                                                    sbLIZ5.append(fragment4.getClass().getSimpleName());
                                                    C2188811AlT.LIZIZ(sbLIZ5);
                                                }
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                }
                            }
                            C1847740yBQ c1847740yBQLIZIZ2 = C1846620y9c.LIZIZ(fragment2);
                            if (c1847740yBQLIZIZ2 == null || (str = c1847740yBQLIZIZ2.LIZIZ) == null || str.length() == 0) {
                                if (C1845200y7K.LIZIZ.contains(fragment2.getClass()) || (interfaceC1845190y7J = C1845200y7K.LIZ) == null || (pair2 = interfaceC1845190y7J.LIZJ(fragment2)) == null) {
                                    pair2 = new Pair<>("", "");
                                }
                                if (pair2.getFirst().length() > 0) {
                                    arrayList2.add(new Pair(fragment2, pair2.getFirst()));
                                }
                            }
                        }
                        C786410Ut5.LJJZZIII(C787070Uu9.LIZ, new ARunnableS35S0400000_27(arrayList2, arrayList, c19eg2, function0, 10));
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VTreePrepareManager@7580.autoTagFragmentPage$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VTreePrepareManager@7580.autoTagFragmentPage$1");
                    }
                });
                return;
            }
        }
        awS271S0300000_27.invoke();
    }

    public static void LJIIJ(Object obj) {
        Object objLIZ;
        if (obj != null && LJIIJ > 0) {
            String simpleName = null;
            if (obj instanceof Activity) {
                objLIZ = obj;
            } else if (obj instanceof Dialog) {
                objLIZ = C1808610xAJ.LIZ((Dialog) obj);
            } else if (obj instanceof View) {
                objLIZ = C1845130y7D.LIZ((View) obj);
            } else {
                objLIZ = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageReport: object=");
            sbLIZ.append(obj);
            sbLIZ.append(" act：");
            if (objLIZ != null) {
                simpleName = objLIZ.getClass().getSimpleName();
            }
            sbLIZ.append(simpleName);
            C2188811AlT.LIZIZ(sbLIZ);
            if (objLIZ == null) {
                return;
            }
            LJIIL(false);
        }
    }

    public static void LJIIL(boolean z) {
        if (z) {
            LJIIJ = 0L;
        }
        C1846540y9U c1846540y9U = new C1846540y9U();
        if (C787070Uu9.LIZ()) {
            c1846540y9U.invoke();
        } else {
            C786410Ut5.LJJZZIII(C787070Uu9.LIZ, new RunnableC514801zW(c1846540y9U, 164));
        }
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLLZZ(C1847620yBE c1847620yBE) {
        View view = c1847620yBE.LIZ;
        if (view == null) {
            return;
        }
        LJI(c1847620yBE.LIZIZ, view, c1847620yBE.LIZJ.getClass().getSimpleName());
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZIL(C1847620yBE c1847620yBE) {
        C19EG c19eg;
        String simpleName;
        if (c1847620yBE.LIZ != null && (c19eg = c1847620yBE.LIZIZ) != null && C1847990yBp.LIZJ.contains(c19eg)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentPause:");
            Fragment fragment = c1847620yBE.LIZJ;
            if (fragment != null) {
                simpleName = fragment.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            sbLIZ.append(simpleName);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIL(false);
            LJIIIZ = new WeakReference<>(c19eg);
        }
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZL(Activity activity) {
        View decorView;
        LJFF = false;
        Window window = activity.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            LJI(activity, decorView, activity.getClass().getSimpleName());
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onActivityResume: activity = ");
        sbLIZ.append(activity);
        sbLIZ.append(", null getView()");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZLI(C1847620yBE c1847620yBE) {
        String simpleName;
        View view = c1847620yBE.LIZ;
        if (view != null && view.getRootView() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentDestroyView:");
            Fragment fragment = c1847620yBE.LIZJ;
            if (fragment != null) {
                simpleName = fragment.getClass().getSimpleName();
            } else {
                simpleName = null;
            }
            sbLIZ.append(simpleName);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIL(false);
        }
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZ(Activity activity, Dialog dialog) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDialogShow:");
        sbLIZ.append(dialog.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIL(false);
        LJIIIZ = new WeakReference<>(activity);
    }

    @Override // X.InterfaceC1848190yC9
    public final void LLZILL(Activity activity, Dialog dialog) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDialogHide:");
        sbLIZ.append(dialog.getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        LJIIL(false);
        LJIIIZ = new WeakReference<>(activity);
    }

    public static void LJI(Activity activity, View view, final String str) {
        final WeakReference<Activity> weakReference = new WeakReference<>(activity);
        final boolean zIsLaidOut = view.isLaidOut();
        LJFF = true;
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            LJFF = false;
            if (!zIsLaidOut) {
                ((C1845150y7F) LJI.getValue()).LIZIZ = true;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResume:");
            sbLIZ.append(str);
            sbLIZ.append(",isLaidOut:");
            sbLIZ.append(zIsLaidOut);
            C2188811AlT.LIZIZ(sbLIZ);
            LJIIL(false);
            LJIIIZ = weakReference;
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0yBC
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view2.removeOnLayoutChangeListener(this);
                VTreeBuildManager.LJFF = false;
                if (!zIsLaidOut) {
                    ((C1845150y7F) VTreeBuildManager.LJI.getValue()).LIZIZ = true;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onResume:");
                sbLIZ2.append(str);
                sbLIZ2.append(",isLaidOut:");
                sbLIZ2.append(zIsLaidOut);
                C2188811AlT.LIZIZ(sbLIZ2);
                VTreeBuildManager.LJIIL(false);
                VTreeBuildManager.LJIIIZ = weakReference;
            }
        });
    }
}
