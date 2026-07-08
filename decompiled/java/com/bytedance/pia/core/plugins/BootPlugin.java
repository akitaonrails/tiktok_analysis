package com.bytedance.pia.core.plugins;

import X.C09CT;
import X.C1BO6;
import X.C1BP6;
import X.C2203961BNq;
import X.C2204041BNy;
import X.C2204191BOn;
import X.InterfaceC1530550pvp;
import com.bytedance.pia.core.bridge.protocol.ProtocolMessage;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class BootPlugin extends C1BO6 {
    public static final Map<String, String> LJ;
    public final h LIZJ;
    public final List<String> LIZLLL;

    @Override // X.C1BO6
    public final String LIZ() {
        return "boot";
    }

    static {
        HashMap map = new HashMap();
        LJ = map;
        map.put("prefetch", "pia.internal.worker.create");
    }

    public BootPlugin(C2204041BNy c2204041BNy) {
        super(c2204041BNy);
        this.LIZJ = new h();
        this.LIZLLL = new ArrayList();
    }

    @Override // X.C1BO6
    public final void LJ(String str, Object... objArr) {
        String str2;
        if (C2203961BNq.LIZ().isBootEnabled && "event-on-manifest-ready".equals(str)) {
            Object obj = objArr[0];
            if (obj instanceof n) {
                for (Map.Entry<String, k> entry : ((n) obj).entrySet()) {
                    final String key = entry.getKey();
                    if ("prefetch".equals(key) && this.LIZIZ.LIZLLL.LIZIZ().contains("prefetch") && (str2 = (String) ((HashMap) LJ).get(key)) != null) {
                        this.LIZIZ.LJIILJJIL.LIZIZ(1);
                        n nVarLJIILIIL = entry.getValue().LJIILIIL();
                        final n nVar = new n();
                        nVar.LJJIIJ("configKey", key);
                        nVar.LJJIIJ("type", str2);
                        ((ArrayList) this.LIZLLL).add(key);
                        this.LIZIZ.LJIJJ.LIZIZ(new InterfaceC1530550pvp<n>() { // from class: X.1BOb
                            @Override // X.InterfaceC1530550pvp
                            public final void accept(n nVar2) {
                                nVar.LJJIFFI("result", ProtocolMessage.LIZ(new C2204551BPx(1, 1, nVar2, null)));
                                this.LIZJ.LJI(nVar, key);
                            }
                        }, new InterfaceC1530550pvp<C2204191BOn>() { // from class: X.1BOa
                            @Override // X.InterfaceC1530550pvp
                            public final void accept(C2204191BOn c2204191BOn) {
                                C2204191BOn c2204191BOn2 = c2204191BOn;
                                nVar.LJJIFFI("result", ProtocolMessage.LIZ(new C2204551BPx(1, c2204191BOn2.getCode(), null, c2204191BOn2.getMessage())));
                                this.LIZJ.LJI(nVar, key);
                            }
                        }, nVarLJIILIIL, str2);
                    }
                }
            }
        }
    }

    public final void LJI(n nVar, String str) {
        this.LIZJ.LJJIFFI(nVar);
        ((ArrayList) this.LIZLLL).remove(str);
        if (((ArrayList) this.LIZLLL).isEmpty()) {
            C1BP6 c1bp6 = this.LIZIZ.LJIJJ;
            final h hVar = this.LIZJ;
            c1bp6.LIZ(new Object(hVar) { // from class: com.bytedance.pia.core.bridge.methods.BootOnFinish$Result

                @C09CT("results")
                public h results;

                {
                    this.results = hVar;
                }
            }, "pia.internal.boot.onFinish");
        }
    }
}
