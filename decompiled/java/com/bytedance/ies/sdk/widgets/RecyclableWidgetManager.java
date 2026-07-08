package com.bytedance.ies.sdk.widgets;

import X.C1124140fMK;
import X.C139Q;
import X.C1C7U;
import X.C20516015Pq;
import X.C2262161DgU;
import X.C475510Ikn;
import X.C494750Jaj;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.InterfaceC2262151DgT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubWidgetScatterEnableSetting;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes36.dex */
public class RecyclableWidgetManager extends com.bytedance.android.widget.WidgetManager {
    public boolean isPreviewWidgetManager;
    public LoadInterceptor loadInterceptor;
    public List<RecyclableWidgetEventListener> mRecyclableWidgetEventListeners;
    public List<SubWidgetManagerListener> mSubWidgetManagerListeners;
    public RecycleSourceInfo recycleSourceInfo;

    /* JADX INFO: loaded from: classes18.dex */
    public interface LoadInterceptor {
        boolean intercept(int i, com.bytedance.android.widget.Widget widget);

        boolean intercept(int i, Class<? extends com.bytedance.android.widget.Widget> cls);
    }

    public void attachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
    }

    @Override // com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDestroy$11() {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.onDestroy$1L");
        super.onDestroy();
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            list.clear();
            this.mRecyclableWidgetEventListeners = null;
        }
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.onDestroy$1L");
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void onDestroy() {
        Runnable runnable = new Runnable() { // from class: X.1Dgl
            @Override // java.lang.Runnable
            public final void run() {
                this.LL.lambda$onDestroy$11();
            }
        };
        if (this.exitRoomRunnableScatter == null || (!LiveSubWidgetScatterEnableSetting.INSTANCE.enable() && this.isSubWidgetManager)) {
            runnable.run();
            return;
        }
        if (this.exitRoomRunnableScatter.enableScatter()) {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.exitRoomRunnableScatter.destroy(runnable, getClass().getSimpleName(), false);
    }

    public RecycleSourceInfo getRecycleSourceInfo() {
        return this.recycleSourceInfo;
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public List<? extends InterfaceC2262151DgT> getWidgetEventListeners() {
        return this.mRecyclableWidgetEventListeners;
    }

    public Set<com.bytedance.android.widget.Widget> getWidgetList() {
        return this.widgets;
    }

    public RecyclableWidgetManager(IWidgetProvider iWidgetProvider) {
        super(iWidgetProvider);
        this.recycleSourceInfo = new RecycleSourceInfo();
        this.widgetCallback = new LiveRecyclableWidget.RecyclableWidgetCallback() { // from class: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.1
            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public final /* synthetic */ void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view) {
                C2262161DgU.LJIIJJI(this, liveRecyclableWidget, viewGroup, view);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public Fragment getFragment() {
                return RecyclableWidgetManager.this.parentFragment;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners() {
                return RecyclableWidgetManager.this.mRecyclableWidgetEventListeners;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public RecycleSourceInfo getRecycleSourceInfo() {
                return RecyclableWidgetManager.this.getRecycleSourceInfo();
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public LifecycleOwner getRootLifeCycleOwner() {
                RecyclableWidgetManager recyclableWidgetManager = RecyclableWidgetManager.this;
                LifecycleOwner lifecycleOwner = recyclableWidgetManager.rootLifeCycleOwner;
                return lifecycleOwner == null ? recyclableWidgetManager.parentFragment : lifecycleOwner;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public List<SubWidgetManagerListener> getSubWidgetManagerListeners() {
                return RecyclableWidgetManager.this.mSubWidgetManagerListeners;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public WidgetLoadScatter getWidgetLoadScatter() {
                return RecyclableWidgetManager.this.scatter;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public boolean isScatterLoadEnable() {
                return RecyclableWidgetManager.this.mEnableScatterLoad;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public boolean isSubWidget() {
                return RecyclableWidgetManager.this.isSubWidgetManager;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public com.bytedance.android.widget.WidgetManager getWidgetManager() {
                return RecyclableWidgetManager.this;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                C20516015Pq c20516015Pq = liveRecyclableWidget.widgetContainer;
                if (c20516015Pq != null) {
                    RecyclableWidgetManager.this.generateNewWidget(c20516015Pq, liveRecyclableWidget.async, liveRecyclableWidget);
                }
                ViewGroup viewGroup = liveRecyclableWidget.containerView;
                if (viewGroup != null) {
                    RecyclableWidgetManager.this.generateOldWidget(viewGroup, liveRecyclableWidget.async, liveRecyclableWidget);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.continueLoadSubWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void loadWidget(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.load(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onHide(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyHide(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onPostCreate(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPostCreate(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onPostDestroy(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPostDestroy(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostInit(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostInit(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostLoad(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostUnload(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onPreCreate(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPreCreate(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onPreDestroy(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPreDestroy(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreInit(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreInit(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreLoad(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreUnload(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void onShow(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyShow(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.mWidgetProvider.recycleRecyclableWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void removeAllMessages(Object obj) {
                FluencyOpt fluencyOpt = RecyclableWidgetManager.this.mFluencyOpt;
                if (fluencyOpt != null) {
                    fluencyOpt.removeMessages(obj);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void unloadWidget(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.unload(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
                C2262161DgU.LJIIJ(this, recyclableWidgetManager, liveWidget);
                List<SubWidgetManagerListener> list = RecyclableWidgetManager.this.mSubWidgetManagerListeners;
                if (list != null) {
                    Iterator<SubWidgetManagerListener> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onDestroySubWidgetManager(RecyclableWidgetManager.this, recyclableWidgetManager, liveWidget);
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
                C2262161DgU.LJJI(this, recyclableWidgetManager, liveWidget);
                List<SubWidgetManagerListener> list = RecyclableWidgetManager.this.mSubWidgetManagerListeners;
                if (list != null) {
                    Iterator<SubWidgetManagerListener> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().onSubWidgetManagerCreated(RecyclableWidgetManager.this, recyclableWidgetManager, liveWidget);
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void attachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
                RecyclableWidgetManager.this.attachContentView(widget, viewGroup, view);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
                return (T) RecyclableWidgetManager.this.load(i, cls, z);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC1097170eep
            public void loadWidget(int i, com.bytedance.android.widget.Widget widget, boolean z) {
                RecyclableWidgetManager.this.load(i, widget, z);
            }
        };
    }

    public static void detachFromParent(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return;
            }
            try {
                C786410Ut5.LJJJLZIJ(view, (ViewGroup) parent);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$10(LiveRecyclableWidget liveRecyclableWidget) {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.load$1L");
        loadInternal(liveRecyclableWidget);
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.load$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadSubWidget$0(LiveRecyclableWidget liveRecyclableWidget) {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.loadSubWidget$1L");
        loadSubWidgetInternal(liveRecyclableWidget);
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.loadSubWidget$1L");
    }

    private <T extends LiveRecyclableWidget> void loadInternal(T t) {
        boolean zContains = this.widgets.contains(t);
        this.widgets.add(t);
        addWidget2Observer(t);
        if (!zContains) {
            onCustomInfoCallBack(t);
        }
    }

    private <T extends LiveRecyclableWidget> void loadSubWidgetInternal(T t) {
        if (!t.shouldAttach()) {
            t.saveSnapShot(true);
            addWidgetAndCallCustomBack(t);
        } else {
            continueLoadSubWidget(t);
        }
    }

    public void addRecyclableWidgetEventListener(RecyclableWidgetEventListener recyclableWidgetEventListener) {
        if (recyclableWidgetEventListener != null) {
            if (this.mRecyclableWidgetEventListeners == null) {
                this.mRecyclableWidgetEventListeners = new ArrayList();
            }
            this.mRecyclableWidgetEventListeners.add(recyclableWidgetEventListener);
        }
    }

    public void addSubWidgetManagerListener(SubWidgetManagerListener subWidgetManagerListener) {
        if (subWidgetManagerListener != null) {
            if (this.mSubWidgetManagerListeners == null) {
                this.mSubWidgetManagerListeners = new ArrayList();
            }
            this.mSubWidgetManagerListeners.add(subWidgetManagerListener);
        }
    }

    public <T extends LiveRecyclableWidget> void continueLoadSubWidget(T t) {
        if (t.isInitialized()) {
            notifyWidgetRequestLoading(t, false);
            continueLoadNew(t, null, t.contentView);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(com.bytedance.android.widget.Widget widget) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        if (loadInterceptor != null && widget != null && loadInterceptor.intercept(-1, widget)) {
            return null;
        }
        super.load(widget);
        return this;
    }

    public void notifyOnPostInit(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPostInit(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPostLoad(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPostUnload(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreInit(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPreInit(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPreLoad(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onPreUnload(this, liveRecyclableWidget);
            }
        }
    }

    public void removeLoadInterceptor(LoadInterceptor loadInterceptor) {
        this.loadInterceptor = null;
    }

    public void removeRecyclableWidgetEventListener(RecyclableWidgetEventListener recyclableWidgetEventListener) {
        List<RecyclableWidgetEventListener> list;
        if (recyclableWidgetEventListener != null && (list = this.mRecyclableWidgetEventListeners) != null) {
            list.remove(recyclableWidgetEventListener);
        }
    }

    public void setLoadInterceptor(LoadInterceptor loadInterceptor) {
        this.loadInterceptor = loadInterceptor;
    }

    public void setRecycleSourceInfo(RecycleSourceInfo recycleSourceInfo) {
        this.recycleSourceInfo = recycleSourceInfo;
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        return (T) load(cls, (Object[]) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$2(LiveRecyclableWidget liveRecyclableWidget, C20516015Pq c20516015Pq) {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.generateNewWidget$1L");
        continueLoadNew(liveRecyclableWidget, c20516015Pq, liveRecyclableWidget.contentView);
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.generateNewWidget$1L");
    }

    public <T extends LiveRecyclableWidget> T createWidget(View view, T t) {
        initWidget(view.getId(), t);
        generateContentWidget(view, t);
        return t;
    }

    public <T extends LiveRecyclableWidget> T generateContentWidget(View view, T t) {
        t.containerView = null;
        if (this.parentFragment == null) {
            return t;
        }
        t.widgetContainer = null;
        com.bytedance.android.widget.WidgetManager.resetViewContext(t, this.context);
        t.setContentView(view);
        boolean zContains = this.widgets.contains(t);
        this.widgets.add(t);
        addWidget2Observer(t);
        if (!zContains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    public <T extends LiveRecyclableWidget> T initWidget(int i, T t) {
        t.setWidgetCallback(this.widgetCallback);
        t.setupContext(this.context);
        t.setId(i);
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls, Object[] objArr) {
        WidgetLoadScatter widgetLoadScatter;
        final T t = (T) initWidget(-1, cls, objArr);
        notifyWidgetPreRequestLoading(t, false);
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: X.1Dgm
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$load$10(t);
                }
            }, cls, this.isSubWidgetManager));
            return t;
        }
        loadInternal((LiveRecyclableWidget) t);
        return t;
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(int i, com.bytedance.android.widget.Widget widget) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        if (loadInterceptor != null && widget != null && loadInterceptor.intercept(i, widget)) {
            return null;
        }
        return super.load(i, widget);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        return (T) load(i, (Class) cls, true);
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls) {
        return (T) load(view, (Class) cls, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNew$1(C20516015Pq c20516015Pq, boolean z, LiveRecyclableWidget liveRecyclableWidget) {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.loadNew$1L");
        generateNewWidget(c20516015Pq, z, liveRecyclableWidget);
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.loadNew$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadOld$7(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, boolean z) {
        C1C7U.LIZ("RecyclableWidgetManager@4ee8.loadOld$1L");
        loadOldInternal(liveRecyclableWidget, viewGroup, z);
        C1C7U.LIZIZ("RecyclableWidgetManager@4ee8.loadOld$1L");
    }

    private <T extends LiveRecyclableWidget> void loadOldInternal(T t, ViewGroup viewGroup, boolean z) {
        if (!t.shouldAttach()) {
            t.saveSnapShot(viewGroup, z);
            addWidgetAndCallCustomBack(t);
        } else {
            generateOldWidget(viewGroup, z, t);
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadNew(com.bytedance.android.widget.Widget widget, C20516015Pq c20516015Pq, View view) {
        if (this.parentFragment == null || widget.context == null) {
            return;
        }
        if (view != null && (c20516015Pq != null || !this.isSubWidgetManager)) {
            detachFromParent(view);
        }
        super.continueLoadNew(widget, c20516015Pq, view);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadOld(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment == null || widget.containerView == null) {
            return;
        }
        if (view != null) {
            detachFromParent(view);
        }
        super.continueLoadOld(widget, viewGroup, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> T generateNewWidget(final X.C20516015Pq r10, boolean r11, final T r12) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.generateNewWidget(X.15Pq, boolean, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget):com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T extends com.bytedance.ies.sdk.widgets.LiveRecyclableWidget> T generateOldWidget(final android.view.ViewGroup r12, boolean r13, final T r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.generateOldWidget(android.view.ViewGroup, boolean, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget):com.bytedance.ies.sdk.widgets.LiveRecyclableWidget");
    }

    public <T extends LiveRecyclableWidget> T getRecyclableWidgetFromCacheOrNew(Class<? extends LiveRecyclableWidget> cls, Object[] objArr, Function0<? extends LiveRecyclableWidget> function0) {
        T t;
        IWidgetProvider iWidgetProvider = this.mWidgetProvider;
        if (iWidgetProvider != null) {
            t = (T) iWidgetProvider.provideWithOutReflect(cls);
            if (t != null) {
                if (objArr != null && objArr.length > 0) {
                    t.initConstructor(objArr);
                }
            }
            return t;
        }
        t = null;
        if (function0 != null) {
            return (T) function0.invoke();
        }
        return t;
    }

    public <T extends LiveRecyclableWidget> T initWidget(int i, Class<T> cls, Object[] objArr) {
        T t = (T) this.mWidgetProvider.provide(cls);
        t.args = objArr;
        t.setWidgetCallback(this.widgetCallback);
        t.setupContext(this.context);
        t.setId(i);
        if (!this.isPreviewWidgetManager || C494750Jaj.LIZ(this.widgetCallback.getRootLifeCycleOwner()) != EnumC494740Jai.WIDGET || this.widgetCallback.getFragment() == null || this.widgetCallback.getRootLifeCycleOwner() == null) {
            t.dataChannel = C475510Ikn.LJ(this.parentFragment);
        }
        com.bytedance.android.widget.WidgetManager.resetViewContext(t, this.context);
        return t;
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(int i, com.bytedance.android.widget.Widget widget, boolean z) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        if (loadInterceptor != null && widget != null && loadInterceptor.intercept(i, widget)) {
            return null;
        }
        super.load(i, widget, z);
        return this;
    }

    public <T extends LiveRecyclableWidget> T loadSubWidget(int i, Class<T> cls, Object[] objArr) {
        WidgetLoadScatter widgetLoadScatter;
        final T t = (T) initWidget(i, cls, objArr);
        notifyWidgetPreRequestLoading(t, false);
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: X.1Dgk
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$loadSubWidget$0(t);
                }
            }, cls, this.isSubWidgetManager));
            return t;
        }
        loadSubWidgetInternal(t);
        return t;
    }

    private <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z) {
        return (T) load(view.getId(), view, cls, z, null);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        return (T) load(i, cls, z, null);
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return of(fragment, view, iWidgetProvider, fluencyOpt, false, false);
    }

    public com.bytedance.android.widget.WidgetManager doLoad(int i, LiveRecyclableWidget liveRecyclableWidget, boolean z, Object[] objArr) {
        liveRecyclableWidget.args = objArr;
        if (objArr != null && objArr.length > 0) {
            liveRecyclableWidget.initConstructor(objArr);
        }
        super.load(i, liveRecyclableWidget, z);
        return this;
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z, Object[] objArr) {
        return (T) load(i, onProvideContainer(i), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T loadNew(final C20516015Pq c20516015Pq, Class<T> cls, final boolean z, Object[] objArr) {
        WidgetLoadScatter widgetLoadScatter;
        final T t = (T) initWidget(c20516015Pq.getId(), cls, objArr);
        notifyWidgetPreRequestLoading(t, z);
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: X.1Dgg
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$loadNew$1(c20516015Pq, z, t);
                }
            }, cls, this.isSubWidgetManager));
            return t;
        }
        generateNewWidget(c20516015Pq, z, t);
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$3(LiveRecyclableWidget liveRecyclableWidget, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (!this.isBatchLoading || !liveRecyclableWidget.supportBatch()) {
            notifyOnPostCreateView(liveRecyclableWidget);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                continueLoadNew(liveRecyclableWidget, c20516015Pq, view);
                resetScatterTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$4(LiveRecyclableWidget liveRecyclableWidget, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (this.isBatchLoading && liveRecyclableWidget.supportBatch()) {
            collectViewNew(liveRecyclableWidget, c20516015Pq, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$5(LiveRecyclableWidget liveRecyclableWidget, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (!this.isBatchLoading || !liveRecyclableWidget.supportBatch()) {
            notifyOnPostCreateView(liveRecyclableWidget);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                continueLoadNew(liveRecyclableWidget, c20516015Pq, view);
                resetScatterTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$6(LiveRecyclableWidget liveRecyclableWidget, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (this.isBatchLoading && liveRecyclableWidget.supportBatch()) {
            collectViewNew(liveRecyclableWidget, c20516015Pq, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateOldWidget$8(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!this.isBatchLoading || !liveRecyclableWidget.supportBatch()) {
            notifyOnPostCreateView(liveRecyclableWidget);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                continueLoadOld(liveRecyclableWidget, viewGroup, view);
                resetScatterTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateOldWidget$9(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (this.isBatchLoading && liveRecyclableWidget.supportBatch()) {
            collectViewOld(liveRecyclableWidget, viewGroup, view);
        }
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        return of(fragment, lifecycleOwner, view, iWidgetProvider, fluencyOpt, false, false);
    }

    public <T extends LiveRecyclableWidget> T load(int i, View view, Class<T> cls, boolean z, Object[] objArr) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        com.bytedance.android.widget.Widget widget = null;
        if ((loadInterceptor != null && loadInterceptor.intercept(i, (Class<? extends com.bytedance.android.widget.Widget>) cls)) || this.parentFragment == null) {
            return null;
        }
        if (view == null && this.isSubWidgetManager) {
            return (T) loadSubWidget(i, cls, objArr);
        }
        if (view instanceof C20516015Pq) {
            return (T) loadNew((C20516015Pq) view, cls, z, objArr);
        }
        boolean z2 = false;
        for (com.bytedance.android.widget.Widget widget2 : this.widgets) {
            if (widget2.getClass() == cls) {
                z2 = true;
                widget = widget2;
            }
        }
        if (view != null && z2 && !C1124140fMK.LIZIZ(cls)) {
            unload(widget);
            return (T) load(view.getId(), cls, z, objArr);
        }
        if (checkWidgetContainer() && view != null && C1124140fMK.LIZJ(this.context) && !C1124140fMK.LIZIZ(cls)) {
            throw new C139Q((Class<? extends com.bytedance.android.widget.Widget>) cls);
        }
        return (T) loadOld(i, (ViewGroup) view, cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T loadOld(int i, final ViewGroup viewGroup, Class<T> cls, final boolean z, Object[] objArr) {
        WidgetLoadScatter widgetLoadScatter;
        final T t = (T) initWidget(i, cls, objArr);
        notifyWidgetPreRequestLoading(t, z);
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: X.1DDf
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$loadOld$7(t, viewGroup, z);
                }
            }, cls, this.isSubWidgetManager));
            return t;
        }
        loadOldInternal(t, viewGroup, z);
        return t;
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z) {
        return of(fragment, view, iWidgetProvider, fluencyOpt, z, false);
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z, boolean z2) {
        Context context;
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        if (z) {
            context = view.getContext();
        } else {
            context = fragment.getContext();
        }
        recyclableWidgetManager.config(false, fragment, view, context, fluencyOpt, z2);
        return recyclableWidgetManager;
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z) {
        return of(fragment, lifecycleOwner, view, iWidgetProvider, fluencyOpt, z, false);
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z, boolean z2) {
        Context contextRequireContext;
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        if (z) {
            contextRequireContext = view.getContext();
        } else {
            contextRequireContext = fragment.requireContext();
        }
        recyclableWidgetManager.config(false, fragment, view, contextRequireContext, fluencyOpt, z2);
        recyclableWidgetManager.rootLifeCycleOwner = lifecycleOwner;
        return recyclableWidgetManager;
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z, boolean z2, long j) {
        return of(fragment, view, iWidgetProvider, fluencyOpt, z, z2);
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z, boolean z2, long j) {
        return of(fragment, lifecycleOwner, view, iWidgetProvider, fluencyOpt, z, z2);
    }
}
