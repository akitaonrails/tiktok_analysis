package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes30.dex */
public abstract class BaseViewModel<T> extends AndroidViewModel {
    public final MutableLiveData<T> LL;

    public BaseViewModel(Application application) {
        super(application);
        this.LL = new MutableLiveData<>();
    }
}
