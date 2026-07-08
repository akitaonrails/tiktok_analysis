package com.ss.android.ugc.now.interaction.ui;

import X.C098200Yq;
import X.C1349760lEE;
import X.C1350960lGA;
import X.C1352310lIL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2211751BhN;
import X.C2344009Gk;
import X.C723850SaN;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1352370lIR;
import X.InterfaceC1352410lIV;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NowLikeListFragment extends AbsFragment implements InterfaceC1352410lIV {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZisjPmE6JjEpOyHELIOS4wPCwjJ2EmIWsCJjgfIS4pBSYgPAM+KCg+LSs4";
    public ViewOnAttachStateChangeListenerC20604515jv LL;
    public Aweme LLILLJJLI;
    public NowFeedMobHierarchyData LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1352410lIV
    public final void dd(InterfaceC1352370lIR interfaceC1352370lIR) {
    }

    @Override // X.InterfaceC1352410lIV
    public final void setAid(String str) {
    }

    @Override // X.InterfaceC1352410lIV
    public final String Nu() {
        AwemeStatistics statistics;
        Aweme aweme = this.LLILLJJLI;
        long diggCount = (aweme == null || (statistics = aweme.getStatistics()) == null) ? 0L : statistics.getDiggCount();
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getResources().getQuantityString(2131755432, (int) diggCount, Long.valueOf(diggCount));
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
    }

    @Override // X.InterfaceC1352410lIV
    public final ViewOnAttachStateChangeListenerC20604515jv wd() {
        return this.LL;
    }

    @Override // X.InterfaceC1352410lIV
    public final void OA(Aweme aweme) {
        this.LLILLJJLI = aweme;
    }

    @Override // X.InterfaceC1352410lIV
    public final void lg(NowFeedMobHierarchyData nowFeedMobHierarchyData) {
        this.LLILLL = nowFeedMobHierarchyData;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1352410lIV
    public final void Z4(C19EG c19eg, String str) {
        String enterFrom;
        Integer numValueOf;
        String str2;
        Long lValueOf;
        Integer numIsNowClear;
        String enterFrom2;
        String str3;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        if (getUserVisibleHint() && !this.LLILZ && getActivity() != null) {
            this.LLILZ = true;
        }
        if (Intrinsics.LJFF(str, "change_tab") && (viewOnAttachStateChangeListenerC20604515jv = this.LL) != null) {
            C2211751BhN.LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
        C1349760lEE.LIZ("LikeListFragment", "onCommentPageShow");
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLILLL;
            Integer numValueOf2 = null;
            if (nowFeedMobHierarchyData != null) {
                enterFrom = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                enterFrom = null;
            }
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            User author = aweme.getAuthor();
            if (author != null) {
                numValueOf = Integer.valueOf(author.getFollowStatus());
            } else {
                numValueOf = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str2 = nowPostInfo.nowMediaType;
            } else {
                str2 = null;
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                lValueOf = Long.valueOf(statistics.getDiggCount());
            } else {
                lValueOf = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LLILLL;
            if (nowFeedMobHierarchyData2 != null) {
                numIsNowClear = nowFeedMobHierarchyData2.isNowClear();
            } else {
                numIsNowClear = null;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", enterFrom);
            c2344009Gk.LJFF("group_id", aid);
            c2344009Gk.LJFF("author_id", authorUid);
            c2344009Gk.LJ(numValueOf, "follow_status");
            c2344009Gk.LJFF("now_type", str2);
            c2344009Gk.LJFF("enter_method", str);
            c2344009Gk.LJ(lValueOf, "comment_cnt");
            c2344009Gk.LJ(numIsNowClear, "is_now_clear");
            C20684815ws.LJIILLIIL("show_reaction_panel", c2344009Gk.LIZ);
            if (C1352310lIL.LIZJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LLILLL;
                if (nowFeedMobHierarchyData3 != null) {
                    enterFrom2 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    enterFrom2 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str3 = nowPostInfo2.nowMediaType;
                } else {
                    str3 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    numValueOf2 = Integer.valueOf(author2.getFollowStatus());
                }
                C1350960lGA.LIZJ(numValueOf2, enterFrom2, "reaction", str, str3, aid2, authorUid2);
            }
        }
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = null;
        C723850SaN.LIZ(this, false, null, new AwS600S0100000_21(this, 356), 3);
        View view2 = getView();
        if (view2 != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.t0h);
        }
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
        View view3 = getView();
        if (view3 != null) {
            view3.findViewById(R.id.title);
        }
    }

    @Override // X.InterfaceC1352410lIV
    public final void zD(String str, String str2) {
        String enterFrom;
        Integer numValueOf;
        String str3;
        Integer numIsNowClear;
        String enterFrom2;
        String str4;
        C1349760lEE.LIZ("LikeListFragment", "onCommentPageDismiss");
        Aweme aweme = this.LLILLJJLI;
        if (aweme != null) {
            NowFeedMobHierarchyData nowFeedMobHierarchyData = this.LLILLL;
            Integer numValueOf2 = null;
            if (nowFeedMobHierarchyData != null) {
                enterFrom = nowFeedMobHierarchyData.getEnterFrom();
            } else {
                enterFrom = null;
            }
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            User author = aweme.getAuthor();
            if (author != null) {
                numValueOf = Integer.valueOf(author.getFollowStatus());
            } else {
                numValueOf = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str3 = nowPostInfo.nowMediaType;
            } else {
                str3 = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData2 = this.LLILLL;
            if (nowFeedMobHierarchyData2 != null) {
                numIsNowClear = nowFeedMobHierarchyData2.isNowClear();
            } else {
                numIsNowClear = null;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk.LJIIIIZZ("group_id", aid);
            c2344009Gk.LJIIIIZZ("author_id", authorUid);
            c2344009Gk.LJ(numValueOf, "follow_status");
            c2344009Gk.LJIIIIZZ("action_type", str);
            c2344009Gk.LJIIIIZZ("now_type", str3);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJ(numIsNowClear, "is_now_clear");
            C20684815ws.LJIILLIIL("close_reaction_panel", c2344009Gk.LIZ);
            if (C1352310lIL.LIZJ(aweme)) {
                NowFeedMobHierarchyData nowFeedMobHierarchyData3 = this.LLILLL;
                if (nowFeedMobHierarchyData3 != null) {
                    enterFrom2 = nowFeedMobHierarchyData3.getEnterFrom();
                } else {
                    enterFrom2 = null;
                }
                NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
                if (nowPostInfo2 != null) {
                    str4 = nowPostInfo2.nowMediaType;
                } else {
                    str4 = null;
                }
                String aid2 = aweme.getAid();
                String authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                User author2 = aweme.getAuthor();
                if (author2 != null) {
                    numValueOf2 = Integer.valueOf(author2.getFollowStatus());
                }
                C1350960lGA.LIZIZ(numValueOf2, enterFrom2, "reaction", str2, str4, str, aid2, authorUid2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd;
        C19GS c19gs = null;
        try {
            viewTd = C786410Ut5.Td(layoutInflater, R.layout.cto, viewGroup, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            viewTd = null;
        }
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
