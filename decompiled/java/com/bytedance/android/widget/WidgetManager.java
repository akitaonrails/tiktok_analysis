package com.bytedance.android.widget;

import X.C00GI;
import X.C0J4A;
import X.C0J4B;
import X.C0ULM;
import X.C1085920eMg;
import X.C1097160eeo;
import X.C1097180eeq;
import X.C1124140fMK;
import X.C11NZ;
import X.C11S5;
import X.C139Q;
import X.C1701940uOG;
import X.C19ME;
import X.C1C7U;
import X.C20516015Pq;
import X.C2188811AlT;
import X.C2262171DgV;
import X.C485820J3k;
import X.C771560UOk;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import X.InterfaceC1487280oo2;
import X.InterfaceC20105513ld;
import X.InterfaceC2262151DgT;
import X.InterfaceC2262351Dgn;
import X.InterfaceC2262371Dgp;
import X.InterfaceC420801kM;
import X.InterfaceC770590UKr;
import X.InterfaceC781210Ukh;
import Y.ARunnableS104S0200000_35;
import Y.ARunnableS29S0210000_35;
import Y.ARunnableS43S0400000_35;
import Y.AfS204S0100000_35;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetQuickReturnReuseSetting;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.scatter.LiveExitRoomRunnableScatter;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes36.dex */
public class WidgetManager implements C0ULM, LifecycleOwner, GenericLifecycleObserver {
    public static final String TAG = WidgetManager.class.getCanonicalName();
    public static boolean enableWidgetLifecycleDispatchOpt = false;
    public static volatile boolean hasSet = false;
    public C0J4A asyncLayoutInflater;
    public InterfaceC420801kM batchLoadTask;
    public boolean configured;
    public View contentView;
    public Context context;
    public Map<Object, Long> customCallBackInfoMap;
    public boolean enableFramePacedTeardown;
    public LiveExitRoomRunnableScatter exitRoomRunnableScatter;
    public boolean isBatchLoading;
    public boolean isRTL;
    public boolean isSubWidgetManager;
    public LifecycleRegistry lifecycleRegistry;
    public boolean mEnableScatterLoad;
    public LayoutInflater.Factory2 mFactory;
    public FluencyOpt mFluencyOpt;
    public InterfaceC2262351Dgn mWidgetCreateTimeListener;
    public List<InterfaceC2262151DgT> mWidgetEventListeners;
    public final IWidgetProvider mWidgetProvider;
    public InterfaceC2262371Dgp onFirstLoadViewListener;
    public Fragment parentFragment;
    public boolean resetParams;
    public LifecycleOwner rootLifeCycleOwner;
    public WidgetLoadScatter scatter;
    public InterfaceC20105513ld scheduler;
    public LayoutInflater syncLayoutInflater;
    public Object token;
    public List<C2262171DgV> viewList;
    public InterfaceC1097170eep widgetCallback;
    public Map<Widget, ViewGroup> widgetViewGroupHashMap;
    public Set<Widget> widgets;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBatchLoadView$6() {
        this.isBatchLoading = false;
    }

    public void addOnFirstLoadViewListener(InterfaceC2262371Dgp interfaceC2262371Dgp) {
    }

    public boolean checkWidgetContainer() {
        return true;
    }

    public void doPendingAttach() {
    }

    public void onPostCreate(Widget widget) {
    }

    public void onPostDestroy(Widget widget) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public void onWidgetRequestLoading(Widget widget, boolean z) {
    }

    private void applyFactory() {
        LayoutInflater.Factory2 factory2;
        C0J4A c0j4a = this.asyncLayoutInflater;
        if (c0j4a == null || (factory2 = this.mFactory) == null) {
            return;
        }
        c0j4a.LIZLLL(factory2);
    }

    public void cancelLoading() {
        releaseInflateWithToken(this.token);
        releaseScatter();
    }

    public void detachWidget() {
        Iterator<Widget> it2 = this.widgets.iterator();
        while (it2.hasNext()) {
            it2.next().onDetachWidget();
        }
    }

