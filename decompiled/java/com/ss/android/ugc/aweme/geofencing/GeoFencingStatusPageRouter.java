package com.ss.android.ugc.aweme.geofencing;

import X.C0FNT;
import X.C10HT;
import X.C1227904rF;
import X.C13BV;
import X.C13LP;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.geofencing.model.TranslatedRegion;
import com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class GeoFencingStatusPageRouter implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        String string;
        List listLLIIII;
        String string2;
        Activity activityLIZ = null;
        if (bundle != null) {
            string = bundle.getString("isEditable");
        } else {
            string = null;
        }
        boolean zLJFF = Intrinsics.LJFF(string, CardStruct.IStatusCode.DEFAULT);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (bundle != null) {
                string2 = bundle.getString("selectedRegionListString");
            } else {
                string2 = null;
            }
            c1227904rF.getClass();
            Object[] objArr = (Object[]) C1227904rF.LIZIZ(string2, String[].class);
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                String str2 = (String) obj;
                arrayList.add(new TranslatedRegion(str2, str2, false));
            }
            listLLIIII = C13LP.LLIIII(arrayList);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            listLLIIII = C13BV.INSTANCE;
        }
        String str3 = GeoFencingStatusActivity._pnsPageId;
        if (context != null) {
            activityLIZ = C0FNT.LIZ(context);
        }
        C10HT.LIZ(activityLIZ, listLLIIII, zLJFF);
        return Boolean.TRUE;
    }
}
