package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C0QEE;
import X.C0QF6;
import X.C0QPJ;
import X.C1051660dTQ;
import X.C13BV;
import X.C13LP;
import X.C1AF0;
import X.C663340Q0e;
import X.C798280VTe;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class DeleteSearchHistoryMethod extends BaseBridgeMethod {
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

    public DeleteSearchHistoryMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "deleteSearchHistory";
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    public final JSONObject getHistory(C0QF6 c0qf6) throws JSONException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0qf6.LIZIZ());
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory : C13LP.LL(arrayList, 20)) {
            if (searchHistory != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("word", searchHistory.keyword);
                jSONArray.put(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("history_list", jSONArray);
            return jSONObject2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "delete_history_json_err");
            return jSONObject2;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "type");
            C0QF6 c0qf6LJIJI = C0QPJ.LJIJI(null);
            if (Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT)) {
                C0QEE c0qee = C0QEE.LIZ;
                C13BV c13bv = C13BV.INSTANCE;
                c0qee.getClass();
                C0QEE.LIZJ(c13bv, true, null, "del_all_jsb");
                c0qf6LJIJI.LJIIIIZZ();
                interfaceC1019840ce6.onSuccess(getHistory(c0qf6LJIJI));
                return;
            }
            if (Intrinsics.LJFF(string, "1")) {
                String string2 = JSONObjectProtectorUtils.getString(jSONObject, "keyword");
                C0QEE c0qee2 = C0QEE.LIZ;
                List listSingletonList = Collections.singletonList(string2);
                c0qee2.getClass();
                C0QEE.LIZJ(listSingletonList, false, null, "del_jsb");
                c0qf6LJIJI.LJIIJ(new SearchHistory(string2, 0), "del_jsb_cur");
                interfaceC1019840ce6.onSuccess(getHistory(c0qf6LJIJI));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "delete_history_jsb_err");
            C798280VTe.LIZ("DeleteSearchHistoryMethod", e);
            interfaceC1019840ce6.LIZ(-1, e.getMessage());
        }
    }
}
