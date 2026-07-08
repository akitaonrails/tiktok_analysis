package com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom;

import X.AbstractC738140SxQ;
import X.C0OLV;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C197039127h;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import Y.ACListenerS144S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCreatorReopenBottomAssem extends BulletinBottomBaseAssem {
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIII;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a65;
    }

    public BulletinCreatorReopenBottomAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 348);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(207), new AwS553S0100000_9((AbstractC738140SxQ) this, 349), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.U8((C197039127h) LJJIJL().findViewById(R.id.d4l), new ACListenerS144S0100000_9(this, 37));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0OKF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 130), 28, null);
    }
}
