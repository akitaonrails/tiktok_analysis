package com.ss.android.ugc.aweme.net.interceptor;

import X.C0X0W;
import X.C0XLY;
import X.C1495400p18;
import X.C786410Ut5;
import X.C842420X2y;
import android.os.SystemClock;
import com.facebook.network.connectionclass.DeviceBandwidthSampler;
import com.ss.android.ugc.aweme.net.INetReleaseInterceptor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public class NetWorkSpeedInterceptor implements INetReleaseInterceptor {
    @Override // X.InterfaceC836900WsK
    public final C0XLY intercept(C0X0W c0x0w) {
        C1495400p18 c1495400p18 = (C1495400p18) c0x0w;
        Request request = c1495400p18.LJFF;
        DeviceBandwidthSampler deviceBandwidthSampler = C842420X2y.LIZ;
        if (deviceBandwidthSampler.LIZIZ.getAndIncrement() == 0) {
            C786410Ut5.LJLILLLLZI(deviceBandwidthSampler.LIZJ, 1);
            deviceBandwidthSampler.LIZLLL = SystemClock.elapsedRealtime();
        }
        C0XLY c0xlyLIZ = c1495400p18.LIZ(request);
        if (deviceBandwidthSampler.LIZIZ.decrementAndGet() == 0) {
            C786410Ut5.LJLILLLLZI(deviceBandwidthSampler.LIZJ, 2);
        }
        return c0xlyLIZ;
    }
}
