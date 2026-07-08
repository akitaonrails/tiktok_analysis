package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.InterfaceC1232320iAo;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviCreatorViewModel extends BaseJediViewModel<ProfileNaviCreatorState> {
    public final InterfaceC1232320iAo LLILZIL = ((IProfileService) ServiceManager.get().getService(IProfileService.class)).newUserPresenter();

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileNaviCreatorState(null, false, false, false, false, null);
    }
}
