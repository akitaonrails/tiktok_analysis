package com.ss.android.ugc.profile.platform.business.navbar.base;

import X.C01GW;
import X.C09YG;
import X.C0HZP;
import X.C1248210iaR;
import X.C1248840ibS;
import X.C1248940ibc;
import X.C1250210idf;
import X.C1250280idm;
import X.C1251150ifB;
import X.C1251670ig1;
import X.C1558520qew;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1249130ibv;
import X.EnumC1253850ijX;
import X.InterfaceC1249500icW;
import X.InterfaceC1250930iep;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.menu.ability.IPageMenuAbility;
import com.ss.android.ugc.profile.business.profile.menu.viewmodel.ProfileMenuViewModel;
import com.ss.android.ugc.profile.platform.base.base.IProfileBackgroundAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS159S0101000_19;
import kotlin.jvm.internal.AwS228S0300000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class NavbarBaseUIComponent<T extends BizBaseData> extends BaseUIComponent implements InterfaceC1249500icW, InterfaceC1250930iep {
    public T LLJLIL;
    public boolean LLJZ;
    public boolean LLLFFI;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2546));
    public final C1251150ifB LLJJLIIIJLLLLLLLZ = new C1251150ifB();
    public final C1250280idm LLJL = new C1250280idm();
    public final boolean LLJLILLLLZIIL = true;
    public final C630740Ooa LLJLL = C628500Oky.LIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2543));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2548));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2550));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(568));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2545));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2544));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2549));

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final NavbarPlatformProtocol<T> Ap() {
        return (NavbarPlatformProtocol) this.LLJLLIL.getValue();
    }

    public final TuxIconView Bp() {
        return (TuxIconView) this.LLJLLL.getValue();
    }

    public final void Fp() {
        ProfileComponents profileComponents;
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        int type = C09YG.TYPE_CLICK.getType();
        C1248940ibc c1248940ibcZp = zp();
        C1248840ibS.LIZ(c1248840ibS, type, (c1248940ibcZp == null || (profileComponents = c1248940ibcZp.LLILLL) == null) ? null : profileComponents.eventParams, new AwS668S0100000_19(this, 32), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        IPageMenuAbility iPageMenuAbility;
        ProfileMenuViewModel profileMenuViewModelZn2;
        Ep(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2542), new AwS598S0100000_19((NavbarBaseUIComponent) this, 487));
        if (this.LLJLILLLLZIIL && (iPageMenuAbility = (IPageMenuAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPageMenuAbility.class, null)) != null && (profileMenuViewModelZn2 = iPageMenuAbility.zn2()) != null) {
            C736680Sv4.LJIIIIZZ(this, profileMenuViewModelZn2, new C2217381BqS() { // from class: X.0icN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C596330NaB) obj).LLILLL);
                }
            }, C736820SvI.LIZLLL(), new AwS633S0100000_19((NavbarBaseUIComponent) this, 171), 4);
        }
        TuxIconView tuxIconViewBp = Bp();
        ProfileComponents profileComponents = this.LLJJJ;
        C1251670ig1.LIZ(tuxIconViewBp, profileComponents != null ? profileComponents.componentName : null);
    }

    public final String Jp() {
        String str = this.assemTagInternal;
        return str == null ? "" : str;
    }

    public final void Qp() {
        if (Intrinsics.LJFF(this.LLJILJILJ, "nav_bar_start_tiktok_plus")) {
            return;
        }
        boolean z = this.LLJZ && !this.LLLFFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateIconStyleForBackground: hasBackground=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(", isSticky=");
        sbLIZ.append(this.LLLFFI);
        sbLIZ.append(", shouldApply=");
        sbLIZ.append(z);
        sbLIZ.append(", this=");
        sbLIZ.append(this);
        C1248210iaR.LJ("NavbarBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        int i = C0HZP.LIZ;
        C0HZP.LIZ(Bp(), Bp(), z);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        Ep(new AwS563S0100000_19((NavbarBaseUIComponent) this, 2551), new AwS598S0100000_19((NavbarBaseUIComponent) this, 488));
    }

    public final int yp() {
        return ((Number) this.LLJZIJLIL.getValue()).intValue();
    }

    public final C1248940ibc zp() {
        return (C1248940ibc) this.LLJJL.getValue();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        ProfileComponents profileComponents;
        Ap();
        C1248840ibS c1248840ibS = C1248840ibS.LIZ;
        int type = C09YG.TYPE_SHOW.getType();
        C1248940ibc c1248940ibcZp = zp();
        C1248840ibS.LIZ(c1248840ibS, type, (c1248940ibcZp == null || (profileComponents = c1248940ibcZp.LLILLL) == null) ? null : profileComponents.eventParams, new AwS668S0100000_19(this, 31), 4);
    }

    public final void Gp() {
        IProfileBackgroundAbility iProfileBackgroundAbility = (IProfileBackgroundAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBackgroundAbility.class, null);
        if (iProfileBackgroundAbility == null) {
            C1248210iaR.LIZJ("NavbarBaseUIComponent", "registerBackgroundListener: no background ability found", EnumC1253850ijX.OTHERS, "");
            return;
        }
        iProfileBackgroundAbility.cR(this);
        this.LLJZ = iProfileBackgroundAbility.VR1();
        this.LLLFFI = iProfileBackgroundAbility.Cw0();
        Qp();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerBackgroundListener: hasBackground=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(", isSticky=");
        sbLIZ.append(this.LLLFFI);
        C1248210iaR.LJ("NavbarBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bp() {
        /*
            r3 = this;
            X.0ibc r0 = r3.zp()
            if (r0 == 0) goto La0
            int r0 = r0.LLILLJJLI
        L8:
            r3.LLJILLL = r0
            X.0ibc r1 = r3.zp()
            r0 = 0
            if (r1 == 0) goto L13
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = r1.LLILLL
        L13:
            r3.LLJJJ = r0
            com.ss.android.ugc.profile.platform.standard.protocol.component.NavbarPlatformProtocol r1 = r3.Ap()
            if (r1 == 0) goto L31
            X.0ibc r0 = r3.zp()
            r1.LLJJJJ = r0
            X.0icI r0 = new X.0icI
            r0.<init>(r3)
            r1.LLJJL = r0
            kotlin.jvm.internal.AwS563S0100000_19 r2 = new kotlin.jvm.internal.AwS563S0100000_19
            r0 = 2547(0x9f3, float:3.569E-42)
            r2.<init>(r3, r0)
            r1.LLJJIII = r2
        L31:
            boolean r0 = X.C268330AfP.LIZLLL()
            r2 = 1
            if (r0 != 0) goto L88
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "profile_nav_bar_show_common_comp_op"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)
            if (r0 != 0) goto L88
            if (r1 == 0) goto L84
            X.0idn r0 = r1.LJJLIIIJLJLI()
            if (r0 != 0) goto L85
            if (r1 == 0) goto L84
            X.0idm r0 = r3.LLJL
            r1.LJL(r0)
        L56:
            X.01GW r0 = r3.LLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LLJL = r0
            X.01GW r0 = r3.LLLF
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LLJLIL = r0
            int r0 = r3.yp()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LLJLILLLLZIIL = r0
        L84:
            return
        L85:
            if (r1 == 0) goto L84
            goto L56
        L88:
            if (r1 == 0) goto L84
            X.0idn r0 = r1.LJJLIIIJLJLI()
            if (r0 == 0) goto L9d
            r1.getClass()
            boolean r0 = r1 instanceof com.ss.android.ugc.profile.business.ur.platform.addfriends.ProfileNavbarAddFriendProtocol
            if (r0 != r2) goto L56
        L97:
            X.0idm r0 = r3.LLJL
            r1.LJL(r0)
            goto L56
        L9d:
            if (r1 == 0) goto L84
            goto L97
        La0:
            r0 = -1
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent.bp():void");
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void dp() {
        ProfileComponents profileComponents;
        n nVar;
        C1248940ibc c1248940ibcZp = zp();
        if (c1248940ibcZp == null || (profileComponents = c1248940ibcZp.LLILLL) == null || (nVar = profileComponents.bizData) == null) {
            return;
        }
        ep(nVar);
    }

    @Override // X.InterfaceC1249500icW
    public final void oa() {
        NavbarPlatformProtocol<T> navbarPlatformProtocolAp = Ap();
        if (navbarPlatformProtocolAp != null) {
            navbarPlatformProtocolAp.LJJZZI();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String str;
        EnumC1249130ibv enumC1249130ibv;
        INavbarBaseAbility iNavbarBaseAbility;
        ProfileComponents profileComponents;
        String str2;
        ProfileComponents profileComponents2;
        C1248940ibc c1248940ibcZp = zp();
        String str3 = "";
        if (c1248940ibcZp == null || (profileComponents2 = c1248940ibcZp.LLILLL) == null || (str = profileComponents2.componentId) == null) {
            str = "";
        }
        this.LLJILJIL = str;
        C1248940ibc c1248940ibcZp2 = zp();
        if (c1248940ibcZp2 != null && (profileComponents = c1248940ibcZp2.LLILLL) != null && (str2 = profileComponents.componentName) != null) {
            str3 = str2;
        }
        this.LLJILJILJ = str3;
        C1248940ibc c1248940ibcZp3 = zp();
        this.LLJJJ = c1248940ibcZp3 != null ? c1248940ibcZp3.LLILLL : null;
        super.onCreate();
        C1248940ibc c1248940ibcZp4 = zp();
        if (c1248940ibcZp4 == null || (enumC1249130ibv = c1248940ibcZp4.LL) == null || (iNavbarBaseAbility = (INavbarBaseAbility) this.LLJLL.getValue()) == null) {
            return;
        }
        iNavbarBaseAbility.Pf1(enumC1249130ibv, true);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        EnumC1249130ibv enumC1249130ibv;
        INavbarBaseAbility iNavbarBaseAbility;
        super.onDestroy();
        C1248940ibc c1248940ibcZp = zp();
        if (c1248940ibcZp != null && (enumC1249130ibv = c1248940ibcZp.LL) != null && (iNavbarBaseAbility = (INavbarBaseAbility) this.LLJLL.getValue()) != null) {
            iNavbarBaseAbility.LL0(enumC1249130ibv, this.LLJILLL, Jp());
        }
        NavbarPlatformProtocol<T> navbarPlatformProtocolAp = Ap();
        if (navbarPlatformProtocolAp != null) {
            navbarPlatformProtocolAp.LJL(null);
            navbarPlatformProtocolAp.LLJJJJLIIL = null;
        }
        IProfileBackgroundAbility iProfileBackgroundAbility = (IProfileBackgroundAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBackgroundAbility.class, null);
        if (iProfileBackgroundAbility != null) {
            iProfileBackgroundAbility.Z00(this);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        Gp();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        super.Hj(profileComponents);
        this.LLJJJ = profileComponents;
        NavbarPlatformProtocol<T> navbarPlatformProtocolAp = Ap();
        if (!this.LLJJJJJIL) {
            if (navbarPlatformProtocolAp != null) {
                navbarPlatformProtocolAp.LLJILJILJ = profileComponents;
            }
            n nVar = profileComponents.bizData;
            if (nVar != null) {
                ep(nVar);
            }
            tp();
        }
    }

    public final void Ip(int i) {
        super.Xn(i);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Xn(int i) {
        Ep(new AwS159S0101000_19(this, i, 4), new AwS127S0101000_19(this, i, 7));
    }

    @Override // X.InterfaceC1249500icW
    public final void Zn(int i) {
        Ep(new AwS159S0101000_19(this, i, 3), new AwS33S0001000_19(i, 6));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void ep(n nVar) {
        BizBaseData bizBaseData = (BizBaseData) C1250210idf.LIZ(nVar.toString(), BizBaseData.class);
        Ep(new AwS420S0200000_19(bizBaseData, (BizBaseData) this, 122), new AwS228S0300000_19(nVar, (n) this, bizBaseData, (BizBaseData) 21));
    }

    @Override // X.InterfaceC1250930iep
    public final void me(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBackgroundChanged: hasBackground=");
        sbLIZ.append(z);
        sbLIZ.append(", current has=");
        sbLIZ.append(this.LLJZ);
        C1248210iaR.LJ("NavbarBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        if (this.LLJZ != z) {
            this.LLJZ = z;
            Qp();
        }
    }

    @Override // X.InterfaceC1250930iep
    public final void v6(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStickyStateChanged: isSticky=");
        sbLIZ.append(z);
        sbLIZ.append(", current isSticky=");
        sbLIZ.append(this.LLLFFI);
        C1248210iaR.LJ("NavbarBaseUIComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.OTHERS, "");
        if (this.LLLFFI != z) {
            this.LLLFFI = z;
            Qp();
        }
    }

    public final void Ep(Function0<Unit> function0, Function1<? super NavbarPlatformProtocol<T>, Unit> function1) {
        if (cp()) {
            function1.invoke(Ap());
        } else {
            function0.invoke();
        }
    }
}
