package com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.base;

import X.C01GW;
import X.C03H5;
import X.C452501pT;
import X.InterfaceC1587906Jp;
import X.InterfaceC705620Rm4;
import X.InterfaceC712990Rxx;
import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public abstract class BaseFriendsV3CellLogicAssem<RECEIVER extends C03H5, ITEM> extends ReusedAssem<RECEIVER> implements InterfaceC712990Rxx<ITEM>, InterfaceC705620Rm4 {
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11((BaseFriendsV3CellLogicAssem) this, 433));

    @Override // X.InterfaceC712990Rxx
    public void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final boolean ur(ITEM item) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final void vr(ITEM item) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
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
