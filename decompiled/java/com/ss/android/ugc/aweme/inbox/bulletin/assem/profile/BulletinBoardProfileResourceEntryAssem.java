package com.ss.android.ugc.aweme.inbox.bulletin.assem.profile;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinProfileResourceEntryCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardProfileResourceEntryAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;

    public BulletinBoardProfileResourceEntryAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 481);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(270), new AwS553S0100000_9((AbstractC738140SxQ) this, 482), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 480));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewOnAttachStateChangeListenerC20604515jv.getContext());
        linearLayoutManager.setOrientation(0);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(linearLayoutManager);
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BulletinProfileResourceEntryCell.class);
        C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJJ;
            }
        }, null, new AwS623S0100000_9(this, 61), 6);
    }
}
