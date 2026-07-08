package com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel;

import X.C641820PFk;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchReorderAndChooseTabViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final MutableLiveData<C641820PFk> LL;
    public final MutableLiveData LLILLJJLI;
    public final List<String> LLILLL;

    public SearchReorderAndChooseTabViewModel() {
        MutableLiveData<C641820PFk> mutableLiveData = new MutableLiveData<>(null);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        this.LLILLL = new ArrayList();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((ArrayList) this.LLILLL).clear();
    }
}
