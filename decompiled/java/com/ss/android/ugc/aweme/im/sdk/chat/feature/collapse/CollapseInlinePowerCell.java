package com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse;

import X.C0ZTH;
import X.InterfaceC1891350zJl;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;

/* JADX INFO: loaded from: classes15.dex */
public final class CollapseInlinePowerCell extends AssemPowerCell<CollapseInlineAssem, C0ZTH> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new CollapseInlineAssem();
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        super.onBindItemView(interfaceC1891350zJl);
        getLayoutPosition();
    }
}
