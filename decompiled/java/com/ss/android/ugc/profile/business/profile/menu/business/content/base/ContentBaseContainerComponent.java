package com.ss.android.ugc.profile.business.profile.menu.business.content.base;

import X.C0H9H;
import X.C1249090ibr;
import X.C1249240ic6;
import X.C1252230igv;
import X.C1308910kAL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C19EG;
import X.C20684815ws;
import X.C418440Gaw;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ARunnableS9S1100000_3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ContentBaseContainerComponent extends HeaderBaseContainerComponent implements IHeaderBaseAbility, IContentCellAbility {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723580SZw(this, C1249090ibr.class, "content_section"), checkSupervisorPrepared());
    public LinearLayout LLJL;

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final C1252230igv cA1() {
        return null;
    }

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

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        C19EG activity;
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderBaseAbility.class, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (activity = fragmentLJI2.getActivity()) != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJI(activity, null), IContentCellAbility.class, null);
        }
        LinearLayout linearLayout = this.LLJL;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility
    public final void RH0(String str) {
        ProfileComponents profileComponents;
        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
        C1249090ibr c1249090ibr = (C1249090ibr) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (c1249090ibr != null) {
            profileComponents = (ProfileComponents) c1249090ibr.LL;
        } else {
            profileComponents = null;
        }
        c1249240ic6.getClass();
        C20684815ws.LJFF().execute(new ARunnableS9S1100000_3(profileComponents, str, 10));
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19EG activity;
        super.onViewCreated(view);
        if (!(view instanceof LinearLayout)) {
            return;
        }
        C1308910kAL.LIZJ(R.attr.a1h, new ContextThemeWrapper(getContext(), R.style.y0));
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderBaseAbility.class, null, null);
        }
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null && (activity = fragmentLJI2.getActivity()) != null) {
            C1558520qew.LJII(C1558360qeg.LJI(activity, null), this, IContentCellAbility.class, null, null);
        }
        this.LLJL = (LinearLayout) view;
    }

    @Override // com.ss.android.ugc.profile.business.profile.menu.ability.IContentCellAbility
    public final void f42(int i, View view) {
        LinearLayout linearLayout;
        int iIndexOfChild;
        int i2;
        if (view != null && (linearLayout = this.LLJL) != null && (iIndexOfChild = linearLayout.indexOfChild(view)) != -1) {
            if (iIndexOfChild == linearLayout.getChildCount() - 1) {
                i2 = iIndexOfChild - 1;
            } else {
                i2 = iIndexOfChild + 1;
            }
            if (i2 >= 0 && i2 < linearLayout.getChildCount()) {
                C786410Ut5.LJJLJ(i2, linearLayout);
            }
            C786410Ut5.LJJL(view, linearLayout);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.IHeaderBaseAbility
    public final void LJIIIZ(int i, View view, String str) {
        Context context;
        Context context2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        LinearLayout linearLayout = this.LLJL;
        Drawable drawableLJ = null;
        if (linearLayout != null) {
            context = linearLayout.getContext();
        } else {
            context = null;
        }
        View view2 = new View(context);
        LinearLayout linearLayout2 = this.LLJL;
        if (linearLayout2 != null && (context2 = linearLayout2.getContext()) != null) {
            drawableLJ = C1308910kAL.LJ(R.attr.a02, context2);
        }
        view2.setBackground(drawableLJ);
        C786410Ut5.W5(view2, layoutParams);
        C0H9H.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), view2);
        C0H9H.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), view2);
        HeaderBaseContainerComponent.bp(this, str, i, view, this.LLJL, view2, false, 32);
    }
}
