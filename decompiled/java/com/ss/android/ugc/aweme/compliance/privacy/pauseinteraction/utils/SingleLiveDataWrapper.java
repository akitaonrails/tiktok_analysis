package com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.utils;

import Y.AObserverS188S0200000_28;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes29.dex */
public final class SingleLiveDataWrapper<T> extends MutableLiveData<T> {
    public static final int $stable = 8;
    public final AtomicBoolean flag;

    public SingleLiveDataWrapper() {
        this.flag = new AtomicBoolean(false);
    }

    public SingleLiveDataWrapper(T t) {
        super(t);
        this.flag = new AtomicBoolean(false);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        this.flag.set(true);
        super.setValue(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, Observer<? super T> observer) {
        super.observe(lifecycleOwner, new AObserverS188S0200000_28((Object) this, (View) observer, (ViewPagerBottomSheetBehavior<View>) 7));
    }
}
