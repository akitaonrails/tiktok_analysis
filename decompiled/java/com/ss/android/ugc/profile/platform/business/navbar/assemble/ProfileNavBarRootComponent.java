package com.ss.android.ugc.profile.platform.business.navbar.assemble;

import X.AbstractC1250270idl;
import X.AbstractC1250290idn;
import X.AbstractC738140SxQ;
import X.C0C64;
import X.C0OM1;
import X.C1248990ibh;
import X.C1249090ibr;
import X.C1249110ibt;
import X.C1250230idh;
import X.C1250250idj;
import X.C13BV;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C723580SZw;
import X.C723850SaN;
import X.C724240Sb0;
import X.EnumC1249130ibv;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.profile.ui.v2.MyProfileAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileNavBarRootComponent extends BaseContainerComponent implements INavBarActionAbility {
    public TuxNavBar LLJJIJI;
    public List<? extends AbstractC1250290idn> LLJJIJIIJIL;
    public List<? extends AbstractC1250290idn> LLJJIJIL;
    public AbstractC1250270idl LLJJJ;
    public final C1559260qg8 LLJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJJJIL.getValue();
        C723850SaN.LIZLLL(this, new AwS385S0200000_19(c1249090ibr != null ? (ProfileComponents) c1249090ibr.LL : null, this, 139));
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void aG1() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileNavBarRoot", "updateNavActions all");
        TuxNavBar tuxNavBarBp = bp();
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL(this.LLJJIJIIJIL);
        c0om1.LIZ(this.LLJJIJIL);
        AbstractC1250270idl c1250250idj = this.LLJJJ;
        if (c1250250idj == null) {
            c1250250idj = new C1250250idj();
        }
        c0om1.LIZJ = c1250250idj;
        tuxNavBarBp.setNavActions(c0om1);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "profile_nav_bar_action_view_id", true, false)) {
            TuxNavBar tuxNavBarBp2 = bp();
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            ap(tuxNavBarBp2, linkedHashSet);
            for (String str : linkedHashSet) {
                View viewLJII = bp().LJII(str);
                if (viewLJII != null) {
                    Map<String, Integer> map = C1248990ibh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("profile_");
                    sbLIZ.append(str);
                    C1248990ibh.LIZ(viewLJII, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }

    public final TuxNavBar bp() {
        TuxNavBar tuxNavBar = this.LLJJIJI;
        if (tuxNavBar != null) {
            return tuxNavBar;
        }
        return null;
    }

    public ProfileNavBarRootComponent() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJIJIIJIL = c13bv;
        this.LLJJIJIL = c13bv;
        this.LLJJJIL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "nav_bar"), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final boolean Om() {
        MyProfileAbility myProfileAbility = (MyProfileAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), MyProfileAbility.class, null);
        if (myProfileAbility != null) {
            return myProfileAbility.Om();
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void cO1() {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        NavbarPlatformProtocol navbarPlatformProtocolAp;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(this);
        if (assemSupervisorLJ == null || (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) == null) {
            return;
        }
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            String str = abstractC738140SxQ.assemTagInternal;
            if (Intrinsics.LJFF(str, "nav_bar_center") || Intrinsics.LJFF(str, "nav_bar_end")) {
                AssemSupervisor assemSupervisorLJ2 = C724240Sb0.LJ(abstractC738140SxQ);
                if (assemSupervisorLJ2 != null && (copyOnWriteArrayList2 = assemSupervisorLJ2.LLJILLL) != null) {
                    for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList2) {
                        String str2 = abstractC738140SxQ2.assemTagInternal;
                        if (Intrinsics.LJFF(str2, "nav_bar_center_nickname") || Intrinsics.LJFF(str2, "nav_bar_end_settings")) {
                            if ((abstractC738140SxQ2 instanceof NavbarBaseUIComponent) && (navbarPlatformProtocolAp = ((NavbarBaseUIComponent) abstractC738140SxQ2).Ap()) != null) {
                                navbarPlatformProtocolAp.cO1();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, INavBarActionAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void EH(C1250230idh c1250230idh) {
        this.LLJJJ = c1250230idh;
        bp().LJIJJ(c1250230idh);
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void He0(List<? extends AbstractC1250290idn> list) {
        this.LLJJIJIL = list;
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        boolean zLJI = MethodIDManager.LJI(196702);
        C723850SaN.LIZLLL(this, new AwS385S0200000_19(profileComponents, this, 139));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void XM0(List<? extends AbstractC1250290idn> list) {
        this.LLJJIJIIJIL = list;
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final View d00(EnumC1249130ibv enumC1249130ibv) {
        boolean z;
        TuxNavBar tuxNavBarBp;
        if (this.LLJJIJI != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (tuxNavBarBp = bp()) == null) {
            return null;
        }
        int i = C1249110ibt.LIZ[enumC1249130ibv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return tuxNavBarBp.findViewById(R.id.p1k);
            }
            return tuxNavBarBp.findViewById(R.id.p1u);
        }
        return tuxNavBarBp.findViewById(R.id.p25);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(view instanceof TuxNavBar)) {
            return;
        }
        this.LLJJIJI = (TuxNavBar) view;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0030 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sN0(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "notifyComponentLoaded "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "ProfileNavBarRoot"
            X.0ijX r1 = X.EnumC1253850ijX.OTHERS
            java.lang.String r0 = ""
            X.C1248210iaR.LJ(r2, r3, r1, r0)
            java.lang.String r0 = "profile_background"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 != 0) goto L22
            return
        L22:
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r5)
            if (r0 == 0) goto L91
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L91
            java.util.Iterator r4 = r0.iterator()
        L30:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r3 = r4.next()
            X.0SxQ r3 = (X.AbstractC738140SxQ) r3
            java.lang.String r2 = r3.assemTagInternal
            if (r2 == 0) goto L30
            int r1 = r2.hashCode()
            r0 = 83483930(0x4f9dd1a, float:5.874267E-36)
            if (r1 == r0) goto L5c
            r0 = 1515155347(0x5a4f6f93, float:1.4596999E16)
            if (r1 == r0) goto L65
            r0 = 2116471453(0x7e26ca9d, float:5.542597E37)
            if (r1 != r0) goto L30
            java.lang.String r0 = "nav_bar_center"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6d
            goto L30
        L5c:
            java.lang.String r0 = "nav_bar_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L6d
            goto L30
        L65:
            java.lang.String r0 = "nav_bar_end"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L30
        L6d:
            com.bytedance.assem.arch.core.AssemSupervisor r0 = X.C724240Sb0.LJ(r3)
            if (r0 == 0) goto L30
            java.util.concurrent.CopyOnWriteArrayList<X.0SxQ> r0 = r0.LLJILLL
            if (r0 == 0) goto L30
            java.util.Iterator r2 = r0.iterator()
        L7b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r1 = r2.next()
            X.0SxQ r1 = (X.AbstractC738140SxQ) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent
            if (r0 == 0) goto L7b
            com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent r1 = (com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent) r1
            r1.Gp()
            goto L7b
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent.sN0(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.profile.platform.business.navbar.base.INavBarActionAbility
    public final void zm1(C1250250idj c1250250idj) {
        this.LLJJJ = c1250250idj;
        bp().LJIJJ(c1250250idj);
    }

    public static void ap(View view, Set set) {
        Object tag = view.getTag(R.id.z0x);
        if ((tag instanceof String) && tag != null) {
            set.add(tag);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ap(viewGroup.getChildAt(i), set);
        }
    }
}
