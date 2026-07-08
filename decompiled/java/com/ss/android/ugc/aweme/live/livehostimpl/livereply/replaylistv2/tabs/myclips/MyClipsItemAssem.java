package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.myclips;

import X.AbstractC1335900krs;
import X.AbstractViewOnClickListenerC1231770i9v;
import X.C0H9F;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13BV;
import X.C1782840wUk;
import X.C1838100xvs;
import X.C21415018rM;
import X.C444830HcP;
import X.C444890HcV;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1320380kSq;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class MyClipsItemAssem extends ReusedUISlotAssem<MyClipsItemAssem> implements InterfaceC712990Rxx<C1782840wUk> {
    public ConstraintLayout LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public View LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C21415018rM LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public C1782840wUk LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dgv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJZ = null;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (ConstraintLayout) view.findViewById(R.id.f4y);
        this.LLJL = (SmartImageView) view.findViewById(R.id.f59);
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            C0H9F.LIZ(smartImageView);
        }
        this.LLJLIL = view.findViewById(R.id.j4c);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.gbz);
        this.LLJLL = (C21415018rM) view.findViewById(R.id.fg1);
        this.LLJLLIL = view.findViewById(R.id.kik);
        this.LLJLLL = view.findViewById(R.id.unavailable_mask);
        ConstraintLayout constraintLayout = this.LLJJLIIIJLLLLLLLZ;
        if (constraintLayout != null) {
            float fLJIIZILJ = (C497740JfY.LJIIZILJ() - (4 * C497740JfY.LIZIZ(6))) / 3;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constraintLayout.getLayoutParams();
            layoutParams.width = (int) fLJIIZILJ;
            layoutParams.height = (int) (((double) fLJIIZILJ) / 0.61d);
            C786410Ut5.m6(constraintLayout, layoutParams);
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1231770i9v() { // from class: X.0xcf
            {
                super(300L);
            }

            @Override // X.AbstractViewOnClickListenerC1231770i9v
            public final void LIZ(View view2) {
                C1782840wUk c1782840wUk;
                if (view2 != null && (c1782840wUk = this.LLILZ.LLJZ) != null) {
                    C1835440xra c1835440xra = C1835440xra.LIZ;
                    long j = c1782840wUk.LL;
                    String str = c1782840wUk.LLILZIL;
                    int i = c1782840wUk.LLIZ;
                    c1835440xra.getClass();
                    C1835440xra.LIZIZ(i, "click", j, str);
                    int i2 = c1782840wUk.LLIZ;
                    if (i2 == 1) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ.LJJIJL());
                        c1389890mGx.LJIIIZ(2131853385);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    if (i2 == 3) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILZ.LJJIJL());
                        c1389890mGx2.LJIIIZ(2131853360);
                        c1389890mGx2.LJIIJJI();
                        return;
                    }
                    C1834140xpU c1834140xpU = C1834140xpU.LIZ;
                    Context context = this.LLILZ.getContext();
                    String strValueOf = String.valueOf(c1782840wUk.LL);
                    String str2 = c1782840wUk.LLILZIL;
                    String str3 = c1782840wUk.LLILZLL;
                    boolean z = c1782840wUk.LLJI;
                    boolean z2 = c1782840wUk.LLJIJIL;
                    String str4 = c1782840wUk.LLJILJIL;
                    EnumC1782300wTs enumC1782300wTs = EnumC1782300wTs.HIGHLIGHT;
                    c1834140xpU.getClass();
                    C1834140xpU.LIZ(context, strValueOf, str2, str3, 0.0f, "three_column_clips", enumC1782300wTs, "live_replay", z, z2, str4);
                }
            }
        }, view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1782840wUk c1782840wUk) {
        boolean z;
        final boolean z2;
        int i;
        int iIntValue;
        List listSingletonList;
        String strLIZIZ;
        InterfaceC1320380kSq interfaceC1320380kSq;
        int i2;
        C1782840wUk c1782840wUk2 = c1782840wUk;
        this.LLJZ = c1782840wUk2;
        int i3 = c1782840wUk2.LLIZ;
        int i4 = 0;
        if (i3 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i3 != 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null) {
            int i5 = c1782840wUk2.LLIZLLLIL;
            if (i5 <= 0 || (i2 = c1782840wUk2.LLJ) <= 0 || i2 / i5 > 1.0f) {
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
            } else {
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
            }
            if (!Intrinsics.LJFF(smartImageView.getHierarchy().LJIIJJI(), interfaceC1320380kSq)) {
                smartImageView.getHierarchy().LJIIZILJ(interfaceC1320380kSq);
            }
        }
        SmartImageView smartImageView2 = this.LLJL;
        if (smartImageView2 != null) {
            String str = c1782840wUk2.LLILLJJLI;
            final View view = this.LLJLIL;
            final AwS407S0200000_6 awS407S0200000_6 = new AwS407S0200000_6(this, c1782840wUk2, 66);
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            if (str != null && str.length() != 0) {
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                c1331670kl3LJIIIZ.LJJ(smartImageView2);
                c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0GnZ
                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                        View view3;
                        int i6;
                        if (awS407S0200000_6.invoke().booleanValue() && (view3 = view) != null) {
                            if (z2) {
                                i6 = 0;
                            } else {
                                i6 = 8;
                            }
                            C786410Ut5.LJLLLLLL(i6, view3);
                        }
                    }
                });
            } else {
                smartImageView2.setController(null);
            }
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        String strLIZ = "";
        if (tuxTextView != null) {
            float f = c1782840wUk2.LLILZ;
            if (f <= 0.0f) {
                strLIZIZ = "";
            } else {
                strLIZIZ = C1838100xvs.LIZIZ(f);
            }
            tuxTextView.setText(strLIZIZ);
        }
        C21415018rM c21415018rM = this.LLJLL;
        if (c21415018rM != null) {
            long j = c1782840wUk2.LLILLL;
            if (j > 0) {
                strLIZ = C1838100xvs.LIZ(j);
            }
            int iLJIIZILJ = (int) (((C497740JfY.LJIIZILJ() - (4 * C497740JfY.LIZIZ(6))) / 3) - (2 * C497740JfY.LIZIZ(8)));
            if (iLJIIZILJ < 1) {
                iLJIIZILJ = 1;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, c21415018rM.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C444890HcV c444890HcV = new C444890HcV();
            c444890HcV.LIZ(81);
            int iLIZIZ = C814420VxA.LIZIZ(c444890HcV.getTextSize() / Resources.getSystem().getDisplayMetrics().density);
            C444890HcV c444890HcV2 = new C444890HcV();
            c444890HcV2.LIZ(91);
            int iLIZIZ2 = C814420VxA.LIZIZ(c444890HcV2.getTextSize() / Resources.getSystem().getDisplayMetrics().density);
            if (iLIZIZ > iLIZIZ2) {
                listSingletonList = Collections.singletonList(new Pair(Integer.valueOf(iLIZIZ2), Integer.valueOf(iLIZIZ)));
            } else {
                listSingletonList = C13BV.INSTANCE;
            }
            C444830HcP c444830HcP = new C444830HcP();
            c444830HcP.LJIILIIL(strLIZ);
            c444830HcP.LJII(81);
            c444830HcP.LJIILJJIL(iIntValue);
            c444830HcP.LJIILL(iLJIIZILJ);
            Layout layoutLIZJ = C444830HcP.LIZJ(c444830HcP, 0.0f, false, listSingletonList, 27);
            if (layoutLIZJ.getLineCount() > 1) {
                C444830HcP c444830HcP2 = new C444830HcP();
                c444830HcP2.LJIILIIL(strLIZ);
                c444830HcP2.LJII(91);
                c444830HcP2.LJIILJJIL(iIntValue);
                c444830HcP2.LJIILL(iLJIIZILJ);
                c444830HcP2.LJIIIZ(1);
                c444830HcP2.LIZIZ.LJII = TextUtils.TruncateAt.END;
                layoutLIZJ = c444830HcP2.LIZIZ();
            }
            c21415018rM.setTextLayout(layoutLIZJ);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            if (c1782840wUk2.LLIZ == 1) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        View view3 = this.LLJLLL;
        if (view3 != null) {
            if (c1782840wUk2.LLIZ != 3) {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, view3);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1782840wUk c1782840wUk) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1782840wUk c1782840wUk) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
