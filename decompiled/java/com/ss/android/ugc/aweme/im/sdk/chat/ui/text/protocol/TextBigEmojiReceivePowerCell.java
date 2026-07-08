package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.protocol;

import X.C0I0B;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZQK;
import X.C13LE;
import X.C1400340mXo;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C457780HxI;
import X.C461460I7s;
import X.C723590SZx;
import X.C869590Y9l;
import X.C898020ZKu;
import X.C898580ZMy;
import X.InterfaceC1681406iC;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextBigEmojiAssem;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TextBigEmojiReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C461460I7s> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextBigEmojiAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.protocol.TextBigEmojiReceivePowerCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                InterfaceC1681406iC interfaceC1681406iCLIZ;
                CharSequence charSequence;
                C461460I7s c461460I7s;
                C869590Y9l c869590Y9l;
                Map<String, String> localExt;
                C869590Y9l c869590Y9l2;
                C461460I7s c461460I7s2 = (C461460I7s) this.LLLIIIIL.getItem();
                String string = null;
                if (Intrinsics.LJFF((c461460I7s2 == null || (c869590Y9l2 = c461460I7s2.LL.LIZ.LIZ) == null) ? null : c869590Y9l2.getScene(), "story_reaction") && (c461460I7s = (C461460I7s) this.LLLIIIIL.getItem()) != null && (c869590Y9l = c461460I7s.LL.LIZ.LIZ) != null && (localExt = c869590Y9l.getLocalExt()) != null) {
                    C898580ZMy.LIZJ(((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId(), localExt);
                }
                ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
                if (iSocialGameService == null || (interfaceC1681406iCLIZ = iSocialGameService.LIZ()) == null) {
                    return;
                }
                SessionInfo sessionInfo = ((C457780HxI) this.LLLIIII.getValue()).LL;
                C461460I7s c461460I7s3 = (C461460I7s) this.LLLIIIIL.getItem();
                if (c461460I7s3 != null && (charSequence = c461460I7s3.LLILLJJLI) != null) {
                    string = charSequence.toString();
                }
                interfaceC1681406iCLIZ.LIZIZ(sessionInfo, new EmojiGameInfo(0, string, null));
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0ZQI c0zqiUp = Up();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((C898020ZKu) c0zqiUp).LIZIZ(c869590Y9l, true));
                arrayList.add(C0ZQK.LIZ(c869590Y9l, c0zqiUp, new AwS585S0100000_6(c869590Y9l, 451)));
                return arrayList;
            }
        };
    }
}
