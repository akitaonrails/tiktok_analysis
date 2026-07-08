package com.bytedance.ies.sdk.widgets;

import android.view.View;

/* JADX INFO: loaded from: classes34.dex */
public interface FluencyOpt {

    public static final class DefaultImpls {
    }

    View getPreloadLayout(int i);

    void post(Runnable runnable, Object obj);

    void removeMessages(Object obj);
}
