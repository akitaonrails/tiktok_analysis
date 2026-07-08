package com.ss.android.ugc.aweme.im.sdk.chat.ui.interraction;

import X.C13LE;
import X.C898810ZNv;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;

/* JADX INFO: loaded from: classes15.dex */
public final class InteractionCardSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C898810ZNv> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemSend(C13LE.LIZ(InteractionCardReusedUISlot.class));
    }
}
