package com.bytedance.ies.sdk.widgets;

import X.C01GW;
import X.C0IR4;
import X.C0J40;
import X.C0J4A;
import X.C1697810uHb;
import X.C18JT;
import X.C452501pT;
import X.EnumC452301pR;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class WidgetPreloader extends RecyclableWidgetManager {
    public final Fragment fragment;
    public boolean isReleased;
    public final SparseArray<List<View>> layoutCache;
    public final C01GW mockParent$delegate;

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void release() {
        this.isReleased = true;
        C18JT c18jt = this.asyncLayoutInflater.LIZJ;
        BlockingDeque<C0J40> blockingDeque = c18jt.LLILLJJLI;
        C0J40[] c0j40Arr = blockingDeque != null ? (C0J40[]) ((LinkedBlockingDeque) blockingDeque).toArray(new C0J40[0]) : (C0J40[]) c18jt.LL.toArray(new C0J40[0]);
        BlockingDeque<C0J40> blockingDeque2 = c18jt.LLILLJJLI;
        if (blockingDeque2 != null) {
            ((LinkedBlockingDeque) blockingDeque2).clear();
        }
        BlockingQueue<C0J40> blockingQueue = c18jt.LL;
        if (blockingQueue != null) {
            blockingQueue.clear();
        }
        for (C0J40 c0j40 : c0j40Arr) {
            c18jt.LJ(c0j40);
        }
        this.layoutCache.clear();
    }

    public final FrameLayout getMockParent() {
        return (FrameLayout) this.mockParent$delegate.getValue();
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final View getPreloadedView(int i) {
        List<View> list = this.layoutCache.get(i);
        View view = null;
        if (list != null) {
            if (list.isEmpty()) {
                return null;
            }
            view = (View) ListProtector.remove(list, 0);
            if (list.isEmpty()) {
                this.layoutCache.remove(i);
            }
        }
        return view;
    }

    public final void preloadLayout(final int i) {
        if (!this.isReleased) {
            C0J4A c0j4a = this.asyncLayoutInflater;
            C0IR4 c0ir4 = new C0IR4() { // from class: com.bytedance.ies.sdk.widgets.WidgetPreloader.preloadLayout.1
                @Override // X.C0IR4
                public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                    Fragment fragment;
                    if (view != null && (fragment = WidgetPreloader.this.parentFragment) != null && !fragment.isRemoving() && !WidgetPreloader.this.parentFragment.isDetached() && WidgetPreloader.this.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                        List<View> list = WidgetPreloader.this.layoutCache.get(i);
                        if (list != null) {
                            list.add(view);
                        } else {
                            WidgetPreloader.this.layoutCache.put(i, C1697810uHb.LJIILJJIL(view));
                        }
                    }
                }
            };
            C0J40 c0j40LIZIZ = c0j4a.LIZJ.LLILLL.LIZIZ();
            if (c0j40LIZIZ == null) {
                c0j40LIZIZ = new C0J40();
            }
            c0j40LIZIZ.LIZ = c0j4a;
            c0j40LIZIZ.LIZJ = i;
            c0j40LIZIZ.LIZLLL = 0;
            c0j40LIZIZ.LIZIZ = null;
            c0j40LIZIZ.LJI = c0ir4;
            c0j40LIZIZ.LJFF = null;
            c0j40LIZIZ.LJIIJJI = false;
            c0j40LIZIZ.LJIIJ = false;
            c0j4a.LIZJ.LIZJ(c0j40LIZIZ);
            return;
        }
        throw new RuntimeException("Preload is already released");
    }

    public WidgetPreloader(Fragment fragment, IWidgetProvider iWidgetProvider, Context context, FluencyOpt fluencyOpt) {
        super(iWidgetProvider);
        this.fragment = fragment;
        this.layoutCache = new SparseArray<>();
        this.mockParent$delegate = C452501pT.LIZ(EnumC452301pR.NONE, new AwS551S0100000_7(context, 120));
        super.config(false, fragment, null, context, fluencyOpt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> T preload(java.lang.Class<T> r9, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r10, com.bytedance.ies.sdk.datachannel.DataChannel r11, final boolean r12) {
        /*
            r8 = this;
            r7 = 0
            if (r10 == 0) goto L10
            if (r9 == 0) goto L9f
            java.lang.Class r0 = r10.getClass()
            boolean r1 = r9.isAssignableFrom(r0)
            r0 = 1
            if (r1 != r0) goto L9f
        L10:
            boolean r0 = r8.isReleased
            if (r0 != 0) goto L97
            r6 = 0
            if (r10 != 0) goto L1c
            r0 = -1
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r10 = r8.initWidget(r0, r9, r6)
        L1c:
            r10.dataChannel = r11
            com.bytedance.ies.sdk.widgets.LiveWidgetProvider$Companion r2 = com.bytedance.ies.sdk.widgets.LiveWidgetProvider.Companion
            com.bytedance.ies.sdk.widgets.LiveWidgetProvider r0 = r2.getInstance()
            boolean r0 = r0.isRecycleWidgetContentView
            if (r0 == 0) goto L8c
            android.view.View r1 = r10.contentView
        L2a:
            com.bytedance.ies.sdk.widgets.FluencyOpt r0 = r8.mFluencyOpt
            if (r0 == 0) goto L42
            if (r1 == 0) goto L38
            com.bytedance.ies.sdk.widgets.LiveWidgetProvider r0 = r2.getInstance()
            boolean r0 = r0.isRecycleWidgetContentView
            if (r0 != 0) goto L8e
        L38:
            com.bytedance.ies.sdk.widgets.FluencyOpt r1 = r8.mFluencyOpt
            int r0 = r10.getLayoutId()
            android.view.View r1 = r1.getPreloadLayout(r0)
        L42:
            if (r1 != 0) goto L8e
            java.lang.Class r0 = r10.getClass()
            X.0J4A r5 = r8.getAsyncLayoutInflater(r0)
            int r4 = r10.getLayoutId()
            if (r12 == 0) goto L56
            android.widget.FrameLayout r6 = r8.getMockParent()
        L56:
            android.content.Context r0 = r8.context
            int r0 = r10.getThemeOverlay(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.bytedance.ies.sdk.widgets.WidgetPreloader$preload$1 r2 = new com.bytedance.ies.sdk.widgets.WidgetPreloader$preload$1
            r2.<init>()
            X.18JT r0 = r5.LIZJ
            X.0eME<X.0J40> r0 = r0.LLILLL
            java.lang.Object r1 = r0.LIZIZ()
            X.0J40 r1 = (X.C0J40) r1
            if (r1 != 0) goto L76
            X.0J40 r1 = new X.0J40
            r1.<init>()
        L76:
            r1.LIZ = r5
            r1.LIZJ = r4
            r1.LIZLLL = r7
            r1.LIZIZ = r6
            r1.LJI = r2
            r1.LJFF = r3
            r1.LJIIJJI = r7
            r1.LJIIJ = r7
            X.18JT r0 = r5.LIZJ
            r0.LIZJ(r1)
            return r10
        L8c:
            r1 = r6
            goto L2a
        L8e:
            android.content.Context r0 = r8.context
            com.bytedance.android.widget.WidgetManager.resetViewContext(r10, r0)
            r10.setContentView(r1)
            return r10
        L97:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Preload is already released"
            r1.<init>(r0)
            throw r1
        L9f:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "error "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " instance with class "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.WidgetPreloader.preload(java.lang.Class, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
    }
}
