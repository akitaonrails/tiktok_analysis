package com.heytap.msp.push.service;

import X.C2188811AlT;
import com.heytap.mcssdk.d.e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public final Map<Integer, e> b;

    public static class a {
        public static final b a = new b();
    }

    public b() {
        this.b = new HashMap();
        b();
    }

    private void b() {
        this.b.put(4117, new com.heytap.msp.push.service.a());
        this.b.put(4120, new com.heytap.mcssdk.d.b());
        com.heytap.mcssdk.utils.e.b("ParserFactory", "Default parsers registered automatically");
    }

    public e a(int i) {
        e eVar = this.b.get(Integer.valueOf(i));
        if (eVar == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No parser found for message type: ");
            sbLIZ.append(i);
            com.heytap.mcssdk.utils.e.d("ParserFactory", C2188811AlT.LIZIZ(sbLIZ));
        }
        return eVar;
    }

    public static b a() {
        return a.a;
    }
}
