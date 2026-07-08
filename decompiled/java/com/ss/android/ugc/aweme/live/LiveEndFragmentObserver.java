package com.ss.android.ugc.aweme.live;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes32.dex */
public final class LiveEndFragmentObserver {
    public static boolean LIZ;

    public static void LIZ(Fragment fragment) {
        if (fragment == null) {
            return;
        }
        LIZ = true;
        fragment.getLifecycle().addObserver(new LiveEndFragmentObserver$observeLiveEndFragment$1());
    }
}
