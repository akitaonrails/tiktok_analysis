package com.ss.android.ugc.aweme.minidrama.tab.v2.guest;

import X.AbstractC738140SxQ;
import X.AbstractViewOnClickListenerC1165700gRM;
import X.C01GW;
import X.C1155770gBL;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C197039127h;
import X.C20603715jn;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.minidrama.tab.v2.guest.DramaGuestLandingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class DramaGuestLandingAssem extends UIListContentAssem<DramaGuestLandingViewModel> {
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1155770gBL.class, "DramaGuestLandingHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJ;
    public final C01GW LLJI;

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZ = 3;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Jo */
    public final AssemListViewModel ip() {
        return (AssemListViewModel) this.LLJ.getValue();
    }

    public DramaGuestLandingAssem() {
        AFwS206S0000000_18 aFwS206S0000000_18 = AFwS206S0000000_18.get$arr$(176);
        this.LLJ = new C736950SvV(C13LE.LIZ(DramaGuestLandingViewModel.class), aFwS206S0000000_18, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(130), new AwS562S0100000_18((AbstractC738140SxQ) this, 375), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 374));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Function0<Unit> function0;
        super.onViewCreated(view);
        DramaGuestLandingViewModel dramaGuestLandingViewModel = (DramaGuestLandingViewModel) this.LLJ.getValue();
        C1155770gBL c1155770gBL = (C1155770gBL) this.LLIZLLLIL.getValue();
        if (c1155770gBL != null) {
            function0 = c1155770gBL.LL;
        } else {
            function0 = null;
        }
        dramaGuestLandingViewModel.LL = function0;
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.g94);
        if (c197039127h != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0gRJ
                {
                    super(300L);
                }

                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    if (view2 != null) {
                        ((DramaGuestLandingViewModel) this.LLILZ.LLJ.getValue()).vQ2(this.LLILZ.LJJIJL().getContext(), null);
                    }
                }
            }, c197039127h);
        }
        c197039127h.LJJLI(false);
        c197039127h.setBackgroundRadius(8);
    }
}
