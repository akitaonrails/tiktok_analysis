package com.ss.android.ugc.profile.platform.business.header.business.info.assemble;

import X.C1248870ibV;
import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C19EG;
import X.C487280J9a;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderInfoBaseComponent extends HeaderBaseContainerComponent implements IHeaderInfoAbility, InterfaceC487330J9f {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1248950ibd c1248950ibdMp = mp();
        dp((c1248950ibdMp == null || (profileComponents = c1248950ibdMp.LLILLJJLI) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        C19EG c19egLIZ;
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderInfoAbility.class, null, null);
        }
        if (!C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() || (c19egLIZ = C724240Sb0.LIZ(this)) == null) {
            return;
        }
        C487280J9a.LIZ(c19egLIZ.hashCode(), this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderInfoAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        C786410Ut5.d6(linearLayout, layoutParams);
        this.LLJJIJIIJIL = linearLayout;
        C1248870ibV.LIZJ(linearLayout, profileComponentUIConfig, true, false);
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLIZLLLIL(this.LLJJIJIIJIL, null, null, Boolean.FALSE);
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C19252910Tv.LIZIZ.LIZLLL().LJI().LLIZLLLIL(this.LLJJIJIIJIL, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation), Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
