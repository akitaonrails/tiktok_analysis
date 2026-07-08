package com.ss.android.ugc.aweme.msg;

import X.C13LE;
import X.C461510I7x;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupInvitationReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C461510I7x> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new IMSkeletonLayoutReusedUISlotAssemReceive(C13LE.LIZ(GroupInvitationCardAssem.class));
    }
}
