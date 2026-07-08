package com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.assemble;

import X.C1248870ibV;
import X.C1248950ibd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19252910Tv;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.base.IProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.data.ProfileCommonInfo;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponentUIConfig;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.UserRelationInfo;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.base.IHeaderStoryHighlightsAbility;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileHeaderStoryHighlightsBaseComponent extends HeaderBaseContainerComponent implements IHeaderStoryHighlightsAbility {
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
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IHeaderStoryHighlightsAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IHeaderStoryHighlightsAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent, com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent, X.InterfaceC1248970ibf
    public final void Hj(ProfileComponents profileComponents) {
        ProfilePlatformViewModel profilePlatformViewModelSo;
        User userVQ2;
        ProfileCommonInfo profileCommonInfoWG2;
        UserRelationInfo userRelationInfo;
        dp(profileComponents.components);
        IProfileBaseAbility iProfileBaseAbility = (IProfileBaseAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IProfileBaseAbility.class, null);
        if ((iProfileBaseAbility != null && (profileCommonInfoWG2 = iProfileBaseAbility.wG2()) != null && (userRelationInfo = profileCommonInfoWG2.getUserRelationInfo()) != null && Intrinsics.LJFF(userRelationInfo.isBlocking(), Boolean.TRUE)) || ((profilePlatformViewModelSo = So()) != null && (userVQ2 = profilePlatformViewModelSo.vQ2()) != null && userVQ2.isBlock)) {
            ViewGroup viewGroup = this.LLJJIJIIJIL;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.LLJJIJIIJIL;
        if (viewGroup2 == null) {
            return;
        }
        C786410Ut5.LJLZ(0, viewGroup2);
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent
    public final void hp(ProfileComponentUIConfig profileComponentUIConfig) {
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            C786410Ut5.a6(frameLayout, layoutParams);
            this.LLJJIJIIJIL = frameLayout;
            C1248870ibV.LIZJ(frameLayout, profileComponentUIConfig, true, false);
            C19252910Tv.LIZIZ.LIZLLL().LJI().LLJJJJLIIL(this.LLJJIJIIJIL, null, null);
        }
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.base.IHeaderStoryHighlightsAbility
    public final void LJIIIZ(int i, View view, String str) {
        HeaderBaseContainerComponent.bp(this, str, i, view, null, null, false, 56);
    }
}
