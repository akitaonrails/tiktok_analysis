package com.ss.android.ugc.aweme.subscription.utils;

import Y.AObserverS188S0200000_28;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes29.dex */
public final class SingleLiveData<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    public final AtomicBoolean pending = new AtomicBoolean(false);

    public final void call() {
        setValue(null);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.pending.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        super.observe(lifecycleOwner, new AObserverS188S0200000_28((Object) this, (View) observer, (ViewPagerBottomSheetBehavior<View>) 13));
    }
}
