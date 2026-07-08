package com.ss.android.ugc.aweme.detail.ui;

import X.AbstractC738140SxQ;
import X.C1220000hqw;
import X.C13LE;
import X.C2217381BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowInnerFeedPageStateImpl extends PageStateCommonComponent {
    public final C736950SvV LLJJI;

    @Override // com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent, X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -721105229) {
            return null;
        }
        return this;
    }

    public FollowInnerFeedPageStateImpl() {
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(75);
        this.LLJJI = new C736950SvV(C13LE.LIZ(FollowInnerFeedVM.class), aFwS195S0000000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(73), new AwS553S0100000_9((AbstractC738140SxQ) this, 106), new C451610HnL(this, true, true), new C723700Sa8(this));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0OVJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C612580O0y c612580O0y = (C612580O0y) obj;
                c612580O0y.getClass();
                return C627260Oiy.LIZLLL(c612580O0y);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 17), 4);
    }
}
