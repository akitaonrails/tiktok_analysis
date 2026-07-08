package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C0OSP;
import X.C1220000hqw;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEventGamePlayAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardEventGamePlayAssem extends UIContentAssem implements BulletinEventGamePlayAbility, InterfaceC1554640qYg {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final List<String> LLJI;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1631640230) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinEventGamePlayAbility
    public final List<String> sQ1() {
        if (!this.LLJI.isEmpty()) {
            return this.LLJI;
        }
        return null;
    }

    public BulletinBoardEventGamePlayAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 270);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(171), new AwS553S0100000_9((AbstractC738140SxQ) this, 271), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = new ArrayList();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (!C0OSP.LIZIZ() && !C0OSP.LIZ()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OSJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJJJJIL;
            }
        }, null, new AwS623S0100000_9(this, 41), 6);
    }
}
