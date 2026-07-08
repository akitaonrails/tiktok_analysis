package com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel;

import X.C712870Rxl;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS62S1000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryGuideCardAvatarViewModel extends AssemViewModel<C712870Rxl> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C712870Rxl(0);
    }

    public final void vQ2(String str) {
        setState(new AwS62S1000000_11(str, 2));
    }
}
