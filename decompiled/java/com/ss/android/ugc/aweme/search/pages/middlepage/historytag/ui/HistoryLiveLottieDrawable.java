package com.ss.android.ugc.aweme.search.pages.middlepage.historytag.ui;

import X.C0QKP;
import X.C1294250jmh;
import X.C1295950jpR;
import X.C19EG;
import X.C2188811AlT;
import X.C356901a3;
import X.C418440Gaw;
import X.C657990PrR;
import X.C814420VxA;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes21.dex */
public final class HistoryLiveLottieDrawable extends Drawable implements C0QKP, DefaultLifecycleObserver, GenericLifecycleObserver {
    public final View LL;
    public final C1295950jpR LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
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
        this.LLILLJJLI.stop();
        this.LLILLJJLI.LIZLLL();
        this.LLILLJJLI.setCallback(null);
        this.refreshCallback = null;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view = this.LL;
        C19EG c19egLIZ = C657990PrR.LIZ(view);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJ = SAFHelper.LJJ(view, c19egLIZ);
        if (lifecycleOwnerLJJ == null || (lifecycle = lifecycleOwnerLJJ.getLifecycle()) == null) {
            return;
        }
        lifecycle.removeObserver(this);
    }

    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("drawable render locked = ");
        sbLIZ.append(this.LLILLL || this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLL || this.LLILZ) {
            this.LLILLJJLI.LJIIJ();
        } else {
            this.LLILLJJLI.LJIILJJIL();
        }
    }

    public HistoryLiveLottieDrawable(View view) {
        Lifecycle lifecycle;
        this.LL = view;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C1295950jpR c1295950jpR = new C1295950jpR();
        this.refreshCallback = new Drawable.Callback() { // from class: X.0jz9
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
        Context context = view.getContext();
        c1295950jpR.LJIILL(C1294250jmh.LJIIJ(context, R.raw.tux_lottie_common_search_live_now, C1294250jmh.LJIIZILJ(R.raw.tux_lottie_common_search_live_now, context)).LIZ);
        c1295950jpR.LJJIIJ(-1);
        c1295950jpR.setBounds(new Rect(0, 0, iLIZIZ, iLIZIZ));
        this.LLILLJJLI = c1295950jpR;
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = this.LL;
        C19EG c19egLIZ = C657990PrR.LIZ(view2);
        sAFHelper.getClass();
        LifecycleOwner lifecycleOwnerLJJ = SAFHelper.LJJ(view2, c19egLIZ);
        if (lifecycleOwnerLJJ != null && (lifecycle = lifecycleOwnerLJJ.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        setBounds(new Rect(0, 0, iLIZIZ, iLIZIZ));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LLILLJJLI.draw(canvas);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        LIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
        this.LLILLL = true;
        LIZIZ();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
        this.LLILLL = false;
        LIZIZ();
    }

    @Override // X.C0QKP
    public final void onVisibilityChanged(boolean z) {
        this.LLILZ = !z;
        LIZIZ();
    }
}
