package com.bytedance.bpea.net3rd.impl;

import X.C080T;
import X.C080U;
import X.C0X52;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class BPEADebugInterceptor implements InterfaceC1904907d9 {
    public static final BPEADebugInterceptor LL = new BPEADebugInterceptor();
    public static final Map<String, C080T> LLILLJJLI = new LinkedHashMap();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) throws UnsupportedEncodingException {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        Uri uri = UriProtector.parse(request.getUrl());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                linkedHashMap.put(str, UriProtector.getQueryParameters(uri, str));
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str2 = "";
        for (C080U c080u : request.getHeaders()) {
            linkedHashMap2.put(c080u.LIZ, c080u.LIZIZ);
            if (Intrinsics.LJFF(c080u.LIZ, "BPEA_NET_DEBUG")) {
                str2 = c080u.LIZIZ;
            }
        }
        Request requestLIZ = request.newBuilder().LIZ();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        TypedOutput body = requestLIZ.getBody();
        if (body != null) {
            body.writeTo(byteArrayOutputStream);
        }
        byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
        request.getMethod();
        request.getUrl();
        C0X52<?> c0x52LIZ = c1494590ozp.LIZ(request);
        C080T c080t = (C080T) ((LinkedHashMap) LLILLJJLI).get(str2);
        if (c080t != null) {
            c080t.LIZ();
        }
        return c0x52LIZ;
    }
}
