package com.ss.android.ugc.aweme.net.interceptor;

import X.C0CD2;
import X.C0X52;
import X.C0XLH;
import X.C0XM7;
import X.C0XM9;
import X.C13LP;
import X.C1490190osj;
import X.C1494590ozp;
import X.C1498950p6r;
import X.C19266210Yy;
import X.C2097608Jq;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lego.NetworkRestrictInfoTask;
import com.ss.android.ugc.aweme.net.partner.RequestFilterHandler;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class LastRequestInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        C0X52 c0x52LIZ;
        C0XM9 c0xm9 = new C0XM9(((C1494590ozp) interfaceC841770X0l).LIZJ);
        if (c0xm9.LIZIZ(RequestFilterHandler.class) == null) {
            C1498950p6r.LIZ.getClass();
            C1498950p6r.LIZ(c0xm9);
        }
        System.currentTimeMillis();
        if (C0CD2.LIZLLL()) {
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("n", String.valueOf(((Boolean) C0XLH.LIZ.getValue()).booleanValue() ? 1 : 0)));
            if (NetworkRestrictInfoTask.LLILLJJLI == null) {
                NetworkRestrictInfoTask.LLILLJJLI = NetworkRestrictInfoTask.LL.getValue().getString("NetworkRestrictInfo", CardStruct.IStatusCode.DEFAULT);
            }
            String str = NetworkRestrictInfoTask.LLILLJJLI;
            if (str != null) {
                mapLJIIJ.put("nr", str);
            }
            mapLJIIJ.put("bg", String.valueOf(C19266210Yy.LIZIZ.LIZJ()));
            C1490190osj c1490190osj = C1490190osj.LIZIZ;
            if (true ^ c1490190osj.LJ().isEmpty()) {
                mapLJIIJ.put("rs", C13LP.LJJLIIIJ(c1490190osj.LJ(), ",", null, null, 0, null, new C0XM7(), 30));
            }
            C0XLH.LIZ(c0xm9, mapLJIIJ, false);
        }
        Request requestLIZ = c0xm9.LIZ();
        try {
            c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
            try {
                C1498950p6r.LIZ.getClass();
                C1498950p6r.LIZIZ(requestLIZ, c0x52LIZ, null);
                return c0x52LIZ;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C1498950p6r.LIZ.getClass();
                C1498950p6r.LIZIZ(requestLIZ, c0x52LIZ, e);
                throw e;
            }
        } catch (Exception e2) {
            e = e2;
            c0x52LIZ = null;
        }
    }
}
