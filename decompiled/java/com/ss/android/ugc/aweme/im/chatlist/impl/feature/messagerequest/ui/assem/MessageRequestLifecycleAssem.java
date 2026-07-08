package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0CYO;
import X.C0QSJ;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127G;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1637906bB;
import X.C1719206oI;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C876470YZx;
import X.C876610YaB;
import X.C878880Ydq;
import X.C885310YoD;
import X.C885420YoO;
import X.C885610Yoh;
import X.C889160YuQ;
import X.EnumC871430YGn;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2195108ir;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC737790Swr;
import X.InterfaceC878620YdQ;
import X.InterfaceC885440YoQ;
import X.InterfaceC885460YoS;
import Y.AObjectS389S0100000_14;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestLoadingAbilityVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS628S0100000_14;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestLifecycleAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final AssemVMLazy LL;
    public final AssemVMLazy LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final C01GW LLILZ;
    public final C885610Yoh LLILZIL;
    public C127G LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestLifecycleAssem.class, "loadingVM", "getLoadingVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestLoadingAbilityVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestLifecycleAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestPageVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageRequestLifecycleAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        c09r3.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Yoh] */
    public MessageRequestLifecycleAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestLoadingAbilityVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 292), AFwS248S0000000_14.get$arr$(87), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestPageVM.class);
        this.LLILLJJLI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 293), AFwS248S0000000_14.get$arr$(88), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageRequestListVMV2.class);
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 294), AFwS248S0000000_14.get$arr$(89), null, true);
        this.LLILZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(102));
        this.LLILZIL = new InterfaceC2195108ir() { // from class: X.0Yoh
            @Override // X.InterfaceC2195108ir
            public final void LIZIZ(List<C0Y8T> list) {
            }

            @Override // X.InterfaceC2195108ir
            public final Object LIZ(long j, C2195008iq c2195008iq) throws Throwable {
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(c2195008iq, C2107308Nj.LIZ, new C885600Yog(this.LIZ, j, null));
                if (objLJI == C099R.LJFF()) {
                    return objLJI;
                }
                return Unit.LIZ;
            }
        };
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MessageRequestPageScope.class});
        c0qsjLIZIZ.unbindAbility(fo(), InterfaceC885460YoS.class);
        c0qsjLIZIZ.unbindAbility(ho(), InterfaceC885440YoQ.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MessageRequestPageScope.class});
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
        arrayList.add(MessageRequestPageScope.class);
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
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
        fo();
        ho();
        m231do();
        EnumC871430YGn enumC871430YGnA1 = ho().a1();
        MessageRequestListVMV2 messageRequestListVMV2M231do = m231do();
        ArrayList arrayList = new ArrayList();
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.ALL_RISKY;
        if (enumC871430YGnA1 != enumC871430YGn && C0CYO.LIZJ.LJIIIIZZ()) {
            C878880Ydq c878880Ydq = new C878880Ydq();
            c878880Ydq.LJIIJ(this.LLILZIL);
            arrayList.add(c878880Ydq);
        }
        messageRequestListVMV2M231do.LLILZIL.clear();
        messageRequestListVMV2M231do.LLILZIL.addAll(arrayList);
        C736680Sv4.LJIIIIZZ(this, ho(), new C2217381BqS() { // from class: X.0YuN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885570Yod) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS618S0100000_4(this, 78), 4);
        C736680Sv4.LJIIIIZZ(this, ho(), new C2217381BqS() { // from class: X.0OGg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885570Yod) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 107), 4);
        C736680Sv4.LJIIIIZZ(this, ho(), new C2217381BqS() { // from class: X.0YuL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885570Yod) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new C885420YoO(this), 4);
        if (enumC871430YGnA1 == enumC871430YGn) {
            C885310YoD c885310YoD = C885310YoD.LIZ;
            C876610YaB c876610YaB = ho().getState().LLILLL;
            int iLIZ = c876610YaB != null ? c876610YaB.LIZ() : 0;
            c885310YoD.getClass();
            C885310YoD.LJIILL(iLIZ);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MessageRequestPageScope.class});
        c0qsjLIZIZ.bindAbility(fo(), InterfaceC885460YoS.class);
        c0qsjLIZIZ.bindAbility(ho(), InterfaceC885440YoQ.class);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final MessageRequestListVMV2 m231do() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (MessageRequestListVMV2) assemVMLazy.getValue();
    }

    public final MessageRequestLoadingAbilityVM fo() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (MessageRequestLoadingAbilityVM) assemVMLazy.getValue();
    }

    public final MessageRequestPageVM ho() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (MessageRequestPageVM) assemVMLazy.getValue();
    }

    public final boolean bo() {
        SAFTikTokFragment sAFTikTokFragment;
        EnumC871430YGn enumC871430YGnA1 = ho().a1();
        boolean zLJIJJLI = ((PrivacySettingsFeature) this.LLILZ.getValue()).LJIJJLI(true);
        if (enumC871430YGnA1 == EnumC871430YGn.ALL_RISKY && !zLJIJJLI) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if ((fragmentLJI instanceof SAFTikTokFragment) && (sAFTikTokFragment = (SAFTikTokFragment) fragmentLJI) != null) {
                sAFTikTokFragment.finish();
            }
            return true;
        }
        EnumC871430YGn enumC871430YGn = EnumC871430YGn.STRANGER_NOT_RISKY;
        if (enumC871430YGnA1 == enumC871430YGn && !zLJIJJLI) {
            ho().wQ2(EnumC871430YGn.ALL_STRANGER);
            return false;
        }
        if (enumC871430YGnA1 != EnumC871430YGn.ALL_STRANGER || !zLJIJJLI) {
            return false;
        }
        ho().wQ2(enumC871430YGn);
        return false;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILZLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILZLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageRequestPageVM.class, new AObjectS389S0100000_14(this, 44), MessageRequestListVMV2.class, new AObjectS389S0100000_14(this, 45)}, defaultViewModelProviderFactory);
                    this.LLILZLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        MessageRequestListVMV2 messageRequestListVMV2M231do = m231do();
        C885610Yoh c885610Yoh = this.LLILZIL;
        Iterator<InterfaceC878620YdQ> it2 = messageRequestListVMV2M231do.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJI(c885610Yoh);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        bo();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPrivacySettingUpdate(C889160YuQ c889160YuQ) {
        if (bo()) {
            return;
        }
        C876470YZx.LIZ().LJIILIIL(C1719206oI.LIZ);
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
