package com.bytedance.ies.sdk.widgets;

import X.C01GW;
import X.C09JN;
import X.C1100290ejr;
import X.C1119470fEn;
import X.C2188811AlT;
import X.C452501pT;
import X.EnumC452301pR;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: loaded from: classes18.dex */
public class LayeredWidgetManager extends RecyclableWidgetManager {
    public static final Companion Companion = new Companion();
    public final C01GW animatableRecyclableWidgets$delegate;
    public boolean checkContentViewAttached;
    public List<String> createdWidgets;
    public List<String> destroyedWidgets;
    public boolean disableDetach;
    public final LayeredElementManager<? extends LayeredElementContext> layeredElementManager;
    public boolean logDetachFailView;
    public final ArrayList<Runnable> pendingAttachRunnableList;
    public List<String> requestLoadingWidgets;

    @Override // com.bytedance.android.widget.WidgetManager
    public boolean checkWidgetContainer() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void doPendingAttach() {
        Iterator<Runnable> it2 = this.pendingAttachRunnableList.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
    }

    public final C1119470fEn<IAnimatableWidget> getAnimatableRecyclableWidgets() {
        return (C1119470fEn) this.animatableRecyclableWidgets$delegate.getValue();
    }

    public final boolean getCheckContentViewAttached() {
        return this.checkContentViewAttached;
    }

    public final boolean getDisableDetach() {
        return this.disableDetach;
    }

    public final LayeredElementManager<? extends LayeredElementContext> getLayeredElementManager() {
        return this.layeredElementManager;
    }

    public final boolean getLogDetachFailView() {
        return this.logDetachFailView;
    }

