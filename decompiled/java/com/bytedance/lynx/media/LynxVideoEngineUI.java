package com.bytedance.lynx.media;

import X.AbstractC1299960jvu;
import X.C1298530jtb;
import X.C1313270kHN;
import X.C1313900kIO;
import X.C1491120ouE;
import X.C1AML;
import X.C21581619d8;
import X.C2188811AlT;
import X.C259800zU;
import X.EnumC1311070kDp;
import X.InterfaceC1491100ouC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import j27.s;

/* JADX INFO: loaded from: classes34.dex */
public final class LynxVideoEngineUI extends AbsMediaEngineView<C21581619d8> {
    public final String LLLFFI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        return this.LLJLILLLLZIIL ? EnumC1311070kDp.PRESENTED : EnumC1311070kDp.PENDING;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        boolean z;
        TraceEvent.LIZIZ("LynxVideoEngineUI.createView");
        C21581619d8 c21581619d8 = new C21581619d8(context);
        c21581619d8.setBackgroundColor(-16777216);
        s sVarLIZIZ = C1298530jtb.LIZIZ(context);
        if (sVarLIZIZ != null) {
            AbstractC1299960jvu abstractC1299960jvu = sVarLIZIZ.LLL;
            this.LLJL = abstractC1299960jvu;
            if (abstractC1299960jvu != null) {
                z = true;
            } else {
                z = false;
            }
            this.LLJLIL = z;
        }
        this.LLJIJIL = "x-video-engine";
        TraceEvent.LJII("LynxVideoEngineUI.createView");
        return c21581619d8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onBorderRadiusUpdated(int i) {
        C1313900kIO c1313900kIOLJIIL;
        boolean z;
        super.onBorderRadiusUpdated(i);
        C259800zU c259800zU = new C259800zU();
        C1313270kHN c1313270kHN = this.mLynxBackground;
        if (c1313270kHN != null && (c1313900kIOLJIIL = c1313270kHN.LJIIL()) != null) {
            int paddingLeft = this.mView.getPaddingLeft();
            int paddingRight = this.mView.getPaddingRight();
            int paddingTop = this.mView.getPaddingTop();
            int paddingBottom = this.mView.getPaddingBottom();
            c1313900kIOLJIIL.LIZLLL(this.mView.getWidth() + paddingLeft + paddingRight, this.mView.getHeight() + paddingTop + paddingBottom);
            float[] fArrLIZ = c1313900kIOLJIIL.LIZ();
            T t = 0;
            t = 0;
            if (fArrLIZ != null) {
                int i2 = 0;
                if (fArrLIZ.length == 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (Boolean.valueOf(z).booleanValue()) {
                    float f = paddingLeft;
                    float f2 = paddingTop;
                    float f3 = paddingRight;
                    float f4 = paddingBottom;
                    float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                    do {
                        fArrLIZ[i2] = Math.max(0.0f, fArrLIZ[i2] - fArr[i2]);
                        i2++;
                    } while (i2 < 8);
                    t = fArrLIZ;
                }
            }
            c259800zU.element = t;
        }
        ((C21581619d8) this.mView).setBorderRadius((float[]) c259800zU.element);
    }

    public LynxVideoEngineUI(s sVar, Object obj) {
        super(sVar, obj);
        this.LLLFFI = "LynxVideoEngineUI";
    }

    @InterfaceC1967107nB
    public final void exitFullScreen(ReadableMap readableMap, Callback callback) {
        String str = this.LLLFFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke exitFullScreen");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        C1AML c1aml = (C1AML) this.mView;
        C1491120ouE c1491120ouE = new C1491120ouE(callback);
        InterfaceC1491100ouC mediaView = c1aml.getMediaView();
        if (mediaView != null) {
            LynxLog.i("LynxVideoEnginePlayableWrapperView", "invoke exitFullScreen");
            mediaView.LJI(c1491120ouE);
        }
    }

    @InterfaceC1967107nB
    public final void requestFullScreen(ReadableMap readableMap, Callback callback) {
        boolean z;
        String str = this.LLLFFI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getSign());
        sbLIZ.append(" invoke requestFullScreen");
        LynxLog.i(str, C2188811AlT.LIZIZ(sbLIZ));
        if (readableMap.hasKey("landscape")) {
            z = readableMap.getBoolean("landscape");
        } else {
            z = true;
        }
        C1AML c1aml = (C1AML) this.mView;
        C1491120ouE c1491120ouE = new C1491120ouE(callback);
        InterfaceC1491100ouC mediaView = c1aml.getMediaView();
        if (mediaView != null) {
            LynxLog.i("LynxVideoEnginePlayableWrapperView", "invoke enterFullScreen");
            if (z) {
                mediaView.LJIILJJIL(c1491120ouE);
            } else {
                mediaView.LIZJ(c1491120ouE);
            }
        }
    }
}
