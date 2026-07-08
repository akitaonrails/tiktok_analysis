package com.ss.android.ugc.aweme.nimblecard.tako.component.video;

import X.C01GW;
import X.C0IDA;
import X.C0Q72;
import X.C1308910kAL;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LP;
import X.C1843500y4a;
import X.C1860930yWh;
import X.C1908520zlS;
import X.C1914507eh;
import X.C1920507ff;
import X.C2211631BhB;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864690ycl;
import Y.ACListenerS129S0200000_27;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class NimbleVideoItemAssem extends ReusedUISlotAssem<NimbleVideoItemAssem> implements InterfaceC712990Rxx<C1860930yWh> {
    public static final float LLJZIJLIL = C418440Gaw.LIZIZ(Float.valueOf(8.0f));
    public static final float LLL;
    public static final int LLLF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 612));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 611));
    public SmartImageView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxIconView LLJLLL;
    public C1860930yWh LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dt3;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    static {
        Float fValueOf = Float.valueOf(0.5f);
        LLL = C418440Gaw.LIZIZ(fValueOf);
        LLLF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf));
    }

    public final INimbleVideoListDependAbility op() {
        return (INimbleVideoListDependAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp = op();
        if (iNimbleVideoListDependAbilityOp != null) {
            iNimbleVideoListDependAbilityOp.GH(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Drawable drawableLIZ;
        Drawable drawable;
        this.LLJLIL = (SmartImageView) view.findViewById(R.id.p9q);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.p9s);
        this.LLJLL = (TuxTextView) view.findViewById(R.id.p9r);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.video_tag);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zf);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
        this.LLJLLIL = tuxTextView;
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.qmu);
        float dimensionPixelSize = LJJIJL().getContext().getResources().getDimensionPixelSize(R.dimen.ba);
        float f = dimensionPixelSize / LJJIJL().getContext().getResources().getDisplayMetrics().density;
        View viewLJJIJL = LJJIJL();
        C427690Gpr.LJFF(viewLJJIJL, 0.0f);
        C0Q72.LIZ(viewLJJIJL, f);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(dimensionPixelSize + LLL);
        c384050F3z2.LJ = C1308910kAL.LIZ(R.attr.a01, viewLJJIJL.getContext());
        int i = LLLF;
        c384050F3z2.LIZLLL = Integer.valueOf(i);
        viewLJJIJL.setBackground(c384050F3z2.LIZ(viewLJJIJL.getContext()));
        viewLJJIJL.setPadding(i, i, i, i);
        TuxTextView tuxTextView2 = this.LLJLILLLLZIIL;
        if (tuxTextView2 != null) {
            INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp = op();
            if (iNimbleVideoListDependAbilityOp == null || (drawableLIZ = iNimbleVideoListDependAbilityOp.jO(tuxTextView2.getContext())) == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_like_fill;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                drawableLIZ = c419910GdJ.LIZ(tuxTextView2.getContext());
            }
            if (Boolean.valueOf(!C426750GoL.LIZLLL(tuxTextView2.getContext())).booleanValue()) {
                drawable = drawableLIZ;
            } else {
                drawable = null;
            }
            if (!C426750GoL.LIZLLL(tuxTextView2.getContext())) {
                drawableLIZ = null;
            }
            tuxTextView2.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawableLIZ, (Drawable) null);
        }
        C2211631BhB.LJ(LJJIJL(), new AwS606S0100000_27(this, 166));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1860930yWh c1860930yWh) {
        C1914507eh c1914507eh;
        float f;
        Drawable drawableLIZ;
        C1331070kk5 hierarchy;
        C1860930yWh c1860930yWh2 = c1860930yWh;
        this.LLJZ = c1860930yWh2;
        INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp = op();
        if (iNimbleVideoListDependAbilityOp != null) {
            iNimbleVideoListDependAbilityOp.fW(this);
        }
        C1920507ff c1920507ff = c1860930yWh2.LLJILJILJ;
        if (c1920507ff == null) {
            c1920507ff = C1920507ff.LJ;
        }
        if (!c1920507ff.LIZJ || (c1914507eh = c1920507ff.LIZLLL) == null) {
            c1914507eh = c1920507ff.LIZIZ;
        }
        ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
        layoutParams.width = c1914507eh.LIZ;
        layoutParams.height = c1914507eh.LIZIZ;
        Float f2 = c1914507eh.LIZLLL;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            SmartImageView smartImageView = this.LLJLIL;
            if (smartImageView != null && (hierarchy = smartImageView.getHierarchy()) != null) {
                C1331100kk8 c1331100kk8 = new C1331100kk8();
                c1331100kk8.LJII(fFloatValue);
                hierarchy.LJJIII(c1331100kk8);
            }
        }
        Float f3 = c1914507eh.LIZJ;
        if (f3 != null) {
            float fFloatValue2 = f3.floatValue();
            C427690Gpr.LJFF(LJJIJL(), 0.0f);
            LJJIJL().setOutlineProvider(new C0IDA(fFloatValue2, 14));
            LJJIJL().setClipToOutline(true);
            View viewLJJIJL = LJJIJL();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(fFloatValue2 + LLL);
            c384050F3z.LJ = C1308910kAL.LIZ(R.attr.a01, LJJIJL().getContext());
            int i = LLLF;
            c384050F3z.LIZLLL = Integer.valueOf(i);
            viewLJJIJL.setBackground(c384050F3z.LIZ(LJJIJL().getContext()));
            LJJIJL().setPadding(i, i, i, i);
        }
        C786410Ut5.I7(new ACListenerS129S0200000_27(this, c1860930yWh2, 47), LJJIJL());
        LJJIJL().setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 12));
        TuxTextView tuxTextView = this.LLJLL;
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            }
            tuxTextView.setText(String.valueOf(c1860930yWh2.LL + 1));
            if (c1860930yWh2.LLJ && c1860930yWh2.LLIZLLLIL != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bp, LJJIJL().getContext());
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp2 = op();
                    if (iNimbleVideoListDependAbilityOp2 != null && iNimbleVideoListDependAbilityOp2.Ad2()) {
                        float f4 = LLJZIJLIL;
                        drawableLIZ = C1908520zlS.LIZ(0.0f, f4, 0.0f, f4, iIntValue);
                    } else {
                        float f5 = LLJZIJLIL;
                        drawableLIZ = C1908520zlS.LIZ(f5, 0.0f, f5, 0.0f, iIntValue);
                    }
                    tuxTextView.setBackground(drawableLIZ);
                }
                C337180DJs.LIZJ(tuxTextView);
            } else {
                C337180DJs.LIZ(tuxTextView);
            }
        }
        C1920507ff c1920507ff2 = c1860930yWh2.LLJILJILJ;
        if (c1920507ff2 == null) {
            c1920507ff2 = C1920507ff.LJ;
        }
        boolean z = c1920507ff2.LIZJ;
        TuxIconView tuxIconView = this.LLJLLL;
        if (tuxIconView != null) {
            if (c1860930yWh2.LLILZIL) {
                C337180DJs.LIZJ(tuxIconView);
            } else {
                C337180DJs.LIZ(tuxIconView);
            }
            if (z) {
                f = 0.85f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.x5(tuxIconView, f);
            tuxIconView.LIZJ(!z);
        }
        String str = c1860930yWh2.LLJI;
        TuxTextView tuxTextView2 = this.LLJLLIL;
        if (tuxTextView2 != null) {
            if (str != null && str.length() != 0) {
                tuxTextView2.setText(str);
                C337180DJs.LIZJ(tuxTextView2);
            } else {
                C337180DJs.LIZ(tuxTextView2);
            }
        }
        String str2 = (String) C13LP.LJJJLL(c1860930yWh2.LLILZ);
        if (str2 == null) {
            str2 = "";
        }
        SmartImageView smartImageView2 = this.LLJLIL;
        if (smartImageView2 != null) {
            INimbleVideoListDependAbility iNimbleVideoListDependAbilityOp3 = op();
            if (iNimbleVideoListDependAbilityOp3 != null) {
                iNimbleVideoListDependAbilityOp3.te2(c1860930yWh2.LLJILJIL, smartImageView2);
            } else {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ.LJJI(smartImageView2);
                c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
        }
        TuxTextView tuxTextView3 = this.LLJLILLLLZIIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(C1843500y4a.LIZIZ(c1860930yWh2.LLILLL));
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1860930yWh c1860930yWh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1860930yWh c1860930yWh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
