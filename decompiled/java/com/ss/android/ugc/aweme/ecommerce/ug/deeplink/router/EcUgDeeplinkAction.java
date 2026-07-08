package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.router;

import X.AbstractC1950107kR;
import X.C0WZX;
import X.C1076350e7F;
import X.C1618390sDV;
import X.C1701330uNH;
import X.C1768580w7k;
import X.C1950707kX;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgDeeplinkAction extends AbstractC1950107kR<Unit> {
    @Override // X.AbstractC1950207kS
    public final Pair<String, HashMap<String, Object>> LIZLLL(String str, HashMap<String, Object> map, C1950707kX c1950707kX) {
        boolean zBooleanValue;
        Boolean bool;
        try {
            Object obj = c1950707kX.LJ.get("is_from_notification");
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            map.put("local_param_is_from_notification", Boolean.valueOf(zBooleanValue));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new Pair<>(str, map);
    }

    @Override // X.AbstractC1951007ka
    public final boolean LIZ(Context context, String str, HashMap<String, Object> map, ArrayList<Integer> arrayList) {
        Uri uri;
        boolean zBooleanValue;
        Boolean bool;
        try {
            uri = UriProtector.parse(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            uri = null;
        }
        if (uri != null) {
            C1768580w7k.LIZ.getClass();
            if (C1768580w7k.LIZIZ(uri) || C1768580w7k.LIZJ(uri)) {
                Object obj = map.get("local_param_is_from_notification");
                if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Uri uriLIZ = C1768580w7k.LIZ(uri, true, zBooleanValue);
                C1618390sDV.LIZ.getClass();
                IAwemeApplicationService iAwemeApplicationService = (IAwemeApplicationService) ServiceManager.get().getService(IAwemeApplicationService.class);
                if (iAwemeApplicationService == null || !iAwemeApplicationService.isAppHot()) {
                    try {
                        Intent intentLIZ = C1076350e7F.LIZ(context);
                        intentLIZ.putExtra("extra_from_deeplink", true);
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentLIZ, "Context_startActivity_1");
                        C1701330uNH.LIZ(intentLIZ, context);
                        C2204961BRm.LJJJJJL(context, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnuxaalZr6YIj/oy1ucwXTRtmNSarviCl+e2ZjtmpsXrH5h2zOdF", null));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }
                if (uriLIZ != null) {
                    C1768580w7k.LIZ.getClass();
                    C1768580w7k.LIZLLL(context, uriLIZ);
                    return true;
                }
            }
        }
        return false;
    }
}
