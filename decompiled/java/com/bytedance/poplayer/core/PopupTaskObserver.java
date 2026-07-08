package com.bytedance.poplayer.core;

import X.C20651915rZ;
import X.C20656115sF;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C688120Qyw;
import X.C786410Ut5;
import X.EnumC20657015sO;
import X.InterfaceC20660515sx;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.poplayer.IStandardPopupTask;

/* JADX INFO: loaded from: classes32.dex */
public final class PopupTaskObserver implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener, GenericLifecycleObserver {
    public final C20656115sF LL;
    public final View LLILLJJLI;
    public final C688120Qyw LLILLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(" onDestroy state=");
        sbLIZ.append(this.LL.LLILZLL.getState());
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        EnumC20657015sO state = this.LL.LLILZLL.getState();
        if (state != EnumC20657015sO.DISMISSED && state != EnumC20657015sO.FAILED && state != EnumC20657015sO.IGNORED) {
            this.LL.LLILZLL.getStateWrapper().LIZ();
            InterfaceC20660515sx interfaceC20660515sx = this.LL.LLILZLL;
            if (interfaceC20660515sx instanceof IStandardPopupTask) {
                ((IStandardPopupTask) interfaceC20660515sx).onPopupDismiss();
            }
        }
        this.LLILLL.LIZIZ.getLifecycle().removeObserver(this);
        C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), this);
        this.LLILLJJLI.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LLILLJJLI.getVisibility() == 0 && this.LL.LLILZLL.getState() != EnumC20657015sO.SHOWED) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LLILLJJLI);
            sbLIZ.append(" change state from ");
            sbLIZ.append(this.LL.LLILZLL.getState().name());
            sbLIZ.append(" to SHOWED");
            C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LL.LLILZLL.getStateWrapper().LIZJ();
            return;
        }
        if (this.LLILLJJLI.getVisibility() == 0 || this.LL.LLILZLL.getState() != EnumC20657015sO.SHOWED) {
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LL.LLILLJJLI);
        sbLIZ2.append(" change state from ");
        sbLIZ2.append(this.LL.LLILZLL.getState().name());
        sbLIZ2.append(" to DISMISSED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LL.LLILZLL.getStateWrapper().LIZ();
        C786410Ut5.C3(this.LLILLJJLI.getViewTreeObserver(), this);
        this.LLILLL.LIZIZ.getLifecycle().removeObserver(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(" change state from ");
        sbLIZ.append(this.LL.LLILZLL.getState().name());
        sbLIZ.append(" to SHOWED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LLILZLL.getStateWrapper().LIZJ();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        IStandardPopupTask iStandardPopupTask;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILLJJLI);
        sbLIZ.append(" change state from ");
        sbLIZ.append(this.LL.LLILZLL.getState().name());
        sbLIZ.append(" to DISMISSED");
        C20651915rZ.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.LLILZLL.getStateWrapper().LIZ();
        InterfaceC20660515sx interfaceC20660515sx = this.LL.LLILZLL;
        if ((interfaceC20660515sx instanceof IStandardPopupTask) && (interfaceC20660515sx instanceof IStandardPopupTask) && (iStandardPopupTask = (IStandardPopupTask) interfaceC20660515sx) != null) {
            iStandardPopupTask.onPopupDismiss();
        }
        this.LLILLJJLI.removeOnAttachStateChangeListener(this);
        this.LLILLL.LIZIZ.getLifecycle().removeObserver(this);
    }

    public PopupTaskObserver(C20656115sF c20656115sF, View view, C688120Qyw c688120Qyw) {
        this.LL = c20656115sF;
        this.LLILLJJLI = view;
        this.LLILLL = c688120Qyw;
    }
}
