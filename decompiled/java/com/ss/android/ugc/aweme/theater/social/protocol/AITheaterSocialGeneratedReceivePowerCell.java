package com.ss.android.ugc.aweme.theater.social.protocol;

import X.C0I6Y;
import X.C0MU2;
import X.C0MXQ;
import X.C0ZL0;
import X.C0ZQE;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C724270Sb3;
import X.C869590Y9l;
import X.InterfaceC461380I7k;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class AITheaterSocialGeneratedReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C0MXQ> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(AITheaterSocialGeneratedReusedUISlot.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratedReceivePowerCell$createAssemAttached2Cell$1
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C0MU2 c0mu2 = C0MU2.LIZ;
                C724270Sb3 c724270Sb3 = this.LLJI;
                String conversationId = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)).getConversationId();
                c0mu2.getClass();
                C0MU2.LIZLLL(0, conversationId, "generate_aitheater_video_success");
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C0ZQE.LIZ(c869590Y9l, Up());
            }
        };
    }
}
