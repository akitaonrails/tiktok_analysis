package com.ss.android.ugc.aweme.compliance.privacy.friendlist;

import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C098200Yq;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C15438062q;
import X.C1637806bA;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20603715jn;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C427660Gpo;
import X.C452501pT;
import X.C612700O1k;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC0148002o;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class SimpleFriendsListPage extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclHELIOSPy4wMWsqOyY2JiEgIDwnZhYlJD8/LQM+ICo9LDYAIDwnGCQrLA==";
    public TuxNavBar LL;
    public String LLILLJJLI = "";
    public String LLILLL = "";
    public String LLILZ = "";
    public String LLILZIL = "";
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(63));

    public static final class FriendsListAssem extends UIListContentAssem<FriendsListViewModel> {
        public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
        public C1749280vcc LLIZLLLIL;
        public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 75));
        public final AssemVMLazy LLJI;

        static {
            C2217381BqS c2217381BqS = new C2217381BqS(FriendsListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/friendlist/SimpleFriendsListPage$FriendsListViewModel;", 0);
            C13LE.LIZ.getClass();
            LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        }

        public FriendsListAssem() {
            C019F c019f = C019F.LIZ;
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FriendsListViewModel.class);
            this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 77), AFwS240S0000000_9.get$arr$(63), null, true);
        }

        @Override // com.bytedance.ext_power_list.UIListContentAssem
        public final ViewOnAttachStateChangeListenerC20604515jv Go() {
            return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
        }

        @Override // com.bytedance.ext_power_list.UIListContentAssem
        public final C20603715jn Ho() {
            C20603715jn c20603715jn = new C20603715jn();
            c20603715jn.LIZ = 10;
            c20603715jn.LIZLLL = LoadingFooterCell.class;
            return c20603715jn;
        }

        @Override // com.bytedance.ext_power_list.UIListContentAssem
        /* JADX INFO: renamed from: Jo */
        public final AssemListViewModel ip() {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            return (AssemListViewModel) assemVMLazy.getValue();
        }

        public final C1749280vcc Lo() {
            View viewFindViewById = this.LLIZLLLIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
                this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
            }
            return (C1749280vcc) viewFindViewById;
        }

        @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
        public final void onViewCreated(View view) {
            super.onViewCreated(view);
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OhD
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C612700O1k c612700O1k = (C612700O1k) obj;
                    c612700O1k.getClass();
                    return C627260Oiy.LIZLLL(c612700O1k);
                }
            }, null, new AwS588S0100000_9(this, 70), new AwS553S0100000_9(this, 76), new AwS588S0100000_9(this, 71), 2, null);
        }
    }

    public static final class FriendsListViewModel extends AssemListViewModel<C612700O1k, C623470Ocr, String> {
        @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
        public final InterfaceC0148002o defaultState() {
            return new C612700O1k(0);
        }

        public static List vQ2(List list) {
            String uniqueId;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                User user = (User) it2.next();
                String uid = user.getUid();
                UrlModel avatarThumb = user.getAvatarThumb();
                if (TextUtils.isEmpty(user.getUniqueId())) {
                    uniqueId = user.getShortId();
                } else {
                    uniqueId = user.getUniqueId();
                }
                arrayList.add(new C623470Ocr(uid, avatarThumb, uniqueId, user.getNickname(), user));
            }
            return arrayList;
        }

        @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
        public final void newState(C627660Ojc<C623470Ocr> c627660Ojc) {
            setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 72));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        @Override // com.bytedance.ext_power_list.AssemListViewModel
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r12) {
            /*
                r11 = this;
                boolean r0 = r12 instanceof X.C623480Ocs
                if (r0 == 0) goto L20
                r10 = r12
                X.0Ocs r10 = (X.C623480Ocs) r10
                int r2 = r10.LLILLL
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L20
                int r2 = r2 - r1
                r10.LLILLL = r2
            L12:
                java.lang.Object r2 = r10.LL
                java.lang.Object r1 = X.C099R.LJFF()
                int r0 = r10.LLILLL
                r4 = 1
                if (r0 == 0) goto L2e
                if (r0 != r4) goto L26
                goto L50
            L20:
                X.0Ocs r10 = new X.0Ocs
                r10.<init>(r11, r12)
                goto L12
            L26:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L2e:
                X.C155000ia.LIZIZ(r2)
                X.1Dai r5 = X.C2258581Dai.LIZIZ     // Catch: java.lang.Exception -> L79
                X.0ixP r0 = X.EnumC1262450ixP.TT_PUBLISH_VISIBILITY_PAGE     // Catch: java.lang.Exception -> L79
                int r6 = r0.getValue()     // Catch: java.lang.Exception -> L79
                r7 = 30
                com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Exception -> L79
                X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Exception -> L79
                java.lang.String r8 = r0.getCurSecUserId()     // Catch: java.lang.Exception -> L79
                java.lang.String r9 = ""
                r10.LLILLL = r4     // Catch: java.lang.Exception -> L79
                java.lang.Object r2 = r5.LIZJ(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L79
                if (r2 != r1) goto L53
                return r1
            L50:
                X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L79
            L53:
                com.ss.android.ugc.aweme.relation.model.FriendsListResponse r2 = (com.ss.android.ugc.aweme.relation.model.FriendsListResponse) r2     // Catch: java.lang.Exception -> L79
                r2.checkValid()     // Catch: java.lang.Exception -> L79
                java.lang.String r3 = r2.nextPageToken     // Catch: java.lang.Exception -> L79
                boolean r1 = r2.hasMore     // Catch: java.lang.Exception -> L79
                java.util.List r0 = r2.getUserList()     // Catch: java.lang.Exception -> L79
                java.util.List r2 = vQ2(r0)     // Catch: java.lang.Exception -> L79
                if (r1 == 0) goto L6e
                X.0CcB r1 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L79
                r0 = 0
                X.0Cm0 r0 = X.C317290CcB.LJ(r1, r0, r3, r2, r4)     // Catch: java.lang.Exception -> L79
                return r0
            L6e:
                X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L79
                r0.getClass()     // Catch: java.lang.Exception -> L79
                X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L79
                r0.<init>(r2)     // Catch: java.lang.Exception -> L79
                return r0
            L79:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                X.0CcB r0 = X.AbstractC316870CbV.LIZ
                r0.getClass()
                X.0Cb9 r0 = new X.0Cb9
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.friendlist.SimpleFriendsListPage.FriendsListViewModel.onRefresh(X.05Vn):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        @Override // com.bytedance.ext_power_list.AssemListViewModel
        /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object onLoadMore(java.lang.String r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.String>> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof X.C623490Oct
                if (r0 == 0) goto L20
                r10 = r13
                X.0Oct r10 = (X.C623490Oct) r10
                int r2 = r10.LLILLL
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L20
                int r2 = r2 - r1
                r10.LLILLL = r2
            L12:
                java.lang.Object r2 = r10.LL
                java.lang.Object r1 = X.C099R.LJFF()
                int r0 = r10.LLILLL
                r4 = 1
                if (r0 == 0) goto L2e
                if (r0 != r4) goto L26
                goto L4f
            L20:
                X.0Oct r10 = new X.0Oct
                r10.<init>(r11, r13)
                goto L12
            L26:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L2e:
                X.C155000ia.LIZIZ(r2)
                X.1Dai r5 = X.C2258581Dai.LIZIZ     // Catch: java.lang.Exception -> L78
                X.0ixP r0 = X.EnumC1262450ixP.TT_RELATION_PAGE     // Catch: java.lang.Exception -> L78
                int r6 = r0.getValue()     // Catch: java.lang.Exception -> L78
                r7 = 30
                com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()     // Catch: java.lang.Exception -> L78
                X.0XPy r0 = (X.AbstractC848400XPy) r0     // Catch: java.lang.Exception -> L78
                java.lang.String r8 = r0.getCurSecUserId()     // Catch: java.lang.Exception -> L78
                r10.LLILLL = r4     // Catch: java.lang.Exception -> L78
                r9 = r12
                java.lang.Object r2 = r5.LIZJ(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L78
                if (r2 != r1) goto L52
                return r1
            L4f:
                X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L78
            L52:
                com.ss.android.ugc.aweme.relation.model.FriendsListResponse r2 = (com.ss.android.ugc.aweme.relation.model.FriendsListResponse) r2     // Catch: java.lang.Exception -> L78
                r2.checkValid()     // Catch: java.lang.Exception -> L78
                java.lang.String r3 = r2.nextPageToken     // Catch: java.lang.Exception -> L78
                boolean r1 = r2.hasMore     // Catch: java.lang.Exception -> L78
                java.util.List r0 = r2.getUserList()     // Catch: java.lang.Exception -> L78
                java.util.List r2 = vQ2(r0)     // Catch: java.lang.Exception -> L78
                if (r1 == 0) goto L6d
                X.0CcB r1 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L78
                r0 = 0
                X.0Cm0 r0 = X.C317290CcB.LJ(r1, r0, r3, r2, r4)     // Catch: java.lang.Exception -> L78
                return r0
            L6d:
                X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L78
                r0.getClass()     // Catch: java.lang.Exception -> L78
                X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L78
                r0.<init>(r2)     // Catch: java.lang.Exception -> L78
                return r0
            L78:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                X.0CcB r0 = X.AbstractC316870CbV.LIZ
                r0.getClass()
                X.0Cb9 r0 = new X.0Cb9
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.friendlist.SimpleFriendsListPage.FriendsListViewModel.onLoadMore(java.lang.String, X.05Vn):java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    public static final class SimpleFriendItemCell extends PowerCell<C623470Ocr> {
        @Override // com.bytedance.ies.powerlist.PowerCell
        public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
            C623470Ocr c623470Ocr = (C623470Ocr) interfaceC1891350zJl;
            super.onBindItemView(c623470Ocr);
            ((TextView) this.itemView.findViewById(R.id.p94)).setText(c623470Ocr.LLILZ);
            ((TextView) this.itemView.findViewById(R.id.user_name)).setText(c623470Ocr.LLILLL);
            C427660Gpo.LJIIJJI((C427660Gpo) this.itemView.findViewById(R.id.user_avatar), new C03IT(c623470Ocr.LLILLJJLI.getUrlList()), false, null, null, false, false, null, null, false, null, 1022);
        }

        @Override // com.bytedance.ies.powerlist.PowerCell
        public final View onCreateItemView(ViewGroup viewGroup) {
            return PowerCell.inflateItemView$default(this, viewGroup, R.layout.bdq, false, 4, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZLLL.LJ(R.attr.bx);
        tuxImmersionBarLIZLLL.LIZLLL();
        C19EG activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            intent.putExtra("activity_translation_type", 7);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        C20684815ws.LJIILLIIL("show_friends_list", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk2.LIZJ(((User) this.LLILZLL.getValue()).getFriendCount(), "muf_cnt");
        c2344009Gk2.LJIIIIZZ("enter_method", "click");
        if (!TextUtils.isEmpty(this.LLILLL)) {
            c2344009Gk2.LJFF("creation_id", this.LLILLL);
        }
        if (!TextUtils.isEmpty(this.LLILZ)) {
            c2344009Gk2.LJFF("group_id", this.LLILZ);
        }
        if (!TextUtils.isEmpty(this.LLILZIL)) {
            c2344009Gk2.LJFF("page_tag", this.LLILZIL);
        }
        C20684815ws.LJIILLIIL("enter_mutual_friends_list", c2344009Gk2.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String quantityString;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.y1z);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        C1250250idj c1250250idj = new C1250250idj();
        if (((User) this.LLILZLL.getValue()).getFriendCount() == 0) {
            quantityString = getString(2131830725);
        } else {
            quantityString = tuxNavBar.getResources().getQuantityString(2131755222, ((User) this.LLILZLL.getValue()).getFriendCount(), Integer.valueOf(((User) this.LLILZLL.getValue()).getFriendCount()));
        }
        c1250250idj.LIZJ = quantityString;
        tuxNavBar.LJIJJ(c1250250idj);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LJIIIIZZ = getString(2131823332);
        c1251150ifB.LIZJ(new AwS553S0100000_9(this, 78));
        tuxNavBar.LIZIZ(c1251150ifB);
        tuxNavBar.LJIIZILJ(false);
        C723850SaN.LIZ(this, false, null, new AwS375S0200000_9(this, view, 21), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bdr, viewGroup, false);
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
}
