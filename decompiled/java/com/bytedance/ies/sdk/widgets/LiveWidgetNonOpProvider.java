package com.bytedance.ies.sdk.widgets;

import X.C469240Iag;
import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveWidgetNonOpProvider implements IWidgetProvider {
    public static final Companion Companion = new Companion();
    public static volatile LiveWidgetNonOpProvider sInstance;

    public static final class Companion {
        public static /* synthetic */ void getInstance$annotations() {
        }

        public final LiveWidgetNonOpProvider getInstance() {
            if (LiveWidgetNonOpProvider.sInstance == null) {
                synchronized (LiveWidgetNonOpProvider.class) {
                    try {
                        if (LiveWidgetNonOpProvider.sInstance == null) {
                            LiveWidgetNonOpProvider.sInstance = new LiveWidgetNonOpProvider();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return LiveWidgetNonOpProvider.sInstance;
        }
    }

    public static final LiveWidgetNonOpProvider getInstance() {
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
    public void clearAll() {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void clearNonWhitelist(Function1 function1) {
        C469240Iag.LIZJ(this, function1);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void clearWidgetCache(Class<? extends IRecyclableWidget> cls) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public boolean hasMarked(Class<IRecyclableWidget> cls) {
        return false;
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
    public final /* synthetic */ void prepareWhitelistWidgetsForReuse(Context context) {
        C469240Iag.LJI(this, context);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls) {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public void resetWidgetsViewContext(Context context) {
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public final /* synthetic */ void scheduleDelayedClear(long j) {
        C469240Iag.LJIIIIZZ(this, j);
    }

    @Override // com.bytedance.ies.sdk.widgets.IWidgetProvider
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
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
}
