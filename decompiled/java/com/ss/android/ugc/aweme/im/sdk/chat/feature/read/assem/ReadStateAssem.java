package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0C64;
import X.C0YHX;
import X.C0YM2;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1366690lfX;
import X.C13LE;
import X.C1509305vX;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1634806ag;
import X.C1637806bA;
import X.C1637906bB;
import X.C1660106el;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2097908Jt;
import X.C2217381BqS;
import X.C457780HxI;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C876310YZh;
import X.C876340YZk;
import X.C892280YzS;
import X.C913990ZtN;
import X.EnumC738160SxS;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1755906uD;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC881630YiH;
import X.InterfaceC892300YzU;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.edittext.TextWatcherViewModel;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ReadStateAssem extends AbstractC738140SxQ implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C1509305vX.LIZ(new AwS558S0100000_14(this, 615));
    public final C1634806ag LLILLL = new C1634806ag("ReadStateAssem");
    public final AssemVMLazy LLILZ;
    public final AssemVMLazy LLILZIL;
    public final C913990ZtN LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReadStateAssem.class, "textWatcherViewModel", "getTextWatcherViewModel()Lcom/ss/android/ugc/aweme/im/edittext/TextWatcherViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ReadStateAssem.class, "readStateViewModel", "getReadStateViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/read/viewmodel/ReadStateViewModel;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ReadStateAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TextWatcherViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 616), AFwS248S0000000_14.get$arr$(157), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ReadStateViewModel.class);
        this.LLILZIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 617), AFwS248S0000000_14.get$arr$(158), null, true);
        this.LLILZLL = new C913990ZtN(this, 0);
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public final ReadStateViewModel bo() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (ReadStateViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        C0YHX c0yhxLIZ;
        final InterfaceC881630YiH interfaceC881630YiHLJIIIIZZ;
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(this.LLILLL, false);
        super.onCreate();
        ReadStateViewModel readStateViewModelBo = bo();
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZ.LJIJI().LJIIL(readStateViewModelBo.vQ2().getConversationId(), readStateViewModelBo);
        if (!((InterfaceC1755906uD) readStateViewModelBo.LLILLL.getValue()).LIZLLL().isEmpty()) {
            readStateViewModelBo.wQ2();
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "im_read_state_optimisation", true) > 0) {
            final SessionInfo sessionInfoVQ2 = readStateViewModelBo.vQ2();
            final InterfaceC1755906uD interfaceC1755906uD = (InterfaceC1755906uD) readStateViewModelBo.LLILLL.getValue();
            IIMCoreProxyService iIMCoreProxyService = (IIMCoreProxyService) PluggableExtentionKt.pluggableSpiForReal(IIMCoreProxyService.class);
            C892280YzS c892280YzS = null;
            if (iIMCoreProxyService != null && (c0yhxLIZ = iIMCoreProxyService.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC881630YiHLJIIIIZZ = c0yhxLIZ.LJIIIIZZ()) != null) {
                c892280YzS = new C892280YzS(sessionInfoVQ2, sessionInfoVQ2.isGroupChat() ? new InterfaceC892300YzU(sessionInfoVQ2, interfaceC881630YiHLJIIIIZZ) { // from class: X.0Yih
                    public final SessionInfo LIZ;
                    public final InterfaceC881630YiH LIZIZ;

                    @Override // X.InterfaceC892300YzU
                    public final boolean LIZ() {
                        C0Y8T c0y8tLJ;
                        if (!C1727806pg.LIZ.LIZ("group_chat_operation_enable_read_status", this.LIZ.getConversationId(), C461720I8s.LIZIZ(), false) || !C881730YiR.LIZ || (c0y8tLJ = C0YNP.LIZIZ(this.LIZ.getConversationId()).LJ()) == null) {
                            return false;
                        }
                        if (this.LIZIZ.LIZ(this.LIZ.getConversationId()) == null) {
                            return true;
                        }
                        List<Long> memberIds = c0y8tLJ.getMemberIds();
                        if (memberIds.isEmpty()) {
                            return true;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Long l : memberIds) {
                            Long l2 = l;
                            long jLIZJ = C461720I8s.LIZJ();
                            if (l2 == null || l2.longValue() != jLIZJ) {
                                arrayList.add(l);
                            }
                        }
                        Set setLLIIJI = C13LP.LLIIJI(arrayList);
                        return !C13LP.LJJL(setLLIIJI, r8.LIZJ).containsAll(setLLIIJI);
                    }

                    {
                        this.LIZ = sessionInfoVQ2;
                        this.LIZIZ = interfaceC881630YiHLJIIIIZZ;
                    }
                } : new InterfaceC892300YzU(interfaceC1755906uD, interfaceC881630YiHLJIIIIZZ) { // from class: X.0YjP
                    public final InterfaceC1755906uD LIZ;
                    public final InterfaceC881630YiH LIZIZ;

                    @Override // X.InterfaceC892300YzU
                    public final boolean LIZ() {
                        C869590Y9l next;
                        Iterator<C869590Y9l> it2 = this.LIZ.LIZLLL().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            C869590Y9l c869590Y9l = next;
                            if (C0ZDR.LIZ(c869590Y9l) && c869590Y9l.isSuccessStatus() && C0ZDX.LJJJJIZL(c869590Y9l)) {
                                break;
                            }
                        }
                        C869590Y9l c869590Y9l2 = next;
                        if (c869590Y9l2 == null) {
                            return false;
                        }
                        C872090YJb c872090YJbLIZ = this.LIZIZ.LIZ(this.LIZ.getConversationId());
                        if (c872090YJbLIZ == null) {
                            return true;
                        }
                        return c872090YJbLIZ.LIZIZ >= c869590Y9l2.getIndex() && c872090YJbLIZ.LIZJ.contains(Long.valueOf(C0YNP.LJII(this.LIZ.getConversationId())));
                    }

                    {
                        this.LIZ = interfaceC1755906uD;
                        this.LIZIZ = interfaceC881630YiHLJIIIIZZ;
                    }
                }, interfaceC881630YiHLJIIIIZZ);
            }
            readStateViewModelBo.LLILZLL = c892280YzS;
        }
        ReadStateViewModel readStateViewModelBo2 = bo();
        getLifecycle().addObserver(readStateViewModelBo2);
        LifecycleObserver lifecycleObserver = (LifecycleObserver) readStateViewModelBo2.LLILZ.getValue();
        if (lifecycleObserver != null) {
            getLifecycle().addObserver(lifecycleObserver);
        }
        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) readStateViewModelBo2.LLILZIL.getValue();
        if (lifecycleObserver2 != null) {
            getLifecycle().addObserver(lifecycleObserver2);
        }
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IMessagePowerAdapterProtocol.class, C1697810uHb.LJIILJJIL(bo()));
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        ((TextWatcherViewModel) assemVMLazy.getValue()).vQ2(this.LLILZLL);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("unread_count", String.valueOf(((SessionInfo) this.LLILLJJLI.getValue()).getUnreadCount())));
        C1634806ag c1634806ag = this.LLILLL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_CREATE, mapLIZJ));
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        ((TextWatcherViewModel) assemVMLazy.getValue()).wQ2(this.LLILZLL);
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
