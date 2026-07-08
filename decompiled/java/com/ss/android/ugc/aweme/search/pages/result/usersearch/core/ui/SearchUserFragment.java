package com.ss.android.ugc.aweme.search.pages.result.usersearch.core.ui;

import X.C0PN2;
import X.C0PNN;
import X.C0PSR;
import X.C0SY1;
import X.C1354920lMY;
import X.C14EU;
import X.C643800PNa;
import X.C644560PPy;
import X.C662380PyW;
import X.C723180SYi;
import X.InterfaceC653950Pkv;
import X.InterfaceC723190SYj;
import Y.AObserverS214S0100000_10;
import android.os.Bundle;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment;
import com.ss.android.ugc.aweme.search.pages.result.usersearch.core.ui.SearchUserFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchUserFragment extends SearchOriginalFragment<SearchUser> implements InterfaceC723190SYj {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYpKD0wIGs8KCg2O2s+LDwmHELIOSJDFiPDw2OjYpKD0wIGsvJj02ZjAlZxw2KTcvIRogLTcKOy40JSAiPQ==";
    public C0SY1 LLLLLL;
    public final boolean LLLLLLIL = true;
    public final String LLLLLLJ = "a2270.b5289";

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String cS() {
        return "user";
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment
    public final boolean isRegisterEventBus() {
        return true;
    }

    @Override // X.InterfaceC723190SYj
    public final void uc1(FollowStatus followStatus) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void YS() {
        this.LLLIIIL = new C662380PyW(this.LLJI, gS(), new InterfaceC653950Pkv() { // from class: X.0Pks
            @Override // X.InterfaceC653950Pkv
            public final void LIZ(C653930Pkt c653930Pkt) {
                String strLIZIZ;
                String str;
                C664030Q2v c664030Q2v;
                User user = c653930Pkt.LIZIZ;
                C0Q3E.LIZIZ(this.LIZ).P70().LIZJ();
                C646000PVm c646000PVm = C650950Pg5.Companion;
                SearchUserFragment searchUserFragment = this.LIZ;
                SearchUserFragment searchUserFragment2 = this.LIZ;
                c646000PVm.getClass();
                C646000PVm.LJIIIZ(searchUserFragment, searchUserFragment2);
                if (user != null) {
                    SearchUserFragment searchUserFragment3 = this.LIZ;
                    View view = searchUserFragment3.getView();
                    int i = c653930Pkt.LIZLLL;
                    String strDS = searchUserFragment3.dS();
                    String requestId = user.getRequestId();
                    String uid = user.getUid();
                    if (C300140Bpc.LIZ()) {
                        strLIZIZ = c653930Pkt.LJI;
                    } else {
                        strLIZIZ = C663370Q0h.LIZIZ(searchUserFragment3.dS());
                    }
                    String str2 = c653930Pkt.LJ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("search_result_id", user.getUid());
                    linkedHashMap.put("previous_page", "search_result");
                    c646000PVm.getClass();
                    C650960Pg6 c650960Pg6LJII = C646000PVm.LJII(searchUserFragment3, searchUserFragment3);
                    if (c650960Pg6LJII != null && (c664030Q2v = c650960Pg6LJII.searchVideoModel) != null) {
                        str = c664030Q2v.groupId;
                    } else {
                        str = null;
                    }
                    C19EG activity = searchUserFragment3.getActivity();
                    C653440Pk6.LIZ(i, view, uid, null);
                    C0QJY.LIZ.getClass();
                    String strLIZ = C0QJY.LIZ(searchUserFragment3, activity);
                    C0QER c0qerLIZJ = C640270P9l.LIZJ(searchUserFragment3, activity);
                    if (c0qerLIZJ != null) {
                        ECSearchEntranceData.Companion.getClass();
                        if (C650500PfM.LIZJ(c0qerLIZJ)) {
                            strLIZ = ((IMiddleForSearchFromEC) ServiceManager.get().getService(IMiddleForSearchFromEC.class)).LLIIIL();
                        }
                    }
                    C735410St1 c735410St1 = new C735410St1();
                    c735410St1.LIZLLL = C663370Q0h.LIZ(0);
                    c735410St1.LJJLIL = requestId;
                    c735410St1.LJJLIIIJJI = 0;
                    c735410St1.LJIIJ = String.valueOf(i);
                    c735410St1.LJJLIIJ = uid;
                    c735410St1.LJLLLL = strLIZ;
                    c735410St1.LJLJLLL = str2;
                    c735410St1.LJLLLLLL = str;
                    c735410St1.LIZIZ(linkedHashMap);
                    C663370Q0h.LIZJ(i, strDS, requestId, c735410St1, 0, strLIZIZ);
                    C663370Q0h.LJFF(0, requestId, uid);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(searchUserFragment3.getActivity(), "//user/profile");
                    smartRouteBuildRoute.withParam("uid", user.getUid());
                    smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
                    smartRouteBuildRoute.withParam("enter_from", "search_result");
                    smartRouteBuildRoute.withParam("previous_page", "search_result");
                    smartRouteBuildRoute.withParam("extra_from_pre_page", "search_result");
                    smartRouteBuildRoute.withParam("extra_from_event_enter_from", "search_result");
                    smartRouteBuildRoute.withParam("profile_enterprise_type", user.getCommerceUserLevel());
                    smartRouteBuildRoute.withParam("extra_previous_page_position", "main_head");
                    smartRouteBuildRoute.withParam("search_request_id", user.getRequestId());
                    smartRouteBuildRoute.withParam("trackParams", C786410Ut5.J3(new JSONObject(C2097908Jt.LIZJ(new Pair("rfevent_previous_page", c653930Pkt.LJIIIIZZ)))));
                    smartRouteBuildRoute.withParam("enter_method", c653930Pkt.LJI);
                    smartRouteBuildRoute.open();
                }
            }
        }, this, "search_result");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment
    public final void ZS() {
        this.LLLLLJIL = new C0PNN();
        cU().LJIIJJI(this);
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        C0SY1 c0sy1LJIIIIZZ = iFriendsService != null ? iFriendsService.LJIIIIZZ() : null;
        this.LLLLLL = c0sy1LJIIIIZZ;
        if (c0sy1LJIIIIZZ != null) {
            c0sy1LJIIIIZZ.LJII(this);
        }
        C643800PNa<?> c643800PNaCU = cU();
        c643800PNaCU.LLILZIL = this;
        T t = c643800PNaCU.LL;
        if (t != 0) {
            ((C0PN2) t).LLJ = ZA();
        }
    }

    public SearchUserFragment() {
        C644560PPy.LIZ.getClass();
        this.LLJILLL = C644560PPy.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchOriginalFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C0SY1 c0sy1 = this.LLLLLL;
        if (c0sy1 != null) {
            c0sy1.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment, com.ss.android.ugc.aweme.search.result.AbsSearchBaseFragment
    public final boolean NR() {
        return this.LLLLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchBaseFragment
    public final String bS() {
        return this.LLLLLLJ;
    }

    @Override // X.InterfaceC723190SYj
    public final void Uo(FollowStatus followStatus) {
        isViewValid();
    }

    @C14EU
    public final void onProfileFollowEvent(C0PSR c0psr) {
        Object obj = c0psr.LIZIZ;
        if (!(obj instanceof User)) {
            return;
        }
        FollowStatus followStatus = new FollowStatus(0, 0, null, 0, null, null, true, true, -1, 0, null, null, -1, false);
        followStatus.setUserId(((User) obj).getUid());
        followStatus.setFollowStatus(c0psr.LIZ);
    }

    @Override // X.InterfaceC723190SYj
    public final void th(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C1354920lMY.LIZLLL(getContext(), exc, R.string.jpj);
    }

    @Override // X.InterfaceC723190SYj
    public final void u41(Exception exc) {
        C723180SYi.LIZ(this, exc);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, X.InterfaceC1212360hec
    public final void Pj(List<? extends SearchUser> list, boolean z) {
        super.Pj(list, ((C0PNN) cU()).LJIIIIZZ());
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment, com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchVisibilityDetectFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RelationService relationServiceLIZIZ;
        EventLiveData<FollowStatus> relationObservable;
        super.onViewCreated(view, bundle);
        IFriendsService iFriendsService = (IFriendsService) PluggableExtentionKt.pluggableSpi$default(IFriendsService.class, false, false, false, 14, null);
        if (iFriendsService != null && (relationServiceLIZIZ = iFriendsService.LIZIZ()) != null && (relationObservable = relationServiceLIZIZ.getRelationObservable()) != null) {
            relationObservable.observe(this, new AObserverS214S0100000_10(this, 59));
        }
    }
}
