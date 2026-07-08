package com.ss.android.ugc.aweme.poi.detail.ai;

import X.AbstractC316870CbV;
import X.C0KBN;
import X.C0PEM;
import X.C208800rG;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2286608xc;
import X.C23250099c;
import X.C2365509Or;
import X.C322830Cl7;
import X.C322840Cl8;
import X.C325810Cpv;
import X.C325840Cpy;
import X.C325860Cq0;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PoiAiSummaryListSharedVM extends BaseDetailShareVM<C325810Cpv, InterfaceC1891350zJl, C325840Cpy> {
    public C325860Cq0 LLILZIL;
    public final CopyOnWriteArrayList<C208800rG> LLILZLL = new CopyOnWriteArrayList<>();
    public C325840Cpy LLIZ = new C325840Cpy(null, null, null, null, null, null);

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 47;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325810Cpv(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322830Cl7(this, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        C325840Cpy c325840Cpy = (C325840Cpy) obj;
        super.manualListLoadMore(c325840Cpy);
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322840Cl8(this, c325840Cpy, null), 2);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 100));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C325840Cpy>> interfaceC1364105Vn) {
        String str;
        String str2;
        String str3;
        C325860Cq0 c325860Cq0 = this.LLILZIL;
        List<String> list = null;
        if (c325860Cq0 != null) {
            str = c325860Cq0.LIZIZ;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        if (c325860Cq0 == null || (str2 = c325860Cq0.LIZJ) == null) {
            str2 = "";
        }
        if (c325860Cq0 == null || (str3 = c325860Cq0.LIZ) == null) {
            str3 = "";
        }
        if (c325860Cq0 != null) {
            list = c325860Cq0.LIZLLL;
            String str5 = c325860Cq0.LJ;
            if (str5 != null) {
                str4 = str5;
            }
        }
        C325840Cpy c325840Cpy = new C325840Cpy(str, str2, C2286608xc.LJ(1), str3, str4, list);
        this.LLIZ = c325840Cpy;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh: ");
        sbLIZ.append(C2365509Or.LJ(c325840Cpy));
        C2188811AlT.LIZIZ(sbLIZ);
        return onLoadMore(c325840Cpy, interfaceC1364105Vn);
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
                if ((interfaceC1891350zJl instanceof C208800rG) && Intrinsics.LJFF(((C208800rG) interfaceC1891350zJl).LL.getAid(), str)) {
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
        if (interfaceC1891350zJl instanceof C208800rG) {
            return ((C208800rG) interfaceC1891350zJl).LL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final List zQ2(InterfaceC636340Oxc interfaceC636340Oxc) {
        return this.LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: CQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C325840Cpy r12, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C325840Cpy>> r13) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM.onLoadMore(X.0Cpy, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:45:0x00a1, B:46:0x00a4, B:48:0x00a8, B:51:0x00ae, B:52:0x00b1, B:55:0x00b6, B:57:0x00ba), top: B:72:0x00a1 }] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.020e, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r15v3, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r15v4, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C325840Cpy r13, X.C2641010l r14, X.C5182020e r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM.BQ2(X.0Cpy, X.010l, X.020e, X.05Vn):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final C325840Cpy yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        return this.LLIZ;
    }
}
