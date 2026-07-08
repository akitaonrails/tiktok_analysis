package com.ss.android.ugc.profile.platform.business.header.business.toptips.assemble;

import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.toptips.base.IHeaderTopTipsAbility;

/* JADX INFO: loaded from: classes20.dex */
public abstract class ProfileHeaderTopTipsBaseComponent extends HeaderBaseContainerComponent implements IHeaderTopTipsAbility {
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
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderTopTipsAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderTopTipsAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
            this.LLJJIJIIJIL = frameLayout;
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.toptips.base.IHeaderTopTipsAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.toptips.base.IHeaderTopTipsAbility
    public final void sf2(String str, int i, View view, ViewGroup viewGroup) {
        HeaderBaseContainerComponent.bp(this, str, i, view, viewGroup, null, false, 48);
    }
}
