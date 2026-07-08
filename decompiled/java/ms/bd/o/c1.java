package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        JSONArray jSONArray = new JSONArray();
        try {
            DhcpInfo dhcpInfoLJZI = C2204961BRm.LJZI((WifiManager) C786410Ut5.H2(a.LIZIZ.LIZ, (String) k.a(16777217, 0, 0L, "299173", new byte[]{52, 50, 76, 76})), new C0WZX("eSwwXgZ0UITfBA==", null));
            StringBuilder sb = new StringBuilder();
            sb.append(dhcpInfoLJZI.dns1 & 255);
            sb.append((String) k.a(16777217, 0, 0L, "6ec9d8", new byte[]{105}));
            sb.append((dhcpInfoLJZI.dns1 >> 8) & 255);
            sb.append((String) k.a(16777217, 0, 0L, "8168bd", new byte[]{103}));
            sb.append((dhcpInfoLJZI.dns1 >> 16) & 255);
            sb.append((String) k.a(16777217, 0, 0L, "cef531", new byte[]{60}));
            sb.append((dhcpInfoLJZI.dns1 >> 24) & 255);
            jSONArray.put(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(dhcpInfoLJZI.dns2 & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "cb2783", new byte[]{60}));
            sb2.append((dhcpInfoLJZI.dns2 >> 8) & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "78df7b", new byte[]{104}));
            sb2.append((dhcpInfoLJZI.dns2 >> 16) & 255);
            sb2.append((String) k.a(16777217, 0, 0L, "c14aa2", new byte[]{60}));
            sb2.append((dhcpInfoLJZI.dns2 >> 24) & 255);
            jSONArray.put(sb2.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            k.a(16777217, 0, 0L, "17fb09", new byte[]{45, 60, 29, 41, 11, 34});
        }
        return jSONArray.toString();
    }
}
