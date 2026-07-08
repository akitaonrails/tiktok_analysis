package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C1361160lWc;
import X.C1383760m74;
import X.C13LE;
import X.C14EU;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2187701Ajg;
import X.C2217381BqS;
import X.C452501pT;
import X.C622680Oba;
import X.C692450REd;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C7836034g;
import X.C786410Ut5;
import X.EnumC1361070lWT;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewTreeObserverOnPreDrawListenerC462850IDb;
import Y.ALAdapterS3S0200000_6;
import Y.AUListenerS254S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DanmakuSwitchAssem extends BaseCellSlotComponent<DanmakuSwitchAssem> implements DanmakuProtocol, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final InterfaceC1731706qJ LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public LinearLayout LLLF;
    public TuxIconView LLLFF;
    public LinearLayout LLLFFI;
    public Integer LLLFZ;
    public TuxTextView LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DanmakuSwitchAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DanmakuSwitchAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(DanmakuViewModel.class);
        this.LLJLLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS565S0100000_21(c19719912DlLIZ, 93), null, AFwS259S0000000_21.get$arr$(47));
        this.LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(48));
        this.LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(LandscapeClearScreenViewModel.class), AFwS259S0000000_21.get$arr$(49));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 92));
        this.LLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 91));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bj9;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        str.getClass();
        return null;
    }

    public final Aweme Bp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
    }

    public final DanmakuViewModel Ep() {
        return (DanmakuViewModel) this.LLJLLIL.getValue(this, LLLII[0]);
    }

    public final EnumC1361070lWT Fp() {
        C1383760m74 c1383760m74 = C1383760m74.LIZIZ;
        return !c1383760m74.LJIIIZ(Bp()) ? EnumC1361070lWT.DISABLED : c1383760m74.LJJII() ? EnumC1361070lWT.ON : EnumC1361070lWT.OFF;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ip() {
        Ep().CQ2(true, false, null, null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), DanmakuProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        Ep().unBind();
        DanmakuViewModel danmakuViewModelEp = Ep();
        EnumC1361070lWT enumC1361070lWT = EnumC1361070lWT.DISABLED;
        danmakuViewModelEp.getClass();
        danmakuViewModelEp.setState(new AwS600S0100000_21(enumC1361070lWT, 224));
        C622680Oba.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C622680Oba.LIZLLL(this);
    }

    public final void Gp(boolean z) {
        if (Fp() != EnumC1361070lWT.ON) {
            return;
        }
        DanmakuContinuallyPlayViewModel danmakuContinuallyPlayViewModel = (DanmakuContinuallyPlayViewModel) this.LLJZIJLIL.getValue();
        if ((danmakuContinuallyPlayViewModel != null && danmakuContinuallyPlayViewModel.LLJIJIL) || z || !C1361160lWc.LIZJ() || Bp().isHasDanmaku()) {
            DanmakuViewModel danmakuViewModelEp = Ep();
            danmakuViewModelEp.getClass();
            danmakuViewModelEp.setState(AFwS259S0000000_21.get$arr$(319));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDanmakuEntranceToggle(C7836034g c7836034g) {
        DanmakuViewModel danmakuViewModelEp = Ep();
        EnumC1361070lWT enumC1361070lWTFp = Fp();
        danmakuViewModelEp.getClass();
        danmakuViewModelEp.setState(new AwS600S0100000_21(enumC1361070lWTFp, 224));
        List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), DanmakuProtocol.class, false);
        if (listLIZIZ != null) {
            for (DanmakuProtocol danmakuProtocol : (ArrayList) listLIZIZ) {
                if (!Intrinsics.LJFF(danmakuProtocol, this) && danmakuProtocol != null) {
                    danmakuProtocol.xn1(c7836034g.LIZ);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLLF = (LinearLayout) view.findViewById(R.id.fez);
        this.LLLFFI = (LinearLayout) view.findViewById(R.id.ff8);
        this.LLLI = (TuxTextView) view.findViewById(R.id.ff7);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ffd);
        this.LLLFF = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 7, 42), tuxIconView);
        }
        LinearLayout linearLayout = this.LLLFFI;
        if (linearLayout != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 8, 42), linearLayout);
        }
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0lWU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(48), 4);
        C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0lWV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1361170lWd) obj).LLILZ;
            }
        }, null, AFwS294S0000000_11.get$arr$(139), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nys
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS305S0000000_21.get$arr$(55), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS305S0000000_21.get$arr$(58), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZ.getValue(), new C2217381BqS() { // from class: X.0RFq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C692830RFp) obj).LL;
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(45), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C622680Oba.LIZJ(this);
        Ep().vQ2(videoItemParams);
        DanmakuViewModel danmakuViewModelEp = Ep();
        EnumC1361070lWT enumC1361070lWTFp = Fp();
        danmakuViewModelEp.getClass();
        danmakuViewModelEp.setState(new AwS600S0100000_21(enumC1361070lWTFp, 224));
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void xn1(boolean z) {
        boolean z2;
        LinearLayout.LayoutParams layoutParams;
        Integer num;
        int i;
        float f;
        LinearLayout.LayoutParams layoutParams2;
        ViewTreeObserver viewTreeObserver;
        int i2;
        TuxIconView tuxIconView = this.LLLFF;
        if (tuxIconView != null) {
            if (z) {
                boolean z3 = C692450REd.LIZ;
                if (!C692450REd.LIZ) {
                    i2 = R.raw.icon_danmu_fill;
                } else {
                    i2 = R.raw.icon_danmu;
                }
            } else {
                boolean z4 = C692450REd.LIZ;
                if (!C692450REd.LIZ) {
                    i2 = R.raw.icon_danmu_slash_fill;
                } else {
                    i2 = R.raw.icon_danmu_slash;
                }
            }
            tuxIconView.setIconRes(i2);
        }
        LinearLayout linearLayout = this.LLLFFI;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnPreDrawListenerC462850IDb viewTreeObserverOnPreDrawListenerC462850IDb = new ViewTreeObserverOnPreDrawListenerC462850IDb(this, 1);
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC462850IDb);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC462850IDb, ViewTreeObserver.OnPreDrawListener.class);
        }
        TuxIconView tuxIconView2 = this.LLLFF;
        if (tuxIconView2 != null && tuxIconView2.getVisibility() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f2 = 1.0f;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (z2) {
            TuxIconView tuxIconView3 = this.LLLFF;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            LinearLayout linearLayout2 = this.LLLFFI;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            LinearLayout linearLayout3 = this.LLLFFI;
            if (linearLayout3 != null) {
                layoutParams3 = linearLayout3.getLayoutParams();
            }
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                layoutParams2.width = 0;
                if (!z) {
                    f2 = 0.0f;
                }
                layoutParams2.weight = f2;
                LinearLayout linearLayout4 = this.LLLFFI;
                if (linearLayout4 != null) {
                    C786410Ut5.d6(linearLayout4, layoutParams2);
                    return;
                }
                return;
            }
            return;
        }
        Integer num2 = this.LLLFZ;
        if (num2 != null && num2.intValue() > 0 && Ep().LLIZ) {
            num2.intValue();
            LinearLayout linearLayout5 = this.LLLFFI;
            if (linearLayout5 == null || (num = this.LLLFZ) == null) {
                return;
            }
            int iIntValue = num.intValue();
            TuxTextView tuxTextView = this.LLLI;
            if (tuxTextView != null) {
                tuxTextView.setEllipsize(null);
            }
            if (z) {
                i = 0;
                f = 0.0f;
            } else {
                i = iIntValue;
                iIntValue = 0;
                f = 1.0f;
                f2 = 0.0f;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, iIntValue);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(linearLayout5, 4));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout5, "alpha", f, f2);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfInt, objectAnimatorOfFloat);
            animatorSet.setDuration(300L);
            objectAnimatorOfFloat.addListener(new ALAdapterS3S0200000_6(linearLayout5, this, 13));
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.start();
            return;
        }
        LinearLayout linearLayout6 = this.LLLFFI;
        if (linearLayout6 != null) {
            layoutParams3 = linearLayout6.getLayoutParams();
        }
        if (!(layoutParams3 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams3) == null) {
            return;
        }
        layoutParams.width = 0;
        if (!z) {
            f2 = 0.0f;
        }
        layoutParams.weight = f2;
        LinearLayout linearLayout7 = this.LLLFFI;
        if (linearLayout7 == null) {
            return;
        }
        C786410Ut5.d6(linearLayout7, layoutParams);
    }
}
