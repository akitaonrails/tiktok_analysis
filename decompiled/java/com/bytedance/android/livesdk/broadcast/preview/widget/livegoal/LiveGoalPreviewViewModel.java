package com.bytedance.android.livesdk.broadcast.preview.widget.livegoal;

import X.C01GW;
import X.C11NJ;
import X.C452501pT;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveGoalPreviewViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(21));

    public LiveGoalPreviewViewModel() {
        new MutableLiveData();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C11NJ) this.LL.getValue()).dispose();
    }
}
