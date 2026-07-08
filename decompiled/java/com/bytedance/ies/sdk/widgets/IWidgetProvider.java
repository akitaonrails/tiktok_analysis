package com.bytedance.ies.sdk.widgets;

import android.content.Context;
import com.bytedance.ies.sdk.widgets.LiveWidgetPriorityProvider;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public interface IWidgetProvider {
    void cancelDelayedClear();

    void clear(LiveWidgetPriorityProvider.Priority priority);

    void clearAll();

    void clearNonWhitelist(Function1<IRecyclableWidget, Boolean> function1);

    void clearWidgetCache(Class<? extends IRecyclableWidget> cls);

    boolean hasMarked(Class<IRecyclableWidget> cls);

    boolean isEnablePriority();

    boolean isPriority(Class<? extends LiveRecyclableWidget> cls);

    void prepareWhitelistWidgetsForReuse(Context context);

    <T extends IRecyclableWidget> T provide(Class<T> cls);

    <T extends IRecyclableWidget> T provideWithOutReflect(Class<T> cls);

    void recycleRecyclableWidget(IRecyclableWidget iRecyclableWidget);

    void resetWidgetsViewContext(Context context);

    void scheduleDelayedClear(long j);
}
