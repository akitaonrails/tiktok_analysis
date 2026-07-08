package com.ss.android.ugc.aweme.feed.hvr;

import X.C2443709hr;
import X.C2443809hs;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.suggestfollowing.AbsFollowingSuggestViewModel;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class FollowingHvrLabelInFypVM extends AbsFollowingSuggestViewModel<C2443709hr> {
    public String LLILLJJLI;
    public final Set<String> LLILLL = new LinkedHashSet();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C2443709hr(new C291001Au(new C2443809hs(0)));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.clear();
    }
}
