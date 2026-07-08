package com.bytedance.touchpoint.data.interceptor;

import X.C080U;
import X.C0C64;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C816510W1h;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.touchpoint.data.experiment.VpnDebugInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class VPNInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        int i;
        int i2;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request requestLIZ = c1494590ozp.LIZJ;
        ArrayList arrayList = new ArrayList();
        if (requestLIZ.getHeaders() != null) {
            arrayList.addAll(requestLIZ.getHeaders());
        }
        String path = requestLIZ.getPath();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        VpnDebugInfo vpnDebugInfo = C816510W1h.LIZ;
        int i3 = 1;
        VpnDebugInfo vpnDebugInfo2 = (VpnDebugInfo) c0c64LJIILLIIL.LJJII(VpnDebugInfo.class, vpnDebugInfo, "ug_cheat_block_info", true);
        if (vpnDebugInfo2 != null) {
            vpnDebugInfo = vpnDebugInfo2;
        }
        if (u.LJJIIJZLJL(path, vpnDebugInfo.blockPath, false)) {
            try {
                for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    if (!networkInterface.isUp() || (!u.LJJIIJZLJL(networkInterface.getName(), "tun", false) && !u.LJJIIJZLJL(networkInterface.getName(), "ppp", false))) {
                    }
                    i = 1;
                }
                i = 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                i = -1;
            }
            arrayList.add(new C080U("Use-Vpn", String.valueOf(i)));
            try {
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                if (property2 != null) {
                    i2 = CastIntegerProtector.parseInt(property2);
                } else {
                    i2 = -1;
                }
                if (TextUtils.isEmpty(property) || i2 == -1) {
                    i3 = 0;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                i3 = -1;
            }
            arrayList.add(new C080U("Is-Mockip", String.valueOf(i3)));
            C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            requestLIZ = c0xmbNewBuilder.LIZ();
        }
        return c1494590ozp.LIZ(requestLIZ);
    }
}
