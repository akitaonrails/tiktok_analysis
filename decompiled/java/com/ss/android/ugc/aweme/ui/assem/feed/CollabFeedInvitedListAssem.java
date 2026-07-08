package com.ss.android.ugc.aweme.ui.assem.feed;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C1220000hqw;
import X.C13LE;
import X.C1575080r5e;
import X.C2217381BqS;
import X.C343250Dcx;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedCreatorPostCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedInvitedPendingCell;
import com.ss.android.ugc.aweme.ui.cell.feed.CollabFeedSectionCell;
import com.ss.android.ugc.aweme.vm.feed.CollabFeedInvitedContainerViewModel;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class CollabFeedInvitedListAssem extends UIContentAssem {
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;

    public CollabFeedInvitedListAssem() {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(376);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(CollabFeedInvitedContainerViewModel.class), aFwS213S0000000_24, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS264S0000000_24.get$arr$(489), new AwS568S0100000_24((AbstractC738140SxQ) this, 1409), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1408));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Aweme aweme;
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).LJIILJJIL(CollabFeedCreatorPostCell.class, CollabFeedInvitedCell.class, CollabFeedInvitedPendingCell.class, CollabFeedSectionCell.class);
        C343250Dcx c343250Dcx = C343250Dcx.LIZ;
        C1575080r5e c1575080r5e = ((CollabFeedInvitedContainerViewModel) this.LLIZLLLIL.getValue()).LL;
        if (c1575080r5e != null) {
            aweme = c1575080r5e.LIZ;
        } else {
            aweme = null;
        }
        c343250Dcx.getClass();
        ((ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue()).getState().LIZLLL(C343250Dcx.LIZ(aweme), null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0rw0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1607550rw1) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS638S0100000_24(this, 151), 4);
    }
}
