package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.C01GW;
import X.C07E5;
import X.C0H1U;
import X.C0Q0I;
import X.C0Q0J;
import X.C1383370m6R;
import X.C1744700vVE;
import X.C2277791EDp;
import X.C342880DcM;
import X.C342890DcN;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C661350Pwr;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.bot.core.config.TakoSugStyle;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS501S0200000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTakoSugAssem extends ReusedUISlotAssem<SearchTakoSugAssem> implements InterfaceC712990Rxx<C0Q0I> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 406));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 407));
    public LinearLayoutCompat LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f08;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (LinearLayoutCompat) view.findViewById(R.id.na8);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C0Q0I c0q0i) {
        int i;
        int i2;
        int iLIZIZ;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        int i7;
        C0Q0I c0q0i2 = c0q0i;
        LinearLayoutCompat linearLayoutCompat = this.LLJLIL;
        if (linearLayoutCompat != null) {
            C0Q0J c0q0j = c0q0i2.LL;
            linearLayoutCompat.getContext();
            TuxIconView tuxIconView = (TuxIconView) linearLayoutCompat.findViewById(R.id.l7o);
            TuxIconView tuxIconView2 = (TuxIconView) linearLayoutCompat.findViewById(R.id.l7n);
            TuxTextView tuxTextView = (TuxTextView) linearLayoutCompat.findViewById(R.id.f837z76);
            int iLIZ = C2277791EDp.LIZ();
            if (iLIZ != 1 && iLIZ != 3) {
                i = R.attr.a1j;
            } else {
                i = R.attr.a1i;
            }
            C661350Pwr.LIZJ(tuxIconView);
            C661350Pwr.LIZJ(tuxIconView2);
            C426750GoL.LJIIIZ(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, null, null, false, 30);
            int iLIZ2 = C2277791EDp.LIZ();
            if (iLIZ2 != 2 && iLIZ2 != 3) {
                if (tuxTextView != null) {
                    tuxTextView.setSingleLine(true);
                    tuxTextView.setMaxLines(1);
                }
            } else if (tuxTextView != null) {
                tuxTextView.setSingleLine(false);
                tuxTextView.setMaxLines(2);
            }
            int iLIZ3 = C2277791EDp.LIZ();
            if (iLIZ3 != 1) {
                if (iLIZ3 != 2 && iLIZ3 != 3) {
                    if (iLIZ3 != 4) {
                        i2 = 3;
                        C426750GoL.LJIIL(linearLayoutCompat, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), 16);
                    } else {
                        i2 = 3;
                        C426750GoL.LJIIL(linearLayoutCompat, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7))), 16);
                    }
                } else {
                    i2 = 3;
                    C426750GoL.LJIIL(linearLayoutCompat, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                }
            } else {
                i2 = 3;
                C426750GoL.LJIIL(linearLayoutCompat, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(6.5d)))), 16);
            }
            if (tuxTextView != null) {
                tuxTextView.setMaxWidth(Integer.MAX_VALUE);
            }
            C0H1U.LJI(-1, linearLayoutCompat);
            int iLIZ4 = C2277791EDp.LIZ();
            if (iLIZ4 != 2 && iLIZ4 != i2) {
                iLIZIZ = -2;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }
            C1744700vVE.LJIIIZ(iLIZIZ, linearLayoutCompat);
            if (((TakoSugStyle) C342890DcN.LIZIZ.getValue()).isShortSug) {
                i4 = 4;
                if (C2277791EDp.LIZ() == 4) {
                    C661350Pwr.LJIIL(tuxIconView2);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_arrow_right_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    tuxIconView2.setTuxIcon(c419910GdJ);
                    i3 = 1;
                    z = false;
                    i6 = 3;
                    C426750GoL.LJIIIZ(tuxIconView2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, false, 26);
                    C1383370m6R.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), tuxIconView2);
                } else {
                    i3 = 1;
                    i6 = 3;
                    z = false;
                    C661350Pwr.LIZJ(tuxIconView2);
                }
                if (C2277791EDp.LIZ() == i3) {
                    i7 = 6;
                } else {
                    i7 = 8;
                }
                if (C2277791EDp.LIZ() == i3 || C2277791EDp.LIZ() == i6) {
                    z = true;
                }
                C342880DcM.LIZ(i7, linearLayoutCompat, z);
            } else {
                i3 = 1;
                i4 = 4;
                C661350Pwr.LJIIL(tuxIconView2);
                C342880DcM.LIZ(200, linearLayoutCompat, false);
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_arrow_right_ltr;
                c419910GdJ2.LJ = Integer.valueOf(i);
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c419910GdJ2);
                }
                tuxIconView2.setTuxIcon(c419910GdJ2);
            }
            if (tuxTextView != null) {
                tuxTextView.setText(c0q0j.LLILLJJLI);
                tuxTextView.setTextColorRes(i);
                int iLIZ5 = C2277791EDp.LIZ();
                if (iLIZ5 != i3) {
                    if (iLIZ5 != i4) {
                        i5 = 52;
                    } else {
                        i5 = 62;
                    }
                } else {
                    i5 = 41;
                }
                tuxTextView.setTuxFont(i5);
            }
        }
        LinearLayoutCompat linearLayoutCompat2 = this.LLJLIL;
        if (linearLayoutCompat2 != null) {
            C786410Ut5.I7(new AbS501S0200000_10(this, c0q0i2, 3), linearLayoutCompat2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C0Q0I c0q0i) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C0Q0I c0q0i) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
