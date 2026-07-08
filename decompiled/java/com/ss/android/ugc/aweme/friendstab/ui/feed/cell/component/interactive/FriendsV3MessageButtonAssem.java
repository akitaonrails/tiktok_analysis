package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.interactive;

import X.C0SDD;
import X.C10EU;
import X.C705700RmC;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1361270lWn;
import android.view.View;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class FriendsV3MessageButtonAssem extends BaseFriendsV3CellUISlotAssem<FriendsV3MessageButtonAssem, InterfaceC1361270lWn> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cb3;
    }

    @Override // X.InterfaceC705620Rm4
    public final boolean va(List<? extends Object> list) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C705700RmC.LIZ(this, R.layout.cb3, new AwS555S0100000_11(this, 459));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.I7(new AbS693S0100000_11(this, 1), LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        Object obj2;
        int i;
        View viewLJJIJL = LJJIJL();
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        if (C10EU.LJIILLIIL(((InterfaceC1361270lWn) obj2).LLILLL())) {
            i = 8;
        } else {
            i = 0;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base.BaseFriendsV3CellUISlotAssem, X.InterfaceC712990Rxx
    public final boolean ur(Object obj) {
        return obj instanceof C0SDD;
    }
}
