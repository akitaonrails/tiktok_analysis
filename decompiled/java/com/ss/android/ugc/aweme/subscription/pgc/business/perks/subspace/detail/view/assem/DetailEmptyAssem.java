package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.view.assem;

import X.AbstractC511160K2w;
import X.C019F;
import X.C0K2N;
import X.C0K37;
import X.C0K3G;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailEmptyAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailEmptyAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 462), AFwS237S0000000_7.get$arr$(213), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fh6;
    }

    public final SubSpaceDetailVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    public final void ip(View view) {
        ArrayList<AbstractC511160K2w> arrayList;
        Integer numValueOf;
        ArrayList<AbstractC511160K2w> arrayList2;
        ArrayList<AbstractC511160K2w> arrayList3;
        if (!hp().zQ2()) {
            SubSpaceDetailVM subSpaceDetailVMHp = hp();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(283));
            C0K3G c0k3g = subSpaceDetailVMHp.LLILLL;
            if (c0k3g != null) {
                c0k3g.LJI();
            }
            C0K3G c0k3g2 = subSpaceDetailVMHp.LLILLL;
            if (c0k3g2 != null) {
                C0K37 c0k37 = c0k3g2.LLILLL;
                if (c0k37 != null && (arrayList3 = c0k37.LL) != null) {
                    Iterator<AbstractC511160K2w> it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AbstractC511160K2w next = it2.next();
                        if (next instanceof C0K2N) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                C0K37 c0k372 = c0k3g2.LLILLL;
                if (c0k372 != null && (arrayList2 = c0k372.LL) != null) {
                    arrayList2.add(new C0K2N(iLIZIZ));
                }
                C0K37 c0k373 = c0k3g2.LLILLL;
                if (c0k373 == null || (arrayList = c0k373.LL) == null || (numValueOf = Integer.valueOf(arrayList.size())) == null) {
                    return;
                }
                numValueOf.intValue();
                C0K37 c0k374 = c0k3g2.LLILLL;
                if (c0k374 == null) {
                    return;
                }
                c0k374.notifyItemInserted(numValueOf.intValue() - 1);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view);
        C0K3G c0k3g = hp().LLILLL;
        if (c0k3g != null) {
            c0k3g.LJII();
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Jtk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 4), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 5), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 6), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506360JtS) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS443S0200000_7(view, this, 7), 4);
    }
}
