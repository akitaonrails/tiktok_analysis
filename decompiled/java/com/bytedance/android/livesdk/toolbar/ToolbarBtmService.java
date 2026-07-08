package com.bytedance.android.livesdk.toolbar;

import X.C1388190mED;
import X.C13LQ;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C212367188v;
import X.EnumC1102740eno;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.toolbar.IToolbarBtmService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class ToolbarBtmService implements IToolbarBtmService {
    public static final Set<String> LL = C13LQ.LJLIIL(new String[]{"btm_pre", "btm_ppre", "btm_pre_show_id"});

    public static String LIZ(PageFinder pageFinder, String str, Map map) {
        String string;
        Map mapLJ;
        Object obj = map.get("btm");
        if (obj != null && (string = obj.toString()) != null && string.length() > 0) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            C212367188v c212367188v = BcmParams.Companion;
            if (str != null && str.length() > 0) {
                mapLJ = C2097608Jq.LJIIJ(new Pair("bcm_delivery_source", "live_viral"), new Pair("bcm_delivery_id", str));
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            c212367188v.getClass();
            String bcmChainStandardStringByFinder = btmSDK.getBcmChainStandardStringByFinder(string, pageFinder, C212367188v.LIZJ(mapLJ));
            if (bcmChainStandardStringByFinder.length() > 0) {
                return bcmChainStandardStringByFinder;
            }
        }
        return null;
    }

    public static Map LIZIZ(Context context, LifecycleOwner lifecycleOwner, String str) {
        Activity activityLIZ;
        PageFinder pageFinderVia;
        Object value;
        String string;
        if (lifecycleOwner instanceof Fragment) {
            pageFinderVia = PageFinder.via((Fragment) lifecycleOwner);
        } else {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                pageFinderVia = PageFinder.via(activityLIZ);
            }
            return null;
        }
        if (pageFinderVia != null) {
            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c3091.d33711", pageFinderVia, null, 4, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                Set<String> set = LL;
                String str2 = (String) entry.getKey();
                str2.toString();
                if (!set.contains(str2) && (value = entry.getValue()) != null && (string = value.toString()) != null) {
                    String str3 = (String) entry.getKey();
                    str3.toString();
                    linkedHashMap.put(str3, string);
                }
            }
            String strLIZ = LIZ(pageFinderVia, str, mapCreateReportParams$default);
            if (strLIZ != null) {
                linkedHashMap.put("bcm_chain", strLIZ);
            }
            return linkedHashMap;
        }
        return null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarBtmService
    public final Map dN(View view, String str, String str2) {
        if (Intrinsics.LJFF(str, EnumC1102740eno.SHARE.getIdentifier()) && view != null) {
            try {
                PageFinder pageFinderVia = PageFinder.via(view);
                String strLIZ = LIZ(pageFinderVia, str2, BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c3091.d33711", pageFinderVia, null, 4, null));
                if (strLIZ != null) {
                    return C2097908Jt.LIZJ(new Pair("bcm_chain", strLIZ));
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.toolbar.IToolbarBtmService
    public final Map<String, String> D32(String str, Context context, LifecycleOwner lifecycleOwner, String str2) {
        Map<String, String> mapLIZIZ = null;
        if (!Intrinsics.LJFF(str, EnumC1102740eno.SHARE.getIdentifier())) {
            return null;
        }
        try {
            mapLIZIZ = LIZIZ(context, lifecycleOwner, str2);
            return mapLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return mapLIZIZ;
        }
    }
}
