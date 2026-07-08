package com.ss.android.ugc.profile.business.ur.editprofile.pronouns.viewmodel;

import X.C09R9;
import X.C11NJ;
import X.C13LE;
import X.C18QR;
import X.C995820c1M;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes17.dex */
public final class ProfileEditPronounsNavBarViewModel extends AssemViewModel<C995820c1M> {
    public final C11NJ LL = new C11NJ();
    public final C09R9 LLILLJJLI = new C09R9(this, C13LE.LIZ(C18QR.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C995820c1M(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LL.dispose();
        super.onCleared();
    }
}
