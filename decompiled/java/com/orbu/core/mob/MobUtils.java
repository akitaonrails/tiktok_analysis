package com.orbu.core.mob;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes14.dex */
public final class MobUtils {
    public static final MobUtils INSTANCE = new MobUtils();

    public final long getCurMillis() {
        return SystemClock.uptimeMillis();
    }

    public final long getCurThreadMillis() {
        return SystemClock.currentThreadTimeMillis();
    }
}
