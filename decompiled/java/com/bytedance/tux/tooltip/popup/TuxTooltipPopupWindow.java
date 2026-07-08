package com.bytedance.tux.tooltip.popup;

import X.AbstractC1391670mJp;
import X.AbstractC1563340qmi;
import X.C0P0T;
import X.C1235730iGJ;
import X.C1388190mED;
import X.C1391600mJi;
import X.C1391610mJj;
import X.C1391620mJk;
import X.C1391690mJr;
import X.C1565730qqZ;
import X.C1954807lC;
import X.C199Y;
import X.C19FO;
import X.C214906198m;
import X.C731670Smz;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C994003uc;
import X.EnumC1235690iGF;
import X.EnumC682280QpW;
import X.InterfaceC1340660kzY;
import X.InterfaceC1348590lCL;
import X.InterfaceC1391650mJn;
import Y.ARunnableS121S0100000_21;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxTooltipPopupWindow extends C214906198m implements C0P0T, GenericLifecycleObserver {
    public final Context LL;
    public C1391600mJi LLILLJJLI;
    public final View LLILLL;
    public boolean LLILZ;
    public final C1391610mJj LLILZIL;
    public AbstractC1391670mJp LLILZLL = C1391690mJr.LIZ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.C0P0T
    public final void LJ() {
        this.LLILZIL.LJIIIZ();
        C1391620mJk c1391620mJk = this.LLILZIL.LJIIL;
        update(c1391620mJk.LIZ, c1391620mJk.LIZIZ, -1, -1);
    }

    @Override // X.C0P0T
    public final C1391600mJi LJIILL() {
        return this.LLILZIL.LIZIZ;
    }

    public final void LJJIIJZLJL() {
        Activity activityLIZ = C1388190mED.LIZ(this.LL);
        if (activityLIZ == null || activityLIZ.isFinishing()) {
            return;
        }
        InterfaceC1348590lCL interfaceC1348590lCL = this.LLILLJJLI.LJIILIIL;
        if (interfaceC1348590lCL != null) {
            interfaceC1348590lCL.LIZ(this.LLILZIL.LJIIL);
        }
        View view = this.LLILLJJLI.LIZIZ;
        if (view == null) {
            View decorView = activityLIZ.getWindow().getDecorView();
            C1391620mJk c1391620mJk = this.LLILZIL.LJIIL;
            showAtLocation(decorView, 0, c1391620mJk.LIZ, c1391620mJk.LIZIZ);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
        } else {
            C1391620mJk c1391620mJk2 = this.LLILZIL.LJIIL;
            showAtLocation(view, 0, c1391620mJk2.LIZ, c1391620mJk2.LIZIZ);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
        }
        InterfaceC1391650mJn interfaceC1391650mJn = this.LLILLJJLI.LJJIFFI;
        if (interfaceC1391650mJn != null) {
            interfaceC1391650mJn.onShow();
        }
        C1391610mJj c1391610mJj = this.LLILZIL;
        c1391610mJj.LJIIJ(c1391610mJj.LJIIL, true);
        if (this.LLILLJJLI.LJII != -1001) {
            C786410Ut5.LJLIIL(this.LLILLJJLI.LJII, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 15));
        }
    }

    public final void LJJIIZ() {
        if (!this.LLILLJJLI.LJIIJJI) {
            super.dismiss();
            return;
        }
        if (this.LLILZ) {
            return;
        }
        C1391610mJj c1391610mJj = this.LLILZIL;
        c1391610mJj.LJIIJ(c1391610mJj.LJIIL, false);
        this.LLILZ = true;
        C786410Ut5.LJLIIL(this.LLILLJJLI.LJIIJ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(this, 14));
    }

    public final void LJJIJ() {
        Integer numLIZ;
        Context context = this.LL;
        if (context instanceof C199Y) {
            AbstractC1563340qmi abstractC1563340qmi = (AbstractC1563340qmi) ((C19FO) context).getLifecycle();
            EnumC682280QpW enumC682280QpW = EnumC682280QpW.IS_FINISHING;
            if (abstractC1563340qmi.LJI(enumC682280QpW) && (numLIZ = C1565730qqZ.LIZ(enumC682280QpW.getValue(), context)) != null) {
                LJJIIJZLJL();
                C1565730qqZ.LIZIZ(numLIZ.intValue(), context);
                return;
            }
        }
        LJJIIJZLJL();
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        this.LLILZLL = C1391690mJr.LIZ;
        LJJIIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LLILZLL = new AbstractC1391670mJp() { // from class: X.0mJq
        };
        super.dismiss();
    }

    @Override // X.C0P0T
    public final void show() {
        C1391600mJi c1391600mJi = this.LLILLJJLI;
        if (c1391600mJi.LIZIZ != null || (c1391600mJi.LJIILJJIL >= 0 && c1391600mJi.LJIILL >= 0)) {
            if (this.LLILZIL.LJIIIZ()) {
                LJJIJ();
            } else {
                int i = C1235730iGJ.LIZ[this.LLILLJJLI.LIZLLL.ordinal()];
                if (i == 1) {
                    this.LLILLJJLI.LIZLLL = EnumC1235690iGF.END;
                } else if (i == 2) {
                    this.LLILLJJLI.LIZLLL = EnumC1235690iGF.START;
                } else if (i == 3) {
                    this.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                } else {
                    if (i != 4) {
                        throw new C1954807lC();
                    }
                    this.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
                }
                C1391600mJi c1391600mJi2 = this.LLILLJJLI;
                C1391610mJj c1391610mJj = this.LLILZIL;
                c1391610mJj.LIZIZ = c1391600mJi2;
                this.LLILLJJLI = c1391600mJi2;
                c1391610mJj.LJI();
                this.LLILZIL.LJII();
                if (this.LLILZIL.LJIIIZ() || this.LLILLJJLI.LJIIIZ) {
                    LJJIJ();
                }
            }
        }
        C787990Uvd.LIZ.getClass();
        C994003uc.LIZ();
    }

    @Override // android.widget.PopupWindow, X.C0P0T
    public final boolean isShowing() {
        return super.isShowing();
    }

    @Override // X.C0P0T
    public final void LIZLLL(boolean z) {
        setOutsideTouchable(z);
    }

    @Override // X.C0P0T
    public final void LJIIIZ(InterfaceC1340660kzY interfaceC1340660kzY) {
        this.LLILLJJLI.LJJI = interfaceC1340660kzY;
    }

    @Override // X.C0P0T
    public final void LJIIL(C731670Smz c731670Smz) {
        this.LLILZLL = c731670Smz;
        LJJIIZ();
    }

    @Override // X.C0P0T
    public final void LJIILJJIL(Function2<? super View, ? super Boolean, AnimatorSet> function2) {
        this.LLILLJJLI.LJJII = function2;
    }

    @Override // X.C0P0T
    public final void LJIJ(InterfaceC1391650mJn interfaceC1391650mJn) {
        this.LLILLJJLI.LJJIFFI = interfaceC1391650mJn;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TuxTooltipPopupWindow(android.content.Context r10, X.C1391600mJi r11) {
        /*
            r9 = this;
            r6 = r9
            r6.<init>()
            r4 = r10
            r6.LL = r4
            r6.LLILLJJLI = r11
            X.0mJr r0 = X.C1391690mJr.LIZ
            r6.LLILZLL = r0
            android.view.View r0 = r11.LIZIZ
            r3 = 0
            if (r0 == 0) goto L72
            androidx.lifecycle.LifecycleOwner r2 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r0)
            if (r2 != 0) goto L22
            android.app.Activity r2 = X.C1388190mED.LIZ(r4)
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L7d
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
        L22:
            r1 = 0
            r6.setClippingEnabled(r1)
            if (r2 == 0) goto L31
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            if (r0 == 0) goto L31
            r0.addObserver(r6)
        L31:
            r0 = -2
            r6.setWidth(r0)
            r6.setHeight(r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r6.setBackgroundDrawable(r0)
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r4)
            r0 = 2131558408(0x7f0d0008, float:1.874213E38)
            android.view.View r7 = X.C786410Ut5.Sd(r0, r1, r3)
            r6.LLILLL = r7
            r6.setContentView(r7)
            X.0mJj r3 = new X.0mJj
            X.0mJi r5 = r6.LLILLJJLI
            r8 = 1
            r3.<init>(r4, r5, r6, r7, r8)
            r6.LLILZIL = r3
            X.0mJm r0 = new X.0mJm
            r0.<init>()
            r6.setOnDismissListener(r0)
            r3.LJFF()
            X.0mJi r0 = r6.LLILLJJLI
            r3.LIZIZ = r0
            r6.LLILLJJLI = r0
            r3.LJI()
            r3.LJII()
            return
        L72:
            android.app.Activity r2 = X.C1388190mED.LIZ(r4)
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L7d
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            goto L22
        L7d:
            r2 = r3
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow.<init>(android.content.Context, X.0mJi):void");
    }

    @Override // X.C0P0T
    public final void LJJII(boolean z, View.OnClickListener onClickListener) {
        this.LLILLJJLI.LJIL = onClickListener;
        if (z) {
            setTouchable(true);
            C786410Ut5.O7((FrameLayout) this.LLILLL.findViewById(R.id.eu1), onClickListener);
        } else {
            setTouchable(false);
        }
    }
}
