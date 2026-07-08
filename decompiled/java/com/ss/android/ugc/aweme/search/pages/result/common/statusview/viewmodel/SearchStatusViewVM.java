package com.ss.android.ugc.aweme.search.pages.result.common.statusview.viewmodel;

import X.C0PQK;
import X.C0PRX;
import X.C665660Q9c;
import android.os.Looper;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchStatusViewVM extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public final NextLiveData LL;
    public final NextLiveData LLILLJJLI;
    public final NextLiveData LLILLL;
    public boolean LLILZ;

    static {
        new C0PQK();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean vQ2() {
        C665660Q9c c665660Q9c = (C665660Q9c) this.LLILLJJLI.getValue();
        return (c665660Q9c != null ? c665660Q9c.LIZ : null) != C0PRX.DEFAULT;
    }

    public final void wQ2() {
        xQ2(new C665660Q9c(C0PRX.DEFAULT, null, null, null, null, null, 56));
    }

    public SearchStatusViewVM() {
        NextLiveData nextLiveData = new NextLiveData();
        this.LL = nextLiveData;
        this.LLILLJJLI = nextLiveData;
        this.LLILLL = new NextLiveData();
    }

    public final void xQ2(C665660Q9c c665660Q9c) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LL.setValue(c665660Q9c);
        } else {
            this.LL.postValue(c665660Q9c);
        }
    }
}
