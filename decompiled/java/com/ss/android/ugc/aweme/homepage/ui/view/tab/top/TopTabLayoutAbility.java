package com.ss.android.ugc.aweme.homepage.ui.view.tab.top;

import X.AbstractC1583710rJZ;
import X.AbstractC1583720rJa;
import X.AbstractC1591090rVT;
import X.C01GW;
import X.C09RE;
import X.C0CAU;
import X.C0COX;
import X.C0DMM;
import X.C0QSJ;
import X.C0S41;
import X.C0S4U;
import X.C1388190mED;
import X.C14LC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1581500rG0;
import X.C1581510rG1;
import X.C1584320rKY;
import X.C1585150rLt;
import X.C1591450rW3;
import X.C1591480rW6;
import X.C1591670rWP;
import X.C1591880rWk;
import X.C1591960rWs;
import X.C1591970rWt;
import X.C1591980rWu;
import X.C1591990rWv;
import X.C1592010rWx;
import X.C1592080rX4;
import X.C1592450rXf;
import X.C1592470rXh;
import X.C19EG;
import X.C2188811AlT;
import X.C277790Auf;
import X.C296200BjG;
import X.C343710Ddh;
import X.C443120HZe;
import X.C452501pT;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC1571190qzN;
import X.EnumC1584360rKc;
import X.InterfaceC1294060jmO;
import X.InterfaceC1585190rLx;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS43S0110000_24;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class TopTabLayoutAbility implements TopTabAbility {
    public static TopTabLayoutAbility LLJ;
    public final C1592450rXf LL;
    public final FrameLayout LLILLJJLI;
    public C1591450rW3 LLILLL;
    public final Context LLILZ;
    public HomeTabAbility LLILZLL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C1591670rWP());
    public final C01GW LLIZ = C452501pT.LIZIZ(new C1592010rWx());
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C1591970rWt(this));

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final Pair IL2() {
        C1592450rXf c1592450rXf = this.LL;
        int iLJIILL = c1592450rXf.LJIILL("Following");
        Float fValueOf = Float.valueOf(0.0f);
        if (iLJIILL < 0 || iLJIILL >= c1592450rXf.getTabCount()) {
            return new Pair(fValueOf, 0);
        }
        View viewLJIILJJIL = c1592450rXf.LJIILJJIL(iLJIILL);
        if (viewLJIILJJIL == null) {
            return new Pair(fValueOf, 0);
        }
        return new Pair(Float.valueOf((Math.min(viewLJIILJJIL.getRight(), c1592450rXf.getScrollX() + c1592450rXf.getWidth()) - Math.max(viewLJIILJJIL.getLeft(), c1592450rXf.getScrollX())) / viewLJIILJJIL.getWidth()), Integer.valueOf(viewLJIILJJIL.getWidth()));
    }

    public final HomeTabAbility LIZIZ() {
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        if (this.LLILZLL == null) {
            Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.getContext());
            HomeTabAbility homeTabAbilityLIZ = null;
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) != null) {
                homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ);
            }
            this.LLILZLL = homeTabAbilityLIZ;
        }
        return this.LLILZLL;
    }

    public final List<Pair<View, Integer>> LJFF() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.LLILLJJLI.getChildCount();
        for (int i = 1; i < childCount; i++) {
            View childAt = this.LLILLJJLI.getChildAt(i);
            if (childAt instanceof LinearLayout) {
                ViewGroup viewGroup = (ViewGroup) childAt;
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = viewGroup.getChildAt(i2);
                    if (childAt2 instanceof TuxIconView) {
                        arrayList.add(new Pair(childAt2, 3));
                    } else if (childAt2 instanceof C1581500rG0) {
                        arrayList.add(new Pair(childAt2, 5));
                    }
                }
            } else {
                arrayList.add(new Pair(childAt, 3));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void QQ0() {
        C1591980rWu next;
        C1592080rX4 c1592080rX4;
        Iterator<C1591980rWu> it2 = this.LL.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (Intrinsics.LJFF(next.LJ, "Shop")) {
                    break;
                }
            }
        }
        C1591980rWu c1591980rWu = next;
        if (c1591980rWu == null || (c1592080rX4 = c1591980rWu.LIZLLL) == null) {
            return;
        }
        c1592080rX4.performClick();
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final boolean T40() {
        View viewLJIILJJIL;
        C1592450rXf c1592450rXf = this.LL;
        int iLJIILL = c1592450rXf.LJIILL("Shop");
        if (iLJIILL < 0 || iLJIILL >= c1592450rXf.getTabCount() || (viewLJIILJJIL = c1592450rXf.LJIILJJIL(iLJIILL)) == null) {
            return false;
        }
        return viewLJIILJJIL.getLeft() >= c1592450rXf.getScrollX() && viewLJIILJJIL.getRight() <= c1592450rXf.getScrollX() + c1592450rXf.getWidth();
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final ITabTransformer ay2() {
        return (ITabTransformer) this.LLIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final boolean lF1() {
        ViewGroup viewGroup;
        boolean z = false;
        View childAt = this.LL.getChildAt(0);
        if (!(childAt instanceof ViewGroup) || (viewGroup = (ViewGroup) childAt) == null || viewGroup.getChildCount() == 0) {
            return false;
        }
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt2 = viewGroup.getChildAt(i);
            C0S41.LIZ.getClass();
            if (!C0S41.LJ(6, childAt2, true).isValid()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final C443120HZe<View, List<Pair<View, Integer>>, List<Object>> td2() {
        View childAt;
        ViewGroup viewGroup;
        C1592080rX4 c1592080rX4;
        ArrayList arrayList = new ArrayList();
        View childAt2 = this.LL.getChildAt(0);
        ViewGroup viewGroup2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : null;
        if (viewGroup2 == null || viewGroup2.getChildCount() == 0) {
            arrayList.add(C0S41.LIZ.LIZIZ(null, 0, "TOP_TAB_parent", true));
            return new C443120HZe<>(viewGroup2, null, arrayList);
        }
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt3 = viewGroup2.getChildAt(i);
            if ((childAt3 instanceof C1592080rX4) && (c1592080rX4 = (C1592080rX4) childAt3) != null) {
                C0S41 c0s41 = C0S41.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("TOP_TAB_");
                C1591980rWu tab = c1592080rX4.getTab();
                sbLIZ.append(tab != null ? tab.LIZIZ() : null);
                arrayList.add(c0s41.LIZIZ(c1592080rX4, 6, C2188811AlT.LIZIZ(sbLIZ), true));
            }
        }
        List<Pair<View, Integer>> listLJFF = LJFF();
        int size = ((ArrayList) listLJFF).size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) ListProtector.get(listLJFF, i2);
            C1584320rKY c1584320rKY = C1584320rKY.LIZ;
            String strLIZLLL = LIZLLL((View) pair.getFirst());
            c1584320rKY.getClass();
            EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strLIZLLL);
            Object key = enumC1584360rKcLJIIIIZZ != null ? enumC1584360rKcLJIIIIZZ.getKey() : null;
            if (!(pair.getFirst() instanceof C1581500rG0) || ((ViewGroup) pair.getFirst()).getChildCount() == 0) {
                childAt = (View) pair.getFirst();
            } else {
                Object first = pair.getFirst();
                childAt = (!(first instanceof C1581500rG0) || (viewGroup = (ViewGroup) first) == null) ? null : viewGroup.getChildAt(0);
            }
            C0S41 c0s412 = C0S41.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("TOP_ICON_");
            if (key == null) {
                key = Integer.valueOf(i2);
            }
            sbLIZ2.append(key);
            arrayList.add(c0s412.LIZIZ(childAt, ((Number) pair.getSecond()).intValue(), C2188811AlT.LIZIZ(sbLIZ2), true));
        }
        return new C443120HZe<>(viewGroup2, listLJFF, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void uC2() {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZ);
        if (c19egLIZIZ == null) {
            return;
        }
        String strCQ2 = C343710Ddh.LIZ(c19egLIZIZ).CQ2();
        if (Intrinsics.LJFF(strCQ2, "HOME")) {
            new AwS603S0100000_24(this, 91).invoke(this.LL.LLILLJJLI);
            HandlerHook.viewPost(this.LL, new ARunnableS124S0100000_24(this, 34));
        } else {
            AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(c19egLIZIZ).y01();
            if (abstractC1591090rVTY01 != null) {
                abstractC1591090rVTY01.LJJJ(strCQ2);
            }
        }
        C1592450rXf c1592450rXf = this.LL;
        c1592450rXf.LJIIIIZZ(c1592450rXf.getSelectedTabPosition());
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016d  */
    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Si0() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.TopTabLayoutAbility.Si0():boolean");
    }

    public static String LIZLLL(View view) {
        Object tag;
        View view2;
        Object tag2;
        View view3;
        if (view == null) {
            return null;
        }
        boolean z = view.getParent() instanceof C1581500rG0;
        View parent = view;
        if (z) {
            parent = view.getParent();
        }
        if (C1581510rG1.LIZIZ()) {
            if ((parent instanceof View) && (view3 = parent) != null) {
                tag2 = view3.getTag(R.id.jqu);
            } else {
                tag2 = null;
            }
            if (!(tag2 instanceof String)) {
                return null;
            }
            return (String) tag2;
        }
        if ((parent instanceof View) && (view2 = parent) != null) {
            tag = view2.getTag();
        } else {
            tag = null;
        }
        if (!(tag instanceof String)) {
            return null;
        }
        return (String) tag;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void J10(String str) {
        C1591980rWu c1591980rWuLJIILIIL;
        EnumC1571190qzN enumC1571190qzN;
        if (str != null && str.length() != 0) {
            c1591980rWuLJIILIIL = this.LL.LJIIL(str);
        } else {
            C1592450rXf c1592450rXf = this.LL;
            c1591980rWuLJIILIIL = c1592450rXf.LJIILIIL(c1592450rXf.getSelectedTabPosition());
        }
        if (c1591980rWuLJIILIIL == null) {
            return;
        }
        C1591990rWv c1591990rWv = c1591980rWuLJIILIIL.LJI;
        if (c1591990rWv != null) {
            enumC1571190qzN = c1591990rWv.LIZ;
        } else {
            enumC1571190qzN = null;
        }
        if (enumC1571190qzN == EnumC1571190qzN.LIGHT) {
            LIZ(c1591980rWuLJIILIIL.LIZIZ(), true);
        } else {
            LIZ(c1591980rWuLJIILIIL.LIZIZ(), false);
        }
    }

    public final void LJI(int i) {
        ViewGroup viewGroup;
        ViewParent parent = this.LL.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C09RE c09re = new C09RE(viewGroup);
            while (c09re.hasNext()) {
                View view = (View) c09re.next();
                if (view.getId() == R.id.jqj && (view instanceof TuxIconView)) {
                    ((TuxIconView) view).setTintColorRes(i);
                    return;
                }
            }
        }
    }

    public final void LJII(boolean z) {
        AbstractC1591090rVT abstractC1591090rVT;
        C1592450rXf c1592450rXf = this.LL;
        c1592450rXf.LJJII(new AwS603S0100000_24(this, 92));
        c1592450rXf.setSelectedTabIndicatorColor(c1592450rXf.getContext().getResources().getColor(R.color.f569bc));
        C1592470rXh c1592470rXh = c1592450rXf.LLILLL;
        c1592470rXh.LIZ();
        c1592470rXh.postInvalidateOnAnimation();
        if (C1591480rW6.LIZ() != 2 && C1591480rW6.LIZ() != 3) {
            LJI(R.attr.ee);
        } else {
            C1591450rW3 c1591450rW3 = this.LLILLL;
            if (c1591450rW3 != null) {
                c1591450rW3.LIZ(false);
            }
        }
        if (z && (abstractC1591090rVT = (AbstractC1591090rVT) this.LLIZLLLIL.getValue()) != null) {
            abstractC1591090rVT.LJJJLZIJ(null, EnumC1571190qzN.DARK);
        }
    }

    public final void LJIIJ(boolean z) {
        AbstractC1591090rVT abstractC1591090rVT;
        C1592450rXf c1592450rXf = this.LL;
        c1592450rXf.LJJII(new AwS603S0100000_24(this, 93));
        c1592450rXf.setSelectedTabIndicatorColor(c1592450rXf.getContext().getResources().getColor(R.color.bi));
        C1592470rXh c1592470rXh = c1592450rXf.LLILLL;
        Paint paint = c1592470rXh.LLILZIL;
        if (paint != null) {
            paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        c1592470rXh.postInvalidateOnAnimation();
        if (C1591480rW6.LIZ() != 2 && C1591480rW6.LIZ() != 3) {
            LJI(R.attr.oh);
        } else {
            C1591450rW3 c1591450rW3 = this.LLILLL;
            if (c1591450rW3 != null) {
                c1591450rW3.LIZ(true);
            }
        }
        if (z && (abstractC1591090rVT = (AbstractC1591090rVT) this.LLIZLLLIL.getValue()) != null) {
            abstractC1591090rVT.LJJJLZIJ(null, EnumC1571190qzN.LIGHT);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    @InterfaceC1294060jmO
    public final void ao(InterfaceC1585190rLx interfaceC1585190rLx) {
        AbstractC1583710rJZ abstractC1583710rJZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext());
        if (c19egLIZIZ == null) {
            return;
        }
        AbstractC1583720rJa abstractC1583720rJaGQ2 = Hox.LLJILJIL.LIZ(c19egLIZIZ).GQ2("HOME");
        if ((abstractC1583720rJaGQ2 instanceof AbstractC1583710rJZ) && (abstractC1583710rJZ = (AbstractC1583710rJZ) abstractC1583720rJaGQ2) != null) {
            C1585150rLt c1585150rLt = new C1585150rLt(interfaceC1585190rLx);
            ((List) this.LLILZIL.getValue()).add(c1585150rLt);
            abstractC1583710rJZ.LJJI(c1585150rLt);
        }
    }

    public TopTabLayoutAbility(C1592450rXf c1592450rXf, FrameLayout frameLayout) {
        this.LL = c1592450rXf;
        this.LLILLJJLI = frameLayout;
        this.LLILZ = c1592450rXf.getContext();
    }

    public final void LIZ(String str, boolean z) {
        boolean z2;
        EnumC1571190qzN enumC1571190qzN;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZ);
        if (c19egLIZIZ == null) {
            return;
        }
        if (C14LC.LJIILL <= 0 && C0COX.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Number) C277790Auf.LIZ.getValue()).intValue() > 0) {
            if (z) {
                enumC1571190qzN = EnumC1571190qzN.LIGHT;
            } else {
                enumC1571190qzN = EnumC1571190qzN.DARK;
            }
            C1591960rWs.LIZ(c19egLIZIZ, z2, str, enumC1571190qzN);
            return;
        }
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZIZ);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZIZ, immersionBarLJIILJJIL);
        boolean zLJFF = Intrinsics.LJFF(str, "Nearby");
        int i = R.attr.e1;
        if (zLJFF) {
            immersionBarLJIILJJIL.LJIIL();
            if (z) {
                i = R.attr.bx;
            }
            tuxImmersionBar.LJ(i);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
            return;
        }
        if (z) {
            tuxImmersionBar.LJIIIIZZ(R.attr.bx);
            tuxImmersionBar.LJ(R.attr.bx);
            tuxImmersionBar.LIZ(true);
            tuxImmersionBar.LIZLLL();
            return;
        }
        if (z2) {
            tuxImmersionBar.LJIIL();
        } else {
            tuxImmersionBar.LJIIIIZZ(R.attr.e1);
        }
        tuxImmersionBar.LJ(R.attr.e1);
        tuxImmersionBar.LIZ(true);
        tuxImmersionBar.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void AD2(String str, boolean z, boolean z2) {
        LIZ(str, true);
        if (z) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS43S0110000_24(this, z2, 2));
        } else {
            LJIIJ(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void Tr0(String str, EnumC1571190qzN enumC1571190qzN, EnumC1571190qzN enumC1571190qzN2) {
        HomeTabAbility homeTabAbility;
        C1591980rWu c1591980rWuLJIIJJI;
        List<TopTabProtocol> listB9;
        Object ability;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLILZ);
        if (c19egLIZIZ == null) {
            return;
        }
        TopTabProtocol topTabProtocol = null;
        if (C296200BjG.LIZ()) {
            C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJI(c19egLIZIZ, null), MainActivityScope.class);
            if (c0qsjLIZJ != null) {
                ability = c0qsjLIZJ.getAbility(HomeTabAbility.class);
            } else {
                ability = null;
            }
            if (!(ability instanceof HomeTabAbility)) {
                ability = null;
            }
            homeTabAbility = (HomeTabAbility) ability;
        } else {
            homeTabAbility = (HomeTabAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), HomeTabAbility.class, null);
        }
        if (homeTabAbility != null && (listB9 = homeTabAbility.b9()) != null) {
            Iterator<TopTabProtocol> it2 = listB9.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                TopTabProtocol next = it2.next();
                if (Intrinsics.LJFF(next.getTag(), str)) {
                    topTabProtocol = next;
                    break;
                }
            }
            TopTabProtocol topTabProtocol2 = topTabProtocol;
            if (topTabProtocol2 != null) {
                topTabProtocol2.LJIILJJIL(enumC1571190qzN, enumC1571190qzN2);
            }
        }
        if (enumC1571190qzN != null && (c1591980rWuLJIIJJI = this.LL.LJIIJJI(str)) != null) {
            C1591990rWv c1591990rWv = c1591980rWuLJIIJJI.LJI;
            if (c1591990rWv != null) {
                c1591990rWv.LIZ = enumC1571190qzN;
            }
            if (enumC1571190qzN2 != null && c1591990rWv != null) {
                c1591990rWv.LIZIZ = enumC1571190qzN2;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.TopTabAbility
    public final void e01(String str, boolean z, boolean z2) {
        LIZ(str, false);
        if (z) {
            C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS43S0110000_24(this, z2, 1));
        } else {
            LJII(z2);
        }
    }
}
