package com.bytedance.apm.agent.instrumentation;

import X.C0WZX;
import X.C1495510p1J;
import X.C1495520p1K;
import X.C2204961BRm;
import com.bytedance.apm.agent.instrumentation.interceptor.AddHeaderInterceptor;
import com.bytedance.apm.agent.instrumentation.okhttp3.OkHttpEventFactory;

/* JADX INFO: loaded from: classes14.dex */
public class OkHttp3Instrumentation {
    public static C1495520p1K init() {
        C1495510p1J c1495510p1J = new C1495510p1J();
        c1495510p1J.addInterceptor(new AddHeaderInterceptor());
        c1495510p1J.eventListenerFactory(new OkHttpEventFactory(null));
        return C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rju1wBUym1EcuaiDv6iRYuRtg2EXjnU=", null));
    }

    public static C1495520p1K build(C1495510p1J c1495510p1J) throws Throwable {
        C1495520p1K c1495520p1KK0 = C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rju1wBUym1EcuaiDv6iRYuRtg2EXjnU=", null));
        c1495510p1J.addInterceptor(new AddHeaderInterceptor());
        c1495510p1J.eventListenerFactory(new OkHttpEventFactory(c1495520p1KK0.LLIZ));
        return C2204961BRm.k0(c1495510p1J, new C0WZX("dzBzEgAjS8/YVFkiQFyFdhv++tWr+hvkQRsqKnWacPO7uXh/Xd50rju1wBUym1EcuaiDv6iRYuRtg2EXjnU=", null));
    }
}
