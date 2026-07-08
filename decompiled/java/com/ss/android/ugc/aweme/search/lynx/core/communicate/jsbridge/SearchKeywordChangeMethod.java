package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.C098200Yq;
import X.C1440005kM;
import X.C189200o6;
import X.C20684815ws;
import X.C2097908Jt;
import X.C588260N5k;
import X.C650090Peh;
import X.C650120Pek;
import X.C798280VTe;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchTabViewModel;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchKeywordChangeMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SearchKeywordChangeMethod() {
    }

    public SearchKeywordChangeMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        NextLiveData<C650120Pek> nextLiveData;
        try {
            try {
                C20684815ws.LJIILLIIL("search_jsb_online_tracker", C2097908Jt.LIZJ(new Pair("jsb_name", "search_keyword_change_legacy")));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (jSONObject != null) {
                String strOptString = jSONObject.optString("enterFrom");
                String strOptString2 = jSONObject.optString("keyword");
                String strOptString3 = jSONObject.optString("type");
                SearchResultParam searchResultParam = new SearchResultParam();
                searchResultParam.setSearchFrom(strOptString);
                searchResultParam.setKeyword(strOptString2);
                C1440005kM.LIZ(new C588260N5k(searchResultParam));
                SearchTabViewModel searchTabViewModel = C650090Peh.LIZ;
                if (searchTabViewModel != null && (nextLiveData = searchTabViewModel.LL) != null) {
                    nextLiveData.setValue(new C650120Pek(strOptString3));
                }
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(new JSONArray());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C798280VTe.LIZ("SearchKeywordChangeMethod", e);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, e.getMessage());
            }
        }
    }
}
