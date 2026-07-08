package com.bytedance.hox;

import X.AbstractC1583710rJZ;
import X.AbstractC1583720rJa;
import X.AbstractC813200VvC;
import X.C08CO;
import X.C1563860qnY;
import X.C1583730rJb;
import X.C19719512Dh;
import X.C19EG;
import X.C2188811AlT;
import X.C446900Hfk;
import X.InterfaceC1055110dYz;
import X.InterfaceC1583770rJf;
import X.InterfaceC1583780rJg;
import Y.ARunnableS57S0300000_24;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.hox.HoxFragmentGroup;
import com.bytedance.hox.HoxFragmentNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes25.dex */
public final class Hox extends ViewModel {
    public static final C446900Hfk LLJILJIL = new C446900Hfk();
    public boolean LL;
    public C19EG LLILLJJLI;
    public AbstractC1583710rJZ LLILLL;
    public boolean LLIZ;
    public final HashMap<String, AbstractC1583720rJa> LLILZ = new HashMap<>();
    public final HashMap<Class<?>, HashMap<String, AbstractC1583720rJa>> LLILZIL = new HashMap<>();
    public final HashMap<String, AbstractC1583720rJa> LLILZLL = new HashMap<>();
    public final CopyOnWriteArrayList<InterfaceC1583770rJf> LLIZLLLIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC1583770rJf> LLJ = new CopyOnWriteArrayList<>();
    public final Hox$activityLifeObserver$1 LLJI = new LifecycleEventObserver() { // from class: com.bytedance.hox.Hox$activityLifeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            int i = C08CO.LIZ[event.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this.LL.LLIZ = false;
                    return;
                }
                return;
            }
            this.LL.LLIZ = true;
        }
    };
    public final C1583730rJb LLJIJIL = new AbstractC813200VvC() { // from class: X.0rJb
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC813200VvC
        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            AbstractC1583720rJa abstractC1583720rJa;
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (fragment instanceof InterfaceC1583780rJg) {
                String hoxNodeTag = ((InterfaceC1583780rJg) fragment).getHoxNodeTag();
                HashMap<String, AbstractC1583720rJa> map = this.LL.LLILZIL.get(fragment.getClass());
                if (map != null && !map.isEmpty()) {
                    if (map.size() == 1) {
                        abstractC1583720rJa = (AbstractC1583720rJa) C13LP.LJJJJZ(map.values());
                    } else if (hoxNodeTag.length() > 0) {
                        abstractC1583720rJa = map.get(hoxNodeTag);
                    } else {
                        if (!C1563860qnY.LIZIZ) {
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Duplicated Fragment Class ");
                        sbLIZ.append(fragment.getClass());
                        sbLIZ.append(" has been registered without specifying different HoxNodeTags");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (abstractC1583720rJa != null) {
                        Hox hox = this.LL;
                        if (C0BIH.LIZ()) {
                            if (abstractC1583720rJa instanceof HoxFragmentNode) {
                                HoxFragmentNode hoxFragmentNode = (HoxFragmentNode) abstractC1583720rJa;
                                hoxFragmentNode.LLILZIL = null;
                                ((List) hoxFragmentNode.LLIZ.getValue()).clear();
                            } else if (abstractC1583720rJa instanceof HoxFragmentGroup) {
                                HoxFragmentGroup hoxFragmentGroup = (HoxFragmentGroup) abstractC1583720rJa;
                                hoxFragmentGroup.LLJI = null;
                                ((List) hoxFragmentGroup.LLJILJIL.getValue()).clear();
                            }
                        }
                        hox.PQ2(abstractC1583720rJa.tag(), (InterfaceC1583780rJg) fragment);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC813200VvC
        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            AbstractC1583720rJa abstractC1583720rJa;
            super.onFragmentCreated(fragmentManager, fragment, bundle);
            if (fragment instanceof InterfaceC1583780rJg) {
                String hoxNodeTag = ((InterfaceC1583780rJg) fragment).getHoxNodeTag();
                HashMap<String, AbstractC1583720rJa> map = this.LL.LLILZIL.get(fragment.getClass());
                if (map != null && !map.isEmpty()) {
                    if (map.size() == 1) {
                        abstractC1583720rJa = (AbstractC1583720rJa) C13LP.LJJJJZ(map.values());
                    } else if (hoxNodeTag.length() > 0) {
                        abstractC1583720rJa = map.get(hoxNodeTag);
                    } else {
                        if (C1563860qnY.LIZIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Duplicated Fragment Class ");
                            sbLIZ.append(fragment.getClass());
                            sbLIZ.append(" has been registered without specifying different HoxNodeTags");
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return;
                    }
                    if (abstractC1583720rJa != null) {
                        Hox hox = this.LL;
                        if (abstractC1583720rJa instanceof HoxFragmentNode) {
                            HoxFragmentNode hoxFragmentNode = (HoxFragmentNode) abstractC1583720rJa;
                            hoxFragmentNode.LLILZIL = fragment;
                            Iterator it2 = ((List) hoxFragmentNode.LLIZ.getValue()).iterator();
                            while (it2.hasNext()) {
                                ((Runnable) it2.next()).run();
                            }
                            ((List) hoxFragmentNode.LLIZ.getValue()).clear();
                        } else if (abstractC1583720rJa instanceof HoxFragmentGroup) {
                            HoxFragmentGroup hoxFragmentGroup = (HoxFragmentGroup) abstractC1583720rJa;
                            hoxFragmentGroup.LLJI = fragment;
                            Iterator it3 = ((List) hoxFragmentGroup.LLJILJIL.getValue()).iterator();
                            while (it3.hasNext()) {
                                ((Runnable) it3.next()).run();
                            }
                            ((List) hoxFragmentGroup.LLJILJIL.getValue()).clear();
                        }
                        hox.wQ2(abstractC1583720rJa.tag(), (InterfaceC1583780rJg) fragment);
                    }
                }
            }
        }
    };

    public final String BQ2() {
        String strLJFF;
        AbstractC1583710rJZ abstractC1583710rJZ = this.LLILLL;
        AbstractC1583720rJa abstractC1583720rJaCQ2 = abstractC1583710rJZ == null ? null : CQ2(abstractC1583710rJZ);
        return (abstractC1583720rJaCQ2 == null || (strLJFF = abstractC1583720rJaCQ2.LJFF()) == null) ? "" : strLJFF;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C19EG c19eg = this.LLILLJJLI;
        if (c19eg != null) {
            Lifecycle lifecycle = c19eg.getLifecycle();
            if (lifecycle != null) {
                lifecycle.removeObserver(this.LLJI);
            }
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.LLIILZL(this.LLJIJIL);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.hox.Hox$activityLifeObserver$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0rJb] */
    public Hox(C19EG c19eg) {
        if (c19eg != null) {
            this.LLILLJJLI = c19eg;
            if (C1563860qnY.LIZJ) {
                zQ2(c19eg, c19eg.getLifecycle());
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final synchronized Hox AQ2(C19EG c19eg) {
        return LLJILJIL.LIZ(c19eg);
    }

    public static AbstractC1583720rJa CQ2(AbstractC1583710rJZ abstractC1583710rJZ) {
        AbstractC1583720rJa abstractC1583720rJa = abstractC1583710rJZ.LLILZLL;
        if (abstractC1583720rJa instanceof AbstractC1583710rJZ) {
            return CQ2((AbstractC1583710rJZ) abstractC1583720rJa);
        }
        return abstractC1583720rJa;
    }

    public static String MQ2(List list) {
        StringBuilder sb = new StringBuilder(e3.e);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC1583720rJa abstractC1583720rJa = (AbstractC1583720rJa) it2.next();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(abstractC1583720rJa.tag());
            sbLIZ.append('@');
            sbLIZ.append(abstractC1583720rJa);
            sbLIZ.append(',');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!a0.LJJJIL(sb)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public static String NQ2(AbstractC1583720rJa abstractC1583720rJa) {
        if (abstractC1583720rJa == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(e3.e);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1583720rJa.tag());
        sbLIZ.append('@');
        sbLIZ.append(abstractC1583720rJa);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC1583720rJa instanceof AbstractC1583710rJZ) {
            Iterator it2 = ((ArrayList) ((AbstractC1583710rJZ) abstractC1583720rJa).LLIZLLLIL).iterator();
            while (it2.hasNext()) {
                sb.append(NQ2((AbstractC1583720rJa) it2.next()));
                sb.append(",");
            }
            if (!a0.LJJJIL(sb)) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public final Class<?> EQ2(String str) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 != null) {
            return abstractC1583720rJaGQ2.LJIJ();
        }
        return null;
    }

    public final int FQ2(String str) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 == null || (abstractC1583710rJZ = abstractC1583720rJaGQ2.LL) == null) {
            return -1;
        }
        return ((ArrayList) abstractC1583710rJZ.LLIZLLLIL).indexOf(abstractC1583720rJaGQ2);
    }

    public final synchronized AbstractC1583720rJa GQ2(String str) {
        if (this.LLILZ.containsKey(str)) {
            return this.LLILZ.get(str);
        }
        AbstractC1583710rJZ abstractC1583710rJZ = this.LLILLL;
        if (abstractC1583710rJZ == null) {
            return null;
        }
        this.LLILZ.put(abstractC1583710rJZ.tag(), this.LLILLL);
        UQ2(this.LLILLL);
        return this.LLILZ.get(str);
    }

    public final String HQ2(String str) {
        AbstractC1583720rJa abstractC1583720rJaGQ2;
        AbstractC1583710rJZ abstractC1583710rJZ;
        String strTag;
        if (str == null || (abstractC1583720rJaGQ2 = GQ2(str)) == null || (abstractC1583710rJZ = abstractC1583720rJaGQ2.LL) == null || (strTag = abstractC1583710rJZ.tag()) == null) {
            return "";
        }
        return strTag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean JQ2(Fragment fragment) {
        AbstractC1583720rJa abstractC1583720rJaCQ2;
        AbstractC1583710rJZ abstractC1583710rJZ = this.LLILLL;
        if (abstractC1583710rJZ == null) {
            abstractC1583720rJaCQ2 = null;
        } else {
            abstractC1583720rJaCQ2 = CQ2(abstractC1583710rJZ);
        }
        if (abstractC1583720rJaCQ2 != null) {
            for (AbstractC1583720rJa abstractC1583720rJa : abstractC1583720rJaCQ2.LJIJI()) {
                if (fragment instanceof InterfaceC1583780rJg) {
                    InterfaceC1583780rJg interfaceC1583780rJg = (InterfaceC1583780rJg) fragment;
                    if (interfaceC1583780rJg.getHoxNodeTag().length() > 0 && Intrinsics.LJFF(interfaceC1583780rJg.getHoxNodeTag(), abstractC1583720rJa.tag())) {
                        return true;
                    }
                    if (((InterfaceC1583780rJg) fragment).getHoxNodeTag().length() != 0) {
                        continue;
                    }
                }
                Class<? extends Fragment> clsLJIJ = abstractC1583720rJa.LJIJ();
                if (clsLJIJ != null && clsLJIJ.isInstance(fragment)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean KQ2(String str) {
        AbstractC1583720rJa abstractC1583720rJaCQ2;
        AbstractC1583710rJZ abstractC1583710rJZ = this.LLILLL;
        if (abstractC1583710rJZ != null && (abstractC1583720rJaCQ2 = CQ2(abstractC1583710rJZ)) != null) {
            Iterator<AbstractC1583720rJa> it2 = abstractC1583720rJaCQ2.LJIJI().iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().tag(), str)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final <T extends Fragment> T Ki(String str) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 instanceof HoxFragmentNode) {
            T t = (T) ((HoxFragmentNode) abstractC1583720rJaGQ2).LLILZIL;
            if (!(t instanceof Fragment)) {
                return null;
            }
            return t;
        }
        if (abstractC1583720rJaGQ2 instanceof HoxFragmentGroup) {
            T t2 = (T) ((HoxFragmentGroup) abstractC1583720rJaGQ2).LLJI;
            if (t2 instanceof Fragment) {
                return t2;
            }
        }
        return null;
    }

    public final boolean LQ2(String str) {
        if (this.LLIZ && KQ2(str)) {
            return true;
        }
        return false;
    }

    public final void OQ2(InterfaceC1583770rJf interfaceC1583770rJf) {
        this.LLIZLLLIL.remove(interfaceC1583770rJf);
    }

    public final void QQ2(String str) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2("page_profile");
        if ((abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) && (abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2) != null) {
            abstractC1583710rJZ.LLILZLL = GQ2(str);
        }
    }

    public final void UQ2(AbstractC1583710rJZ abstractC1583710rJZ) {
        for (AbstractC1583720rJa abstractC1583720rJa : (ArrayList) abstractC1583710rJZ.LLIZLLLIL) {
            this.LLILZ.put(abstractC1583720rJa.tag(), abstractC1583720rJa);
            Class<? extends Fragment> clsLJIJ = abstractC1583720rJa.LJIJ();
            if (clsLJIJ != null) {
                if (this.LLILZIL.containsKey(clsLJIJ)) {
                    HashMap<String, AbstractC1583720rJa> map = this.LLILZIL.get(clsLJIJ);
                    if (map != null) {
                        map.put(abstractC1583720rJa.tag(), abstractC1583720rJa);
                    }
                } else {
                    HashMap<String, AbstractC1583720rJa> map2 = new HashMap<>();
                    map2.put(abstractC1583720rJa.tag(), abstractC1583720rJa);
                    this.LLILZIL.put(clsLJIJ, map2);
                }
            }
            if (abstractC1583720rJa instanceof AbstractC1583710rJZ) {
                UQ2((AbstractC1583710rJZ) abstractC1583720rJa);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String pz(Fragment fragment) {
        AbstractC1583710rJZ abstractC1583710rJZ = this.LLILLL;
        if (abstractC1583710rJZ == null || fragment == 0) {
            return null;
        }
        GQ2(abstractC1583710rJZ.tag());
        Class<?> cls = fragment.getClass();
        for (AbstractC1583720rJa abstractC1583720rJa : this.LLILZ.values()) {
            if (abstractC1583720rJa != null) {
                if (Intrinsics.LJFF(abstractC1583720rJa.LJIJ(), cls) && (!(fragment instanceof InterfaceC1583780rJg) || ((InterfaceC1583780rJg) fragment).getHoxNodeTag().length() == 0)) {
                    return abstractC1583720rJa.tag();
                }
                if ((fragment instanceof InterfaceC1583780rJg) && Intrinsics.LJFF(((InterfaceC1583780rJg) fragment).getHoxNodeTag(), abstractC1583720rJa.tag())) {
                    return abstractC1583720rJa.tag();
                }
            }
        }
        return null;
    }

    public final void vQ2(InterfaceC1583770rJf interfaceC1583770rJf) {
        this.LLIZLLLIL.addIfAbsent(interfaceC1583770rJf);
    }

    public final String DQ2(String str, boolean z) {
        AbstractC1583720rJa abstractC1583720rJa;
        String strTag;
        String strTag2;
        if (z) {
            AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
            while (abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) {
                abstractC1583720rJaGQ2 = ((AbstractC1583710rJZ) abstractC1583720rJaGQ2).LLILZLL;
            }
            if (abstractC1583720rJaGQ2 == null || (strTag2 = abstractC1583720rJaGQ2.tag()) == null) {
                return "";
            }
            return strTag2;
        }
        AbstractC1583720rJa abstractC1583720rJaGQ22 = GQ2(str);
        if (!(abstractC1583720rJaGQ22 instanceof AbstractC1583710rJZ) || (abstractC1583720rJa = ((AbstractC1583710rJZ) abstractC1583720rJaGQ22).LLILZLL) == null || (strTag = abstractC1583720rJa.tag()) == null) {
            return "";
        }
        return strTag;
    }

    public final void PQ2(String str, InterfaceC1583780rJg interfaceC1583780rJg) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 == null) {
            return;
        }
        C19719512Dh.LIZ(abstractC1583720rJaGQ2.LLILLJJLI).remove(interfaceC1583780rJg);
        C19719512Dh.LIZ(abstractC1583720rJaGQ2.LLILLL).remove(interfaceC1583780rJg);
        C19719512Dh.LIZ(abstractC1583720rJaGQ2.LLILZ).remove(interfaceC1583780rJg);
    }

    public final void SQ2(Bundle bundle, String str) {
        TQ2(bundle, "SHOP_MALL", false);
    }

    public final void wQ2(String str, InterfaceC1583780rJg interfaceC1583780rJg) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 == null) {
            return;
        }
        abstractC1583720rJaGQ2.LJIILLIIL(interfaceC1583780rJg);
        AbstractC1583710rJZ abstractC1583710rJZ = abstractC1583720rJaGQ2.LL;
        if (abstractC1583710rJZ != null && abstractC1583710rJZ.LLIZ) {
            AbstractC1583720rJa abstractC1583720rJa = null;
            if (abstractC1583710rJZ != null) {
                abstractC1583720rJa = abstractC1583710rJZ.LLILZLL;
            }
            if (Intrinsics.LJFF(abstractC1583720rJa, abstractC1583720rJaGQ2) && (interfaceC1583780rJg instanceof InterfaceC1055110dYz) && interfaceC1583780rJg != null) {
                Bundle bundle = new Bundle();
                if (!bundle.containsKey(abstractC1583710rJZ.tag())) {
                    bundle.putBoolean(abstractC1583710rJZ.tag(), true);
                }
                ((InterfaceC1055110dYz) interfaceC1583780rJg).onNodeShow(bundle);
            }
        }
    }

    public final void yQ2(Bundle bundle, String str) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 != null && (abstractC1583710rJZ = abstractC1583720rJaGQ2.LL) != null) {
            if (!bundle.containsKey(abstractC1583710rJZ.tag())) {
                bundle.putBoolean(abstractC1583710rJZ.tag(), true);
            }
            abstractC1583710rJZ.LJJIFFI(str, bundle, this.LLIZLLLIL, this.LLJ);
        }
    }

    public final void zQ2(C19EG c19eg, Lifecycle lifecycle) {
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            lifecycle.addObserver(this.LLJI);
        } else {
            c19eg.runOnUiThread(new ARunnableS57S0300000_24(c19eg, lifecycle, this, 1));
        }
        c19eg.getSupportFragmentManager().LJZL(this.LLJIJIL, true);
        this.LL = true;
    }

    public final void IQ2(C19EG c19eg, AbstractC1583710rJZ abstractC1583710rJZ, LifecycleOwner lifecycleOwner) {
        if (!Intrinsics.LJFF(c19eg, this.LLILLJJLI)) {
            zQ2(c19eg, lifecycleOwner.getLifecycle());
        } else if ((!C1563860qnY.LIZJ) && !this.LL) {
            zQ2(c19eg, lifecycleOwner.getLifecycle());
        }
        this.LLILLJJLI = c19eg;
        this.LLILLL = abstractC1583710rJZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void RQ2(int r3, android.os.Bundle r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "HOME"
            X.0rJa r1 = r2.GQ2(r0)
            boolean r0 = r1 instanceof X.AbstractC1583710rJZ
            if (r0 == 0) goto L28
            if (r3 < 0) goto L28
            X.0rJZ r1 = (X.AbstractC1583710rJZ) r1
            java.util.List<X.0rJa> r0 = r1.LLIZLLLIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r3 >= r0) goto L28
            java.util.List<X.0rJa> r0 = r1.LLIZLLLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.0rJa r0 = (X.AbstractC1583720rJa) r0
            java.lang.String r0 = r0.tag()
        L24:
            r2.TQ2(r4, r0, r5)
            return
        L28:
            java.lang.String r0 = ""
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hox.Hox.RQ2(int, android.os.Bundle, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x012e, code lost:
    
        if (r0 != null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TQ2(android.os.Bundle r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hox.Hox.TQ2(android.os.Bundle, java.lang.String, boolean):void");
    }

    public final void xQ2(int i, Bundle bundle, String str) {
        AbstractC1583720rJa abstractC1583720rJaGQ2 = GQ2(str);
        if (abstractC1583720rJaGQ2 != null && (abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ)) {
            if (!bundle.containsKey(abstractC1583720rJaGQ2.tag())) {
                bundle.putBoolean(abstractC1583720rJaGQ2.tag(), true);
            }
            AbstractC1583710rJZ abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2;
            abstractC1583710rJZ.LJJIFFI(((AbstractC1583720rJa) ListProtector.get(abstractC1583710rJZ.LLIZLLLIL, i)).tag(), bundle, this.LLIZLLLIL, this.LLJ);
        }
    }
}
