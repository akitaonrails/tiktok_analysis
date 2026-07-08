package com.bytedance.ies.sdk.widgets;

import X.C0IR4;
import X.C13BV;
import X.C1C7U;
import X.C20516015Pq;
import X.C2179971ATj;
import X.C786410Ut5;
import X.InterfaceC2262151DgT;
import X.InterfaceC487680JAo;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubWidgetScatterEnableSetting;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadInfo;
import com.bytedance.ies.sdk.widgets.scatter.WidgetLoadScatter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS436S0200000_35;
import kotlin.jvm.internal.AwS63S0310000_35;

/* JADX INFO: loaded from: classes36.dex */
public final class LayeredWidgetManagerV2 extends LayeredWidgetManager {
    public static final Companion Companion = new Companion();

    @Override // com.bytedance.ies.sdk.widgets.LayeredWidgetManager, com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager
    public void onDestroy() {
        Runnable runnable = new Runnable() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2$onDestroy$cleanup$1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("LayeredWidgetManagerV2@3ef5.onDestroy$cleanup$1");
                com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$onDestroy$cleanup$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("LayeredWidgetManagerV2@3ef5.onDestroy$cleanup$1");
            }

            public final void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$onDestroy$cleanup$1__run$___twin___() {
                super/*com.bytedance.ies.sdk.widgets.RecyclableWidgetManager*/.onDestroy();
            }

