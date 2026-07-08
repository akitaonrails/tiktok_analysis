package com.bytedance.ies.sdk.widgets.scatter;

import X.C01GW;
import X.C1697810uHb;
import X.C1C7U;
import X.C2179971ATj;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadOpt;
import com.bytedance.android.widget.Widget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class WidgetLoadScatter {
    public long calculateRunTime;
    public boolean firstFrameReady;
    public boolean hasAllPhaseLoaded;
    public boolean needPause;
    public volatile boolean shouldSkipByCoreMsgSent;
    public static final Companion Companion = new Companion();
    public static final HashMap<String, Long> widgetExecuteTimeRecord = new HashMap<>();
    public static long maxLoadTimeMs = 16;
    public final LinkedList<WidgetLoadInfo> pendingWidgetLoadInfo = new LinkedList<>();
    public boolean isAlwaysSplit = LiveWidgetLoadOpt.alwaysSplit();
    public List<String> whiteList = C1697810uHb.LJIIJJI("DefinitionSelectionWidget", "LiveNewVideoGiftWidget", "LiveGiftEffectWidget", "FansClubWidget");
    public final C01GW handler$delegate = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(92));
    public final Object token = new Object();
    public final Runnable runnable = new Runnable() { // from class: com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter$runnable$1
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("WidgetLoadScatter@b14f.runnable$1");
            com_bytedance_ies_sdk_widgets_scatter_WidgetLoadScatter$runnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("WidgetLoadScatter@b14f.runnable$1");
        }

        public final void com_bytedance_ies_sdk_widgets_scatter_WidgetLoadScatter$runnable$1__run$___twin___() {
            this.this$0.loadPendingWidget();
        }

        public static void com_bytedance_ies_sdk_widgets_scatter_WidgetLoadScatter$runnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WidgetLoadScatter$runnable$1 widgetLoadScatter$runnable$1) {
            try {
                widgetLoadScatter$runnable$1.com_bytedance_ies_sdk_widgets_scatter_WidgetLoadScatter$runnable$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };

    public static final class Companion {
    }

    public final void onFirstFrame() {
        this.firstFrameReady = true;
    }

    public final void pauseLoading() {
        this.needPause = true;
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadPendingWidget() {
        /*
            r10 = this;
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r9 = com.bytedance.android.livesdk.livesetting.watchlive.LiveWidgetLoadOpt.enable()
            if (r9 == 0) goto L1e
            boolean r0 = r10.needPause
            if (r0 == 0) goto L1e
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L1e
            return
        L1e:
            r4 = 0
        L1f:
            r1 = r4
        L20:
            r2 = 0
            if (r9 == 0) goto L36
            boolean r0 = r10.isAlwaysSplit
            if (r0 != 0) goto L36
            boolean r0 = r10.firstFrameReady
            if (r0 == 0) goto L36
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L63
        L36:
            long r7 = r10.calculateRunTime
            long r5 = com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.maxLoadTimeMs
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6a
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.widgetExecuteTimeRecord
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L9e
            long r0 = r0.longValue()
        L4c:
            long r7 = r7 + r0
            long r5 = com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.maxLoadTimeMs
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L59
            long r5 = r10.calculateRunTime
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 != 0) goto L6a
        L59:
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6a
        L63:
            boolean r0 = r10.shouldSkipByCoreMsgSent
            r1 = 0
            if (r0 == 0) goto L7c
            r10.shouldSkipByCoreMsgSent = r1
        L6a:
            r10.calculateRunTime = r2
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L7b
            java.lang.Runnable r0 = r10.runnable
            r10.insertFrontQueue(r0, r4)
        L7b:
            return
        L7c:
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            java.lang.Object r0 = r0.poll()
            com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo r0 = (com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo) r0
            if (r0 == 0) goto L89
            r10.calculateLoad(r0, r1)
        L89:
            java.util.LinkedList<com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo> r0 = r10.pendingWidgetLoadInfo
            java.lang.Object r0 = r0.peek()
            com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo r0 = (com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo) r0
            if (r0 == 0) goto L1f
            java.lang.Class r0 = r0.getWidget()
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.getSimpleName()
            goto L20
        L9e:
            r0 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.loadPendingWidget():void");
    }

    public final void release() {
        this.pendingWidgetLoadInfo.clear();
        getHandler().removeCallbacksAndMessages(this.token);
        getHandler().removeCallbacks(this.runnable);
    }

    public final void resetTime() {
        this.calculateRunTime = 0L;
    }

    public final void resumeLoading() {
        if ((!this.pendingWidgetLoadInfo.isEmpty()) && this.needPause) {
            this.needPause = false;
            insertFrontQueue(this.runnable, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0094, code lost:
    
        if ((r5 + r0) >= com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.maxLoadTimeMs) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load(com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter.load(com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo):void");
    }

    public final void onCoreMsgSent(boolean z) {
        this.shouldSkipByCoreMsgSent = z;
    }

    public final void setAllPhaseLoaded(boolean z) {
        this.hasAllPhaseLoaded = z;
    }

    public final void setFrameTimeMill(long j) {
        if (j <= 0) {
            return;
        }
        maxLoadTimeMs = j;
    }

    public final void setWhiteList(List<String> list) {
        if (!list.isEmpty()) {
            this.whiteList = list;
        }
    }

    private final void calculateLoad(WidgetLoadInfo widgetLoadInfo, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        widgetLoadInfo.getLoadRunnable().run();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        Class<? extends Widget> widget = widgetLoadInfo.getWidget();
        if (widget != null) {
            widgetExecuteTimeRecord.put(widget.getSimpleName(), Long.valueOf(jCurrentTimeMillis2));
        }
        if (!z || !widgetLoadInfo.isSubWidget()) {
            this.calculateRunTime += jCurrentTimeMillis2;
        }
    }

    private final void insertFrontQueue(Runnable runnable, Object obj) {
        C786410Ut5.LJLIIIL(getHandler(), runnable, obj, 2L);
    }
}
