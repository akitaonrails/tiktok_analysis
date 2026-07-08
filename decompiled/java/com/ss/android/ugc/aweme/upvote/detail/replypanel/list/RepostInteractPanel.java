package com.ss.android.ugc.aweme.upvote.detail.replypanel.list;

import X.AnonymousClass0956;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C123100dR;
import X.C1358120lRi;
import X.C1358180lRo;
import X.C1358230lRt;
import X.C1358290lRz;
import X.C1358380lS8;
import X.C1358440lSE;
import X.C1358510lSL;
import X.C1358560lSQ;
import X.C13LE;
import X.C1402270mav;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C21146717pB;
import X.C2217381BqS;
import X.C338490DOt;
import X.C338520DOw;
import X.C418440Gaw;
import X.C441580HTg;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C888460YtI;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC785980UsO;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostSyncViewModel;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS620S0100000_6;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostInteractPanel extends BaseFragment implements InterfaceC724530SbT {
    public static final C1358290lRz LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjA8PyAnLWsoLDsyISHELIOSliOyojJDw8KCE2JGsgIDwnZhcpOSAgPAwiPSohKSY4GS49LSk=";
    public Aweme LLIZ;
    public VideoItemParams LLIZLLLIL;
    public C1358560lSQ LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public Long LLJILLL;
    public final AssemVMLazy LLJJ;
    public final C736950SvV LLJJI;
    public final C736950SvV LLJJIII;
    public final C01GW LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIL;
    public FrameLayout LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostInteractPanel.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/upvote/detail/replypanel/vm/RepostInteractListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = new C1358290lRz();
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

    public RepostInteractPanel() {
        AssemVMLazy assemVMLazy;
        boolean z;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostInteractListViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 972);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(258);
        boolean z2 = false;
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 973), aFwS259S0000000_21, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new AwS565S0100000_21((Fragment) this, 974), aFwS259S0000000_21, null, null, null);
            z2 = false;
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS565S0100000_21, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 975), aFwS259S0000000_21, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJ = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(UpvotePublishVM.class);
        AFwS259S0000000_21 aFwS259S0000000_212 = AFwS259S0000000_21.get$arr$(259);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, z2);
        C451620HnM c451620HnM = new C451620HnM(this, z);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LLJJI = new C736950SvV(c19719912DlLIZ2, null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS259S0000000_212, c451460Hn6, c451620HnM, c338520DOw);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(RepostSyncViewModel.class), null, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS259S0000000_21.get$arr$(260), new C451460Hn6(this, z2), new C451620HnM(this, z), new C338520DOw(this));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 971));
    }

    public final RepostInteractListViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return (RepostInteractListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
    }

    @C14EU
    public final void onUserBlocked(C888460YtI c888460YtI) {
        SR();
        User user = c888460YtI.LIZ;
        if (user != null) {
            user.getUid();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Integer numValueOf;
        int iLIZIZ;
        FrameLayout frameLayout;
        super.onViewCreated(view, bundle);
        this.LLJJIJIIJIL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.tae);
        this.LLJJJ = (FrameLayout) view.findViewById(R.id.i3u);
        String aid = null;
        if (C1358180lRo.LIZJ() && (frameLayout = this.LLJJJ) != null) {
            frameLayout.setBackground(null);
        }
        String strLIZIZ = this.LLJILJIL;
        RepostInteractListViewModel repostInteractListViewModelSR = SR();
        Aweme aweme = this.LLIZ;
        Context context = getContext();
        if (context != null) {
            numValueOf = Integer.valueOf((int) (((double) C418440Gaw.LIZJ(context)) * 0.6d));
        } else {
            numValueOf = null;
        }
        VideoItemParams videoItemParams = this.LLIZLLLIL;
        C1358560lSQ c1358560lSQ = this.LLJ;
        String str = this.LLJI;
        String str2 = this.LLJIJIL;
        String str3 = this.LLJILJILJ;
        if (!C123100dR.LIZ(strLIZIZ)) {
            C1358120lRi c1358120lRi = UpvotePanelListViewModel.LLJJIJI;
            VideoItemParams videoItemParams2 = this.LLIZLLLIL;
            String str4 = this.LLJI;
            c1358120lRi.getClass();
            strLIZIZ = C1358120lRi.LIZIZ(videoItemParams2, str4);
        }
        RepostSyncViewModel repostSyncViewModel = (RepostSyncViewModel) this.LLJJIII.getValue();
        C1358290lRz c1358290lRz = LLJJJJ;
        VideoItemParams videoItemParams3 = this.LLIZLLLIL;
        c1358290lRz.getClass();
        String strLIZ = C1358290lRz.LIZ(videoItemParams3);
        repostInteractListViewModelSR.LL = aweme;
        repostInteractListViewModelSR.LLILLL = numValueOf;
        repostInteractListViewModelSR.LLILLJJLI = videoItemParams;
        repostInteractListViewModelSR.LLJI = c1358560lSQ;
        repostInteractListViewModelSR.LLILZIL = str;
        repostInteractListViewModelSR.LLILZLL = str2;
        repostInteractListViewModelSR.LLIZ = str3;
        repostInteractListViewModelSR.LLIZLLLIL = strLIZIZ;
        repostInteractListViewModelSR.LLJ = strLIZ;
        repostInteractListViewModelSR.LLILZ = repostSyncViewModel;
        int i = 0;
        repostInteractListViewModelSR.LLJILLL = false;
        AnonymousClass0956 anonymousClass0956 = repostInteractListViewModelSR.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        repostInteractListViewModelSR.LLJJ = null;
        EventBus.LIZLLL().LJIJJ(this);
        C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 181), 3);
        C1402270mav c1402270mav = new C1402270mav(this, 1);
        HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLJJIJI.getValue();
        if (homeTabAbility != null) {
            homeTabAbility.UC1(c1402270mav);
        }
        Context context2 = view.getContext();
        Aweme aweme2 = this.LLIZ;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        }
        int iLIZJ = (int) (((double) C418440Gaw.LIZJ(context2)) * 0.6d);
        C1358380lS8.LIZ.getClass();
        C1358510lSL c1358510lSLLJ = C1358380lS8.LJ(aid);
        if (c1358510lSLLJ == null) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(308));
        } else {
            Iterator<C1358440lSE> it2 = c1358510lSLLJ.LIZIZ.iterator();
            while (it2.hasNext()) {
                i = i + 1 + it2.next().LIZLLL;
            }
            iLIZIZ = C1358290lRz.LIZIZ(i, iLIZJ);
        }
        C441580HTg.LIZ(iLIZIZ, view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0cG1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358700lSe) obj).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 127), 6);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0lS3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358490lSJ) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 128), 4);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0lS1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1358490lSJ) obj).LLILZIL);
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 126), 4);
        AssemViewModel.asyncSubscribe$default(SR(), new C2217381BqS() { // from class: X.0lRX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1358490lSJ c1358490lSJ = (C1358490lSJ) obj;
                c1358490lSJ.getClass();
                return C627260Oiy.LIZLLL(c1358490lSJ);
            }
        }, null, new AwS600S0100000_21(this, 274), new AwS565S0100000_21(this, 1298), new AwS600S0100000_21(this, 277), 2, null);
        C736680Sv4.LJIIIIZZ(this, SR(), new C2217381BqS() { // from class: X.0lS2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1358490lSJ) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 127), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0lRN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1357900lRM) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 126), 4);
        Long l = this.LLJILLL;
        if (l != null) {
            final long jLongValue = l.longValue();
            ARunnableS81S0200000_12 aRunnableS81S0200000_12 = new ARunnableS81S0200000_12(new ViewTreeObserver.OnDrawListener() { // from class: X.0lS0
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    String aid2;
                    List<UpvoteStruct> list;
                    RepostInteractPanel repostInteractPanel = this.LL;
                    if (repostInteractPanel.LLJJJIL) {
                        return;
                    }
                    repostInteractPanel.LLJJJIL = true;
                    if (C1358230lRt.LIZ != 0 && C1358230lRt.LJ == 0) {
                        C1358230lRt.LJ = System.currentTimeMillis();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    View view2 = view;
                    HandlerHook.viewPost(view2, new ARunnableS81S0200000_12(this, view2, 94));
                    C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                    VideoItemParams videoItemParams4 = this.LL.LLIZLLLIL;
                    String str5 = videoItemParams4 != null ? videoItemParams4.mEventType : null;
                    String strAQ2 = this.LL.SR().AQ2();
                    Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                    C1360460lVU c1360460lVU = C1360460lVU.LIZIZ;
                    Aweme aweme3 = this.LL.LLIZ;
                    if (aweme3 == null || (aid2 = aweme3.getAid()) == null) {
                        aid2 = "";
                    }
                    UpvoteList upvoteListLJIIIIZZ = c1360460lVU.LJIIIIZZ(aid2);
                    Integer numValueOf2 = Integer.valueOf((upvoteListLJIIIIZZ == null || (list = upvoteListLJIIIIZZ.upvotes) == null) ? 0 : list.size());
                    c1358550lSP.getClass();
                    C1358550lSP.LJJIFFI(numValueOf2, lValueOf, str5, strAQ2);
                }
            }, view, 93);
            if (view.isAttachedToWindow()) {
                aRunnableS81S0200000_12.run();
            } else {
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC785980UsO(aRunnableS81S0200000_12, 2));
            }
        }
        if (C1358230lRt.LIZ != 0) {
            C1358230lRt.LIZLLL = System.currentTimeMillis();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        if (C1358230lRt.LIZ != 0 && C1358230lRt.LIZIZ == 0) {
            C1358230lRt.LIZIZ = System.currentTimeMillis();
        }
        if (C1358180lRo.LIZJ()) {
            viewTd = C21146717pB.LIZIZ(layoutInflater.getContext(), R.layout.i6f, viewGroup, false);
        } else {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.i6f, viewGroup, false);
        }
        if (C1358230lRt.LIZ != 0 && C1358230lRt.LIZJ == 0) {
            C1358230lRt.LIZJ = System.currentTimeMillis();
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
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
