package com.bytedance.android.livesdk.widget;

import X.C0IQV;
import X.C1143920fsE;
import X.C1324720kZq;
import X.C16F5;
import X.C465540INk;
import X.C465560INm;
import X.C466240IQc;
import X.C497740JfY;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveSlideUpGuideWidget extends LiveRecyclableWidget {
    public C1324720kZq LL;
    public C16F5 LLILLJJLI;
    public C1143920fsE LLILLL;
    public String LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hms;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LL = null;
        this.LLILLJJLI = null;
        C1143920fsE c1143920fsE = this.LLILLL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        this.LLILLL = null;
        if (!C466240IQc.LIZ) {
            C465540INk c465540INk = C465540INk.LIZ;
            ValueAnimator valueAnimator = C465540INk.LJII;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = C465540INk.LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            C465540INk.LJII = null;
            C465540INk.LJI = null;
            return;
        }
        C0IQV c0iqv = C0IQV.LL;
        C465560INm c465560INm = C0IQV.LLJJIII;
        ValueAnimator valueAnimator3 = c465560INm.LIZJ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = c465560INm.LIZIZ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        c465560INm.LIZJ = null;
        c465560INm.LIZIZ = null;
        c465560INm.LJFF = false;
        c465560INm.LIZLLL = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LL = (C1324720kZq) findViewById(R.id.vk7);
        this.LLILLJJLI = (C16F5) findViewById(R.id.wsr);
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, 0.0f);
        }
        C1324720kZq c1324720kZq = this.LL;
        if (c1324720kZq != null) {
            C786410Ut5.h5(c1324720kZq, 0.0f);
        }
        C1143920fsE c1143920fsE = new C1143920fsE();
        this.LLILLL = c1143920fsE;
        c1143920fsE.LIZIZ = "tiktok_live_watch_resource_normal_1";
        c1143920fsE.LIZJ = "ttlive_arrow_up.webp";
        C1324720kZq c1324720kZq2 = this.LL;
        if (c1324720kZq2 != null) {
            c1143920fsE.LIZ = c1324720kZq2;
        }
        c1143920fsE.LJFF = true;
        c1143920fsE.LJI = Integer.MAX_VALUE;
        c1143920fsE.LJIILIIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            String strLJIJI = this.LLILZ;
            if (strLJIJI == null) {
                strLJIJI = C497740JfY.LJIJI(2131844517);
            }
            c16f5.setText(strLJIJI);
        }
        C1143920fsE c1143920fsE = this.LLILLL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZLLL();
        }
        C1143920fsE c1143920fsE2 = this.LLILLL;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LJFF();
        }
    }

    public final void x1(float f) {
        C1324720kZq c1324720kZq = this.LL;
        if (c1324720kZq != null) {
            C786410Ut5.h5(c1324720kZq, f);
        }
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, f);
        }
    }
}
