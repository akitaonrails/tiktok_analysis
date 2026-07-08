package com.ss.android.ugc.aweme.services;

import X.C018L;
import X.C0WZX;
import X.C13BV;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C837870Wtt;
import X.C838780WvM;
import X.C845830XGb;
import X.C845840XGc;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ss.android.ugc.aweme.ISOTLBlobReaderConfigService;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class SOTLBlobReaderConfigService implements ISOTLBlobReaderConfigService {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();

    public static final class Companion {
    }

    @Override // com.ss.android.ugc.aweme.ISOTLBlobReaderConfigService
    public Pair<Boolean, String> getGaid(Context context) throws Throwable {
        boolean z;
        AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(context);
        if (infoLIZIZ != null) {
            z = infoLIZIZ.LIZIZ;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        String strLLLLLIL = null;
        if (infoLIZIZ != null) {
            strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6BWbAafFUOxNF8eea2Gw99OlK7yTCAb7lE+gWg==", null));
        }
        return new Pair<>(boolValueOf, strLLLLLIL);
    }

    @Override // com.ss.android.ugc.aweme.ISOTLBlobReaderConfigService
    public C845830XGb executeGet(String str, Map<String, String> map) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("api-va.tiktokv.com");
        sbLIZ.append(str);
        C018L c018l = new C018L(C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            c018l.LIZ(entry.getKey(), entry.getValue());
        }
        ArrayList arrayList = new ArrayList();
        try {
            strLIZ = C838780WvM.LIZ(c018l.toString(), "SOTLBlobReaderConfig");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            strLIZ = "";
        }
        arrayList.add(new C845840XGc("x-tt-passport-csrf-token", strLIZ));
        try {
            return NetworkProxyAccount.LIZ.LIZLLL(c018l.toString(), arrayList);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            c018l.toString();
            return new C845830XGb(C13BV.INSTANCE, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.ISOTLBlobReaderConfigService
    public void sendEvent(String str, JSONObject jSONObject) {
        C20684815ws.LJIJ(str, jSONObject);
    }
}
