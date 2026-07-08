package com.ss.android.ugc.aweme.shortcut;

import X.AbstractC1549150qPp;
import X.C01GW;
import X.C098200Yq;
import X.C0WU5;
import X.C0WU6;
import X.C13BV;
import X.C15438062q;
import X.C15O7;
import X.C1697810uHb;
import X.C189200o6;
import X.C2188811AlT;
import X.C452501pT;
import X.C815220VyS;
import X.C815230VyT;
import X.C815840VzS;
import X.C815900VzY;
import X.C815940Vzc;
import X.C815950Vzd;
import X.C844470XAv;
import X.EnumC815990Vzh;
import X.InterfaceC20673515v3;
import X.InterfaceC815930Vzb;
import X.InterfaceC815970Vzf;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.appdiff.ILaunchAppDiffProtocol;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortcut.TiktokShortcutManager;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class TiktokShortcutManager implements IShortcutService, InterfaceC815930Vzb {
    public static final /* synthetic */ int LJ = 0;
    public Class<?> LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public volatile boolean LIZLLL;

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> LJ() {
        return C1697810uHb.LJIIJJI(C0WU5.class, C0WU6.class);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final boolean LIZ() {
        Object c098200Yq;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 8.0 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = Boolean.valueOf(((ShortcutManager) C844470XAv.LIZ().getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0Vze] */
    public TiktokShortcutManager() {
        Object c098200Yq;
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        try {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService == null || (iLiveOuterServiceQ4 = iLiveOuterService.q4()) == null || (interfaceC20673515v3K4 = iLiveOuterServiceQ4.k4()) == 0) {
                c098200Yq = null;
            } else {
                interfaceC20673515v3K4.LLILII(new InterfaceC815970Vzf() { // from class: X.0Vze
                    @Override // X.InterfaceC815970Vzf
                    public final void LIZ(Class cls) {
                        if (!Intrinsics.LJFF(this.LIZ.LIZ, cls)) {
                            this.LIZ.LIZ = cls;
                        }
                    }
                });
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        this.LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(168));
        this.LIZJ = C452501pT.LIZIZ(new AwS557S0100000_13(this, 128));
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshIfNotWhenColdBoot, ");
        sbLIZ.append(this.LIZLLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZLLL) {
            return;
        }
        LJIIJ("Init", true);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final Class<?> LJIIIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final boolean LIZIZ(String str) {
        Object c098200Yq;
        boolean z = false;
        if (!LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(Build.VERSION.SDK_INT);
            sbLIZ.append(", launcher shortcut is not supported");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        ILaunchAppDiffProtocol.LIZ.getClass();
        C815950Vzd.LIZIZ.getValue().LIZ();
        try {
            C844470XAv.LIZ.getClass();
            Iterator<ShortcutInfo> it2 = ((ShortcutManager) C844470XAv.LIZ().getSystemService(ShortcutManager.class)).getPinnedShortcuts().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, it2.next().getId())) {
                    z = true;
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final boolean LIZLLL(String str) {
        Object c098200Yq;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 25) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 7.1.1 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        try {
            C844470XAv.LIZ.getClass();
            Iterator it2 = C815220VyS.LIZLLL(2, C844470XAv.LIZ()).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(str, ((C815230VyT) it2.next()).LIZIZ)) {
                    z = true;
                }
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final List LJFF(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 7.1.1 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return C13BV.INSTANCE;
        }
        ((Set) ((C815940Vzc) this.LIZIZ.getValue()).LIZ.getValue()).addAll(list);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DynamicShortcutDataSource-> addShortcuts: ");
        sbLIZ2.append(list);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("addShortcuts :  ");
        sbLIZ3.append(list);
        LJIIJ(C2188811AlT.LIZIZ(sbLIZ3), false);
        return list;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJII(List<? extends EnumC815990Vzh> list) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 7.1.1 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        C815940Vzc c815940Vzc = (C815940Vzc) this.LIZIZ.getValue();
        c815940Vzc.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("DynamicShortcutDataSource-> removeShortcuts: ");
        sbLIZ2.append(list);
        C2188811AlT.LIZIZ(sbLIZ2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends EnumC815990Vzh> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getShortcutId());
        }
        Set set = (Set) c815940Vzc.LIZ.getValue();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (!arrayList.contains(((C815900VzY) obj).LIZIZ)) {
                arrayList2.add(obj);
            }
        }
        ((Set) c815940Vzc.LIZ.getValue()).clear();
        ((Set) c815940Vzc.LIZ.getValue()).addAll(arrayList2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("removeShortcuts : ");
        sbLIZ3.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends EnumC815990Vzh> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().getShortcutId());
        }
        LJIIJJI(strLIZIZ, false, arrayList3);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJIIIIZZ(C815900VzY c815900VzY) {
        Object c098200Yq;
        boolean zRequestPinShortcut;
        if (!LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(Build.VERSION.SDK_INT);
            sbLIZ.append(", launcher shortcut is not supported");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            ShortcutManager shortcutManager = (ShortcutManager) contextLIZ.getSystemService(ShortcutManager.class);
            ShortcutInfo shortcutInfoLIZ = new C815840VzS(c815900VzY).LIZ(contextLIZ, null);
            if (LIZIZ(c815900VzY.LIZIZ)) {
                zRequestPinShortcut = shortcutManager.updateShortcuts(C1697810uHb.LJ(shortcutInfoLIZ));
            } else {
                zRequestPinShortcut = shortcutManager.requestPinShortcut(shortcutInfoLIZ, null);
            }
            c098200Yq = Boolean.valueOf(zRequestPinShortcut);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // X.InterfaceC815930Vzb
    public final Set<C815900VzY> LIZJ(Context context, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((List) this.LIZJ.getValue()).iterator();
        while (it2.hasNext()) {
            linkedHashSet.addAll(((InterfaceC815930Vzb) it2.next()).LIZJ(context, z));
        }
        return linkedHashSet;
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService
    public final void LJIIJ(String str, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 7.1.1 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        LJIIJJI(str, z, C13BV.INSTANCE);
    }

    public final void LJIIJJI(String str, final boolean z, List list) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Build.VERSION ：");
            sbLIZ.append(i);
            sbLIZ.append(", shortcut only support Android 7.1.1 +");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LIZLLL = true;
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        ILaunchAppDiffProtocol.LIZ.getClass();
        arrayList.addAll(C815950Vzd.LIZIZ.getValue().LIZIZ());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("refreshShortcuts, needRefresh: ");
        sbLIZ2.append(z);
        sbLIZ2.append(", scene : ");
        sbLIZ2.append(str);
        sbLIZ2.append(", finalForceRemoveShortcuts: ");
        sbLIZ2.append(arrayList);
        C2188811AlT.LIZIZ(sbLIZ2);
        C15O7.LIZJ(new Callable() { // from class: X.0Vza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object c098200Yq;
                C1C7U.LIZ("TiktokShortcutManager@df1f.refreshShortcutsInner$1");
                TiktokShortcutManager tiktokShortcutManager = this.LL;
                boolean z2 = z;
                ArrayList<String> arrayList2 = arrayList;
                try {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    ShortcutManager shortcutManager = (ShortcutManager) contextLIZ.getSystemService(ShortcutManager.class);
                    Set setLJJIIJ = C09RB.LJJIIJ(new C08LY(new C1133920fc6(C09RB.LJIIJ(C09RB.LJIIJJI(new C1939607ik(tiktokShortcutManager.LIZJ(contextLIZ, z2))), new AwS592S0100000_13((ArrayList) arrayList2, (ArrayList<String>) 72)), new Comparator() { // from class: X.0VzZ
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return -Intrinsics.LJI(((C815900VzY) obj).LJ, ((C815900VzY) obj2).LJ);
                        }
                    }), AFwS247S0000000_13.get$arr$(47)));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("collectAllShortcuts: ");
                    sbLIZ3.append(setLJJIIJ);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    int i2 = 0;
                    TreeMap treeMap = new TreeMap();
                    C2097608Jq.LJIILL(treeMap, new Pair[0]);
                    ArrayList<C815840VzS> arrayList3 = new ArrayList();
                    for (Object obj : setLJJIIJ) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        C815840VzS c815840VzS = (C815840VzS) obj;
                        Integer num = (Integer) c815840VzS.LIZJ.getValue();
                        if (i2 >= 4) {
                            treeMap.put(Integer.valueOf(i3), c815840VzS);
                        } else if (num == null) {
                            arrayList3.add(c815840VzS);
                        } else if (treeMap.containsKey(num)) {
                            arrayList3.add(c815840VzS);
                        } else {
                            treeMap.put(num, c815840VzS);
                        }
                        i2 = i3;
                    }
                    for (C815840VzS c815840VzS2 : arrayList3) {
                        int i4 = 1;
                        while (true) {
                            if (!treeMap.containsKey(Integer.valueOf(i4))) {
                                treeMap.put(Integer.valueOf(i4), c815840VzS2);
                                break;
                            }
                            i4++;
                            if (i4 < 5) {
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList(treeMap.size());
                    for (Map.Entry entry : treeMap.entrySet()) {
                        ShortcutInfo shortcutInfoLIZ = ((C815840VzS) entry.getValue()).LIZ(contextLIZ, Integer.valueOf(((Number) entry.getKey()).intValue()));
                        arrayList4.add(shortcutInfoLIZ.getId());
                        arrayList5.add(shortcutInfoLIZ);
                    }
                    List<ShortcutInfo> listLLIIII = C13LP.LLIIII(arrayList5);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJ(arrayList4, "list");
                    C20684815ws.LJIILLIIL("shortcut_list", c2344009Gk.LIZ);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("finalShortcutsList: ");
                    sbLIZ4.append(arrayList4);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    shortcutManager.setDynamicShortcuts(listLLIIII);
                    c098200Yq = Boolean.TRUE;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("add shortcut error: ");
                    sbLIZ5.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ5);
                    c098200Yq = Boolean.FALSE;
                }
                ((Boolean) c098200Yq).booleanValue();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TiktokShortcutManager@df1f.refreshShortcutsInner$1");
                return unit;
            }
        });
    }
}
