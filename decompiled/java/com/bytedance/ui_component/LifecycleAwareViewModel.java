package com.bytedance.ui_component;

import X.C004I;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;

/* JADX INFO: loaded from: classes26.dex */
public abstract class LifecycleAwareViewModel<T extends C004I> extends JediViewModel<T> implements LifecycleOwner {
    public Lifecycle LLILZIL;

    public final Lifecycle hR2() {
        Lifecycle lifecycle = this.LLILZIL;
        if (lifecycle != null) {
            return lifecycle;
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return hR2();
    }

    public final void iR2(Lifecycle lifecycle) {
        this.LLILZIL = lifecycle;
    }
}
