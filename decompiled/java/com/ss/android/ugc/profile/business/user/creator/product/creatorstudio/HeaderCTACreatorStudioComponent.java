package com.ss.android.ugc.profile.business.user.creator.product.creatorstudio;

import X.C1242750iRd;
import X.C13LE;
import X.C1558520qew;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import android.widget.Button;
import androidx.lifecycle.Lifecycle;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.base.IHeaderCTAAbility;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HeaderCTACreatorStudioComponent extends HeaderCTABaseUIComponent {
    public boolean LLJZIJLIL = true;

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Oo() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "personal_homepage");
        pairArr[1] = new Pair("enter_method", "click_profile_page_cta");
        pairArr[2] = new Pair("button_name", C1242750iRd.LIZ() == 1 ? "creator_studio" : "creator_tools");
        C20684815ws.LJIILLIIL("enter_creator_center", C2097608Jq.LJIIJ(pairArr));
        SmartRouter.buildRoute(getContext(), "aweme://creatorcenter").open();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Xp() {
        if (!this.LLJZIJLIL && getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            c2344009Gk.LJIIIIZZ("enter_method", "show_profile_page_cta");
            c2344009Gk.LJIIIIZZ("button_name", C1242750iRd.LIZ() == 1 ? "creator_studio" : "creator_tools");
            C20684815ws.LJIILLIIL("creator_center_entrance_show", c2344009Gk.LIZ);
        }
        this.LLJZIJLIL = false;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void Go() {
        Ip();
        ProfilePlatformViewModel profilePlatformViewModelZo = Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.JQ2(new AwS598S0100000_19(this, 448));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Xp();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.cta.base.HeaderCTABaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void tp() {
        IHeaderCTAAbility iHeaderCTAAbility;
        super.tp();
        Pc1(this.assemTagInternal, new AwS563S0100000_19(this, 2449));
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
    public final String yp() {
        return super.yp();
    }
}