    public void notifyFirstFrameShown() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.onFirstFrame();
    }

    public void onAllPhaseLoaded() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.setAllPhaseLoaded(true);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        InterfaceC420801kM interfaceC420801kM = this.batchLoadTask;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        Fragment fragment = this.parentFragment;
        if (fragment != null) {
            fragment.getLifecycle().removeObserver(this);
        }
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.customCallBackInfoMap.clear();
        List<InterfaceC2262151DgT> list = this.mWidgetEventListeners;
        if (list != null) {
            list.clear();
            this.mWidgetEventListeners = null;
        }
        this.scheduler = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public void pauseScatterLoading() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.pauseLoading();
    }

    public void releaseScatter() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.release();
    }

    public void resetScatterTime() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.resetTime();
    }

    public void resumeScatterLoading() {
        WidgetLoadScatter widgetLoadScatter;
        if (!this.mEnableScatterLoad || (widgetLoadScatter = this.scatter) == null) {
            return;
        }
        widgetLoadScatter.resumeLoading();
    }

    public WidgetManager() {
        this.widgetCallback = new InterfaceC1097170eep() { // from class: X.1DgS
            @Override // X.InterfaceC1097170eep
            public final void attachContentView(Widget widget, ViewGroup viewGroup, View view) {
            }

            @Override // X.InterfaceC1097170eep
            public final /* synthetic */ void removeAllMessages(Object obj) {
            }

            @Override // X.InterfaceC1097170eep
            public final Fragment getFragment() {
                return this.LIZ.parentFragment;
            }

            @Override // X.InterfaceC1097170eep
            public final LifecycleOwner getRootLifeCycleOwner() {
                WidgetManager widgetManager = this.LIZ;
                LifecycleOwner lifecycleOwner = widgetManager.rootLifeCycleOwner;
                return lifecycleOwner == null ? widgetManager.parentFragment : lifecycleOwner;
            }

            @Override // X.InterfaceC1097170eep
            public final WidgetLoadScatter getWidgetLoadScatter() {
                return this.LIZ.scatter;
            }

            @Override // X.InterfaceC1097170eep
            public final boolean isScatterLoadEnable() {
                return this.LIZ.mEnableScatterLoad;
            }

            @Override // X.InterfaceC1097170eep
            public final boolean isSubWidget() {
                return this.LIZ.isSubWidgetManager;
            }

            @Override // X.InterfaceC1097170eep
            public final WidgetManager getWidgetManager() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1097170eep
            public final void loadWidget(Widget widget) {
                this.LIZ.load(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onHide(Widget widget) {
                this.LIZ.notifyHide(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPostCreate(Widget widget) {
                this.LIZ.notifyOnPostCreate(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPostDestroy(Widget widget) {
                this.LIZ.notifyOnPostDestroy(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPreCreate(Widget widget) {
                this.LIZ.notifyOnPreCreate(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPreDestroy(Widget widget) {
                this.LIZ.notifyOnPreDestroy(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onShow(Widget widget) {
                this.LIZ.notifyShow(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void unloadWidget(Widget widget) {
                this.LIZ.unload(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void loadWidget(int i, Widget widget, boolean z) {
                this.LIZ.load(i, widget, z);
            }
        };
        this.widgets = new CopyOnWriteArraySet();
        this.widgetViewGroupHashMap = new HashMap();
        this.customCallBackInfoMap = new ConcurrentHashMap();
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.mEnableScatterLoad = false;
        this.isSubWidgetManager = false;
        this.enableFramePacedTeardown = false;
        this.scheduler = null;
        this.batchLoadTask = null;
        this.viewList = new ArrayList();
        this.mWidgetProvider = LiveWidgetNonOpProvider.getInstance();
    }

    public boolean enableScatterLoad() {
        return this.mEnableScatterLoad;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public List<? extends InterfaceC2262151DgT> getWidgetEventListeners() {
        return this.mWidgetEventListeners;
    }

    public boolean isFramePacedTeardownEnabled() {
        return this.enableFramePacedTeardown;
    }

    public WidgetManager(IWidgetProvider iWidgetProvider) {
        this.widgetCallback = new InterfaceC1097170eep() { // from class: X.1DgS
            @Override // X.InterfaceC1097170eep
            public final void attachContentView(Widget widget, ViewGroup viewGroup, View view) {
            }

            @Override // X.InterfaceC1097170eep
            public final /* synthetic */ void removeAllMessages(Object obj) {
            }

            @Override // X.InterfaceC1097170eep
            public final Fragment getFragment() {
                return this.LIZ.parentFragment;
            }

            @Override // X.InterfaceC1097170eep
            public final LifecycleOwner getRootLifeCycleOwner() {
                WidgetManager widgetManager = this.LIZ;
                LifecycleOwner lifecycleOwner = widgetManager.rootLifeCycleOwner;
                return lifecycleOwner == null ? widgetManager.parentFragment : lifecycleOwner;
            }

            @Override // X.InterfaceC1097170eep
            public final WidgetLoadScatter getWidgetLoadScatter() {
                return this.LIZ.scatter;
            }

            @Override // X.InterfaceC1097170eep
            public final boolean isScatterLoadEnable() {
                return this.LIZ.mEnableScatterLoad;
            }

            @Override // X.InterfaceC1097170eep
            public final boolean isSubWidget() {
                return this.LIZ.isSubWidgetManager;
            }

            @Override // X.InterfaceC1097170eep
            public final WidgetManager getWidgetManager() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1097170eep
            public final void loadWidget(Widget widget) {
                this.LIZ.load(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onHide(Widget widget) {
                this.LIZ.notifyHide(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPostCreate(Widget widget) {
                this.LIZ.notifyOnPostCreate(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPostDestroy(Widget widget) {
                this.LIZ.notifyOnPostDestroy(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPreCreate(Widget widget) {
                this.LIZ.notifyOnPreCreate(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onPreDestroy(Widget widget) {
                this.LIZ.notifyOnPreDestroy(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void onShow(Widget widget) {
                this.LIZ.notifyShow(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void unloadWidget(Widget widget) {
                this.LIZ.unload(widget);
            }

            @Override // X.InterfaceC1097170eep
            public final void loadWidget(int i, Widget widget, boolean z) {
                this.LIZ.load(i, widget, z);
            }
        };
        this.widgets = new CopyOnWriteArraySet();
        this.widgetViewGroupHashMap = new HashMap();
        this.customCallBackInfoMap = new ConcurrentHashMap();
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.mEnableScatterLoad = false;
        this.isSubWidgetManager = false;
        this.enableFramePacedTeardown = false;
        this.scheduler = null;
        this.batchLoadTask = null;
        this.viewList = new ArrayList();
        this.mWidgetProvider = iWidgetProvider;
    }

    private void cleanupWidgetAfterUnload(Widget widget) {
        widget.containerView = null;
        widget.widgetCallback = null;
        widget.widgetContainer = null;
        if (!isEnableRecycleWrap(widget)) {
            widget.context = null;
        }
    }

    private void detachAndRemoveWidgetView(Widget widget) {
        C20516015Pq c20516015Pq = widget.widgetContainer;
        if (c20516015Pq == null) {
            if (this.widgetViewGroupHashMap.containsKey(widget)) {
                ViewGroup viewGroup = this.widgetViewGroupHashMap.get(widget);
                if (viewGroup != null) {
                    onDetachContentView(widget, viewGroup, widget.contentView);
                }
                this.widgetViewGroupHashMap.remove(widget);
                return;
            }
            return;
        }
        c20516015Pq.LIZ(widget.contentView);
    }

    public static void enableWidgetLifecycleDispatchOpt(boolean z) {
        if (!hasSet) {
            hasSet = true;
            enableWidgetLifecycleDispatchOpt = z;
        }
    }

    public static MutableContextWrapper findMutableContextWrapper(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof MutableContextWrapper) {
            return (MutableContextWrapper) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return findMutableContextWrapper(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C0J4A getAsyncLayoutInflater(Widget widget) {
        if (widget instanceof LiveRecyclableWidget) {
            return getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) widget.getClass());
        }
        return this.asyncLayoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LayoutInflater getLayoutInflater(Widget widget) {
        if (widget instanceof LiveRecyclableWidget) {
            return getLayoutInflater((Class<? extends LiveRecyclableWidget>) widget.getClass());
        }
        return this.syncLayoutInflater;
    }

    public static boolean isEnableRecycleWrap(Widget widget) {
        if ((widget instanceof LiveRecyclableWidget) && LiveWidgetProvider.getInstance().getEnableWidgetCrossContextReuse() && LiveWidgetQuickReturnReuseSetting.INSTANCE.isInWhitelist(widget.getClass())) {
            return true;
        }
        return false;
    }

    private boolean isNoOpWrapper(InterfaceC1097170eep interfaceC1097170eep) {
        if (!(interfaceC1097170eep instanceof C1097180eeq) && !(interfaceC1097170eep instanceof C1085920eMg)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$11(Widget widget) {
        C1C7U.LIZ("WidgetManager@a485.load$2L");
        loadInternal(widget);
        C1C7U.LIZIZ("WidgetManager@a485.load$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Pair lambda$startBatchLoadView$3(Long l) {
        Pair pair;
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<C2262171DgV> it2 = this.viewList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next());
                    it2.remove();
                }
                pair = new Pair(l, arrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBatchLoadView$4(Pair pair) {
        C1C7U.LIZ("WidgetManager@a485.startBatchLoadView$1L");
        ((Long) pair.first).longValue();
        for (int i = 0; i < ((List) pair.second).size(); i++) {
            C2262171DgV c2262171DgV = (C2262171DgV) ListProtector.get((List) pair.second, i);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                notifyOnPostCreateView(c2262171DgV.LIZ);
                C20516015Pq c20516015Pq = c2262171DgV.LIZIZ;
                if (c20516015Pq != null) {
                    continueLoadNew(c2262171DgV.LIZ, c20516015Pq, c2262171DgV.LIZLLL);
                } else {
                    ViewGroup viewGroup = c2262171DgV.LIZJ;
                    if (viewGroup != null) {
                        continueLoadOld(c2262171DgV.LIZ, viewGroup, c2262171DgV.LIZLLL);
                    }
                }
            }
        }
        C1C7U.LIZIZ("WidgetManager@a485.startBatchLoadView$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBatchLoadView$5(Throwable th) {
        C1C7U.LIZ("WidgetManager@a485.startBatchLoadView$2L");
        synchronized (this) {
            try {
                this.isBatchLoading = false;
                this.viewList.clear();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        C1C7U.LIZIZ("WidgetManager@a485.startBatchLoadView$2L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unload$13(Widget widget) {
        C1C7U.LIZ("WidgetManager@a485.unload$1L");
        unload(widget);
        C1C7U.LIZIZ("WidgetManager@a485.unload$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unloadFramePaced$14(Widget widget) {
        C1C7U.LIZ("WidgetManager@a485.unloadFramePaced$1L");
        try {
            if (!widget.isDestroyed) {
                widget.performDestroy();
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        cleanupWidgetAfterUnload(widget);
        C1C7U.LIZIZ("WidgetManager@a485.unloadFramePaced$1L");
    }

    private void loadInternal(Widget widget) {
        widget.setWidgetCallback(this.widgetCallback);
        widget.setupContext(this.context);
        boolean zContains = this.widgets.contains(widget);
        this.widgets.add(widget);
        if (this.enableFramePacedTeardown && widget.enablePacedLoad()) {
            InterfaceC20105513ld interfaceC20105513ld = this.scheduler;
            if (interfaceC20105513ld != null) {
                C00GI c00gi = C00GI.NORMAL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadInternal:");
                sbLIZ.append(widget.getClass().getSimpleName());
                interfaceC20105513ld.LIZ(c00gi, C2188811AlT.LIZIZ(sbLIZ), new ARunnableS29S0210000_35(this, widget, zContains, 0));
                return;
            }
            addWidget2Observer(widget);
            if (zContains) {
                return;
            }
            onCustomInfoCallBack(widget);
            return;
        }
        addWidget2Observer(widget);
        if (zContains) {
            return;
        }
        onCustomInfoCallBack(widget);
    }

    private void removeWidget2Observer(Widget widget) {
        if (enableWidgetLifecycleDispatchOpt) {
            getLifecycle().removeObserver(widget.getLifecycleObserverDelegate());
        } else {
            getLifecycle().removeObserver(widget);
        }
    }

    private void resetWidgetLayoutParamsIfNeeded(Widget widget) {
        View view;
        if (this.resetParams && (view = widget.contentView) != null && (view.getLayoutParams() instanceof C19ME)) {
            ((C19ME) widget.contentView.getLayoutParams()).reset();
        }
    }

    private void unloadFramePaced(Widget widget) {
        removeWidget2Observer(widget);
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        boolean zShouldPerformDestroy = shouldPerformDestroy(widget, currentState);
        InterfaceC1097170eep interfaceC1097170eep = widget.widgetCallback;
        if (interfaceC1097170eep != null && !isNoOpWrapper(interfaceC1097170eep)) {
            widget.widgetCallback = wrapCallbackForFrameTeardown(interfaceC1097170eep);
        }
        if (widget.isViewValid) {
            int i = C0J4B.LIZ[currentState.ordinal()];
            if (i != 3) {
                if (i == 4) {
                    widget.performPause();
                    widget.performStop();
                }
            } else {
                widget.performStop();
            }
        }
        widget.isViewValid = false;
        detachAndRemoveWidgetView(widget);
        resetWidgetLayoutParamsIfNeeded(widget);
        this.widgets.remove(widget);
        if (!zShouldPerformDestroy) {
            cleanupWidgetAfterUnload(widget);
            return;
        }
        InterfaceC20105513ld interfaceC20105513ld = this.scheduler;
        if (interfaceC20105513ld != null) {
            C00GI c00gi = C00GI.NORMAL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy:");
            sbLIZ.append(widget.getClass().getSimpleName());
            interfaceC20105513ld.LIZ(c00gi, C2188811AlT.LIZIZ(sbLIZ), new ARunnableS104S0200000_35(this, widget, 1));
            return;
        }
        try {
            if (!widget.isDestroyed) {
                widget.performDestroy();
            }
            cleanupWidgetAfterUnload(widget);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cleanupWidgetAfterUnload(widget);
            throw th;
        }
    }

    private void unloadSynchronously(Widget widget) {
        removeWidget2Observer(widget);
        if (widget.isViewValid) {
            int i = C0J4B.LIZ[getLifecycle().getCurrentState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            widget.performPause();
                            widget.performStop();
                            widget.performDestroy();
                        }
                    } else {
                        widget.performStop();
                        widget.performDestroy();
                    }
                } else {
                    widget.performDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.performDestroy();
            }
        }
        detachAndRemoveWidgetView(widget);
        resetWidgetLayoutParamsIfNeeded(widget);
        this.widgets.remove(widget);
        cleanupWidgetAfterUnload(widget);
    }

    private InterfaceC1097170eep wrapCallbackForFrameTeardown(final InterfaceC1097170eep interfaceC1097170eep) {
        if (interfaceC1097170eep instanceof LiveRecyclableWidget.RecyclableWidgetCallback) {
            final LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback = (LiveRecyclableWidget.RecyclableWidgetCallback) interfaceC1097170eep;
            return new LiveRecyclableWidget.RecyclableWidgetCallbackWrapper(recyclableWidgetCallback) { // from class: X.0eMg
                @Override // X.C1097160eeo, X.InterfaceC1097170eep
                public final void unloadWidget(Widget widget) {
                }
            };
        }
        return new C1097160eeo(interfaceC1097170eep) { // from class: X.0eeq
            @Override // X.C1097160eeo, X.InterfaceC1097170eep
            public final void unloadWidget(Widget widget) {
            }
        };
    }

    public void addWidget2Observer(Widget widget) {
        if (enableWidgetLifecycleDispatchOpt) {
            getLifecycle().addObserver(widget.getLifecycleObserverDelegate());
        } else {
            getLifecycle().addObserver(widget);
        }
    }

    public void addWidgetAndCallCustomBack(Widget widget) {
        boolean zContains = this.widgets.contains(widget);
        this.widgets.add(widget);
        if (!zContains) {
            onCustomInfoCallBack(widget);
        }
    }

    public void addWidgetEventListener(InterfaceC2262151DgT interfaceC2262151DgT) {
        if (interfaceC2262151DgT != null) {
            if (this.mWidgetEventListeners == null) {
                this.mWidgetEventListeners = new ArrayList();
            }
            this.mWidgetEventListeners.add(interfaceC2262151DgT);
        }
    }

    public WidgetManager load(Widget widget) {
        WidgetLoadScatter widgetLoadScatter;
        if (widget == null) {
            return this;
        }
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(-1, false);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        notifyWidgetPreRequestLoading(widget, false);
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new ARunnableS104S0200000_35(this, widget, 3), widget.getClass(), this.isSubWidgetManager));
            return this;
        }
        loadInternal(widget);
        return this;
    }

    public void notifyHide(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onHide(this, widget);
            }
        }
    }

    public void notifyOnPostCreate(Widget widget) {
        onPostCreate(widget);
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPostCreate(this, widget);
            }
        }
    }

    public void notifyOnPostCreateView(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPostCreateView(this, widget);
            }
        }
    }

    public void notifyOnPostDestroy(Widget widget) {
        onPostDestroy(widget);
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPostDestroy(this, widget);
            }
        }
    }

    public void notifyOnPreCreate(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPreCreate(this, widget);
            }
        }
    }

    public void notifyOnPreCreateView(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPreCreateView(this, widget);
            }
        }
    }

    public void notifyOnPreDestroy(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onPreDestroy(this, widget);
            }
        }
    }

    public void notifyShow(Widget widget) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onShow(this, widget);
            }
        }
    }

    public void onCoreMsgSent(boolean z) {
        WidgetLoadScatter widgetLoadScatter;
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.onCoreMsgSent(z);
        }
    }

    public void onCustomInfoCallBack(Widget widget) {
        for (Object obj : this.customCallBackInfoMap.keySet()) {
            if (this.customCallBackInfoMap.get(obj).longValue() < SystemClock.elapsedRealtime() && widget.hasRegister(obj.getClass())) {
                widget.onCustomInfoCallBack(obj);
            }
        }
    }

    public View onProvideContainer(int i) {
        return this.contentView.findViewById(i);
    }

    public void releaseInflateWithToken(Object obj) {
        this.asyncLayoutInflater.LIZJ(obj);
    }

    public void setEnableScatterLoad(boolean z) {
        this.mEnableScatterLoad = z;
        if (z) {
            this.scatter = new WidgetLoadScatter();
        }
    }

    public void setFactory2(LayoutInflater.Factory2 factory2) {
        this.mFactory = factory2;
        applyFactory();
    }

    public void setFrameTimeMill(long j) {
        WidgetLoadScatter widgetLoadScatter = this.scatter;
        if (widgetLoadScatter != null) {
            widgetLoadScatter.setFrameTimeMill(j);
        }
    }

    public void setScatterWhiteList(List<String> list) {
        WidgetLoadScatter widgetLoadScatter = this.scatter;
        if (widgetLoadScatter != null) {
            widgetLoadScatter.setWhiteList(list);
        }
    }

    public void setToken(Object obj) {
        this.token = obj;
    }

    public void setWidgetCreateTimeListener(InterfaceC2262351Dgn interfaceC2262351Dgn) {
        this.mWidgetCreateTimeListener = interfaceC2262351Dgn;
    }

    public WidgetManager unload(Widget widget) {
        if (widget == null) {
            return this;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0200000_35(this, widget, 2));
            return this;
        }
        if (this.enableFramePacedTeardown && widget.enablePacedLoad()) {
            unloadFramePaced(widget);
            return this;
        }
        unloadSynchronously(widget);
        return this;
    }

    public C0J4A getAsyncLayoutInflater(Class<? extends LiveRecyclableWidget> cls) {
        return this.asyncLayoutInflater;
    }

    public LayoutInflater getLayoutInflater(Class<? extends LiveRecyclableWidget> cls) {
        return this.syncLayoutInflater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadInternal$12(Widget widget, boolean z) {
        C1C7U.LIZ("WidgetManager@a485.loadInternal$1L");
        addWidget2Observer(widget);
        if (!z && !widget.hasRegister(widget.getClass())) {
            onCustomInfoCallBack(widget);
        }
        C1C7U.LIZIZ("WidgetManager@a485.loadInternal$1L");
    }

    public static void resetViewContext(Widget widget, Context context) {
        View view;
        MutableContextWrapper mutableContextWrapperFindMutableContextWrapper;
        if (widget != null && (widget instanceof LiveRecyclableWidget) && isEnableRecycleWrap(widget) && (view = widget.contentView) != null && (mutableContextWrapperFindMutableContextWrapper = findMutableContextWrapper(view.getContext())) != null) {
            if (context instanceof MutableContextWrapper) {
                resetViewContext(widget, ((ContextWrapper) context).getBaseContext());
            } else {
                mutableContextWrapperFindMutableContextWrapper.setBaseContext(context);
            }
        }
    }

    public static void resetWidgetContext(Widget widget, Context context) {
        if (isEnableRecycleWrap(widget)) {
            MutableContextWrapper mutableContextWrapperFindMutableContextWrapper = findMutableContextWrapper(widget.context);
            if (mutableContextWrapperFindMutableContextWrapper != null) {
                if (context instanceof MutableContextWrapper) {
                    resetWidgetContext(widget, ((ContextWrapper) context).getBaseContext());
                    return;
                } else {
                    mutableContextWrapperFindMutableContextWrapper.setBaseContext(context);
                    return;
                }
            }
            widget.context = new C485820J3k(context);
        }
    }

    private boolean shouldPerformDestroy(Widget widget, Lifecycle.State state) {
        if (!widget.isViewValid) {
            return false;
        }
        int i = C0J4B.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                return false;
            }
            return true;
        }
        return !widget.isDestroyed;
    }

    public LayoutInflater getThemeOverlayLayoutInflater(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            return layoutInflater;
        }
        return layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), i));
    }

    public WidgetManager load(int i, Widget widget) {
        return load(i, widget, true);
    }

    public void notifyWidgetPreRequestLoading(Widget widget, boolean z) {
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onWidgetPreRequestLoading(this, widget, z);
            }
        }
    }

    public void notifyWidgetRequestLoading(Widget widget, boolean z) {
        onWidgetRequestLoading(widget, z);
        List<? extends InterfaceC2262151DgT> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC2262151DgT> it2 = widgetEventListeners.iterator();
            while (it2.hasNext()) {
                it2.next().onWidgetRequestLoading(this, widget, z);
            }
        }
    }

    public <T> void onCustomInfoCallBack(Class<T> cls, T t) {
        if (t != null && cls != null) {
            for (Widget widget : this.widgets) {
                if (widget.hasRegister(cls)) {
                    widget.onCustomInfoCallBack(t);
                }
            }
            this.customCallBackInfoMap.put(t, Long.valueOf(SystemClock.elapsedRealtime()));
        }
    }

    public void setEnableScatterLoad(boolean z, WidgetLoadScatter widgetLoadScatter) {
        this.scatter = widgetLoadScatter;
        this.mEnableScatterLoad = z;
    }

    private void continueLoadNewInternal(Widget widget, C20516015Pq c20516015Pq, View view) {
        if (view != null) {
            resetViewContext(widget, this.context);
            widget.setContentView(view);
        }
        if (c20516015Pq != null) {
            c20516015Pq.LIZIZ(view);
            if (this.isRTL && view != null) {
                view.setLayoutDirection(1);
            }
        }
        boolean zContains = this.widgets.contains(widget);
        this.widgets.add(widget);
        InterfaceC2262351Dgn interfaceC2262351Dgn = this.mWidgetCreateTimeListener;
        if (interfaceC2262351Dgn != null && interfaceC2262351Dgn.needUploadTime(widget)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            addWidget2Observer(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - jElapsedRealtime);
        } else {
            addWidget2Observer(widget);
        }
        if (!zContains) {
            onCustomInfoCallBack(widget);
        }
    }

    private void continueLoadOldInternal(Widget widget, ViewGroup viewGroup, View view) {
        widget.widgetContainer = null;
        if (widget.containerView == null) {
            return;
        }
        widget.setContentView(view);
        resetViewContext(widget, this.context);
        onAttachContentView(widget, viewGroup, view);
        boolean zContains = this.widgets.contains(widget);
        this.widgets.add(widget);
        InterfaceC2262351Dgn interfaceC2262351Dgn = this.mWidgetCreateTimeListener;
        if (interfaceC2262351Dgn != null && interfaceC2262351Dgn.needUploadTime(widget)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            addWidget2Observer(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - jElapsedRealtime);
        } else {
            addWidget2Observer(widget);
        }
        if (!zContains) {
            onCustomInfoCallBack(widget);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$continueLoadNew$10(Widget widget, C20516015Pq c20516015Pq, View view) {
        C1C7U.LIZ("WidgetManager@a485.continueLoadNew$1L");
        continueLoadNewInternal(widget, c20516015Pq, view);
        C1C7U.LIZIZ("WidgetManager@a485.continueLoadNew$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$continueLoadOld$9(Widget widget, ViewGroup viewGroup, View view) {
        C1C7U.LIZ("WidgetManager@a485.continueLoadOld$1L");
        continueLoadOldInternal(widget, viewGroup, view);
        C1C7U.LIZIZ("WidgetManager@a485.continueLoadOld$1L");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Widget widget, int i, boolean z) {
        C1C7U.LIZ("WidgetManager@a485.load$1L");
        loadInternal(widget, i, z);
        C1C7U.LIZIZ("WidgetManager@a485.load$1L");
    }

    private void loadInternal(Widget widget, int i, boolean z) {
        widget.setWidgetCallback(this.widgetCallback);
        widget.setupContext(this.context);
        widget.setId(i);
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(i, z);
            addWidgetAndCallCustomBack(widget);
            return;
        }
        if (this.contentView.findViewById(i) instanceof C20516015Pq) {
            loadNew((C20516015Pq) this.contentView.findViewById(i), widget, z, null, null);
            return;
        }
        boolean z2 = false;
        Widget widget2 = null;
        for (Widget widget3 : this.widgets) {
            if (widget3.getClass() == widget.getClass()) {
                z2 = true;
                widget2 = widget3;
            }
        }
        if (!C1124140fMK.LIZIZ(widget.getClass()) && z2) {
            unload(widget2);
            load(i, widget, z);
        } else {
            if (checkWidgetContainer() && !C1124140fMK.LIZIZ(widget.getClass()) && C1124140fMK.LIZJ(this.context)) {
                throw new C139Q(widget);
            }
            loadOld((ViewGroup) onProvideContainer(i), widget, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.android.widget.WidgetManager loadOld(final android.view.ViewGroup r12, final com.bytedance.android.widget.Widget r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.loadOld(android.view.ViewGroup, com.bytedance.android.widget.Widget, boolean):com.bytedance.android.widget.WidgetManager");
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt) {
        return of(fragment, view, fluencyOpt, false, false);
    }

    public void collectViewNew(Widget widget, C20516015Pq c20516015Pq, View view) {
        synchronized (this) {
            try {
                this.viewList.add(new C2262171DgV(widget, c20516015Pq, null, view));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void collectViewOld(Widget widget, ViewGroup viewGroup, View view) {
        synchronized (this) {
            try {
                this.viewList.add(new C2262171DgV(widget, null, viewGroup, view));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void continueLoadNew(Widget widget, C20516015Pq c20516015Pq, View view) {
        if (this.parentFragment == null) {
            return;
        }
        if (this.enableFramePacedTeardown && widget.enablePacedLoad()) {
            InterfaceC20105513ld interfaceC20105513ld = this.scheduler;
            if (interfaceC20105513ld != null) {
                C00GI c00gi = C00GI.NORMAL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("continueLoadNew:");
                sbLIZ.append(widget.getClass().getSimpleName());
                interfaceC20105513ld.LIZ(c00gi, C2188811AlT.LIZIZ(sbLIZ), new ARunnableS43S0400000_35(this, widget, c20516015Pq, view, 8));
                return;
            }
            return;
        }
        continueLoadNewInternal(widget, c20516015Pq, view);
    }

    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment == null) {
            return;
        }
        if (this.enableFramePacedTeardown && widget.enablePacedLoad()) {
            InterfaceC20105513ld interfaceC20105513ld = this.scheduler;
            if (interfaceC20105513ld != null) {
                C00GI c00gi = C00GI.NORMAL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("continueLoadOld:");
                sbLIZ.append(widget.getClass().getSimpleName());
                interfaceC20105513ld.LIZ(c00gi, C2188811AlT.LIZIZ(sbLIZ), new ARunnableS43S0400000_35(this, widget, viewGroup, view, 9));
                return;
            }
            return;
        }
        continueLoadOldInternal(widget, viewGroup, view);
    }

    public WidgetManager load(final int i, final Widget widget, final boolean z) {
        WidgetLoadScatter widgetLoadScatter;
        if (this.parentFragment != null && widget != null) {
            notifyWidgetPreRequestLoading(widget, z);
            if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
                widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: X.1Dgj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.LL.lambda$load$0(widget, i, z);
                    }
                }, widget.getClass(), this.isSubWidgetManager));
            } else {
                loadInternal(widget, i, z);
                return this;
            }
        }
        return this;
    }

    public void onAttachContentView(Widget widget, ViewGroup viewGroup, View view) {
        if (viewGroup != null && view != null) {
            viewGroup.addView(view);
        }
    }

    public void onDetachContentView(Widget widget, ViewGroup viewGroup, View view) {
        C786410Ut5.LJJJJI(viewGroup);
    }

    public void startBatchLoadView(long j, long j2, int i) {
        this.isBatchLoading = true;
        this.batchLoadTask = C11NZ.LJJJJJL(j, j2, TimeUnit.MILLISECONDS).LJLIIL(i).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.1Dge
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return this.LL.lambda$startBatchLoadView$3((Long) obj);
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new AfS204S0100000_35(this, 0), new AfS204S0100000_35(this, 1), new InterfaceC781210Ukh() { // from class: X.1Dgo
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                this.LIZ.lambda$startBatchLoadView$6();
            }
        });
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt, boolean z) {
        return of(fragment, view, fluencyOpt, z, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNew$2(Widget widget, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (this.isBatchLoading && widget.supportBatch()) {
            collectViewNew(widget, c20516015Pq, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadOld$7(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (!this.isBatchLoading || !widget.supportBatch()) {
            notifyOnPostCreateView(widget);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                continueLoadOld(widget, viewGroup, view);
                resetScatterTime();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadOld$8(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        if (this.isBatchLoading && widget.supportBatch()) {
            collectViewOld(widget, viewGroup, view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.android.widget.WidgetManager loadNew(final X.C20516015Pq r15, final com.bytedance.android.widget.Widget r16, boolean r17, final java.lang.Object r18, final X.InterfaceC770590UKr r19) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.widget.WidgetManager.loadNew(X.15Pq, com.bytedance.android.widget.Widget, boolean, java.lang.Object, X.0UKr):com.bytedance.android.widget.WidgetManager");
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt, boolean z, boolean z2) {
        Context context;
        WidgetManager widgetManager = new WidgetManager();
        if (z) {
            context = view.getContext();
        } else {
            context = fragment.getContext();
        }
        widgetManager.config(false, fragment, view, context, fluencyOpt, z2);
        return widgetManager;
    }

    public void config(boolean z, Fragment fragment, View view, Context context, FluencyOpt fluencyOpt) {
        config(z, fragment, view, context, fluencyOpt, false);
    }

    public WidgetManager loadPreviewWidget(C20516015Pq c20516015Pq, Widget widget, boolean z, Object obj, InterfaceC770590UKr interfaceC770590UKr) {
        if (this.parentFragment != null && widget != null && c20516015Pq != null) {
            int id = c20516015Pq.getId();
            widget.setWidgetCallback(this.widgetCallback);
            widget.setupContext(this.context);
            widget.setId(id);
            if (!widget.shouldAttach()) {
                widget.saveSnapShot(id, z);
                addWidgetAndCallCustomBack(widget);
                return this;
            }
            loadNew(c20516015Pq, widget, z, obj, interfaceC770590UKr);
            return this;
        }
        return this;
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt, boolean z, boolean z2, long j) {
        return of(fragment, view, fluencyOpt, z, z2);
    }

    public void config(boolean z, Fragment fragment, View view, Context context, FluencyOpt fluencyOpt, boolean z2) {
        if (this.configured || fragment == null) {
            return;
        }
        this.resetParams = z;
        this.mFluencyOpt = fluencyOpt;
        this.enableFramePacedTeardown = z2;
        if (z2) {
            InterfaceC20105513ld interfaceC20105513ld = C771560UOk.LIZ;
            if (interfaceC20105513ld == null) {
                interfaceC20105513ld = (InterfaceC20105513ld) C771560UOk.LIZIZ.getValue();
            }
            this.scheduler = interfaceC20105513ld;
        }
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.isRTL = C1124140fMK.LIZLLL(context);
        this.asyncLayoutInflater = new C0J4A(context);
        this.syncLayoutInflater = C786410Ut5.ne(context);
        applyFactory();
        fragment.getLifecycle().addObserver(this);
        this.configured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNew$1(Widget widget, InterfaceC770590UKr interfaceC770590UKr, Object obj, C20516015Pq c20516015Pq, View view, int i, ViewGroup viewGroup) {
        if (!this.isBatchLoading || !widget.supportBatch()) {
            notifyOnPostCreateView(widget);
            Fragment fragment = this.parentFragment;
            if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                if (interfaceC770590UKr == null || interfaceC770590UKr.LIZ(obj)) {
                    continueLoadNew(widget, c20516015Pq, view);
                    resetScatterTime();
                }
            }
        }
    }

    public void config(boolean z, Fragment fragment, View view, Context context, FluencyOpt fluencyOpt, boolean z2, int i) {
        if (!z2) {
            config(z, fragment, view, context, fluencyOpt);
            return;
        }
        if (this.configured || fragment == null) {
            return;
        }
        this.resetParams = z;
        this.mFluencyOpt = fluencyOpt;
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.isRTL = C1124140fMK.LIZLLL(context);
        this.asyncLayoutInflater = new C0J4A(context, i);
        this.syncLayoutInflater = C786410Ut5.ne(context);
        applyFactory();
        fragment.getLifecycle().addObserver(this);
        this.configured = true;
    }
}
