package com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem;

import X.AbstractC503810JpL;
import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C503200JoM;
import X.C503230JoP;
import X.C504760Jqs;
import X.C506750Ju5;
import X.C506760Ju6;
import X.C506780Ju8;
import X.C506800JuA;
import X.C506810JuB;
import X.C507020JuW;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class DetailEmptyAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(DetailEmptyAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/perks/subspace/detail/vm/SubSpaceDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public DetailEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceDetailVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C506780Ju8(c19719912DlLIZ), new C507020JuW(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hoc;
    }

    public final SubSpaceDetailVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (SubSpaceDetailVM) assemVMLazy.getValue();
    }

    public final void ip(View view) {
        ArrayList<AbstractC503810JpL> arrayList;
        Integer numValueOf;
        ArrayList<AbstractC503810JpL> arrayList2;
        ArrayList<AbstractC503810JpL> arrayList3;
        if (!hp().xQ2()) {
            SubSpaceDetailVM subSpaceDetailVMHp = hp();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(283));
            C504760Jqs c504760Jqs = subSpaceDetailVMHp.LLILZ;
            if (c504760Jqs != null) {
                c504760Jqs.LJI();
            }
            C504760Jqs c504760Jqs2 = subSpaceDetailVMHp.LLILZ;
            if (c504760Jqs2 != null) {
                C503200JoM c503200JoM = c504760Jqs2.LLILLL;
                if (c503200JoM != null && (arrayList3 = c503200JoM.LL) != null) {
                    Iterator<AbstractC503810JpL> it2 = arrayList3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AbstractC503810JpL next = it2.next();
                        if (next instanceof C503230JoP) {
                            if (next != null) {
                                return;
                            }
                        }
                    }
                }
                C503200JoM c503200JoM2 = c504760Jqs2.LLILLL;
                if (c503200JoM2 != null && (arrayList2 = c503200JoM2.LL) != null) {
                    arrayList2.add(new C503230JoP(iLIZIZ));
                }
                C503200JoM c503200JoM3 = c504760Jqs2.LLILLL;
                if (c503200JoM3 == null || (arrayList = c503200JoM3.LL) == null || (numValueOf = Integer.valueOf(arrayList.size())) == null) {
                    return;
                }
                numValueOf.intValue();
                C503200JoM c503200JoM4 = c504760Jqs2.LLILLL;
                if (c503200JoM4 == null) {
                    return;
                }
                c503200JoM4.notifyItemInserted(numValueOf.intValue() - 1);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.LJLLLLLL(8, view);
        C504760Jqs c504760Jqs = hp().LLILZ;
        if (c504760Jqs != null) {
            c504760Jqs.LJII();
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Jti
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new C506800JuA(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new C506760Ju6(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new C506750Ju5(view, this), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0JuQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506340JtQ) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new C506810JuB(view, this), 4);
    }
}
