package com.bytedance.ies.xelement.blur;

import X.C1312920kGo;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.ViewTreeObserverOnPreDrawListenerC1319730kRn;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.RenderNode;
import android.renderscript.Allocation;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIView;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public class UIBlurView<T extends ViewTreeObserverOnPreDrawListenerC1319730kRn> extends UIView {
    public final int[] LL;
    public final int[] LLILLJJLI;
    public final int[] LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;

    public UIBlurView() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        T t = this.mView;
        if (t != 0) {
            ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn = (ViewTreeObserverOnPreDrawListenerC1319730kRn) t;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJJIJIL = true;
            TraceEvent.LIZLLL("BlurView.destroy");
            C786410Ut5.D3(viewTreeObserverOnPreDrawListenerC1319730kRn.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1319730kRn);
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJJ = false;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJJIII = false;
            RenderNode renderNode = viewTreeObserverOnPreDrawListenerC1319730kRn.LL;
            if (renderNode != null) {
                renderNode.discardDisplayList();
                viewTreeObserverOnPreDrawListenerC1319730kRn.LL = null;
            }
            viewTreeObserverOnPreDrawListenerC1319730kRn.LIZIZ();
            Allocation allocation = viewTreeObserverOnPreDrawListenerC1319730kRn.LLJJJ;
            if (allocation != null) {
                allocation.destroy();
                viewTreeObserverOnPreDrawListenerC1319730kRn.LLJJJ = null;
            }
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJILJIL = null;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJILJILJ.setEmpty();
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJILLL = false;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLILZLL = null;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLJIJIL = null;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLIZ = null;
            viewTreeObserverOnPreDrawListenerC1319730kRn.LLILZ = false;
            TraceEvent.LJII("BlurView.destroy");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        if (this.LLILZIL) {
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) this.mView).LIZLLL(getWidth(), getHeight());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn = new ViewTreeObserverOnPreDrawListenerC1319730kRn(context);
        viewTreeObserverOnPreDrawListenerC1319730kRn.setLynxBaseUI(this);
        return viewTreeObserverOnPreDrawListenerC1319730kRn;
    }

    @InterfaceC1967107nB
    public void enableAutoBlur(ReadableMap readableMap) {
        boolean z;
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("enable")) {
            z = readableMap.getBoolean("enable");
        } else {
            z = false;
        }
        T t = this.mView;
        if (t != 0) {
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) t).setEnableBlurAutoUpdate(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        super.onBorderRadiusUpdated(i);
        T t = this.mView;
        if (t != 0) {
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) t).setHasRadiusIfRadiusChanged(this.mHasRadius);
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "blur-radius")
    public void setBlurRadius(String str) {
        if (this.mView != 0) {
            UIBody uIBody = this.mContext.LLJILJILJ;
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) this.mView).setBlurRadius(Math.round(C1312920kGo.LIZJ(str, uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), this.mContext.LLJJJ)));
        }
    }

    @InterfaceC1312540kGC(name = "android-capture-target")
    public void setCaptureTarget(String str) {
        this.LLILZLL = str;
        T t = this.mView;
        if (t != 0) {
            ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn = (ViewTreeObserverOnPreDrawListenerC1319730kRn) t;
            if (viewTreeObserverOnPreDrawListenerC1319730kRn.LLILLL) {
                HandlerHook.viewPost(viewTreeObserverOnPreDrawListenerC1319730kRn, new ARunnableS120S0100000_20(viewTreeObserverOnPreDrawListenerC1319730kRn, 155));
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-auto-blur")
    public void setEnableAutoBlur(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) t).setEnableBlurAutoUpdate(z);
        }
    }

    @InterfaceC1312540kGC(name = "experimental-update-blur-radius")
    public void setExperimentalUpdateBlurRadius(boolean z) {
        this.LLILZIL = z;
        T t = this.mView;
        if (t != 0) {
            ((ViewTreeObserverOnPreDrawListenerC1319730kRn) t).setExperimentalUpdateBlurRadius(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.view.UIView, com.lynx.tasm.behavior.ui.LynxUI
    public final AndroidView createView(Context context) {
        ViewTreeObserverOnPreDrawListenerC1319730kRn viewTreeObserverOnPreDrawListenerC1319730kRn = new ViewTreeObserverOnPreDrawListenerC1319730kRn(context);
        viewTreeObserverOnPreDrawListenerC1319730kRn.setLynxBaseUI(this);
        return viewTreeObserverOnPreDrawListenerC1319730kRn;
    }

    public UIBlurView(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = new int[2];
        this.LLILLJJLI = new int[2];
        this.LLILLL = new int[2];
        this.LLILZIL = true;
    }

    public final void LJJIJ(LynxBaseUI lynxBaseUI, int[] iArr) {
        if (lynxBaseUI.isFlatten()) {
            View view = ((LynxUI) lynxBaseUI.getDrawParent()).mView;
            if (view != null && this.LLILZ != view) {
                this.LLILZ = view;
                view.getLocationOnScreen(iArr);
                return;
            }
            return;
        }
        T t = ((LynxUI) lynxBaseUI).mView;
        if (t == 0) {
            return;
        }
        t.getLocationOnScreen(iArr);
    }
}
