package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.track;

import X.C01GW;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C452501pT;
import X.C704790Rkj;
import X.C724270Sb3;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1357880lRK;
import X.InterfaceC1361270lWn;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.cell.FriendsV3CellTrackAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellLogicAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3TrackAssem extends BaseFriendsV3CellLogicAssem<FriendsV3TrackAssem, InterfaceC1361270lWn> implements FriendsV3CellTrackAbility, InterfaceC1554640qYg {
    public long LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 483));
    public final C01GW LLJJIJI = C737910Sx3.LIZJ(this, C13LE.LIZ(FriendsV3CellAreaViewModel.class), AFwS243S0000000_11.get$arr$(284));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1300944977) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.cell.FriendsV3CellTrackAbility
    public final boolean If2() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return (c724270Sb3 != null ? c724270Sb3.LL : null) instanceof InterfaceC1357880lRK;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJJIJI.getValue();
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 156);
        assemViewModel.getClass();
        AssemViewModel.selectSubscribe$default(assemViewModel, new C2217381BqS() { // from class: X.0S7j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS590S0100000_11(awS590S0100000_11, 14), 12, null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
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
