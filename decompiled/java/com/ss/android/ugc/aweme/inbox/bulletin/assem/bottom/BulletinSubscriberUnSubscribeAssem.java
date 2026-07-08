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
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSubscriberUnSubscribeAssem extends BulletinBottomBaseAssem {
    public C197039127h LLJJI;
    public C197039127h LLJJIII;
    public TuxTextView LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
    public final C736950SvV LLJJIJIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a62;
    }

    public final C0OLV Hh2() {
        return (C0OLV) this.LLJJIJIIJIL.getValue();
    }

    public final C197039127h kp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.crd) : null;
            this.LLJJI = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final BulletinProfileViewModel lp() {
        return (BulletinProfileViewModel) this.LLJJIJIL.getValue();
    }

    public BulletinSubscriberUnSubscribeAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 354);
        this.LLJJIJIL = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(211), new AwS553S0100000_9((AbstractC738140SxQ) this, 355), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0OL0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 134), 28, null);
    }
}
