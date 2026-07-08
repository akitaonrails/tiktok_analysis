package com.ss.android.ugc.aweme.shortvideo.editcut;

import X.C004I;
import X.C1166910gTJ;
import X.C1170060gYO;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AwS14S0000001_29;
import kotlin.jvm.internal.AwS41S0001000_29;

/* JADX INFO: loaded from: classes23.dex */
public final class EditAdjustClipsBottomViewModel extends BaseJediViewModel<EditAdjustClipsBottomViewState> {
    public C1166910gTJ LLILZIL;

    public static EditAdjustClipsBottomViewState lR2() {
        return new EditAdjustClipsBottomViewState(0, 0, 1, 1, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final EditAdjustClipsBottomViewState nR2() {
        C1166910gTJ c1166910gTJ = this.LLILZIL;
        return c1166910gTJ != null ? (EditAdjustClipsBottomViewState) C1170060gYO.LIZ(c1166910gTJ, this) : lR2();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* bridge */ /* synthetic */ C004I zQ2() {
        return lR2();
    }

    public final void mR2(int i) {
        setStateImmediate(new AwS41S0001000_29(i, 21));
    }

    public final void oR2(float f) {
        setState(new AwS14S0000001_29(f, 1));
    }
}
