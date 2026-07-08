package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C1248870ibV;
import X.C1248950ibd;
import X.C1388190mED;
import X.C14KI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C19ME;
import X.C1DDC;
import X.C2537109wv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C487280J9a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
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
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderAccountBaseComponent extends HeaderBaseContainerComponent implements IHeaderAccountInfoAbility, InterfaceC487330J9f {
    public ViewGroup LLJJLIIIJLLLLLLLZ;

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility;
        String str;
        IHeaderInfoAbility iHeaderInfoAbility;
        if (C268330AfP.LJIIJ()) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup == null || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null)) == null) {
                return;
            }
            String str2 = this.assemTagInternal;
            str = str2 != null ? str2 : "";
            C1248950ibd c1248950ibdMp = mp();
            iHeaderUserBasicInfoAbility.LJIIIZ(c1248950ibdMp != null ? c1248950ibdMp.LL : -1, viewGroup, str);
            return;
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 == null || (iHeaderInfoAbility = (IHeaderInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderInfoAbility.class, null)) == null) {
            return;
        }
        String str3 = this.assemTagInternal;
        str = str3 != null ? str3 : "";
        C1248950ibd c1248950ibdMp2 = mp();
        iHeaderInfoAbility.LJIIIZ(c1248950ibdMp2 != null ? c1248950ibdMp2.LL : -1, viewGroup2, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Context context;
        Activity activityLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderAccountInfoAbility.class, null, null);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (context = getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        C487280J9a.LIZ(activityLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    public final ViewGroup up() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("profile_header_account_base_component");
        if (linearLayout.getContext() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            linearLayout.setOrientation(1);
            layoutParams.gravity = 1;
            if (!C2537109wv.LJI()) {
                C426750GoL.LJIIIIZZ(layoutParams, linearLayout.getContext(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, true);
            }
            C786410Ut5.d6(linearLayout, layoutParams);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LJLI(linearLayout, null, null);
        }
        return linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        ViewGroup viewGroupUp;
        int iLIZIZ;
        int i;
        if (!C268330AfP.LJIIJ()) {
            viewGroupUp = up();
        } else {
            final Context context = getContext();
            if (context != null) {
                viewGroupUp = new FrameLayout(context) { // from class: X.0iad
                    @Override // android.view.ViewGroup
                    public final void removeViewAt(int i2) {
                        ViewGroup viewGroup = this.LLJJLIIIJLLLLLLLZ;
                        if (viewGroup != null) {
                            C786410Ut5.LJJLIL(i2, viewGroup);
                        }
                    }
                };
                viewGroupUp.setId(R.id.s25);
                C19ME c19me = new C19ME(0, -2);
                c19me.bottomToBottom = R.id.s0j;
                c19me.startToEnd = R.id.s0j;
                c19me.endToEnd = 0;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroupUp);
                viewGroupUp.setLayoutParams(c19me);
                if (C268330AfP.LJIIL()) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99));
                } else if (C14KI.LJI(context)) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(116));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112));
                }
                viewGroupUp.setMinimumHeight(iLIZIZ);
                ViewGroup viewGroupUp2 = up();
                this.LLJJLIIIJLLLLLLLZ = viewGroupUp2;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 8388627;
                if (this.LLJILLL) {
                    if (C1DDC.LIZIZ().screenRating == 1) {
                        i = 12;
                    } else {
                        i = 16;
                    }
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
                }
                viewGroupUp.addView(viewGroupUp2, layoutParams);
            } else {
                viewGroupUp = null;
            }
        }
        this.LLJJIJIIJIL = viewGroupUp;
        C1248870ibV.LIZJ(viewGroupUp, profileComponentUIConfig, true, false);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJLI(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        if (C268330AfP.LJIIJ()) {
            HeaderBaseContainerComponent.bp(this, str, i, view, this.LLJJLIIIJLLLLLLLZ, null, false, 48);
        } else {
            HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
        }
    }
}
