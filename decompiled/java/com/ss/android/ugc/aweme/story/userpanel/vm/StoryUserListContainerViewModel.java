package com.ss.android.ugc.aweme.story.userpanel.vm;

import X.C20614415lW;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS137S0101000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class StoryUserListContainerViewModel extends AssemViewModel<C20614415lW> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C20614415lW(0);
    }

    public final void vQ2(int i) {
        setState(new AwS137S0101000_31(this, i, 8));
    }
}
