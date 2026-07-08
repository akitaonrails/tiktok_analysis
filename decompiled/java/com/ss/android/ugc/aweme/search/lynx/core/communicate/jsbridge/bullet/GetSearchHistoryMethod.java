package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C0QPJ;
import X.C1051660dTQ;
import X.C444200HbO;
import X.C663340Q0e;
import X.C798280VTe;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class GetSearchHistoryMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final C663340Q0e helper;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public GetSearchHistoryMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getSearchHistory";
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        try {
            List<SearchHistory> listLIZIZ = C0QPJ.LJIJI(null).LIZIZ();
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory : (ArrayList) C444200HbO.LIZJ(listLIZIZ)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject2);
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("history_list", jSONArray);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            interfaceC1019840ce6.onSuccess(jSONObject3);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C798280VTe.LIZ("GetSearchHistoryMethod", e2);
            interfaceC1019840ce6.LIZ(0, e2.getMessage());
        }
    }
}
