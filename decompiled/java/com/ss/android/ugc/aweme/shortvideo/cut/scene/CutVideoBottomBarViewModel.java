package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C01GW;
import X.C452501pT;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS14S0000001_29;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoBottomBarViewModel extends BaseJediViewModel<CutVideoBottomBarState> {
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(146));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(147));

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new CutVideoBottomBarState(null, null, null, null, null, null, null, null);
    }

    public final void lR2(float f) {
        setState(new AwS14S0000001_29(f, 0));
    }
}
