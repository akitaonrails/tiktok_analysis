package com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0QSJ;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZLC;
import X.C0ZPD;
import X.C11NZ;
import X.C11S5;
import X.C1226504r1;
import X.C1239300iM4;
import X.C127G;
import X.C13LE;
import X.C1500205u4;
import X.C1506705v7;
import X.C1508005vK;
import X.C1508505vP;
import X.C1509205vW;
import X.C15395060z;
import X.C15408061m;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1604706Qb;
import X.C1604806Qc;
import X.C1605106Qf;
import X.C1605206Qg;
import X.C1605306Qh;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C882340YjQ;
import X.C903930Zd9;
import X.C908520ZkY;
import X.C909290Zln;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC876950Yaj;
import X.InterfaceC904740ZeS;
import X.InterfaceC905060Zey;
import Y.AObjectS378S0100000_2;
import Y.AObjectS55S0000000_2;
import android.content.Intent;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.actionbar.api.viewmodel.ActionBarViewModel;
import com.ss.android.ugc.aweme.im.actionbar.viewmodel.ActionBarViewModelImpl;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.ISmartReplyEtParamsAbility;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.entrance.SmartReplyIntroBannerViewModel;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AiReplySingleChatAbilityAssem extends BaseSmartReplyChatRoomAbilityAssem implements SmartReplyChatRoomAbility, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final List<C0ZLC> LLILLL = Collections.singletonList(new C0ZLC() { // from class: X.0ZKz
        public static final Set<C0ZL0> LIZIZ = C13LQ.LJLIIL(new C0ZL0[]{C0ZL0.COPY, C0ZL0.LIKE, C0ZL0.SELECT_TEXT, C0ZL0.TRANSLATE_HIDE, C0ZL0.TRANSLATE_COPY, C0ZL0.TRANSLATE, C0ZL0.DISLIKE, C0ZL0.DELETE, C0ZL0.REPORT, C0ZL0.DEBUG_STREAK_INLINE, C0ZL0.DEBUG_UFC, C0ZL0.DEBUG_VOICE, C0ZL0.DEBUG, C0ZL0.DEBUG_MESSAGE_CONTENT, C0ZL0.DEBUG_REFRESH, C0ZL0.DEBUG_NOTICE_CODE, C0ZL0.DEBUG_TRANSLATE_CLEAR_CACHE, C0ZL0.DEBUG_TYPING_FAKE_MSG});

        @Override // X.C0ZLC
        public final int getPriority() {
            return 90;
        }

        @Override // X.C0ZLC
        public final C0ZL1 LIZIZ(C869590Y9l c869590Y9l) {
            C0ZLF c0zl7;
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
            if (c0y8tLIZ == null) {
                return C0ZL1.LIZJ;
            }
            if (!C882340YjQ.LJI(c0y8tLIZ)) {
                return C0ZL1.LIZJ;
            }
            boolean zLIZJ = C15395060z.LIZJ(c0y8tLIZ);
            Set<C0ZL0> set = LIZIZ;
            if (zLIZJ) {
                c0zl7 = C0ZLL.LIZ;
            } else {
                c0zl7 = new C0ZL7(true);
            }
            return new C0ZL1(set, c0zl7);
        }

        @Override // X.C0ZLC
        public final boolean LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
            if (c0y8tLIZ == null) {
                return false;
            }
            return C15395060z.LIZ(c0y8tLIZ);
        }
    });
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final AssemVMLazy LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public volatile C903930Zd9 LLJ;
    public C127G LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AiReplySingleChatAbilityAssem.class, "smartReplySuggestedReplyViewModel", "getSmartReplySuggestedReplyViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/suggestedreply/SmartReplySuggestedReplyViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AiReplySingleChatAbilityAssem.class, "smartReplyIntroBannerViewModel", "getSmartReplyIntroBannerViewModel()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/entrance/SmartReplyIntroBannerViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AiReplySingleChatAbilityAssem.class, "aiReplySingleChatRoomVM", "getAiReplySingleChatRoomVM()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/chatroom/AiReplySingleChatRoomViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AiReplySingleChatAbilityAssem.class, "actionBarVM", "getActionBarVM()Lcom/ss/android/ugc/aweme/im/actionbar/api/viewmodel/ActionBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AiReplySingleChatAbilityAssem.class, "imConvRepoProvider", "getImConvRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public AiReplySingleChatAbilityAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SmartReplySuggestedReplyViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 244), AFwS229S0000000_2.get$arr$(198), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SmartReplyIntroBannerViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 245), AFwS229S0000000_2.get$arr$(199), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(AiReplySingleChatRoomViewModel.class);
        this.LLILZLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 246), AFwS229S0000000_2.get$arr$(200), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ActionBarViewModel.class);
        this.LLIZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ4, 247), AFwS229S0000000_2.get$arr$(201), null, true);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 243));
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

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BaseSmartReplyChatRoomAbilityAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C1558520qew.LJI(this, ChatRoomScope.class, (SmartReplySuggestedReplyViewModel) assemVMLazy.getValue(), ISmartReplyEtParamsAbility.class, null, null);
        C1558520qew.LJI(this, ChatRoomScope.class, this, SmartReplyChatRoomAbility.class, null, null);
        SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = (SmartReplySuggestedReplyViewModel) this.LLILZ.getValue();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(smartReplySuggestedReplyViewModel), null, null, new C1508005vK(smartReplySuggestedReplyViewModel, null), 3);
        C11NZ<InterfaceC904740ZeS> c11nzS9 = smartReplySuggestedReplyViewModel.LLILLJJLI.s9();
        if (c11nzS9 != null) {
            smartReplySuggestedReplyViewModel.LLIZLLLIL.LIZ(C1239300iM4.LJ(c11nzS9.LJJJLZIJ(C11S5.LIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1508505vP(smartReplySuggestedReplyViewModel)));
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(smartReplySuggestedReplyViewModel), null, null, new C1506705v7(smartReplySuggestedReplyViewModel, null), 3);
        SmartReplyIntroBannerViewModel smartReplyIntroBannerViewModel = (SmartReplyIntroBannerViewModel) this.LLILZIL.getValue();
        if (C1226504r1.LIZIZ) {
            C11NZ<InterfaceC904740ZeS> c11nzS92 = smartReplyIntroBannerViewModel.LL.s9();
            if (c11nzS92 != null) {
                smartReplyIntroBannerViewModel.LLILLL.LIZ(C1239300iM4.LJ(c11nzS92.LJJJLZIJ(C11S5.LIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1509205vW(smartReplyIntroBannerViewModel)));
            }
            C1500205u4 c1500205u4 = C1500205u4.LLILLJJLI;
            c1500205u4.getClass();
            if (!C1500205u4.LLIZLLLIL.getAndSet(true)) {
                C15408061m.LIZ.getClass();
                C15408061m.LIZIZ.LJ(c1500205u4);
            }
        }
        C736680Sv4.LJIIIIZZ(this, this.LLILZLL.getValue(), new C2217381BqS() { // from class: X.06Qe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1604706Qb) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 87), 4);
        String strM224do = m224do();
        if (strM224do != null) {
            this.LL.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLIZLLLIL.getValue()).LIZ(strM224do), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1604806Qc((AiReplySingleChatRoomViewModel) this.LLILZLL.getValue())));
        }
        ActionBarViewModel actionBarViewModel = (ActionBarViewModel) this.LLIZ.getValue();
        ActionBarViewModelImpl actionBarViewModelImpl = (ActionBarViewModelImpl) actionBarViewModel;
        actionBarViewModelImpl.MA1(new C908520ZkY(new C1605206Qg(0), C1605106Qf.LIZ), true ^ ((C1604706Qb) this.LLILZLL.getValue().getState()).LL);
    }

    public final C0QSJ bo() {
        C0QSJ c0qsj = this.LLJILJIL;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJILJIL = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final String m224do() {
        C457780HxI c457780HxI = (C457780HxI) this.LLILLJJLI.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (!(sessionInfo instanceof C909290Zln) || sessionInfo == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJI;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJI;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{SmartReplySuggestedReplyViewModel.class, new AObjectS378S0100000_2(this, 7), SmartReplyIntroBannerViewModel.class, new AObjectS378S0100000_2(this, 8), ActionBarViewModel.class, new AObjectS55S0000000_2(this, 23)}, defaultViewModelProviderFactory);
                    this.LLJI = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.BaseSmartReplyChatRoomAbilityAssem, X.AbstractC738140SxQ
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        C1558520qew.LJIIJ(this, ChatRoomScope.class, ISmartReplyEtParamsAbility.class, null);
        C1558520qew.LJIIJ(this, ChatRoomScope.class, SmartReplyChatRoomAbility.class, null);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.longpress.LongPressPolicyProvider
    public final List<C0ZLC> tZ() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility
    public final boolean m42(C0ZPD c0zpd) {
        C0Y8T c0y8tLIZ;
        String strM224do = m224do();
        if (strM224do != null) {
            c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strM224do);
        } else {
            c0y8tLIZ = null;
        }
        if (c0y8tLIZ == null || !C15395060z.LIZ(c0y8tLIZ)) {
            return false;
        }
        int i = C1605306Qh.LIZ[c0zpd.ordinal()];
        if (i != 1) {
            if (i != 2 || !C882340YjQ.LJI(c0y8tLIZ)) {
                return false;
            }
            return C15395060z.LIZJ(c0y8tLIZ);
        }
        return C882340YjQ.LJI(c0y8tLIZ);
    }
}
