package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C0QSJ;
import X.C0ZL0;
import X.C13LE;
import X.C1558520qew;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C454670HsH;
import X.C461440I7q;
import X.C462520IBu;
import X.C687700QyG;
import X.C869590Y9l;
import X.C898580ZMy;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class StoryReactionSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C461440I7q> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryReactionSlotToContentAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.StoryReactionSendPowerCell$createAssemAttached2Cell$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                List<C869590Y9l> listVi2;
                C869590Y9l next;
                Map<String, String> localExt;
                C869590Y9l c869590Y9l;
                C869590Y9l c869590Y9l2;
                C461440I7q c461440I7q = (C461440I7q) this.LLLIIII.getItem();
                String scene = (c461440I7q == null || (c869590Y9l2 = c461440I7q.LL.LIZ.LIZ) == null) ? null : c869590Y9l2.getScene();
                if (Intrinsics.LJFF(scene, "story_reaction") || Intrinsics.LJFF(scene, "avatar_sticker")) {
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
                    Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
                    if (!(ability instanceof MessagePowerListAbility)) {
                        ability = null;
                    }
                    MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
                    if (messagePowerListAbility == null || (listVi2 = messagePowerListAbility.vi2()) == null) {
                        return;
                    }
                    StoryReactionSendPowerCell storyReactionSendPowerCell = this.LLLIIII;
                    Iterator<C869590Y9l> it2 = listVi2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String uuid = next.getUuid();
                        C461440I7q c461440I7q2 = (C461440I7q) storyReactionSendPowerCell.getItem();
                        if (Intrinsics.LJFF(uuid, (c461440I7q2 == null || (c869590Y9l = c461440I7q2.LL.LIZ.LIZ) == null) ? null : c869590Y9l.getUuid())) {
                            break;
                        }
                    }
                    C869590Y9l c869590Y9l3 = next;
                    if (c869590Y9l3 == null || (localExt = c869590Y9l3.getLocalExt()) == null) {
                        return;
                    }
                    C898580ZMy.LIZJ(null, localExt);
                }
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
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
