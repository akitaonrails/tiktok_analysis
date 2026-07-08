package com.ss.android.ugc.aweme.viewmodel;

import X.C0SYQ;
import X.C14EU;
import X.C585780MyG;
import X.C622680Oba;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes12.dex */
public final class PostModeShareViewModel extends AssemViewModel<C0SYQ> {
    public static final /* synthetic */ int LLILZ = 0;
    public Aweme LL;
    public String LLILLJJLI = "";
    public int LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0SYQ(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        C622680Oba.LIZJ(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUpdateShareCountEvent$post_mode_release(C585780MyG c585780MyG) {
        String aid;
        Aweme aweme;
        AwemeStatistics statistics;
        if (c585780MyG == null) {
            return;
        }
        String str = c585780MyG.LIZ;
        Aweme aweme2 = this.LL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid) && (aweme = this.LL) != null && (statistics = aweme.getStatistics()) != null) {
            statistics.setShareCount(c585780MyG.LIZIZ);
            setState(new AwS590S0100000_11(this, 401));
        }
    }
}
