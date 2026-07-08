package com.bytedance.pumbaa.bpea.adapter;

import X.C0WZA;
import X.C0WZB;
import X.C825920Wac;
import X.C825940Wae;
import X.InterfaceC837740Wtg;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.bpea.adapter.BPEAMonitorTransform;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class BPEAMonitorTransform {
    public static final BPEAMonitorTransform LIZ = new BPEAMonitorTransform();
    public static final ThreadLocal<C0WZB> LIZIZ = new ThreadLocal<>();
    public static final C0WZA LIZJ = new InterfaceC837740Wtg() { // from class: X.0WZA
        @Override // X.InterfaceC837740Wtg
        public final void LIZ(C825940Wae c825940Wae, C838040WuA c838040WuA) {
            BPEAMonitorTransform.LIZ.getClass();
            BPEAMonitorTransform.LIZIZ.set(new C0WZB(c825940Wae));
        }

        @Override // X.InterfaceC837740Wtg
        public final void LIZIZ(C825940Wae c825940Wae, C838040WuA c838040WuA) {
            BPEAMonitorTransform.LIZ.getClass();
            BPEAMonitorTransform.LIZIZ.set(null);
        }
    };

    public static final Map<String, Object> getBPEAData() {
        C825940Wae c825940Wae;
        Cert cert;
        C0WZB c0wzb = LIZIZ.get();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c0wzb != null && (c825940Wae = c0wzb.LIZ) != null && (cert = c825940Wae.LIZ) != null) {
            String strCertToken = cert.certToken();
            if (strCertToken != null) {
                linkedHashMap.put("cert_token", strCertToken);
            }
            Integer numLIZ = C825920Wac.LIZ(cert);
            if (numLIZ != null) {
                linkedHashMap.put("dfid", String.valueOf(numLIZ.intValue()));
            }
        }
        return linkedHashMap;
    }
}
