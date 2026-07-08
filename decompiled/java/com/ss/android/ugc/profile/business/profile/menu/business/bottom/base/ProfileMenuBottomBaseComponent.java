package com.ss.android.ugc.profile.business.profile.menu.business.bottom.base;

import X.C1249090ibr;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C723580SZw;
import X.C724240Sb0;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.business.profile.menu.business.bottom.ability.IBottomAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileMenuBottomBaseComponent extends HeaderBaseContainerComponent implements IBottomAbility {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "bottom"), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJJLIIIJLLLLLLLZ.getValue();
        dp((c1249090ibr == null || (profileComponents = (ProfileComponents) c1249090ibr.LL) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IBottomAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!(view instanceof LinearLayout)) {
        }
    }
}
