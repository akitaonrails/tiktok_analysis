package com.ss.android.ugc.aweme.poi.recommendfeature.list.vm;

import X.AbstractC316870CbV;
import X.C1158150gFB;
import X.C1165730gRP;
import X.C1165810gRX;
import X.C1180160gog;
import X.C1183240gte;
import X.C13BV;
import X.C15438062q;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C317290CcB;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1181010gq3;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListItem;
import com.ss.android.ugc.aweme.poi.recommendfeature.list.component.list.PoiRecommendFeatureListModule;
import com.ss.android.ugc.aweme.slash.data.SlashEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiRecommendFeatureListViewModel extends AssemListViewModel<C1165810gRX, InterfaceC1891350zJl, C1158150gFB> {
    public InterfaceC1181010gq3 LL;
    public C1183240gte LLILLJJLI;
    public List<SlashEvent> LLILLL;
    public PoiRecommendFeatureListModule LLILZ;
    public String LLILZIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1165810gRX(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2() {
        /*
            r6 = this;
            java.lang.String r0 = r6.LLILZIL
            if (r0 != 0) goto L7b
            java.util.List<com.ss.android.ugc.aweme.slash.data.SlashEvent> r0 = r6.LLILLL
            if (r0 == 0) goto L7b
            r4 = 0
            X.04rF r5 = X.C1227904rF.LIZ     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        Lf:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L62
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEvent r0 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.getName()     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "load_more"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto Lf
        L28:
            com.ss.android.ugc.aweme.slash.data.SlashEvent r2 = (com.ss.android.ugc.aweme.slash.data.SlashEvent) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            java.util.List r0 = r2.getActions()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L60
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L64
        L36:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L5e
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L64
            r0 = r2
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r0 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r0     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r0.type     // Catch: java.lang.Throwable -> L64
            java.lang.String r0 = "request"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L36
        L4d:
            com.ss.android.ugc.aweme.slash.data.SlashEventAction r2 = (com.ss.android.ugc.aweme.slash.data.SlashEventAction) r2     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L60
            com.ss.android.ugc.aweme.slash.data.SlashParam r0 = r2.slashParam     // Catch: java.lang.Throwable -> L64
        L53:
            r5.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = X.C1227904rF.LJI(r0)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L64
            goto L70
        L5e:
            r2 = r4
            goto L4d
        L60:
            r0 = r4
            goto L53
        L62:
            r2 = r4
            goto L28
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L70:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L77
            r4 = r1
        L77:
            java.lang.String r4 = (java.lang.String) r4
            r6.LLILZIL = r4
        L7b:
            java.lang.String r0 = r6.LLILZIL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel.vQ2():java.lang.String");
    }

    public PoiRecommendFeatureListViewModel() {
        new C1158150gFB(CardStruct.IStatusCode.DEFAULT, false);
    }

    public static AbstractC316870CbV xQ2(PoiRecommendFeatureListModule poiRecommendFeatureListModule) {
        List<PoiRecommendFeatureListItem> items = poiRecommendFeatureListModule.getItems();
        if (items == null) {
            items = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
        Iterator<PoiRecommendFeatureListItem> it2 = items.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1180160gog(it2.next()));
        }
        String nextCursor = poiRecommendFeatureListModule.getNextCursor();
        if (nextCursor == null) {
            nextCursor = "";
        }
        C1158150gFB c1158150gFB = new C1158150gFB(nextCursor, Intrinsics.LJFF(poiRecommendFeatureListModule.getHasMore(), Boolean.TRUE));
        if (c1158150gFB.hasMore) {
            return C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c1158150gFB, arrayList, 1);
        }
        AbstractC316870CbV.LIZ.getClass();
        return new C316640Cb8(arrayList);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 445));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<C1158150gFB>> interfaceC1364105Vn) {
        PoiRecommendFeatureListModule poiRecommendFeatureListModule = this.LLILZ;
        if (poiRecommendFeatureListModule == null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception("initial module is null");
            c317290CcB.getClass();
            return new C316650Cb9(exc);
        }
        return xQ2(poiRecommendFeatureListModule);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: wQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1158150gFB r14, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1158150gFB>> r15) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel.onLoadMore(X.0gFB, X.05Vn):java.lang.Object");
    }
}
