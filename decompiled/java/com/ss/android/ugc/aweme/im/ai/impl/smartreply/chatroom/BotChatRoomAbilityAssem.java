package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0ZLC;
import X.C1239300iM4;
import X.C127G;
import X.C13LE;
import X.C1499605ty;
import X.C1508705vR;
import X.C1509305vX;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1605506Qj;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C903930Zd9;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC905060Zey;
import Y.AObjectS55S0000000_2;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class BotChatRoomAbilityAssem extends BaseSmartReplyChatRoomAbilityAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final List<C0ZLC> LLILLJJLI = Collections.singletonList(new C0ZLC() { // from class: X.0ZL2
        public static final Set<C0ZL0> LIZIZ = C13LQ.LJLIIL(new C0ZL0[]{C0ZL0.COPY, C0ZL0.REPLY, C0ZL0.SELECT_TEXT, C0ZL0.DEBUG_STREAK_INLINE, C0ZL0.DEBUG_UFC, C0ZL0.DEBUG, C0ZL0.DEBUG_MESSAGE_CONTENT, C0ZL0.DEBUG_REFRESH, C0ZL0.DEBUG_NOTICE_CODE, C0ZL0.DEBUG_TRANSLATE_CLEAR_CACHE, C0ZL0.DEBUG_TYPING_FAKE_MSG});

        @Override // X.C0ZLC
        public final int getPriority() {
            return 100;
        }

        @Override // X.C0ZLC
        public final C0ZL1 LIZIZ(C869590Y9l c869590Y9l) {
            return new C0ZL1(LIZIZ, C0ZLL.LIZ);
        }

        @Override // X.C0ZLC
        public final boolean LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo) {
            return sessionInfo.isBotChat();
        }
    });
    public final C1559260qg8 LLILLL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 248));
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final C01GW LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public volatile C903930Zd9 LLJ;
    public volatile ChatroomEventAbility LLJI;
    public C127G LLJIJIL;
    public InterfaceC665370Q7z LLJILJIL;
    public C0QSJ LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BotChatRoomAbilityAssem.class, "imConvRepoProvider", "getImConvRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BotChatRoomAbilityAssem.class, "botChatRoomVM", "getBotChatRoomVM()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/chatroom/BotChatRoomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BotChatRoomAbilityAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BotChatRoomAbilityAssem.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BotChatRoomAbilityAssem.class, "messageListVM", "getMessageListVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public BotChatRoomAbilityAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BotChatRoomViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 250), AFwS229S0000000_2.get$arr$(202), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ActionBarViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 251), AFwS229S0000000_2.get$arr$(203), null, true);
        this.LLIZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 249));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 252), AFwS229S0000000_2.get$arr$(204), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BaseSmartReplyChatRoomAbilityAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1558520qew.LJI(this, ChatRoomScope.class, m225do(), SmartReplyChatRoomAbility.class, null, null);
        C736680Sv4.LJIIIIZZ(this, m225do(), new C2217381BqS() { // from class: X.06Qm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1605606Qk) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 88), 6);
        C736680Sv4.LJIIIIZZ(this, m225do(), new C2217381BqS() { // from class: X.06Qn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1605606Qk) obj).LLILLL;
            }
        }, null, new AwS616S0100000_2(this, 89), 6);
        C736680Sv4.LJIIIIZZ(this, m225do(), new C2217381BqS() { // from class: X.06Ql
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1605606Qk) obj).LLILLJJLI);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 90), 4);
        this.LL.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLILZ.getValue()).LIZ(((C457780HxI) this.LLILLL.getValue()).LL.getConversationId()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1605506Qj(m225do())));
        ChatroomEventAbility chatroomEventAbilityBo = this.LLJI;
        if (chatroomEventAbilityBo == null) {
            synchronized (this) {
                chatroomEventAbilityBo = this.LLJI;
                if (chatroomEventAbilityBo == null) {
                    chatroomEventAbilityBo = bo();
                    this.LLJI = chatroomEventAbilityBo;
                }
            }
        }
        this.LL.LIZ(C1239300iM4.LJ(chatroomEventAbilityBo.s9(), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS581S0100000_2(this, 417)));
    }

    public final ChatroomEventAbility bo() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLJILJILJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJILJIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLJILJIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLJILJILJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        ChatroomEventAbility chatroomEventAbility = (ChatroomEventAbility) c0qsjLIZLLL.getAbility(ChatroomEventAbility.class);
        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
        return chatroomEventAbility;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final BotChatRoomViewModel m225do() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (BotChatRoomViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ActionBarViewModel.class, new AObjectS55S0000000_2(this, 24), IIMessageListViewModel.class, new AObjectS55S0000000_2(this, 25)}, defaultViewModelProviderFactory);
                    this.LLJIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BaseSmartReplyChatRoomAbilityAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C1558520qew.LJIIJ(this, ChatRoomScope.class, SmartReplyChatRoomAbility.class, null);
        C1508705vR.LL.getClass();
        C23250099c.LIZLLL(C1508705vR.LLILLJJLI, null, null, new C1499605ty(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.longpress.LongPressPolicyProvider
    public final List<C0ZLC> tZ() {
        return this.LLILLJJLI;
    }
}
