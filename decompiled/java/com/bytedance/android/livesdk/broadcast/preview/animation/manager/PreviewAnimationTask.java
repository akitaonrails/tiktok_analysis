package com.bytedance.android.livesdk.broadcast.preview.animation.manager;

import X.C09CT;
import X.C0UIB;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewAnimationTask {

    @C09CT("key")
    public final String key;

    @C09CT("listener")
    public final C0UIB listener;

    @C09CT("priority")
    public final int priority;

    public PreviewAnimationTask() {
        this(null, 0, "");
    }

    public PreviewAnimationTask(C0UIB c0uib, int i, String str) {
        this.listener = c0uib;
        this.priority = i;
        this.key = str;
    }
}
