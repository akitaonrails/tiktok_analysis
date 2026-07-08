package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C13LE;
import X.C1580730rEl;
import X.C1580780rEq;
import X.C19719912Dl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListPowerCellProtocol;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarAssemRowPowerCell extends AssemPowerCell<SideBarRowItemAssem, C1580730rEl<C1580780rEq>> implements ISideBarListPowerCellProtocol {
    public final int LLIZ = 50000;
    public final C19719912Dl LLIZLLLIL = C13LE.LIZ(SideBarAssemRowPowerCell.class);

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new SideBarRowItemAssem();
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListPowerCellProtocol
    public final C19719912Dl dB() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListPowerCellProtocol
    public final int getContentType() {
        return this.LLIZ;
    }
}
