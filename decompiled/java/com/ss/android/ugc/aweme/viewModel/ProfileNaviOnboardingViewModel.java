package com.ss.android.ugc.aweme.viewModel;

import X.C004I;
import X.C19424210z2;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.BaseJediViewModel;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileNaviOnboardingViewModel extends BaseJediViewModel<ProfileNaviOnboardingState> {
    public final long LLILZIL = 1500;
    public final BPEAHandler LLILZLL = new BPEAHandler();

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ProfileNaviOnboardingState(new C19424210z2(null, 3), null, null, null, false, false, true);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZLL.removeCallbacksAndMessages(null);
    }
}
