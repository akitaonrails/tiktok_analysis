package com.ss.android.ugc.profile.business.ur.following.ui.managefollow;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C09YA;
import X.C0KBN;
import X.C316640Cb8;
import X.C317290CcB;
import X.C339250DRr;
import X.C452501pT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import com.bytedance.ext_power_list.AssemListViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: loaded from: classes32.dex */
public final class ManageFollowVM extends AssemListViewModel<C339250DRr, ManageFollowItem, ManageFollowCursor> {
    public static final /* synthetic */ int LLILZ = 0;
    public final C01GW LL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(319));
    public final C09YA LLILLJJLI = new C09YA(this, AFwS221S0000000_31.get$arr$(318));
    public ManageFollowInitData LLILLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C339250DRr(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<ManageFollowItem> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 165));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<ManageFollowCursor>> interfaceC1364105Vn) {
        List<ManageFollowItem> list;
        ManageFollowCursor manageFollowCursor;
        ManageFollowInitData manageFollowInitData = this.LLILLL;
        if (manageFollowInitData != null) {
            list = manageFollowInitData.itemList;
        } else {
            list = null;
        }
        if (list == null) {
            return onLoadMore(new ManageFollowCursor(0), interfaceC1364105Vn);
        }
        if (manageFollowInitData != null && manageFollowInitData.hasMore) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            if (manageFollowInitData != null) {
                manageFollowCursor = manageFollowInitData.cursor;
            } else {
                manageFollowCursor = null;
            }
            return C317290CcB.LJ(c317290CcB, null, manageFollowCursor, list, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(list);
    }

    public final void vQ2(boolean z, Set<SimpleUser> set) {
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ITEM item : listListGetAll) {
            if (set != null && set.contains(item.simpleUser)) {
                arrayList.add(item);
            } else {
                arrayList.add(ManageFollowItem.LIZ(item, z, null, false, 62));
            }
        }
        listSetItems(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<com.ss.android.ugc.aweme.profile.model.User>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor r19, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor>> r20) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM.onLoadMore(com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor, X.05Vn):java.lang.Object");
    }
}
