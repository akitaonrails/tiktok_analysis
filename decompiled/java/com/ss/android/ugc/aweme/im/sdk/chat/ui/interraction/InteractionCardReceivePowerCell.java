package com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction;

import X.C13LE;
import X.C898800ZNu;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;

/* JADX INFO: loaded from: classes15.dex */
public final class InteractionCardReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C898800ZNu> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemReceive(C13LE.LIZ(InteractionCardReusedUISlot.class));
    }
}
