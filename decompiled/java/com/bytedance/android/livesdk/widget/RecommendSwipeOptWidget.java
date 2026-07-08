package com.bytedance.android.livesdk.widget;

import X.C0IGP;
import X.C21601619gM;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.C800330VaR;
import Y.ARunnableS107S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveFollowToRecommendWidgetOptExp;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class RecommendSwipeOptWidget extends LiveRecyclableWidget {
    public C21601619gM LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final float LLJILJILJ = 0.12f;
    public BPEAHandler LLJILLL;
    public ValueAnimator LLJJ;
    public float LLJJI;
    public boolean LLJJIII;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkr;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        View view = this.LLILLJJLI;
        if (view != null) {
            view.clearAnimation();
        }
        BPEAHandler bPEAHandler = this.LLJILLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void y1() {
        ViewGroup viewGroup;
        Context context;
        View view = this.LLILLJJLI;
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null || (context = viewGroup.getContext()) == null) {
            return;
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            view2.bringToFront();
            View view3 = this.LLILZIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
                return;
            }
            return;
        }
        View view4 = new View(context);
        C786410Ut5.W5(view4, new ViewGroup.LayoutParams(-1, -1));
        view4.setClickable(false);
        view4.setFocusable(false);
        this.LLILZIL = view4;
        view4.setBackground(C800330VaR.LIZIZ(context, R.drawable.ecs));
        viewGroup.addView(view4);
        view4.bringToFront();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILZ = findViewById(R.id.mqk);
        this.LLILLL = findViewById(R.id.mpy);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        this.LLJILLL = new BPEAHandler(Looper.getMainLooper());
    }

    public final void x1(boolean z) {
        int i = this.LLJIJIL;
        if (i < 0) {
            return;
        }
        if (this.LLILZLL >= this.LLJILJILJ) {
            if (this.LLJ) {
                this.LLJIJIL = i + 1;
            } else {
                this.LLJIJIL = i - 1;
            }
            C784440Upu.LIZ().LIZIZ(new C0IGP(this.LLJIJIL, this.LLJ));
            if ((LiveFollowToRecommendWidgetOptExp.needRoundCornerAndOnceToast() || LiveFollowToRecommendWidgetOptExp.needRoundCornerAndVibrationAndOnceToast()) && this.LLJ && !z && !this.LLJJIII) {
                this.LLJJIII = true;
                C766270U4b.LIZLLL(2131841526);
            }
        }
        z1(true);
        this.LLIZLLLIL = false;
    }

    public final void z1(boolean z) {
        float translationY;
        long j;
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            translationY = view.getTranslationY();
        } else {
            translationY = 0.0f;
        }
        int i = this.LLJILJIL;
        if (i > 0) {
            j = (long) ((translationY / i) * DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        } else {
            j = 0;
        }
        long jAbs = Math.abs(j);
        if (jAbs > 0 && z) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(translationY, 0.0f);
            this.LLJJ = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(jAbs);
            }
            ValueAnimator valueAnimator2 = this.LLJJ;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS257S0100000_7(this, 11));
            }
            ValueAnimator valueAnimator3 = this.LLJJ;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        } else {
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                C786410Ut5.ed(view2, 0.0f);
            }
        }
        hide();
        this.LLJIJIL = -1;
        this.LLJILJIL = 0;
        this.LLIZ = 0.0f;
        BPEAHandler bPEAHandler = this.LLJILLL;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(200L, bPEAHandler, new ARunnableS107S0100000_7(this, 105));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1(int r10, float r11, float r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.RecommendSwipeOptWidget.A1(int, float, float, boolean, boolean):void");
    }
}
