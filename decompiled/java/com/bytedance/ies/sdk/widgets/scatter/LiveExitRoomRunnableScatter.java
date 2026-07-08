package com.bytedance.ies.sdk.widgets.scatter;

import X.C01GW;
import X.C13LP;
import X.C13LQ;
import X.C1C7U;
import X.C2179971ATj;
import X.C452501pT;
import X.C786410Ut5;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePwrOptV3Setting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveExitRoomRunnableScatter {
    public static boolean isCurrentRoomShown;
    public static boolean isScrolling;
    public long alreadySpentMs;
    public boolean hasOrientationChanged;
    public boolean hasUnexpectedUnloadCase;
    public boolean isDestroying;
    public boolean isDrawAction;
    public boolean isFastScroll;
    public boolean isPortrait;
    public volatile boolean shouldSkipByCoreMsgSent;
    public long startDelayMs;
    public static final Companion Companion = new Companion();
    public static final long DESTROY_TIMEOUT_MS = LivePwrOptV3Setting.getBatchMs();
    public static final long INSERT_TO_FRONT_AT_TIME = 2;
    public static final long INSERT_TO_FRONT_AT_TIME_V2 = LivePwrOptV3Setting.getLoopInterval();
    public static final Set<String> whiteListWidgets = C13LQ.LJLIIL(new String[]{"LiveRoomUserInfoWidget", "PortraitShortTouchPreviewWidget", "PortraitShortTouchPreviewWidgetV2", "ShortTouchViewWidgetV2", "PortraitShortTouchViewWidget", "MiddleTouchWidget", "TopRightBannerWidget", "DonationStickerWrapperWidget", "RoomStickerWrapperWidget", "HighPrioritySlotWidget"});
    public boolean isResumed = true;
    public final LinkedList<Runnable> pendingDestroyRunnable = new LinkedList<>();
    public boolean enableScatter = LivePwrOptV3Setting.enableBatchOpt();
    public final C01GW handler$delegate = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(102));
    public final Object token = new Object();
    public boolean isFirstDestructionCycle = true;

    public static final void setCurrentRoomShown(boolean z) {
        Companion.setCurrentRoomShown(z);
    }

    public static final void setScrolling(boolean z) {
        Companion.setScrolling(z);
    }

    public final synchronized void destroyInBatch() {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (!this.pendingDestroyRunnable.isEmpty()) {
            if (SystemClock.elapsedRealtime() - jElapsedRealtime >= DESTROY_TIMEOUT_MS) {
                if (this.startDelayMs == 0) {
                    this.startDelayMs = SystemClock.elapsedRealtime();
                }
                if (SystemClock.elapsedRealtime() - this.startDelayMs <= LivePwrOptV3Setting.getMaxDelayMs()) {
                    scheduleNextDestructionCycle();
                    z = true;
                    break;
                }
            }
            Runnable runnablePoll = this.pendingDestroyRunnable.poll();
            if (runnablePoll == null) {
                break;
            }
            try {
                runnablePoll.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        z = false;
        if ((!this.pendingDestroyRunnable.isEmpty()) && !z) {
            scheduleNextDestructionCycle();
        }
    }

    public final synchronized void destroyInBatchV2() {
        Runnable runnablePoll;
        Runnable runnablePoll2;
        Runnable runnablePoll3;
        if (this.pendingDestroyRunnable.isEmpty()) {
            return;
        }
        int i = 0;
        if (this.shouldSkipByCoreMsgSent && !this.hasUnexpectedUnloadCase) {
            this.shouldSkipByCoreMsgSent = false;
            scheduleNextDestructionCycleV2();
            return;
        }
        if (this.isFastScroll || this.hasUnexpectedUnloadCase) {
            while ((!this.pendingDestroyRunnable.isEmpty()) && (runnablePoll = this.pendingDestroyRunnable.poll()) != null) {
                try {
                    runnablePoll.run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            resetForNewSwipe();
            return;
        }
        if (this.isFirstDestructionCycle) {
            this.isFirstDestructionCycle = false;
            int size = (this.pendingDestroyRunnable.size() + 1) / 2;
            if (size < 1) {
                size = 1;
            }
            int firstBatchSize = LivePwrOptV3Setting.getFirstBatchSize();
            if (firstBatchSize > 0) {
                size = firstBatchSize;
            }
            while ((!this.pendingDestroyRunnable.isEmpty()) && (runnablePoll3 = this.pendingDestroyRunnable.poll()) != null) {
                try {
                    runnablePoll3.run();
                    i++;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                if (i >= size) {
                    break;
                }
            }
            if (!this.pendingDestroyRunnable.isEmpty()) {
                scheduleNextDestructionCycleV2();
            } else {
                resetForNewSwipe();
            }
            return;
        }
        if (isScrolling) {
            scheduleNextDestructionCycleV2();
            return;
        }
        if (isCurrentRoomShown) {
            while ((!this.pendingDestroyRunnable.isEmpty()) && (runnablePoll2 = this.pendingDestroyRunnable.poll()) != null) {
                try {
                    runnablePoll2.run();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            resetForNewSwipe();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            if (!(!this.pendingDestroyRunnable.isEmpty())) {
                break;
            }
            if (SystemClock.elapsedRealtime() - jElapsedRealtime >= DESTROY_TIMEOUT_MS) {
                if (this.startDelayMs == 0) {
                    this.startDelayMs = SystemClock.elapsedRealtime();
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                this.alreadySpentMs = jElapsedRealtime2;
                if (jElapsedRealtime2 <= LivePwrOptV3Setting.getMaxDelayMs()) {
                    scheduleNextDestructionCycleV2();
                    i = 1;
                    break;
                }
            }
            Runnable runnablePoll4 = this.pendingDestroyRunnable.poll();
            if (runnablePoll4 == null) {
                break;
            }
            try {
                runnablePoll4.run();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        if ((!this.pendingDestroyRunnable.isEmpty()) && i == 0) {
            scheduleNextDestructionCycleV2();
        }
        if (this.pendingDestroyRunnable.isEmpty()) {
            resetForNewSwipe();
        }
        return;
    }

    public final void onOrientationChange2Landscape() {
        this.hasOrientationChanged = true;
    }

    public final synchronized void release() {
        if (!this.enableScatter || this.pendingDestroyRunnable.isEmpty()) {
            return;
        }
        this.isResumed = false;
        Iterator<Runnable> it2 = this.pendingDestroyRunnable.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.pendingDestroyRunnable.clear();
        getHandler().removeCallbacksAndMessages(null);
    }

    public final void resetForNewSwipe() {
        this.isFirstDestructionCycle = true;
        this.startDelayMs = 0L;
        this.isDestroying = false;
        this.hasUnexpectedUnloadCase = false;
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    private final void scheduleNextDestructionCycle() {
        if (this.pendingDestroyRunnable.isEmpty()) {
            return;
        }
        C786410Ut5.LJLIIIL(getHandler(), new Runnable() { // from class: com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter.scheduleNextDestructionCycle.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveExitRoomRunnableScatter@1bae.scheduleNextDestructionCycle$1");
                com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycle$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("LiveExitRoomRunnableScatter@1bae.scheduleNextDestructionCycle$1");
            }

            public final void com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycle$1__run$___twin___() {
                LiveExitRoomRunnableScatter.this.destroyInBatch();
            }

            public static void com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycle$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycle$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, this.token, INSERT_TO_FRONT_AT_TIME);
    }

    private final void scheduleNextDestructionCycleV2() {
        if (this.pendingDestroyRunnable.isEmpty()) {
            return;
        }
        C786410Ut5.LJLIIL(INSERT_TO_FRONT_AT_TIME_V2, getHandler(), new Runnable() { // from class: com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter.scheduleNextDestructionCycleV2.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LiveExitRoomRunnableScatter@1bae.scheduleNextDestructionCycleV2$1");
                com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycleV2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("LiveExitRoomRunnableScatter@1bae.scheduleNextDestructionCycleV2$1");
            }

            public final void com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycleV2$1__run$___twin___() {
                LiveExitRoomRunnableScatter.this.destroyInBatchV2();
            }

            public static void com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycleV2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325511 runnableC2325511) {
                try {
                    runnableC2325511.com_bytedance_ies_sdk_widgets_scatter_LiveExitRoomRunnableScatter$scheduleNextDestructionCycleV2$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    public final boolean isInDestructionCycle() {
        return !this.pendingDestroyRunnable.isEmpty();
    }

    public final boolean enableScatter() {
        return this.enableScatter;
    }

    public final long getStartDelayMs() {
        return this.startDelayMs;
    }

    public final long getUnloadSpentMs() {
        return this.alreadySpentMs;
    }

    public static final class Companion {
        public final void setCurrentRoomShown(boolean z) {
            LiveExitRoomRunnableScatter.isCurrentRoomShown = z;
        }

        public final void setScrolling(boolean z) {
            LiveExitRoomRunnableScatter.isScrolling = z;
        }
    }

    public final void onCoreMsgSent(boolean z) {
        this.shouldSkipByCoreMsgSent = z;
    }

    public final void setIsDrawActionExcludeFirstRoom(boolean z) {
        this.isDrawAction = z;
    }

    public final void setIsFastScroll(boolean z) {
        this.isFastScroll = z;
    }

    public final void setIsPortrait(boolean z) {
        this.isPortrait = z;
    }

    public final void setScatterEnable(boolean z) {
        this.enableScatter = z;
    }

    public final void setStartDelayMs(long j) {
        this.startDelayMs = j;
    }

    private final synchronized void destroyScatter(Runnable runnable, boolean z) {
        if (this.isDestroying) {
            this.hasUnexpectedUnloadCase = true;
            if (LivePwrOptV3Setting.enableV2()) {
                destroyInBatchV2();
                getHandler().removeCallbacksAndMessages(null);
            }
        }
        this.pendingDestroyRunnable.add(runnable);
        if (z) {
            this.isDestroying = true;
            if (LivePwrOptV3Setting.enableV2()) {
                destroyInBatchV2();
            } else {
                destroyInBatch();
            }
        }
    }

    public final void destroy(Runnable runnable, String str, boolean z) {
        if (this.enableScatter && this.isResumed && this.isPortrait && this.isDrawAction && !this.hasOrientationChanged && !C13LP.LJJJJ(str, whiteListWidgets) && !C13LP.LJJJJ(str, LivePwrOptV3Setting.getDynamicWhiteList())) {
            destroyScatter(runnable, z);
        } else {
            runnable.run();
        }
    }
}
