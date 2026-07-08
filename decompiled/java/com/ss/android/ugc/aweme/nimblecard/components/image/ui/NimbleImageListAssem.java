package com.ss.android.ugc.aweme.nimblecard.components.image.ui;

import X.AbstractC214823195h;
import X.C01GW;
import X.C0DXR;
import X.C0Q4Y;
import X.C1559260qg8;
import X.C20600815jK;
import X.C2217381BqS;
import X.C452501pT;
import X.C685070Qu1;
import X.C723580SZw;
import X.C724270Sb3;
import X.C736680Sv4;
import X.C736820SvI;
import X.C789500Uy4;
import X.InterfaceC1891350zJl;
import X.InterfaceC685610Qut;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nimblecard.components.base.NimbleBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class NimbleImageListAssem extends NimbleBaseAssem<InterfaceC685610Qut> {
    public C789500Uy4 LLJLIL;
    public final C1559260qg8 LLJLILLLLZIIL = new C1559260qg8(new C723580SZw(this, C685070Qu1.class, null), checkSupervisorPrepared());
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 70));
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 73));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 79));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 74));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 77));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 76));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 75));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 71));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 72));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 78));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dt2;
    }

    public final C685070Qu1 op() {
        return (C685070Qu1) this.LLJLILLLLZIIL.getValue();
    }

    public final int tp() {
        int iMin = Math.min(((Number) this.LLJLL.getValue()).intValue(), sp().getImageList().size()) + up();
        if (iMin < 1) {
            return 1;
        }
        return iMin;
    }

    public final int up() {
        return ((Number) this.LLJLLL.getValue()).intValue();
    }

    public final InterfaceC685610Qut sp() {
        Function0<? extends InterfaceC685610Qut> function0;
        InterfaceC685610Qut interfaceC685610QutInvoke;
        C685070Qu1 c685070Qu1Op = op();
        if (c685070Qu1Op != null && (function0 = c685070Qu1Op.LLJILLL) != null && (interfaceC685610QutInvoke = function0.invoke()) != null) {
            return interfaceC685610QutInvoke;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (InterfaceC685610Qut) (c724270Sb3 != null ? c724270Sb3.LL : null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        C789500Uy4 c789500Uy4 = (C789500Uy4) view.findViewById(R.id.kd4);
        this.LLJLIL = c789500Uy4;
        if (c789500Uy4 != null) {
            Function2<? super Integer, ? super View, Unit> function2 = null;
            c789500Uy4.setItemAnimator(null);
            C685070Qu1 c685070Qu1Op = op();
            if (c685070Qu1Op != null) {
                function2 = c685070Qu1Op.LLJILJILJ;
            }
            if (function2 != null) {
                z = true;
            } else {
                z = false;
            }
            c789500Uy4.setEnableIntercept(z);
            c789500Uy4.setTag(R.id.rnd, this.LLJL.getValue());
            c789500Uy4.LJIILJJIL(NimbleImageItemCell.class);
            final int iIntValue = ((Number) this.LLJZ.getValue()).intValue();
            c789500Uy4.addItemDecoration(new C0DXR(iIntValue) { // from class: X.0DWp
                public final int LL;

                {
                    this.LL = iIntValue;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    int i;
                    Pair pair;
                    GridLayoutManager gridLayoutManager;
                    AbstractC214823195h abstractC214823195h;
                    GridLayoutManager gridLayoutManager2;
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager2 = (GridLayoutManager) layoutManager) != null) {
                        i = gridLayoutManager2.LLILLJJLI;
                    } else {
                        i = 1;
                    }
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    if ((layoutManager2 instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager2) != null && (abstractC214823195h = gridLayoutManager.LLIZ) != null) {
                        int i2 = 0;
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        for (int i6 = 0; i6 < childAdapterPosition; i6++) {
                            int iLJFF = abstractC214823195h.LJFF(i6);
                            i3 += iLJFF;
                            if (i3 >= i) {
                                i5++;
                                i3 = 0;
                                i4 = 0;
                            } else {
                                i4 += iLJFF;
                            }
                        }
                        if (i3 + abstractC214823195h.LJFF(childAdapterPosition) > i) {
                            i5++;
                        } else {
                            i2 = i4;
                        }
                        pair = new Pair(Integer.valueOf(i5), Integer.valueOf(i2));
                    } else {
                        pair = new Pair(Integer.valueOf(childAdapterPosition / i), Integer.valueOf(childAdapterPosition % i));
                    }
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    int iIntValue3 = ((Number) pair.getFirst()).intValue();
                    if (!C426750GoL.LIZLLL(view2.getContext())) {
                        int i7 = this.LL;
                        rect.left = (iIntValue2 * i7) / i;
                        rect.right = i7 - (((iIntValue2 + 1) * i7) / i);
                    } else {
                        int i8 = this.LL;
                        rect.right = (iIntValue2 * i8) / i;
                        rect.left = i8 - (((iIntValue2 + 1) * i8) / i);
                    }
                    if (iIntValue3 > 0) {
                        rect.top = this.LL;
                    }
                }
            });
            C20600815jK<InterfaceC1891350zJl> state = c789500Uy4.getState();
            if (state != null) {
                state.LIZLLL = C0Q4Y.BUFFER;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(c789500Uy4.getContext(), ((Number) this.LLJLL.getValue()).intValue() + up());
            if (up() > 0) {
                gridLayoutManager.LLIZ = new AbstractC214823195h() { // from class: X.147T
                    @Override // X.AbstractC214823195h
                    public final int LJFF(int i) {
                        if ((i + 1) % ((Number) this.LJ.LLJLL.getValue()).intValue() != 0) {
                            return 1;
                        }
                        return 1 + this.LJ.up();
                    }
                };
            }
            c789500Uy4.setLayoutManager(gridLayoutManager);
        }
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (assemViewModel != null) {
            C736680Sv4.LJIIIIZZ(this, assemViewModel, new C2217381BqS() { // from class: X.147U
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C147S) obj).LLILLJJLI;
                }
            }, C736820SvI.LJ(), new AwS644S0100000_30(this, 11), 4);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        GridLayoutManager gridLayoutManager;
        C789500Uy4 c789500Uy4 = this.LLJLIL;
        if (c789500Uy4 != null) {
            RecyclerView.LayoutManager layoutManager = c789500Uy4.getLayoutManager();
            if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
                gridLayoutManager.LJIJ(tp());
            }
            yp(sp());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0279 A[PHI: r0
      0x0279: PHI (r0v56 java.lang.Integer) = (r0v55 java.lang.Integer), (r0v96 java.lang.Integer) binds: [B:126:0x0258, B:132:0x0277] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yp(X.InterfaceC685610Qut r30) {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nimblecard.components.image.ui.NimbleImageListAssem.yp(X.0Qut):void");
    }
}
