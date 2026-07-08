package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.C01D1;
import X.C13LE;
import X.C1637806bA;
import X.C1723530ux5;
import X.C1775830wJR;
import X.C19719912Dl;
import X.C21411818qq;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class BillboardSettingsAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public C21411818qq LLIZLLLIL;
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BillboardSettingsAssem.class, "globalViewModel", "getGlobalViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/BillboardGlobalViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BillboardSettingsAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BillboardGlobalViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 635), AFwS268S0000000_26.get$arr$(348), null, true);
    }

    public final BillboardGlobalViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (BillboardGlobalViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = view.getContext();
        if (context == null) {
            context = getContext();
        }
        C1723530ux5.LIZIZ(context, view);
        View viewFindViewById = this.LLIZLLLIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.ylu);
            } else {
                viewFindViewById = null;
            }
            this.LLIZLLLIL = (C21411818qq) viewFindViewById;
        }
        ((C21411818qq) viewFindViewById).setChecked(Go().getState().LLILLL);
        View view2 = this.LLIZLLLIL;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ylu);
            }
            this.LLIZLLLIL = (C21411818qq) viewFindViewById2;
            view2 = viewFindViewById2;
        }
        C786410Ut5.C7((C21411818qq) view2, new C1775830wJR(this, 0));
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0v4U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1728990v5t) obj).LLILLL);
            }
        }, null, new AwS640S0100000_26(this, 47), 6);
    }
}
