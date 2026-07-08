package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.publish;

import X.C1361320lWs;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C704790Rkj;
import X.C724750Sbp;
import X.C736820SvI;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.viewmodel.FriendsV3CellAreaViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3PublishCellAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3PublishCellAssem, C1361320lWs> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final InterfaceC1731706qJ LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FriendsV3PublishCellAssem.class, "areaVM", "getAreaVM()Lcom/ss/android/ugc/aweme/friendstab/ui/feed/cell/viewmodel/FriendsV3CellAreaViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FriendsV3PublishCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsV3CellAreaViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 461), null, AFwS243S0000000_11.get$arr$(273));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cba;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJL.getValue(this, LLJLIL[0]);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(272);
        assemViewModel.getClass();
        AssemViewModel.selectSubscribe$default(assemViewModel, new C2217381BqS() { // from class: X.0RqQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0SDJ) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS590S0100000_11(aFwS243S0000000_11, 12), 12, null);
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
