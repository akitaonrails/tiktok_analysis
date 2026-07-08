package com.ss.android.ugc.aweme.internalshare.impl.refactor.assem;

import X.C019F;
import X.C1362270lYP;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1362260lYO;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.vm.ShareContactListViewModel;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class SharePanelCreateGroupButtonAssem extends UIContentAssem implements ICreateGroupButtonAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1362270lYP.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SharePanelCreateGroupButtonAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/internalshare/impl/refactor/vm/ShareContactListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SharePanelCreateGroupButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareContactListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 642), AFwS229S0000000_2.get$arr$(387), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1923796491) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.ICreateGroupButtonAbility
    public final void bd(boolean z) {
        InterfaceC1362260lYO interfaceC1362260lYO;
        C1362270lYP c1362270lYP = (C1362270lYP) this.LLIZLLLIL.getValue();
        if (c1362270lYP != null && (interfaceC1362260lYO = c1362270lYP.LLILZLL) != null) {
            interfaceC1362260lYO.h(z);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06V2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1362190lYH) obj).LLILLL;
            }
        }, null, AFwS285S0000000_2.get$arr$(26), 6);
    }
}
