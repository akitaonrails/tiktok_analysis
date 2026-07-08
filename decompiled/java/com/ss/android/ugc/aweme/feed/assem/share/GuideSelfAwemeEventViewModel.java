package com.ss.android.ugc.aweme.feed.assem.share;

import X.C0N1X;
import X.C0NIS;
import X.C14EU;
import X.C622680Oba;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AwS588S0100000_9;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class GuideSelfAwemeEventViewModel extends FeedBaseViewModel<C0NIS> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0NIS(null);
    }

    public GuideSelfAwemeEventViewModel() {
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onPublishGuideShareEvent(C0N1X c0n1x) {
        setState(new AwS588S0100000_9(c0n1x, 88));
    }
}
