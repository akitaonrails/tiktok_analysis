package com.ss.android.ugc.aweme.feed.adapter.widget.share;

import X.C01GW;
import X.C1381020m2e;
import X.C13LE;
import X.C19719912Dl;
import X.EnumC494740Jai;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareWidget extends LiveWatchPreviewWidget implements Handler.Callback {
    public String LLJ;
    public TextView LLJI;
    public C1381020m2e LLJIJIL;
    public final BPEAHandler LLJILJIL = new BPEAHandler(Looper.getMainLooper(), this);
    public final C01GW LLJILJILJ;

    public ShareWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewShareVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS565S0100000_21(c19719912DlLIZ, 547), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.df2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget.M1():void");
    }

    public final void N1() {
        this.LLJILJIL.removeMessages(1);
        this.LLJILJIL.removeMessages(2);
        this.LLJILJIL.removeMessages(3);
        this.LLJILJIL.removeMessages(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0089  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            r1 = 0
            r4 = 2
            r6 = 0
            r3 = 1
            if (r2 == r3) goto L48
            if (r2 == r4) goto L2e
            r0 = 3
            if (r2 == r0) goto L21
            r0 = 4
            if (r2 == r0) goto L11
            return r1
        L11:
            X.0m2d r1 = X.C1381010m2d.LIZ
            X.0m2e r0 = r8.LLJIJIL
            r1.getClass()
            if (r0 == 0) goto L20
            X.C1381010m2d.LIZJ(r0, r6)
            X.C1381010m2d.LIZ(r0)
        L20:
            return r3
        L21:
            X.0m2d r1 = X.C1381010m2d.LIZ
            X.0m2e r0 = r8.LLJIJIL
            r1.getClass()
            if (r0 == 0) goto L2d
            X.C1381010m2d.LIZJ(r0, r6)
        L2d:
            return r3
        L2e:
            X.0m2d r0 = X.C1381010m2d.LIZ
            X.0m2e r2 = r8.LLJIJIL
            r0.getClass()
            if (r2 == 0) goto L47
            android.view.View r0 = r2.LIZIZ
            if (r0 == 0) goto L3e
            X.C786410Ut5.I7(r6, r0)
        L3e:
            Y.ALAdapterS17S0100000_21 r1 = new Y.ALAdapterS17S0100000_21
            r0 = 5
            r1.<init>(r2, r0)
            X.C1381010m2d.LIZJ(r2, r1)
        L47:
            return r3
        L48:
            java.lang.Object r0 = r9.obj
            java.lang.Object r7 = com.bytedance.bpea.transmit.hook.HandlerHook.getMessageObj(r0)
            X.0leD r7 = (X.C1365870leD) r7
            X.0m2d r0 = X.C1381010m2d.LIZ
            X.0m2e r5 = r8.LLJIJIL
            r0.getClass()
            java.lang.String r0 = r7.LJIIIZ
            if (r0 == 0) goto L61
            int r0 = r0.length()
            if (r0 != 0) goto L64
        L61:
            X.C1381010m2d.LIZIZ(r5)
        L64:
            android.animation.ValueAnimator r0 = X.C1381010m2d.LIZIZ
            if (r0 == 0) goto L89
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L89
            java.lang.String r0 = r7.LJIIIZ
            if (r0 == 0) goto L89
            int r0 = r0.length()
            if (r0 == 0) goto L89
            android.animation.ValueAnimator r2 = X.C1381010m2d.LIZIZ
            if (r2 == 0) goto L89
            Y.ALAdapterS10S0300000_21 r1 = new Y.ALAdapterS10S0300000_21
            r0 = 1
            r1.<init>(r7, r6, r5, r0)
            r2.addListener(r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L9c
        L89:
            if (r5 == 0) goto L9c
            android.view.View r2 = r5.LIZIZ
            if (r2 == 0) goto L99
            Y.ACListenerS86S0300000_21 r1 = new Y.ACListenerS86S0300000_21
            r0 = 10
            r1.<init>(r7, r5, r6, r0)
            X.C786410Ut5.I7(r1, r2)
        L99:
            X.C1381010m2d.LIZLLL(r7, r5)
        L9c:
            java.lang.String r0 = r7.LJIIIZ
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lac
            r1 = 5000(0x1388, double:2.4703E-320)
        La6:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r8.LLJILJIL
            X.C786410Ut5.LJLJJI(r4, r1, r0)
            return r3
        Lac:
            r1 = 2000(0x7d0, double:9.88E-321)
            goto La6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget.handleMessage(android.os.Message):boolean");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJI = (TextView) findViewById(R.id.undo);
        this.LLJIJIL = new C1381020m2e((TuxTextView) findViewById(R.id.uz2), findViewById(R.id.n5x), (TuxIconView) findViewById(R.id.uzg), (TuxIconView) findViewById(R.id.h6x), this.LLJI);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        M1();
    }
}
