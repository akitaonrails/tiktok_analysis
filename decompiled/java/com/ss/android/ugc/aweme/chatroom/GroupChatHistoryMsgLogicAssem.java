package com.ss.android.ugc.aweme.chatroom;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0Y8T;
import X.C0YH4;
import X.C0YHX;
import X.C0YM2;
import X.C0YSQ;
import X.C11NJ;
import X.C11NZ;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1701940uOG;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C259800zU;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.C875420YVw;
import X.C882630Yjt;
import X.C888300Yt2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC866190XyT;
import X.InterfaceC866310Xyf;
import X.InterfaceC876950Yaj;
import X.InterfaceC904740ZeS;
import Y.AfS183S0100000_14;
import Y.AsS31S0200000_14;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.group.ChatConvUpdateVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class GroupChatHistoryMsgLogicAssem extends AbstractC738140SxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final C11NJ LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupChatHistoryMsgLogicAssem.class, "chatConvUpdateVM", "getChatConvUpdateVM()Lcom/ss/android/ugc/aweme/group/ChatConvUpdateVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupChatHistoryMsgLogicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatConvUpdateVM.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 150), AFwS248S0000000_14.get$arr$(43), null, true);
        this.LLIZ = new C11NJ();
        this.LLIZLLLIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(65));
        this.LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 148));
        this.LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 149));
    }

    public final SessionInfo bo() {
        return ((C457780HxI) this.LL.getValue()).LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, X.0rMx, Y.AsS31S0200000_14] */
    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        ChatroomEventAbility chatroomEventAbility;
        C11NZ<InterfaceC904740ZeS> c11nzS9;
        MessagePowerListAbility messagePowerListAbility;
        RecyclerView recyclerViewLLII;
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        InterfaceC866190XyT interfaceC866190XyTLJI;
        super.onCreate();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(bo().getConversationId());
        this.LLILLL = c0y8tLIZ != null ? c0y8tLIZ.isMember() : false;
        this.LLILZ = c0y8tLIZ != null ? c0y8tLIZ.isMember() : false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, previousIsMember=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", currentIsMember=");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        ((ChatConvUpdateVM) assemVMLazy.getValue()).LLILZLL.put(this, new C888300Yt2(this));
        EnterChatParams enterChatParams = ((C457780HxI) this.LL.getValue()).LLILLL;
        if (enterChatParams != null && enterChatParams.getGroupChatNeedPullLatestMsg()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C882630Yjt(this, null), 3);
        }
        try {
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (c0yh4LJIIL = c0yhxLIZ.LJIIL()) != null && (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) != null && (interfaceC866190XyTLJI = interfaceC866310XyfLIZIZ.LJI()) != null) {
                int iLIZ = interfaceC866190XyTLJI.LIZ(bo().getConversationId());
                this.LLILZIL = iLIZ == 1;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkAndConsumeGroupMemberJoinState, convId=");
                sbLIZ2.append(bo().getConversationId());
                sbLIZ2.append(", joinState=");
                sbLIZ2.append(iLIZ);
                sbLIZ2.append(", isNewlyJoinedMember=");
                sbLIZ2.append(this.LLILZIL);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (iLIZ != 2) {
                    interfaceC866190XyTLJI.LIZLLL(bo().getConversationId());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLILZIL && (messagePowerListAbility = (MessagePowerListAbility) this.LLJI.getValue()) != null && (recyclerViewLLII = messagePowerListAbility.LLII()) != 0) {
            C259800zU c259800zU = new C259800zU();
            ?? asS31S0200000_14 = new AsS31S0200000_14(this, c259800zU, 2);
            c259800zU.element = asS31S0200000_14;
            recyclerViewLLII.addOnScrollListener(asS31S0200000_14);
        }
        if (!this.LLILZIL || (chatroomEventAbility = (ChatroomEventAbility) this.LLJ.getValue()) == null || (c11nzS9 = chatroomEventAbility.s9()) == null) {
            return;
        }
        this.LLIZ.LIZ(c11nzS9.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS183S0100000_14(this, 15)));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLIZ.dispose();
    }
}
