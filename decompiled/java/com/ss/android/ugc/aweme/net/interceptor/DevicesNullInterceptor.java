package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X0W;
import X.C0X33;
import X.C0XLP;
import X.C0XLY;
import X.C1495400p18;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.net.IReleaseInterceptor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class DevicesNullInterceptor implements IReleaseInterceptor {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request requestLIZIZ = c1495400p18.LJFF;
        if (TextUtils.equals("", requestLIZIZ.url().LJIILLIIL("device_id"))) {
            C0X33 c0x33NewBuilder = requestLIZIZ.newBuilder();
            C0XLP c0xlpLJIIJ = requestLIZIZ.url().LJIIJ();
            c0xlpLJIIJ.LJIIIZ("device_id");
            c0x33NewBuilder.LJIIIIZZ(c0xlpLJIIJ.LIZLLL());
            requestLIZIZ = c0x33NewBuilder.LIZIZ();
        }
        return c1495400p18.LIZ(requestLIZIZ);
    }
}
