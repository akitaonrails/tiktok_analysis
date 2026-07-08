package com.bytedance.ies.sdk.widgets;

import X.C469240Iag;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveWidgetProviderProxy implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile IWidgetProvider sInstance;

    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final IWidgetProvider getInstance() {
            if (LiveWidgetProviderProxy.sInstance == null) {
                synchronized (LiveWidgetProviderProxy.class) {
                    try {
                        if (LiveWidgetProviderProxy.sInstance == null) {
                            LiveWidgetProviderProxy.sInstance = LiveWidgetProvider.Companion.getInstance();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            IWidgetProvider iWidgetProvider = LiveWidgetProviderProxy.sInstance;
            if (iWidgetProvider != null) {
                return iWidgetProvider;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final IWidgetProvider getInstance() {
        return Companion.getInstance();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void cancelDelayedClear() {
        C469240Iag.LIZ(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clear(LiveWidgetPriorityProvider.Priority priority) {
        C469240Iag.LIZIZ(this, priority);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clearNonWhitelist(Function1 function1) {
        C469240Iag.LIZJ(this, function1);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void prepareWhitelistWidgetsForReuse(Context context) {
        C469240Iag.LJI(this, context);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void scheduleDelayedClear(long j) {
        C469240Iag.LJIIIIZZ(this, j);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearAll() {
        Companion.getInstance().clearAll();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isEnablePriority() {
        return Companion.getInstance().isEnablePriority();
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
        Companion.getInstance().clearWidgetCache(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> cls) {
        return Companion.getInstance().hasMarked(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean isPriority(Class<? extends LiveRecyclableWidget> cls) {
        return Companion.getInstance().isPriority(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        return (T) Companion.getInstance().provide(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        return (T) Companion.getInstance().provide(cls);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
        Companion.getInstance().recycleRecyclableWidget(iRecyclableWidget);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
        Companion.getInstance().resetWidgetsViewContext(context);
    }
}
