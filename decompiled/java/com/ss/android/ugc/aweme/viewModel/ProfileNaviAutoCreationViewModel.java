package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviAutoCreationViewModel extends BaseJediViewModel<ProfileNaviAutoCreationState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileNaviAutoCreationState(false, null, false, false, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void exit() {
        ProfileNaviAutoCreationState profileNaviAutoCreationState = (ProfileNaviAutoCreationState) FQ2();
        profileNaviAutoCreationState.setBackPressed(false);
        profileNaviAutoCreationState.setAutoCreationComplete(false);
        profileNaviAutoCreationState.setSelfieBitmap(null);
        profileNaviAutoCreationState.setCreateProfileImage(false);
        profileNaviAutoCreationState.setShouldShowSkintoneSelectFragment(false);
        profileNaviAutoCreationState.setProfileNaviDataModel(null);
        setStateImmediate(AFwS273S0000000_29.get$arr$(200));
        setStateImmediate(AFwS273S0000000_29.get$arr$(201));
    }
}
