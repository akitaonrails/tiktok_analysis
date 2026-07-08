package com.ss.android.ugc.aweme.net;

import X.C080U;
import X.C0X52;
import X.C0XIR;
import X.C0XK0;
import X.C0XK2;
import X.C0XK5;
import X.C0XKE;
import X.C0XMB;
import X.C1494590ozp;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.experiment.MixMallNetInterceptorOpt;
import com.ss.android.ugc.aweme.net.interceptor.IResponseExtraParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class ApiVerifyInterceptor implements InterfaceC1904907d9 {
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0XK3] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1904907d9
    public final C0X52 intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C0X52 c0x52LIZ;
        C0XK5 c0xk5LIZ;
        IResponseExtraParser iResponseExtraParser = (IResponseExtraParser) PluggableExtentionKt.pluggableSpi(IResponseExtraParser.class);
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C0XK5 c0xk5LIZIZ = null;
        C0XIR c0xir = null;
        try {
            c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
        } catch (C0XIR e) {
            e = e;
            c0x52LIZ = null;
        }
        try {
        } catch (C0XIR e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (iResponseExtraParser != null) {
                c0xk5LIZIZ = iResponseExtraParser.LIZIZ(e);
            }
            c0xk5LIZ = c0xk5LIZIZ;
            c0xir = e;
            if (c0xk5LIZ == null) {
                if (e == null) {
                    return c0x52LIZ;
                }
                throw e;
            }
        }
        if (LIZ(request, c0x52LIZ)) {
            return c0x52LIZ;
        }
        if (iResponseExtraParser != null) {
            c0xk5LIZ = iResponseExtraParser.LIZ(request.getUrl(), c0x52LIZ);
            if (c0xk5LIZ == null) {
                return c0x52LIZ;
            }
            if (C0XK2.LIZJ == null) {
                synchronized (C0XK2.class) {
                    try {
                        if (C0XK2.LIZJ == null) {
                            final C0XKE c0xkeLJIILJJIL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILJJIL();
                            C0XK2.LIZJ = new C0XK2(new C0XK0(c0xkeLJIILJJIL) { // from class: X.0XK3
                                @Override // X.C0XK0
                                public final C0XK1 LIZ(C0XK5 c0xk5, Request request2, C0X52 c0x52) {
                                    long j = c0xk5.LIZIZ;
                                    if (j > 0) {
                                        C0XK4.LIZ = j;
                                        C0XK4.LIZIZ = System.currentTimeMillis();
                                        Iterator it2 = ((CopyOnWriteArrayList) C0XK4.LIZJ).iterator();
                                        while (it2.hasNext()) {
                                            ((C0XK6) it2.next()).LIZ(C0XK4.LIZ);
                                        }
                                    }
                                    return C0XK0.LIZIZ;
                                }
                            });
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (C0XK2.LIZJ.LIZIZ(c0xk5LIZ, request, c0x52LIZ).LIZ && !TextUtils.isEmpty(request.getUrl())) {
                HashMap map = new HashMap();
                for (C080U c080u : request.getHeaders()) {
                    map.put(c080u.LIZ, c080u.LIZIZ);
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                }
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ(request.getUrl());
                return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
            }
            if (c0xir == null) {
                return c0x52LIZ;
            }
            throw c0xir;
        }
        throw new RuntimeException("Can not find responseExtraParser");
    }

    public static boolean LIZ(Request request, C0X52 c0x52) {
        if (request.isResponseStreaming()) {
            return true;
        }
        C080U c080uLIZ = c0x52.LIZ.LIZ("Content-Type");
        String path = request.getPath();
        if (c080uLIZ == null || (!TextUtils.isEmpty(path) && (path.contains("/effect/api") || path.contains("/model/api")))) {
            return true;
        }
        String host = request.getHost();
        Set<String> set = MixMallNetInterceptorOpt.LIZ;
        if (set.isEmpty() || !set.contains(host)) {
            Set<String> set2 = MixMallNetInterceptorOpt.LIZIZ;
            if (set2.isEmpty() || !set2.contains(path)) {
                String str = c080uLIZ.LIZIZ;
                if (!TextUtils.isEmpty(str) && !str.contains("json")) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }
}
