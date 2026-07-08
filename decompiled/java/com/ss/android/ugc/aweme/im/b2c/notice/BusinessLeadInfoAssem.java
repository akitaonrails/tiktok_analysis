package com.ss.android.ugc.aweme.im.b2c.notice;

import X.AbstractC1643906c9;
import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C06LG;
import X.C06NH;
import X.C06S8;
import X.C06SA;
import X.C06Z6;
import X.C09R3;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C13LP;
import X.C1510305vh;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1734806qo;
import X.C1735306qt;
import X.C1748206sy;
import X.C1748406t0;
import X.C1750706tN;
import X.C1758306ub;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C461720I8s;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C866950Xzh;
import X.C869590Y9l;
import X.C896250ZDz;
import X.C909290Zln;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1743706sF;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.InterfaceC904740ZeS;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.b2c.exp.BusinessLeadInfoConfigData;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.prompts.api.chatnotice.ui.ChatNoticeAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessLeadInfoAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, IMessageEventProtocol, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C06Z6 LL = C06Z6.MAIN;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLL = C06LG.LIZ(this);
    public final AssemVMLazy LLILZ;
    public final C01GW LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessLeadInfoAssem.class, "commonChatNoticeViewModel", "getCommonChatNoticeViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/chatnoticenew/viewmodel/CommonChatNoticeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessLeadInfoAssem.class, "leadInfoViewModel", "getLeadInfoViewModel()Lcom/ss/android/ugc/aweme/im/b2c/notice/BusinessLeadInfoViewModel;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public BusinessLeadInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessLeadInfoViewModel.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 318), AFwS229S0000000_2.get$arr$(241), null, true);
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 317));
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).unbindAbility(bo(), InterfaceC1743706sF.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        final ViewGroup viewGroupE50;
        super.onParentViewCreated();
        C736680Sv4.LJIIIZ(this, bo(), new C2217381BqS() { // from class: X.06t7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1748406t0) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.06sz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1748406t0) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS651S0100000_2(this, 11), 8);
        ChatNoticeAbility chatNoticeAbility = (ChatNoticeAbility) this.LLILZIL.getValue();
        if (chatNoticeAbility == null || (viewGroupE50 = chatNoticeAbility.e50(C06NH.BOTTOM)) == null) {
            return;
        }
        final AwS616S0100000_2 awS616S0100000_2 = new AwS616S0100000_2(this, 164);
        final AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 1237);
        final AwS616S0100000_2 awS616S0100000_22 = new AwS616S0100000_2(this, 166);
        final AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(this, 1238);
        AbstractC1643906c9<C1735306qt, C1734806qo> abstractC1643906c9 = new AbstractC1643906c9<C1735306qt, C1734806qo>(viewGroupE50, awS616S0100000_2, awS546S0100000_2, awS616S0100000_22, awS546S0100000_22) { // from class: X.06qs
            public final Function2<InterfaceC1735006qq, Integer, Unit> LLILZLL;
            public final Function0<Unit> LLIZ;
            public final Function2<List<C1735506qv>, String, Unit> LLIZLLLIL;
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
                C1735306qt c1735306qt = (C1735306qt) c06oo;
                C1734806qo c1734806qo = (C1734806qo) this.LLILZIL;
                if (c1734806qo != null) {
                    this.LLIZLLLIL.invoke(c1735306qt.LIZJ, c1735306qt.LIZLLL);
                    c1734806qo.LIZ(c1735306qt.LIZJ, c1734806qo.getContext().getString(2131827470), this.LLILZLL, this.LLIZ);
                    return c1734806qo;
                }
                return null;
            }

            @Override // X.C06OD
            public final Object LJII(C06OO c06oo, InterfaceC1364105Vn interfaceC1364105Vn) {
                return this.LLJ.invoke();
            }

            {
                EnumC1596306Mv enumC1596306Mv = EnumC1596306Mv.LEAD_INFO;
                this.LLILZLL = awS616S0100000_2;
                this.LLIZ = awS546S0100000_2;
                this.LLIZLLLIL = awS616S0100000_22;
                this.LLJ = awS546S0100000_22;
            }
        };
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        ((ICommonChatNoticeViewModel) assemVMLazy.getValue()).HQ2(abstractC1643906c9);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class}).bindAbility(bo(), InterfaceC1743706sF.class);
    }

    public final BusinessLeadInfoViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (BusinessLeadInfoViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, this);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        String conversationId;
        String str;
        String str2;
        String conversationId2;
        BusinessLeadInfoViewModel businessLeadInfoViewModelBo = bo();
        String conversationId3 = null;
        if (interfaceC904740ZeS instanceof C1758306ub) {
            List listLL = C13LP.LL(((C1758306ub) interfaceC904740ZeS).LIZ, ((BusinessLeadInfoConfigData) C1750706tN.LIZIZ.getValue()).queryMessageSize);
            ArrayList<C869590Y9l> arrayList = new ArrayList();
            for (Object obj : listLL) {
                String conversationId4 = ((C869590Y9l) obj).getConversationId();
                C909290Zln c909290ZlnXQ2 = businessLeadInfoViewModelBo.xQ2();
                if (c909290ZlnXQ2 != null) {
                    conversationId2 = c909290ZlnXQ2.getConversationId();
                } else {
                    conversationId2 = null;
                }
                if (Intrinsics.LJFF(conversationId4, conversationId2)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (C869590Y9l c869590Y9l : arrayList) {
                    if (c869590Y9l.getSender() == C461720I8s.LIZJ()) {
                        break;
                    } else if (C866950Xzh.LIZ(c869590Y9l.getExt().get("a:high_intent_let_leave_info"))) {
                        businessLeadInfoViewModelBo.setState(new AwS368S0200000_2(businessLeadInfoViewModelBo.wQ2(c869590Y9l, false), c869590Y9l, 175));
                        return;
                    }
                }
            }
            businessLeadInfoViewModelBo.setState(new AwS581S0100000_2((List) arrayList, (List<ActionBarButtonConfBusiness>) 733));
            return;
        }
        if (interfaceC904740ZeS instanceof C06SA) {
            C06SA c06sa = (C06SA) interfaceC904740ZeS;
            String conversationId5 = c06sa.LIZJ.getConversationId();
            C909290Zln c909290ZlnXQ22 = businessLeadInfoViewModelBo.xQ2();
            if (c909290ZlnXQ22 != null) {
                conversationId3 = c909290ZlnXQ22.getConversationId();
            }
            if (Intrinsics.LJFF(conversationId5, conversationId3) && c06sa.LIZJ.getMsgStatus() == 1 && C866950Xzh.LIZIZ(businessLeadInfoViewModelBo.getState().LL)) {
                C1748406t0 state = businessLeadInfoViewModelBo.getState();
                String str3 = c06sa.LIZJ.getLocalExt().get("s:lead_send_info");
                if (str3 == null) {
                    str3 = "";
                }
                businessLeadInfoViewModelBo.setState(AFwS229S0000000_2.get$arr$(951));
                C909290Zln c909290ZlnXQ23 = businessLeadInfoViewModelBo.xQ2();
                String str4 = state.LLILLL;
                if (str3.length() > 0) {
                    str2 = "click_question";
                } else {
                    str2 = "send_other_message";
                }
                C1748206sy.LIZIZ(c909290ZlnXQ23, str4, str2, str3, C896250ZDz.LIZ(state.LLILZ));
                return;
            }
            return;
        }
        if (!(interfaceC904740ZeS instanceof C06S8) || C866950Xzh.LIZIZ(businessLeadInfoViewModelBo.getState().LL)) {
            return;
        }
        for (C869590Y9l c869590Y9l2 : ((C06S8) interfaceC904740ZeS).LIZIZ) {
            if (c869590Y9l2.getCreatedAt() > businessLeadInfoViewModelBo.getState().LLILLJJLI && c869590Y9l2.getSender() != C461720I8s.LIZJ()) {
                String conversationId6 = c869590Y9l2.getConversationId();
                C909290Zln c909290ZlnXQ24 = businessLeadInfoViewModelBo.xQ2();
                if (c909290ZlnXQ24 != null) {
                    conversationId = c909290ZlnXQ24.getConversationId();
                } else {
                    conversationId = null;
                }
                if (Intrinsics.LJFF(conversationId6, conversationId) && (str = c869590Y9l2.getExt().get("a:high_intent_let_leave_info")) != null && str.length() != 0 && !C1510305vh.LIZ(c869590Y9l2)) {
                    businessLeadInfoViewModelBo.setState(new AwS368S0200000_2(businessLeadInfoViewModelBo.wQ2(c869590Y9l2, true), c869590Y9l2, 176));
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
