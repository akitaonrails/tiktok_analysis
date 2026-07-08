package com.ss.android.ugc.aweme.compliance.sandbox.network;

import X.C0X0W;
import X.C0X33;
import X.C0XLY;
import X.C2097608Jq;
import X.InterfaceC836900WsK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKNetworkRequest;
import com.orbu.core.adapter.TTKResponse;
import com.orbu.core.adapter.TTKResponseKt;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.u;
import okhttp3.Request;

/* JADX INFO: loaded from: classes14.dex */
public final class OrbuSandboxOkHttpInterceptor implements InterfaceC836900WsK {
    public static final OrbuSandboxOkHttpInterceptor INSTANCE = new OrbuSandboxOkHttpInterceptor();

    @Override // X.InterfaceC836900WsK
    public C0XLY intercept(C0X0W c0x0w) throws IOException {
        Map linkedHashMap;
        byte[] bArrLJIILLIIL;
        TTKResponse tTKResponseShouldInterceptTTKRequest;
        Integer numValueOf;
        TTKOrbu tTKOrbu = TTKOrbu.INSTANCE;
        if (!tTKOrbu.enableInterceptor()) {
            return c0x0w.LIZ(c0x0w.request());
        }
        Request request = c0x0w.request();
        String strHeader = request.header("x-tt-dataflow-id");
        if (strHeader != null && strHeader.length() != 0) {
            linkedHashMap = C2097608Jq.LJIIJ(new Pair("x-tt-dataflow-id", strHeader));
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C0X33 c0x33NewBuilder = request.newBuilder();
        c0x33NewBuilder.LIZLLL.LIZLLL("x-tt-dataflow-id");
        Request requestLIZIZ = c0x33NewBuilder.LIZIZ();
        String str = requestLIZIZ.url().LJIIIIZZ;
        Map<String, List<String>> mapLJIIIZ = requestLIZIZ.headers().LJIIIZ();
        String strHeader2 = request.header("x-tt-sandbox-body");
        String description = null;
        if (strHeader2 != null) {
            bArrLJIILLIIL = u.LJIILLIIL(strHeader2);
        } else {
            bArrLJIILLIIL = null;
        }
        try {
            tTKResponseShouldInterceptTTKRequest = tTKOrbu.shouldInterceptTTKRequest(new TTKNetworkRequest(str, request.method(), mapLJIIIZ, bArrLJIILLIIL, linkedHashMap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            tTKResponseShouldInterceptTTKRequest = null;
        }
        if (TTKResponseKt.isBlock(tTKResponseShouldInterceptTTKRequest)) {
            StringBuilder sb = new StringBuilder("request is blocked\n error code is ");
            if (tTKResponseShouldInterceptTTKRequest != null) {
                numValueOf = Integer.valueOf(tTKResponseShouldInterceptTTKRequest.getStatusCode());
            } else {
                numValueOf = null;
            }
            sb.append(numValueOf);
            sb.append(':');
            if (tTKResponseShouldInterceptTTKRequest != null) {
                description = tTKResponseShouldInterceptTTKRequest.getDescription();
            }
            sb.append(description);
            sb.append(' ');
            throw new IOException(sb.toString());
        }
        return c0x0w.LIZ(requestLIZIZ);
    }
}
