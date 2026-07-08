package com.ss.android.ugc.aweme.config;

import android.view.ViewTreeObserver;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class GlobalLayoutChangeObserverViewModel extends ViewModel {
    public boolean LL;
    public final List<ViewTreeObserver.OnGlobalLayoutListener> LLILLJJLI = new ArrayList();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        ((ArrayList) this.LLILLJJLI).clear();
        super.onCleared();
    }
}
