package com.lynx.canvas;

import X.C1288370jdD;
import X.C1289410jet;
import X.C1292480jjq;
import X.C1292490jjr;
import X.C1299240juk;
import X.C1310290kCZ;
import X.C2188811AlT;
import X.EnumC1285200jY6;
import X.InterfaceC1312540kGC;
import X.TextureViewSurfaceTextureListenerC1288270jd3;
import Y.ATListenerS453S0100000_20;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator;
import com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule;
import j27.s;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import t27.a;

/* JADX INFO: loaded from: classes21.dex */
public class UICanvas extends LynxUI<TextureViewSurfaceTextureListenerC1288270jd3> {
    public String LL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchEvent(C1299240juk c1299240juk) {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        TextureViewSurfaceTextureListenerC1288270jd3 textureViewSurfaceTextureListenerC1288270jd3 = (TextureViewSurfaceTextureListenerC1288270jd3) this.mView;
        textureViewSurfaceTextureListenerC1288270jd3.getClass();
        C1288370jdD.LIZJ("KryptonCanvasView", "UICanvasView destroy");
        if (textureViewSurfaceTextureListenerC1288270jd3.mSurfaceHolder != null) {
            C1288370jdD.LIZLLL("KryptonCanvasView", "Destroy surface during UICanvasView destroyed.");
            textureViewSurfaceTextureListenerC1288270jd3.mSurfaceHolder.LIZ();
            textureViewSurfaceTextureListenerC1288270jd3.mSurfaceHolder = null;
        }
        PlatformCanvasView platformCanvasView = textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL;
        if (platformCanvasView != null) {
            platformCanvasView.LJI();
            textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL.LIZJ();
            textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        super.layout();
        Rect boundingClientRect = getBoundingClientRect();
        TextureViewSurfaceTextureListenerC1288270jd3 textureViewSurfaceTextureListenerC1288270jd3 = (TextureViewSurfaceTextureListenerC1288270jd3) this.mView;
        PlatformCanvasView platformCanvasView = textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL;
        if (platformCanvasView != null) {
            platformCanvasView.LIZLLL(textureViewSurfaceTextureListenerC1288270jd3.getWidth(), textureViewSurfaceTextureListenerC1288270jd3.getHeight(), boundingClientRect);
        }
    }

    public UICanvas(s sVar) {
        super(sVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0.LIZIZ != null) goto L12;
     */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(android.content.Context r5) {
        /*
            r4 = this;
            j27.s r0 = r4.mContext
            com.lynx.jsbridge.h r0 = r0.LJIIIIZZ()
            com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule r0 = (com.lynx.tasm.behavior.ui.krypton.LynxKryptonModule) r0
            r2 = 0
            if (r0 == 0) goto L49
            X.0jet r3 = r0.LIZJ
            if (r3 == 0) goto L49
            com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator r0 = r3.LIZ
            if (r0 == 0) goto L15
            t27.a r2 = r0.LIZIZ
        L15:
            java.lang.String r1 = "UICanvas"
            if (r2 == 0) goto L26
            java.lang.String r0 = "Canvas manager is already created."
            com.lynx.base.log.LynxLog.i(r1, r0)
        L1e:
            X.0jd3 r0 = new X.0jd3
            r0.<init>(r5)
            r4.mView = r0
            return r0
        L26:
            java.lang.String r0 = "Setup canvas environment from UICanvas in lazy mode."
            com.lynx.base.log.LynxLog.i(r1, r0)
            java.lang.String r1 = "LynxKryptonHelper"
            java.lang.String r0 = "[Krypton] Setup canvas environment if introduce canvas tag in app."
            com.lynx.base.log.LynxLog.i(r1, r0)
            com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator r2 = r3.LIZ
            if (r2 == 0) goto L40
            java.lang.String r1 = "KryptonCanvasRuntimeMediator"
            java.lang.String r0 = "[Krypton] setupCanvasFromUI"
            com.lynx.base.log.LynxLog.i(r1, r0)
            r2.LIZLLL()
        L40:
            com.lynx.tasm.behavior.ui.krypton.CanvasRuntimeMediator r0 = r3.LIZ
            if (r0 == 0) goto L49
            t27.a r0 = r0.LIZIZ
            if (r0 == 0) goto L49
            goto L1e
        L49:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Canvas environment has not setup!!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.canvas.UICanvas.createView(android.content.Context):android.view.View");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean dispatchTouch(MotionEvent motionEvent) {
        View view;
        if (isUserInteractionEnabled()) {
            s sVar = this.mContext;
            UIBody uIBody = sVar.LLJILJILJ;
            C1310290kCZ c1310290kCZ = sVar.LLLIIII;
            if (c1310290kCZ != null && c1310290kCZ.LJJJ) {
                int actionIndex = motionEvent.getActionIndex();
                int i = 5;
                if (actionIndex >= 5) {
                    return false;
                }
                int pointerCount = motionEvent.getPointerCount();
                if (pointerCount <= 5) {
                    i = pointerCount;
                }
                PointF pointF = new PointF(0.0f, 0.0f);
                s sVar2 = this.mContext;
                if (sVar2 == null) {
                    LynxLog.e("LynxUIHelper", "convertPointFromUIToRootUI failed since context is null");
                } else {
                    UIBody uIBody2 = sVar2.LLJILJILJ;
                    if (uIBody2 == null) {
                        LynxLog.e("LynxUIHelper", "convertPointFromUIToRootUI failed since root ui is null");
                    } else if (this != uIBody2) {
                        PointF pointF2 = new PointF(pointF.x, pointF.y);
                        if (isFlatten()) {
                            pointF2.x += getLeft();
                            pointF2.y += getTop();
                            if (getDrawParent() == null) {
                                LynxLog.e("LynxUIHelper", "mDrawParent of flattenUI is null, which causes the value convertPointFromUIToRootUI returns is not the correct coordinates relative to the root ui!");
                            } else {
                                view = ((LynxUI) getDrawParent()).mView;
                                pointF2.x -= view.getScrollX();
                                pointF2.y -= view.getScrollY();
                            }
                        } else {
                            view = this.mView;
                        }
                        pointF = C1292480jjq.LIZJ(pointF2, view, uIBody2.mView);
                    }
                }
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(112);
                float scale = ((TextureViewSurfaceTextureListenerC1288270jd3) this.mView).getScale();
                byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                byteBufferAllocateDirect.clear();
                byteBufferAllocateDirect.put((byte) motionEvent.getActionMasked());
                byteBufferAllocateDirect.put((byte) i);
                byteBufferAllocateDirect.put((byte) actionIndex);
                byteBufferAllocateDirect.put((byte) 1);
                byteBufferAllocateDirect.putInt((int) ((((int) pointF.x) / ((TextureViewSurfaceTextureListenerC1288270jd3) this.mView).getScale()) + 0.5f));
                byteBufferAllocateDirect.putInt((int) ((((int) pointF.y) / ((TextureViewSurfaceTextureListenerC1288270jd3) this.mView).getScale()) + 0.5f));
                float rawX = motionEvent.getRawX() - motionEvent.getX();
                float rawY = motionEvent.getRawY() - motionEvent.getY();
                for (int i2 = 0; i2 < i; i2++) {
                    PointF pointFLIZ = C1292490jjr.LIZ(uIBody, this, new PointF(motionEvent.getX(i2), motionEvent.getY(i2)));
                    byteBufferAllocateDirect.putInt(motionEvent.getPointerId(i2));
                    byteBufferAllocateDirect.putFloat(pointFLIZ.x / scale);
                    byteBufferAllocateDirect.putFloat(pointFLIZ.y / scale);
                    byteBufferAllocateDirect.putFloat((motionEvent.getX(i2) + rawX) / scale);
                    byteBufferAllocateDirect.putFloat((motionEvent.getY(i2) + rawY) / scale);
                }
                PlatformCanvasView platformCanvasView = ((TextureViewSurfaceTextureListenerC1288270jd3) this.mView).LLIZLLLIL;
                if (platformCanvasView != null) {
                    platformCanvasView.LIZIZ(byteBufferAllocateDirect);
                }
                return false;
            }
            Rect boundingClientRect = uIBody.getBoundingClientRect();
            Rect boundingClientRect2 = getBoundingClientRect();
            PlatformCanvasView platformCanvasView2 = ((TextureViewSurfaceTextureListenerC1288270jd3) this.mView).LLIZLLLIL;
            if (platformCanvasView2 != null) {
                platformCanvasView2.LIZ(motionEvent, boundingClientRect, boundingClientRect2);
            }
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "name")
    public void setName(String str) {
        a aVar;
        super.setName(str);
        LynxKryptonModule lynxKryptonModule = (LynxKryptonModule) this.mContext.LJIIIIZZ();
        if (lynxKryptonModule == null) {
            return;
        }
        C1289410jet c1289410jet = lynxKryptonModule.LIZJ;
        if (str != null && c1289410jet != null) {
            CanvasRuntimeMediator canvasRuntimeMediator = c1289410jet.LIZ;
            if (canvasRuntimeMediator != null) {
                aVar = canvasRuntimeMediator.LIZIZ;
            } else {
                aVar = null;
            }
            TextureViewSurfaceTextureListenerC1288270jd3 textureViewSurfaceTextureListenerC1288270jd3 = (TextureViewSurfaceTextureListenerC1288270jd3) this.mView;
            KryptonApp kryptonApp = ((CanvasManager) aVar).getKryptonApp();
            textureViewSurfaceTextureListenerC1288270jd3.getClass();
            float f = kryptonApp.LJIIJJI;
            if (textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL != null && textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL.LJIIIIZZ(str, kryptonApp, f, textureViewSurfaceTextureListenerC1288270jd3.getWidth(), textureViewSurfaceTextureListenerC1288270jd3.getHeight())) {
                if (kryptonApp.LIZ.LJII) {
                    textureViewSurfaceTextureListenerC1288270jd3.setOnTouchListener(new ATListenerS453S0100000_20(textureViewSurfaceTextureListenerC1288270jd3, 0));
                }
                textureViewSurfaceTextureListenerC1288270jd3.mSurfaceHolder.LIZLLL(textureViewSurfaceTextureListenerC1288270jd3.getWidth(), textureViewSurfaceTextureListenerC1288270jd3.getHeight());
                PlatformCanvasView platformCanvasView = textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL;
                long j = textureViewSurfaceTextureListenerC1288270jd3.LL;
                int width = textureViewSurfaceTextureListenerC1288270jd3.getWidth();
                int height = textureViewSurfaceTextureListenerC1288270jd3.getHeight();
                platformCanvasView.getClass();
                platformCanvasView.LJ(j, width, height, EnumC1285200jY6.SCALE_TO_FILL);
            }
            if (this.LL == null) {
                this.LL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("url:");
                sbLIZ.append(this.mContext.LLJJIII);
                sbLIZ.append(", tag_name:");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("set tag to canvas view: ");
                sbLIZ2.append(strLIZIZ);
                LynxLog.i("UICanvas", C2188811AlT.LIZIZ(sbLIZ2));
                this.mView.setTag(strLIZIZ);
            }
        }
    }

    public UICanvas(s sVar, Object obj) {
        super(sVar, obj);
    }
}
