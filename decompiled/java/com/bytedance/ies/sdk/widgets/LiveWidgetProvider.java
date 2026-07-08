package com.bytedance.ies.sdk.widgets;

import X.C19719612Di;
import X.C1C7U;
import X.C2179971ATj;
import X.C469240Iag;
import X.C786410Ut5;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetQuickReturnReuseSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveWidgetProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetProvider sInstance;
    public boolean enableWidgetCrossContextReuse;
    public boolean isDestoryReInit;
    public boolean isEnablePriorityPreload;
    public boolean isRecycleWidgetContentView;
    public boolean isValid;
    public final Handler mainHandler = new BPEAHandler(Looper.getMainLooper());
    public final Runnable delayedClearRunnable = new Runnable() { // from class: com.bytedance.ies.sdk.widgets.LiveWidgetProvider$delayedClearRunnable$1
        @Override // java.lang.Runnable
        public final void run() {
            C1C7U.LIZ("LiveWidgetProvider@1d85.delayedClearRunnable$1");
            com_bytedance_ies_sdk_widgets_LiveWidgetProvider$delayedClearRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            C1C7U.LIZIZ("LiveWidgetProvider@1d85.delayedClearRunnable$1");
        }

        public final void com_bytedance_ies_sdk_widgets_LiveWidgetProvider$delayedClearRunnable$1__run$___twin___() {
            this.this$0.clearAll();
        }

        public static void com_bytedance_ies_sdk_widgets_LiveWidgetProvider$delayedClearRunnable$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(LiveWidgetProvider$delayedClearRunnable$1 liveWidgetProvider$delayedClearRunnable$1) {
            try {
                liveWidgetProvider$delayedClearRunnable$1.com_bytedance_ies_sdk_widgets_LiveWidgetProvider$delayedClearRunnable$1__run$___twin___();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    };
    public final RecycledLiveWidgetPool mRecycledViewPool = new RecycledLiveWidgetPool();

    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetProvider getInstance() {
            if (LiveWidgetProvider.sInstance == null) {
                synchronized (LiveWidgetProvider.class) {
                    try {
                        if (LiveWidgetProvider.sInstance == null) {
                            LiveWidgetProvider.sInstance = new LiveWidgetProvider();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return LiveWidgetProvider.sInstance;
        }
    }

    public static final class RecycledLiveWidgetPool {
        public static final Companion Companion = new Companion();
        public static final int DEFAULT_MAX_SCRAP = 3;
        public final HashMap<Class<? super IRecyclableWidget>, ScrapData> mScrap = new HashMap<>();

        public static final class Companion {
        }

        public static final class ScrapData {
            public final int mMaxScrap;
            public final ArrayList<IRecyclableWidget> mScrapHeap;

            public ScrapData() {
                int i = RecycledLiveWidgetPool.DEFAULT_MAX_SCRAP;
                this.mScrapHeap = new ArrayList<>(i);
                this.mMaxScrap = i;
            }

            public final int getMMaxScrap() {
                return this.mMaxScrap;
            }

            public final ArrayList<IRecyclableWidget> getMScrapHeap() {
                return this.mScrapHeap;
            }
        }

        public final void clear() {
            Iterator<T> it2 = this.mScrap.values().iterator();
            while (it2.hasNext()) {
                ((ScrapData) it2.next()).getMScrapHeap().clear();
            }
        }

        private final void forEachWidget(Function1<? super IRecyclableWidget, Unit> function1) {
            Iterator<T> it2 = this.mScrap.values().iterator();
            while (it2.hasNext()) {
                Iterator<IRecyclableWidget> it3 = ((ScrapData) it2.next()).getMScrapHeap().iterator();
                while (it3.hasNext()) {
                    function1.invoke(it3.next());
                }
            }
        }

        public final void clearNonWhitelist(Function1<? super IRecyclableWidget, Boolean> function1) {
            Iterator<T> it2 = this.mScrap.values().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJIIJ(((ScrapData) it2.next()).getMScrapHeap(), function1, true);
            }
        }

        public final void clearWidgetCache(Class<IRecyclableWidget> cls) {
            if (cls != null) {
                getScrapDataForType(cls).getMScrapHeap().clear();
            }
        }

        public final IRecyclableWidget getRecycledView(Class<? super IRecyclableWidget> cls) {
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData != null && (!scrapData.getMScrapHeap().isEmpty())) {
                return (IRecyclableWidget) ListProtector.remove(scrapData.getMScrapHeap(), r1.size() - 1);
            }
            return null;
        }

        public final int getRecycledViewCount(Class<? super IRecyclableWidget> cls) {
            return getScrapDataForType(cls).getMScrapHeap().size();
        }

        public final ScrapData getScrapDataForType(Class<? super IRecyclableWidget> cls) {
            ScrapData scrapData = this.mScrap.get(cls);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                this.mScrap.put(cls, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        public final void prepareWhitelistWidgetsForReuse(Context context) {
            forEachWidget(new AwS586S0100000_7(context, 194));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void putRecycledView(IRecyclableWidget iRecyclableWidget) {
            Class<?> cls = iRecyclableWidget.getClass();
            ArrayList<IRecyclableWidget> mScrapHeap = getScrapDataForType(cls).getMScrapHeap();
            if (this.mScrap.get(cls).getMMaxScrap() <= mScrapHeap.size()) {
                return;
            }
            iRecyclableWidget.resetInternal();
            mScrapHeap.add(iRecyclableWidget);
        }
    }

    public static final LiveWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clear(LiveWidgetPriorityProvider.Priority priority) {
        C469240Iag.LIZIZ(this, priority);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ boolean isPriority(Class cls) {
        return C469240Iag.LJFF(this, cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void cancelDelayedClear() {
        this.mainHandler.removeCallbacks(this.delayedClearRunnable);
    }

    public final boolean isQuickReturnReuseEnabled() {
        return LiveWidgetQuickReturnReuseSetting.INSTANCE.enable();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        cancelDelayedClear();
        this.mRecycledViewPool.clear();
    }

    public final boolean getEnableWidgetCrossContextReuse() {
        return this.enableWidgetCrossContextReuse;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearNonWhitelist(Function1<? super IRecyclableWidget, Boolean> function1) {
        this.mRecycledViewPool.clearNonWhitelist(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        RecycledLiveWidgetPool recycledLiveWidgetPool = this.mRecycledViewPool;
        if (cls == null) {
            cls = null;
        }
        recycledLiveWidgetPool.clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> cls) {
        if (this.mRecycledViewPool.getRecycledViewCount(cls) > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void prepareWhitelistWidgetsForReuse(Context context) {
        this.mRecycledViewPool.prepareWhitelistWidgetsForReuse(context);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        T t = (T) this.mRecycledViewPool.getRecycledView(cls);
        if (t == null) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        }
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        T t = (T) this.mRecycledViewPool.getRecycledView(cls);
        if (!(t instanceof IRecyclableWidget)) {
            return null;
        }
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        this.mRecycledViewPool.putRecycledView(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void scheduleDelayedClear(long j) {
        cancelDelayedClear();
        if (j <= 0) {
            this.delayedClearRunnable.run();
        } else {
            C786410Ut5.LJLIIL(j, this.mainHandler, this.delayedClearRunnable);
        }
    }

    public final void setEnableWidgetCrossContextReuse(boolean z) {
        this.enableWidgetCrossContextReuse = z;
    }
}
