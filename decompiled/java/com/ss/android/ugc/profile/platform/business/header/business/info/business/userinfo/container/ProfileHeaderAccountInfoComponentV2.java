package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C01GW;
import X.C1248230iaT;
import X.C1248870ibV;
import X.C1248950ibd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C268330AfP;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.relationinfo.container.ProfileHeaderRelationInfoComponentV2;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.CommonInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderAccountInfoComponentV2 extends HeaderBaseContainerComponent implements IHeaderAccountInfoAbility, InterfaceC487330J9f {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2529));
    public LinearLayout LLJL;

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("user_account_name_info", C13LE.LIZ(ProfileUserAccountNameInfoContainerV2.class), null, -1, false);
        Ho("user_account_base_info", C13LE.LIZ(AccountUserInfoComponentV2.class), null, -1, false);
        Ho("user_account_base_item", C13LE.LIZ(CommonInfoBaseUIComponent.class), null, -1, false);
        Ho("user_relation_info", C13LE.LIZ(ProfileHeaderRelationInfoComponentV2.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderUserBasicInfoAbility iHeaderUserBasicInfoAbility;
        int i = !C268330AfP.LIZJ() ? 1 : 0;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderUserBasicInfoAbility.LJIIIZ(i, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderAccountInfoAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int i;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.s1k);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        if (C268330AfP.LJIIIIZZ()) {
            i = 8388659;
        } else {
            i = 8388691;
        }
        layoutParams.gravity = i;
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setClipChildren(false);
        linearLayout.setGravity(8388627);
        linearLayout.setOrientation(1);
        if (C268330AfP.LIZJ()) {
            this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
            C426750GoL.LJIIIZ(linearLayout, 0, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) - C1248230iaT.LIZJ()), 0, false, 16);
        } else {
            this.LLJJLIIIJLLLLLLLZ.getValue().getClass();
            C426750GoL.LJIIIZ(linearLayout, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) - C1248230iaT.LIZJ()), 0, 0, 0, false, 16);
        }
        this.LLJJIJIIJIL = linearLayout;
        C19252910Tv.LIZIZ.LIZLLL().LJI().LJLI(this.LLJJIJIIJIL, null, null);
        C1248870ibV.LIZJ(this.LLJJIJIIJIL, profileComponentUIConfig, true, false);
        if (C268330AfP.LJIIIIZZ()) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            C786410Ut5.d6(linearLayout2, layoutParams2);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(8388627);
            linearLayout2.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)));
            linearLayout2.setClipChildren(false);
            this.LLJL = linearLayout2;
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                viewGroup.addView(linearLayout2);
            }
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility
    public final void lp1(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (marginLayoutParams.topMargin == i && marginLayoutParams.bottomMargin == i2) {
                return;
            }
            marginLayoutParams.topMargin = i;
            marginLayoutParams.bottomMargin = i2;
            viewGroup.requestLayout();
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        ViewGroup viewGroup;
        if (C268330AfP.LJIIIIZZ() && (Intrinsics.LJFF(str, "user_account_name_info") || Intrinsics.LJFF(str, "user_account_base_info"))) {
            viewGroup = this.LLJL;
        } else {
            viewGroup = this.LLJJIJIIJIL;
        }
        HeaderBaseContainerComponent.bp(this, str, i, view, viewGroup, null, false, 48);
    }
}
