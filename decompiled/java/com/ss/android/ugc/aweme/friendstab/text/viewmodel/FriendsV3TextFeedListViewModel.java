package com.ss.android.ugc.aweme.friendstab.text.viewmodel;

import X.AbstractC1588120rQg;
import X.AbstractC316870CbV;
import X.C0SDD;
import X.C1361200lWg;
import X.InterfaceC1361290lWp;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.friendstab.repo.FriendsV3FeedResponse;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsV3TextFeedListViewModel extends FriendsV3FeedListViewModel {
    public String LLJILLL;
    public boolean LLJJ;

    public final C0SDD OQ2() {
        InterfaceC1361290lWp interfaceC1361290lWp;
        Object next;
        List<ITEM> listListGetAll = listGetAll();
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next instanceof C0SDD) {
                    break;
                }
            }
            interfaceC1361290lWp = (InterfaceC1361290lWp) next;
        } else {
            interfaceC1361290lWp = null;
        }
        if (interfaceC1361290lWp instanceof C0SDD) {
            return (C0SDD) interfaceC1361290lWp;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object PQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel.PQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object QQ2(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r9) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel.QQ2(X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<AbstractC1588120rQg>> interfaceC1364105Vn) {
        if (this.LLJJ) {
            return QQ2(interfaceC1364105Vn);
        }
        return PQ2(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel
    /* JADX INFO: renamed from: FQ2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.AbstractC1588120rQg r9, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.AbstractC1588120rQg>> r10) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel.onLoadMore(X.0rQg, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel, com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(AbstractC1588120rQg abstractC1588120rQg, InterfaceC1364105Vn<? super AbstractC316870CbV<AbstractC1588120rQg>> interfaceC1364105Vn) {
        return onLoadMore(abstractC1588120rQg, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel
    public final List wQ2(int i, FriendsV3FeedResponse friendsV3FeedResponse) {
        List listWQ2 = super.wQ2(i, friendsV3FeedResponse);
        if (listWQ2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listWQ2) {
                if (obj instanceof C1361200lWg) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }
}
