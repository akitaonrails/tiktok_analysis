package com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel;

import X.C004I;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {
    public final ArrayList<TikTokMediaModel> LLILZIL = new ArrayList<>();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ChooseMediaState(null, null, null, null, null, null, 63, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZLL.removeCallbacksAndMessages(null);
    }
}
