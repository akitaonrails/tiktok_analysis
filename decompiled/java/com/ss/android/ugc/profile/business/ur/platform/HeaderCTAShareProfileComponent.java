package com.ss.android.ugc.profile.business.ur.platform;

import X.C1069600dwM;
import X.C1248720ibG;
import X.C1249850id5;
import X.C13LE;
import X.C1558520qew;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C621180OYa;
import X.C724240Sb0;
import X.EnumC1248370iah;
import X.EnumC1249840id4;
import X.EnumC1249860id6;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTAShareProfileComponent extends HeaderCTABaseUIComponent {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        C1069600dwM c1069600dwM = C1069600dwM.LIZ;
        String strXp = Xp();
        c1069600dwM.getClass();
        C1069600dwM.LIZ("personal_homepage", "click", strXp);
        String str = Ap() == EnumC1249860id6.TEXT ? "personal_homepage_button" : "personal_homepage_icon";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        C20684815ws.LJIILLIIL("enter_qr_code_page", c2344009Gk.LIZ);
        kp(C1248720ibG.LIZIZ(EnumC1249840id4.HAS_SHARE_PROFILE), EnumC1248370iah.CTA);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C621180OYa.LIZ.LJJLJ(c19egLIZ, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Ip();
        C1069600dwM c1069600dwM = C1069600dwM.LIZ;
        String strXp = Xp();
        c1069600dwM.getClass();
        C1069600dwM.LIZ("personal_homepage", "show", strXp);
        lp(EnumC1248370iah.CTA, "HAS_SHARE_PROFILE".toLowerCase(Locale.ROOT), true);
    }

    public final String Xp() {
        EnumC1249860id6 enumC1249860id6Ap = Ap();
        if (enumC1249860id6Ap == null) {
            return "";
        }
        int i = C1249850id5.LIZ[enumC1249860id6Ap.ordinal()];
        return i != 1 ? i != 2 ? i == 3 ? "more_panel" : "" : "icon" : "button";
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        IHeaderCTAAbility iHeaderCTAAbility;
        super.tp();
        String strLJI = C13LE.LIZ(Button.class).LJI();
        if (strLJI == null || (iHeaderCTAAbility = (IHeaderCTAAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderCTAAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderCTAAbility.eB(strLJI, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final Integer up() {
        return Integer.valueOf(R.raw.icon_arrow_turn_up_right);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent
    public final String yp() {
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            return fragmentLJI.getString(2131825015);
        }
        return null;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2398));
    }
}
