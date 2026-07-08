package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C452501pT;
import Y.ATListenerS465S0100000_33;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewTouchMonitorWidget extends LiveWatchPreviewWidget {
    public float LLJ;
    public float LLJI;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2095));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2093));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2094));

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            view.setOnTouchListener(new ATListenerS465S0100000_33(this, 2));
        }
    }
}
