package com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.fragment;

import X.C098200Yq;
import X.C0PEM;
import X.C1227904rF;
import X.C1556700qc0;
import X.C1710960uco;
import X.C1711440uda;
import X.C1711500udg;
import X.C1722320uv8;
import X.C189200o6;
import X.C23250099c;
import X.C786410Ut5;
import X.C817503Hh;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.common.autofill.core.AutofillApi;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class AutofillViewModel extends AssemViewModel<C1556700qc0> {
    public C1710960uco LL;

    public static String wQ2() throws JSONException {
        HashMap<String, Object> mapLJJLIIIJLJLI;
        JSONObject jSONObjectLIZJ = C1722320uv8.LIZJ("auto_fill", null);
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        if (iProbeService != null && (mapLJJLIIIJLJLI = iProbeService.LJJLIIIJLJLI()) != null) {
            for (Map.Entry<String, Object> entry : mapLJJLIIIJLJLI.entrySet()) {
                if (jSONObjectLIZJ.isNull(entry.getKey())) {
                    jSONObjectLIZJ.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return C786410Ut5.J3(jSONObjectLIZJ);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1556700qc0(0);
    }

    public static AutofillApi.CardNumberItem xQ2(String str) {
        boolean z;
        Object c098200Yq;
        AutofillApi.CardNumberItem cardNumberItem;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Type type = new TypeToken<AutofillApi.CardNumberItem>() { // from class: X.0udY
            }.getType();
            C1227904rF.LIZ.getClass();
            cardNumberItem = (AutofillApi.CardNumberItem) C1227904rF.LIZJ(str, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (Intrinsics.LJFF(cardNumberItem.resultCode, "success")) {
            C1711440uda.LIZ.getClass();
            cardNumberItem.LIZ = (AutofillApi.AutoFillInfo) C1227904rF.LIZJ(C1711440uda.LIZIZ.LIZ(cardNumberItem.fillInfo), new TypeToken<AutofillApi.AutoFillInfo>() { // from class: X.0udZ
            }.getType());
            return cardNumberItem;
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        return null;
    }

    public final void vQ2(String str, String str2, String str3) {
        withState(new AwS605S0100000_26(this, 363));
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1711500udg(this, str, str2, str3, null), 2);
    }
}
