package com.ss.android.ugc.tiktok.pns.activitycenter.searchhistory;

import X.C018G;
import X.C20684815ws;
import X.C2097908Jt;
import X.C2344009Gk;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.ArrayList;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes12.dex */
public final class SearchDeleteAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public Object open(Context context, String str, Bundle bundle) {
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        if (str != null) {
            boolean z4 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String strLIZIZ = C018G.LIZIZ(str, "search_items");
                String strLIZIZ2 = C018G.LIZIZ(str, "delete_all");
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        return Boolean.FALSE;
                    }
                }
                ISearchService iSearchService = (ISearchService) ServiceManager.get().getService(ISearchService.class);
                ArrayList arrayList = new ArrayList();
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    z4 = false;
                }
                if (!z4) {
                    try {
                        JSONArray jSONArray = new JSONArray(strLIZIZ);
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            arrayList.add(C2097908Jt.LIZJ(new Pair("word", JSONArrayProtectorUtils.getString(jSONArray, i))));
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("is_clear_search_blankpage", "-1");
                        c2344009Gk.LJIIIIZZ("enter_from", "activity_center_page");
                        C20684815ws.LJIILLIIL("search_history_deletion_result", c2344009Gk.LIZ);
                        return Boolean.FALSE;
                    }
                }
                boolean zLJJJLIIL = iSearchService.LJJJLIIL(arrayList, arrayList.isEmpty());
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                if (zLJJJLIIL) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk2.LJIIIIZZ("is_clear_search_blankpage", str2);
                c2344009Gk2.LJIIIIZZ("enter_from", "activity_center_page");
                C20684815ws.LJIILLIIL("search_history_deletion_result", c2344009Gk2.LIZ);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
