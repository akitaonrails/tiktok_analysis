package com.ss.android.ugc.aweme.commercialize.feed.assem;

import X.C1025100cma;
import X.C14EU;
import X.C585840MyM;
import X.C996360c2E;
import X.C996950c3B;
import X.C996960c3C;
import X.InterfaceC0148002o;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseHolderViewModel;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class FeedAdEventViewModel extends FeedBaseHolderViewModel<C996360c2E> {
    static {
        new Object() { // from class: X.0c3D
        };
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C996360c2E(0);
    }

    public FeedAdEventViewModel() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onClickFromButtonEvent(C996960c3C c996960c3C) {
        setState(new AwS595S0100000_16(c996960c3C, 71));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShowAdLightPageEvent(C585840MyM c585840MyM) {
        setState(new AwS595S0100000_16(c585840MyM, 72));
    }

    @C14EU(threadMode = ThreadMode.BACKGROUND)
    public final void onShowPopUpWebPageInFeedEvent(C996950c3B c996950c3B) {
        C1025100cma c1025100cma = c996950c3B.LIZ;
        if (c1025100cma != null) {
            setState(new AwS595S0100000_16(c1025100cma, 73));
        }
    }
}
