package com.ss.android.ugc.aweme.inbox.bulletin.assem;

import X.AbstractC738140SxQ;
import X.AnonymousClass0206;
import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C01QQ;
import X.C09R3;
import X.C0ALL;
import X.C0DTR;
import X.C0DWS;
import X.C0OLA;
import X.C0OLB;
import X.C0OLC;
import X.C0OLG;
import X.C0OLV;
import X.C0OPX;
import X.C0PEM;
import X.C0QSJ;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1BNE;
import X.C21674119s3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23250099c;
import X.C290750BaT;
import X.C296830BkH;
import X.C418440Gaw;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C617340OJg;
import X.C617360OJi;
import X.C617390OJl;
import X.C687700QyG;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC617290OJb;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS144S0100000_9;
import Y.AObjectS384S0100000_9;
import Y.ARunnableS109S0100000_9;
import Y.ARunnableS16S0201000_9;
import Y.AsS36S0100000_9;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinFragmentScope;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListPageStatusViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListScrollToViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.UnreadIndicatorAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinUnreadIndicatorAssem extends UIContentAssem implements UnreadIndicatorAbility, InterfaceC1554640qYg, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public CardView LLJ;
    public CardView LLJI;
    public TuxTextView LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final C1559260qg8 LLJILLL;
    public final C736950SvV LLJJ;
    public final AssemVMLazy LLJJI;
    public final C2252321DDq LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C0OLG LLJJJ;
    public boolean LLJJJIL;
    public C127G LLJJJJ;
    public InterfaceC665370Q7z LLJJJJJIL;
    public C0QSJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BulletinUnreadIndicatorAssem.class, "scrollToVm", "getScrollToVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListScrollToViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(BulletinUnreadIndicatorAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(BulletinUnreadIndicatorAssem.class, "pageStatusVM", "getPageStatusVM()Lcom/ss/android/ugc/aweme/inbox/bulletin/viewmodel/BulletinListPageStatusViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.UnreadIndicatorAbility
    public final void EE2() {
        this.LLJJIJIL = false;
        CardView cardViewSo = So();
        if (cardViewSo != null) {
            C0DTR.LIZIZ(cardViewSo);
        }
        CardView cardViewLo = Lo();
        if (cardViewLo != null) {
            C0DTR.LIZIZ(cardViewLo);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.vscope.UnreadIndicatorAbility
    public final void TZ() {
        this.LLJJIJIL = true;
        C0OLG c0olg = this.LLJJJ;
        if (c0olg != null) {
            Zo(c0olg);
        }
        Vo(this.LLJJJIL);
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).unbindAbility(No(), InterfaceC617290OJb.class);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{BulletinFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BulletinFragmentScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{BulletinFragmentScope.class}).bindAbility(No(), InterfaceC617290OJb.class);
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1557136895) {
            return null;
        }
        return this;
    }

    public BulletinUnreadIndicatorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BulletinListScrollToViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 327), AFwS240S0000000_9.get$arr$(196), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BulletinListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 328), AFwS240S0000000_9.get$arr$(197), null, true);
        this.LLJILLL = new C1559260qg8(new C723580SZw(this, C0OLV.class, "bulletin_board_param"), checkSupervisorPrepared());
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this, 326);
        this.LLJJ = new C736950SvV(C13LE.LIZ(BulletinProfileViewModel.class), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS240S0000000_9.get$arr$(199), new AwS553S0100000_9((AbstractC738140SxQ) this, 330), new C451610HnL(this, true, true), new C723700Sa8(this));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(BulletinListPageStatusViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ3, 329), AFwS240S0000000_9.get$arr$(198), null, true);
        this.LLJJIII = C1BNE.LIZ(Boolean.FALSE);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 324));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 325));
        this.LLJJIJIL = true;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.d28) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C21674119s3 Ho() {
        return (C21674119s3) this.LLJJIJIIJIL.getValue();
    }

    public final BulletinListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (BulletinListViewModel) assemVMLazy.getValue();
    }

    public final CardView Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.u3_) : null;
            this.LLJI = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    public final BulletinListScrollToViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (BulletinListScrollToViewModel) assemVMLazy.getValue();
    }

    public final TuxTextView Oo() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.unread_message_count) : null;
            this.LLJIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final CardView So() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.unread_tips_container) : null;
            this.LLJ = (CardView) viewFindViewById;
        }
        return (CardView) viewFindViewById;
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJJJJ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJJJJ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{BulletinListViewModel.class, new AObjectS384S0100000_9(this, 6)}, defaultViewModelProviderFactory);
                    this.LLJJJJ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        if (((BulletinProfileViewModel) this.LLJJ.getValue()).PQ2()) {
            if (C290750BaT.LIZ()) {
                ((C617360OJi) Jo().LLJI.getValue()).LIZJ();
            } else {
                C617340OJg.LIZJ.getValue().LIZLLL(Jo());
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C290750BaT.LIZ()) {
            C617360OJi c617360OJi = (C617360OJi) Jo().LLJI.getValue();
            c617360OJi.getClass();
            C0OPX.LJII("BulletinSubscribePeriodicRequestHandler + stopPolling");
            AnonymousClass0956 anonymousClass0956 = c617360OJi.LJI;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        } else {
            C617340OJg value = C617340OJg.LIZJ.getValue();
            BulletinListViewModel bulletinListViewModelJo = Jo();
            value.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinSubscribePeriodicRequestHandler + Try stopPolling + ");
            sbLIZ.append(bulletinListViewModelJo);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            C617390OJl c617390OJlLIZIZ = value.LIZIZ(bulletinListViewModelJo);
            if (c617390OJlLIZIZ != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BulletinSubscribePeriodicRequestHandler + Real stopPolling + ");
                sbLIZ2.append(bulletinListViewModelJo);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                AnonymousClass0956 anonymousClass09562 = c617390OJlLIZIZ.LJI;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
            }
        }
        AnonymousClass0956 anonymousClass09563 = C0OLA.LIZLLL;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01QQ(null), 3);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    public final void Vo(boolean z) {
        if (z) {
            if (Lo().getVisibility() != 0) {
                C786410Ut5.LLILLL(Lo(), 0);
            }
        } else {
            if (Lo().getVisibility() != 0) {
                return;
            }
            C786410Ut5.LLILLL(Lo(), 8);
        }
    }

    public final void Zo(C0OLG c0olg) {
        String strValueOf;
        boolean z;
        if (!c0olg.LIZ) {
            C786410Ut5.LLILLL(So(), 8);
            return;
        }
        CardView cardViewSo = So();
        if (cardViewSo == null) {
            return;
        }
        int i = c0olg.LIZIZ;
        if (i > 20) {
            strValueOf = "20+";
        } else {
            strValueOf = String.valueOf(i);
        }
        if (((Number) C0ALL.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextViewOo = Oo();
            if (tuxTextViewOo == null) {
                return;
            }
            tuxTextViewOo.setText(tuxTextViewOo.getContext().getResources().getQuantityString(2131755125, Math.min(20, c0olg.LIZIZ), strValueOf));
            C786410Ut5.LLILLL(cardViewSo, 0);
            HandlerHook.viewPost(tuxTextViewOo, new ARunnableS109S0100000_9((Object) tuxTextViewOo, 88));
            return;
        }
        TuxTextView tuxTextViewOo2 = Oo();
        tuxTextViewOo2.setText(tuxTextViewOo2.getContext().getResources().getQuantityString(2131755125, Math.min(20, c0olg.LIZIZ), strValueOf));
        C786410Ut5.LLILLL(cardViewSo, 0);
        TuxTextView tuxTextViewOo3 = Oo();
        if (tuxTextViewOo3 == null) {
            return;
        }
        tuxTextViewOo3.requestLayout();
    }

    public final void cO0(int i) {
        boolean z;
        int iMax;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LLJJIJI.getValue();
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (i < iFindFirstVisibleItemPosition) {
                z = true;
            } else {
                z = false;
            }
            Pair pair = new Pair(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(iFindLastVisibleItemPosition));
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            if (iIntValue <= i && i <= iIntValue2) {
                Ho().LIZ = i;
                linearLayoutManager.startSmoothScroll(Ho());
                return;
            }
            int iMax2 = Math.max(iIntValue2 - iIntValue, 2) * 3;
            if (i > iIntValue2 + iMax2) {
                if (z) {
                    iMax = Math.min(iMax2 + i, iIntValue2);
                } else {
                    iMax = Math.max(i - iMax2, iIntValue);
                }
                linearLayoutManager.scrollToPositionWithOffset(iMax, 0);
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
                if (viewOnAttachStateChangeListenerC20604515jvGo != null) {
                    HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jvGo, new ARunnableS16S0201000_9(i, linearLayoutManager, this, 1));
                    return;
                }
                return;
            }
            Ho().LIZ = i;
            linearLayoutManager.startSmoothScroll(Ho());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FrameLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        CardView cardViewLo = Lo();
        if (cardViewLo != null) {
            ViewGroup.LayoutParams layoutParams2 = cardViewLo.getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                if (C296830BkH.LIZ()) {
                    layoutParams.gravity = 8388693;
                    layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                } else {
                    layoutParams.gravity = 81;
                    layoutParams.setMarginEnd(0);
                    layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                }
                C786410Ut5.j6(cardViewLo, layoutParams);
            }
        }
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.0OLF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OLE) obj).LL;
            }
        }, null, new AwS623S0100000_9(this, 8), 6);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OMi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C618190OMn) obj).LLILLL;
            }
        }, this, null, null, null, new AwS588S0100000_9(this, 15), 28, null);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0OLC(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0OLB(this, null), 3);
        C786410Ut5.X7(So(), new ACListenerS144S0100000_9(this, 16));
        C786410Ut5.X7(Lo(), new ACListenerS144S0100000_9(this, 17));
        Go().addOnScrollListener(new AsS36S0100000_9(this, 3));
        Go().addOnScrollListener(new C0DWS(getContext(), AFwS195S0000000_9.get$arr$(40), AnonymousClass0206.get$arr$(14)));
    }
}
