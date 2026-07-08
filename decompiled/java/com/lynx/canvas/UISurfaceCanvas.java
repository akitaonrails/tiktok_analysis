package com.lynx.canvas;

import X.C1289410jet;
import X.C1299240juk;
import X.C2188811AlT;
import X.InterfaceC1312540kGC;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator;
import com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule;
import j27.s;
import t27.a;

/* JADX INFO: loaded from: classes21.dex */
public class UISurfaceCanvas extends LynxUI<FrameLayout> {
    public String LL;
    public UICanvasSurfaceView LLILLJJLI;
    public int LLILLL;
    public String LLILZ;
    public boolean LLILZIL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchEvent(C1299240juk c1299240juk) {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        UICanvasSurfaceView uICanvasSurfaceView = this.LLILLJJLI;
        if (uICanvasSurfaceView != null) {
            uICanvasSurfaceView.getClass();
            LynxLog.i("KryptonUISurfaceView", "UICanvasSurfaceView destroy");
            PlatformCanvasView platformCanvasView = uICanvasSurfaceView.LL;
            if (platformCanvasView != null) {
                platformCanvasView.LJI();
                uICanvasSurfaceView.LL.LIZJ();
                uICanvasSurfaceView.LL = null;
            }
            this.LLILLJJLI = null;
        }
        this.LLILZIL = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        Rect boundingClientRect = getBoundingClientRect();
        UICanvasSurfaceView uICanvasSurfaceView = this.LLILLJJLI;
        if (uICanvasSurfaceView != null) {
            uICanvasSurfaceView.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyLayout ");
            sbLIZ.append(boundingClientRect);
            LynxLog.i("KryptonUISurfaceView", C2188811AlT.LIZIZ(sbLIZ));
            PlatformCanvasView platformCanvasView = uICanvasSurfaceView.LL;
            if (platformCanvasView != null) {
                platformCanvasView.LIZLLL(uICanvasSurfaceView.getWidth(), uICanvasSurfaceView.getHeight(), boundingClientRect);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        C1289410jet c1289410jet;
        CanvasManager canvasManager;
        super.onPropsUpdated();
        LynxKryptonModule lynxKryptonModule = (LynxKryptonModule) this.mContext.LJIIIIZZ();
        if (lynxKryptonModule != null && (c1289410jet = lynxKryptonModule.LIZJ) != null) {
            CanvasRuntimeMediator canvasRuntimeMediator = c1289410jet.LIZ;
            a aVar = canvasRuntimeMediator != null ? canvasRuntimeMediator.LIZIZ : null;
            if (aVar != null) {
                LynxLog.i("UISurfaceCanvas", "Canvas manager is already created.");
                canvasManager = (CanvasManager) aVar;
            } else {
                LynxLog.i("UISurfaceCanvas", "Setup canvas environment from UISurfaceCanvas in lazy mode.");
                LynxLog.i("LynxKryptonHelper", "[Krypton] Setup canvas environment if introduce canvas tag in app.");
                CanvasRuntimeMediator canvasRuntimeMediator2 = c1289410jet.LIZ;
                if (canvasRuntimeMediator2 != null) {
                    LynxLog.i("KryptonCanvasRuntimeMediator", "[Krypton] setupCanvasFromUI");
                    canvasRuntimeMediator2.LIZLLL();
                }
                CanvasRuntimeMediator canvasRuntimeMediator3 = c1289410jet.LIZ;
                canvasManager = (CanvasManager) (canvasRuntimeMediator3 != null ? canvasRuntimeMediator3.LIZIZ : null);
            }
            if (canvasManager != null) {
                if (this.LLILLJJLI == null) {
                    if (this.LLILZ == null) {
                        this.LLILZ = "on-top";
                        this.LLILLL = 1;
                    }
                    this.LLILLJJLI = new UICanvasSurfaceView(this.mContext, this.LLILLL);
                    ((ViewGroup) this.mView).addView(this.LLILLJJLI, new FrameLayout.LayoutParams(-1, -1));
                }
                if (this.LLILZIL || this.LL == null) {
                    return;
                }
                UICanvasSurfaceView uICanvasSurfaceView = this.LLILLJJLI;
                uICanvasSurfaceView.LL.LJIIIIZZ(this.LL, canvasManager.getKryptonApp(), uICanvasSurfaceView.LLILLL, uICanvasSurfaceView.getWidth(), uICanvasSurfaceView.getHeight());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url:");
                sbLIZ.append(this.mContext.LLJJIII);
                sbLIZ.append(", tag_name:");
                sbLIZ.append(this.LL);
                this.LLILLJJLI.setTag(C2188811AlT.LIZIZ(sbLIZ));
                this.LLILZIL = true;
                return;
            }
        }
        throw new RuntimeException("Canvas environment has not setup!!");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.mView = frameLayout;
        return frameLayout;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        if (!isUserInteractionEnabled() || this.LLILLJJLI == null) {
            return false;
        }
        Rect boundingClientRect = this.mContext.LLJILJILJ.getBoundingClientRect();
        Rect boundingClientRect2 = getBoundingClientRect();
        PlatformCanvasView platformCanvasView = this.LLILLJJLI.LL;
        if (platformCanvasView != null) {
            platformCanvasView.LIZ(motionEvent, boundingClientRect, boundingClientRect2);
        }
        return false;
    }

    @InterfaceC1312540kGC(name = "android-surface-z-order")
    public void setAndroidSurfaceZOrder(String str) {
        int i;
        String str2 = "on-top";
        if (str != null) {
            String lowerCase = str.trim().toLowerCase();
            if ("on-top".equals(lowerCase) || "media-overlay".equals(lowerCase) || "normal".equals(lowerCase)) {
                str2 = lowerCase;
            }
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            if (TextUtils.equals(str3, str2)) {
                return;
            }
            String str4 = this.LLILZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("android-surface-z-order cannot be changed after first set. old=");
            sbLIZ.append(str4);
            sbLIZ.append(", new=");
            sbLIZ.append(str2);
            sbLIZ.append(", url=");
            sbLIZ.append(this.mContext.LLJJIII);
            sbLIZ.append(", name=");
            sbLIZ.append(this.LL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LynxLog.e("UISurfaceCanvas", strLIZIZ);
            throw new IllegalArgumentException(strLIZIZ);
        }
        if ("normal".equals(str2)) {
            i = 0;
        } else if ("media-overlay".equals(str2)) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "name")
    public void setName(String str) {
        if (!TextUtils.isEmpty(this.LL) && !TextUtils.equals(this.LL, str)) {
            String str2 = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("name cannot be changed after first set. old=");
            sbLIZ.append(str2);
            sbLIZ.append(", new=");
            sbLIZ.append(str);
            sbLIZ.append(", url=");
            sbLIZ.append(this.mContext.LLJJIII);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            LynxLog.e("UISurfaceCanvas", strLIZIZ);
            throw new IllegalArgumentException(strLIZIZ);
        }
        this.LL = str;
        super.setName(str);
    }

    public UISurfaceCanvas(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLL = 1;
    }
}
