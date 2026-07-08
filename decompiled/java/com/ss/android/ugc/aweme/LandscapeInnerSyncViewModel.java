package com.ss.android.ugc.aweme;

import X.C232800v8;
import X.C291001Au;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LandscapeInnerSyncViewModel extends AssemViewModel<C232800v8> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C232800v8(new C291001Au(new ArrayList()), new C291001Au(new Aweme()));
    }
}
