package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2;

import X.C01GW;
import X.C1349270lDR;
import X.C1351950lHl;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;

/* JADX INFO: loaded from: classes22.dex */
public final class NowKeyboardMultiPanelAssem extends UISlotAssem implements INowKeyboardMultiPanelAssemAbility, InterfaceC1554640qYg {
    public final C01GW LLJJI;

    public NowKeyboardMultiPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(NowKeyboardVM.class);
        this.LLJJI = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 16));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a40;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 795746295) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1351950lHl.LJIJI(C1349270lDR.LIZ(), LJJIJL());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0lAz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1352050lHv) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZLLL(), AFwS305S0000000_21.get$arr$(26), 4);
    }
}
