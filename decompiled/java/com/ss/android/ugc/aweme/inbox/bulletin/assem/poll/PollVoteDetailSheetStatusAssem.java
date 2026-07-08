package com.ss.android.ugc.aweme.inbox.bulletin.assem.poll;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C1749280vcc;
import X.C19U1;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C621400OYw;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollVoteDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class PollVoteDetailSheetStatusAssem extends UIContentAssem {
    public C1749280vcc LLIZLLLIL;
    public C19U1 LLJ;
    public ViewPager LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723580SZw(this, C621400OYw.class, "BulletinPollVoteDetailCommonHierarchyData"), checkSupervisorPrepared());
    public final C736950SvV LLJILJIL;

    public final C1749280vcc Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d38) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C19U1 Ho() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d3f) : null;
            this.LLJ = (C19U1) viewFindViewById;
        }
        return (C19U1) viewFindViewById;
    }

    public final ViewPager Jo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d3g) : null;
            this.LLJI = (ViewPager) viewFindViewById;
        }
        return (ViewPager) viewFindViewById;
    }

    public PollVoteDetailSheetStatusAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 460);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(BulletinPollVoteDetailViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(262), new AwS553S0100000_9((AbstractC738140SxQ) this, 459), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJILJIL.getValue(), new C2217381BqS() { // from class: X.0OZC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OZ3) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 57), 6);
    }
}
