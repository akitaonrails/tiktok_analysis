package com.ss.android.ugc.tiktok.addyours.ui.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C098200Yq;
import X.C0KBN;
import X.C13BV;
import X.C15438062q;
import X.C1720106oR;
import X.C189200o6;
import X.C1935107i1;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C317650Ccl;
import X.C317760Ccw;
import X.C325610Cpb;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchResultListViewModel extends AssemListViewModel<C325610Cpb, C317650Ccl, Boolean> {
    public final C01GW LL = C1935107i1.LIZ(AFwS190S0000000_4.get$arr$(2304));
    public String LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325610Cpb(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C317650Ccl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 196));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        return wQ2(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public final AbstractC316870CbV<Boolean> wQ2(boolean z) {
        ?? arrayList;
        String str = this.LLILLJJLI;
        if (str == null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            c317290CcB.getClass();
            return new C316640Cb8(c13bv);
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start fetch for keyword: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            SearchUserSugResponse searchUserSugResponseLIZJ = ((ISearchUserService) this.LL.getValue()).LIZJ(vQ2(str, z));
            List<? extends SearchSugEntity> list = searchUserSugResponseLIZJ.sugList;
            if (list != null) {
                arrayList = new ArrayList();
                for (SearchSugEntity searchSugEntity : list) {
                    String userId = searchSugEntity.sugExtraInfo.getUserId();
                    if (userId != null) {
                        arrayList.add(new C317650Ccl(new UserInvitee(userId, searchSugEntity.sugExtraInfo.getUserNickname(), searchSugEntity.sugExtraInfo.getUserAvatarUri(), null, Integer.valueOf(searchSugEntity.sugExtraInfo.getFollowStatus()), -1, false, Intrinsics.LJFF(searchSugEntity.sugExtraInfo.getUserRelationType(), "friends")), false, "search"));
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch done items: ");
            sbLIZ2.append(arrayList.size());
            C1720106oR.LJI("SearchResultVM", C2188811AlT.LIZIZ(sbLIZ2));
            if (searchUserSugResponseLIZJ.LIZ()) {
                return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, Boolean.TRUE, arrayList, 1);
            }
            AbstractC316870CbV.LIZ.getClass();
            return new C316640Cb8(arrayList);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Object c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C317290CcB c317290CcB2 = AbstractC316870CbV.LIZ;
                RuntimeException runtimeException = new RuntimeException(thM5exceptionOrNullimpl);
                c317290CcB2.getClass();
                c098200Yq = new C316650Cb9(runtimeException);
            }
            return (AbstractC316870CbV) c098200Yq;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn) {
        bool.booleanValue();
        return wQ2(false);
    }

    public final C317760Ccw vQ2(String str, boolean z) {
        ArrayList arrayList;
        List<ITEM> listListGetAll;
        Integer num = null;
        if (!z && (listListGetAll = listGetAll()) != 0) {
            arrayList = new ArrayList(C15438062q.LJIJJ(listListGetAll, 10));
            Iterator it2 = listListGetAll.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C317650Ccl) it2.next()).LL.getUid());
            }
        } else {
            arrayList = null;
        }
        if (ComplianceServiceProvider.LJI().LJJII()) {
            num = 1;
        }
        return new C317760Ccw(8L, str, "at_user", arrayList, num);
    }
}
