package com.ss.android.ugc.profile.platform.business.header.assemble;

import X.C1248870ibV;
import X.C1249090ibr;
import X.C1252230igv;
import X.C1388190mED;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19252910Tv;
import X.C487280J9a;
import X.C723580SZw;
import X.C724240Sb0;
import X.InterfaceC1249220ic4;
import X.InterfaceC487330J9f;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderBaseComponent extends HeaderBaseContainerComponent implements IHeaderBaseAbility, InterfaceC487330J9f {
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "header"), checkSupervisorPrepared());

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void No() {
        ProfileComponents profileComponents;
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJL.getValue();
        dp((c1249090ibr == null || (profileComponents = (ProfileComponents) c1249090ibr.LL) == null) ? null : profileComponents.components);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final C1252230igv cA1() {
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJL.getValue();
        if (c1249090ibr != null) {
            return c1249090ibr.LLIZLLLIL;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderBaseAbility.class, null);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI()) {
            C487280J9a.LIZJ(this);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Activity activityLIZ;
        super.onViewCreated(view);
        if (!(view instanceof LinearLayout)) {
            return;
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        LinearLayout linearLayout = null;
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderBaseAbility.class, null, null);
        }
        LinearLayout linearLayout2 = (LinearLayout) view;
        this.LLJJLIIIJLLLLLLLZ = linearLayout2;
        if (linearLayout2 != null) {
            linearLayout = linearLayout2;
        }
        C1248870ibV.LIZJ(linearLayout, (ProfileComponentUIConfig) this.LLJJJJLIIL.getValue(), true, false);
        if (C19252910Tv.LIZIZ.LIZLLL().LJI().LJI() && (context = getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C487280J9a.LIZ(activityLIZ.hashCode(), this);
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
        LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        interfaceC1249220ic4LJI.LJJIJIL(linearLayout, Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.orientation));
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final void LJIIIZ(int i, View view, String str) {
        InterfaceC1249220ic4 interfaceC1249220ic4LJI = C19252910Tv.LIZIZ.LIZLLL().LJI();
        LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        interfaceC1249220ic4LJI.LJJIJIL(linearLayout, null, null);
        LinearLayout linearLayout2 = this.LLJJLIIIJLLLLLLLZ;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        HeaderBaseContainerComponent.bp(this, str, i, view, linearLayout2, null, false, 48);
    }
}
