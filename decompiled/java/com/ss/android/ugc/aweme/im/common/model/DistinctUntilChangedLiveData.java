package com.ss.android.ugc.aweme.im.common.model;

import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DistinctUntilChangedLiveData<T> extends MutableLiveData<T> {
    public DistinctUntilChangedLiveData(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void postValue(T t) {
        if (!Intrinsics.LJFF(getValue(), t)) {
            super.postValue(t);
        }
    }

    @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
    public void setValue(T t) {
        if (!Intrinsics.LJFF(getValue(), t)) {
            super.setValue(t);
        }
    }
}
