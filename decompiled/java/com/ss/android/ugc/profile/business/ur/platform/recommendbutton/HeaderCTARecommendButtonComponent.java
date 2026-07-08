package com.ss.android.ugc.profile.business.ur.platform.recommendbutton;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C268330AfP;
import X.C418440Gaw;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1248370iah;
import X.InterfaceC1073860e3E;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.UserProfileUserCardVM;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import java.util.Locale;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS127S0101000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTARecommendButtonComponent extends HeaderCTABaseUIComponent implements ICTARecommendButtonAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final AssemVMLazy LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HeaderCTARecommendButtonComponent.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/profile/business/ur/UserProfileUserCardVM;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HeaderCTARecommendButtonComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UserProfileUserCardVM.class);
        this.LLJZIJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2419), AFwS257S0000000_19.get$arr$(458), null, true);
        this.LLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(466));
        this.LLLF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(467));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        super.Go();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICTARecommendButtonAbility.class, null, null);
        }
        Ip();
        lp(EnumC1248370iah.CTA, "HAS_SPREAD_FOLLOW".toLowerCase(Locale.ROOT), true);
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0idM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1250500ie8) obj).LLILLL);
            }
        }, C736820SvI.LJ(), AFwS303S0000000_19.get$arr$(28), 4);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Ho() {
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 3390);
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.ws2(str, awS563S0100000_19);
        }
        if (C268330AfP.LJIIIZ()) {
            Wp(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), true);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Jo() {
        int i = this.LLJILLL;
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.k82(i, str);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer up() {
        return Integer.valueOf(((Number) this.LLL.getValue()).intValue());
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), ICTARecommendButtonAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2420));
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.recommendbutton.ICTARecommendButtonAbility
    public final void OD1(int i) {
        AwS127S0101000_19 awS127S0101000_19 = new AwS127S0101000_19(i, this, 6);
        IHeaderCTAAbility iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null);
        if (iHeaderCTAAbility != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            iHeaderCTAAbility.yG(str, awS127S0101000_19);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.recommendbutton.ICTARecommendButtonAbility
    public final void d50(int i) {
        AssemVMLazy assemVMLazy = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        boolean z = false;
        UserProfileUserCardVM userProfileUserCardVM = (UserProfileUserCardVM) assemVMLazy.getValue();
        User user = userProfileUserCardVM.getState().LLIZLLLIL;
        if (user != null && !UserProfileUserCardVM.vQ2(user)) {
            if (i != 0) {
                z = true;
                InterfaceC1073860e3E interfaceC1073860e3E = userProfileUserCardVM.LL;
                if (interfaceC1073860e3E != null) {
                    interfaceC1073860e3E.av(null);
                }
            }
            userProfileUserCardVM.zQ2(1, z);
        }
    }

    @Override // com.ss.android.ugc.profile.business.ur.platform.recommendbutton.ICTARecommendButtonAbility
    public final void gT0(boolean z) {
        int i;
        View viewBp = Bp();
        if (viewBp != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewBp);
        }
    }

    public final void Xp(TuxIconView tuxIconView, boolean z) {
        float f;
        tuxIconView.clearAnimation();
        tuxIconView.setIconRes(((Number) this.LLL.getValue()).intValue());
        if (C268330AfP.LJFF()) {
            if (z) {
                tuxIconView.setIconRes(((Number) this.LLL.getValue()).intValue());
                return;
            } else {
                tuxIconView.setIconRes(((Number) this.LLLF.getValue()).intValue());
                return;
            }
        }
        if (!z) {
            f = 180.0f;
        } else {
            f = 360.0f;
        }
        tuxIconView.animate().rotation(f).start();
    }
}
