package com.bytedance.android.livesdk.util.rxutils;

import X.C0J1T;
import X.C11NJ;
import X.C11PQ;
import X.InterfaceC420801kM;
import Y.AObserverS211S0100000_7;
import android.util.Pair;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class RxViewModel extends ViewModel {
    public final C11NJ compositeDisposable = new C11NJ();
    public final C11PQ<C0J1T> mLifecycleBehavior = new C11PQ<>();
    public final List<Pair<LiveData, Observer>> liveDatas = new ArrayList();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.compositeDisposable.LJ();
        for (Pair<LiveData, Observer> pair : this.liveDatas) {
            ((LiveData) pair.first).removeObserver((Observer) pair.second);
        }
        this.liveDatas.clear();
        this.mLifecycleBehavior.onNext(C0J1T.DESTROY);
    }

    public C11PQ<C0J1T> getLifecycleBehavior() {
        return this.mLifecycleBehavior;
    }

    public final void register(InterfaceC420801kM interfaceC420801kM) {
        this.compositeDisposable.LIZ(interfaceC420801kM);
    }

    public <T> void register(LiveData<T> liveData, MutableLiveData<T> mutableLiveData) {
        AObserverS211S0100000_7 aObserverS211S0100000_7 = new AObserverS211S0100000_7(mutableLiveData, 56);
        liveData.observeForever(aObserverS211S0100000_7);
        this.liveDatas.add(new Pair<>(liveData, aObserverS211S0100000_7));
    }
}