    public final class LayeredWidgetCallback extends LiveRecyclableWidget.RecyclableWidgetCallbackWrapper {
        @Override // X.C1097160eeo, X.InterfaceC1097170eep
        public void onHide(com.bytedance.android.widget.Widget widget) {
            super.onHide(widget);
            LayeredWidgetManager.this.getLayeredElementManager().onWidgetHiddenChanged(widget.getId(), true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
            IAnimatableWidget iAnimatableWidget;
            super.onPostUnload(liveRecyclableWidget);
            if ((liveRecyclableWidget instanceof IAnimatableWidget) && (iAnimatableWidget = (IAnimatableWidget) liveRecyclableWidget) != null) {
                LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJI(iAnimatableWidget.getId());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
            IAnimatableWidget iAnimatableWidget;
            super.onPreLoad(liveRecyclableWidget);
            if ((liveRecyclableWidget instanceof IAnimatableWidget) && (iAnimatableWidget = (IAnimatableWidget) liveRecyclableWidget) != null) {
                LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LJFF(iAnimatableWidget.getId(), iAnimatableWidget);
            }
        }

        @Override // X.C1097160eeo, X.InterfaceC1097170eep
        public void onShow(com.bytedance.android.widget.Widget widget) {
            super.onShow(widget);
            LayeredWidgetManager.this.getLayeredElementManager().onWidgetHiddenChanged(widget.getId(), false);
        }

        public LayeredWidgetCallback(LiveRecyclableWidget.RecyclableWidgetCallback recyclableWidgetCallback) {
            super(recyclableWidgetCallback);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallbackWrapper, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view) {
            if (view != null) {
                LayeredWidgetManager layeredWidgetManager = LayeredWidgetManager.this;
                if ((!layeredWidgetManager.getCheckContentViewAttached() || liveRecyclableWidget.getContentViewAttached()) && !layeredWidgetManager.getLayeredElementManager().detachView(view.getId(), layeredWidgetManager.getTag(liveRecyclableWidget))) {
                    super.onDetachContentView(liveRecyclableWidget, viewGroup, view);
                }
                liveRecyclableWidget.setContentViewAttached(false);
                return;
            }
            super.onDetachContentView(liveRecyclableWidget, viewGroup, view);
        }
    }

    public final String getTag(com.bytedance.android.widget.Widget widget) {
        if (this.logDetachFailView) {
            return widget.getClass().getSimpleName();
        }
        return null;
    }

    public final void logWidgetLifecycle(C09JN<String> c09jn) {
        StringBuilder sb = new StringBuilder("Loaded Widgets: ");
        List<String> list = this.requestLoadingWidgets;
        if (list != null) {
            for (String str : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        sb.append("Created Widgets: ");
        List<String> list2 = this.createdWidgets;
        if (list2 != null) {
            for (String str2 : list2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        sb.append("Destroyed Widgets: ");
        List<String> list3 = this.destroyedWidgets;
        if (list3 != null) {
            for (String str3 : list3) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str3);
                sbLIZ3.append(", ");
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        c09jn.accept(sb.toString());
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void onPostCreate(com.bytedance.android.widget.Widget widget) {
        super.onPostCreate(widget);
        if (this.logDetachFailView) {
            if (this.createdWidgets == null) {
                this.createdWidgets = new ArrayList();
            }
            List<String> list = this.createdWidgets;
            if (list != null) {
                list.add(widget.getClass().getSimpleName());
            }
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void onPostDestroy(com.bytedance.android.widget.Widget widget) {
        super.onPostDestroy(widget);
        if (this.logDetachFailView) {
            if (this.destroyedWidgets == null) {
                this.destroyedWidgets = new ArrayList();
            }
            List<String> list = this.destroyedWidgets;
            if (list != null) {
                list.add(widget.getClass().getSimpleName());
            }
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public View onProvideContainer(int i) {
        View viewFindViewById = this.contentView.findViewById(i);
        if (viewFindViewById instanceof C1100290ejr) {
            return this.contentView;
        }
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        return this.contentView;
    }

    public final void setCheckContentViewAttached(boolean z) {
        this.checkContentViewAttached = z;
    }

    public final void setDisableDetach(boolean z) {
        this.disableDetach = z;
    }

    public final void setLogDetachFailView(boolean z) {
        this.logDetachFailView = z;
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager unload(com.bytedance.android.widget.Widget widget) throws Exception {
        if (this.logDetachFailView) {
            try {
                super.unload(widget);
                return this;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LayeredElementConfiguration.reportException("WidgetException", e);
                throw e;
            }
        }
        super.unload(widget);
        return this;
    }

    public LayeredWidgetManager(IWidgetProvider iWidgetProvider, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
        super(iWidgetProvider);
        this.layeredElementManager = layeredElementManager;
        this.widgetCallback = new LayeredWidgetCallback((LiveRecyclableWidget.RecyclableWidgetCallback) this.widgetCallback);
        layeredElementManager.setAnimationListener(new AnimationListener() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManager.1
            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onHideAnimationEnd(int i) {
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if (iAnimatableWidgetLIZLLL != null) {
                    iAnimatableWidgetLIZLLL.onHideAnimationEnd();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onHideAnimationStart(int i) {
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if (iAnimatableWidgetLIZLLL != null) {
                    iAnimatableWidgetLIZLLL.onHideAnimationStart();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onShowAnimationEnd(int i) {
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if (iAnimatableWidgetLIZLLL != null) {
                    iAnimatableWidgetLIZLLL.onShowAnimationEnd();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.AnimationListener
            public void onShowAnimationStart(int i) {
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if (iAnimatableWidgetLIZLLL != null) {
                    iAnimatableWidgetLIZLLL.onShowAnimationStart();
                }
            }
        });
        layeredElementManager.setHiddenChangeObserver(new IHiddenChangeObserver() { // from class: com.bytedance.ies.sdk.widgets.LayeredWidgetManager.2
            @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeObserver
            public void onHide(int i) {
                IHiddenChangeAwareWidget iHiddenChangeAwareWidget;
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if ((iAnimatableWidgetLIZLLL instanceof IHiddenChangeAwareWidget) && (iHiddenChangeAwareWidget = (IHiddenChangeAwareWidget) iAnimatableWidgetLIZLLL) != null) {
                    iHiddenChangeAwareWidget.onHide();
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeObserver
            public void onShow(int i) {
                IHiddenChangeAwareWidget iHiddenChangeAwareWidget;
                IAnimatableWidget iAnimatableWidgetLIZLLL = LayeredWidgetManager.this.getAnimatableRecyclableWidgets().LIZLLL(i);
                if ((iAnimatableWidgetLIZLLL instanceof IHiddenChangeAwareWidget) && (iHiddenChangeAwareWidget = (IHiddenChangeAwareWidget) iAnimatableWidgetLIZLLL) != null) {
                    iHiddenChangeAwareWidget.onShow();
                }
            }
        });
        this.animatableRecyclableWidgets$delegate = C452501pT.LIZ(EnumC452301pR.NONE, AFwS205S0000000_17.get$arr$(111));
        this.pendingAttachRunnableList = new ArrayList<>();
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void onWidgetRequestLoading(com.bytedance.android.widget.Widget widget, boolean z) {
        super.onWidgetRequestLoading(widget, z);
        if (this.logDetachFailView) {
            if (this.requestLoadingWidgets == null) {
                this.requestLoadingWidgets = new ArrayList();
            }
            List<String> list = this.requestLoadingWidgets;
            if (list != null) {
                list.add(widget.getClass().getSimpleName());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void realAttachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        ILayeredWidget iLayeredWidget;
        View viewFindViewById = this.contentView.findViewById(widget.getId());
        if ((widget instanceof ILayeredWidget) && (iLayeredWidget = (ILayeredWidget) widget) != null) {
            iLayeredWidget.setContentViewAttached(true);
        }
        if (this.layeredElementManager.isWidgetPlaceholderElement(widget.getId())) {
            view.setId(widget.getId());
            this.layeredElementManager.attachView(widget.getId(), view, getTag(widget));
        } else if (viewFindViewById instanceof C1100290ejr) {
            view.setId(widget.getId());
            this.layeredElementManager.attachView(widget.getId(), view, getTag(widget));
        } else {
            viewGroup.addView(view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager
    public void attachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        if (viewGroup != null && view != null && widget != null && widget.enableAttachOpt() && view.getParent() == null) {
            realAttachContentView(widget, viewGroup, view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager
    public void continueLoadOld(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) throws Exception {
        if (this.logDetachFailView) {
            try {
                super.continueLoadOld(widget, viewGroup, view);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LayeredElementConfiguration.reportException("WidgetException", e);
                throw e;
            }
        }
        super.continueLoadOld(widget, viewGroup, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.WidgetManager
    public void onAttachContentView(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        ILayeredWidget iLayeredWidget;
        if (viewGroup == null || view == null || widget == 0) {
            return;
        }
        if ((widget instanceof ILayeredWidget) && (iLayeredWidget = (ILayeredWidget) widget) != null) {
            iLayeredWidget.setLayeredElementContext(this.layeredElementManager.getLayeredElementContext());
        }
        if (widget.enableAttachOpt()) {
            return;
        }
        realAttachContentView(widget, viewGroup, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    @Override // com.bytedance.android.widget.WidgetManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetachContentView(com.bytedance.android.widget.Widget r6, android.view.ViewGroup r7, android.view.View r8) {
        /*
            r5 = this;
            if (r7 != 0) goto L3
            return
        L3:
            if (r8 != 0) goto L6
            return
        L6:
            if (r6 != 0) goto L9
            return
        L9:
            boolean r0 = r5.disableDetach
            if (r0 == 0) goto Le
            return
        Le:
            boolean r1 = r6 instanceof com.bytedance.ies.sdk.widgets.ILayeredWidget
            r0 = 0
            if (r1 == 0) goto L42
            r4 = r6
            com.bytedance.ies.sdk.widgets.ILayeredWidget r4 = (com.bytedance.ies.sdk.widgets.ILayeredWidget) r4
            if (r4 == 0) goto L1b
            r4.setLayeredElementContext(r0)
        L1b:
            boolean r0 = r5.checkContentViewAttached
            r3 = 0
            if (r0 == 0) goto L29
            if (r4 == 0) goto L41
            boolean r1 = r4.getContentViewAttached()
            r0 = 1
            if (r1 != r0) goto L3e
        L29:
            com.bytedance.ies.sdk.widgets.LayeredElementManager<? extends com.bytedance.ies.sdk.widgets.LayeredElementContext> r2 = r5.layeredElementManager
            int r1 = r8.getId()
            java.lang.String r0 = r5.getTag(r6)
            boolean r0 = r2.detachView(r1, r0)
            if (r0 != 0) goto L3c
            X.C786410Ut5.LJJJLZIJ(r8, r7)
        L3c:
            if (r4 == 0) goto L41
        L3e:
            r4.setContentViewAttached(r3)
        L41:
            return
        L42:
            r4 = r0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.sdk.widgets.LayeredWidgetManager.onDetachContentView(com.bytedance.android.widget.Widget, android.view.ViewGroup, android.view.View):void");
    }

    public static final class Companion {
        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
            LayeredWidgetManager layeredWidgetManager = new LayeredWidgetManager(iWidgetProvider, layeredElementManager);
            layeredWidgetManager.config(z, fragment, view, fragment.getContext(), fluencyOpt);
            return layeredWidgetManager;
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z2, LayeredElementManager<? extends LayeredElementContext> layeredElementManager) {
            LayeredWidgetManager layeredWidgetManager = new LayeredWidgetManager(iWidgetProvider, layeredElementManager);
            layeredWidgetManager.config(z, fragment, view, fragment.getContext(), fluencyOpt, z2);
            return layeredWidgetManager;
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2) {
            return of(z, fragment, view, iWidgetProvider, fluencyOpt, layeredElementManager, z2, false, 0);
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2, boolean z3) {
            return of(z, fragment, view, iWidgetProvider, fluencyOpt, layeredElementManager, z2, z3, 0);
        }

        public final LayeredWidgetManager of(boolean z, Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, LayeredElementManager<? extends LayeredElementContext> layeredElementManager, boolean z2, boolean z3, int i) {
            Context context;
            LayeredWidgetManager layeredWidgetManager = new LayeredWidgetManager(iWidgetProvider, layeredElementManager);
            if (z2) {
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
            } else {
                context = fragment.getContext();
            }
            layeredWidgetManager.config(z, fragment, view, context, fluencyOpt, z3, i);
            return layeredWidgetManager;
        }
    }
}
