package com.ss.android.ugc.profile.business.ur.platform;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C1075590e61;
import X.C1216270hkv;
import X.C1232410iAx;
import X.C1248190iaP;
import X.C1248380iai;
import X.C1248720ibG;
import X.C1252550ihR;
import X.C13BV;
import X.C14EU;
import X.C1558360qeg;
import X.C1558520qew;
import X.C20684815ws;
import X.C2344009Gk;
import X.C291001Au;
import X.C724240Sb0;
import X.EnumC1248370iah;
import X.EnumC1249840id4;
import X.EnumC1254850il9;
import X.InterfaceC1232420iAy;
import android.text.TextUtils;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.header.IMineProfileEditAbility;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Describe;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ISignatureAbility;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTAEditProfileComponent extends HeaderCTABaseUIComponent implements InterfaceC1232420iAy, IMineProfileEditAbility {
    public C1232410iAx LLJZIJLIL;
    public ProfileViewModel LLL;
    public String LLLF;

    @Override // X.InterfaceC1232420iAy
    public final void Pc0(boolean z) {
    }

    @Override // X.InterfaceC1232420iAy
    public final void aL0(String str, boolean z) {
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "click_edit_profile");
        C20684815ws.LJIILLIIL("enter_profile_edit", c2344009Gk.LIZ);
        kp(C1248720ibG.LIZIZ(EnumC1249840id4.HAS_EDIT_PROFILE), EnumC1248370iah.CTA);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "aweme://profile_edit");
        smartRouteBuildRoute.withParam("enter_method", "click_edit_profile");
        smartRouteBuildRoute.withParam("enter_from", "edit_profile");
        smartRouteBuildRoute.open();
        SharePrefCache.inst().getIsProfileBubbleShown().LJ(Boolean.FALSE);
    }

    public final void Xp() {
        Describe describe;
        BizBaseData bizBaseData = this.LLJLLL;
        String text = (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null) ? null : describe.getText();
        if (Intrinsics.LJFF(text, this.LLLF)) {
            return;
        }
        String str = this.assemTagInternal;
        String strLIZJ = text == null ? C1216270hkv.LIZJ(2131833252) : text;
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            if (str == null && (str = this.assemTagInternal) == null) {
                str = "";
            }
            iHeaderCTAAbility.w90(str, strLIZJ);
        }
        this.LLLF = text;
    }

    public final void aq() {
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LIZJ();
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            ProfilePlatformViewModel.OQ2(profilePlatformViewModelZo, null, 0, null, "onGuideUserUpdate", false, 23);
        }
        ProfileViewModel profileViewModel = this.LLL;
        if (profileViewModel != null) {
            profileViewModel.hR2(C1252550ihR.LJIILLIIL());
        }
        Xp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String yp() {
        Describe describe;
        String text;
        BizBaseData bizBaseData = this.LLJLLL;
        return (bizBaseData == null || (describe = bizBaseData.getDescribe()) == null || (text = describe.getText()) == null) ? C1216270hkv.LIZJ(2131833252) : text;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Ip();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            this.LLL = C1075590e61.LIZ(fragmentLJI);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI2, null), this, IMineProfileEditAbility.class, null, null);
        }
        EventBus.LIZLLL().LJIJJ(this);
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.IQ2(new AwS597S0100000_18(this, 995));
        }
        lp(EnumC1248370iah.CTA, "HAS_EDIT_PROFILE".toLowerCase(Locale.ROOT), true);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IMineProfileEditAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        Xp();
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2394));
        String name = Button.class.getName();
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.OF(name, str);
        }
    }

    @C14EU
    public final void onClickGuideCardEvent(C1248190iaP c1248190iaP) {
        if (c1248190iaP != null && c1248190iaP.LIZ == 3) {
            C1248380iai.LIZ(this, c1248190iaP.LIZIZ);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.header.IMineProfileEditAbility
    public final void sA(String str) {
        String str2;
        User curUser;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            str2 = curUser.signature;
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str, str2)) {
            String strReplace = new Regex("\n+").replace(str, "\n");
            int length = strReplace.length() - 1;
            if (length >= 0 && strReplace.charAt(length) == '\n') {
                strReplace = strReplace.substring(0, length);
            }
            if (this.LLJZIJLIL == null) {
                C1232410iAx c1232410iAx = new C1232410iAx(EnumC1254850il9.PROFILE.getValue());
                this.LLJZIJLIL = c1232410iAx;
                c1232410iAx.LLJ = this;
            }
            C1232410iAx c1232410iAx2 = this.LLJZIJLIL;
            if (c1232410iAx2 != null) {
                c1232410iAx2.LJIIIZ(strReplace, null);
            }
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void JE2(int i, Exception exc) {
        ProfilePlatformViewModel profilePlatformViewModelZo;
        if (i == 4 && (profilePlatformViewModelZo = Zo()) != null) {
            profilePlatformViewModelZo.zQ2(new C291001Au<>(new Pair(exc, Integer.valueOf(i))));
        }
    }

    @Override // X.InterfaceC1232420iAy
    public final void Ud0(int i, User user) {
        List<SignatureExtraInfo> signatureExtra;
        if (i != 0) {
            if (i == 2) {
                String str = null;
                ISignatureAbility iSignatureAbility = (ISignatureAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISignatureAbility.class, null);
                if (iSignatureAbility != null) {
                    if (user != null) {
                        str = user.signature;
                        signatureExtra = user.getSignatureExtra();
                    } else {
                        signatureExtra = null;
                    }
                    if (!(signatureExtra instanceof List) || signatureExtra == null) {
                        signatureExtra = C13BV.INSTANCE;
                    }
                    iSignatureAbility.IP2(str, signatureExtra);
                }
                aq();
                return;
            }
            return;
        }
        aq();
    }
}
