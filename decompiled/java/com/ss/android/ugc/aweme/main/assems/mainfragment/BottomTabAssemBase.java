package com.ss.android.ugc.aweme.main.assems.mainfragment;

import X.AbstractC1591090rVT;
import X.AbstractC2273051Dy3;
import X.AbstractC738140SxQ;
import X.C0DMM;
import X.C0S41;
import X.C0S4U;
import X.C1558520qew;
import X.C1570830qyn;
import X.C19EG;
import X.C296200BjG;
import X.C687700QyG;
import X.C724240Sb0;
import X.C996210c1z;
import X.EnumC592410NLj;
import X.InterfaceC1554640qYg;
import X.InterfaceC1592830rYH;
import X.InterfaceC494301wD;
import X.InterfaceC592390NLh;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.tabicon.ITabIconService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes25.dex */
public final class BottomTabAssemBase extends AbstractC738140SxQ implements BottomTabAbility, InterfaceC592390NLh, InterfaceC1554640qYg, InterfaceC737790Swr {
    public final BottomTabAssemBase LL = this;
    public ViewGroup LLILLJJLI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 154805478) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<android.view.View, java.util.List<java.lang.Object>> CJ0() {
        /*
            r10 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            android.view.ViewGroup r5 = r10.bo()
            X.19EG r0 = X.C724240Sb0.LIZ(r10)
            r9 = 0
            if (r0 == 0) goto L69
            android.view.View r2 = X.C1570830qyn.LIZ(r0)
        L14:
            r8 = 0
            r7 = 1
            if (r2 == 0) goto L25
            if (r2 == r5) goto L27
            X.0S41 r1 = X.C0S41.LIZ
            java.lang.String r0 = "BOTTOM_TAB_tablet_host"
            com.ss.android.ugc.aweme.feed.infra.riskapi.api.PFVisibleInfo r0 = r1.LIZIZ(r2, r8, r0, r7)
            r6.add(r0)
        L25:
            if (r5 == 0) goto L71
        L27:
            int r0 = r5.getChildCount()
            if (r0 == 0) goto L71
            int r4 = r5.getChildCount()
        L31:
            if (r8 >= r4) goto L6b
            android.view.View r3 = r5.getChildAt(r8)
            boolean r0 = r3 instanceof X.C1592950rYT
            if (r0 == 0) goto L67
            X.0rYT r3 = (X.C1592950rYT) r3
        L3d:
            X.0S41 r2 = X.C0S41.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "BOTTOM_TAB_"
            r1.append(r0)
            if (r3 == 0) goto L54
            X.0rYa r0 = r3.getIconData()
            if (r0 == 0) goto L54
            java.lang.String r0 = r0.LIZIZ
            if (r0 != 0) goto L56
        L54:
            java.lang.String r0 = ""
        L56:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            com.ss.android.ugc.aweme.feed.infra.riskapi.api.PFVisibleInfo r0 = r2.LIZIZ(r3, r7, r0, r7)
            r6.add(r0)
            int r8 = r8 + 1
            goto L31
        L67:
            r3 = r9
            goto L3d
        L69:
            r2 = r9
            goto L14
        L6b:
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r6)
            return r0
        L71:
            X.0S41 r1 = X.C0S41.LIZ
            java.lang.String r0 = "BOTTOM_TAB_parent"
            com.ss.android.ugc.aweme.feed.infra.riskapi.api.PFVisibleInfo r0 = r1.LIZIZ(r9, r8, r0, r7)
            r6.add(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.assems.mainfragment.BottomTabAssemBase.CJ0():kotlin.Pair");
    }

    public final ViewGroup bo() {
        if (this.LLILLJJLI == null) {
            C19EG c19egLIZ = C724240Sb0.LIZ(this);
            View viewFindViewById = c19egLIZ != null ? c19egLIZ.findViewById(R.id.nwe) : null;
            this.LLILLJJLI = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
        }
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final InterfaceC1592830rYH BQ0() {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        Object objLJIILLIIL = abstractC1591090rVTM260do != null ? abstractC1591090rVTM260do.LJIILLIIL() : null;
        if (objLJIILLIIL instanceof InterfaceC1592830rYH) {
            return (InterfaceC1592830rYH) objLJIILLIIL;
        }
        return null;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final AbstractC1591090rVT m260do() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            return null;
        }
        return homeTabAbilityLIZ.hQ1(c19egLIZ);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final boolean iK() {
        View viewLIZ;
        ViewGroup viewGroupBo = bo();
        if (viewGroupBo == null) {
            return false;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (viewLIZ = C1570830qyn.LIZ(c19egLIZ)) != null && viewLIZ != viewGroupBo) {
            C0S41.LIZ.getClass();
            if (!C0S41.LJ(0, viewLIZ, true).isValid()) {
                return false;
            }
        }
        C0S41.LIZ.getClass();
        if (!C0S41.LJ(0, viewGroupBo, true).isValid() || viewGroupBo.getChildCount() < 5) {
            return false;
        }
        int childCount = viewGroupBo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroupBo.getChildAt(i);
            C0S41.LIZ.getClass();
            if (!C0S41.LJ(0, childAt, true).isValid()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService != null) {
            iTabIconService.LJI(this, EnumC592410NLj.BOTTOM);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ITabIconService iTabIconService = (ITabIconService) PluggableExtentionKt.pluggableSpi$default(ITabIconService.class, false, false, false, 14, null);
        if (iTabIconService != null) {
            iTabIconService.LIZLLL(this, EnumC592410NLj.BOTTOM);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        if (C296200BjG.LIZ()) {
            return;
        }
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void vM1() {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJI();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void xj1() {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void A1(String str) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJJZI("SHOP_MALL");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void Hx(C996210c1z c996210c1z) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJJJ(c996210c1z);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void Ji1(AbstractC2273051Dy3 abstractC2273051Dy3) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJLL(abstractC2273051Dy3);
        }
    }

    @Override // X.InterfaceC592390NLh
    public final void Qm(String str) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJJI(str);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).unbindAbility(this.LL, BottomTabAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void m(String str) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJIIJJI(0, "SHOP_MALL");
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MainActivityScope.class}).bindAbility(this.LL, BottomTabAbility.class);
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void z2(String str) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJIFFI("SHOP_MALL");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void ta(int i, String str) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJIIJJI(i, "SHOP_MALL");
        }
    }

    @Override // com.ss.android.ugc.aweme.base.activity.BottomTabAbility
    public final void hw2(Drawable drawable, AbstractC2273051Dy3 abstractC2273051Dy3, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType) {
        AbstractC1591090rVT abstractC1591090rVTM260do = m260do();
        if (abstractC1591090rVTM260do != null) {
            abstractC1591090rVTM260do.LJJJJLI(drawable, abstractC2273051Dy3, layoutParams, scaleType);
        }
    }
}
