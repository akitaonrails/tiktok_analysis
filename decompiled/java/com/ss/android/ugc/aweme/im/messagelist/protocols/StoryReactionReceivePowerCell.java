package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C0I0B;
import X.C0ZL0;
import X.C13LE;
import X.C1400340mXo;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C454670HsH;
import X.C461410I7n;
import X.C462520IBu;
import X.C869590Y9l;
import X.C898580ZMy;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryReactionReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C461410I7n> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryReactionSlotToContentAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.StoryReactionReceivePowerCell$createAssemAttached2Cell$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C461410I7n c461410I7n;
                C869590Y9l c869590Y9l;
                Map<String, String> localExt;
                C869590Y9l c869590Y9l2;
                C461410I7n c461410I7n2 = (C461410I7n) this.LLLIIII.getItem();
                String scene = (c461410I7n2 == null || (c869590Y9l2 = c461410I7n2.LL.LIZ.LIZ) == null) ? null : c869590Y9l2.getScene();
                if ((!Intrinsics.LJFF(scene, "story_reaction") && !Intrinsics.LJFF(scene, "avatar_sticker")) || (c461410I7n = (C461410I7n) this.LLLIIII.getItem()) == null || (c869590Y9l = c461410I7n.LL.LIZ.LIZ) == null || (localExt = c869590Y9l.getLocalExt()) == null) {
                    return;
                }
                String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                if (curUserId == null) {
                    curUserId = "";
                }
                C898580ZMy.LIZJ(curUserId, localExt);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                tp(C462520IBu.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                return C454670HsH.LIZ(c869590Y9l, Up());
            }
        };
    }
}
