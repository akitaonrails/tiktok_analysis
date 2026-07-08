package com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container;

import X.C0C38;
import X.C1248490iat;
import X.C1248870ibV;
import X.C13LE;
import X.C1558520qew;
import X.C21532619Oq;
import X.C2532609wC;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248450iap;
import X.InterfaceC1248320iac;
import Y.ARunnableS119S0100000_19;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.base.BioStructuralInfoBaseComponent;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class BioStructuralInfoContainerComponent extends BioBusinessInfoBaseComponent implements InterfaceC1248320iac {
    public EnumC1248450iap LLJL = EnumC1248450iap.NORMAL;
    public boolean LLJLIL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("bio_structural_info_base_item", C13LE.LIZ(BioStructuralInfoBaseComponent.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoBaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            if (C2532609wC.LIZIZ()) {
                IHeaderBioAbility iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
                if (iHeaderBioAbility != null) {
                    String str = this.assemTagInternal;
                    iHeaderBioAbility.rQ2(this.LLJJ, viewGroup, str != null ? str : "");
                    return;
                }
                return;
            }
            IHeaderBioAbility iHeaderBioAbility2 = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null);
            if (iHeaderBioAbility2 != null) {
                String str2 = this.assemTagInternal;
                iHeaderBioAbility2.LJIIIZ(this.LLJJ, viewGroup, str2 != null ? str2 : "");
            }
        }
    }

    @Override // X.InterfaceC1248320iac
    public final void fm() {
        ViewGroup viewGroup;
        if (C1248490iat.LIZ[this.LLJL.ordinal()] == 1 && (viewGroup = this.LLJJIJIIJIL) != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        this.LLJL = EnumC1248450iap.NORMAL;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoBaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS119S0100000_19(this, 152));
        }
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        if (profilePlatformViewModelSo != null) {
            profilePlatformViewModelSo.FQ2(new AwS598S0100000_19(this, 481));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoBaseComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        ViewParent parent = viewGroup2 != null ? viewGroup2.getParent() : null;
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLJJIJIIJIL, viewGroup);
    }

    @Override // X.InterfaceC1248320iac
    public final int a() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1248320iac
    public final EnumC1248450iap h() {
        return this.LLJL;
    }

    @Override // X.InterfaceC1248320iac
    public final void Bk(EnumC1248450iap enumC1248450iap) {
        this.LLJL = enumC1248450iap;
        if (C1248490iat.LIZ[enumC1248450iap.ordinal()] == 1) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(0, viewGroup2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoBaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        ProfileComponentUIConfig profileComponentUIConfig;
        ProfilePlatformViewModel profilePlatformViewModelSo;
        User userVQ2;
        super.Hj(profileComponents);
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS119S0100000_19(this, 152));
        }
        if (this.LLJLIL && (profilePlatformViewModelSo = So()) != null && (userVQ2 = profilePlatformViewModelSo.vQ2()) != null && !userVQ2.isBlock) {
            Bk(this.LLJL);
            this.LLJLIL = false;
        }
        if (C0C38.LIZ() && (profileComponentUIConfig = (ProfileComponentUIConfig) this.LLJJJJLIIL.getValue()) != null) {
            C1248870ibV.LIZJ(this.LLJJIJIIJIL, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJJ), profileComponentUIConfig), true, false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.bainfo.container.BioBusinessInfoBaseComponent, com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int iLIZIZ;
        int i;
        C21532619Oq c21532619Oq = new C21532619Oq(getContext(), null);
        C786410Ut5.d7(c21532619Oq, new LinearLayout.LayoutParams(-1, -2));
        int i2 = 0;
        if (C268330AfP.LJIIIZ()) {
            iLIZIZ = 0;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        }
        Integer numValueOf = Integer.valueOf(iLIZIZ);
        this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
        if (C268330AfP.LIZLLL()) {
            i = 10;
        } else {
            i = 4;
        }
        C426750GoL.LJIIL(c21532619Oq, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)))), Integer.valueOf(iLIZIZ), 0, 16);
        c21532619Oq.setFlexWrap(1);
        if (!C268330AfP.LJIIIZ()) {
            i2 = 2;
        }
        c21532619Oq.setJustifyContent(i2);
        c21532619Oq.setAlignItems(2);
        this.LLJJIJIIJIL = c21532619Oq;
        C1248870ibV.LIZJ(this.LLJJIJIIJIL, C1248870ibV.LIZIZ(Integer.valueOf(this.LLJJ), profileComponentUIConfig), true, false);
    }
}
