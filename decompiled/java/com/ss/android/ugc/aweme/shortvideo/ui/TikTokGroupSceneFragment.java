package com.ss.android.ugc.aweme.shortvideo.ui;

import X.AbstractC19458011As;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes30.dex */
public final class TikTokGroupSceneFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiHELIOSwoLCB9PSxiHSY4HConDj08PTUfKio9LQM+KCg+LSs4";
    public WeakReference<AbstractC19458011As> LL;

    @Override // androidx.fragment.app.Fragment
    public final LifecycleOwner getViewLifecycleOwner() {
        throw new IllegalArgumentException("User Scene instead");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC19458011As abstractC19458011As;
        super.onActivityResult(i, i2, intent);
        WeakReference<AbstractC19458011As> weakReference = this.LL;
        if (weakReference != null && (abstractC19458011As = weakReference.get()) != null) {
            abstractC19458011As.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        WeakReference<AbstractC19458011As> weakReference = this.LL;
        if (weakReference != null) {
            weakReference.get();
        }
    }
}
