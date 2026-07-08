package com.ss.android.account.token;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.text.u;

/* JADX INFO: loaded from: classes4.dex */
public final class AddCSRFInterceptor implements InterfaceC1904907d9 {
    public static final AddCSRFInterceptor LL = new AddCSRFInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws Exception {
        Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        if (!u.LJJIIJZLJL(request.getPath(), "/passport/", false)) {
            try {
                return ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            }
        }
        String url = request.getUrl();
        url.toString();
        String strLIZ = TTTokenUtils.LIZ(url);
        ArrayList arrayList = new ArrayList(request.getHeaders());
        arrayList.add(new C080U("x-tt-passport-csrf-token", strLIZ));
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList;
        try {
            return ((C1494590ozp) interfaceC841770X0l).LIZ(c0xmbNewBuilder.LIZ());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2;
        }
    }
}
