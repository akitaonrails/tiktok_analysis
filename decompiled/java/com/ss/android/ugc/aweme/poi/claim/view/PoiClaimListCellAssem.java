package com.ss.android.ugc.aweme.poi.claim.view;

import X.AbstractC2211791BhR;
import X.AbstractC738140SxQ;
import X.C1197910hHJ;
import X.C1200050hKl;
import X.C1200090hKp;
import X.C1220000hqw;
import X.C13LE;
import X.C1841350y17;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AFwS302S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimListCellAssem extends ReusedUISlotAssem<PoiClaimListCellAssem> implements InterfaceC712990Rxx<C1200050hKl> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C1841350y17 LLJLIL;
    public C1200050hKl LLJLILLLLZIIL;
    public final C736950SvV LLJLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dyt;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final PoiClaimPoiListViewModel op() {
        return (PoiClaimPoiListViewModel) this.LLJLL.getValue();
    }

    public PoiClaimListCellAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(275);
        this.LLJLL = new C736950SvV(C13LE.LIZ(PoiClaimPoiListViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(277), new AwS562S0100000_18((AbstractC738140SxQ) this, 880), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.qyd);
        this.LLJL = (TuxTextView) view.findViewById(R.id.qyb);
        this.LLJLIL = (C1841350y17) view.findViewById(R.id.qyc);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0hLj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1200090hKp) obj).LLILLJJLI;
            }
        }, null, AFwS302S0000000_18.get$arr$(20), 6);
        C2211751BhN.LIZ(LJJIJL(), new AbstractC2211791BhR(this) { // from class: X.0hLZ
            public Function0<String> LJ;
            public final int LJFF = 100;
            public final C1208900hZ2 LJI;

            @Override // X.AbstractC2211791BhR
            public final int LIZJ() {
                return this.LJFF;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            {
                this.LJ = new AwS562S0100000_18(this, 2593);
                this.LJI = new C1208900hZ2(this, 7);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1200050hKl c1200050hKl) {
        PoiData poiData;
        String str;
        PoiData poiData2;
        String str2;
        List<Position> list;
        String str3;
        String str4;
        PoiData poiData3;
        C1200050hKl c1200050hKl2 = c1200050hKl;
        this.LLJLILLLLZIIL = c1200050hKl2;
        C1841350y17 c1841350y17 = this.LLJLIL;
        Integer num = null;
        if (c1841350y17 != null) {
            PoiData poiData4 = ((C1200090hKp) op().getState()).LLILLJJLI;
            if (poiData4 != null) {
                str3 = poiData4.poiId;
            } else {
                str3 = null;
            }
            C1200050hKl c1200050hKl3 = this.LLJLILLLLZIIL;
            if (c1200050hKl3 != null && (poiData3 = c1200050hKl3.LL) != null) {
                str4 = poiData3.poiId;
            } else {
                str4 = null;
            }
            c1841350y17.setChecked(Intrinsics.LJFF(str3, str4));
        }
        C1200050hKl c1200050hKl4 = this.LLJLILLLLZIIL;
        if (c1200050hKl4 != null && (poiData2 = c1200050hKl4.LL) != null && (str2 = poiData2.name) != null) {
            String str5 = ((C1200090hKp) op().getState()).LL;
            if (str5 != null && str5.length() != 0) {
                TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView != null) {
                    tuxTextView.setTuxFont(101);
                }
                TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView2 != null) {
                    C1200050hKl c1200050hKl5 = this.LLJLILLLLZIIL;
                    if (c1200050hKl5 != null) {
                        list = c1200050hKl5.LLILLJJLI;
                        num = c1200050hKl5.LLILZLL;
                    } else {
                        list = null;
                    }
                    C1197910hHJ.LJFF(tuxTextView2, str2, list, num);
                }
            } else {
                TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(str2);
                }
                TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
                if (tuxTextView4 != null) {
                    tuxTextView4.setTuxFont(102);
                }
            }
            TuxTextView tuxTextView5 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 0);
            }
        } else {
            TuxTextView tuxTextView6 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 4);
            }
        }
        C1200050hKl c1200050hKl6 = this.LLJLILLLLZIIL;
        if (c1200050hKl6 != null && (poiData = c1200050hKl6.LL) != null && (str = poiData.address) != null) {
            if (!Intrinsics.LJFF(str, poiData.name) && str.length() != 0) {
                TuxTextView tuxTextView7 = this.LLJL;
                if (tuxTextView7 != null) {
                    tuxTextView7.setText(str);
                }
                TuxTextView tuxTextView8 = this.LLJL;
                if (tuxTextView8 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView8, 0);
                }
            } else {
                TuxTextView tuxTextView9 = this.LLJL;
                if (tuxTextView9 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView9, 8);
                }
            }
        } else {
            TuxTextView tuxTextView10 = this.LLJL;
            if (tuxTextView10 != null) {
                C786410Ut5.LLLLZLL(tuxTextView10, 8);
            }
        }
        C786410Ut5.I7(new AkS57S0200000_18(this, c1200050hKl2, 34), LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1200050hKl c1200050hKl) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1200050hKl c1200050hKl) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
