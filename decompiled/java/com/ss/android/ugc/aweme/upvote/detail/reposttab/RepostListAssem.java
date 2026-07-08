package com.ss.android.ugc.aweme.upvote.detail.reposttab;

import X.AbstractC21673619ry;
import X.AbstractC471570IeR;
import X.AbstractC738140SxQ;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C01TA;
import X.C01TC;
import X.C050A;
import X.C0BNU;
import X.C0BXX;
import X.C0DXZ;
import X.C0H49;
import X.C0PEM;
import X.C0XQ7;
import X.C1208640hYc;
import X.C1220000hqw;
import X.C1256070in7;
import X.C1258230iqb;
import X.C1258490ir1;
import X.C1358550lSP;
import X.C1390410mHn;
import X.C13LE;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C19252910Tv;
import X.C19EG;
import X.C20603715jn;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C300180Bpg;
import X.C418440Gaw;
import X.C429430Gsf;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C487280J9a;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.C993690bxv;
import X.EnumC1258430iqv;
import X.EnumC1258450iqx;
import X.EnumC993680bxu;
import X.InterfaceC487330J9f;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.ss.android.ugc.aweme.upvote.IRepostListProtocol;
import com.ss.android.ugc.aweme.upvote.ability.IRepostProfileListAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostListAssem extends UIListContentAssem<RepostListViewModel> implements InterfaceC487330J9f, IRepostListProtocol {
    public C0H49 LLJ;
    public final C736950SvV LLJILJIL;
    public C1258490ir1 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723580SZw(this, C1258230iqb.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1929));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1928));

    public static final class NoMoreTipFooter extends PowerLoadingCell {
        public C1390410mHn LL;
        public TuxTextView LLILLJJLI;

        @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
        public final void L5() {
            C1390410mHn c1390410mHn = this.LL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZLLL();
                C786410Ut5.LLLZZIL(c1390410mHn, 8);
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                LifecycleOwner parent = getParent();
                if (parent instanceof RepostProfileListFragment) {
                    RepostProfileListFragment repostProfileListFragment = (RepostProfileListFragment) parent;
                    if (repostProfileListFragment.isEmpty()) {
                        C786410Ut5.LLLLZLL(tuxTextView, 8);
                        return;
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                    Boolean boolValueOf = Boolean.valueOf(repostProfileListFragment.wS().FQ2());
                    String str = repostProfileListFragment.wS().LLIZLLLIL;
                    String str2 = repostProfileListFragment.LLILLL;
                    Long lValueOf = Long.valueOf(C1256070in7.LIZ);
                    c1358550lSP.getClass();
                    if (boolValueOf == null || 15 == null) {
                        return;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TC(boolValueOf, str, str2, lValueOf, null), 3);
                }
            }
        }

        @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
        public final void N5() {
            C786410Ut5.LJLLLLLL(0, this.itemView);
            C1390410mHn c1390410mHn = this.LL;
            if (c1390410mHn != null) {
                C786410Ut5.LLLZZIL(c1390410mHn, 0);
                c1390410mHn.LIZJ();
            }
            TuxTextView tuxTextView = this.LLILLJJLI;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.i6u, viewGroup, false);
            this.LL = (C1390410mHn) viewTd.findViewById(R.id.gb5);
            this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.p_t);
            return viewTd;
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJIJIL.getValue();
    }

    public final C1258230iqb No() {
        return (C1258230iqb) this.LLIZLLLIL.getValue();
    }

    public final RecyclerView So() {
        return (RecyclerView) this.LLJI.getValue();
    }

    public final int Vo() {
        return C19252910Tv.LIZIZ.LIZLLL().LJI().LLLIZZ(3, 0);
    }

    public final C1749280vcc Zo() {
        return (C1749280vcc) this.LLJILLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final RepostListViewModel ip() {
        return (RepostListViewModel) this.LLJILJIL.getValue();
    }

    public RepostListAssem() {
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this, 1932);
        this.LLJILJIL = new C736950SvV(C13LE.LIZ(RepostListViewModel.class), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS257S0000000_19.get$arr$(330), new AwS563S0100000_19((AbstractC738140SxQ) this, 1930), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1931));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1926));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1927));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1925));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        Class cls = C300180Bpg.LIZ() ? NoMoreTipFooter.class : LoadingFooterCell.class;
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZ = 3;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZLLL = cls;
        c20603715jn.LJIIIZ = "repost_tab";
        return c20603715jn;
    }

    public final String Oo() {
        EnumC993680bxu enumC993680bxu;
        C1258230iqb c1258230iqbNo = No();
        if (c1258230iqbNo == null || (enumC993680bxu = c1258230iqbNo.LLILZ) == null) {
            return "";
        }
        int i = C993690bxv.LIZ[enumC993680bxu.ordinal()];
        return i != 1 ? i == 2 ? "personal_reposted_tab" : "" : "reposted_detail_list";
    }

    @Override // com.ss.android.ugc.aweme.upvote.IRepostListProtocol
    public final boolean UT1() {
        return Jo().FQ2();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        final GScope gScope = GScope.LL;
        C1554610qYd.LIZJ(gScope, IRepostListProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListAssem$onCreate$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(gScope, IRepostListProtocol.class, this);
                    }
                }
            });
        }
    }

    public final Bundle Lo(String str) {
        String str2;
        int iHashCode;
        String previousPage;
        boolean z;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, str, bundle);
        C786410Ut5.LJJJI("video_from", "REPOSTED_LIST_ENTRANCE", bundle);
        C1258230iqb c1258230iqbNo = No();
        if (c1258230iqbNo != null) {
            str2 = c1258230iqbNo.LL;
        } else {
            str2 = null;
        }
        C786410Ut5.LJJJI("enter_from", str2, bundle);
        C786410Ut5.LJJJI("tab_name", "repost_history", bundle);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            iHashCode = c19egLIZ.hashCode();
        } else {
            iHashCode = 0;
        }
        C786410Ut5.LJJJI("from_activity_hash_code", String.valueOf(iHashCode), bundle);
        IRepostProfileListAbility iRepostProfileListAbility = (IRepostProfileListAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRepostProfileListAbility.class, null);
        if (iRepostProfileListAbility != null) {
            previousPage = iRepostProfileListAbility.getPreviousPage();
        } else {
            previousPage = null;
        }
        C786410Ut5.LJJJI("previous_page", previousPage, bundle);
        IRepostProfileListAbility iRepostProfileListAbility2 = (IRepostProfileListAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRepostProfileListAbility.class, null);
        if (iRepostProfileListAbility2 != null && iRepostProfileListAbility2.Vl()) {
            z = true;
        } else {
            z = false;
        }
        bundle.putBoolean("is_skip_event_tracking", z);
        C786410Ut5.LJJJI("from_profile_uid", Jo().LLIZLLLIL, bundle);
        bundle.putInt("follow_status", Jo().LLJ);
        C786410Ut5.LJJJI("homepage_uid", Jo().LLIZLLLIL, bundle);
        C786410Ut5.LJJJI("profile_entrance_id", String.valueOf(C1256070in7.LIZ), bundle);
        if (Jo().LLJJIJIIJIL) {
            bundle.putBoolean("open_repost_panel", true);
        }
        if (Jo().LLJJIJIL) {
            C786410Ut5.LJJJI("enter_method", "click_repost_note_guide_bubble", bundle);
            C786410Ut5.LJJJI("open_repost_input", "true", bundle);
            Jo().LLJJIJIL = false;
        }
        return bundle;
    }

    public final void cp(boolean z) {
        String str;
        if (z) {
            C1722300uv6 c1722300uv6 = (C1722300uv6) this.LLJJIII.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show status: ");
            if (Intrinsics.LJFF(c1722300uv6, this.LLJJ.getValue())) {
                str = "error";
            } else {
                str = "empty";
            }
            sbLIZ.append(str);
            C429430Gsf.LIZ("RepostListAssem", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LLF(8, Go());
            C786410Ut5.LLLZLZ(Zo(), 0);
            Zo().setStatus(c1722300uv6);
            dp(EnumC1258430iqv.REFRESH_FIRST, EnumC1258450iqx.LOAD_EMPTY);
            return;
        }
        C786410Ut5.LLLZLZ(Zo(), 8);
        C786410Ut5.LLF(0, Go());
        dp(EnumC1258430iqv.REFRESH_FIRST, EnumC1258450iqx.LOADED);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Go().LJIILJJIL(RepostListCell.class);
        String str = null;
        Go().setItemAnimator(null);
        AbstractC21673619ry adapter = Go().getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.0J1c
                @Override // X.AbstractC471570IeR
                public final void LIZLLL(int i, int i2) {
                    if (i == 0 && i2 > 0) {
                        this.LIZ.Go().scrollToPosition(0);
                    }
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = Go();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(Go().getContext(), Vo());
        gridLayoutManager.LLIZ = new C1208640hYc(this, gridLayoutManager, 5);
        viewOnAttachStateChangeListenerC20604515jvGo.setLayoutManager(gridLayoutManager);
        super.onViewCreated(view);
        RepostListViewModel repostListViewModelJo = Jo();
        C1258230iqb c1258230iqbNo = No();
        if (c1258230iqbNo != null) {
            str = c1258230iqbNo.LL;
        }
        repostListViewModelJo.LLJILJIL = str;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this);
        }
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0irD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 45), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1258560ir8 c1258560ir8 = (C1258560ir8) obj;
                c1258560ir8.getClass();
                return C627260Oiy.LIZ(c1258560ir8);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 104), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 42), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 99), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 100), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 43), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0irA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS621S0100000_7(this, 44), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0ir4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1258560ir8) obj).LLJ);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 101), 4);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0iqq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1258560ir8 c1258560ir8 = (C1258560ir8) obj;
                c1258560ir8.getClass();
                return C627260Oiy.LIZLLL(c1258560ir8);
            }
        }, this, new C1770850wBP(), new AwS598S0100000_19(this, 263), null, new AwS598S0100000_19(this, 264), 16, null);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0iqr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1258560ir8 c1258560ir8 = (C1258560ir8) obj;
                c1258560ir8.getClass();
                return C627260Oiy.LIZJ(c1258560ir8);
            }
        }, this, new C1770850wBP(), new AwS586S0100000_7(this, 321), null, null, 48, null);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0irB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 102), 4);
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0irC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1258560ir8) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 103), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    @Override // com.ss.android.ugc.aweme.upvote.IRepostListProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wq2(java.lang.String r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel r0 = r7.Jo()
            java.util.List r6 = r0.listGetAll()
            r5 = 0
            if (r6 == 0) goto L2e
            java.util.Iterator r2 = r6.iterator()
            r1 = 0
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.next()
            X.050A r0 = (X.C050A) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LL
            java.lang.String r0 = r0.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 != 0) goto L2f
            int r1 = r1 + 1
            goto L13
        L2e:
            r1 = -1
        L2f:
            r4 = 0
            r3 = 1
            if (r1 != 0) goto L80
            if (r6 == 0) goto L7e
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r3, r6)
            X.050A r1 = (X.C050A) r1
        L3b:
            boolean r0 = r1 instanceof X.C050A
            if (r0 == 0) goto L80
        L3f:
            com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel r0 = r7.Jo()
            r0.vQ2(r8)
            if (r1 == 0) goto L56
            com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel r2 = r7.Jo()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.LL
            X.050A r0 = new X.050A
            r0.<init>(r1, r3)
            r2.listSetItemAt(r5, r0)
        L56:
            boolean r0 = X.C0BNU.LIZ()
            if (r0 == 0) goto L74
            com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel r2 = r7.Jo()
            java.lang.String r1 = r2.LLIZLLLIL
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L74
            r2.LLJJ = r4
        L74:
            com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel r0 = r7.Jo()
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList> r0 = r0.LLJJI
            r0.remove(r8)
            return
        L7e:
            r1 = r4
            goto L3b
        L80:
            r1 = r4
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListAssem.wq2(java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.upvote.IRepostListProtocol
    public final void HA1(UpvoteStruct upvoteStruct, String str) {
        boolean z;
        C050A c050a;
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str);
        if (awemeLLILZ == null) {
            return;
        }
        List<ITEM> listListGetAll = Jo().listGetAll();
        if (listListGetAll != 0 && !listListGetAll.isEmpty()) {
            Iterator it2 = listListGetAll.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C050A) it2.next()).LL.getAid(), str)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!z) {
            List<ITEM> listListGetAll2 = Jo().listGetAll();
            if (listListGetAll2 != 0) {
                c050a = (C050A) C13LP.LJJJLZIJ(0, listListGetAll2);
            } else {
                c050a = null;
            }
            if ((c050a instanceof C050A) && c050a != null && c050a.LLILLJJLI) {
                Jo().listSetItemAt(0, new C050A(c050a.LL, false));
            }
            Jo().listAddItemAt(0, new C050A(awemeLLILZ, true));
        }
        if (C0BNU.LIZ()) {
            RepostListViewModel repostListViewModelJo = Jo();
            if (Intrinsics.LJFF(repostListViewModelJo.LLIZLLLIL, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                repostListViewModelJo.LLJJ = null;
            }
        }
        if (str != null) {
            Jo().LLJJI.put(str, new UpvoteList(Collections.singletonList(upvoteStruct), 0L, false, 0L, str, null, 0L, null, null, null, null, 0L, 4078, null));
        }
    }

    public final void bp(View view, String str) {
        Object tag;
        Long l;
        String previousPage;
        if (view != null) {
            tag = view.getTag(R.id.s29);
        } else {
            tag = null;
        }
        if ((tag instanceof Long) && (l = (Long) tag) != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                if (view != null) {
                    view.setTag(R.id.s29, 0L);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                Boolean boolValueOf = Boolean.valueOf(Jo().FQ2());
                String str2 = Jo().LLIZLLLIL;
                IRepostProfileListAbility iRepostProfileListAbility = (IRepostProfileListAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IRepostProfileListAbility.class, null);
                if (iRepostProfileListAbility != null) {
                    previousPage = iRepostProfileListAbility.getPreviousPage();
                } else {
                    previousPage = null;
                }
                Long lValueOf = Long.valueOf(C1256070in7.LIZ);
                Long lValueOf2 = Long.valueOf(jElapsedRealtime);
                c1358550lSP.getClass();
                if (boolValueOf != null && 15 != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01TA(boolValueOf, str2, previousPage, lValueOf, str, lValueOf2, null), 3);
                }
            }
        }
    }

    public final void dp(EnumC1258430iqv enumC1258430iqv, EnumC1258450iqx enumC1258450iqx) {
        boolean userVisibleHint;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLoadState, loadScene = ");
        sbLIZ.append(enumC1258430iqv);
        sbLIZ.append(", loadState = ");
        sbLIZ.append(enumC1258450iqx);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC1258430iqv == EnumC1258430iqv.REFRESH_FIRST) {
            LifecycleOwner parent = getParent();
            if (parent instanceof Fragment) {
                userVisibleHint = ((Fragment) parent).getUserVisibleHint();
            } else {
                userVisibleHint = false;
            }
            if (!C0BXX.LIZ()) {
                if (enumC1258450iqx == EnumC1258450iqx.LOADING) {
                    if (userVisibleHint) {
                        Zo().setTag(R.id.s29, Long.valueOf(SystemClock.elapsedRealtime()));
                        return;
                    }
                    return;
                }
                bp(Zo(), "ball_loading");
                return;
            }
            if (enumC1258450iqx == EnumC1258450iqx.LOADING) {
                if (this.LLJ == null) {
                    this.LLJ = new C0H49(Vo());
                }
                if (So().getVisibility() != 0) {
                    C786410Ut5.LLIZLLLIL(So(), 0);
                    if (!Intrinsics.LJFF(So().getAdapter(), this.LLJ)) {
                        So().addItemDecoration(new C0DXZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))));
                        So().setLayoutManager(new GridLayoutManager(So().getContext(), Vo()));
                        So().setAdapter(this.LLJ);
                    }
                    C0H49 c0h49 = this.LLJ;
                    if (c0h49 != null) {
                        c0h49.LLLFZ();
                    }
                }
                if (userVisibleHint) {
                    So().setTag(R.id.s29, Long.valueOf(SystemClock.elapsedRealtime()));
                }
                C786410Ut5.LLF(8, Go());
                return;
            }
            if (So().getVisibility() != 8) {
                C0H49 c0h492 = this.LLJ;
                if (c0h492 != null) {
                    c0h492.LLLI();
                }
                C786410Ut5.LLIZLLLIL(So(), 8);
                bp(So(), "shimmer");
            }
            if (enumC1258450iqx != EnumC1258450iqx.LOADED) {
                return;
            }
            C786410Ut5.LLF(0, Go());
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        GridLayoutManager gridLayoutManager;
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (gridLayoutManager = (GridLayoutManager) layoutManager) != null) {
            gridLayoutManager.LJIJ(Vo());
        }
    }
}
