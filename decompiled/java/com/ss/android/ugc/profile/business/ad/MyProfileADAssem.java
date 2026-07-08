package com.ss.android.ugc.profile.business.ad;

import X.C019F;
import X.C1050610dRj;
import X.C1251350ifV;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1248970ibf;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserAccountInfo;
import com.ss.android.ugc.profile.platform.base.data.UserProfileInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class MyProfileADAssem extends UIContentAssem implements InterfaceC1248970ibf {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MyProfileADAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/platform/base/viewmodel/ProfilePlatformViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MyProfileADAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfilePlatformViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2046), AFwS257S0000000_19.get$arr$(345), null, true);
    }

    @Override // X.InterfaceC1248970ibf
    public final void Xn(int i) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ibL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1251350ifV) obj).LLILLJJLI);
            }
        }, null, new AwS633S0100000_19(this, 107), 6);
        Ho();
        this.LLJI = true;
    }

    public final void Go() {
        String str;
        if (!this.LLJILJILJ || (str = this.LLJIJIL) == null) {
            return;
        }
        C1050610dRj c1050610dRj = new C1050610dRj();
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        c1050610dRj.LJIIJJI(((C1251350ifV) assemVMLazy.getValue().getState()).LLJILJILJ, str, "other");
        this.LLJ = false;
    }

    public final void Ho() {
        ProfileCommonInfo profileCommonInfoWG2;
        Integer accountType;
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if (iProfileBaseAbility != null && (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) != null) {
            UserProfileInfo userProfileInfo = profileCommonInfoWG2.getUserProfileInfo();
            this.LLJIJIL = userProfileInfo != null ? userProfileInfo.getUid() : null;
            UserAccountInfo userAccountInfo = profileCommonInfoWG2.getUserAccountInfo();
            boolean z = false;
            if (userAccountInfo != null && (accountType = userAccountInfo.getAccountType()) != null && accountType.intValue() == 3) {
                z = true;
            }
            this.LLJILJILJ = z;
        }
        if (this.LLJILJIL && this.LLJ) {
            Go();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJILJIL && !this.LLJI) {
            Go();
        }
        if (this.LLJI) {
            this.LLJI = false;
        }
    }

    @Override // X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        Ho();
    }
}
