package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC1903430zdF;
import X.C019F;
import X.C01GW;
import X.C03H5;
import X.C09R3;
import X.C0QSJ;
import X.C0Z32;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1637806bA;
import X.C1770850wBP;
import X.C1890850zIx;
import X.C1906570ziJ;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C2036807yQ;
import X.C2217381BqS;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C895240ZAc;
import X.C895440ZAw;
import X.InterfaceC0148002o;
import X.InterfaceC1146704e9;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.AObserverS218S0100000_14;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.inbox.widget.InboxArchiveNoticeViewModel;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxFragmentScope;
import com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget;
import com.ss.android.ugc.aweme.inbox.widget.v2.ability.InboxAbilityCenter$IInboxImFilterAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class ArchiveEntranceWidget extends InboxWidget implements InterfaceC724530SbT, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1053));
    public final AssemVMLazy LLJ;
    public volatile InboxAbilityCenter$IInboxImFilterAbility LLJI;
    public InterfaceC665370Q7z LLJIJIL;
    public C0QSJ LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ArchiveEntranceWidget.class, "archiveEntranceViewModel", "getArchiveEntranceViewModel()Lcom/ss/android/ugc/aweme/inbox/widget/multi/ArchiveEntranceViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ArchiveEntranceWidget.class, "inboxImFilterAbility", "getInboxImFilterAbility()Lcom/ss/android/ugc/aweme/inbox/widget/v2/ability/InboxAbilityCenter$IInboxImFilterAbility;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public ArchiveEntranceWidget() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ArchiveEntranceViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 1054), AFwS248S0000000_14.get$arr$(295), null, true);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{InboxFragmentScope.class});
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
        arrayList.add(InboxFragmentScope.class);
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

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void lo() {
        MutableLiveData mutableLiveDataWQ2;
        LiveData liveDataDistinctUntilChanged;
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0ZAX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZAY) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 66), 6);
        InboxArchiveNoticeViewModel inboxArchiveNoticeViewModel = (InboxArchiveNoticeViewModel) this.LLIZLLLIL.getValue();
        if (inboxArchiveNoticeViewModel == null || (mutableLiveDataWQ2 = inboxArchiveNoticeViewModel.wQ2()) == null || (liveDataDistinctUntilChanged = Transformations.distinctUntilChanged(mutableLiveDataWQ2)) == null) {
            return;
        }
        liveDataDistinctUntilChanged.observe(this, new AObserverS218S0100000_14(this, 31));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<InterfaceC1891350zJl> Ao() {
        List<InterfaceC1891350zJl> listSingletonList;
        InboxAbilityCenter$IInboxImFilterAbility inboxAbilityCenter$IInboxImFilterAbility = this.LLJI;
        if (inboxAbilityCenter$IInboxImFilterAbility == null) {
            synchronized (this) {
                inboxAbilityCenter$IInboxImFilterAbility = this.LLJI;
                if (inboxAbilityCenter$IInboxImFilterAbility == null) {
                    C0QSJ c0qsjLIZLLL = this.LLJILJIL;
                    if (c0qsjLIZLLL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLJIJIL;
                        if (interfaceC665370Q7zLJIIIZ == null) {
                            interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                            this.LLJIJIL = interfaceC665370Q7zLJIIIZ;
                        }
                        c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{InboxFragmentScope.class});
                        this.LLJILJIL = c0qsjLIZLLL;
                    }
                    inboxAbilityCenter$IInboxImFilterAbility = c0qsjLIZLLL != null ? (InboxAbilityCenter$IInboxImFilterAbility) c0qsjLIZLLL.getAbility(InboxAbilityCenter$IInboxImFilterAbility.class) : null;
                    this.LLJI = inboxAbilityCenter$IInboxImFilterAbility;
                }
            }
        }
        if (inboxAbilityCenter$IInboxImFilterAbility != null ? Intrinsics.LJFF(inboxAbilityCenter$IInboxImFilterAbility.Ef2((Pair) inboxAbilityCenter$IInboxImFilterAbility.jp2().getValue()), Boolean.TRUE) : false) {
            return C13BV.INSTANCE;
        }
        C895240ZAc c895240ZAc = Ho().getState().LL;
        return (c895240ZAc == null || (listSingletonList = Collections.singletonList(c895240ZAc)) == null) ? C13BV.INSTANCE : listSingletonList;
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final List<C13IQ<? extends InterfaceC1891350zJl>> Bo() {
        return Collections.singletonList(C13LE.LIZ(C895240ZAc.class));
    }

    public final ArchiveEntranceViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ArchiveEntranceViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onArchivePinChangeEvent(C2036807yQ c2036807yQ) {
        C736680Sv4.LJIJJ(Ho(), new AwS380S0200000_14(c2036807yQ, this, 59));
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void xo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC1903430zdF) {
            ((AbstractC1903430zdF) viewHolder).onAttach();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final void yo(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC1903430zdF) {
            ((AbstractC1903430zdF) viewHolder).onDetach();
        } else {
            if (!(viewHolder instanceof C0Z32)) {
                return;
            }
            ((C0Z32) viewHolder).onDetach();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.v2.InboxWidget
    public final RecyclerView.ViewHolder uo(ViewGroup viewGroup, C13IQ<? extends InterfaceC1891350zJl> c13iq) {
        C895440ZAw c895440ZAw;
        InboxFragmentV2 inboxFragmentV2 = null;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C895240ZAc.class))) {
            c895440ZAw = new C895440ZAw(C1906570ziJ.LIZ(C786410Ut5.ne(viewGroup.getContext()), R.layout.a_3, viewGroup, false, 24));
            c895440ZAw.LLJJJJ = Ho();
            c895440ZAw.LLLLJ(C1890850zIx.LIZLLL);
        } else {
            c895440ZAw = null;
        }
        if ((c895440ZAw instanceof AbstractC1903430zdF) && c895440ZAw != null) {
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            if (fragmentLJI instanceof InboxFragmentV2) {
                inboxFragmentV2 = (InboxFragmentV2) fragmentLJI;
            }
            c895440ZAw.LLILZ = inboxFragmentV2;
        }
        return c895440ZAw;
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
