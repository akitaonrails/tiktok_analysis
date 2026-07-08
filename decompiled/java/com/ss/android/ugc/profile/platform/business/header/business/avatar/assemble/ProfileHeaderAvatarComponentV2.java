package com.ss.android.ugc.profile.platform.business.header.business.avatar.assemble;

import X.C1248950ibd;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C268330AfP;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.business.avatar.HeaderAvatarMyComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderAvatarComponentV2 extends HeaderBaseContainerComponent implements IHeaderAvatarAbility, InterfaceC487330J9f {
    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        Ho("avatar_normal", C13LE.LIZ(HeaderAvatarMyComponent.class), null, -1, false);
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
        boolean zLIZJ = C268330AfP.LIZJ();
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (viewGroup == null || (iHeaderUserBasicInfoAbility = (IHeaderUserBasicInfoAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IHeaderUserBasicInfoAbility.class, null)) == null) {
            return;
        }
        String str = this.assemTagInternal;
        if (str == null) {
            str = "";
        }
        iHeaderUserBasicInfoAbility.LJIIIZ(zLIZJ ? 1 : 0, viewGroup, str);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderAvatarAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderAvatarAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.s0j);
            frameLayout.setClipChildren(false);
            C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-2, -2));
            this.LLJJIJIIJIL = frameLayout;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.avatar.base.IHeaderAvatarAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
