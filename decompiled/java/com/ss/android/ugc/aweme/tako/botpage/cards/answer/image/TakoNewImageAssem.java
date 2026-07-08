package com.ss.android.ugc.aweme.tako.botpage.cards.answer.image;

import X.AbstractC1335900krs;
import X.C01GW;
import X.C05UQ;
import X.C0B1H;
import X.C0R2X;
import X.C1153090g71;
import X.C1323170kXL;
import X.C1323180kXM;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1383370m6R;
import X.C13LC;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1683130ttv;
import X.C1697810uHb;
import X.C18075076b;
import X.C1818907Al;
import X.C1856640yPm;
import X.C1856790yQ1;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C2097608Jq;
import X.C306850C1b;
import X.C384050F3z;
import X.C418330Gal;
import X.C418440Gaw;
import X.C426750GoL;
import X.C428600GrK;
import X.C452501pT;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1856750yPx;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS161S0100000_27;
import Y.ATListenerS459S0100000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewCellProtocol;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNewImageAssem extends ReusedUISlotAssem<TakoNewImageAssem> implements InterfaceC712990Rxx<InterfaceC1856750yPx>, TakoContentPreviewCellProtocol {
    public View LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public C1323170kXL LLJLL;
    public C418330Gal LLJLLIL;
    public TuxTextView LLJLLL;
    public InterfaceC1856750yPx LLJZ;
    public ValueAnimator LLJZIJLIL;
    public boolean LLL;
    public float LLLFF;
    public float LLLFFI;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1258));
    public String LLJL = "";
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS571S0100000_27(this, 707));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 706));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 704));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS571S0100000_27(this, 705));
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1259));
    public final AwS606S0100000_27 LLLIIIIL = new AwS606S0100000_27(this, 206);
    public final AwS606S0100000_27 LLLIIIL = new AwS606S0100000_27(this, 207);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fks;
    }

    @Override // X.InterfaceC1361305Ul
    public final void W7(String str) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoCardAbility Ap() {
        return (TakoCardAbility) this.LLLF.getValue();
    }

    public final int Bp() {
        return ((Number) this.LLLIIII.getValue()).intValue();
    }

    public final boolean up() {
        return ((Boolean) this.LLLI.getValue()).booleanValue();
    }

    public final boolean yp() {
        return ((Boolean) this.LLLII.getValue()).booleanValue();
    }

    public final boolean zp() {
        return ((Boolean) this.LLLFZ.getValue()).booleanValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C1554610qYd.LIZLLL(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, this);
        ValueAnimator valueAnimator = this.LLJZIJLIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
    }

    public final void Fp(boolean z) {
        int i;
        TuxTextView tuxTextView = this.LLJLLL;
        if (tuxTextView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
    }

    public final void Ip(View view) {
        float fLIZIZ;
        if (view == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
        c384050F3z.LIZLLL = Integer.valueOf(iLIZIZ);
        if (up()) {
            fLIZIZ = C418440Gaw.LIZIZ(16);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(12);
        }
        c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        C426750GoL.LJIIL(view, Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), Integer.valueOf(iLIZIZ), 16);
    }

    @Override // X.InterfaceC1361305Ul
    public final C05UQ Y8(String str) {
        Object obj;
        float f;
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((InterfaceC1856750yPx) obj).LJJIJLIJ()) || smartImageView == null) {
            return null;
        }
        if (up()) {
            f = 16.0f;
        } else {
            f = 12.0f;
        }
        return new C05UQ(f, f, f, f);
    }

    @Override // X.InterfaceC1361305Ul
    public final C1683130ttv aa(String str) {
        Object obj;
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (!Intrinsics.LJFF(str, ((InterfaceC1856750yPx) obj).LJJIJLIJ()) || smartImageView == null) {
            return null;
        }
        int[] iArr = new int[2];
        smartImageView.getLocationOnScreen(iArr);
        return new C1683130ttv(iArr[0], iArr[1], r2 + smartImageView.getWidth(), iArr[1] + smartImageView.getHeight());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws Throwable {
        C1323180kXM c1323180kXM;
        float fLIZIZ;
        this.LLJLIL = view.findViewById(R.id.c_f);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.c_g);
        this.LLJLILLLLZIIL = smartImageView;
        if (smartImageView != null) {
            C1331070kk5 hierarchy = smartImageView.getHierarchy();
            if (hierarchy != null) {
                C1331100kk8 c1331100kk8 = new C1331100kk8();
                if (up()) {
                    fLIZIZ = C418440Gaw.LIZIZ(16);
                } else {
                    fLIZIZ = C418440Gaw.LIZIZ(12);
                }
                c1331100kk8.LJII(fLIZIZ);
                hierarchy.LJJIII(c1331100kk8);
            }
            C1856790yQ1.LIZ.getClass();
            if (((Boolean) C1856790yQ1.LIZIZ.getValue()).booleanValue()) {
                smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            C786410Ut5.Q8(smartImageView, new ACListenerS161S0100000_27(this, 61));
            smartImageView.setOnTouchListener(new ATListenerS459S0100000_27(this, 0));
            smartImageView.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 0));
        }
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.c_i);
        C1323170kXL c1323170kXL = (C1323170kXL) view.findViewById(R.id.c_h);
        boolean zUp = up();
        int i = 0;
        if (C1818907Al.LIZ()) {
            c1323180kXM = new C1323180kXM(true, R.drawable.df5);
        } else {
            c1323180kXM = new C1323180kXM(i);
        }
        c1323170kXL.LIZJ(zUp, c1323180kXM);
        if (zp()) {
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), c1323170kXL);
            TuxTextView tuxTextView = this.LLJLLL;
            if (tuxTextView != null) {
                C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160))), null, null, false, 29);
            }
        }
        if (up()) {
            C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)), c1323170kXL);
        }
        this.LLJLL = c1323170kXL;
        C418330Gal c418330Gal = (C418330Gal) view.findViewById(R.id.c_j);
        this.LLJLLIL = c418330Gal;
        if (c418330Gal != null) {
            if (zp()) {
                c418330Gal.setGravity(17);
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)), c418330Gal);
                Ip(c418330Gal);
            }
            if (up()) {
                C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)), c418330Gal);
            }
            C786410Ut5.a1(c418330Gal, 8);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), TakoContentPreviewCellProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(InterfaceC1856750yPx interfaceC1856750yPx) {
        String strLJJIJLIJ;
        InterfaceC1856750yPx interfaceC1856750yPx2 = interfaceC1856750yPx;
        InterfaceC1856750yPx interfaceC1856750yPx3 = this.LLJZ;
        if (interfaceC1856750yPx3 != null) {
            strLJJIJLIJ = interfaceC1856750yPx3.LJJIJLIJ();
        } else {
            strLJJIJLIJ = null;
        }
        if (Intrinsics.LJFF(strLJJIJLIJ, interfaceC1856750yPx2.LJJIJLIJ())) {
            if (interfaceC1856750yPx2.LJLL()) {
                InterfaceC1856750yPx interfaceC1856750yPx4 = this.LLJZ;
                if (interfaceC1856750yPx4 != null && !interfaceC1856750yPx4.LJLL()) {
                    tp(interfaceC1856750yPx2);
                }
            } else if (interfaceC1856750yPx2.LL()) {
                InterfaceC1856750yPx interfaceC1856750yPx5 = this.LLJZ;
                if (interfaceC1856750yPx5 != null && interfaceC1856750yPx5.LJLL()) {
                    sp(interfaceC1856750yPx2, true);
                } else if (!this.LLL) {
                    sp(interfaceC1856750yPx2, false);
                }
            } else {
                op(this, interfaceC1856750yPx2);
            }
        } else if (interfaceC1856750yPx2.LJLL()) {
            tp(interfaceC1856750yPx2);
        } else if (interfaceC1856750yPx2.LL()) {
            sp(interfaceC1856750yPx2, false);
        } else {
            op(this, interfaceC1856750yPx2);
        }
        this.LLJZ = interfaceC1856750yPx2;
    }

    public final void tp(InterfaceC1856750yPx interfaceC1856750yPx) {
        long jIntValue;
        View view = this.LLJLIL;
        if (view != null) {
            view.setBackground(null);
        }
        boolean z = false;
        this.LLL = false;
        C1323170kXL c1323170kXL = this.LLJLL;
        if (c1323170kXL != null) {
            C786410Ut5.Z0(c1323170kXL, 0);
        }
        if (((Number) C18075076b.LIZ.getValue()).intValue() == 0 && !up()) {
            z = true;
        }
        Fp(z);
        C418330Gal c418330Gal = this.LLJLLIL;
        if (c418330Gal != null) {
            C786410Ut5.a1(c418330Gal, 8);
        }
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        if (yp()) {
            Pair pairLIZ = C306850C1b.LIZ(interfaceC1856750yPx.LJJJJLI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
            C1323170kXL c1323170kXL2 = this.LLJLL;
            if (c1323170kXL2 != null) {
                C1383370m6R.LJIILJJIL(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), c1323170kXL2);
            }
            C418330Gal c418330Gal2 = this.LLJLLIL;
            if (c418330Gal2 != null) {
                C1383370m6R.LJIILJJIL(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), c418330Gal2);
            }
            SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
            if (smartImageView2 != null) {
                C1383370m6R.LJIILJJIL(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), smartImageView2);
            }
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 99);
        C01GW c01gw = C0B1H.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0) {
            jIntValue = ((Number) c01gw.getValue()).intValue();
        } else {
            jIntValue = 20000;
        }
        valueAnimatorOfInt.setDuration(jIntValue);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS275S0100000_27(this, 16));
        this.LLJZIJLIL = valueAnimatorOfInt;
        C1323170kXL c1323170kXL3 = this.LLJLL;
        if (c1323170kXL3 != null) {
            c1323170kXL3.LIZLLL();
        }
        ValueAnimator valueAnimator = this.LLJZIJLIL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1856750yPx interfaceC1856750yPx) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1856750yPx interfaceC1856750yPx) {
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void op(com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem r7, X.InterfaceC1856750yPx r8) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem.op(com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoNewImageAssem, X.0yPx):void");
    }

    public final void Gp(InterfaceC1856750yPx interfaceC1856750yPx, C428600GrK c428600GrK) {
        float f;
        float fLJJJJLI;
        int i = c428600GrK.LIZ;
        int i2 = c428600GrK.LIZIZ;
        if (i > 0 && i2 > 0) {
            f = i / i2;
        } else {
            f = 1.0f;
        }
        if (yp()) {
            if (interfaceC1856750yPx != null) {
                fLJJJJLI = interfaceC1856750yPx.LJJJJLI();
            } else {
                fLJJJJLI = 0.5625f;
            }
            Pair pairLIZ = C306850C1b.LIZ(fLJJJJLI, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
            SmartImageView smartImageView = this.LLJLILLLLZIIL;
            if (smartImageView != null) {
                C786410Ut5.G6(smartImageView, new FrameLayout.LayoutParams(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue()));
            }
            if (zp()) {
                Ip(this.LLJLILLLLZIIL);
                return;
            }
            return;
        }
        if (up()) {
            C1856640yPm.LIZ.getClass();
            C1153090g71.LIZ.getClass();
            if (C1153090g71.LIZIZ(0, C1856640yPm.class) == 1) {
                Pair pairLIZ2 = C306850C1b.LIZ(f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
                SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
                if (smartImageView2 != null) {
                    C786410Ut5.G6(smartImageView2, new FrameLayout.LayoutParams(((Number) pairLIZ2.getFirst()).intValue(), ((Number) pairLIZ2.getSecond()).intValue()));
                }
            } else {
                SmartImageView smartImageView3 = this.LLJLILLLLZIIL;
                if (smartImageView3 != null) {
                    C786410Ut5.G6(smartImageView3, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346))));
                }
            }
            if (zp()) {
                Ip(this.LLJLILLLLZIIL);
                return;
            }
            return;
        }
        C1856640yPm.LIZ.getClass();
        C1153090g71.LIZ.getClass();
        if (C1153090g71.LIZIZ(0, C1856640yPm.class) == 1) {
            Pair pairLIZ3 = C306850C1b.LIZ(f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
            SmartImageView smartImageView4 = this.LLJLILLLLZIIL;
            if (smartImageView4 != null) {
                C786410Ut5.G6(smartImageView4, new FrameLayout.LayoutParams(((Number) pairLIZ3.getFirst()).intValue(), ((Number) pairLIZ3.getSecond()).intValue()));
            }
        } else if (f >= 1.3333334f) {
            SmartImageView smartImageView5 = this.LLJLILLLLZIIL;
            if (smartImageView5 != null) {
                C786410Ut5.G6(smartImageView5, new FrameLayout.LayoutParams((int) ((Bp() * 4.0f) / 3.0f), Bp()));
            }
        } else if (f <= 0.75f) {
            SmartImageView smartImageView6 = this.LLJLILLLLZIIL;
            if (smartImageView6 != null) {
                C786410Ut5.G6(smartImageView6, new FrameLayout.LayoutParams(Bp(), (int) ((Bp() * 4.0f) / 3.0f)));
            }
        } else {
            SmartImageView smartImageView7 = this.LLJLILLLLZIIL;
            if (smartImageView7 != null) {
                C786410Ut5.G6(smartImageView7, new FrameLayout.LayoutParams(Bp(), Bp()));
            }
        }
        if (zp()) {
            Ip(this.LLJLILLLLZIIL);
        }
    }

    @Override // X.InterfaceC1361305Ul
    public final void Of(String str, boolean z) {
        Object obj;
        int i;
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((InterfaceC1856750yPx) obj).LJJIJLIJ()) && smartImageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LLFF(i, smartImageView);
        }
    }

    public final void sp(InterfaceC1856750yPx interfaceC1856750yPx, boolean z) {
        BaseImage baseImage;
        String str;
        String str2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Long lValueOf;
        Long lValueOf2;
        String str3;
        String string;
        Integer numValueOf;
        String str4;
        Message messageYy1;
        TakoCardAbility takoCardAbilityAp;
        Message messageYy12;
        Message messageYy13;
        Message messageYy14;
        TakoMixFeed takoMixFeedLJIIIZ;
        Message messageYy15;
        Message messageYy16;
        Message messageYy17;
        BaseImage baseImage2;
        List<String> list;
        BaseImage baseImage3;
        List<BaseImage> imageData;
        Integer numValueOf2 = null;
        if (interfaceC1856750yPx != null && (imageData = interfaceC1856750yPx.getImageData()) != null) {
            baseImage = (BaseImage) C13LP.LJJJLL(imageData);
        } else {
            baseImage = null;
        }
        if (yp() && interfaceC1856750yPx != null) {
            Pair pairLIZ = C306850C1b.LIZ(interfaceC1856750yPx.LJJJJLI(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(170)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(346)));
            SmartImageView smartImageView = this.LLJLILLLLZIIL;
            if (smartImageView != null) {
                C1383370m6R.LJIILJJIL(((Number) pairLIZ.getFirst()).intValue(), ((Number) pairLIZ.getSecond()).intValue(), smartImageView);
            }
        }
        if (baseImage == null) {
            op(this, interfaceC1856750yPx);
        } else {
            C418330Gal c418330Gal = this.LLJLLIL;
            if (c418330Gal != null) {
                C786410Ut5.a1(c418330Gal, 8);
            }
            float f = 1.0f;
            if (z) {
                this.LLL = true;
                SmartImageView smartImageView2 = this.LLJLILLLLZIIL;
                if (smartImageView2 != null) {
                    if (!up()) {
                        f = 0.0f;
                    }
                    C786410Ut5.u5(smartImageView2, f);
                    C786410Ut5.LLFF(0, smartImageView2);
                    Fp(false);
                    Ep(interfaceC1856750yPx, smartImageView2, baseImage, false, new AwS393S0200000_27(this, interfaceC1856750yPx, 95));
                }
            } else {
                this.LLL = false;
                ValueAnimator valueAnimator = this.LLJZIJLIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                C1323170kXL c1323170kXL = this.LLJLL;
                if (c1323170kXL != null) {
                    C786410Ut5.Z0(c1323170kXL, 8);
                }
                Fp(false);
                SmartImageView smartImageView3 = this.LLJLILLLLZIIL;
                if (smartImageView3 != null) {
                    C786410Ut5.LLFF(0, smartImageView3);
                    C786410Ut5.u5(smartImageView3, 1.0f);
                    Fp(false);
                    Ep(interfaceC1856750yPx, smartImageView3, baseImage, true, new AwS393S0200000_27(this, interfaceC1856750yPx, 94));
                }
            }
        }
        if (interfaceC1856750yPx != null) {
            String strLJJIJLIJ = interfaceC1856750yPx.LJJIJLIJ();
            List<BaseImage> imageData2 = interfaceC1856750yPx.getImageData();
            if (imageData2 != null && (baseImage3 = (BaseImage) C13LP.LJJJLL(imageData2)) != null) {
                str = baseImage3.imageId;
            } else {
                str = null;
            }
            List<BaseImage> imageData3 = interfaceC1856750yPx.getImageData();
            if (imageData3 != null && (baseImage2 = (BaseImage) C13LP.LJJJLL(imageData3)) != null && (list = baseImage2.urlList) != null) {
                str2 = (String) C13LP.LJJJLL(list);
            } else {
                str2 = null;
            }
            TakoCardAbility takoCardAbilityAp2 = Ap();
            if (takoCardAbilityAp2 != null) {
                takoCardAbilityAp2.Yy1();
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP.LL;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = c1863850ybP.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP.LLILZIL;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = c1863850ybP.LLILZLL;
                if (str9 == null) {
                    str9 = "";
                }
                TakoCardAbility takoCardAbilityAp3 = Ap();
                if (takoCardAbilityAp3 != null && (messageYy17 = takoCardAbilityAp3.Yy1()) != null) {
                    lValueOf = Long.valueOf(messageYy17.botId);
                } else {
                    lValueOf = null;
                }
                String strValueOf = String.valueOf(lValueOf);
                TakoCardAbility takoCardAbilityAp4 = Ap();
                if (takoCardAbilityAp4 != null && (messageYy16 = takoCardAbilityAp4.Yy1()) != null) {
                    lValueOf2 = Long.valueOf(messageYy16.actionId);
                } else {
                    lValueOf2 = null;
                }
                TakoCardAbility takoCardAbilityAp5 = Ap();
                if (takoCardAbilityAp5 != null && (messageYy15 = takoCardAbilityAp5.Yy1()) != null) {
                    str3 = messageYy15.subSessionId;
                } else {
                    str3 = null;
                }
                String str10 = c1863850ybP.LLILLL;
                if (str != null) {
                    str6 = str;
                }
                TakoCardAbility takoCardAbilityAp6 = Ap();
                if (takoCardAbilityAp6 != null) {
                    string = Integer.valueOf(takoCardAbilityAp6.t70()).toString();
                } else {
                    string = null;
                }
                TakoCardAbility takoCardAbilityAp7 = Ap();
                if (takoCardAbilityAp7 != null && (messageYy14 = takoCardAbilityAp7.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy14.LJIIIZ()) != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                } else {
                    numValueOf = null;
                }
                String strLIZIZ = C0R2X.LIZIZ(numValueOf);
                TakoCardAbility takoCardAbilityAp8 = Ap();
                if (takoCardAbilityAp8 != null && (messageYy13 = takoCardAbilityAp8.Yy1()) != null && messageYy13.isMultiAnswer) {
                    str4 = "multi_answer";
                } else {
                    str4 = "default";
                }
                TakoCardAbility takoCardAbilityAp9 = Ap();
                if (takoCardAbilityAp9 != null && (messageYy1 = takoCardAbilityAp9.Yy1()) != null && messageYy1.isMultiAnswer && (takoCardAbilityAp = Ap()) != null && (messageYy12 = takoCardAbilityAp.Yy1()) != null) {
                    numValueOf2 = Integer.valueOf(messageYy12.selectedAnswerIndex + 1);
                }
                C1862330yYx.LJJJJJ(c1862330yYx, str5, str7, strLJJIJLIJ, str8, str9, c1863850ybP.LLIZ, strValueOf, lValueOf2, str3, str10, "pic", str6, string, strLIZIZ, str2, null, null, null, str4, numValueOf2, null, null, null, null, null, null, null, null, null, false, 2145878016);
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        tp(interfaceC1587906Jp);
    }

    public final void Ep(final InterfaceC1856750yPx interfaceC1856750yPx, SmartImageView smartImageView, BaseImage baseImage, boolean z, final Function1<? super C428600GrK, Unit> function1) {
        Map<String, String> mapLJ;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(new ImageUrlModel(baseImage.imageId, baseImage.urlList));
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        c1331670kl3LJIIIIZZ.LJJJIL = new C1338340kvo(smartImageView, "tako_generate_single_image", baseImage.imageId, mapLJ);
        c1331670kl3LJIIIIZZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0yQ4
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                TakoNewImageAssem.op(this, interfaceC1856750yPx);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                Function1<C428600GrK, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(c428600GrK);
                }
            }
        });
    }
}
