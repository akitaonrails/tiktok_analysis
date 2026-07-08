package com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.container;

import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19MB;
import X.C1DDC;
import X.C418440Gaw;
import X.C426750GoL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.assemble.base.IHeaderInfoAbility;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderUserBasicInfoContainer extends HeaderBaseContainerComponent implements IHeaderUserBasicInfoAbility {
    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void ND0(int i) {
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

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void oy2() {
        ConstraintLayout constraintLayout;
        ViewGroup viewGroup = this.LLJJIJIIJIL;
        if (!(viewGroup instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) viewGroup) == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJI(R.id.s25, 7);
        c19mb.LJI(R.id.s25, 6);
        c19mb.LJI(R.id.s25, 4);
        c19mb.LJI(R.id.s7c, 7);
        c19mb.LJI(R.id.s7c, 3);
        c19mb.LJI(R.id.s7c, 4);
        c19mb.LJIIIIZZ(R.id.s25, 4, R.id.s0j, 4);
        c19mb.LJIIIIZZ(R.id.s25, 6, R.id.s0j, 7);
        c19mb.LJIIIIZZ(R.id.s25, 7, R.id.s7c, 6);
        c19mb.LJIIIIZZ(R.id.s7c, 3, R.id.s25, 3);
        c19mb.LJIIIIZZ(R.id.s7c, 4, R.id.s25, 4);
        c19mb.LJIIIIZZ(R.id.s7c, 7, 0, 7);
        c19mb.LIZIZ(constraintLayout);
        constraintLayout.requestLayout();
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

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        ConstraintLayout constraintLayout;
        int iLIZIZ;
        Context context = getContext();
        if (context != null) {
            constraintLayout = new ConstraintLayout(context);
            constraintLayout.setId(R.id.s1i);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (C1DDC.LIZIZ().screenRating == 1) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            C426750GoL.LJIIIIZZ(layoutParams, constraintLayout.getContext(), 0, 0, Integer.valueOf(iLIZIZ), 0, true);
            C786410Ut5.m6(constraintLayout, layoutParams);
        } else {
            constraintLayout = null;
        }
        this.LLJJIJIIJIL = constraintLayout;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.basicinfo.ability.IHeaderUserBasicInfoAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
