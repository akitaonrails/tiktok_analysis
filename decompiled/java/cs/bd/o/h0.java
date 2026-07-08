package cs.bd.o;

import X.C08PQ;
import X.C0WZX;
import X.C2110608Oq;
import X.C2204961BRm;
import X.C786410Ut5;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        JSONArray jSONArray = new JSONArray();
        try {
            DhcpInfo dhcpInfoLJZI = C2204961BRm.LJZI((WifiManager) C786410Ut5.H2(C786410Ut5.N3(C2110608Oq.LIZIZ.LIZ), "wifi"), new C0WZX("dywwXgZ0UITUBQ==", null));
            jSONArray.put((dhcpInfoLJZI.dns1 & 255) + e3.d + ((dhcpInfoLJZI.dns1 >> 8) & 255) + e3.d + ((dhcpInfoLJZI.dns1 >> 16) & 255) + e3.d + ((dhcpInfoLJZI.dns1 >> 24) & 255));
            jSONArray.put((dhcpInfoLJZI.dns2 & 255) + e3.d + ((dhcpInfoLJZI.dns2 >> 8) & 255) + e3.d + ((dhcpInfoLJZI.dns2 >> 16) & 255) + e3.d + ((dhcpInfoLJZI.dns2 >> 24) & 255));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return jSONArray.toString();
    }
}
