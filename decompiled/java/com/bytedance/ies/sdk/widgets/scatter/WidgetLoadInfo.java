package com.bytedance.ies.sdk.widgets.scatter;

import com.bytedance.android.widget.Widget;

/* JADX INFO: loaded from: classes32.dex */
public final class WidgetLoadInfo {
    public final boolean isSubWidget;
    public final Runnable loadRunnable;
    public final Class<? extends Widget> widget;

    public final Runnable getLoadRunnable() {
        return this.loadRunnable;
    }

    public final Class<? extends Widget> getWidget() {
        return this.widget;
    }

    public final boolean isSubWidget() {
        return this.isSubWidget;
    }

    public WidgetLoadInfo(Runnable runnable, Class<? extends Widget> cls, boolean z) {
        this.loadRunnable = runnable;
        this.widget = cls;
        this.isSubWidget = z;
    }
}
