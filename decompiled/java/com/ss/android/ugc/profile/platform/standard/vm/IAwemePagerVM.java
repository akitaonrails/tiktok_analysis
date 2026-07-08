package com.ss.android.ugc.profile.platform.standard.vm;

import X.C0XQ7;
import X.C1158970gGV;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: loaded from: classes20.dex */
public abstract class IAwemePagerVM extends AssemViewModel<C1158970gGV> {
    public final User LL = C0XQ7.LJFF().getCurUser();
    public final boolean LLILLJJLI = true;

    public Integer vQ2() {
        return null;
    }

    public boolean wQ2() {
        return false;
    }

    public User getUser() {
        return this.LL;
    }

    public boolean isMyProfile() {
        return this.LLILLJJLI;
    }
}
