package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C01GW;
import X.C03IT;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1338340kvo;
import X.C1854150yLl;
import X.C2097608Jq;
import X.C2211631BhB;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class MenuItemAssem extends ReusedUISlotAssem<MenuItemAssem> implements InterfaceC712990Rxx<C1854150yLl> {
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public C1295960jpS LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C1854150yLl LLJLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 822));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fqf;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxIconView) view.findViewById(R.id.o8d);
        this.LLJL = (C1295960jpS) view.findViewById(R.id.o8e);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.o8f);
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.o8g);
        C786410Ut5.I7(new AkS94S0100000_27(this, 18), view);
        C2211631BhB.LJ(view, new AwS393S0200000_27(view, this, 55));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1854150yLl c1854150yLl) {
        String strValueOf;
        Map<String, String> mapLJ;
        int i;
        int iIntValue;
        C1854150yLl c1854150yLl2 = c1854150yLl;
        boolean z = c1854150yLl2.LLJJIJI;
        int i2 = R.attr.a1h;
        int i3 = 8;
        int iIntValue2 = 0;
        if (!z && Intrinsics.LJFF(c1854150yLl2.LLJJJIL, Boolean.TRUE) && c1854150yLl2.LLJJIJIIJIL != null && c1854150yLl2.LLJJIJIL != null) {
            Context context = getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                iIntValue = c1854150yLl2.LLJJIJIL.intValue();
            } else {
                iIntValue = c1854150yLl2.LLJJIJIIJIL.intValue();
            }
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            }
            C1295960jpS c1295960jpS = this.LLJL;
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
            }
            C1295960jpS c1295960jpS2 = this.LLJL;
            if (c1295960jpS2 != null) {
                c1295960jpS2.setAnimation(iIntValue);
            }
            C1295960jpS c1295960jpS3 = this.LLJL;
            if (c1295960jpS3 != null) {
                c1295960jpS3.playAnimation();
            }
        } else {
            TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            C1295960jpS c1295960jpS4 = this.LLJL;
            if (c1295960jpS4 != null) {
                C786410Ut5.LLD(8, c1295960jpS4);
            }
            Integer num = c1854150yLl2.LLILLL;
            if (num != null) {
                num.intValue();
                TuxIconView tuxIconView3 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView3 != null) {
                    Integer num2 = c1854150yLl2.LLILLL;
                    if (num2 != null) {
                        num2.intValue();
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = c1854150yLl2.LLILLL.intValue();
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
                        if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                            i = R.attr.t9;
                        } else {
                            i = R.attr.a1h;
                        }
                        c419910GdJ.LJ = Integer.valueOf(i);
                        tuxIconView3.setTuxIcon(c419910GdJ);
                    }
                    tuxIconView3.clearColorFilter();
                }
            } else {
                TuxIconView tuxIconView4 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxIconView4 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
                    Drawable drawableLIZ = c384050F3z.LIZ(tuxIconView4.getContext());
                    if (C960203pA.LIZIZ(tuxIconView4.getContext())) {
                        strValueOf = String.valueOf(c1854150yLl2.LLILZ);
                    } else {
                        strValueOf = String.valueOf(c1854150yLl2.LLILZIL);
                    }
                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(Collections.singletonList(strValueOf)));
                    c1331670kl3LJIIJ.LJJI(tuxIconView4);
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLLIL.getValue();
                    if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c1331670kl3LJIIJ.LJJJIL = new C1338340kvo("action_bar", mapLJ, tuxIconView4, i3);
                    c1331670kl3LJIIJ.LJJIIZI(drawableLIZ);
                    c1331670kl3LJIIJ.LJIL(drawableLIZ);
                    C786410Ut5.h3(c1331670kl3LJIIJ);
                    if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.t9, tuxIconView4.getContext());
                        if (numLIZJ != null) {
                            iIntValue2 = numLIZJ.intValue();
                        }
                        tuxIconView4.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    } else {
                        tuxIconView4.clearColorFilter();
                    }
                }
            }
        }
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                i2 = R.attr.t9;
            }
            tuxTextView.setTextColorRes(i2);
            tuxTextView.setText(c1854150yLl2.LLILLJJLI);
        }
        TuxIconView tuxIconView5 = this.LLJLILLLLZIIL;
        if (tuxIconView5 != null) {
            if (c1854150yLl2.LLJILJILJ && c1854150yLl2.LLJILLL) {
                C339190DRl.LIZLLL(tuxIconView5);
            } else {
                C339190DRl.LIZIZ(tuxIconView5);
            }
        }
        Function1<C1854150yLl, Unit> function1 = c1854150yLl2.LLJILJIL;
        if (function1 != null) {
            function1.invoke(c1854150yLl2);
        }
        this.LLJLL = c1854150yLl2;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1854150yLl c1854150yLl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1854150yLl c1854150yLl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
