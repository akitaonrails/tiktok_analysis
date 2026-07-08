package com.ss.android.ugc.aweme.search.pages.sug.core.ui;

import X.C01GW;
import X.C07IT;
import X.C0BD0;
import X.C0QKP;
import X.C1294250jmh;
import X.C1294720jnS;
import X.C1295950jpR;
import X.C1301990jzB;
import X.C21415018rM;
import X.C356901a3;
import X.C418440Gaw;
import X.C452501pT;
import X.C814420VxA;
import X.C946803n0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes21.dex */
public final class SugLiveLottieDrawable extends Drawable implements C0QKP, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final View LL;
    public final String LLILLJJLI;
    public final C1295950jpR LLILLL;
    public final int LLILZ;
    public final C01GW LLILZIL;
    public final float LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Drawable.Callback refreshCallback;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void LIZ() {
        Lifecycle lifecycle;
        C1295950jpR c1295950jpR = this.LLILLL;
        C1301990jzB.LIZ = (int) c1295950jpR.LLILLJJLI.LLIZLLLIL;
        c1295950jpR.stop();
        this.LLILLL.LIZLLL();
        this.LLILLL.setCallback(null);
        this.refreshCallback = null;
        Fragment fragmentLIZ = C946803n0.LIZ(this.LL);
        if (fragmentLIZ == null || (lifecycle = fragmentLIZ.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    public final void LIZIZ() {
        if (this.LLIZ || this.LLIZLLLIL) {
            this.LLILLL.LJIIJ();
            return;
        }
        C1295950jpR c1295950jpR = this.LLILLL;
        int i = this.LLILZ;
        c1295950jpR.setBounds(new Rect(0, 0, i, i));
        this.LLILLL.LJIILJJIL();
    }

    public SugLiveLottieDrawable(C21415018rM c21415018rM) {
        C1294720jnS c1294720jnS;
        Lifecycle lifecycle;
        this.LL = c21415018rM;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLILLJJLI = "sug_live_icon.json";
        C1295950jpR c1295950jpR = new C1295950jpR();
        this.refreshCallback = new Drawable.Callback() { // from class: X.0jzA
            @Override // android.graphics.drawable.Drawable.Callback
            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public final void invalidateDrawable(Drawable drawable) {
                this.LL.LL.invalidate();
            }
        };
        c1295950jpR.setCallback(this.refreshCallback);
        if (!((Boolean) C0BD0.LIZ.getValue()).booleanValue() && !C07IT.LIZ()) {
            c1294720jnS = C1294250jmh.LIZJ(c21415018rM.getContext(), this.LLILLJJLI).LIZ;
        } else {
            Context context = c21415018rM.getContext();
            c1294720jnS = C1294250jmh.LJIIJ(context, R.raw.tux_lottie_common_search_live_now, C1294250jmh.LJIIZILJ(R.raw.tux_lottie_common_search_live_now, context)).LIZ;
        }
        c1295950jpR.LJIILL(c1294720jnS);
        c1295950jpR.LJJIIJ(-1);
        c1295950jpR.LJIILLIIL(C1301990jzB.LIZ + 1);
        this.LLILLL = c1295950jpR;
        int iWidth = c1295950jpR.LL.LJIIIZ.width();
        this.LLILZ = iWidth;
        this.LLILZIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1103));
        this.LLILZLL = iLIZIZ / iWidth;
        Fragment fragmentLIZ = C946803n0.LIZ(c21415018rM);
        if (fragmentLIZ != null && (lifecycle = fragmentLIZ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        setBounds(new Rect(0, 0, iLIZIZ, iLIZIZ));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.LLILZLL;
        canvas.scale(f, f);
        if (!((Boolean) C0BD0.LIZ.getValue()).booleanValue() && !C07IT.LIZ()) {
            float f2 = this.LLILZ;
            float f3 = f2 * 0.1875f;
            canvas.drawRoundRect(0.0f, 0.0f, f2, f2, f3, f3, (Paint) this.LLILZIL.getValue());
        }
        this.LLILLL.draw(canvas);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLIZ = true;
        LIZIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLIZ = false;
        LIZIZ();
    }

    @Override // X.C0QKP
    public final void onVisibilityChanged(boolean z) {
        this.LLIZLLLIL = !z;
        LIZIZ();
    }
}
