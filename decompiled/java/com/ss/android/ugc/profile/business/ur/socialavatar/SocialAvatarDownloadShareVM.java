package com.ss.android.ugc.profile.business.ur.socialavatar;

import X.C1378210ly7;
import X.C1463680oBy;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;

/* JADX INFO: loaded from: classes22.dex */
public final class SocialAvatarDownloadShareVM extends AssemViewModel<C1378210ly7> {
    public C1463680oBy LL;
    public C1463680oBy LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1378210ly7(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1463680oBy c1463680oBy = this.LL;
        if (c1463680oBy != null) {
            c1463680oBy.LJ();
        }
        C1463680oBy c1463680oBy2 = this.LLILLJJLI;
        if (c1463680oBy2 != null) {
            c1463680oBy2.LJ();
        }
        super.onCleared();
    }
}
