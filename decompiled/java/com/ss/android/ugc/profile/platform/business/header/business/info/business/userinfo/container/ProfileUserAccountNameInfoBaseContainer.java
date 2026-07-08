package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C1248300iaa;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C1388190mED;
import X.C14KI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C2373309Rr;
import X.C2537109wv;
import X.C418440Gaw;
import X.C487280J9a;
import X.C497820Jfg;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountNameUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.ProfileUserInfoManageBaseComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileUserAccountNameInfoBaseContainer extends HeaderBaseContainerComponent implements IAccountNameUserInfoAbility, InterfaceC487330J9f {
    public C2373309Rr LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;

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
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAccountNameUserInfoAbility.class, null, null);
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
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAccountNameUserInfoAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        int i2;
        final Context context = getContext();
        if (context != null) {
            ViewGroup viewGroup = new RelativeLayout(context) { // from class: X.0HxO
                @Override // android.view.ViewGroup
                public final void removeViewAt(int i3) {
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.s7i);
                    ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.s7j);
                    if (i3 >= viewGroup2.getChildCount() && i3 < viewGroup2.getChildCount() + viewGroup3.getChildCount()) {
                        C786410Ut5.LJJLIL(i3 - viewGroup2.getChildCount(), viewGroup3);
                    } else {
                        if (i3 < 0 || i3 >= viewGroup2.getChildCount()) {
                            return;
                        }
                        C786410Ut5.LJJLIL(i3, viewGroup2);
                    }
                }

                @Override // android.view.View
                public final void setLayerType(int i3, Paint paint) {
                    super.setLayerType(i3, paint);
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setLayerType layerType: ");
                    sbLIZ.append(Log.getStackTraceString(new Throwable("CustomRemoveViewRelativeLayout layerType:")));
                    C1720106oR.LJI("ProfileUserAccountNameInfoBaseContainer", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            boolean zLJI = C14KI.LJI(context);
            if (zLJI) {
                i = 12;
            } else {
                i = 30;
            }
            layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i)));
            if (zLJI) {
                i2 = 12;
            } else {
                i2 = 30;
            }
            layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i2)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(viewGroup);
            viewGroup.setLayoutParams(layoutParams);
            C1248870ibV.LIZJ(viewGroup, profileComponentUIConfig, true, false);
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            c19252910Tv.LIZLLL().LJI().LLJJIJI(viewGroup, context, null, null);
            C2373309Rr c2373309Rr = new C2373309Rr(context);
            c2373309Rr.setId(R.id.s7i);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            c2373309Rr.setOrientation(0);
            layoutParams2.addRule(13);
            if (this.LLJILLL && C2537109wv.LJFF()) {
                int iLIZIZ = C497820Jfg.LIZIZ(context);
                int i3 = ProfileUserInfoManageBaseComponent.LLJLIL;
                c2373309Rr.setMaxWidth(iLIZIZ - (((C1248300iaa.LIZ() + C1248300iaa.LIZIZ()) + layoutParams.getMarginEnd()) * 2));
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c2373309Rr);
            c2373309Rr.setLayoutParams(layoutParams2);
            c19252910Tv.LIZLLL().LJI().LLJJIJI(c2373309Rr, context, null, null);
            this.LLJJLIIIJLLLLLLLZ = c2373309Rr;
            viewGroup.addView(c2373309Rr);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setId(R.id.s7j);
            linearLayout.setTag("edit_container");
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(15);
            layoutParams3.addRule(17, R.id.s7i);
            C786410Ut5.d6(linearLayout, layoutParams3);
            linearLayout.setOrientation(0);
            this.LLJL = linearLayout;
            viewGroup.addView(linearLayout);
            this.LLJJIJIIJIL = viewGroup;
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        Context context = getContext();
        if (context != null) {
            C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
            c19252910Tv.LIZLLL().LJI().LLJJIJI(this.LLJJLIIIJLLLLLLLZ, context, Integer.valueOf(configuration.screenWidthDp), null);
            c19252910Tv.LIZLLL().LJI().LLJJIJI(this.LLJJIJIIJIL, context, Integer.valueOf(configuration.screenWidthDp), null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountNameUserInfoAbility
    public final void cg(View view, int i, String str, boolean z) {
        ViewGroup viewGroup;
        int childCount;
        ViewGroup viewGroup2;
        if (z) {
            viewGroup = this.LLJJLIIIJLLLLLLLZ;
        } else {
            viewGroup = this.LLJL;
        }
        if (viewGroup != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup2);
            }
            if (!z) {
                C2373309Rr c2373309Rr = this.LLJJLIIIJLLLLLLLZ;
                if (c2373309Rr != null) {
                    childCount = c2373309Rr.getChildCount();
                } else {
                    childCount = 0;
                }
                i -= childCount;
            }
            if (i >= 0 && i <= viewGroup.getChildCount()) {
                viewGroup.addView(view, i);
            } else {
                viewGroup.addView(view, viewGroup.getChildCount());
            }
        }
    }
}
