package com.ss.android.ugc.aweme.topic.recommend.ui;

import X.AbstractC738140SxQ;
import X.C0O4X;
import X.C1220000hqw;
import X.C13LE;
import X.C1559260qg8;
import X.C20600815jK;
import X.C20603715jn;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C626950OiT;
import X.C723590SZx;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendItemCell;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TopicRecommendListAssem extends DetailListAssem {
    public final C1559260qg8 LLJJJIL = new C1559260qg8(new C723590SZx(this, C626950OiT.class, null), checkSupervisorPrepared());
    public final C736950SvV LLJJJJ;

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final void up() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvMp = mp();
        viewOnAttachStateChangeListenerC20604515jvMp.setListConfig(op());
        AssemListViewModel assemListViewModel = (AssemListViewModel) this.LLJJJJ.getValue();
        if (assemListViewModel.state == null) {
            assemListViewModel.setListState(new C20600815jK<>());
        }
        viewOnAttachStateChangeListenerC20604515jvMp.LJIIL(((AssemListViewModel) this.LLJJJJ.getValue()).getConfig());
        mp().setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0OiM
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OAO) obj).LLILLJJLI;
            }
        }, null, new AwS623S0100000_9(this, 148), 6);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final C20603715jn op() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LJIIJ = false;
        c20603715jn.LIZ = 5;
        return c20603715jn;
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel tp() {
        return (AssemListViewModel) this.LLJJJJ.getValue();
    }

    public TopicRecommendListAssem() {
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 1562);
        this.LLJJJJ = new C736950SvV(C13LE.LIZ(TopicRecommendListVM.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(650), new AwS553S0100000_9((AbstractC738140SxQ) this, 1561), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        ((AssemViewModel) this.LLJJJJ.getValue()).setState(AFwS240S0000000_9.get$arr$(974));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0O4X c0o4x;
        super.onViewCreated(view);
        C786410Ut5.LLLZLZ(sp(), 8);
        C786410Ut5.LLF(0, mp());
        mp().setLifecycleOwner(this);
        C626950OiT c626950OiT = (C626950OiT) this.LLJJJIL.getValue();
        if (c626950OiT != null && (c0o4x = c626950OiT.LLILZ) != null && c0o4x.getType() == C0O4X.BOOK.getType()) {
            mp().LJIILJJIL(BookRecommendItemCell.class);
        }
        mp().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        mp().LJIJJ();
        mp().LJIJI();
    }
}
