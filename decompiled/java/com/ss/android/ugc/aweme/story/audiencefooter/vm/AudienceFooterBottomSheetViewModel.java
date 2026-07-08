package com.ss.android.ugc.aweme.story.audiencefooter.vm;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes30.dex */
public final class AudienceFooterBottomSheetViewModel extends ViewModel {
    public final MutableLiveData<Integer> LL = new MutableLiveData<>(0);

    public final void vQ2(int i) {
        this.LL.setValue(Integer.valueOf(i));
    }
}
