package com.ss.android.ugc.aweme.compliance.sandbox.network;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.orbu.core.TTKOrbu;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class OrbuSandboxTTNetInterceptor implements InterfaceC1904907d9 {
    public static final OrbuSandboxTTNetInterceptor LL = new OrbuSandboxTTNetInterceptor();

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        if (!TTKOrbu.INSTANCE.enableInterceptor()) {
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
        C1494590ozp c1494590ozp2 = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp2.LIZJ;
        ArrayList arrayList = new ArrayList(request.getHeaders());
        if (request.getHost() != null && Intrinsics.LJFF(NetworkDomainRecognize.domainIdentityRecognize(request.getHost()), "tt_1st")) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (Intrinsics.LJFF(((C080U) ListProtector.get(arrayList, i)).LIZ, "x-tt-dataflow-id")) {
                    ListProtector.remove(arrayList, i);
                    break;
                }
                i++;
            }
        }
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList;
        return c1494590ozp2.LIZ(c0xmbNewBuilder.LIZ());
    }
}
