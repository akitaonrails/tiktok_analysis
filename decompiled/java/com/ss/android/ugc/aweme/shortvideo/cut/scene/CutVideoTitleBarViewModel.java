package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AwS41S0010000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoTitleBarViewModel extends BaseJediViewModel<CutVideoTitleBarState> {
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new CutVideoTitleBarState(null, null, null, null, null, null);
    }

    public final void lR2(boolean z) {
        setState(new AwS41S0010000_29(z, 13));
    }
}
