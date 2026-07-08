package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.AbstractC1387200mCc;
import X.C0SXF;
import X.C12ES;
import X.C1344030l4z;
import X.C1349270lDR;
import X.C1388190mED;
import X.C1906580ziK;
import X.C1C7U;
import X.C214906198m;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.InterfaceC1352000lHq;
import X.InterfaceC1355580lNc;
import Y.ARunnableS118S0100000_18;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class KeyboardFakePopupWindow extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC1355580lNc {
    public final Context LL;
    public final View LLILLJJLI;
    public int LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final KeyboardFakePopupWindow$handler$1 LLIZLLLIL;
    public InterfaceC1352000lHq LLJ;
    public final int LLILLL = 6;
    public final Rect LLIZ = new Rect();

    @Override // X.InterfaceC1355580lNc
    public final void release() {
        this.LLILZLL = 0;
        this.LLILZIL = false;
        removeMessages(1);
        C786410Ut5.C3(getContentView().getViewTreeObserver(), this);
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ == null || activityLIZ.isFinishing()) {
            return;
        }
        dismiss();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        InterfaceC1352000lHq interfaceC1352000lHq;
        int iLJIIIIZZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Window window;
        View decorView;
        View viewFindViewById;
        View viewFindViewById2;
        if (this.LLILZ == 0) {
            Activity activityLIZ2 = C1388190mED.LIZ(this.LL);
            if (activityLIZ2 == null || (viewFindViewById2 = activityLIZ2.findViewById(R.id.content)) == null) {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                iLJIIIIZZ = (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null || (window = activityLIZ.getWindow()) == null || (decorView = window.getDecorView()) == null || (viewFindViewById = decorView.findViewById(R.id.content)) == null) ? C12ES.LJIIIIZZ(C1388190mED.LIZ(this.LL)) : viewFindViewById.getHeight();
            } else {
                iLJIIIIZZ = viewFindViewById2.getHeight();
            }
            this.LLILZ = iLJIIIIZZ;
        }
        int height = this.LLILLJJLI.getHeight();
        this.LLILZ = height;
        getContentView().getWindowVisibleDisplayFrame(this.LLIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KeyboardPopupWindow: rb=");
        sbLIZ.append(this.LLIZ.bottom);
        sbLIZ.append(", sh=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append("  commentPageH=");
        sbLIZ.append(height);
        C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ));
        int i = this.LLIZ.bottom;
        if (i > this.LLILZ) {
            this.LLILZ = i;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("KeyboardPopupWindow: sh=rb=");
            sbLIZ2.append(this.LLILZ);
            C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ2));
        }
        int i2 = this.LLILZ;
        if (i2 != C1349270lDR.LJII) {
            C1349270lDR.LJII = i2;
            C1349270lDR.LIZIZ().storeInt("keyboard_container_height", i2);
        }
        int i3 = this.LLILZ - this.LLIZ.bottom;
        boolean zLJIL = C0SXF.LJIL(this.LL);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("KeyboardPopupWindow: return kh=");
        sbLIZ3.append(i3);
        sbLIZ3.append(", sh=");
        sbLIZ3.append(this.LLILZ);
        sbLIZ3.append("  ");
        sbLIZ3.append(zLJIL);
        C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ3));
        double d = i3;
        int i4 = this.LLILZ;
        if (d <= ((double) i4) * 0.62d || zLJIL) {
            boolean z = i3 > i4 / this.LLILLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("KeyboardPopupWindow: vi=");
            sbLIZ4.append(z);
            sbLIZ4.append(", kh=");
            sbLIZ4.append(i3);
            C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ4));
            if (!Intrinsics.LJFF(C2214201BlK.LJFF(), this.LL) && (!this.LLILZIL || z)) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("KeyboardPopupWindow: return ");
                sbLIZ5.append(this.LLILZIL);
                sbLIZ5.append(", ");
                sbLIZ5.append(z);
                C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("KeyboardPopupWindow: try show ");
            sbLIZ6.append(this.LLILZIL);
            sbLIZ6.append(", ");
            sbLIZ6.append(z);
            C1344030l4z.LIZJ("KeyboardFakePopupWindow", C2188811AlT.LIZIZ(sbLIZ6));
            if (!z) {
                if (this.LLILZIL) {
                    this.LLILZIL = false;
                    this.LLILZLL = 0;
                    InterfaceC1352000lHq interfaceC1352000lHq2 = this.LLJ;
                    if (interfaceC1352000lHq2 != null) {
                        interfaceC1352000lHq2.LLILII();
                        return;
                    }
                    return;
                }
                return;
            }
            this.LLILZIL = true;
            int i5 = this.LLILZLL;
            if (i3 != i5 && i3 > i5) {
                Message messageObtainMessage = obtainMessage(1);
                messageObtainMessage.arg1 = i3;
                removeMessages(1);
                C786410Ut5.LJLJLJ(this.LLIZLLLIL, messageObtainMessage, 0L);
            }
            if (this.LLILZLL != i3 && i3 > 0 && (interfaceC1352000lHq = this.LLJ) != null) {
                interfaceC1352000lHq.j(i3);
            }
            this.LLILZLL = i3;
        }
    }

    @Override // X.InterfaceC1355580lNc
    public final void show() {
        C786410Ut5.x3(getContentView().getViewTreeObserver(), this);
        HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS118S0100000_18(this, 7));
    }

    @Override // X.InterfaceC1355580lNc
    public final void LJIJJ(InterfaceC1352000lHq interfaceC1352000lHq) {
        this.LLJ = interfaceC1352000lHq;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow$handler$1] */
    public KeyboardFakePopupWindow(Context context, View view) {
        this.LL = context;
        this.LLILLJJLI = view;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLIZLLLIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.KeyboardFakePopupWindow$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("KeyboardFakePopupWindow@48f4.handler$1");
                super.handleMessage(message);
                InterfaceC1352000lHq interfaceC1352000lHq = this.LL.LLJ;
                if (interfaceC1352000lHq != null) {
                    interfaceC1352000lHq.LLLLZI(message.arg1);
                }
                C1C7U.LIZIZ("KeyboardFakePopupWindow@48f4.handler$1");
            }
        };
        View view2 = new View(context);
        view2.setId(com.zhiliaoapp.musically.R.id.f749m2m);
        setContentView(view2);
        setWidth(0);
        setHeight(-1);
        setBackgroundDrawable(new ColorDrawable(0));
        setSoftInputMode(16);
        setInputMethodMode(1);
        setWindowLayoutType(1003);
    }
}
