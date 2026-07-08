package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C569220MUe;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AFwS273S0000000_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoViewModel extends BaseJediViewModel<CutVideoState> {
    public C569220MUe LLILZIL;

    public final C569220MUe lR2() {
        C569220MUe c569220MUe = this.LLILZIL;
        if (c569220MUe != null) {
            return c569220MUe;
        }
        return null;
    }

    public final void nR2() {
        setState(AFwS273S0000000_29.get$arr$(105));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new CutVideoState(null, null);
    }

    public final boolean mR2() {
        return lR2().LIZ.size() > 1;
    }
}
