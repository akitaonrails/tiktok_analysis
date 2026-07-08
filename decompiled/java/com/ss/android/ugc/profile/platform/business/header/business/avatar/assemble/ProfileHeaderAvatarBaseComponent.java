package com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble;

import X.C1248950ibd;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C19ME;
import X.C268330AfP;
import X.C487280J9a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1249220ic4;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderAvatarBaseComponent extends HeaderBaseContainerComponent implements IHeaderAvatarAbility, InterfaceC487330J9f {
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility;
        if (!C268330AfP.LJIIJ()) {
            super.cp();
            return;
        }
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        C1248950ibd c1248950ibdMp = mp();
        iHeaderUserBasicInfoAbility.LJIIIZ(c1248950ibdMp != null ? c1248950ibdMp.LL : -1, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderAvatarAbility.class, null, null);
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
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderAvatarAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            if (C268330AfP.LJIIJ()) {
                frameLayout.setId(R.id.s0j);
                C19ME c19me = new C19ME(-2, -2);
                c19me.startToStart = 0;
                c19me.topToTop = 0;
                C786410Ut5.a6(frameLayout, c19me);
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                C786410Ut5.a6(frameLayout, layoutParams);
            }
            this.LLJJIJIIJIL = frameLayout;
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
        View viewFindViewById = this.LLJL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ji6);
            } else {
                viewFindViewById = null;
            }
            this.LLJL = (LinearLayout) viewFindViewById;
        }
        interfaceC1249220ic4LJI.LIZLLL((LinearLayout) viewFindViewById, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility
    public final void LJIIIZ(int i, View view, String str) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJI().LJI()) {
            View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.py2);
                } else {
                    viewFindViewById = null;
                }
                this.LLJJLIIIJLLLLLLLZ = (LinearLayout) viewFindViewById;
            }
            HeaderBaseContainerComponent.bp(this, str, i, view, (ViewGroup) viewFindViewById, null, false, 48);
            InterfaceC1249220ic4 interfaceC1249220ic4LJI = c19252910Tv.LIZLLL().LJI();
            View viewFindViewById2 = this.LLJL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ji6);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJL = (LinearLayout) viewFindViewById2;
            }
            interfaceC1249220ic4LJI.LIZLLL((LinearLayout) viewFindViewById2, null, null);
            return;
        }
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
