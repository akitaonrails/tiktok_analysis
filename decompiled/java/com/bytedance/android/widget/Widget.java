package com.bytedance.android.widget;

import X.C20516015Pq;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import Y.ARunnableS117S0100000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubWidgetScatterEnableSetting;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public abstract class Widget implements LifecycleOwner, GenericLifecycleObserver {
    public Object[] args;
    public boolean async;
    public int containerId;
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public boolean hasAttached;
    public boolean isDestroyed;
    public boolean isViewValid;
    public LifecycleObserverDelegate lifecycleObserver;
    public InterfaceC1097170eep widgetCallback;
    public C20516015Pq widgetContainer;
    public List mRegisterEvents = new ArrayList(8);
    public LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public int id = -1;

    public boolean enableAttachOpt() {
        return false;
    }

    public boolean enablePacedLoad() {
        return true;
    }

    public LiveExitRoomRunnableScatter getExitRoomRunnableScatter() {
        return null;
    }

    public int getLayoutId() {
        return 0;
    }

    public int getThemeOverlay(Context context) {
        return 0;
    }

    public void onCreate() {
    }

    public <T> void onCustomInfoCallBack(T t) {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            performCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            performStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            performResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            performPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            performStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            performDestroy();
        }
    }

    public void onStop() {
    }

    public boolean shouldAttach() {
        return true;
    }

    private void notifyOnHide() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.onHide(this);
        }
    }

    private void notifyOnShow() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.onShow(this);
        }
    }

    public LifecycleObserverDelegate getLifecycleObserverDelegate() {
        if (this.lifecycleObserver == null) {
            this.lifecycleObserver = new LifecycleObserverDelegate();
        }
        return this.lifecycleObserver;
    }

    public View getView() {
        View view = this.contentView;
        if (view != null) {
            return view;
        }
        C20516015Pq c20516015Pq = this.widgetContainer;
        return c20516015Pq == null ? this.containerView : c20516015Pq;
    }

    public void onDetachWidget() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null) {
            interfaceC1097170eep.unloadWidget(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void performDestroy() {
        try {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            this.isDestroyed = true;
            this.isViewValid = false;
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null) {
                interfaceC1097170eep.onPreDestroy(this);
            }
            onDestroy();
            if (interfaceC1097170eep != null) {
                interfaceC1097170eep.onPostDestroy(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void performPause() {
        try {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            onPause();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void performResume() {
        try {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            onResume();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void performStart() {
        try {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            onStart();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void performStop() {
        try {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            onStop();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    public Object token() {
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || interfaceC1097170eep.getWidgetManager() == null) {
            return null;
        }
        return this.widgetCallback.getWidgetManager().token;
    }

    private boolean isGone() {
        View view = getView();
        return view != null && view.getVisibility() == 8;
    }

    public void attach() {
        InterfaceC1097170eep interfaceC1097170eep;
        if (!shouldAttach() || (interfaceC1097170eep = this.widgetCallback) == null || this.hasAttached) {
            return;
        }
        int i = this.containerId;
        if (i == -1) {
            interfaceC1097170eep.loadWidget(this);
        } else {
            interfaceC1097170eep.loadWidget(i, this, this.async);
        }
        this.hasAttached = true;
    }

    public int getViewId() {
        View view = getView();
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public void hide() {
        View view = getView();
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view);
        notifyOnHide();
    }

    public boolean isShowing() {
        View view = getView();
        return view != null && view.getVisibility() == 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void performCreate() {
        try {
            if (LiveWidgetProvider.getInstance().isDestoryReInit) {
                if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView && this.isDestroyed) {
                    this.lifecycleRegistry = new LifecycleRegistry(this);
                }
            } else if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                this.lifecycleRegistry = new LifecycleRegistry(this);
            }
            this.isViewValid = true;
            this.isDestroyed = false;
            this.hasAttached = true;
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null) {
                interfaceC1097170eep.onPreCreate(this);
            }
            onCreate();
            if (interfaceC1097170eep != null) {
                interfaceC1097170eep.onPostCreate(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LayeredElementConfiguration.reportException("WidgetException", th);
            throw th;
        }
    }

    public void show() {
        View view = getView();
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
        notifyOnShow();
    }

    public boolean supportBatch() {
        return getLayoutId() != 0;
    }

    public int getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public class LifecycleObserverDelegate implements DefaultLifecycleObserver, GenericLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        public LifecycleObserverDelegate() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            Widget.this.performCreate();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            LiveExitRoomRunnableScatter exitRoomRunnableScatter = Widget.this.getExitRoomRunnableScatter();
            if (exitRoomRunnableScatter != null && (LiveSubWidgetScatterEnableSetting.INSTANCE.enable() || !Widget.this.widgetCallback.isSubWidget())) {
                Widget widget = Widget.this;
                exitRoomRunnableScatter.destroy(new ARunnableS117S0100000_17(widget, 125), widget.getClass().getSimpleName(), false);
            } else {
                Widget.this.performDestroy();
            }
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            Widget.this.performPause();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            Widget.this.performResume();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            Widget.this.performStart();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            Widget.this.performStop();
        }
    }

    public <T> boolean hasRegister(Class<T> cls) {
        return this.mRegisterEvents.contains(cls);
    }

    public <T> void register(T t) {
        this.mRegisterEvents.add(t);
    }

    public void setAlpha(float f) {
        if (getView() != null) {
            C786410Ut5.T4(getView(), f);
        }
    }

    public void setArgs(Object[] objArr) {
        this.args = objArr;
    }

    public void setContentView(View view) {
        this.contentView = view;
        if (view != null) {
            if (isGone()) {
                notifyOnHide();
            } else {
                notifyOnShow();
            }
        }
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setWidgetCallback(InterfaceC1097170eep interfaceC1097170eep) {
        this.widgetCallback = interfaceC1097170eep;
    }

    public void setupContext(Context context) {
        if (WidgetManager.isEnableRecycleWrap(this)) {
            WidgetManager.resetWidgetContext(this, context);
        } else {
            this.context = context;
        }
    }

    public void saveSnapShot(int i, boolean z) {
        this.containerId = i;
        this.async = z;
    }
}
