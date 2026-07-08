package com.ss.android.ugc.aweme.search.ecommerce.viewmodel;

import X.C07KC;
import X.C418440Gaw;
import X.C814420VxA;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchContainerHeaderVM extends ViewModel {
    public int LL;
    public final NextLiveData LLILLJJLI;
    public final NextLiveData LLILLL;
    public final NextLiveData LLILZ;
    public final NextLiveData LLILZIL;
    public final NextLiveData LLILZLL;
    public final NextLiveData LLIZ;
    public int LLIZLLLIL;

    public final int vQ2() {
        int i = this.LL;
        return i <= 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) : i;
    }

    public SearchContainerHeaderVM() {
        NextLiveData nextLiveData = new NextLiveData();
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = nextLiveData;
        NextLiveData nextLiveData2 = new NextLiveData();
        this.LLILZ = nextLiveData2;
        this.LLILZIL = nextLiveData2;
        NextLiveData nextLiveData3 = new NextLiveData();
        this.LLILZLL = nextLiveData3;
        this.LLIZ = nextLiveData3;
    }

    public final void resetState() {
        if (C07KC.LIZ()) {
            this.LLIZLLLIL = 0;
            this.LLILLJJLI.setValue(0);
            this.LLILZ.setValue(Boolean.TRUE);
        }
    }
}
