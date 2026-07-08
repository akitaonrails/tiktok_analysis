package com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable;

import X.C0I0B;
import X.C0I6Y;
import X.C0ZL0;
import X.C0ZLF;
import X.C0ZLL;
import X.C0ZNK;
import X.C0ZNM;
import X.C0ZNO;
import X.C0ZNW;
import X.C0ZQI;
import X.C13LE;
import X.C1559260qg8;
import X.C1562980qm8;
import X.C1807670x8n;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C457780HxI;
import X.C723580SZw;
import X.C724270Sb3;
import X.C830490Whz;
import X.C869590Y9l;
import X.C892250YzP;
import X.C898020ZKu;
import X.C898560ZMw;
import X.C898570ZMx;
import X.C898640ZNe;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461380I7k;
import X.InterfaceC898720ZNm;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class UnavailableCardReceivePowerCell extends IMSkeletonLayoutPowerCell<IMSkeletonLayoutReusedUISlotAssemReceive, C898640ZNe> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        final C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnavailableCardCardAssem.class);
        return new IMSkeletonLayoutReusedUISlotAssemReceive(c19719912DlLIZ) { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.unavailable.UnavailableCardReceivePowerCell$createAssemAttached2Cell$1
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
            public final C1559260qg8 LLLIIII = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
            public volatile C898570ZMx LLLIIIIL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(UnavailableCardReceivePowerCell$createAssemAttached2Cell$1.class, "messageViolationAnalytics", "getMessageViolationAnalytics()Lcom/ss/android/ugc/aweme/im/chatroom/api/IMessageViolationAnalytics;", 0);
                C13LE.LIZ.getClass();
                LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final void Tp() {
                C457780HxI c457780HxI;
                SessionInfo sessionInfo;
                InterfaceC898720ZNm reason = ((C0ZNK) bo()).getReason();
                if (((reason instanceof C0ZNM) || (reason instanceof C0ZNO)) && (c457780HxI = (C457780HxI) this.LLLIIII.getValue()) != null && (sessionInfo = c457780HxI.LL) != null) {
                    if (this.LLLIIIIL == null) {
                        synchronized (this) {
                            if (this.LLLIIIIL == null) {
                                this.LLLIIIIL = (C898570ZMx) C1807670x8n.LJJJJLL();
                            }
                        }
                    }
                    C724270Sb3 c724270Sb3 = this.LLJI;
                    C869590Y9l c869590Y9lLIZ = C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null));
                    C0I0B.LJFF.LIZIZ();
                    int chatType = sessionInfo.getChatType();
                    String str = chatType != 0 ? chatType != 1 ? chatType != 3 ? "unknown" : "group" : "stranger" : "private";
                    C830490Whz c830490Whz = new C830490Whz();
                    c830490Whz.put("enter_from", "chat");
                    c830490Whz.put("chat_type", str);
                    c830490Whz.put("conversation_id", sessionInfo.getConversationId());
                    IMessageAnalyticsUtils.LIZ.getClass();
                    IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
                    c830490Whz.put("message_type", iMessageAnalyticsUtilsLIZ != null ? iMessageAnalyticsUtilsLIZ.LJ(c869590Y9lLIZ) : null);
                    c830490Whz.put("sender_id", String.valueOf(c869590Y9lLIZ.getSender()));
                    c830490Whz.put("violation_policy_category", c869590Y9lLIZ.getExt().get("a:violation_reason"));
                    C20684815ws.LJIILLIIL("show_dm_moderation_cell", c830490Whz);
                }
                C457780HxI c457780HxI2 = (C457780HxI) this.LLLIIII.getValue();
                C0ZNW.LIZJ(c457780HxI2 != null ? c457780HxI2.LL : null, (C0ZNK) bo());
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssemReceive, com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.AbsSkeletonLayoutReusedUISlotAssem
            public final void op() {
                super.op();
                tp(C898560ZMw.LIZ);
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final List<C1562980qm8<C0ZL0>> Gp(C869590Y9l c869590Y9l) {
                C0ZQI c0zqiUp = Up();
                ArrayList arrayList = new ArrayList();
                C898020ZKu c898020ZKu = (C898020ZKu) c0zqiUp;
                arrayList.addAll(c898020ZKu.LJIIIIZZ(c869590Y9l));
                if (c898020ZKu.LJFF(c869590Y9l)) {
                    arrayList.add(c898020ZKu.LJIIIZ(c869590Y9l));
                }
                return arrayList;
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutReusedUISlotAssem
            public final C0ZLF Ip(C869590Y9l c869590Y9l) {
                return C0ZLL.LIZ;
            }
        };
    }
}
