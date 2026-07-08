package com.ss.android.ugc.aweme.im.b2c.landing;

import X.AbstractC1643906c9;
import X.C019F;
import X.C01GW;
import X.C06LD;
import X.C06LG;
import X.C06M6;
import X.C06NH;
import X.C09R3;
import X.C0PEM;
import X.C0QSJ;
import X.C11NJ;
import X.C11NZ;
import X.C1239300iM4;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1701940uOG;
import X.C1717806o4;
import X.C1734806qo;
import X.C1735406qu;
import X.C1735606qw;
import X.C1735706qx;
import X.C1736406r4;
import X.C1742706s5;
import X.C1743206sA;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C869590Y9l;
import X.C909290Zln;
import X.EnumC1596306Mv;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC904740ZeS;
import Y.AObjectS378S0100000_2;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMB2CMessageAttachAbility;
import com.ss.android.ugc.aweme.im.b2c.autoreply.BusinessAutoReplyVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.ISendMessageTransientAbility;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLandingMsgAssem extends UIContentAssem implements IMB2CMessageAttachAbility, InterfaceC1554640qYg, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C06M6.class, null), checkSupervisorPrepared());
    public final C11NJ LLJI = new C11NJ();
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;
    public volatile ChatroomEventAbility LLJJIJI;
    public C127G LLJJIJIIJIL;
    public InterfaceC665370Q7z LLJJIJIL;
    public C0QSJ LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessLandingMsgAssem.class, "businessChatLandingMsgVM", "getBusinessChatLandingMsgVM()Lcom/ss/android/ugc/aweme/im/b2c/landing/BusinessChatLandingMsgVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessLandingMsgAssem.class, "businessLocalReplyVM", "getBusinessLocalReplyVM()Lcom/ss/android/ugc/aweme/im/b2c/autoreply/BusinessAutoReplyVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessLandingMsgAssem.class, "singleChatNoticeViewModel", "getSingleChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/SingleChatNoticeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(BusinessLandingMsgAssem.class, "commonChatNoticeViewModel", "getCommonChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/CommonChatNoticeViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(BusinessLandingMsgAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(BusinessLandingMsgAssem.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
    }

    public BusinessLandingMsgAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessChatLandingMsgVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 314), AFwS229S0000000_2.get$arr$(238), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BusinessAutoReplyVM.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 315), AFwS229S0000000_2.get$arr$(239), null, true);
        this.LLJILJILJ = C06LD.LIZ(this);
        this.LLJILLL = C06LG.LIZ(this);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 316), AFwS229S0000000_2.get$arr$(240), null, true);
        this.LLJJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 313));
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

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 447899252) {
            return null;
        }
        return this;
    }

    public final C0QSJ Go() {
        C0QSJ c0qsj = this.LLJJJ;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJJIJIL;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJJIJIL = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJJJ = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    public final BusinessChatLandingMsgVM Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (BusinessChatLandingMsgVM) assemVMLazy.getValue();
    }

    public final ChatroomEventAbility Jo() {
        ChatroomEventAbility chatroomEventAbility;
        ChatroomEventAbility chatroomEventAbility2 = this.LLJJIJI;
        if (chatroomEventAbility2 == null) {
            synchronized (this) {
                chatroomEventAbility2 = this.LLJJIJI;
                if (chatroomEventAbility2 == null) {
                    C0QSJ c0qsjGo = Go();
                    if (c0qsjGo != null) {
                        chatroomEventAbility = (ChatroomEventAbility) c0qsjGo.getAbility(ChatroomEventAbility.class);
                        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
                    } else {
                        chatroomEventAbility = null;
                    }
                    this.LLJJIJI = chatroomEventAbility;
                    return chatroomEventAbility;
                }
            }
        }
        return chatroomEventAbility2;
    }

    public final C909290Zln Lo() {
        C457780HxI c457780HxI = (C457780HxI) this.LLIZLLLIL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (sessionInfo instanceof C909290Zln) {
            return (C909290Zln) sessionInfo;
        }
        return null;
    }

    public final void Oo() {
        C909290Zln c909290ZlnLo;
        String strOptString;
        String strOptString2;
        String strOptString3;
        Long lLJIILIIL;
        String strOptString4;
        Long lLJIILIIL2;
        if (this.LLJJIII || (c909290ZlnLo = Lo()) == null) {
            return;
        }
        this.LLJJIII = true;
        ISendMessageTransientAbility iSendMessageTransientAbility = (ISendMessageTransientAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ISendMessageTransientAbility.class, null);
        String strV40 = iSendMessageTransientAbility != null ? iSendMessageTransientAbility.V40() : null;
        BusinessChatLandingMsgVM businessChatLandingMsgVMHo = Ho();
        JSONObject bizInfoExtraMap = c909290ZlnLo.getBizInfoExtraMap();
        if (bizInfoExtraMap == null || (strOptString = bizInfoExtraMap.optString("sq_text")) == null || strOptString.length() == 0) {
            return;
        }
        JSONObject bizInfoExtraMap2 = c909290ZlnLo.getBizInfoExtraMap();
        long jLongValue = 0;
        long jLongValue2 = (bizInfoExtraMap2 == null || (strOptString4 = bizInfoExtraMap2.optString("sq_id")) == null || (lLJIILIIL2 = C2095008Iq.LJIILIIL(strOptString4)) == null) ? 0L : lLJIILIIL2.longValue();
        JSONObject bizInfoExtraMap3 = c909290ZlnLo.getBizInfoExtraMap();
        if (bizInfoExtraMap3 != null && (strOptString3 = bizInfoExtraMap3.optString("sq_version")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strOptString3)) != null) {
            jLongValue = lLJIILIIL.longValue();
        }
        JSONObject bizInfoExtraMap4 = c909290ZlnLo.getBizInfoExtraMap();
        if (bizInfoExtraMap4 == null || (strOptString2 = bizInfoExtraMap4.optString("sq_set_by")) == null) {
            strOptString2 = "";
        }
        businessChatLandingMsgVMHo.BQ2(new SuggestedQuestion(jLongValue2, jLongValue, strOptString, strOptString2, 0, null, 48, null), 0, strV40);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() throws IllegalAccessException {
        C1735706qx c1735706qx;
        String singleChatFromUserId;
        Long lLJIILIIL;
        ChatNoticeAbility chatNoticeAbility;
        final ViewGroup viewGroupE50;
        super.onParentViewCreated();
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.06r1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736506r5) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 140), 4);
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.06qy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736506r5) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.06qz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736506r5) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS651S0100000_2(this, 8), 8);
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.019A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C232500v5) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 141), 4);
        if (Lo() != null && (chatNoticeAbility = (ChatNoticeAbility) this.LLJJI.getValue()) != null && (viewGroupE50 = chatNoticeAbility.e50(C06NH.BOTTOM)) != null) {
            final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 1152);
            final AwS616S0100000_2 awS616S0100000_2 = new AwS616S0100000_2(this, 142);
            final AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(this, 629);
            final AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(this, 1153);
            ((BaseSingleChatNoticeViewModel) this.LLJILJILJ.getValue()).CQ2(new AbstractC1643906c9<C1735406qu, C1734806qo>(viewGroupE50, awS546S0100000_2, awS616S0100000_2, awS581S0100000_2, awS546S0100000_22) { // from class: X.06qr
                public final Function0<Unit> LLILZLL;
                public final Function2<InterfaceC1735006qq, Integer, Unit> LLIZ;
                public final Function1<Long, Unit> LLIZLLLIL;
                public final Function0<Boolean> LLJ;

                @Override // X.C06OD
                public final void LIZLLL() {
                    C1734806qo c1734806qo = (C1734806qo) this.LLILZIL;
                    if (c1734806qo != null) {
                        int visibility = c1734806qo.getVisibility();
                        c1734806qo.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c1734806qo);
                        c1734806qo.LLZLI();
                    }
                }

                @Override // X.C06OD
                public final Object LJI(C06OO c06oo) {
                    C1735406qu c1735406qu = (C1735406qu) c06oo;
                    C1734806qo c1734806qo = (C1734806qo) this.LLILZIL;
                    if (c1734806qo != null) {
                        this.LLIZLLLIL.invoke(C2286608xc.LJFF(System.currentTimeMillis()));
                        c1734806qo.LIZ(c1735406qu.LIZJ, c1735406qu.LIZLLL, this.LLIZ, this.LLILZLL);
                        return c1734806qo;
                    }
                    return null;
                }

                @Override // X.C06OD
                public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                    return this.LLJ.invoke();
                }

                {
                    EnumC1596306Mv enumC1596306Mv = EnumC1596306Mv.AD_CHAT_SUGGESTED_QUESTIONS;
                    this.LLILZLL = awS546S0100000_2;
                    this.LLIZ = awS616S0100000_2;
                    this.LLIZLLLIL = awS581S0100000_2;
                    this.LLJ = awS546S0100000_22;
                }
            });
        }
        C11NZ<InterfaceC904740ZeS> c11nzS9 = Jo().s9();
        if (c11nzS9 != null) {
            this.LLJI.LIZ(C1239300iM4.LJ(c11nzS9.LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1736406r4(Ho())));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1717806o4(this, null), 3);
        C1558520qew.LIZLLL(this);
        BusinessChatLandingMsgVM businessChatLandingMsgVMHo = Ho();
        synchronized (businessChatLandingMsgVMHo) {
            try {
                if (businessChatLandingMsgVMHo.vQ2() != null && (c1735706qx = (C1735706qx) businessChatLandingMsgVMHo.LLILZIL.getValue()) != null) {
                    C909290Zln c909290Zln = c1735706qx.LIZIZ;
                    if ((true ^ c1735706qx.LIZLLL) && (singleChatFromUserId = c909290Zln.getSingleChatFromUserId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(singleChatFromUserId)) != null) {
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c1735706qx.LIZ), C0PEM.LIZJ, null, new C1735606qw(c1735706qx, c909290Zln, lLJIILIIL, null), 2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJIJIIJIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJIJIIJIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BusinessChatLandingMsgVM.class, new AObjectS378S0100000_2(this, 16)}, defaultViewModelProviderFactory);
                    this.LLJJIJIIJIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        BusinessChatLandingMsgVM businessChatLandingMsgVMHo = Ho();
        C909290Zln c909290ZlnVQ2 = businessChatLandingMsgVMHo.vQ2();
        if (c909290ZlnVQ2 != null) {
            businessChatLandingMsgVMHo.DQ2(c909290ZlnVQ2.getConversationId());
        }
        this.LLJI.LJ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.im.b2c.api.ability.IMB2CMessageAttachAbility
    public final void AI0(C869590Y9l c869590Y9l) {
        String conversationId;
        BusinessChatLandingMsgVM businessChatLandingMsgVMHo = Ho();
        if (!businessChatLandingMsgVMHo.LLIZ) {
            String conversationId2 = c869590Y9l.getConversationId();
            C909290Zln c909290ZlnVQ2 = businessChatLandingMsgVMHo.vQ2();
            if (c909290ZlnVQ2 != null) {
                conversationId = c909290ZlnVQ2.getConversationId();
            } else {
                conversationId = null;
            }
            if (Intrinsics.LJFF(conversationId2, conversationId) && c869590Y9l.getMsgId() <= 0 && Intrinsics.LJFF(c869590Y9l.getLocalExt().get("local_fake_b2c_landing_msg"), "1")) {
                C1743206sA c1743206sA = (C1743206sA) businessChatLandingMsgVMHo.LLJI.getValue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                c1743206sA.getClass();
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1742706s5(c1743206sA, jCurrentTimeMillis, null), 3);
                businessChatLandingMsgVMHo.LLIZ = true;
            }
        }
    }

    public final void No(String str, List list) {
        C909290Zln c909290ZlnLo = Lo();
        if (c909290ZlnLo != null && c909290ZlnLo.getForbidSugQuestionPanel()) {
            return;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SuggestedQuestion) obj).displayText.length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                AssemVMLazy assemVMLazy = this.LLJILLL;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
                ((ICommonChatNoticeViewModel) assemVMLazy.getValue()).xQ2(new C1735406qu(arrayList, str));
                return;
            }
        }
        AssemVMLazy assemVMLazy2 = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJJIL;
        ((ICommonChatNoticeViewModel) assemVMLazy2.getValue()).BQ2(EnumC1596306Mv.AD_CHAT_SUGGESTED_QUESTIONS);
    }
}
