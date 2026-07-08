package com.ss.android.ugc.aweme.vm.publish;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C20612915lH;
import X.C316420Cam;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317120Cbu;
import X.C317130Cbv;
import X.C317150Cbx;
import X.C317290CcB;
import X.C317300CcC;
import X.C317760Ccw;
import X.C325600Cpa;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.model.MentionQueryPaginationParam;
import com.ss.android.ugc.aweme.model.MentionRecommendQueryRequest;
import com.ss.android.ugc.aweme.model.MentionRecommendResponse;
import com.ss.android.ugc.aweme.model.UserListWithPagination;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CollabEditListViewModel extends AssemListViewModel<C325600Cpa, InterfaceC1891350zJl, C317130Cbv> {
    public String LL = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325600Cpa(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 154));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C317130Cbv>> interfaceC1364105Vn) {
        if (this.LL.length() == 0) {
            boolean z = C317120Cbu.LIZ;
            C317120Cbu.LIZIZ = false;
            C317120Cbu.LIZ = false;
            C317120Cbu.LIZJ.clear();
            return vQ2(true, null);
        }
        return wQ2(true);
    }

    public final AbstractC316870CbV<C317130Cbv> wQ2(boolean z) {
        ArrayList arrayList;
        Integer num;
        String str = this.LL;
        if (z) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            List<ITEM> listListGetAll = listGetAll();
            if (listListGetAll != 0) {
                for (ITEM item : listListGetAll) {
                    if (item instanceof C317150Cbx) {
                        arrayList.add(((C317150Cbx) item).LL.getUid());
                    }
                }
            }
        }
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        } else {
            num = null;
        }
        try {
            SearchUserSugResponse searchUserSugResponseLIZJ = ((ISearchUserService) C317300CcC.LIZIZ.getValue()).LIZJ(new C317760Ccw(10L, str, "at_user", arrayList, num));
            boolean z2 = C317120Cbu.LIZ;
            List listLIZJ = C317120Cbu.LIZJ(z, this.LL, searchUserSugResponseLIZJ);
            if (searchUserSugResponseLIZJ.LIZ()) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Boolean bool = Boolean.FALSE;
                return C317290CcB.LJ(c317290CcB, null, new C317130Cbv(new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool), new Pair(0L, bool)), listLIZJ, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(listLIZJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C317130Cbv c317130Cbv, InterfaceC1364105Vn<? super AbstractC316870CbV<C317130Cbv>> interfaceC1364105Vn) {
        C317130Cbv c317130Cbv2 = c317130Cbv;
        if (this.LL.length() == 0) {
            return vQ2(false, c317130Cbv2);
        }
        return wQ2(false);
    }

    public final AbstractC316870CbV<C317130Cbv> vQ2(boolean z, C317130Cbv c317130Cbv) {
        Object obj;
        MentionRecommendQueryRequest mentionRecommendQueryRequestLIZ;
        UserListWithPagination userListWithPagination;
        List<User> list;
        UserListWithPagination userListWithPagination2;
        List<User> list2;
        if (!z && c317130Cbv != null) {
            obj = null;
            mentionRecommendQueryRequestLIZ = C316420Cam.LIZ(10L, new MentionQueryPaginationParam(c317130Cbv.LIZ.getSecond().booleanValue(), c317130Cbv.LIZ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZIZ.getSecond().booleanValue(), c317130Cbv.LIZIZ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZJ.getSecond().booleanValue(), c317130Cbv.LIZJ.getFirst().longValue()), new MentionQueryPaginationParam(c317130Cbv.LIZLLL.getSecond().booleanValue(), c317130Cbv.LIZLLL.getFirst().longValue()), null, null, 0L, 224);
            if (mentionRecommendQueryRequestLIZ == null) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Exception exc = new Exception("Create mention recommend request failed");
                c317290CcB.getClass();
                return new C316650Cb9(exc);
            }
        } else {
            obj = null;
            mentionRecommendQueryRequestLIZ = C316420Cam.LIZ(10L, null, null, null, null, null, null, 0L, 254);
            if (mentionRecommendQueryRequestLIZ == null) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                Exception exc2 = new Exception("Create mention recommend request failed");
                c317290CcB2.getClass();
                return new C316650Cb9(exc2);
            }
        }
        try {
            MentionRecommendResponse mentionRecommendResponseLJFF = C20612915lH.LIZIZ.LJFF(mentionRecommendQueryRequestLIZ);
            List listLIZIZ = C317120Cbu.LIZIZ(z, mentionRecommendResponseLJFF);
            if (z) {
                UserListWithPagination userListWithPagination3 = mentionRecommendResponseLJFF.friendUserList;
                if (userListWithPagination3 != null) {
                    if (!userListWithPagination3.hasMore) {
                    }
                    return C317290CcB.LJ(AbstractC316870CbV.LIZ, obj, C317120Cbu.LIZ(mentionRecommendResponseLJFF), listLIZIZ, 1);
                }
                UserListWithPagination userListWithPagination4 = mentionRecommendResponseLJFF.followingUserList;
                if ((userListWithPagination4 != null && userListWithPagination4.hasMore) || !C317120Cbu.LIZ) {
                    return C317290CcB.LJ(AbstractC316870CbV.LIZ, obj, C317120Cbu.LIZ(mentionRecommendResponseLJFF), listLIZIZ, 1);
                }
                AbstractC316870CbV.LIZ.getClass();
                return new C316640Cb8(listLIZIZ);
            }
            UserListWithPagination userListWithPagination5 = mentionRecommendResponseLJFF.friendUserList;
            if ((userListWithPagination5 != null && (list2 = userListWithPagination5.userList) != null && (!list2.isEmpty())) || ((userListWithPagination = mentionRecommendResponseLJFF.friendUserList) != null && (list = userListWithPagination.userList) != null && list.isEmpty() && (userListWithPagination2 = mentionRecommendResponseLJFF.followingUserList) != null && userListWithPagination2.hasMore)) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, obj, C317120Cbu.LIZ(mentionRecommendResponseLJFF), listLIZIZ, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(listLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC316870CbV.LIZ.getClass();
            return new C316650Cb9(e);
        }
    }
}
