package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C098200Yq;
import X.C0P6P;
import X.C0QEQ;
import X.C0QER;
import X.C1220000hqw;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1ER1;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C665670Q9d;
import X.C665740Q9k;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC666200QBe;
import X.InterfaceC653950Pkv;
import X.InterfaceC665680Q9e;
import X.InterfaceC665700Q9g;
import X.InterfaceC665710Q9h;
import Y.AsS37S0100000_10;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchResultFragment extends FFPBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISHELIOSoiZyk1OGs5IGEALSQ+KicBLTY5JTsVOiQrJCo9PA==";
    public C665670Q9d LLJ;
    public SearchKeywordPresenter LLJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 195));
    public final int LLJIJIL = -1;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void cS() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0Q9j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069910dwr) obj).LLILLL;
            }
        }, C736820SvI.LIZJ(), new AwS624S0100000_10(this, 12), 4);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int UR() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0iRT] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void bS(View view) {
        if (!(view instanceof C665670Q9d)) {
            return;
        }
        final C19EG c19egRequireActivity = requireActivity();
        Object obj = null;
        final SearchKeywordPresenter searchKeywordPresenter = new SearchKeywordPresenter(c19egRequireActivity, null);
        final C665670Q9d c665670Q9d = (C665670Q9d) view;
        InterfaceC665710Q9h interfaceC665710Q9h = new InterfaceC665710Q9h() { // from class: X.0Q9i
            @Override // X.InterfaceC665710Q9h
            public final void LIZIZ() {
                C0DLI.LIZ(c19egRequireActivity, c665670Q9d);
            }
        };
        if (!c665670Q9d.LLJ) {
            final boolean z = true;
            c665670Q9d.LLJ = true;
            c665670Q9d.LLILZLL = c19egRequireActivity;
            c665670Q9d.LLIZ = this;
            c665670Q9d.LLIZLLLIL = c19egRequireActivity;
            c665670Q9d.LLILLL = searchKeywordPresenter;
            C1ER1 c1er1 = C1ER1.LIZIZ;
            InterfaceC665700Q9g interfaceC665700Q9gLLLIIIL = c1er1.LLLIIIL();
            c665670Q9d.LLILZ = interfaceC665700Q9gLLLIIIL;
            if (interfaceC665700Q9gLLLIIIL == null) {
                interfaceC665700Q9gLLLIIIL = null;
            }
            interfaceC665700Q9gLLLIIIL.LIZIZ(c665670Q9d);
            InterfaceC665700Q9g interfaceC665700Q9g = c665670Q9d.LLILZ;
            if (interfaceC665700Q9g == null) {
                interfaceC665700Q9g = null;
            }
            interfaceC665700Q9g.LJFF("find_friends_page");
            AFwS196S0000000_10 aFwS196S0000000_10 = AFwS196S0000000_10.get$arr$(662);
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(FindFriendsPageVM.class);
            AFwS241S0000000_10 aFwS241S0000000_10 = AFwS241S0000000_10.get$arr$(536);
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C1622206Wu c1622206WuLJII = C724750Sbp.LJII(c19egRequireActivity);
            if (!(c19egRequireActivity instanceof HasDefaultViewModelProviderFactory)) {
                c19egRequireActivity = null;
            }
            if (((FindFriendsPageVM) new C736950SvV(c19719912DlLIZ, aFwS196S0000000_10, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(c19egRequireActivity), aFwS241S0000000_10, null, null, null).getValue()).zQ2().getPageStyle() != EnumC666200QBe.TT_NOW) {
                z = false;
            }
            SearchResultParam searchResultParam = new SearchResultParam();
            if (z) {
                if (searchResultParam.getSearchEnterParam() == null) {
                    C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
                    c0qeqNewBuilder.LJIIJJI = "now_find_friends_search";
                    searchResultParam.setSearchEnterParam(c0qeqNewBuilder.LJ());
                } else {
                    searchResultParam.getSearchEnterParam().setSourcePage("now_find_friends_search");
                }
            }
            InterfaceC665680Q9e interfaceC665680Q9eLJLJLLL = c1er1.LJLJLLL(searchResultParam, searchKeywordPresenter, new InterfaceC653950Pkv() { // from class: X.0iRT
                @Override // X.InterfaceC653950Pkv
                public final void LIZ(C653930Pkt c653930Pkt) {
                    String str;
                    String str2;
                    Integer numValueOf;
                    int iValueOf;
                    List<? extends Aweme> list;
                    Video video;
                    List<? extends Aweme> list2;
                    User user = c653930Pkt.LIZIZ;
                    C1ER1.LIZIZ.X(searchKeywordPresenter.getKeyword().LIZ, c653930Pkt.LIZLLL, user.getRequestId(), user.getUid(), searchKeywordPresenter.getKeyword().LIZ, C1070040dx4.LIZ(user).getTrackName());
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c665670Q9d.getContext(), "aweme://user/profile/");
                    smartRouteBuildRoute.withParam("uid", user.getUid());
                    smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
                    smartRouteBuildRoute.withParam("enter_from", "find_friends");
                    smartRouteBuildRoute.withParam("extra_previous_page_position", "main_head");
                    smartRouteBuildRoute.withParam("profile_enterprise_type", C2277881EDy.LIZIZ.getEnterpriseType(user));
                    smartRouteBuildRoute.withParam("extra_from_pre_page", "general_search");
                    if (!z) {
                        str = "";
                    } else {
                        str = "now_find_friends_search";
                    }
                    smartRouteBuildRoute.withParam("source_page", str);
                    if (z) {
                        str2 = "now_find_friends_page";
                    } else {
                        str2 = "find_friends_page";
                    }
                    smartRouteBuildRoute.withParam("trackParams", C786410Ut5.J3(new JSONObject(C2097908Jt.LIZJ(new Pair("rfevent_previous_page", str2)))));
                    if (user.getMatchedFriendStruct() != null) {
                        MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                        if (matchedFriendStruct != null && (list2 = matchedFriendStruct.awemeList) != null) {
                            numValueOf = Integer.valueOf(list2.size());
                        } else {
                            numValueOf = null;
                        }
                        matchedFriendStruct.setAwemeListSize(numValueOf);
                        MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
                        int i = 0;
                        if (matchedFriendStruct2 != null && (list = matchedFriendStruct2.awemeList) != null) {
                            if (!list.isEmpty()) {
                                i = 0;
                                for (Aweme aweme : list) {
                                    if (aweme != null && (video = aweme.getVideo()) != null && video.getCover() != null && (i = i + 1) < 0) {
                                        C1697810uHb.LJIJ();
                                        throw null;
                                    }
                                }
                            }
                            iValueOf = Integer.valueOf(i);
                        } else {
                            iValueOf = 0;
                        }
                        matchedFriendStruct.setAwemeListVideoCoverSize(iValueOf);
                        matchedFriendStruct.setAwemeList(null);
                        EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
                        String accurateRecType = user.getAccurateRecType();
                        C1252610ihX.Companion.getClass();
                        EnumC736410Sud enumC736410SudLIZ = C736420Sue.LIZ(user);
                        String uid = user.getUid();
                        if (uid == null) {
                            uid = "";
                        }
                        String requestId = user.getRequestId();
                        String friendTypeStr = user.getFriendTypeStr();
                        if (friendTypeStr == null) {
                            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
                            if (matchedFriendStruct3 != null) {
                                friendTypeStr = matchedFriendStruct3.relationType;
                            } else {
                                friendTypeStr = null;
                            }
                        }
                        String socialInfo = user.getSocialInfo();
                        if (socialInfo == null) {
                            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
                            if (matchedFriendStruct4 != null) {
                                socialInfo = matchedFriendStruct4.socialInfo;
                            } else {
                                socialInfo = null;
                            }
                        }
                        smartRouteBuildRoute.withParam("recommend_enter_profile_params", new C1252610ihX("search_result", "search_result", enumC1260920iuw, accurateRecType, enumC736410SudLIZ, uid, null, null, requestId, null, friendTypeStr, socialInfo, matchedFriendStruct, null, null, null, false, null, null, null, null, false, null, false, null));
                    }
                    smartRouteBuildRoute.open();
                }
            });
            c665670Q9d.LLILZIL = interfaceC665680Q9eLJLJLLL;
            if (interfaceC665680Q9eLJLJLLL == null) {
                interfaceC665680Q9eLJLJLLL = null;
            }
            interfaceC665680Q9eLJLJLLL.setLoadMoreListener(new C0P6P() { // from class: X.0Q9f
                @Override // X.C0P6P
                public final void LJJIFFI() {
                    InterfaceC665700Q9g interfaceC665700Q9g2 = c665670Q9d.LLILZ;
                    if (interfaceC665700Q9g2 == null) {
                        interfaceC665700Q9g2 = null;
                    }
                    interfaceC665700Q9g2.LIZJ(4, searchKeywordPresenter.getKeyword().LIZ, 1);
                }
            });
            InterfaceC665680Q9e interfaceC665680Q9e = c665670Q9d.LLILZIL;
            if (interfaceC665680Q9e == null) {
                interfaceC665680Q9e = null;
            }
            interfaceC665680Q9e.setLoadEmptyTextColor(Integer.valueOf(c665670Q9d.getResources().getColor(R.color.di)));
            InterfaceC665680Q9e interfaceC665680Q9e2 = c665670Q9d.LLILZIL;
            if (interfaceC665680Q9e2 == null) {
                interfaceC665680Q9e2 = null;
            }
            interfaceC665680Q9e2.setLoadEmptyText(c665670Q9d.getResources().getString(2131847162));
            C665740Q9k.LIZ(c665670Q9d.getSearchListFromXml(), 6);
            c665670Q9d.getSearchListFromXml().setLayoutManager(new WrapLinearLayoutManager(c665670Q9d.getContext()));
            RecyclerView searchListFromXml = c665670Q9d.getSearchListFromXml();
            InterfaceC665680Q9e interfaceC665680Q9e3 = c665670Q9d.LLILZIL;
            if (interfaceC665680Q9e3 != null) {
                obj = interfaceC665680Q9e3;
            }
            searchListFromXml.setAdapter((AbstractC21673619ry) obj);
            c665670Q9d.getSearchListFromXml().addOnScrollListener(new AsS37S0100000_10(interfaceC665710Q9h, 25));
        }
        ViewGroup.LayoutParams layoutParams = c665670Q9d.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            C786410Ut5.W5(c665670Q9d, layoutParams);
            this.LLJ = c665670Q9d;
            this.LLJI = searchKeywordPresenter;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C665670Q9d c665670Q9d;
        C19GS c19gs;
        if (SR().zQ2().getDarkMode()) {
            c665670Q9d = new C665670Q9d(new ContextThemeWrapper(layoutInflater.getContext(), R.style.xz));
        } else {
            c665670Q9d = new C665670Q9d(requireContext());
        }
        try {
            ViewTreeLifecycleOwner.set(c665670Q9d, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c665670Q9d, this);
            c665670Q9d.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c665670Q9d;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c665670Q9d;
        }
    }
}
