package com.ss.android.ugc.profile.business.ur.editprofileviewmodel;

import X.C1215810hkB;
import X.C1220000hqw;
import X.C13LE;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736950SvV;
import X.InterfaceC0148002o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileBioViewModel extends AssemViewModel<C1215810hkB> {
    public EditProfileSyncSharedViewModel LL;
    public User LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1215810hkB(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        EditProfileSyncSharedViewModel editProfileSyncSharedViewModel = (EditProfileSyncSharedViewModel) new C736950SvV(C13LE.LIZ(EditProfileSyncSharedViewModel.class), AFwS207S0000000_19.get$arr$(428), new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) this : null), AFwS257S0000000_19.get$arr$(403), null, null, null).getValue();
        this.LL = editProfileSyncSharedViewModel;
        this.LLILLJJLI = (User) editProfileSyncSharedViewModel.LLILLL.getValue();
    }
}
