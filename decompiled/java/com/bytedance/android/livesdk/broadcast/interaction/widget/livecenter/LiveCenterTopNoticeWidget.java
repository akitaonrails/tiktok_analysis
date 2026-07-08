package com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter;

import X.AbstractC19416810xq;
import X.C01GW;
import X.C098200Yq;
import X.C0IJT;
import X.C1143680frq;
import X.C12YD;
import X.C12YE;
import X.C1322110kVd;
import X.C16F5;
import X.C16FS;
import X.C189200o6;
import X.C19389410tQ;
import X.C19659111vp;
import X.C19747812Oe;
import X.C19ME;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC772190UQv;
import X.InterpolatorC2268801DrC;
import Y.ALAdapterS24S0100000_29;
import Y.ATListenerS461S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.TouchDelegate;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LiveCenterTopNoticeDismissEvent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.state.LiveCenterTopNoticeShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS143S1100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveCenterTopNoticeWidget extends LiveWidget {
    public View LL;
    public View LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public LiveIconView LLILZIL;
    public View LLILZLL;
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public TuxIconView LLJI;
    public C1322110kVd LLJIJIL;
    public C1322110kVd LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C16FS LLJJ;
    public Boolean LLJJI;
    public float LLJJIII;
    public C19389410tQ LLJJIJI;
    public Pair<Float, Float> LLJJIJIIJIL;
    public AbstractC19416810xq LLJJIJIL;
    public boolean LLJJJ;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public VelocityTracker LLJJL;
    public ObjectAnimator LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJLL;
    public AwS143S1100000_29 LLJLLIL;
    public C19747812Oe LLJLLL;
    public final ATListenerS461S0100000_29 LLJZ;
    public int LLJJJIL = -1;
    public final float LLJL = 120.0f;
    public final float LLJLIL = 1000.0f;
    public final int LLJLILLLLZIIL = (int) C497740JfY.LIZIZ(36);

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h6c;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float B1() {
        /*
            r4 = this;
            X.14i1<java.lang.Integer> r0 = X.InterfaceC772190UQv.g4
            java.lang.Object r3 = r0.LIZIZ()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            if (r3 == 0) goto L49
            int r0 = r3.intValue()
            if (r0 == 0) goto L1a
            int r1 = r3.intValue()
            r0 = 1
            if (r1 != r0) goto L49
            float r2 = r4.LLJJIII
        L1a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "resolvedInitialSnapY: saved="
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = " → resolved="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " (isTop="
            r1.append(r0)
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationPositionSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationPositionSetting.INSTANCE
            boolean r0 = r0.isDefaultTop()
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "LiveCenterTopNoticeWidget"
            X.C20441214yg.LIZIZ(r0, r1)
            return r2
        L49:
            com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationPositionSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationPositionSetting.INSTANCE
            boolean r0 = r0.isDefaultBottom()
            if (r0 == 0) goto L1a
            float r2 = r4.LLJJIII
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget.B1():float");
    }

    public final void C1() {
        String strLJIJI;
        ViewGroup.LayoutParams layoutParams;
        C19389410tQ c19389410tQ = this.LLJJIJI;
        if (c19389410tQ == null) {
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC772190UQv.h4;
        Boolean boolLIZIZ = c20337914i1.LIZIZ();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(boolLIZIZ, bool)) {
            return;
        }
        c20337914i1.LJFF(bool);
        int i = this.LLJJJIL;
        if (i == 0) {
            strLJIJI = C497740JfY.LJIJI(2131853394);
        } else if (i != 1) {
            return;
        } else {
            strLJIJI = C497740JfY.LJIJI(2131853395);
        }
        View view = getView();
        float translationY = view != null ? view.getTranslationY() : 0.0f;
        if (!a0.LJJJIL(strLJIJI)) {
            if (c19389410tQ.LIZJ == null) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19389410tQ.LIZ.getContext()), R.layout.h6b, c19389410tQ.LIZ, false);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                ViewGroup viewGroup = c19389410tQ.LIZ;
                if (!(viewGroup instanceof ConstraintLayout)) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    C19ME c19me = new C19ME(-1, -2);
                    c19me.topToBottom = c19389410tQ.LIZIZ;
                    ((ViewGroup.MarginLayoutParams) c19me).topMargin = iLIZIZ;
                    layoutParams = c19me;
                } else {
                    C20441214yg.LJIIL("TopNotice#Tips", "ensureInflated: parent is not ConstraintLayout, fallback to MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                    marginLayoutParams.topMargin = iLIZIZ;
                    layoutParams = marginLayoutParams;
                }
                c19389410tQ.LIZ.addView(viewTd, layoutParams);
                c19389410tQ.LIZJ = viewTd;
                c19389410tQ.LIZLLL = (C16F5) viewTd.findViewById(R.id.yby);
                C20441214yg.LIZIZ("TopNotice#Tips", "ensureInflated: tips view added to parent");
            }
            View view2 = c19389410tQ.LIZJ;
            if (view2 != null) {
                C16F5 c16f5 = c19389410tQ.LIZLLL;
                if (c16f5 != null) {
                    c16f5.setText(strLJIJI);
                }
                C786410Ut5.ed(view2, translationY);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show: hint=");
                sbLIZ.append(strLJIJI);
                sbLIZ.append(" translationY=");
                sbLIZ.append(translationY);
                C20441214yg.LIZIZ("TopNotice#Tips", C2188811AlT.LIZIZ(sbLIZ));
                C473410IhP.LIZ().removeCallbacks(c19389410tQ.LJ);
                C473410IhP.LIZJ(c19389410tQ.LJ, Mp4ScreenVideoLoadTimeout.CONTROL);
                c20337914i1.LJFF(bool);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("showTipsForCurrentSnap: tips shown and marked as seen, translationY=");
        sbLIZ2.append(translationY);
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z1() {
        /*
            r5 = this;
            java.lang.Boolean r1 = r5.LLJJI
            if (r1 == 0) goto Lb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        Lb:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor> r0 = com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor r0 = (com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor) r0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L71
            X.0elA r0 = r0.OK1()
            if (r0 == 0) goto L71
            float r0 = r0.LJ()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            float r0 = r1.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L71
            float r2 = r1.floatValue()
        L31:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 > 0) goto L63
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L37:
            r5.LLJJI = r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "isLowEndDevice score: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", limit: "
            r1.append(r0)
            float r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleLowDeviceScore.getValue()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LiveCenterTopNoticeWidget"
            X.C20441214yg.LIZIZ(r0, r1)
            java.lang.Boolean r1 = r5.LLJJI
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L63:
            float r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleLowDeviceScore.getValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6c
            r4 = 0
        L6c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            goto L37
        L71:
            com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting.INSTANCE
            float r2 = r0.getValue()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterTopNoticeWidget.z1():boolean");
    }

    public LiveCenterTopNoticeWidget() {
        C497740JfY.LIZIZ(24);
        C497740JfY.LIZIZ(26);
        this.LLJLL = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(20));
        this.LLJZ = new ATListenerS461S0100000_29(this, 0);
    }

    public final void D1() {
        String strLJIJJLI;
        String strLJIL;
        View view = getView();
        if (view == null) {
            return;
        }
        float fAbs = Math.abs(view.getTranslationY() - 0.0f);
        float fAbs2 = Math.abs(view.getTranslationY() - this.LLJJIII);
        float f = fAbs <= fAbs2 ? 0.0f : this.LLJJIII;
        int i = (f == 0.0f ? 1 : 0) ^ 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("snapToNearest: current=");
        sbLIZ.append(view.getTranslationY());
        sbLIZ.append(" distToTop=");
        sbLIZ.append(fAbs);
        sbLIZ.append(" distToBottom=");
        sbLIZ.append(fAbs2);
        sbLIZ.append(" → targetY=");
        sbLIZ.append(f);
        sbLIZ.append(" newSnapState=");
        sbLIZ.append(i);
        sbLIZ.append(" currentSnapState=");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = this.LLJJJIL;
        if (i2 != -1 && i2 != i) {
            String str = i2 == 0 ? "up" : "down";
            String str2 = i != 0 ? "down" : "up";
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("snapToNearest: position changed ");
            sbLIZ2.append(str);
            sbLIZ2.append(" → ");
            sbLIZ2.append(str2);
            C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ2));
            DataChannel dataChannel = this.dataChannel;
            AbstractC19416810xq abstractC19416810xq = this.LLJJIJIL;
            String str3 = "";
            if (abstractC19416810xq == null || (strLJIJJLI = abstractC19416810xq.LJIJJLI()) == null) {
                strLJIJJLI = "";
            }
            AbstractC19416810xq abstractC19416810xq2 = this.LLJJIJIL;
            if (abstractC19416810xq2 != null && (strLJIL = abstractC19416810xq2.LJIL()) != null) {
                str3 = strLJIL;
            }
            AbstractC19416810xq abstractC19416810xq3 = this.LLJJIJIL;
            int i3 = (abstractC19416810xq3 == null || !abstractC19416810xq3.LJJ()) ? 0 : 1;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_msg_change_position");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(strLJIJJLI, "msg_id");
            c474500IjALIZ.LJJII(str3, "suggestion_template_id");
            c474500IjALIZ.LJJII(str, "position_before");
            c474500IjALIZ.LJJII(str2, "position_after");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_button");
            c474500IjALIZ.LIZ();
        }
        this.LLJJJIL = i;
        int i4 = f == this.LLJJIII ? 1 : 0;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("saveSnapPosition: posValue=");
        sbLIZ3.append(i4);
        sbLIZ3.append(" (1=top, 2=bottom)");
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ3));
        InterfaceC772190UQv.g4.LJFF(Integer.valueOf(i4));
        View view2 = getView();
        if (view2 != null) {
            ObjectAnimator objectAnimator = this.LLJJLIIIJLLLLLLLZ;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getTranslationY(), f);
            objectAnimatorOfFloat.setDuration(250L);
            objectAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LLJLL.getValue());
            objectAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 22));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLJJLIIIJLLLLLLLZ = objectAnimatorOfFloat;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewGroup viewGroup;
        Unit unit;
        super.onCreate();
        this.LLJJIJIIJIL = null;
        try {
            Context context = this.context;
            if (context != null) {
                View view = getView();
                if (view != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    c384050F3z.LIZ = Integer.valueOf(Color.parseColor("#D94D4D4D"));
                    Drawable drawableLIZ = c384050F3z.LIZ(context);
                    C19659111vp c19659111vp = new C19659111vp();
                    c19659111vp.LIZJ = C418440Gaw.LIZIZ(12);
                    c19659111vp.LIZLLL = C418440Gaw.LIZIZ(50);
                    c19659111vp.LJ = Integer.valueOf(Color.parseColor("#1A000000"));
                    c19659111vp.LIZ = C418440Gaw.LIZIZ(16);
                    view.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(context)));
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LLILLJJLI = findViewById(R.id.ybu);
        this.LL = findViewById(R.id.mip);
        this.LLILLL = (C16F5) findViewById(R.id.min);
        this.LLILZ = (C16F5) findViewById(R.id.mio);
        this.LLILZIL = (LiveIconView) findViewById(R.id.f753mic);
        this.LLILZLL = findViewById(R.id.mif);
        this.LLIZ = (ViewGroup) findViewById(R.id.mid);
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.mik);
        this.LLJ = (ViewGroup) findViewById(R.id.vlz);
        this.LLJI = (TuxIconView) findViewById(R.id.ybw);
        this.LLJIJIL = (C1322110kVd) findViewById(R.id.ybv);
        this.LLJILJIL = (C1322110kVd) findViewById(R.id.ybs);
        this.LLJILJILJ = (C16F5) findViewById(R.id.miq);
        this.LLJILLL = (C16F5) findViewById(R.id.mil);
        this.LLJJ = (C16FS) findViewById(R.id.ybt);
        View view2 = this.LL;
        if (view2 != null) {
            if (view2.getWidth() > 0) {
                E1(view2.getWidth() / 3);
            } else {
                view2.addOnLayoutChangeListener(new C12YD(this, 11));
            }
        }
        LiveIconView liveIconView = this.LLILZIL;
        if (liveIconView != null) {
            C500260Jjc.LJLIIIL(500L, liveIconView, new AwS608S0100000_29(this, 32));
        }
        C16FS c16fs = this.LLJJ;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS608S0100000_29(this, 33));
        }
        ViewGroup viewGroup2 = this.LLIZ;
        if (viewGroup2 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup2, new AwS608S0100000_29(this, 34));
        }
        View view3 = getView();
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS608S0100000_29(this, 35));
        }
        View view4 = getView();
        if (view4 != null) {
            view4.setOnTouchListener(this.LLJZ);
        }
        ViewGroup viewGroup3 = this.LLIZ;
        if (viewGroup3 != null) {
            viewGroup3.setOnTouchListener(this.LLJZ);
        }
        C16FS c16fs2 = this.LLJJ;
        if (c16fs2 != null) {
            c16fs2.setOnTouchListener(this.LLJZ);
        }
        if (!Intrinsics.LJFF(InterfaceC772190UQv.h4.LIZIZ(), Boolean.TRUE)) {
            View view5 = getView();
            ViewParent parent = view5 != null ? view5.getParent() : null;
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                this.LLJJIJI = new C19389410tQ(viewGroup);
                C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", "initTipsController: controller created");
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this, LiveCenterTopNoticeShowEvent.class, new AwS608S0100000_29(this, 616));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, LiveCenterTopNoticeDismissEvent.class, new AwS608S0100000_29(this, 617));
        }
    }

    public final Pair<Float, Float> y1() {
        View viewFindViewById;
        View view = getView();
        if (view == null) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        view.getLocationOnScreen(new int[2]);
        Pair<Float, Float> pair = this.LLJJIJIIJIL;
        if (pair == null) {
            View rootView = view.getRootView();
            if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.mut)) == null) {
                return new Pair<>(Float.valueOf(view.getWidth() / 2.0f), Float.valueOf(view.getHeight() / 2.0f));
            }
            viewFindViewById.getLocationOnScreen(new int[2]);
            pair = new Pair<>(Float.valueOf(r3[0] + (viewFindViewById.getWidth() / 2.0f)), Float.valueOf(r3[1] + (viewFindViewById.getHeight() / 2.0f)));
            this.LLJJIJIIJIL = pair;
        }
        return new Pair<>(Float.valueOf(pair.getFirst().floatValue() - r4[0]), Float.valueOf(pair.getSecond().floatValue() - r4[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }

    public final void E1(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateCtaBtnMaxWidth: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ));
        C16FS c16fs = this.LLJJ;
        if (c16fs != null) {
            c16fs.setMaxWidth(i);
        }
    }

    public static void A1(C1322110kVd c1322110kVd, String str, boolean z) {
        if (c1322110kVd == null) {
            return;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadImage: Gecko → GeckoResourceLoader: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ));
            C1143680frq.LJI(c1322110kVd, str, null, true);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadImage: HTTP → Fresco: ");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("LiveCenterTopNoticeWidget", C2188811AlT.LIZIZ(sbLIZ2));
        c1322110kVd.setImageURI(UriProtector.parse(str));
    }

    public static void x1(View view, C19747812Oe c19747812Oe, Function1 function1) {
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            if (view.isAttachedToWindow()) {
                Rect rect = new Rect();
                view.getHitRect(rect);
                function1.invoke(rect);
                c19747812Oe.LIZ.add(new Rect(rect));
                c19747812Oe.LIZIZ.add(new TouchDelegate(rect, view));
                return;
            }
            return;
        }
        view.addOnLayoutChangeListener(new C12YE(view, c19747812Oe, function1, 0));
    }
}
