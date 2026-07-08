package com.ss.android.ugc.aweme.im.b2c.autoreply;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C11NZ;
import X.C1239300iM4;
import X.C127G;
import X.C13LE;
import X.C1509305vX;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1701940uOG;
import X.C1737806rI;
import X.C1737906rJ;
import X.C1738206rM;
import X.C1748606t2;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.EnumC1748506t1;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC904740ZeS;
import Y.AObjectS378S0100000_2;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessChatLandingMsgVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.sendmsg.ISendMessageTransientAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessAutoReplyLocalAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C11NJ LLILZLL;
    public volatile ChatroomEventAbility LLIZ;
    public C127G LLIZLLLIL;
    public InterfaceC665370Q7z LLJ;
    public C0QSJ LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BusinessAutoReplyLocalAssem.class, "businessChatLandingMsgVM", "getBusinessChatLandingMsgVM()Lcom/ss/android/ugc/aweme/im/b2c/landing/BusinessChatLandingMsgVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BusinessAutoReplyLocalAssem.class, "localAutoReplyVM", "getLocalAutoReplyVM()Lcom/ss/android/ugc/aweme/im/b2c/autoreply/BusinessAutoReplyVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BusinessAutoReplyLocalAssem.class, "chatroomEventAbility", "getChatroomEventAbility()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/ChatroomEventAbility;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public BusinessAutoReplyLocalAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BusinessChatLandingMsgVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 306), AFwS229S0000000_2.get$arr$(234), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BusinessAutoReplyVM.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 307), AFwS229S0000000_2.get$arr$(235), null, true);
        this.LLILZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 305));
        this.LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 304));
        this.LLILZLL = new C11NJ();
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
    public final void onParentViewCreated() {
        Object c1737806rI;
        Fragment fragmentLJI;
        super.onParentViewCreated();
        BusinessLocalAutoReplyController businessLocalAutoReplyControllerM228do = m228do();
        if (businessLocalAutoReplyControllerM228do != null && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), businessLocalAutoReplyControllerM228do, ISendMessageTransientAbility.class, null, null);
        }
        BusinessLocalAutoReplyController businessLocalAutoReplyControllerM228do2 = m228do();
        if (businessLocalAutoReplyControllerM228do2 != null) {
            for (String str : (String[]) C1748606t2.LIZIZ.getValue()) {
                if (Intrinsics.LJFF(str, EnumC1748506t1.SUGGESTQN.getKey())) {
                    c1737806rI = new C1737906rJ();
                } else if (Intrinsics.LJFF(str, EnumC1748506t1.KEYWORDREPLY.getKey())) {
                    c1737806rI = new C1737806rI();
                }
                ((ArrayList) businessLocalAutoReplyControllerM228do2.LLILLJJLI).add(c1737806rI);
            }
        }
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06rA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736506r5) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 156), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI.getValue(), new C2217381BqS() { // from class: X.06r0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1736506r5) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS616S0100000_2(this, 157), 4);
        ChatroomEventAbility chatroomEventAbility = this.LLIZ;
        if (chatroomEventAbility == null) {
            synchronized (this) {
                chatroomEventAbility = this.LLIZ;
                if (chatroomEventAbility == null) {
                    C0QSJ c0qsjBo = bo();
                    if (c0qsjBo != null) {
                        chatroomEventAbility = (ChatroomEventAbility) c0qsjBo.getAbility(ChatroomEventAbility.class);
                        C687700QyG.LJ(chatroomEventAbility, ChatroomEventAbility.class);
                    } else {
                        chatroomEventAbility = null;
                    }
                    this.LLIZ = chatroomEventAbility;
                }
            }
        }
        C11NZ<InterfaceC904740ZeS> c11nzS9 = chatroomEventAbility.s9();
        if (c11nzS9 != null) {
            this.LLILZLL.LIZ(C1239300iM4.LJ(c11nzS9.LJJJLZIJ(C1701940uOG.LIZIZ()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1738206rM(this)));
        }
    }

    public final C0QSJ bo() {
        C0QSJ c0qsj = this.LLJI;
        if (c0qsj != null) {
            return c0qsj;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJ;
        if (interfaceC665370Q7zLJIIIZ == null) {
            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
            this.LLJ = interfaceC665370Q7zLJIIIZ;
        }
        C0QSJ c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
        this.LLJI = c0qsjLIZLLL;
        return c0qsjLIZLLL;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final BusinessLocalAutoReplyController m228do() {
        return (BusinessLocalAutoReplyController) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZLLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZLLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BusinessChatLandingMsgVM.class, new AObjectS378S0100000_2(this, 24)}, defaultViewModelProviderFactory);
                    this.LLIZLLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI, null);
            if (m228do() != null) {
                C1558520qew.LJIIJJI(interfaceC665370Q7zLJFF, ISendMessageTransientAbility.class, null);
            }
        }
        this.LLILZLL.LJ();
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
