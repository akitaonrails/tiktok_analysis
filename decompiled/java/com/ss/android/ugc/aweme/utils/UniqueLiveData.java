package com.ss.android.ugc.aweme.utils;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class UniqueLiveData<T> extends MutableLiveData<T> {
    public boolean mIsFirst = true;
    public T mOldValue;

    private final void setValueActual(T t) {
        this.mOldValue = t;
        super.setValue(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        if (this.mIsFirst) {
            setValueActual(t);
            this.mIsFirst = false;
        } else {
            if (Intrinsics.LJFF(this.mOldValue, t)) {
                return;
            }
            setValueActual(t);
        }
    }
}
