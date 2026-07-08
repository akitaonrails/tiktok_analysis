package com.ss.android.ugc.aweme.internalshare.impl.ui.iminput;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C061N;
import X.C0I7D;
import X.C0WZX;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C443160HZi;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ATListenerS440S0100000_6;
import android.text.Editable;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.IMStickerPanelEventViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class InternalShareEditTextAssem extends UISlotAssem implements IInternalShareDirectInputEditTextAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C061N.class, null), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;
    public final C01GW LLJJIJI;
    public float LLJJIJIIJIL;
    public ViewConfiguration LLJJIJIL;
    public boolean LLJJJ;
    public final C01GW LLJJJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cty;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1643992047) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputEditTextAbility
    public final void LJLZ() {
        C443160HZi c443160HZi = C443160HZi.LIZ;
        C0I7D c0i7dHp = hp();
        c443160HZi.getClass();
        KeyboardUtils.LIZIZ(c0i7dHp);
    }

    public final C0I7D hp() {
        return (C0I7D) this.LLJJIJI.getValue();
    }

    public InternalShareEditTextAssem() {
        AwS550S0100000_6 awS550S0100000_6 = new AwS550S0100000_6(this, 444);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(IMStickerPanelEventViewModel.class), awS550S0100000_6, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS236S0000000_6.get$arr$(210), new AwS550S0100000_6((AbstractC738140SxQ) this, 443), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 441));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 442));
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputEditTextAbility
    public final void Fr() {
        C0I7D c0i7dHp = hp();
        if (c0i7dHp != null) {
            c0i7dHp.requestFocus();
        }
        C443160HZi c443160HZi = C443160HZi.LIZ;
        C0I7D c0i7dHp2 = hp();
        c443160HZi.getClass();
        KeyboardUtils.LIZLLL(c0i7dHp2);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputEditTextAbility
    public final void clearFocus() {
        C0I7D c0i7dHp = hp();
        if (c0i7dHp != null) {
            c0i7dHp.clearFocus();
        }
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.ui.iminput.IInternalShareDirectInputEditTextAbility
    public final String getText() {
        Editable editableLLLLJI;
        C0I7D c0i7dHp = hp();
        if (c0i7dHp == null || (editableLLLLJI = C2204961BRm.LLLLJI(c0i7dHp, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmd5rc0jMHFXdoZ37v3DmEameZduQlTd6Gkqa0/ZjBJHGRfWeW5CZo2ELbN/yDPG493GHH5Z2T", null))) == null) {
            return null;
        }
        return editableLLLLJI.toString();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0HrK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 152), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0HrL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C454050HrH) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 153), 6);
        C0I7D c0i7dHp = hp();
        if (c0i7dHp != null) {
            c0i7dHp.setOnTouchListener((ATListenerS440S0100000_6) this.LLJJJIL.getValue());
        }
    }
}
