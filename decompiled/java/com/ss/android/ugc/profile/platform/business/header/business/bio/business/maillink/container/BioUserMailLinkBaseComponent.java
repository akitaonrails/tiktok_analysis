package com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.container;

import X.C01GW;
import X.C1248950ibd;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C20684815ws;
import X.C2344009Gk;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C487280J9a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.bio.base.IHeaderBioAbility;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public class BioUserMailLinkBaseComponent extends HeaderBaseContainerComponent implements IBioUserMailLinkAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2499));

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderBioAbility iHeaderBioAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderBioAbility = (IHeaderBioAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderBioAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderBioAbility.LJIIIZ(this.LLJJ, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IBioUserMailLinkAbility.class, null, null);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IBioUserMailLinkAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        Context context = getContext();
        if (context != null) {
            if (C268330AfP.LIZLLL()) {
                Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
                C426750GoL.LJIIJ(layoutParams, context, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, 32);
            } else if (C2537109wv.LJFF()) {
                C426750GoL.LJIIJ(layoutParams, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, 32);
            } else {
                C426750GoL.LJIIJ(layoutParams, context, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, 32);
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LLJJIJIIJIL = linearLayout;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJJJJL(this.LLJJIJIIJIL, null, null);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJJJJJL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.bio.business.maillink.base.IBioUserMailLinkAbility
    public final void Pi1(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("link_type", str2);
        c2344009Gk.LJIIIIZZ("link", str4);
        c2344009Gk.LJIIIIZZ("scene_id", "1008");
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C20684815ws.LJIILLIIL("show_link", c2344009Gk.LIZ);
    }
}
