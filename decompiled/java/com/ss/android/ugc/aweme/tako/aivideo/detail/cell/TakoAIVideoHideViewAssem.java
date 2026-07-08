package com.ss.android.ugc.aweme.tako.aivideo.detail.cell;

import X.C2187701Ajg;
import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoAIVideoHideViewAssem extends FeedBaseContentAssem<TakoAIVideoHideViewAssem> {
    public ViewTreeObserverOnGlobalLayoutListenerC738830SyX LLJJJJ;
    public View LLJJJJJIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        ViewTreeObserver viewTreeObserver;
        View view = this.LLJJJJJIL;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX = this.LLJJJJ;
        viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC738830SyX);
        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC738830SyX, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJJJJIL = view;
        C786410Ut5.LJLLLLLL(8, view);
        this.LLJJJJ = new ViewTreeObserverOnGlobalLayoutListenerC738830SyX(view, 3);
        C786410Ut5.x3(view.getViewTreeObserver(), this.LLJJJJ);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }
}
