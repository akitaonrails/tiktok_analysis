package com.ss.android.ugc.aweme.ecommerce.base.pdp.innerfeed;

import X.AbstractC316870CbV;
import X.C098200Yq;
import X.C09YA;
import X.C0KBN;
import X.C0PEM;
import X.C1227904rF;
import X.C13BV;
import X.C189200o6;
import X.C1AF0;
import X.C207600r4;
import X.C2189821An6;
import X.C23250099c;
import X.C322820Cl6;
import X.C325620Cpc;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class PdpCreatorVideoListVM extends BaseDetailShareVM<C325620Cpc, C207600r4, Integer> {
    public final C09YA LLILZIL = new C09YA(this, AFwS189S0000000_3.get$arr$(385));
    public String LLILZLL;
    public String LLIZ;
    public Map<String, String> LLIZLLLIL;

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 123;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C325620Cpc(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        super.manualListRefresh();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C322820Cl6(this, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse> r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.innerfeed.PdpCreatorVideoListVM.BQ2(X.05Vn):java.lang.Object");
    }

    public final List<C207600r4> CQ2(List<String> list) {
        Object c098200Yq;
        Aweme aweme;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                C207600r4 c207600r4 = null;
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = (Aweme) C1227904rF.LIZIZ(str, Aweme.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                try {
                    aweme = (Aweme) c098200Yq;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "process aweme data error");
                }
                if (aweme != null) {
                    Map<String, String> map = this.LLIZLLLIL;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            AwemeExtKt.appendMobParam(aweme, entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    aweme = null;
                }
                if (aweme != null) {
                    c207600r4 = new C207600r4(aweme);
                }
                if (c207600r4 != null) {
                    arrayList.add(c207600r4);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C207600r4> c627660Ojc) {
        setState(new AwS583S0100000_4(c627660Ojc, (C627660Ojc<C0KBN>) 68));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn) {
        return onLoadMore(0, interfaceC1364105Vn);
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
                if (Intrinsics.LJFF(((C207600r4) it2.next()).LL.getAid(), str)) {
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
        return ((C207600r4) interfaceC1891350zJl).LL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(int r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<java.lang.Integer>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C323110ClZ
            if (r0 == 0) goto L20
            r4 = r7
            X.0ClZ r4 = (X.C323110ClZ) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L26
            goto L3a
        L20:
            X.0ClZ r4 = new X.0ClZ
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L55
            java.lang.Object r3 = r5.BQ2(r4)     // Catch: java.lang.Exception -> L55
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L55
        L3d:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse r3 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.VideoDetailResponse) r3     // Catch: java.lang.Exception -> L55
            if (r3 == 0) goto L52
            java.util.List<java.lang.String> r0 = r3.videos     // Catch: java.lang.Exception -> L55
        L43:
            java.util.List r1 = r5.CQ2(r0)     // Catch: java.lang.Exception -> L55
            X.0CcB r0 = X.AbstractC316870CbV.LIZ     // Catch: java.lang.Exception -> L55
            r0.getClass()     // Catch: java.lang.Exception -> L55
            X.0Cb8 r0 = new X.0Cb8     // Catch: java.lang.Exception -> L55
            r0.<init>(r1)     // Catch: java.lang.Exception -> L55
            goto L54
        L52:
            r0 = 0
            goto L43
        L54:
            return r0
        L55:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.String r0 = "fetch video detail error"
            X.C1AF0.LJFF(r1, r0)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r0 = new X.0Cb9
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.innerfeed.PdpCreatorVideoListVM.onLoadMore(int, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return onLoadMore(((Number) obj).intValue(), (InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>>) interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer yQ2(int i, C2189821An6 c2189821An6, int i2, boolean z) {
        String productId = c2189821An6.getProductId();
        if (productId != null) {
            this.LLILZLL = productId;
        }
        String str = c2189821An6.getExtra().get("request_body");
        if (str != null) {
            this.LLIZ = str;
        }
        HashMap<String, String> logExtra = c2189821An6.getLogExtra();
        if (logExtra != null) {
            this.LLIZLLLIL = logExtra;
        }
        return 0;
    }
}
