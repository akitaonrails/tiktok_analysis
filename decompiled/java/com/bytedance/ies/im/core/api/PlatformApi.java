package com.bytedance.ies.im.core.api;

import X.AbstractC19484711Kz;
import X.C040I;
import X.C0X9S;
import X.C0Z64;
import X.C11NZ;
import X.InterfaceC1485705rj;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import X.InterfaceC2177008fw;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.Response;

/* JADX INFO: loaded from: classes15.dex */
public interface PlatformApi {
    public static final C0Z64 LIZ = C0Z64.LIZ;

    @InterfaceC1501240pAY
    C0X9S<Response> post(@InterfaceC1485705rj String str, @InterfaceC1501370pAl("Content-Type") String str2, @InterfaceC1501370pAl("Locale") String str3, @InterfaceC1501370pAl("X-Biz-Id") String str4, @C040I Request request, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY
    C11NZ<Response> postSDK(@InterfaceC1485705rj String str, @InterfaceC1501370pAl("Content-Type") String str2, @InterfaceC1501370pAl("Locale") String str3, @InterfaceC1501370pAl("X-Biz-Id") String str4, @C040I Request request, @InterfaceC2177008fw Object obj);

    @InterfaceC1501240pAY
    AbstractC19484711Kz<Response> postSingle(@InterfaceC1485705rj String str, @InterfaceC1501370pAl("Content-Type") String str2, @InterfaceC1501370pAl("Locale") String str3, @InterfaceC1501370pAl("X-Biz-Id") String str4, @C040I Request request, @InterfaceC2177008fw Object obj);
}
