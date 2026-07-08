package com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.preload;

import X.C532330KuF;
import X.C580710Mq5;
import X.InterfaceC19711912Aj;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.foundation.activity.BaseActivity;

/* JADX INFO: loaded from: classes9.dex */
public final class PreloadComponent implements InterfaceC19711912Aj, GenericLifecycleObserver {
    public final C580710Mq5 LL;
    public BaseActivity LLILLJJLI;
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL;
    public C532330KuF LLILZLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC19711912Aj
    public final String getMusicPath() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC19711912Aj
    public final C532330KuF getTemplateData() {
        return this.LLILZLL;
    }

    public PreloadComponent(C580710Mq5 c580710Mq5) {
        this.LL = c580710Mq5;
    }
}
