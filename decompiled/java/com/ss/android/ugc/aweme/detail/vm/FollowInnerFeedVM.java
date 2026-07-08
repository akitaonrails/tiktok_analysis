package com.ss.android.ugc.aweme.detail.vm;

import X.AbstractC316870CbV;
import X.C01GW;
import X.C0PLT;
import X.C13BV;
import X.C15438062q;
import X.C2189821An6;
import X.C317290CcB;
import X.C452501pT;
import X.C607720NsY;
import X.C607730NsZ;
import X.C607740Nsa;
import X.C612580O0y;
import X.C623470Ocr;
import X.C627660Ojc;
import X.C638880P4c;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class FollowInnerFeedVM extends BaseDetailShareVM<C612580O0y, C607730NsZ, C607740Nsa> {
    public boolean LLIZLLLIL;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(77));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(78));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(76));
    public long LLJ = -1;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 125;
    }

    public final ConcurrentHashMap<String, C607720NsY> BQ2() {
        return (ConcurrentHashMap) this.LLILZIL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C612580O0y((String) null, 3);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJI(new C638880P4c(this, 0));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJIILL(new C638880P4c(this, 1));
        }
    }

    public static List DQ2(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = ((C0PLT) it2.next()).getAweme();
                if (aweme != null) {
                    arrayList.add(new C607730NsZ(aweme));
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C607730NsZ> c627660Ojc) {
        setState(new AwS588S0100000_9(c627660Ojc, (C627660Ojc<C623470Ocr>) 80));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C607740Nsa>> interfaceC1364105Vn) {
        List<FollowFeed> list;
        ArrayList arrayList;
        String str = ((C612580O0y) getState()).LL;
        if (str == null) {
            return C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
        }
        C607720NsY c607720NsY = BQ2().get(str);
        if (c607720NsY != null && (list = c607720NsY.LIZ) != null && (!list.isEmpty()) && 1 != 0) {
            List listDQ2 = DQ2(c607720NsY.LIZ);
            C607740Nsa c607740Nsa = c607720NsY.LIZIZ;
            List<FollowFeed> list2 = c607720NsY.LIZ;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<FollowFeed> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getAweme().getAid());
                }
            } else {
                arrayList = null;
            }
            listDQ2.size();
            Objects.toString(c607740Nsa);
            Objects.toString(arrayList);
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c607740Nsa, listDQ2, 1);
        }
        return onLoadMore(new C607740Nsa(0), interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int vQ2(String str) {
        List<ITEM> listListGetAll = listGetAll();
        int i = -1;
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((C607730NsZ) it2.next()).LLILLJJLI.getAid(), str)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme xQ2(InterfaceC1891350zJl interfaceC1891350zJl) {
        return ((C607730NsZ) interfaceC1891350zJl).LLILLJJLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C607740Nsa r18, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C607740Nsa>> r19) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM.onLoadMore(X.0Nsa, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C607740Nsa yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        C607740Nsa c607740Nsa;
        String str = ((C612580O0y) getState()).LL;
        if (str == null) {
            return new C607740Nsa(0);
        }
        C607720NsY c607720NsY = BQ2().get(str);
        if (c607720NsY != null && (c607740Nsa = c607720NsY.LIZIZ) != null) {
            return c607740Nsa;
        }
        return new C607740Nsa(0);
    }
}