            public static void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$onDestroy$cleanup$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(LayeredWidgetManagerV2$onDestroy$cleanup$1 layeredWidgetManagerV2$onDestroy$cleanup$1) {
                try {
                    layeredWidgetManagerV2$onDestroy$cleanup$1.com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$onDestroy$cleanup$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        if (this.exitRoomRunnableScatter == null || (!LiveSubWidgetScatterEnableSetting.INSTANCE.enable() && this.isSubWidgetManager)) {
            runnable.run();
        } else {
            this.exitRoomRunnableScatter.destroy(runnable, "LayeredWidgetManagerV2", false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager
    public List<InterfaceC2262151DgT> getWidgetEventListeners() {
        List widgetEventListeners = super.getWidgetEventListeners();
        return (!(widgetEventListeners instanceof List) || widgetEventListeners == null) ? C13BV.INSTANCE : widgetEventListeners;
    }

    public final <T extends LiveRecyclableWidget> void continueLoadSubWidgetV2(T t) {
        if (t.isInitialized()) {
            notifyWidgetRequestLoading(t, false);
            continueLoadNew(t, null, t.contentView);
        }
    }

    public LayeredWidgetManagerV2(IWidgetProvider iWidgetProvider, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
        super(iWidgetProvider, layeredElementManager);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends LiveRecyclableWidget> View resolveContentViewSync(T t, ViewGroup viewGroup) {
        View preloadLayout;
        View view;
        if (LiveWidgetProvider.Companion.getInstance().isEnablePriorityPreload && (view = t.contentView) != null) {
            return view;
        }
        FluencyOpt fluencyOpt = this.mFluencyOpt;
        if (fluencyOpt != null && (preloadLayout = fluencyOpt.getPreloadLayout(t.getLayoutId())) != null) {
            return preloadLayout;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        View viewTd = C786410Ut5.Td(getThemeOverlayLayoutInflater(getLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()), t.getThemeOverlay(this.context)), t.getLayoutId(), viewGroup, false);
        if (viewTd != null) {
            viewTd.setTag(R.id.n9a, Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
        }
        return viewTd;
    }

    private final <T extends LiveRecyclableWidget> void scheduleLoad(Class<T> cls, final Function0<Unit> function0) {
        WidgetLoadScatter widgetLoadScatter;
        if (this.mEnableScatterLoad && (widgetLoadScatter = this.scatter) != null) {
            widgetLoadScatter.load(new WidgetLoadInfo(new Runnable() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2$sam$java_lang_Runnable$0
                public final /* synthetic */ void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$sam$java_lang_Runnable$0__run$___twin___() {
                    function0.invoke();
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    C1C7U.LIZ("LayeredWidgetManagerV2@3ef5.sam$java_lang_Runnable$0");
                    com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$sam$java_lang_Runnable$0_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("LayeredWidgetManagerV2@3ef5.sam$java_lang_Runnable$0");
                }

                public static void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$sam$java_lang_Runnable$0_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(LayeredWidgetManagerV2$sam$java_lang_Runnable$0 layeredWidgetManagerV2$sam$java_lang_Runnable$0) {
                    try {
                        layeredWidgetManagerV2$sam$java_lang_Runnable$0.com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$sam$java_lang_Runnable$0__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            }, cls, this.isSubWidgetManager));
        } else {
            function0.invoke();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager
    public <T extends LiveRecyclableWidget> T load(Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(-1, cls, objArr);
        notifyWidgetPreRequestLoading(t, false);
        scheduleLoad(cls, new AwS436S0200000_35(this, (LayeredWidgetManagerV2) t, 32));
        return t;
    }

    public final <T extends LiveRecyclableWidget> T generateNewWidgetV2(final C20516015Pq c20516015Pq, boolean z, final T t) {
        if (!t.shouldAttach()) {
            t.saveSnapShot(c20516015Pq, z);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        notifyWidgetRequestLoading(t, z);
        t.widgetContainer = c20516015Pq;
        if (t.isInitialized()) {
            FluencyOpt fluencyOpt = this.mFluencyOpt;
            if (z && fluencyOpt != null) {
                fluencyOpt.post(new Runnable() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2.generateNewWidgetV2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("LayeredWidgetManagerV2@3ef5.generateNewWidgetV2$1");
                        com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$generateNewWidgetV2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        C1C7U.LIZIZ("LayeredWidgetManagerV2@3ef5.generateNewWidgetV2$1");
                    }

                    public final void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$generateNewWidgetV2$1__run$___twin___() {
                        LayeredWidgetManagerV2 layeredWidgetManagerV2 = LayeredWidgetManagerV2.this;
                        LiveRecyclableWidget liveRecyclableWidget = t;
                        layeredWidgetManagerV2.continueLoadNew(liveRecyclableWidget, c20516015Pq, liveRecyclableWidget.contentView);
                    }

                    public static void com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$generateNewWidgetV2$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        try {
                            anonymousClass1.com_bytedance_ies_sdk_widgets_LayeredWidgetManagerV2$generateNewWidgetV2$1__run$___twin___();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            if (!C2179971ATj.LIZ(th)) {
                                throw th;
                            }
                        }
                    }
                }, t.dataChannel);
                return t;
            }
            continueLoadNew(t, c20516015Pq, t.contentView);
            return t;
        }
        ViewGroup viewGroup = null;
        if (t.getLayoutId() == 0) {
            continueLoadNew(t, c20516015Pq, null);
            return t;
        }
        notifyOnPreCreateView(t);
        if (z) {
            ViewParent parent = c20516015Pq.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            resolveContentViewAsync(t, viewGroup, new C0IR4() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2.generateNewWidgetV2.2
                @Override // X.C0IR4
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    if (!LayeredWidgetManagerV2.this.isBatchLoading || !t.supportBatch()) {
                        LayeredWidgetManagerV2.this.notifyOnPostCreateView(t);
                        Fragment fragment = LayeredWidgetManagerV2.this.parentFragment;
                        if (fragment != null && !fragment.isRemoving() && !LayeredWidgetManagerV2.this.parentFragment.isDetached() && LayeredWidgetManagerV2.this.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                            LayeredWidgetManagerV2.this.continueLoadNew(t, c20516015Pq, view);
                            LayeredWidgetManagerV2.this.resetScatterTime();
                        }
                    }
                }
            }, new InterfaceC487680JAo() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2.generateNewWidgetV2.3
                @Override // X.InterfaceC487680JAo
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    if (LayeredWidgetManagerV2.this.isBatchLoading && t.supportBatch()) {
                        LayeredWidgetManagerV2.this.collectViewNew(t, c20516015Pq, view);
                    }
                }
            });
            return t;
        }
        notifyOnPostCreateView(t);
        ViewParent parent2 = c20516015Pq.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        continueLoadNew(t, c20516015Pq, resolveContentViewSync(t, viewGroup));
        return t;
    }

    public final <T extends LiveRecyclableWidget> T generateOldWidgetV2(final ViewGroup viewGroup, boolean z, final T t) {
        notifyWidgetRequestLoading(t, z);
        t.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            continueLoadOld(t, viewGroup, t.contentView);
            return t;
        }
        if (t.getLayoutId() == 0) {
            continueLoadOld(t, viewGroup, null);
            return t;
        }
        notifyOnPreCreateView(t);
        if (z) {
            resolveContentViewAsync(t, viewGroup, new C0IR4() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2.generateOldWidgetV2.1
                @Override // X.C0IR4
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    if (!LayeredWidgetManagerV2.this.isBatchLoading || !t.supportBatch()) {
                        LayeredWidgetManagerV2.this.notifyOnPostCreateView(t);
                        Fragment fragment = LayeredWidgetManagerV2.this.parentFragment;
                        if (fragment != null && !fragment.isRemoving() && !LayeredWidgetManagerV2.this.parentFragment.isDetached() && LayeredWidgetManagerV2.this.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
                            LayeredWidgetManagerV2.this.continueLoadOld(t, viewGroup, view);
                            LayeredWidgetManagerV2.this.resetScatterTime();
                        }
                    }
                }
            }, new InterfaceC487680JAo() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManagerV2.generateOldWidgetV2.2
                @Override // X.InterfaceC487680JAo
                public final void onInflateFinished(View view, int i, ViewGroup viewGroup2) {
                    if (LayeredWidgetManagerV2.this.isBatchLoading && t.supportBatch()) {
                        LayeredWidgetManagerV2.this.collectViewOld(t, viewGroup, view);
                    }
                }
            });
            return t;
        }
        notifyOnPostCreateView(t);
        continueLoadOld(t, viewGroup, resolveContentViewSync(t, viewGroup));
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager
    public <T extends LiveRecyclableWidget> T loadSubWidget(int i, Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(i, cls, objArr);
        notifyWidgetPreRequestLoading(t, false);
        scheduleLoad(cls, new AwS436S0200000_35((LiveRecyclableWidget) t, this, (LayeredWidgetManagerV2) 33));
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends LiveRecyclableWidget> boolean resolveContentViewAsync(T t, ViewGroup viewGroup, C0IR4 c0ir4, InterfaceC487680JAo interfaceC487680JAo) {
        View preloadLayout;
        View view;
        if (LiveWidgetProvider.Companion.getInstance().isEnablePriorityPreload && (view = t.contentView) != null) {
            c0ir4.onInflateFinished(view, t.getLayoutId(), viewGroup);
            return true;
        }
        FluencyOpt fluencyOpt = this.mFluencyOpt;
        if (fluencyOpt != null && (preloadLayout = fluencyOpt.getPreloadLayout(t.getLayoutId())) != null) {
            c0ir4.onInflateFinished(preloadLayout, t.getLayoutId(), viewGroup);
            return true;
        }
        getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()).LIZ(t.getLayoutId(), viewGroup, this.token, t.getThemeOverlay(this.context), com.bytedance.android.widget.WidgetManager.isEnableRecycleWrap(t), c0ir4, interfaceC487680JAo);
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager
    public <T extends LiveRecyclableWidget> T loadNew(C20516015Pq c20516015Pq, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(c20516015Pq.getId(), cls, objArr);
        notifyWidgetPreRequestLoading(t, z);
        scheduleLoad(cls, new AwS63S0310000_35(this, (LayeredWidgetManagerV2) c20516015Pq, (C20516015Pq) z, (boolean) t, 0));
        return t;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager
    public <T extends LiveRecyclableWidget> T loadOld(int i, ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(i, cls, objArr);
        notifyWidgetPreRequestLoading(t, z);
        scheduleLoad(cls, new AwS63S0310000_35((LiveRecyclableWidget) t, viewGroup, (ViewGroup) z, (boolean) this, (LayeredWidgetManagerV2) 1));
        return t;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        public final LayeredWidgetManagerV2 of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z2, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
            LayeredWidgetManagerV2 layeredWidgetManagerV2 = new LayeredWidgetManagerV2(iWidgetProvider, layeredElementManager);
            layeredWidgetManagerV2.config(z, fragment, view, fragment.getContext(), fluencyOpt, z2);
            return layeredWidgetManagerV2;
        }
    }
}
