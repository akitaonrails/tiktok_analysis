package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base;

import X.C01GW;
import X.C03H5;
import X.C337180DJs;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC705620Rm4;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFriendsV3CellUISlotAssem<RECEIVER extends C03H5, ITEM> extends ReusedUISlotAssem<RECEIVER> implements InterfaceC712990Rxx<ITEM>, InterfaceC705620Rm4 {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11((BaseFriendsV3CellUISlotAssem) this, 434));

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public boolean ur(ITEM item) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public void vr(ITEM item) {
    }

    @Override // X.InterfaceC712990Rxx
    public void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        if (bp()) {
            C337180DJs.LIZJ(LJJIJL());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public void oo() {
        super.oo();
        if (bp()) {
            C337180DJs.LIZ(LJJIJL());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        if (!va(list)) {
            return;
        }
        up(interfaceC1587906Jp);
    }
}
