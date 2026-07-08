package com.ss.android.ugc.aweme.search.keyword;

import X.C01GW;
import X.C19EG;
import X.C452501pT;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.keyword.SugKeywordViewModel;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SugKeywordPresenter implements GenericLifecycleObserver {
    public final C19EG LL;
    public final Fragment LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 319));

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final String LIZ() {
        return String.valueOf(((LiveData) ((SugKeywordViewModel) this.LLILLL.getValue()).LL.getValue()).getValue());
    }

    public final void LIZIZ(String str) {
        ((LiveData) ((SugKeywordViewModel) this.LLILLL.getValue()).LL.getValue()).setValue(str);
    }

    public SugKeywordPresenter(C19EG c19eg, Fragment fragment) {
        this.LL = c19eg;
        this.LLILLJJLI = fragment;
    }
}
