package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C1248870ibV;
import X.C1248950ibd;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
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
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;

/* JADX INFO: loaded from: classes20.dex */
public class AccountUserInfoBaseComponent extends HeaderBaseContainerComponent implements IAccountUserInfoAbility, InterfaceC487330J9f {
    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderAccountInfoAbility iHeaderAccountInfoAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderAccountInfoAbility = (IHeaderAccountInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderAccountInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderAccountInfoAbility.LJIIIZ(this.LLJJ, viewGroup, str);
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
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAccountUserInfoAbility.class, null, null);
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (!c19252910Tv.LIZLLL().LJI().LJI() || !c19252910Tv.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAccountUserInfoAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LLJJIJIIJIL = linearLayout;
        if (linearLayout.getContext() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout.setOrientation(0);
            if (!C268330AfP.LJIIJ()) {
                layoutParams.gravity = 1;
                if (C2537109wv.LJI()) {
                    C426750GoL.LJIIIIZZ(layoutParams, linearLayout.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))), 0, true);
                } else {
                    C426750GoL.LJIIIIZZ(layoutParams, linearLayout.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, true);
                }
            }
            C786410Ut5.d6(linearLayout, layoutParams);
            C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJJIJI(linearLayout, linearLayout.getContext(), null, null);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Context context;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if ((viewGroup instanceof LinearLayout) && viewGroup != null && (context = getContext()) != null) {
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJJIJI(viewGroup, context, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountUserInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
