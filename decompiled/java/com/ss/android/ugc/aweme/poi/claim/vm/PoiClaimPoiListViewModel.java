package com.ss.android.ugc.aweme.poi.claim.vm;

import X.C09R9;
import X.C1165730gRP;
import X.C1197690hGx;
import X.C1197710hGz;
import X.C1197720hH0;
import X.C1199110hJF;
import X.C1199140hJI;
import X.C1199690hKB;
import X.C1200050hKl;
import X.C1200090hKp;
import X.C1200100hKq;
import X.C1200110hKr;
import X.C1200780hLw;
import X.C13LE;
import X.C2188811AlT;
import X.C627660Ojc;
import X.InterfaceC0148002o;
import X.InterfaceC1199740hKG;
import X.InterfaceC1364105Vn;
import X.InterfaceC1891350zJl;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiClaimPoiListViewModel extends AssemListViewModel<C1200090hKp, C1200050hKl, C1200100hKq> {
    public double LLILLL;
    public double LLILZ;
    public boolean LLILZIL;
    public C1200780hLw LLILZLL;
    public C1197690hGx LLIZ;
    public C1197720hH0 LLIZLLLIL;
    public long LLJ;
    public String LLJI;
    public C1200110hKr LLJILJIL;
    public final C09R9 LL = new C09R9(this, C13LE.LIZ(C1199690hKB.class));
    public final List<InterfaceC1891350zJl> LLILLJJLI = Collections.synchronizedList(new ArrayList());
    public final C1199110hJF LLJIJIL = new C1199110hJF();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1200090hKp(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C627660Ojc<C1200050hKl> c627660Ojc) {
        setState(new AwS597S0100000_18(c627660Ojc, (C627660Ojc<C1165730gRP>) 241));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1200100hKq>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1200070hKn
            if (r0 == 0) goto L20
            r5 = r7
            X.0hKn r5 = (X.C1200070hKn) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L4c
        L20:
            X.0hKn r5 = new X.0hKn
            r5.<init>(r6, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r4)
            java.util.List<X.0zJl> r0 = r6.LLILLJJLI
            r0.clear()
            X.002o r0 = r6.getState()     // Catch: java.lang.Exception -> L52
            X.0hKp r0 = (X.C1200090hKp) r0     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = r0.LL     // Catch: java.lang.Exception -> L52
            X.0hKq r0 = new X.0hKq     // Catch: java.lang.Exception -> L52
            r0.<init>(r2, r1)     // Catch: java.lang.Exception -> L52
            r5.LLILLL = r2     // Catch: java.lang.Exception -> L52
            java.lang.Object r4 = r6.yQ2(r0, r5)     // Catch: java.lang.Exception -> L52
            if (r4 != r3) goto L4f
            return r3
        L4c:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L52
        L4f:
            X.0CbV r4 = (X.AbstractC316870CbV) r4     // Catch: java.lang.Exception -> L52
            return r4
        L52:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r4 = new X.0Cb9
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel.onRefresh(X.05Vn):java.lang.Object");
    }

    public final void wQ2(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSearchSessionFinish sessionEndMethod=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1197690hGx c1197690hGx = this.LLIZ;
        if (c1197690hGx != null) {
            C1197710hGz.LIZ.getClass();
            C1197710hGz.LIZ(c1197690hGx, "claim_poi_page", null, str);
            c1197690hGx.LIZLLL = true;
        }
        this.LLIZ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* JADX INFO: renamed from: vQ2, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C1200100hKq r6, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1200100hKq>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1200080hKo
            if (r0 == 0) goto L20
            r4 = r7
            X.0hKo r4 = (X.C1200080hKo) r4
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
            X.0hKo r4 = new X.0hKo
            r4.<init>(r5, r7)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L40
            java.lang.Object r3 = r5.yQ2(r6, r4)     // Catch: java.lang.Exception -> L40
            if (r3 != r2) goto L3d
            return r2
        L3a:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L40
        L3d:
            X.0CbV r3 = (X.AbstractC316870CbV) r3     // Catch: java.lang.Exception -> L40
            return r3
        L40:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0CcB r0 = X.AbstractC316870CbV.LIZ
            r0.getClass()
            X.0Cb9 r3 = new X.0Cb9
            r3.<init>(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel.onLoadMore(X.0hKq, X.05Vn):java.lang.Object");
    }

    public final Object xQ2(C1199140hJI c1199140hJI, InterfaceC1364105Vn<? super PoiSearchApi.PoiSearchResultWrapper> interfaceC1364105Vn) {
        String str = c1199140hJI.LJ;
        if (str != null && str.length() != 0) {
            return ((InterfaceC1199740hKG) this.LL.getValue().getOperator()).LJJJJIZL(c1199140hJI, interfaceC1364105Vn);
        }
        return ((InterfaceC1199740hKG) this.LL.getValue().getOperator()).LLLFFI(c1199140hJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Type inference failed for: r6v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5, types: [T] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.C1200100hKq r52, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1200100hKq>> r53) {
        /*
            Method dump skipped, instruction units count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel.yQ2(X.0hKq, X.05Vn):java.lang.Object");
    }
}
