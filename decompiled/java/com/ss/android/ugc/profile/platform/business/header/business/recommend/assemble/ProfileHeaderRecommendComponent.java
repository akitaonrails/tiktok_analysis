package com.ss.android.ugc.profile.platform.business.header.business.recommend.assemble;

import X.C13LE;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardMineComponent;
import com.ss.android.ugc.profile.business.ur.platform.HeaderRecommendUserCardUserComponent;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileHeaderRecommendComponent extends ProfileHeaderRecommendBaseComponent {
    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void Go() {
        ProfilePlatformViewModel profilePlatformViewModelSo = So();
        Ho("recommend_user_card", C13LE.LIZ((profilePlatformViewModelSo == null || profilePlatformViewModelSo.LLJILJIL) ? HeaderRecommendUserCardMineComponent.class : HeaderRecommendUserCardUserComponent.class), null, -1, false);
    }
}
