package com.ss.android.ugc.aweme.im.sdk.chat.ui.text.protocol;

import X.C0QSJ;
import X.C0ZDX;
import X.C0ZL0;
import X.C0ZQI;
import X.C0ZQK;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1619106Vp;
import X.C19719912Dl;
import X.C457780HxI;
import X.C461470I7t;
import X.C687700QyG;
import X.C723590SZx;
import X.C869590Y9l;
import X.C898020ZKu;
import X.C898580ZMy;
import X.InterfaceC1681406iC;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemSend;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextBigEmojiAssem;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class TextBigEmojiSendPowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemSend, C461470I7t> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextBigEmojiAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemSend(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.text.protocol.TextBigEmojiSendPowerCell$createAssemAttached2Cell$1
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                InterfaceC1681406iC interfaceC1681406iCLIZ;
                CharSequence charSequence;
                List<C869590Y9l> listVi2;
                C869590Y9l next;
                Map<String, String> localExt;
                C869590Y9l c869590Y9l;
                C869590Y9l c869590Y9l2;
                C461470I7t c461470I7t = (C461470I7t) this.LLLIIIIL.getItem();
                String string = null;
                if (Intrinsics.LJFF((c461470I7t == null || (c869590Y9l2 = c461470I7t.LL.LIZ.LIZ) == null) ? null : c869590Y9l2.getScene(), "story_reaction")) {
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558520qew.LJIIL(this), ChatRoomScope.class);
                    Object ability = c0qsjLIZJ != null ? c0qsjLIZJ.getAbility(MessagePowerListAbility.class) : null;
                    if (!(ability instanceof MessagePowerListAbility)) {
                        ability = null;
                    }
                    MessagePowerListAbility messagePowerListAbility = (MessagePowerListAbility) ability;
                    if (messagePowerListAbility != null && (listVi2 = messagePowerListAbility.vi2()) != null) {
                        TextBigEmojiSendPowerCell textBigEmojiSendPowerCell = this.LLLIIIIL;
                        Iterator<C869590Y9l> it2 = listVi2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            String uuid = next.getUuid();
                            C461470I7t c461470I7t2 = (C461470I7t) textBigEmojiSendPowerCell.getItem();
                            if (Intrinsics.LJFF(uuid, (c461470I7t2 == null || (c869590Y9l = c461470I7t2.LL.LIZ.LIZ) == null) ? null : c869590Y9l.getUuid())) {
                                break;
                            }
                        }
                        C869590Y9l c869590Y9l3 = next;
                        if (c869590Y9l3 != null && (localExt = c869590Y9l3.getLocalExt()) != null) {
                            C898580ZMy.LIZJ(null, localExt);
                        }
                    }
                }
                ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpiForReal(ISocialGameService.class);
                if (iSocialGameService == null || (interfaceC1681406iCLIZ = iSocialGameService.LIZ()) == null) {
                    return;
                }
                SessionInfo sessionInfo = ((C457780HxI) this.LLLIIII.getValue()).LL;
                C461470I7t c461470I7t3 = (C461470I7t) this.LLLIIIIL.getItem();
                if (c461470I7t3 != null && (charSequence = c461470I7t3.LLILLJJLI) != null) {
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
                if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                    IChatCustomizeHelper.LIZ.getClass();
                    IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
                    if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isSupportCustomization()) {
                        arrayList.add(C0ZQK.LIZJ(c869590Y9l, c0zqiUp));
                    }
                }
                return arrayList;
            }
        };
    }
}
