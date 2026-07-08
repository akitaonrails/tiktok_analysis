package com.ss.android.ugc.aweme.music.ui.viewmodel;

import X.C11NJ;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class MusicDetailViewModel extends ViewModel {
    public final MutableLiveData<Pair<UrlModel, Integer>> LL = new MutableLiveData<>();
    public final C11NJ LLILLJJLI = new C11NJ();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLJJLI.dispose();
    }
}
