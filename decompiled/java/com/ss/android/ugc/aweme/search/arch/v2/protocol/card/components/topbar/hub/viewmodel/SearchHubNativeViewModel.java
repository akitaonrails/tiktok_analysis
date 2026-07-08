package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel;

import X.C0Q3E;
import X.C640950PCb;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHubNativeViewModel extends ViewModel {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final MutableLiveData<Integer> LL;
    public final MutableLiveData LLILLJJLI;
    public List<SearchLabel> LLILLL;
    public long LLILZ;
    public String LLILZIL;
    public float LLILZLL;
    public SearchMixFeed LLIZ;

    public SearchHubNativeViewModel() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
    }

    public final void vQ2(int i) {
        this.LL.setValue(Integer.valueOf(i));
        C0Q3E.LJI().fe(new C640950PCb(i));
    }
}
