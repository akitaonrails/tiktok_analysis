package com.ss.android.ugc.aweme.ecommerce.proto;

import X.C01GW;
import X.C040K;
import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1970507nj;
import X.C1974107oJ;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class EcomPbRequestInterceptor implements InterfaceC1904907d9 {
    public static final EcomPbRequestInterceptor LL = new EcomPbRequestInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        boolean z;
        Method method;
        Request requestLIZ = ((C1494590ozp) interfaceC841770X0l).LIZJ;
        Annotation annotation = null;
        if (requestLIZ != null) {
            C1974107oJ c1974107oJ = (C1974107oJ) requestLIZ.tag(C1974107oJ.class);
            if (c1974107oJ != null && (method = c1974107oJ.LIZ) != null) {
                annotation = method.getAnnotation(C040K.class);
            }
            boolean zContains = false;
            if (annotation != null) {
                z = true;
            } else {
                z = false;
            }
            String path = requestLIZ.getPath();
            C01GW c01gw = C1970507nj.LIZIZ;
            if (!((Set) c01gw.getValue()).isEmpty() && path != null) {
                zContains = ((Set) c01gw.getValue()).contains(path);
            }
            if (z && zContains) {
                ArrayList arrayList = new ArrayList(requestLIZ.getHeaders());
                arrayList.add(new C080U("x-ec-response-format", "protobuf"));
                C0XMB c0xmbNewBuilder = requestLIZ.newBuilder();
                c0xmbNewBuilder.LIZJ = arrayList;
                requestLIZ = c0xmbNewBuilder.LIZ();
            }
        } else {
            requestLIZ = null;
        }
        return ((C1494590ozp) interfaceC841770X0l).LIZ(requestLIZ);
    }
}
