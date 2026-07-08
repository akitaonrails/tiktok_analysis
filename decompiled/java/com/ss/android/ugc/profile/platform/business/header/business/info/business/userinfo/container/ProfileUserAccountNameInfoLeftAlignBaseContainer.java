package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C1248870ibV;
import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountNameUserInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IHeaderAccountInfoAbility;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileUserAccountNameInfoLeftAlignBaseContainer extends HeaderBaseContainerComponent implements IAccountNameUserInfoAbility {
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
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAccountNameUserInfoAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAccountNameUserInfoAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-2, -2));
            linearLayout.setOrientation(0);
            this.LLJJIJIIJIL = linearLayout;
            C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.IAccountNameUserInfoAbility
    public final void cg(View view, int i, String str, boolean z) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
