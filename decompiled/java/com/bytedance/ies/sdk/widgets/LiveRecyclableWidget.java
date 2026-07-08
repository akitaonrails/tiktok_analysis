package com.bytedance.ies.sdk.widgets;

import X.C1097160eeo;
import X.C1124140fMK;
import X.C20516015Pq;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LiveRecyclableWidget extends LiveWidget implements IRecyclableWidget {
    public boolean crossActivityReuse;
    public boolean initialized;
    public RecyclableWidgetCallback recyclableWidgetCallback;
    public boolean shouldLoadSubWidget;

    public interface RecyclableWidgetCallback extends InterfaceC1097170eep {
        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void attachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view);

        @Override // X.InterfaceC1097170eep
        /* synthetic */ Fragment getFragment();

        List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners();

        RecycleSourceInfo getRecycleSourceInfo();

        @Override // X.InterfaceC1097170eep
        /* synthetic */ LifecycleOwner getRootLifeCycleOwner();

        List<SubWidgetManagerListener> getSubWidgetManagerListeners();

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ WidgetLoadScatter getWidgetLoadScatter();

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ com.bytedance.android.widget.WidgetManager getWidgetManager();

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ boolean isScatterLoadEnable();

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ boolean isSubWidget();

        <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z);

        void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC1097170eep
        /* synthetic */ void loadWidget(int i, com.bytedance.android.widget.Widget widget, boolean z);

        @Override // X.InterfaceC1097170eep
        /* synthetic */ void loadWidget(com.bytedance.android.widget.Widget widget);

        void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget);

        void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onHide(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onPostCreate(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onPostDestroy(com.bytedance.android.widget.Widget widget);

        void onPostInit(LiveRecyclableWidget liveRecyclableWidget);

        void onPostLoad(LiveRecyclableWidget liveRecyclableWidget);

        void onPostUnload(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onPreCreate(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onPreDestroy(com.bytedance.android.widget.Widget widget);

        void onPreInit(LiveRecyclableWidget liveRecyclableWidget);

        void onPreLoad(LiveRecyclableWidget liveRecyclableWidget);

        void onPreUnload(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void onShow(com.bytedance.android.widget.Widget widget);

        void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget);

        void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC1097170eep
        /* bridge */ /* synthetic */ void removeAllMessages(Object obj);

        @Override // X.InterfaceC1097170eep
        /* synthetic */ void unloadWidget(com.bytedance.android.widget.Widget widget);
    }

    public static class RecyclableWidgetCallbackWrapper extends C1097160eeo implements RecyclableWidgetCallback {
        public final RecyclableWidgetCallback callback;

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners() {
            return this.callback.getRecyclableWidgetEventListeners();
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public RecycleSourceInfo getRecycleSourceInfo() {
            return this.callback.getRecycleSourceInfo();
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public List<SubWidgetManagerListener> getSubWidgetManagerListeners() {
            return this.callback.getSubWidgetManagerListeners();
        }

        @Override // X.C1097160eeo, X.InterfaceC1097170eep
        public WidgetLoadScatter getWidgetLoadScatter() {
            return this.callback.getWidgetLoadScatter();
        }

        @Override // X.C1097160eeo, X.InterfaceC1097170eep
        public boolean isScatterLoadEnable() {
            return this.callback.isScatterLoadEnable();
        }

        @Override // X.C1097160eeo, X.InterfaceC1097170eep
        public boolean isSubWidget() {
            return this.callback.isSubWidget();
        }

        public RecyclableWidgetCallback getCallback() {
            return this.callback;
        }

        public RecyclableWidgetCallbackWrapper(RecyclableWidgetCallback recyclableWidgetCallback) {
            super(recyclableWidgetCallback);
            this.callback = recyclableWidgetCallback;
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.loadRecyclableWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.loadSubWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostInit(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostInit(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostLoad(liveRecyclableWidget);
        }

        public void onPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostUnload(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreInit(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreInit(liveRecyclableWidget);
        }

        public void onPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreLoad(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreUnload(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.recycleRecyclableWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
            this.callback.onDestroySubWidgetManager(recyclableWidgetManager, liveWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
            this.callback.onSubWidgetManagerCreated(recyclableWidgetManager, liveWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
            return (T) this.callback.load(i, cls, z);
        }

        public void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view) {
            this.callback.onDetachContentView(liveRecyclableWidget, viewGroup, view);
        }
    }

    public int getPoolCapacity() {
        return 0;
    }

    public void initConstructor(Object... objArr) {
    }

    public boolean needRecycle() {
        return true;
    }

    public abstract void onInit(Object[] objArr);

    public abstract void onLoad(Object[] objArr);

    public void onPostUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void onUnload();

    public void resetAfterLeaveLive() {
        this.containerView = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void resetInternal() {
        this.hasAttached = false;
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    public RecycleSourceInfo getRecycleSourceInfo() {
        RecyclableWidgetCallback recyclableWidgetCallback = this.recyclableWidgetCallback;
        return (recyclableWidgetCallback == null || recyclableWidgetCallback.getRecycleSourceInfo() == null) ? new RecycleSourceInfo() : this.recyclableWidgetCallback.getRecycleSourceInfo();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() throws Exception {
        RecyclableWidgetCallback recyclableWidgetCallback = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback != null) {
            recyclableWidgetCallback.onDetachContentView(this, this.containerView, this.contentView);
        }
        try {
            RecyclableWidgetCallback recyclableWidgetCallback2 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback2 != null) {
                recyclableWidgetCallback2.onPreUnload(this);
            }
            onUnload();
            onPostUnload();
            RecyclableWidgetCallback recyclableWidgetCallback3 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback3 != null) {
                recyclableWidgetCallback3.onPostUnload(this);
            }
            if (this.recyclableWidgetCallback != null && needRecycle() && LiveWidgetProvider.getInstance().isValid) {
                this.recyclableWidgetCallback.recycleRecyclableWidget(this);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LayeredElementConfiguration.reportException("LiveRecyclableWidget", e);
            if (C1124140fMK.LIZJ(this.context)) {
                throw e;
            }
        }
        super.onDestroy();
        this.containerView = null;
        this.recyclableWidgetCallback = null;
        this.dataChannel = null;
        setWidgetCallback(null);
        this.args = null;
        setCrossActivityReuse(false);
        if (com.bytedance.android.widget.WidgetManager.isEnableRecycleWrap(this)) {
            return;
        }
        this.context = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public void attach() {
        RecyclableWidgetCallback recyclableWidgetCallback;
        if (!shouldAttach() || this.widgetCallback == null || this.hasAttached || (recyclableWidgetCallback = this.recyclableWidgetCallback) == null) {
            return;
        }
        if (this.shouldLoadSubWidget) {
            recyclableWidgetCallback.loadSubWidget(this);
        }
        if (this.widgetContainer != null) {
            this.recyclableWidgetCallback.loadRecyclableWidget(this);
        }
        if (this.containerView != null) {
            this.recyclableWidgetCallback.loadRecyclableWidget(this);
        }
        this.hasAttached = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep instanceof RecyclableWidgetCallback) {
            this.recyclableWidgetCallback = (RecyclableWidgetCallback) interfaceC1097170eep;
        }
        if (!this.initialized) {
            RecyclableWidgetCallback recyclableWidgetCallback = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback != null) {
                recyclableWidgetCallback.onPreInit(this);
            }
            onInit(this.args);
            com.bytedance.android.widget.WidgetManager.isEnableRecycleWrap(this);
            RecyclableWidgetCallback recyclableWidgetCallback2 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback2 != null) {
                recyclableWidgetCallback2.onPostInit(this);
            }
            this.initialized = true;
        }
        RecyclableWidgetCallback recyclableWidgetCallback3 = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback3 != null) {
            recyclableWidgetCallback3.onPreLoad(this);
        }
        onLoad(this.args);
        RecyclableWidgetCallback recyclableWidgetCallback4 = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback4 != null) {
            recyclableWidgetCallback4.onPostLoad(this);
        }
    }

    public void resetAnim() {
        if (getView() != null) {
            C786410Ut5.T4(getView(), 1.0f);
            show();
        }
    }

    public boolean isCrossActivityReuse() {
        return this.crossActivityReuse;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final boolean isInitialized() {
        return this.initialized;
    }

    public void saveSnapShot(boolean z) {
        this.shouldLoadSubWidget = z;
    }

    public void setCrossActivityReuse(boolean z) {
        this.crossActivityReuse = z;
    }

    public void saveSnapShot(C20516015Pq c20516015Pq, boolean z) {
        this.widgetContainer = c20516015Pq;
        this.async = z;
    }

    public void saveSnapShot(ViewGroup viewGroup, boolean z) {
        this.containerView = viewGroup;
        this.async = z;
    }
}
