package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.media;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C013C;
import X.C019F;
import X.C03H5;
import X.C09R3;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127G;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1688206jI;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObjectS55S0000000_2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.ChatRoomFakeMsgOperatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.camera.IMMediaServiceInternalBridge;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS185S1100000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class PhotoSwapInlineEntranceAssem extends AbstractC738140SxQ implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public SessionInfo LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public final AssemVMLazy LLILZ;
    public AnonymousClass0956 LLILZIL;
    public ChatRoomFakeMsgOperatorAbility LLILZLL;
    public C127G LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PhotoSwapInlineEntranceAssem.class, "photoSwapInlineVM", "getPhotoSwapInlineVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/media/PhotoSwapInlineEntranceVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(PhotoSwapInlineEntranceAssem.class, "messageListVM", "getMessageListVM()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public PhotoSwapInlineEntranceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PhotoSwapInlineEntranceVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 539), AFwS229S0000000_2.get$arr$(308), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(IIMessageListViewModel.class);
        this.LLILZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 540), AFwS229S0000000_2.get$arr$(309), null, true);
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
    public final void onCreate() {
        super.onCreate();
        String string = UUID.randomUUID().toString();
        C013C c013c = new C013C();
        SessionInfo sessionInfo = ((C457780HxI) this.LL.getValue()).LL;
        this.LLILLJJLI = sessionInfo;
        if (sessionInfo == null) {
            return;
        }
        AssemVMLazy assemVMLazy = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06t6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C06PE) obj).LLILZLL;
            }
        }, null, new C1688206jI(c013c, sessionInfo, this, string), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILLL.getValue(), new C2217381BqS() { // from class: X.06t9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C231800uy) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS185S1100000_2(sessionInfo, string, 0), 4);
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLIZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLIZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS55S0000000_2(this, 0)}, defaultViewModelProviderFactory);
                    this.LLIZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        IMMediaServiceInternalBridge iMMediaServiceInternalBridgeLIZ;
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLILZIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILZLL = null;
        SessionInfo sessionInfo = this.LLILLJJLI;
        if (sessionInfo == null || (iMMediaServiceInternalBridgeLIZ = IMMediaServiceInternalBridge.LIZ.LIZ()) == null) {
            return;
        }
        iMMediaServiceInternalBridgeLIZ.LJIJ(sessionInfo.getUuid());
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
