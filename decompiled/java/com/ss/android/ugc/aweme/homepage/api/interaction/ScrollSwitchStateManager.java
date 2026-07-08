package com.ss.android.ugc.aweme.homepage.api.interaction;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class ScrollSwitchStateManager extends BaseScrollSwitchStateManager {
    public static final /* synthetic */ int LLJL = 0;

    public final Fragment OQ2() {
        WeakReference<Fragment> weakReference = this.LLJJJIL;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
