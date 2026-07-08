package com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem;

import X.C019F;
import X.C1166240gSE;
import X.C12ES;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1739050vM7;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C19ME;
import X.C21533219Ow;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUISlotAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class StoreSkeletonAssem extends MixUISlotAssem<C1166240gSE> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C21533219Ow LLJJI;
    public C21533219Ow LLJJIII;
    public C1749280vcc LLJJIJI;
    public ViewStub LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoreSkeletonAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/showcase/mix/viewmodel/StoreMixViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoreSkeletonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoreMixViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 203), AFwS256S0000000_18.get$arr$(67), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.f884bsj;
    }

    public final C21533219Ow hp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.v6q) : null;
            this.LLJJI = (C21533219Ow) viewFindViewById;
        }
        return (C21533219Ow) viewFindViewById;
    }

    public final C1749280vcc ip() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLJJIJI = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C21533219Ow kp() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.wxd) : null;
            this.LLJJIII = (C21533219Ow) viewFindViewById;
        }
        return (C21533219Ow) viewFindViewById;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view);
        if (C1739050vM7.LIZIZ) {
            Context context = getContext();
            if (context != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
                int iIntValue = numLIZJ2.intValue();
                C21533219Ow c21533219OwKp = kp();
                if (c21533219OwKp != null) {
                    c21533219OwKp.setBackgroundColor(iIntValue);
                }
                C21533219Ow c21533219OwHp = hp();
                if (c21533219OwHp != null) {
                    c21533219OwHp.setBackgroundColor(iIntValue);
                }
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bv, context2)) != null) {
                int iIntValue2 = numLIZJ.intValue();
                C21533219Ow c21533219OwHp2 = hp();
                if (c21533219OwHp2 != null) {
                    c21533219OwHp2.setSkeletonColor1(iIntValue2);
                }
                C21533219Ow c21533219OwKp2 = kp();
                if (c21533219OwKp2 != null) {
                    c21533219OwKp2.setSkeletonColor1(iIntValue2);
                }
            }
        }
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gSa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1166370gSR) obj).LL;
            }
        }, null, new AwS454S0200000_18(this, view, 2), 6);
        C1749280vcc c1749280vccIp = ip();
        if (c1749280vccIp != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJFF(c1722300uv6, new AwS562S0100000_18(this, 202));
            c1749280vccIp.setStatus(c1722300uv6);
        }
    }

    public static void lp(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12ES.LJIILL(0, view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = i;
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }
}
