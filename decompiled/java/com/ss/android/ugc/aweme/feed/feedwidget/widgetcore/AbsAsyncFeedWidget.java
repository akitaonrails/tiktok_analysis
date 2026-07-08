package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import X.AbstractC1182104jr;
import X.C0RD4;
import X.C689910R4j;
import X.C799570VYd;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.GenericWidget;

/* JADX INFO: loaded from: classes12.dex */
public abstract class AbsAsyncFeedWidget extends GenericWidget {
    public abstract AbstractC1182104jr LJIILLIIL();

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIILIIL(View view) {
        synchronized (C689910R4j.LIZ) {
            if (!C689910R4j.LIZJ) {
                C689910R4j.LIZJ = true;
                C689910R4j.LIZIZ = C799570VYd.LIZIZ();
            }
        }
        LJIILLIIL();
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget
    /* JADX INFO: renamed from: LJIILL */
    public final void onChanged(C0RD4 c0rd4) {
        if (c0rd4 != null) {
            String str = c0rd4.LIZ;
            str.getClass();
            if (str.equals("video_params")) {
                Object obj = c0rd4.LIZIZ;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.GenericWidget, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C0RD4 c0rd4) {
        onChanged(c0rd4);
    }
}
