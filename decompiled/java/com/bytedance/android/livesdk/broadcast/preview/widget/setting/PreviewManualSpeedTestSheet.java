package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C036E;
import X.C09JN;
import X.C0IJT;
import X.C0PEM;
import X.C0TKL;
import X.C0UWN;
import X.C0UWR;
import X.C0UWY;
import X.C1101220elM;
import X.C1119170fEJ;
import X.C1119920fFW;
import X.C11LS;
import X.C11NN;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C1D45;
import X.C1D49;
import X.C1D4C;
import X.C1D4I;
import X.C20441214yg;
import X.C20483915Dh;
import X.C2188811AlT;
import X.C2250021D4u;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C751090TdD;
import X.C758170Tod;
import X.C783730Uol;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC783720Uok;
import X.InterpolatorC1125410fON;
import X.ViewOnClickListenerC1836610xtT;
import Y.AAListenerS323S0100000_12;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.broadcast.VideoPreScheduleStatusChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.PreviewManualSpeedTestSheet;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewProbeGoodNetworkBottomLine;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS55S0001000_12;
import kotlin.jvm.internal.AwS55S0010000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewManualSpeedTestSheet extends LiveSheetFragment {
    public static final float LLLIZZ = LivePreviewProbeGoodNetworkBottomLine.INSTANCE.getValue();
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlHELIOSLDh9PywoLionZjYpPTs6JiJiGT02PiwpPgIyJjAtJRwjLSAoHSogPBYkLCon";
    public ViewOnClickListenerC1836610xtT LLJLLL;
    public AppCompatImageView LLJZ;
    public C16F5 LLJZIJLIL;
    public C16F5 LLL;
    public AnimatorSet LLLF;
    public C16FS LLLFF;
    public C11LS LLLFZ;
    public LiveIconView LLLI;
    public C16F5 LLLII;
    public C16F5 LLLIIII;
    public C1D49 LLLIIIIL;
    public boolean LLLIIIL;
    public boolean LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public long LLLFFI = -1;
    public int LLLIIL = -1;
    public final C0UWN LLLILZJ = new C0UWN(this);
    public final String LLLILZLLLI = C497740JfY.LJIJI(2131853088);

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131853087));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodWR = WR(new ACListenerS147S0100000_12(this, 166));
        if (c758170TodWR != null) {
            arrayList.add(c758170TodWR);
        }
        c1119170fEJ.LJ = arrayList;
        C751090TdD c751090TdD = new C751090TdD();
        c751090TdD.LIZIZ = C497740JfY.LJIJI(2131853099);
        c751090TdD.LIZLLL = new ACListenerS147S0100000_12(this, 167);
        c751090TdD.LIZJ = false;
        c1119170fEJ.LIZLLL = c751090TdD;
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLIILIL) {
            return;
        }
        this.LLLIILIL = true;
        yS();
    }

    public final void yS() {
        boolean zLIZIZ;
        Fragment fragment;
        LifecycleCoroutineScope lifecycleScope;
        getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C20483915Dh c20483915Dh = this.LLIZ;
            if (c20483915Dh != null) {
                c20483915Dh.setEndTextButtonEnable(true);
            }
            C0TKL.LIZ(C475510Ikn.LJ(this), "testing_problem_low_network");
            LiveIconView liveIconView = this.LLLI;
            if (liveIconView != null) {
                liveIconView.setIconAttr(R.attr.dye);
            }
            C16F5 c16f5 = this.LLLII;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131853091));
            }
            C16F5 c16f52 = this.LLLIIII;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131853090));
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.LLJLLL;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJFF();
                return;
            }
            return;
        }
        if (!this.LLLIL) {
            this.LLLIL = true;
            C0TKL.LIZ(C475510Ikn.LJ(this), "during_testing");
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LLJLLL;
        if (viewOnClickListenerC1836610xtT2 != null) {
            viewOnClickListenerC1836610xtT2.LIZLLL();
        }
        this.LLLILZ = true;
        C20483915Dh c20483915Dh2 = this.LLIZ;
        if (c20483915Dh2 != null) {
            c20483915Dh2.setEndTextButtonEnable(false);
        }
        this.LLLIIIIL = null;
        zS(38.0f, true, false);
        C0UWN c0uwn = this.LLLILZJ;
        C2250021D4u c2250021D4u = C1D4I.LIZ;
        if (c2250021D4u != null) {
            if ((c2250021D4u.LJIIL || c2250021D4u.LJIILIIL) && (fragment = c2250021D4u.LIZ) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
                C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1101220elM(c2250021D4u, null), 2);
            }
            C1D4C c1d4cLIZIZ = c2250021D4u.LIZIZ();
            c2250021D4u.LJIILJJIL = c0uwn;
            C783730Uol c783730Uol = new C783730Uol();
            c783730Uol.LIZ = EnumC783720Uok.MANUAL;
            c1d4cLIZIZ.LJIIIIZZ(c783730Uol);
        }
        C16FS c16fs = this.LLLFF;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataChannel: ");
        sbLIZ.append(C475510Ikn.LJ(this));
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(VideoPreScheduleStatusChannel.class, C0UWY.DEFAULT);
        }
        this.LLLFFI = System.currentTimeMillis();
        C16F5 c16f53 = this.LLJZIJLIL;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJJ(2131853096, "-"));
        }
        C16F5 c16f54 = this.LLL;
        if (c16f54 != null) {
            c16f54.setText(uS(0L));
        }
        this.LLLFZ = (C11LS) C11NN.LJII(1000L, TimeUnit.MILLISECONDS).LJIIJ(C1701940uOG.LIZIZ()).LJIILIIL(new AfS181S0100000_12(this, 68), new C09JN() { // from class: X.0UWM
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PreviewManualSpeedTestSheet@be9f.startManualTest$2");
                String str = PreviewManualSpeedTestSheet._pnsPageId;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("CountDown Error: ");
                sbLIZ2.append(((Throwable) obj).getMessage());
                C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ2));
                C1C7U.LIZIZ("PreviewManualSpeedTestSheet@be9f.startManualTest$2");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C497740JfY.LIZLLL(R.attr.c63, context);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    public final SpannableString uS(long j) {
        long j2 = 10000 - j;
        if (j2 < 0) {
            j2 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountDown: ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        String strLJIJJ = C497740JfY.LJIJJ(2131853089, Integer.valueOf(C814420VxA.LIZIZ(j2 / 1000.0f)));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLLILZLLLI);
        sbLIZ2.append(strLJIJJ);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
        C1119920fFW.LJIIIIZZ(spannableString, this.LLLILZLLLI.length(), spannableString.length(), 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        return spannableString;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C1D49 c1d49;
        C2250021D4u c2250021D4u = C1D4I.LIZ;
        if (c2250021D4u != null) {
            C1D4C c1d4cLIZIZ = c2250021D4u.LIZIZ();
            C1D45 c1d45 = new C1D45();
            c1d45.LIZJ = C0UWR.MANUAL_PROBE_CANCEL;
            c1d45.LIZ = false;
            c1d45.LIZIZ = EnumC783720Uok.MANUAL;
            c1d4cLIZIZ.LJII(c1d45);
        }
        if (this.LLLILZ) {
            wS(this.LLLIIL, -1, true);
        }
        if (!this.LLLIIIL && (c1d49 = this.LLLIIIIL) != null) {
            C1D4I.LIZJ = new Pair<>(Integer.valueOf(c1d49.LIZIZ()), Boolean.FALSE);
        }
        AnimatorSet animatorSet = this.LLLF;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C11LS c11ls = this.LLLFZ;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLLIIL = arguments.getInt("prev_def");
        }
        this.LLJLLL = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.ysz);
        this.LLJZIJLIL = (C16F5) view.findViewById(R.id.ypa);
        this.LLL = (C16F5) view.findViewById(R.id.yp4);
        this.LLJZ = (AppCompatImageView) view.findViewById(R.id.yp8);
        C16FS c16fs = (C16FS) view.findViewById(R.id.yp3);
        this.LLLFF = c16fs;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 168));
        }
        this.LLLI = (LiveIconView) view.findViewById(R.id.vu5);
        this.LLLII = (C16F5) view.findViewById(R.id.vu7);
        this.LLLIIII = (C16F5) view.findViewById(R.id.vu4);
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.vu6);
        if (c16fs2 != null) {
            C786410Ut5.h8(c16fs2, new ACListenerS147S0100000_12(this, 169));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dataChannel: ");
        sbLIZ.append(C475510Ikn.LJ(this));
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(VideoPreScheduleStatusChannel.class, C0UWY.DEFAULT);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h7c, viewGroup, false);
    }

    public final void wS(int i, int i2, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_definition_manual_speedtest_result");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII("video_live", "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "previous_definition");
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i2), "current_definition", new AwS55S0001000_12(i2, 0));
        c474500IjALIZ.LJJIIZ("exit_live_page", "cancel_reason", new AwS55S0010000_12(z, 0));
        c474500IjALIZ.LIZ();
    }

    public final void zS(float f, boolean z, boolean z2) {
        float f2;
        float rotation;
        long j;
        ObjectAnimator objectAnimatorOfFloat;
        long j2;
        long j3;
        if (C497740JfY.LJJ()) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnim: ");
        sbLIZ.append(f);
        sbLIZ.append(", ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ));
        AnimatorSet animatorSet = this.LLLF;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLF = new AnimatorSet();
        float f3 = f2 * f;
        float fMax = f2 * Math.max(6.0f, f - 8.0f);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("finalAngle: ");
        sbLIZ2.append(f3);
        sbLIZ2.append(", ");
        sbLIZ2.append(fMax);
        C20441214yg.LIZIZ("PreviewManualSpeedTestSheet", C2188811AlT.LIZIZ(sbLIZ2));
        AppCompatImageView appCompatImageView = this.LLJZ;
        Property property = View.ROTATION;
        float[] fArr = new float[2];
        if (appCompatImageView != null) {
            rotation = appCompatImageView.getRotation();
        } else {
            rotation = 0.0f;
        }
        fArr[0] = rotation;
        fArr[1] = f3;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, fArr);
        if (z) {
            j = 300;
        } else {
            j = 200;
        }
        objectAnimatorOfFloat2.setDuration(j);
        objectAnimatorOfFloat2.setInterpolator(new InterpolatorC1125410fON(0.33f, 0.0f, 0.35f, 1.0f));
        if (z) {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJZ, (Property<AppCompatImageView, Float>) View.ROTATION, f3, fMax, f3, fMax, f3, fMax, f3);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJZ, (Property<AppCompatImageView, Float>) View.ROTATION, f3, fMax, f3, fMax, f3, fMax, f3, fMax, f3);
        }
        if (objectAnimatorOfFloat != null) {
            if (z) {
                j2 = 600;
            } else {
                j2 = 200;
            }
            objectAnimatorOfFloat.setStartDelay(j2);
            if (z) {
                j3 = 1200;
            } else {
                j3 = 1600;
            }
            objectAnimatorOfFloat.setDuration(j3);
            objectAnimatorOfFloat.setInterpolator(new InterpolatorC1125410fON(0.33f, 0.0f, 0.35f, 1.0f));
            objectAnimatorOfFloat.addListener(new AAListenerS323S0100000_12(this, 3));
        }
        if (z) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJZ, (Property<AppCompatImageView, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(100L);
            objectAnimatorOfFloat3.setInterpolator(new InterpolatorC1125410fON(0.33f, 0.0f, 0.35f, 1.0f));
            AnimatorSet animatorSet2 = this.LLLF;
            if (animatorSet2 != null) {
                animatorSet2.playSequentially(objectAnimatorOfFloat3, objectAnimatorOfFloat2, objectAnimatorOfFloat);
            }
        } else {
            AnimatorSet animatorSet3 = this.LLLF;
            if (animatorSet3 != null) {
                if (z2) {
                    animatorSet3.playSequentially(objectAnimatorOfFloat2);
                } else {
                    animatorSet3.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                }
            }
        }
        AnimatorSet animatorSet4 = this.LLLF;
        if (animatorSet4 != null) {
            animatorSet4.start();
        }
    }
}
