package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component;

import X.C01GW;
import X.C13LE;
import X.C2217381BqS;
import X.C704790Rkj;
import X.C736680Sv4;
import X.C737910Sx3;
import X.InterfaceC1361290lWp;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellLogicAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS310S0000000_24;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3MarkReadAssem extends BaseFriendsV3CellLogicAssem<FriendsV3MarkReadAssem, InterfaceC1361290lWp> {
    public final C01GW LLJJI = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS243S0000000_11.get$arr$(212));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0S7i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(15), 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        int i = FriendsV3CommentAssem.LLJLLIL;
        return !C704790Rkj.LIZ(list);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
