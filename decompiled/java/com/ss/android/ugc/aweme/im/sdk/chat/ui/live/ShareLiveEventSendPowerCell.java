package com.ss.android.ugc.aweme.im.sdk.chat.ui.live;

import X.C0I6Y;
import X.C0ZL0;
import X.C0ZUY;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C724270Sb3;
import X.C869590Y9l;
import X.C893590Z3t;
import X.InterfaceC461380I7k;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareLiveEventSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C0ZUY> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareLiveEventReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.live.ShareLiveEventSendPowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C724270Sb3 c724270Sb3 = this.LLJI;
                C893590Z3t.LIZ(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return yp(c869590Y9l, !((C0ZUY) bo()).LL.LIZ);
            }
        };
    }
}
