package com.ss.android.ugc.aweme.account.network;

import X.C080U;
import X.C0V4W;
import X.C0X52;
import X.C0XMB;
import X.C123100dR;
import X.C13LP;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.account.cloudkey.CloudIdentityService;
import defpackage.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes14.dex */
public final class CloudIDInterceptor implements InterfaceC1904907d9 {
    public static final CloudIDInterceptor LL = new CloudIDInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String str;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        String path = UriProtector.parse(request.getUrl()).getPath();
        if (path != null && a0.LJJIIZI(path, "passport", false) && !w0.LIZ().disabled && C0V4W.LIZ()) {
            String url = request.getUrl();
            if (C13LP.LLIIJI(w0.LIZ().cloudIdApis).contains(request.getPath())) {
                String strLIZ = CloudIdentityService.LIZLLL().LIZ();
                if (C123100dR.LIZ(strLIZ)) {
                    url = UriProtector.parse(request.getUrl()).buildUpon().appendQueryParameter("cloud_platform_id", "1").appendQueryParameter("cloud_platform_user_id", strLIZ).build().toString();
                }
            }
            ArrayList arrayList = new ArrayList(request.getHeaders());
            if (C13LP.LLIIJI(w0.LIZ().loginStateApis).contains(request.getPath()) || C13LP.LLIIJI(w0.LIZ().logoutStateApis).contains(request.getPath())) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String strLIZIZ = CloudIdentityService.LIZLLL().LIZIZ(jCurrentTimeMillis, request.getPath(), C13LP.LLIIJI(w0.LIZ().loginStateApis).contains(request.getPath()));
                if (strLIZIZ.length() > 0) {
                    arrayList.add(new C080U("x-tt-cloud-key-timestamp", String.valueOf(jCurrentTimeMillis)));
                    arrayList.add(new C080U("x-tt-cloud-key-client-data", strLIZIZ));
                }
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(url);
            c0xmbNewBuilder.LIZJ = arrayList;
            C0X52<?> c0x52LIZ = c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            List<C080U> list = c0x52LIZ.LIZ.LIZLLL;
            if (!(list instanceof List)) {
                list = null;
            }
            String str2 = "";
            if (list == null) {
                str = "";
            } else {
                str = "";
                for (C080U c080u : list) {
                    if (u.LJIJI("x-tt-cloud-key", c080u.LIZ, true)) {
                        str = c080u.LIZIZ;
                    }
                    if (u.LJIJI("x-tt-store-sec-uid", c080u.LIZ, true)) {
                        str2 = c080u.LIZIZ;
                    }
                }
            }
            if (str2.length() > 0 && str.length() > 0) {
                CloudIdentityService.LIZLLL().LIZJ(str2, str);
            }
            return c0x52LIZ;
        }
        return c1494590ozp.LIZ(request);
    }
}
