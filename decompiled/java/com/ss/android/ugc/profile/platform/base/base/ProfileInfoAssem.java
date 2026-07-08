package com.ss.android.ugc.profile.platform.base.base;

import X.AbstractC738140SxQ;
import X.C1245340iVo;
import X.C1252710ihh;
import X.C13LE;
import X.C16FB;
import X.C724240Sb0;
import X.EnumC1248370iah;
import X.EnumC1251790igD;
import X.InterfaceC1251830igH;
import X.InterfaceC1252070igf;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootComponent;
import com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssem;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileInfoAssem extends UIContentAssem implements InterfaceC1252070igf {
    public static final int LLJILJIL = 8;
    public C16FB LLIZLLLIL;
    public boolean LLJ;
    public ProfileViewModel LLJI;
    public boolean LLJIJIL;

    public void Go(int i, EnumC1251790igD enumC1251790igD, String str) {
    }

    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    public void No() {
    }

    public void Oo() {
    }

    public abstract String getEnterFrom();

    public final void HH() {
        AssemSupervisor assemSupervisorLIZJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        AssemSupervisor assemSupervisorLJ;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList2;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI == null || (assemSupervisorLIZJ = C724240Sb0.LIZJ(fragmentLJI)) == null || (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) == null) {
            return;
        }
        for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
            if ((abstractC738140SxQ instanceof ProfileRootComponent) && (assemSupervisorLJ = C724240Sb0.LJ(abstractC738140SxQ)) != null && (copyOnWriteArrayList2 = assemSupervisorLJ.LLJILLL) != null) {
                for (AbstractC738140SxQ abstractC738140SxQ2 : copyOnWriteArrayList2) {
                    if ((abstractC738140SxQ2 instanceof MineAwemePagerAssem) || (abstractC738140SxQ2 instanceof UserAwemePagerAssemV2)) {
                        InterfaceC1251830igH interfaceC1251830igH = (InterfaceC1251830igH) C1252710ihh.LJI(abstractC738140SxQ2, C13LE.LIZ(InterfaceC1251830igH.class), null);
                        if (interfaceC1251830igH != null) {
                            interfaceC1251830igH.HH();
                        }
                    }
                }
            }
        }
    }

    public final ProfileViewModel Jo() {
        return this.LLJI;
    }

    public final C16FB Lo() {
        return this.LLIZLLLIL;
    }

    public final boolean mB0() {
        return this.LLJ;
    }

    public final void So(ProfileViewModel profileViewModel) {
        this.LLJI = profileViewModel;
    }

    public final void Vo(C16FB c16fb) {
        this.LLIZLLLIL = c16fb;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r11) {
        /*
            r10 = this;
            X.10Tv r0 = X.C19252910Tv.LIZIZ
            X.0sAf r0 = r0.LIZLLL()
            X.0ic4 r0 = r0.LJI()
            r0.LJI()
            r0 = 2131388041(0x7f0a6689, float:1.8396586E38)
            android.view.View r0 = r11.findViewById(r0)
            X.16FB r0 = (X.C16FB) r0
            r10.LLIZLLLIL = r0
            X.0Q7z r1 = X.C1558520qew.LJIIL(r10)
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility> r0 = com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility.class
            r6 = 0
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r6)
            com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility r0 = (com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility) r0
            if (r0 == 0) goto L8e
            boolean r0 = r0.q1()
            r3 = 1
            if (r0 != r3) goto L8e
        L2e:
            boolean r0 = X.C299890BpD.LIZ()
            if (r0 == 0) goto L57
            if (r3 != 0) goto L57
            androidx.fragment.app.Fragment r0 = X.C724240Sb0.LJI(r10)
            if (r0 == 0) goto L57
            com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel r4 = X.C1075590e61.LIZ(r0)
            r10.LLJI = r4
            kotlin.jvm.internal.AwS598S0100000_19 r1 = new kotlin.jvm.internal.AwS598S0100000_19
            r0 = 454(0x1c6, float:6.36E-43)
            r1.<init>(r10, r0)
            X.0igC r5 = new X.C2217381BqS() { // from class: X.0igC
                static {
                    /*
                        X.0igC r0 = new X.0igC
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0igC) X.0igC.LL X.0igC
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1251780igC.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState> r3 = com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState.class
                        java.lang.String r2 = "isLocating()Z"
                        r1 = 0
                        java.lang.String r0 = "isLocating"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1251780igC.<init>():void");
                }

                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState r2 = (com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileState) r2
                        boolean r0 = r2.isLocating()
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1251780igC.get(java.lang.Object):java.lang.Object");
                }
            }
            kotlin.jvm.internal.AwS598S0100000_19 r7 = new kotlin.jvm.internal.AwS598S0100000_19
            r0 = 842(0x34a, float:1.18E-42)
            r7.<init>(r1, r0)
            r8 = 2
            r9 = r6
            com.bytedance.jedi.arch.JediViewModel.bR2(r4, r5, r6, r7, r8, r9)
        L57:
            boolean r0 = X.C627350Oj7.LIZ()
            if (r0 == 0) goto L7d
            X.16FB r2 = r10.LLIZLLLIL
            if (r2 == 0) goto L6a
            kotlin.jvm.internal.AwS137S0110000_19 r1 = new kotlin.jvm.internal.AwS137S0110000_19
            r0 = 5
            r1.<init>(r3, r10, r0)
            r2.setOnRefreshListener(r1)
        L6a:
            X.16FB r1 = r10.LLIZLLLIL
            if (r1 == 0) goto L79
            boolean r0 = X.C627350Oj7.LIZ()
            if (r0 == 0) goto L7a
            X.10o9 r0 = X.EnumC19356710o9.ONLY_TOP
        L76:
            r1.setOverScrollMode(r0)
        L79:
            return
        L7a:
            X.10o9 r0 = X.EnumC19356710o9.NONE
            goto L76
        L7d:
            X.16FB r0 = r10.LLIZLLLIL
            if (r0 == 0) goto L84
            r0.setNestedHeader(r6)
        L84:
            X.16FB r1 = r10.LLIZLLLIL
            if (r1 == 0) goto L6a
            X.0Itk r0 = X.EnumC481060Itk.NONE
            r1.setScrollMode(r0)
            goto L6a
        L8e:
            r3 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.platform.base.base.ProfileInfoAssem.onViewCreated(android.view.View):void");
    }

    public final void yA1(boolean z) {
        this.LLJ = z;
    }

    @Override // X.InterfaceC1252070igf
    public void hF(boolean z, EnumC1248370iah enumC1248370iah, String str, boolean z2) {
        C1245340iVo.LIZ.getClass();
        C1245340iVo.LJIIJJI(z, enumC1248370iah, str, z2, null);
    }

    public static /* synthetic */ void Ho(ProfileInfoAssem profileInfoAssem, int i, EnumC1251790igD enumC1251790igD, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                enumC1251790igD = EnumC1251790igD.NORMAL;
            }
            if ((i2 & 4) != 0) {
                str = "";
            }
            profileInfoAssem.Go(i, enumC1251790igD, str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchProfilePlatformInfo");
    }
}
