package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0QER;
import X.C189200o6;
import X.C1AF0;
import X.C23250099c;
import X.C675490QeZ;
import X.C675500Qea;
import X.C675540Qee;
import X.C7740030o;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class RoomProductsVerticalVM extends AssemViewModel<C675540Qee> {
    public final Gson LL = C7740030o.LIZ().getGson();
    public AnonymousClass0956 LLILLJJLI;
    public C675500Qea LLILLL;
    public InterfaceC665370Q7z LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C675540Qee(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String wQ2(org.json.JSONObject r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            if (r6 == 0) goto Lc
            java.lang.String r0 = "traffic_source_list"
            java.lang.String r0 = r6.optString(r0)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto Le
        Lc:
            java.lang.String r0 = "[]"
        Le:
            org.json.JSONArray r0 = X.C1976407og.LIZ(r0)     // Catch: java.lang.Throwable -> L57
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.List r0 = com.ss.android.ugc.effectmanager.common.utils.JsonExtKt.toList(r0)     // Catch: java.lang.Throwable -> L57
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 == 0) goto L53
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L57
        L21:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L57
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L57
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            if (r0 == 0) goto L3d
            r4 = r2
            goto L21
        L3d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L57
            r1.append(r4)     // Catch: java.lang.Throwable -> L57
            r0 = 44
            r1.append(r0)     // Catch: java.lang.Throwable -> L57
            r1.append(r2)     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L57
            goto L21
        L51:
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L57
        L53:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L57
            return r4
        L57:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.RoomProductsVerticalVM.wQ2(org.json.JSONObject):java.lang.String");
    }

    public final void vQ2(SearchResultParam searchResultParam, JSONObject jSONObject) {
        Object c098200Yq;
        Integer orderSearchRegion;
        C675500Qea c675500Qea = this.LLILLL;
        if (c675500Qea != null) {
            c675500Qea.LJ("request_start");
        }
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            searchEnterParam.getEcSearchEntranceData();
        }
        try {
            C0QER searchEnterParam2 = searchResultParam.getSearchEnterParam();
            if (searchEnterParam2 != null && (orderSearchRegion = searchEnterParam2.getOrderSearchRegion()) != null) {
                orderSearchRegion.intValue();
                c098200Yq = Unit.LIZ;
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLILLJJLI = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C675490QeZ(jSONObject, this, searchResultParam, null), 3);
    }
}
