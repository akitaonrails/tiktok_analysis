package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C0HAS;
import X.C0IGP;
import X.C0IJT;
import X.C1324720kZq;
import X.C16F5;
import X.C21601619gM;
import X.C417850GZz;
import X.C452501pT;
import X.C464770IKl;
import X.C474500IjA;
import X.C497740JfY;
import X.C784440Upu;
import X.C786410Ut5;
import X.C817403Hg;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS26S0110000_7;
import Y.AUListenerS76S0110000_7;
import android.animation.ValueAnimator;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class RecommendSwipeNewWidget extends LiveRecyclableWidget {
    public C21601619gM LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public LinearLayout LLILZIL;
    public LinearLayout LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public LiveIconView LLJIJIL;
    public LiveIconView LLJILJIL;
    public RelativeLayout LLJILJILJ;
    public RelativeLayout LLJILLL;
    public C1324720kZq LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public float LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public float LLJLIL;
    public BPEAHandler LLJLL;
    public List<String> LLJLLIL;
    public View LLJLLL;
    public boolean LLJZ;
    public ValueAnimator LLL;
    public ValueAnimator LLLF;
    public String LLLFF;
    public LivePlayFragment LLLFFI;
    public float LLJJIJIL = -1.0f;
    public float LLJLILLLLZIIL = 0.5f;
    public final int LLJZIJLIL = (int) C497740JfY.LIZIZ(28.0f);
    public final C01GW LLLFZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(99));
    public final C01GW LLLI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(98));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hks;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void y1() {
        this.LLJJL = false;
        if (this.LLJILLL == null || this.LLJILJILJ == null || this.LLJJIJI < 0.14f || Math.max(I1().getLayoutParams().height, H1().getLayoutParams().height) < ((int) C497740JfY.LIZIZ(40.0f))) {
            return;
        }
        this.LLJJL = true;
    }

    public final C16F5 A1() {
        C16F5 c16f5 = this.LLIZ;
        if (c16f5 != null) {
            return c16f5;
        }
        return null;
    }

    public final C16F5 B1() {
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            return c16f5;
        }
        return null;
    }

    public final LiveIconView C1() {
        LiveIconView liveIconView = this.LLJILJIL;
        if (liveIconView != null) {
            return liveIconView;
        }
        return null;
    }

    public final LiveIconView D1() {
        LiveIconView liveIconView = this.LLJIJIL;
        if (liveIconView != null) {
            return liveIconView;
        }
        return null;
    }

    public final LinearLayout E1() {
        LinearLayout linearLayout = this.LLILZIL;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final LinearLayout F1() {
        LinearLayout linearLayout = this.LLILZLL;
        if (linearLayout != null) {
            return linearLayout;
        }
        return null;
    }

    public final C1324720kZq G1() {
        C1324720kZq c1324720kZq = this.LLJJ;
        if (c1324720kZq != null) {
            return c1324720kZq;
        }
        return null;
    }

    public final RelativeLayout H1() {
        RelativeLayout relativeLayout = this.LLJILJILJ;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    public final RelativeLayout I1() {
        RelativeLayout relativeLayout = this.LLJILLL;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        return null;
    }

    public final C16F5 J1() {
        C16F5 c16f5 = this.LLJ;
        if (c16f5 != null) {
            return c16f5;
        }
        return null;
    }

    public final int L1() {
        int iLIZIZ;
        int measuredHeight;
        if (this.LLJJJJ) {
            iLIZIZ = ((int) C497740JfY.LIZIZ(76.0f)) + D1().getMeasuredHeight() + J1().getMeasuredHeight();
            measuredHeight = A1().getMeasuredHeight();
        } else {
            iLIZIZ = ((int) C497740JfY.LIZIZ(76.0f)) + C1().getMeasuredHeight() + B1().getMeasuredHeight();
            C16F5 c16f5 = this.LLIZLLLIL;
            if (c16f5 == null) {
                c16f5 = null;
            }
            measuredHeight = c16f5.getMeasuredHeight();
        }
        return iLIZIZ + measuredHeight;
    }

    public final boolean M1() {
        return ((Boolean) this.LLLI.getValue()).booleanValue();
    }

    public final void O1() {
        if (this.LLJILLL == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = I1().getLayoutParams();
        layoutParams.height = 0;
        C786410Ut5.e6(I1(), layoutParams);
        ViewGroup.LayoutParams layoutParams2 = H1().getLayoutParams();
        layoutParams2.height = 0;
        C786410Ut5.e6(I1(), layoutParams2);
        C786410Ut5.i5(D1(), 0.0f);
        C786410Ut5.i5(C1(), 0.0f);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) D1().getLayoutParams();
        layoutParams3.bottomMargin = 0;
        C786410Ut5.w6(D1(), layoutParams3);
        C786410Ut5.k5(J1(), 0.0f);
        C786410Ut5.k5(B1(), 0.0f);
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) C1().getLayoutParams();
        layoutParams4.topMargin = 0;
        C786410Ut5.w6(C1(), layoutParams4);
    }

    public final void P1() {
        float height;
        float fLIZIZ;
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 == null) {
            return;
        }
        int measuredHeight = c16f5.getMeasuredHeight();
        if (Math.abs(this.LLJJJ) <= measuredHeight || measuredHeight <= 0) {
            ViewGroup.LayoutParams layoutParams = I1().getLayoutParams();
            layoutParams.height = 0;
            C786410Ut5.e6(I1(), layoutParams);
            C786410Ut5.LLIIL(I1(), 8);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) D1().getLayoutParams();
            layoutParams2.bottomMargin = 0;
            C786410Ut5.w6(D1(), layoutParams2);
            C786410Ut5.i5(D1(), 0.0f);
            C786410Ut5.k5(J1(), 0.0f);
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(24.0f);
        C786410Ut5.LLIIL(I1(), 0);
        ViewGroup.LayoutParams layoutParams3 = I1().getLayoutParams();
        layoutParams3.height = Math.min(((int) C497740JfY.LIZIZ(8.0f)) + iLIZIZ2 + iLIZIZ, ((int) Math.abs(this.LLJJJ)) - measuredHeight);
        C786410Ut5.e6(I1(), layoutParams3);
        int i = measuredHeight + iLIZIZ;
        float f = i;
        if (Math.abs(this.LLJJJ) <= f || i <= 0) {
            return;
        }
        C786410Ut5.i5(D1(), Math.min(1.0f, (((Math.abs(this.LLJJJ) - f) * 1.0f) / iLIZIZ) + 0.2f));
        int i2 = i + iLIZIZ2;
        float f2 = i2;
        if (Math.abs(this.LLJJJ) > f2) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) I1().getLayoutParams();
            layoutParams4.bottomMargin = (int) Math.min(((int) C497740JfY.LIZIZ(28.0f)) * 1.0f, Math.abs(this.LLJJJ) - f2);
            C786410Ut5.e6(I1(), layoutParams4);
            C786410Ut5.k5(J1(), Math.min(1.0f, (((Math.abs(this.LLJJJ) - f2) * 1.0f) / iLIZIZ2) + 0.2f));
        } else {
            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) I1().getLayoutParams();
            layoutParams5.bottomMargin = 0;
            C786410Ut5.e6(I1(), layoutParams5);
            C786410Ut5.k5(J1(), 0.0f);
        }
        float fLIZIZ2 = ((int) C497740JfY.LIZIZ(28.0f)) + i2;
        if (Math.abs(this.LLJJJ) > fLIZIZ2) {
            RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) D1().getLayoutParams();
            layoutParams6.bottomMargin = (int) Math.min(((int) C497740JfY.LIZIZ(8.0f)) * 1.0f, Math.abs(this.LLJJJ) - fLIZIZ2);
            C786410Ut5.w6(D1(), layoutParams6);
        } else {
            RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) D1().getLayoutParams();
            layoutParams7.bottomMargin = 0;
            C786410Ut5.w6(D1(), layoutParams7);
        }
        float fLIZIZ3 = ((int) C497740JfY.LIZIZ(36.0f)) + i2;
        if (Math.abs(this.LLJJJ) > fLIZIZ3) {
            FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) F1().getLayoutParams();
            layoutParams8.topMargin = (int) Math.min(((int) C497740JfY.LIZIZ(20.0f)) * 1.0f, Math.abs(this.LLJJJ) - fLIZIZ3);
            C786410Ut5.d6(F1(), layoutParams8);
        } else {
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) F1().getLayoutParams();
            layoutParams9.topMargin = (int) C497740JfY.LIZIZ(2.0f);
            C786410Ut5.d6(F1(), layoutParams9);
        }
        if (Math.abs(this.LLJJJ) >= i2 + ((int) C497740JfY.LIZIZ(54.0f))) {
            C16F5 c16f52 = this.LLIZLLLIL;
            int measuredHeight2 = (c16f52 != null ? c16f52 : null).getMeasuredHeight();
            int iLIZIZ3 = (int) C497740JfY.LIZIZ(16.0f);
            int iLIZIZ4 = (int) C497740JfY.LIZIZ(24.0f);
            if (C497740JfY.LJIL()) {
                height = measuredHeight2 + iLIZIZ3 + iLIZIZ4;
                fLIZIZ = C497740JfY.LIZIZ(56.0f);
            } else {
                RelativeLayout relativeLayoutI1 = I1();
                height = measuredHeight2 + (relativeLayoutI1 != null ? relativeLayoutI1.getHeight() : 0);
                fLIZIZ = C497740JfY.LIZIZ(60.0f);
            }
            this.LLJJJJLIIL = height + (((int) fLIZIZ) * 1.0f);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        View view = this.LLILLJJLI;
        if (view != null) {
            view.clearAnimation();
        }
        View view2 = this.LLILLL;
        if (view2 != null) {
            view2.clearAnimation();
        }
        View view3 = this.LLILZ;
        if (view3 != null) {
            view3.clearAnimation();
        }
        BPEAHandler bPEAHandler = this.LLJLL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLJLLL = null;
        ValueAnimator valueAnimator = this.LLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLLF;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLJJJJLIIL = 0.0f;
        this.LLJJL = false;
    }

    public final void z1() {
        float height;
        float fLIZIZ;
        if (this.LLIZ == null) {
            return;
        }
        int measuredHeight = A1().getMeasuredHeight();
        float f = measuredHeight;
        if (Math.abs(this.LLJJJ) <= f || measuredHeight <= 0) {
            ViewGroup.LayoutParams layoutParams = H1().getLayoutParams();
            layoutParams.height = 0;
            C786410Ut5.e6(H1(), layoutParams);
            C786410Ut5.LLIIL(H1(), 8);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) C1().getLayoutParams();
            layoutParams2.bottomMargin = 0;
            C786410Ut5.w6(C1(), layoutParams2);
            C786410Ut5.i5(C1(), 0.0f);
            C786410Ut5.k5(B1(), 0.0f);
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(24.0f);
        ViewGroup.LayoutParams layoutParams3 = H1().getLayoutParams();
        layoutParams3.height = Math.min(((int) C497740JfY.LIZIZ(8.0f)) + iLIZIZ2 + iLIZIZ, (int) (Math.abs(this.LLJJJ) - f));
        C786410Ut5.e6(H1(), layoutParams3);
        C786410Ut5.LLIIL(H1(), 0);
        int i = measuredHeight + iLIZIZ;
        float f2 = i;
        if (Math.abs(this.LLJJJ) > f2) {
            C786410Ut5.i5(C1(), Math.min(1.0f, (((Math.abs(this.LLJJJ) - f2) * 1.0f) / iLIZIZ) + 0.2f));
            int i2 = i + iLIZIZ2;
            float f3 = i2;
            if (Math.abs(this.LLJJJ) > f3) {
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) H1().getLayoutParams();
                layoutParams4.topMargin = (int) Math.min(((int) C497740JfY.LIZIZ(28.0f)) * 1.0f, Math.abs(this.LLJJJ) - f3);
                C786410Ut5.e6(H1(), layoutParams4);
                C786410Ut5.k5(B1(), Math.min(1.0f, (((Math.abs(this.LLJJJ) - f3) * 1.0f) / iLIZIZ2) + 0.2f));
            } else {
                C786410Ut5.k5(B1(), 0.0f);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) H1().getLayoutParams();
                layoutParams5.topMargin = 0;
                C786410Ut5.e6(H1(), layoutParams5);
            }
            float fLIZIZ2 = ((int) C497740JfY.LIZIZ(28.0f)) + i2;
            if (Math.abs(this.LLJJJ) > fLIZIZ2) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) C1().getLayoutParams();
                layoutParams6.topMargin = (int) Math.min(((int) C497740JfY.LIZIZ(8.0f)) * 1.0f, Math.abs(this.LLJJJ) - fLIZIZ2);
                C786410Ut5.w6(C1(), layoutParams6);
            } else {
                RelativeLayout.LayoutParams layoutParams7 = (RelativeLayout.LayoutParams) C1().getLayoutParams();
                layoutParams7.topMargin = 0;
                C786410Ut5.w6(C1(), layoutParams7);
            }
            float fLIZIZ3 = ((int) C497740JfY.LIZIZ(36.0f)) + i2;
            if (Math.abs(this.LLJJJ) > fLIZIZ3) {
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) E1().getLayoutParams();
                layoutParams8.bottomMargin = (int) Math.min(((int) C497740JfY.LIZIZ(20.0f)) * 1.0f, Math.abs(this.LLJJJ) - fLIZIZ3);
                C786410Ut5.d6(E1(), layoutParams8);
            } else {
                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) E1().getLayoutParams();
                layoutParams9.bottomMargin = (int) C497740JfY.LIZIZ(2.0f);
                C786410Ut5.d6(E1(), layoutParams9);
            }
            if (Math.abs(this.LLJJJ) >= i2 + ((int) C497740JfY.LIZIZ(54.0f))) {
                int measuredHeight2 = A1().getMeasuredHeight();
                int iLIZIZ3 = (int) C497740JfY.LIZIZ(16.0f);
                int iLIZIZ4 = (int) C497740JfY.LIZIZ(24.0f);
                if (C497740JfY.LJIL()) {
                    height = measuredHeight2 + iLIZIZ3 + iLIZIZ4;
                    fLIZIZ = C497740JfY.LIZIZ(56.0f);
                } else {
                    RelativeLayout relativeLayoutH1 = H1();
                    height = measuredHeight2 + (relativeLayoutH1 != null ? relativeLayoutH1.getHeight() : 0);
                    fLIZIZ = C497740JfY.LIZIZ(60.0f);
                }
                this.LLJJJJLIIL = height + (((int) fLIZIZ) * 1.0f);
            }
        }
    }

    public final void Q1(boolean z) {
        if (this.LLJI != null && this.LLJ != null) {
            if (z) {
                B1().setText(C497740JfY.LJIJI(2131841525));
                J1().setText(C497740JfY.LJIJI(2131841527));
            } else {
                B1().setText(C497740JfY.LJIJI(2131841720));
                J1().setText(C497740JfY.LJIJI(2131841721));
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLILZLL = (LinearLayout) findViewById(R.id.mqk);
        this.LLILZIL = (LinearLayout) findViewById(R.id.mpy);
        this.LLIZ = (C16F5) findViewById(R.id.yoa);
        this.LLIZLLLIL = (C16F5) findViewById(R.id.yw1);
        this.LLJ = (C16F5) findViewById(R.id.wsv);
        this.LLJI = (C16F5) findViewById(R.id.g80);
        this.LLJIJIL = (LiveIconView) findViewById(R.id.kbn);
        this.LLJILJIL = (LiveIconView) findViewById(R.id.kbm);
        this.LLJILJILJ = (RelativeLayout) findViewById(R.id.t53);
        this.LLJILLL = (RelativeLayout) findViewById(R.id.t54);
        this.LLJJ = (C1324720kZq) findViewById(R.id.mu2);
        this.LLJJI = findViewById(R.id.y9u);
        this.LLJJIII = findViewById(R.id.cbo);
        View view = this.LLJJI;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        WeakReference<BitmapDrawable> weakReference = C0HAS.LIZ;
        view.setBackground(C0HAS.LIZ(this.context));
        View view3 = this.LLJJIII;
        if (view3 != null) {
            view2 = view3;
        }
        view2.setBackground(C0HAS.LIZ(this.context));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r7) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.RecommendSwipeNewWidget.onLoad(java.lang.Object[]):void");
    }

    public final void x1(final boolean z) {
        String str;
        Long lValueOf;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig enterRoomConfig2;
        EnterRoomConfig.RoomsData roomsData2;
        long j;
        float f;
        float f2;
        View view;
        if (this.LLJJLIIIJLLLLLLLZ < 0) {
            return;
        }
        if (!z) {
            y1();
        }
        if (this.LLJJIJI >= this.LLJLILLLLZIIL && this.LLJJL) {
            if (this.LLJJJJ) {
                this.LLJJLIIIJLLLLLLLZ++;
            } else {
                this.LLJJLIIIJLLLLLLLZ--;
            }
            if (!z && (view = this.LLJLLL) != null) {
                C786410Ut5.ed(view, 0.0f);
            }
            C784440Upu.LIZ().LIZIZ(new C0IGP(this.LLJJLIIIJLLLLLLLZ, this.LLJJJJ));
            N1(z, true);
        } else if (this.LLJJL && this.LLJJJJLIIL > 0.0f && Math.abs(this.LLJJJ) > this.LLJJJJLIIL + ((int) C497740JfY.LIZIZ(3.0f))) {
            View view2 = getView();
            if (view2 != null) {
                C786410Ut5.T4(view2, 1.0f);
            }
            float fAbs = Math.abs(this.LLJJJ);
            float f3 = this.LLJJJJLIIL;
            if (fAbs > f3 && f3 > 0.0f) {
                ValueAnimator valueAnimator = this.LLLF;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.LLJZ = false;
                float fAbs2 = Math.abs(this.LLJJJ);
                float f4 = this.LLJJJJLIIL;
                float f5 = fAbs2 - f4;
                if (f4 > 0.0f) {
                    j = (long) ((f5 / f4) * DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
                } else {
                    j = 0;
                }
                long jAbs = Math.abs(j);
                final C817403Hg c817403Hg = new C817403Hg();
                c817403Hg.element = -1.0f;
                float f6 = this.LLJJJ;
                if (f6 > 0.0f) {
                    c817403Hg.element = 1.0f;
                }
                final C817403Hg c817403Hg2 = new C817403Hg();
                float f7 = this.LLJJJJLIIL * c817403Hg.element;
                c817403Hg2.element = f7;
                if (z) {
                    this.LLLF = ValueAnimator.ofFloat(f6, f7);
                } else {
                    boolean z2 = this.LLJJJJ;
                    if (z2) {
                        f = (this.LLJLIL * this.LLJJIJIL) + this.LLJZIJLIL;
                    } else {
                        f = (this.LLJLIL * this.LLJJIJIL) - this.LLJZIJLIL;
                    }
                    float f8 = f6 + f;
                    if (z2) {
                        f2 = (this.LLJLIL * this.LLJJIJIL) + this.LLJZIJLIL;
                    } else {
                        f2 = (this.LLJLIL * this.LLJJIJIL) - this.LLJZIJLIL;
                    }
                    float f9 = f7 + f2;
                    c817403Hg2.element = f9;
                    this.LLLF = ValueAnimator.ofFloat(f8, f9);
                }
                ValueAnimator valueAnimator2 = this.LLLF;
                if (valueAnimator2 != null) {
                    valueAnimator2.setDuration(jAbs);
                }
                ValueAnimator valueAnimator3 = this.LLLF;
                if (valueAnimator3 != null) {
                    valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0IEY
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            if (z) {
                                View view3 = this.LLILLJJLI;
                                if (view3 != null) {
                                    C786410Ut5.ed(view3, ((Float) valueAnimator4.getAnimatedValue()).floatValue());
                                }
                                if (this.M1()) {
                                    View view4 = this.LLILZ;
                                    if (view4 != null) {
                                        C786410Ut5.ed(view4, ((Float) valueAnimator4.getAnimatedValue()).floatValue());
                                    }
                                    View view5 = this.LLILLL;
                                    if (view5 != null) {
                                        C786410Ut5.ed(view5, ((Float) valueAnimator4.getAnimatedValue()).floatValue());
                                    }
                                }
                            } else {
                                View view6 = this.LLJLLL;
                                if (view6 != null) {
                                    C786410Ut5.ed(view6, ((Float) valueAnimator4.getAnimatedValue()).floatValue());
                                }
                            }
                            if (valueAnimator4.getAnimatedFraction() >= 0.98f) {
                                RecommendSwipeNewWidget recommendSwipeNewWidget = this;
                                if (!recommendSwipeNewWidget.LLJZ) {
                                    recommendSwipeNewWidget.LLJZ = true;
                                    if (z) {
                                        View view7 = recommendSwipeNewWidget.LLILLJJLI;
                                        if (view7 != null) {
                                            C786410Ut5.ed(view7, c817403Hg2.element);
                                        }
                                        if (this.M1()) {
                                            View view8 = this.LLILZ;
                                            if (view8 != null) {
                                                C786410Ut5.ed(view8, c817403Hg2.element);
                                            }
                                            View view9 = this.LLILLL;
                                            if (view9 != null) {
                                                C786410Ut5.ed(view9, c817403Hg2.element);
                                            }
                                        }
                                    } else {
                                        View view10 = recommendSwipeNewWidget.LLJLLL;
                                        if (view10 != null) {
                                            C786410Ut5.ed(view10, c817403Hg2.element);
                                        }
                                    }
                                    RecommendSwipeNewWidget recommendSwipeNewWidget2 = this;
                                    recommendSwipeNewWidget2.LLJJJ = recommendSwipeNewWidget2.LLJJJJLIIL * c817403Hg.element;
                                    recommendSwipeNewWidget2.x1(z);
                                }
                            }
                        }
                    });
                }
                ValueAnimator valueAnimator4 = this.LLLF;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        } else if (this.LLJJL) {
            View view3 = getView();
            if (view3 != null) {
                C786410Ut5.T4(view3, 1.0f);
            }
            Q1(false);
            C464770IKl c464770IKl = C464770IKl.LIZ;
            C464770IKl.LJIIJ = Math.min(this.LLJJJ, this.LLJL * 1.0f);
            BPEAHandler bPEAHandler = this.LLJLL;
            String str2 = null;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacksAndMessages(null);
            }
            BPEAHandler bPEAHandler2 = this.LLJLL;
            if (bPEAHandler2 != null) {
                C786410Ut5.LJLIIL(1500L, bPEAHandler2, new ARunnableS26S0110000_7(this, z, 2));
            }
            if (z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_end_to_recommend_guide_show");
                if (!this.LLJJJJ) {
                    str = "up";
                } else {
                    str = "down";
                }
                c474500IjALIZ.LJJII(str, "draw_action");
                LivePlayFragment livePlayFragment = this.LLLFFI;
                if (livePlayFragment != null && (enterRoomConfig2 = livePlayFragment.g1) != null && (roomsData2 = enterRoomConfig2.mRoomsData) != null) {
                    lValueOf = Long.valueOf(roomsData2.roomId);
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "last_room_id");
                LivePlayFragment livePlayFragment2 = this.LLLFFI;
                if (livePlayFragment2 != null && (enterRoomConfig = livePlayFragment2.g1) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    str2 = roomsData.userId;
                }
                c474500IjALIZ.LJJII(str2, "last_anchor_id");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LIZ();
            }
        } else {
            View view4 = getView();
            if (view4 != null) {
                C786410Ut5.T4(view4, 1.0f);
            }
            N1(z, true);
        }
        this.LLJJJIL = false;
    }

    public final void N1(boolean z, boolean z2) {
        long jAbs;
        float f;
        ValueAnimator valueAnimator = this.LLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.LLJJJJLIIL > 0.0f) {
            jAbs = (long) ((Math.abs(this.LLJJJ) / this.LLJJJJLIIL) * DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        } else {
            jAbs = 0;
        }
        long jAbs2 = Math.abs(jAbs);
        if (jAbs2 > 0 && z2) {
            float f2 = this.LLJJJ;
            if (z) {
                this.LLL = ValueAnimator.ofFloat(f2, 0.0f);
            } else {
                if (this.LLJJJJ) {
                    f = this.LLJZIJLIL + 0.0f;
                } else {
                    f = 0.0f - this.LLJZIJLIL;
                }
                this.LLL = ValueAnimator.ofFloat(f2, f);
            }
            ValueAnimator valueAnimator2 = this.LLL;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(jAbs2);
            }
            ValueAnimator valueAnimator3 = this.LLL;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new AUListenerS76S0110000_7(this, z, 0));
            }
            ValueAnimator valueAnimator4 = this.LLL;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        } else {
            if (!z) {
                View view = this.LLJLLL;
                if (view != null) {
                    C786410Ut5.ed(view, 0.0f);
                }
            } else {
                View view2 = this.LLILLJJLI;
                if (view2 != null) {
                    C786410Ut5.ed(view2, 0.0f);
                }
                View view3 = this.LLILLJJLI;
                if (view3 != null) {
                    C786410Ut5.Ob(view3, 1.0f);
                }
                View view4 = this.LLILLJJLI;
                if (view4 != null) {
                    C786410Ut5.pc(view4, 1.0f);
                }
                if (M1()) {
                    if (this.LLILLJJLI != null) {
                        View view5 = this.LLILZ;
                        if (view5 != null) {
                            C786410Ut5.Jc(view5, 0.0f);
                        }
                        View view6 = this.LLILLL;
                        if (view6 != null) {
                            ViewGroup.LayoutParams layoutParams = view6.getLayoutParams();
                            layoutParams.width = 0;
                            C786410Ut5.W5(view6, layoutParams);
                        }
                        View view7 = this.LLILZ;
                        if (view7 != null) {
                            ViewGroup.LayoutParams layoutParams2 = view7.getLayoutParams();
                            layoutParams2.width = 0;
                            C786410Ut5.W5(view7, layoutParams2);
                        }
                    }
                    View view8 = this.LLILLL;
                    if (view8 != null) {
                        C786410Ut5.ed(view8, 0.0f);
                    }
                    View view9 = this.LLILLL;
                    if (view9 != null) {
                        C786410Ut5.pc(view9, 1.0f);
                    }
                    View view10 = this.LLILZ;
                    if (view10 != null) {
                        C786410Ut5.ed(view10, 0.0f);
                    }
                    View view11 = this.LLILZ;
                    if (view11 != null) {
                        C786410Ut5.pc(view11, 1.0f);
                    }
                }
            }
            hide();
            O1();
        }
        View view12 = this.LLILLJJLI;
        if (view12 != null) {
            C417850GZz.LIZ((int) 0.0f, view12);
        }
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJL = 0;
        this.LLJJJ = 0.0f;
        this.LLJJIJIIJIL = 0.0f;
        C464770IKl.LJIIJ = 0.0f;
        BPEAHandler bPEAHandler = this.LLJLL;
        if (bPEAHandler != null) {
            C786410Ut5.LJLIIL(200L, bPEAHandler, new ARunnableS107S0100000_7(this, 104));
        }
    }
}
