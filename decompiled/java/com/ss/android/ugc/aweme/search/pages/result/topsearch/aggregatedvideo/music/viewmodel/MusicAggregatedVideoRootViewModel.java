package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.music.viewmodel;

import X.C1DFK;
import X.C23118094a;
import X.C232600v6;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes3.dex */
public final class MusicAggregatedVideoRootViewModel extends AssemViewModel<C232600v6> {
    public static final /* synthetic */ int LLILZIL = 0;
    public JobSupport LL;
    public long LLILLJJLI;
    public long LLILLL;
    public boolean LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C232600v6(null);
    }

    public final void vQ2() {
        if (this.LLILZ) {
            this.LLILZ = false;
            if (this.LLILLJJLI >= 3000) {
                setState(AFwS229S0000000_2.get$arr$(485));
            } else {
                this.LL.LIZIZ(null);
                this.LLILLJJLI += System.currentTimeMillis() - this.LLILLL;
            }
        }
    }

    public MusicAggregatedVideoRootViewModel() {
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        c1dfkLIZ.LIZIZ(null);
        this.LL = c1dfkLIZ;
    }
}
