package com.ss.android.ugc.aweme.video.hashtag.feedback;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C098200Yq;
import X.C0OM1;
import X.C0ZP4;
import X.C11C7;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12YW;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C194475116r;
import X.C19474211Gy;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2187701Ajg;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC344240DeY;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.config.HashtagFeedbackValue;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class HashtagFeedbackFragment extends Fragment implements InterfaceC344240DeY, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMlLSo8Zi0tOicnHELIOSKSJiLyo2LCctKiR9ACQ/ITsyLwMpLCsxKSYnDz0yLygpJzs=";
    public final AssemVMLazy LL;
    public C197039127h LLILLJJLI;
    public View LLILLL;
    public C12YW LLILZ;
    public int LLILZIL;
    public String LLILZLL;
    public HashTagMobHelper LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HashtagFeedbackFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/video/hashtag/feedback/HashtagFeedbackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
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

    public HashtagFeedbackFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HashtagFeedbackViewModel.class);
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c19719912DlLIZ, 561);
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(198);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS573S0100000_29, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 562), aFwS273S0000000_29, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS573S0100000_29, new AwS573S0100000_29((Fragment) this, 563), aFwS273S0000000_29, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS573S0100000_29, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS573S0100000_29((HasDefaultViewModelProviderFactory) this, 564), aFwS273S0000000_29, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
        this.LLILZIL = -1;
        this.LLILZLL = "cancel";
    }

    public final HashtagFeedbackViewModel MR() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZLLLIL;
        return (HashtagFeedbackViewModel) assemVMLazy.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        String str;
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        MR();
        C194475116r.LIZ.getClass();
        HashtagFeedbackValue hashtagFeedbackValueLIZ = C194475116r.LIZ();
        if (hashtagFeedbackValueLIZ == null || (str = hashtagFeedbackValueLIZ.sheetHeaderTitle) == null) {
            str = C194475116r.LIZJ;
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS573S0100000_29(this, 560));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewTreeObserver viewTreeObserver;
        super.onPause();
        View view = this.LLILLL;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        C12YW c12yw = this.LLILZ;
        viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
        C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        ViewTreeObserver viewTreeObserver;
        super.onResume();
        View view = this.LLILLL;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        C12YW c12yw = this.LLILZ;
        viewTreeObserver.addOnGlobalLayoutListener(c12yw);
        C2187701Ajg.LIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        String str;
        FeedbackOptionValue[] feedbackOptionValueArr;
        C19GS c19gs = null;
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), R.layout.c8r, null);
        this.LLILLL = viewLJLLJ;
        if (viewLJLLJ != null) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJLLJ.findViewById(R.id.hvv);
            if (viewOnAttachStateChangeListenerC20604515jv instanceof RecyclerView) {
                recyclerView = viewOnAttachStateChangeListenerC20604515jv;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                linearLayoutManager.setOrientation(1);
                recyclerView.setLayoutManager(linearLayoutManager);
            }
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(HashtagFeedbackCell.class);
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            MR();
            HashTagMobHelper hashTagMobHelper = this.LLIZ;
            ArrayList arrayList = new ArrayList();
            C194475116r.LIZ.getClass();
            HashtagFeedbackValue hashtagFeedbackValueLIZ = C194475116r.LIZ();
            if (hashtagFeedbackValueLIZ != null && (feedbackOptionValueArr = hashtagFeedbackValueLIZ.feedbackOptionValues) != null) {
                for (FeedbackOptionValue feedbackOptionValue : feedbackOptionValueArr) {
                    arrayList.add(new C11C7(feedbackOptionValue, hashTagMobHelper));
                }
            }
            state.LIZLLL(arrayList, null);
            C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.cqd);
            this.LLILLJJLI = c197039127h;
            if (c197039127h != null) {
                MR();
                C194475116r.LIZ.getClass();
                HashtagFeedbackValue hashtagFeedbackValueLIZ2 = C194475116r.LIZ();
                if (hashtagFeedbackValueLIZ2 == null || (str = hashtagFeedbackValueLIZ2.submitBtnText) == null) {
                    str = C194475116r.LIZLLL;
                }
                c197039127h.setText(str);
            }
            C197039127h c197039127h2 = this.LLILLJJLI;
            if (c197039127h2 != null) {
                C786410Ut5.U8(c197039127h2, new ACListenerS163S0100000_29(this, 128));
            }
        }
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217371BqR() { // from class: X.0h4R
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1155510gAv) obj).LLILLJJLI);
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1155510gAv) obj).LLILLJJLI = ((Boolean) obj2).booleanValue();
            }
        }, null, new AwS643S0100000_29(this, 153), 6);
        C736680Sv4.LJIIIIZZ(this, MR(), new C2217371BqR() { // from class: X.11FL
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1155510gAv) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1155510gAv) obj).LL = (String) obj2;
            }
        }, null, new AwS643S0100000_29(this, 154), 6);
        this.LLILZ = new C12YW(this, 5);
        View view = this.LLILLL;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
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
