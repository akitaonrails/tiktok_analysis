package com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel;

import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0QER;
import X.C189200o6;
import X.C1976407og;
import X.C1AF0;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C675480QeY;
import X.C675500Qea;
import X.C675520Qec;
import X.C7740030o;
import X.InterfaceC0148002o;
import X.InterfaceC665370Q7z;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OrderVerticalVM extends AssemViewModel<C675520Qec> {
    public final Gson LL = C7740030o.LIZ().getGson();
    public AnonymousClass0956 LLILLJJLI;
    public C675500Qea LLILLL;
    public InterfaceC665370Q7z LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C675520Qec(0);
    }

    public final String wQ2(JSONObject jSONObject) throws JSONException {
        String strOptString;
        List<Object> list;
        if (jSONObject == null || (strOptString = jSONObject.optString("traffic_source_list")) == null) {
            strOptString = "[]";
        }
        JSONArray jSONArrayLIZ = C1976407og.LIZ(strOptString);
        if (jSONArrayLIZ != null) {
            list = JsonExtKt.toList(jSONArrayLIZ);
        } else {
            list = null;
        }
        String strLIZIZ = "";
        if (list != null) {
            Iterator<Object> it2 = list.iterator();
            while (it2.hasNext()) {
                String string = it2.next().toString();
                if (strLIZIZ.length() == 0) {
                    strLIZIZ = string;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(',');
                    sbLIZ.append(string);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        return strLIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Integer] */
    public final void vQ2(SearchResultParam searchResultParam, JSONObject jSONObject, View view, String str) {
        Object c098200Yq;
        Integer orderSearchRegion;
        C675500Qea c675500Qea = this.LLILLL;
        if (c675500Qea != null) {
            c675500Qea.LJ("request_start");
        }
        C259800zU c259800zU = new C259800zU();
        try {
            C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
            if (searchEnterParam != null && (orderSearchRegion = searchEnterParam.getOrderSearchRegion()) != null) {
                c259800zU.element = Integer.valueOf(orderSearchRegion.intValue());
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
        this.LLILLJJLI = C23250099c.LIZLLL(getAssemVMScope(), null, null, new C675480QeY(jSONObject, this, searchResultParam, c259800zU, str, view, null), 3);
    }
}
