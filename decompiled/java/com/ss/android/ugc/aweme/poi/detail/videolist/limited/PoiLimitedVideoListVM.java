package com.ss.android.ugc.aweme.poi.detail.videolist.limited;

import X.AbstractC316870CbV;
import X.C0PEM;
import X.C1186760gzK;
import X.C1187510h0X;
import X.C1187520h0Y;
import X.C1187600h0g;
import X.C13BV;
import X.C2189821An6;
import X.C23250099c;
import X.C322890ClD;
import X.C322900ClE;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedVideoListVM extends BaseDetailShareVM<C1187520h0Y, InterfaceC1891350zJl, C1187510h0X> {
    public PoiListApi.PoiMergedListResponse LLILZLL;
    public PoiDetailVideoListModel LLIZ;
    public PoiDetailVideoListModel LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public Map<String, EventModel> LLJIJIL;
    public String LLJILJIL;
    public InterfaceC1181010gq3 LLJILJILJ;
    public String LLJILLL;
    public C1187510h0X LLILZIL = new C1187510h0X(0, 0, 0, 1, 1);
    public final List<Aweme> LLJJ = new ArrayList();

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 50;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1187520h0Y(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322890ClD(this, null), 2);
    }

    public final List<C1187600h0g> BQ2(PoiDetailVideoListModel poiDetailVideoListModel) {
        List<C1186760gzK> list;
        String str = this.LLJ;
        if (str == null) {
            return C13BV.INSTANCE;
        }
        if (poiDetailVideoListModel != null && (list = poiDetailVideoListModel.dataList) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1186760gzK> it2 = list.iterator();
            while (it2.hasNext()) {
                Aweme aweme = it2.next().LIZ;
                if (aweme != null) {
                    aweme.setLogPbBean(poiDetailVideoListModel.logPb);
                    arrayList.add(new C1187600h0g(str, aweme, 50002, 0, 24));
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C1187510h0X c1187510h0X = (C1187510h0X) obj;
        super.manualListLoadMore(c1187510h0X);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322900ClE(this, c1187510h0X, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS384S0200000_18(this, (PoiLimitedVideoListVM) c627660Ojc, (C627660Ojc<InterfaceC1891350zJl>) 108));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1187510h0X>> interfaceC1364105Vn) {
        C1187510h0X c1187510h0X = new C1187510h0X(0L, 0L, 0L, 1, 1);
        this.LLILZIL = c1187510h0X;
        return onLoadMore(c1187510h0X, interfaceC1364105Vn);
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
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                if ((interfaceC1891350zJl instanceof C1187600h0g) && Intrinsics.LJFF(((C1187600h0g) interfaceC1891350zJl).LLILLJJLI.getAid(), str)) {
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
        if (interfaceC1891350zJl instanceof C1187600h0g) {
            return ((C1187600h0g) interfaceC1891350zJl).LLILLJJLI;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.C1187510h0X r25, X.InterfaceC1364105Vn<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM.CQ2(X.0h0X, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: DQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1187510h0X r15, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1187510h0X>> r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.videolist.limited.PoiLimitedVideoListVM.onLoadMore(X.0h0X, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C1187510h0X yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLILZIL;
    }
}
