package com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager;

import X.C0XQ7;
import X.C1158970gGV;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM;

/* JADX INFO: loaded from: classes20.dex */
public final class AwemePagerVM extends IAwemePagerVM {
    public String LLILLL = "slide";
    public User LLILZ = C0XQ7.LJFF().getCurUser();
    public boolean LLILZIL = true;
    public Integer LLILZLL;
    public Aweme LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1158970gGV(0);
    }

    @Override // com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM
    public final User getUser() {
        return this.LLILZ;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM
    public final boolean isMyProfile() {
        return this.LLILZIL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM
    public final Integer vQ2() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.vm.IAwemePagerVM
    public final boolean wQ2() {
        return this.LLIZLLLIL;
    }
}
