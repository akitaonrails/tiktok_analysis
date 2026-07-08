package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import X.C004I;
import X.C01GW;
import X.C452501pT;
import androidx.lifecycle.LiveData;
import com.bytedance.jedi.arch.BaseJediViewModel;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import pyl.s;

/* JADX INFO: loaded from: classes30.dex */
public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(149));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(150));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(148));

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new CutVideoSpeedState(null, null);
    }

    public final void lR2(s sVar) {
        ((LiveData) this.LLILZIL.getValue()).setValue(sVar);
    }

    public final void setVisible(boolean z) {
        setState(new AwS41S0010000_29(z, 12));
    }
}
