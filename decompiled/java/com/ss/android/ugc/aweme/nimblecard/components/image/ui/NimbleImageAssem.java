package com.ss.android.ugc.aweme.nimblecard.components.image.ui;

import X.C01GW;
import X.C0Q0E;
import X.C0R09;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1879000yzq;
import X.C1ER1;
import X.C297040Bkc;
import X.C337180DJs;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.InterfaceC1587906Jp;
import X.InterfaceC1911280zpu;
import X.InterfaceC712990Rxx;
import Y.ACListenerS92S0300000_28;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.NimbleMobAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NimbleImageAssem extends ReusedUISlotAssem<NimbleImageAssem> implements InterfaceC712990Rxx<C1879000yzq> {
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 303));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 301));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 302));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dt1;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(final View view) {
        Object obj;
        this.LLJJLIIIJLLLLLLLZ = (FrameLayout) view.findViewById(R.id.p9o);
        this.LLJL = (SmartImageView) view.findViewById(R.id.p9n);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.tv_remain_items);
        if (view.isAttachedToWindow()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Function2<Integer, View, Unit> function2 = ((C1879000yzq) obj).LLIZ;
            if (function2 != null) {
                if (c724270Sb3 != null) {
                    obj2 = c724270Sb3.LL;
                }
                function2.invoke(Integer.valueOf(((C1879000yzq) obj2).LL), view);
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0zlk
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                view.removeOnAttachStateChangeListener(this);
                Function2<Integer, View, Unit> function22 = ((C1879000yzq) C631370Opb.LIZ(this)).LLIZ;
                if (function22 != null) {
                    function22.invoke(Integer.valueOf(((C1879000yzq) C631370Opb.LIZ(this)).LL), view);
                }
            }
        });
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1879000yzq c1879000yzq) {
        TuxIconDrawable tuxIconDrawable;
        int iIntValue;
        Integer num;
        C0R09 c0r09;
        Integer num2;
        int iIntValue2;
        Number numberValueOf;
        Integer num3;
        ViewGroup.LayoutParams layoutParams;
        C1879000yzq c1879000yzq2 = c1879000yzq;
        InterfaceC1911280zpu interfaceC1911280zpu = (InterfaceC1911280zpu) this.LLJLL.getValue();
        if (interfaceC1911280zpu != null) {
            interfaceC1911280zpu.LLJJLIIIJLLLLLLLZ(LJJIJL());
            interfaceC1911280zpu.qf(LJJIJL(), c1879000yzq2.LLJIJIL, c1879000yzq2.LLILLL);
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null && c1879000yzq2.LLILLL.length() > 0) {
            Pair<Integer, Integer> pair = c1879000yzq2.LLILZIL;
            if (pair != null) {
                if (pair.getSecond().intValue() > 0) {
                    iIntValue = pair.getSecond().intValue();
                } else {
                    C0R09 c0r092 = c1879000yzq2.LLILZ;
                    if (c0r092 != null && (num = c0r092.LIZIZ) != null && num.intValue() > 0 && (c0r09 = c1879000yzq2.LLILZ) != null && (num2 = c0r09.LIZ) != null && num2.intValue() > 0) {
                        C0R09 c0r093 = c1879000yzq2.LLILZ;
                        if (c0r093 != null && (num3 = c0r093.LIZIZ) != null) {
                            iIntValue2 = num3.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        float f = iIntValue2;
                        C0R09 c0r094 = c1879000yzq2.LLILZ;
                        if (c0r094 == null || (numberValueOf = c0r094.LIZ) == null) {
                            numberValueOf = Float.valueOf(1.0f);
                        }
                        iIntValue = (int) ((f / numberValueOf.floatValue()) * pair.getFirst().floatValue());
                    } else {
                        iIntValue = pair.getFirst().intValue();
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = smartImageView.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = pair.getFirst().intValue();
                    layoutParams2.height = iIntValue;
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.G6(smartImageView, layoutParams2);
                FrameLayout frameLayout = this.LLJJLIIIJLLLLLLLZ;
                if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
                    layoutParams.width = pair.getFirst().intValue();
                    layoutParams.height = iIntValue;
                }
            }
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(c1879000yzq2.LLILLJJLI)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            Drawable drawableLIZ = c384050F3z.LIZ(smartImageView.getContext());
            if (c1879000yzq2.LLJI) {
                smartImageView.setImageDrawable(drawableLIZ);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C0Q0E.LIZIZ(c1879000yzq2.LLILLL));
            c1331670kl3LJIIIZ.LJIL(drawableLIZ);
            c1331670kl3LJIIIZ.LJJIIZI(drawableLIZ);
            c1331670kl3LJIIIZ.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIIZ.LIZLLL("NimbleImageAssem");
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(Float.valueOf(c1879000yzq2.LLILLJJLI));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, smartImageView.getContext());
            if (numLIZJ != null) {
                int iIntValue3 = numLIZJ.intValue();
                float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(0.5f));
                c1331750klB.LIZJ = iIntValue3;
                c1331750klB.LIZIZ = fLIZIZ;
            }
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            int i = smartImageView.getLayoutParams().width;
            int i2 = smartImageView.getLayoutParams().height;
            c1331670kl3LJIIIZ.LJIIIIZZ = i;
            c1331670kl3LJIIIZ.LJIIIZ = i2;
            if (C297040Bkc.LIZ()) {
                C1ER1.LIZIZ.a0(c1331670kl3LJIIIZ, c1879000yzq2.LLJIJIL, c1879000yzq2.LLILLL, LJJIJL(), (InterfaceC1911280zpu) this.LLJLL.getValue(), (NimbleMobAbility) this.LLJLLIL.getValue());
            }
            c1331670kl3LJIIIZ.LJIIJJI();
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            Integer num4 = c1879000yzq2.LLILZLL;
            if (num4 != null) {
                tuxTextView.setText(String.valueOf(num4.intValue()));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_plus_bold;
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(10.0f)));
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView.getContext());
                if (Boolean.valueOf(true ^ C426750GoL.LIZLLL(tuxTextView.getContext())).booleanValue()) {
                    tuxIconDrawable = tuxIconDrawableLIZ;
                } else {
                    tuxIconDrawable = null;
                }
                if (!C426750GoL.LIZLLL(tuxTextView.getContext())) {
                    tuxIconDrawableLIZ = null;
                }
                tuxTextView.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawable, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                C384050F3z c384050F3z2 = new C384050F3z();
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zf);
                c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
                tuxTextView.setBackground(c384050F3z2.LIZ(tuxTextView.getContext()));
                tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f))));
                C337180DJs.LIZJ(tuxTextView);
            } else {
                C337180DJs.LIZ(tuxTextView);
            }
        }
        Function2<Integer, View, Unit> function2 = c1879000yzq2.LLIZLLLIL;
        if (function2 != null) {
            C786410Ut5.I7(new ACListenerS92S0300000_28(function2, c1879000yzq2, this, 9), getContentView());
        } else {
            getContentView().setClickable(false);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1879000yzq c1879000yzq) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1879000yzq c1879000yzq) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
