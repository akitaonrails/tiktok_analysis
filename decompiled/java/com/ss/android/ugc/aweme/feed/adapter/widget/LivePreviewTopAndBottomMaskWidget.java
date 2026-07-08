package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C09JN;
import X.C11JF;
import X.C11NZ;
import X.C755900Tky;
import X.C786160Usg;
import X.C786330Usx;
import X.C786410Ut5;
import X.EnumC755930Tl1;
import X.InterfaceC755910Tkz;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreViewMaskSettings;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewTopAndBottomMaskWidget extends LiveWatchPreviewWidget {
    public final View LLJ;
    public final View LLJI;
    public boolean LLJIJIL;
    public C11JF LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        this.LLJILJILJ = false;
    }

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

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C11JF c11jf = this.LLJILJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C755900Tky c755900Tky = C755900Tky.LL;
        EnumC755930Tl1 enumC755930Tl1 = EnumC755930Tl1.LIVE_PREVIEW_GRADUAL_TOP;
        InterfaceC755910Tkz interfaceC755910Tkz = new InterfaceC755910Tkz() { // from class: X.0Tl5
            @Override // X.InterfaceC755910Tkz
            public final void LIZ() {
                C786410Ut5.LJLLLLLL(8, this.LIZ.LLJ);
                this.LIZ.LLJIJIL = true;
            }
        };
        c755900Tky.getClass();
        this.LLJILJIL = (C11JF) C11NZ.LJIJJLI(new C786330Usx(enumC755930Tl1, interfaceC755910Tkz, 1)).LJJIIZ(new C786160Usg(enumC755930Tl1, interfaceC755910Tkz, 2)).LJJLL(new C09JN() { // from class: X.00QD
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$3");
                C1C7U.LIZIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$3");
            }
        }, new C09JN() { // from class: X.00QE
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$4");
                C1C7U.LIZIZ("LivePreviewCardDegradeManager@238e.registerDegradeListener$4");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C11JF c11jf = this.LLJILJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final void M1() {
        boolean zLLIFFJFJJ;
        if (!this.LLJILJILJ && (zLLIFFJFJJ = C755900Tky.LL.LLIFFJFJJ(EnumC755930Tl1.LIVE_PREVIEW_GRADUAL_TOP)) != this.LLJIJIL) {
            if (!LivePreViewMaskSettings.INSTANCE.getValue().getTopOptimized() || zLLIFFJFJJ) {
                C786410Ut5.LJLLLLLL(8, this.LLJ);
            } else {
                C786410Ut5.LJLLLLLL(0, this.LLJ);
            }
            this.LLJIJIL = zLLIFFJFJJ;
        }
        this.LLJILJILJ = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void D1(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator viewPropertyAnimatorAlpha2;
        ViewPropertyAnimator duration2;
        if (z) {
            View view = this.LLJI;
            if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null && (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(0.0f)) != null && (duration2 = viewPropertyAnimatorAlpha2.setDuration(200L)) != null) {
                duration2.start();
                return;
            }
            return;
        }
        View view2 = this.LLJI;
        if (view2 == null || (viewPropertyAnimatorAnimate = view2.animate()) == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LLJILJILJ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r6) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopAndBottomMaskWidget.onLoad(java.lang.Object[]):void");
    }

    public LivePreviewTopAndBottomMaskWidget(View view, View view2) {
        this.LLJ = view;
        this.LLJI = view2;
    }
}
