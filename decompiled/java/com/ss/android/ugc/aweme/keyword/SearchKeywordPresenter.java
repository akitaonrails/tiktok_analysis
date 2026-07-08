package com.ss.android.ugc.aweme.keyword;

import X.C01GW;
import X.C0P9D;
import X.C0P9E;
import X.C0WZX;
import X.C19EG;
import X.C2204961BRm;
import X.C452501pT;
import android.text.Editable;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.keyword.SearchEditTextViewModel;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeywordPresenter implements C0P9D, GenericLifecycleObserver {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 191));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 190));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC639130P5b
    public final String getEditText() {
        LiveData liveData;
        EditText editText;
        Editable editableLLJILLL;
        String string;
        SearchEditTextViewModel searchEditTextViewModel = (SearchEditTextViewModel) this.LLILZ.getValue();
        return (searchEditTextViewModel == null || (liveData = (LiveData) searchEditTextViewModel.LL.getValue()) == null || (editText = (EditText) liveData.getValue()) == null || (editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOGteojBzjZam6fK9HfME9OotuFFMLq3CN/a96kphw==", null))) == null || (string = editableLLJILLL.toString()) == null) ? "" : string;
    }

    @Override // X.InterfaceC639130P5b
    public final C0P9E getKeyword() {
        LiveData liveData;
        C0P9E c0p9e;
        SearchKeywordViewModel searchKeywordViewModel = (SearchKeywordViewModel) this.LLILLL.getValue();
        return (searchKeywordViewModel == null || (liveData = (LiveData) searchKeywordViewModel.LL.getValue()) == null || (c0p9e = (C0P9E) liveData.getValue()) == null) ? new C0P9E((String) null, 3) : c0p9e;
    }

    @Override // X.C0P9D
    public final void LIZ(C0P9E c0p9e) {
        LiveData liveData;
        SearchKeywordViewModel searchKeywordViewModel = (SearchKeywordViewModel) this.LLILLL.getValue();
        if (searchKeywordViewModel != null && (liveData = (LiveData) searchKeywordViewModel.LL.getValue()) != null) {
            liveData.setValue(c0p9e);
        }
    }

    public SearchKeywordPresenter(C19EG c19eg, Fragment fragment) {
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
    }
}
