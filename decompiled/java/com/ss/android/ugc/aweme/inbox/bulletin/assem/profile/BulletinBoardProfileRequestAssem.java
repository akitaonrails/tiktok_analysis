package com.ss.android.ugc.aweme.inbox.bulletin.assem.profile;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardProfileRequestAssem extends UIContentAssem {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public FrameLayout LLJI;

    public BulletinBoardProfileRequestAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 478);
        this.LLJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(269), new AwS553S0100000_9((AbstractC738140SxQ) this, 479), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = (FrameLayout) view.findViewById(R.id.d3x);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJILJIL;
            }
        }, this, null, new AwS588S0100000_9(this, 152), new AwS553S0100000_9(this, 476), new AwS588S0100000_9(this, 153), 4, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJIJIL;
            }
        }, this, null, new AwS588S0100000_9(this, 154), new AwS553S0100000_9(this, 477), new AwS588S0100000_9(this, 155), 4, null);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJJIII;
            }
        }, this, null, new AwS588S0100000_9(this, 150), new AwS553S0100000_9(this, 475), new AwS588S0100000_9(this, 151), 4, null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OMH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLJILJILJ;
            }
        }, null, AFwS292S0000000_9.get$arr$(15), 6);
    }
}
