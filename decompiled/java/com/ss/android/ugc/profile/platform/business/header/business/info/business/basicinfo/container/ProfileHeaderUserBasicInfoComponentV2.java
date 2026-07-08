package com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.container;

import X.C01GW;
import X.C1248230iaT;
import X.C1248950ibd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C268330AfP;
import X.C452501pT;
import X.C724240Sb0;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble.ProfileHeaderAvatarComponentV2;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container.ProfileHeaderAccountInfoComponentV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderUserBasicInfoComponentV2 extends HeaderBaseContainerComponent implements IHeaderUserBasicInfoAbility {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2517));

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void oy2() {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("user_info", C13LE.LIZ(ProfileHeaderAccountInfoComponentV2.class), null, -1, false);
        Ho("header_avatar", C13LE.LIZ(ProfileHeaderAvatarComponentV2.class), null, -1, false);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void cp() {
        IHeaderInfoAbility iHeaderInfoAbility;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderInfoAbility = (IHeaderInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        C1248950ibd c1248950ibdMp = mp();
        iHeaderInfoAbility.LJIIIZ(c1248950ibdMp != null ? c1248950ibdMp.LL : -1, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderUserBasicInfoAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderUserBasicInfoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void ND0(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.topMargin == i) {
            return;
        }
        marginLayoutParams.topMargin = i;
        viewGroup.requestLayout();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        int iLIZJ;
        int iLIZJ2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(R.id.s1i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int iLJIILJJIL = ((C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIILJJIL();
        if (C268330AfP.LIZJ()) {
            iLIZJ = C1248230iaT.LIZJ();
        } else {
            iLIZJ = 0;
        }
        layoutParams.setMarginEnd(iLJIILJJIL - iLIZJ);
        int iLJIILJJIL2 = ((C1248230iaT) this.LLJJLIIIJLLLLLLLZ.getValue()).LJIILJJIL();
        if (C268330AfP.LIZJ()) {
            iLIZJ2 = 0;
        } else {
            iLIZJ2 = C1248230iaT.LIZJ();
        }
        layoutParams.setMarginStart(iLJIILJJIL2 - iLIZJ2);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.LLJJIJIIJIL = linearLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
