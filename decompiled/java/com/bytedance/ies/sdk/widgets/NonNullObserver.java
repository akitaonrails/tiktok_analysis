package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.Observer;

/* JADX INFO: loaded from: classes.dex */
public interface NonNullObserver<T> extends Observer<T> {
    @Override // androidx.lifecycle.Observer
    void onChanged(T t);
}
