package com.ss.android.ugc.aweme.aweme.optimize;

import X.AbstractC842530X3j;
import X.C01GW;
import X.C08JS;
import X.C098200Yq;
import X.C0VL3;
import X.C0X0X;
import X.C0X52;
import X.C0XLP;
import X.C0XLQ;
import X.C0XMB;
import X.C0XMH;
import X.C1494590ozp;
import X.C15438062q;
import X.C1720106oR;
import X.C189200o6;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import X.C612870O2b;
import X.C837630WtV;
import X.InterfaceC1904907d9;
import X.InterfaceC612880O2c;
import X.InterfaceC841770X0l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS94S1200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class AwemeCacheNetworkInterceptor implements InterfaceC1904907d9 {
    public final C01GW LL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(54));

    public final String LIZJ(String str) {
        ArrayList arrayList = new ArrayList();
        List<C0VL3> listLIZJ = ((IAwemeCacheService) this.LL.getValue()).LIZJ(str);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        Iterator<C0VL3> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new AwemeCacheRequestModel(CastLongProtector.parseLong(it2.next().LIZ)))));
        }
        return C08JS.LIZLLL(arrayList);
    }

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String strLJFF;
        Object c098200Yq;
        Request requestLIZIZ;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        if (c0xlqLJIIL != null && (strLJFF = c0xlqLJIIL.LJFF()) != null && ((AwemeCacheConfigModel) C612870O2b.LIZIZ.getValue()).apiPath.contains(strLJFF)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String method = request.getMethod();
                if (Intrinsics.LJFF(method, "GET")) {
                    requestLIZIZ = LIZ(request, strLJFF);
                } else if (Intrinsics.LJFF(method, "POST")) {
                    requestLIZIZ = LIZIZ(request, strLJFF);
                } else {
                    requestLIZIZ = request;
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("appendAwemeCacheIntoRequest cost ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C1720106oR.LJI("AwemeCacheNetworkInterceptor", C2188811AlT.LIZIZ(sbLIZ));
                request = requestLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
                if (thM5exceptionOrNullimpl != null) {
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("append aweme cache into Request error, ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            C0X52 c0x52LIZ = c1494590ozp.LIZ(request);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                c0x52LIZ = LIZLLL(strLJFF, c0x52LIZ);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl2 != null) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("append aweme cache into Response error, ");
                sbLIZ3.append(thM5exceptionOrNullimpl2.getMessage());
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("AwemeCacheNetworkInterceptor", "appendAwemeCacheIntoResponse cost " + (System.currentTimeMillis() - jCurrentTimeMillis2));
            return c0x52LIZ;
        }
        return c1494590ozp.LIZ(request);
    }

    public final Request LIZ(Request request, String str) {
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        if (c0xlqLJIIL != null) {
            Set<String> setLJIIZILJ = c0xlqLJIIL.LJIIZILJ();
            C0XLP c0xlpLJIIJ = c0xlqLJIIL.LJIIJ();
            for (String str2 : setLJIIZILJ) {
                Iterator<String> it2 = c0xlqLJIIL.LJIJ(str2).iterator();
                while (it2.hasNext()) {
                    c0xlpLJIIJ.LIZJ(str2, it2.next());
                }
            }
            c0xlpLJIIJ.LIZJ("aweme_caches", LIZJ(str));
            String str3 = c0xlpLJIIJ.LIZLLL().LJIIIIZZ;
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ(str3);
            return c0xmbNewBuilder.LIZ();
        }
        return request;
    }

    public final Request LIZIZ(Request request, String str) {
        C0X0X c0x0x;
        if (C0XLQ.LJIIL(request.getUrl()) != null) {
            AbstractC842530X3j requestBody = request.getRequestBody();
            if ((requestBody instanceof C0X0X) && (c0x0x = (C0X0X) requestBody) != null) {
                C837630WtV c837630WtV = new C837630WtV();
                int iLJI = c0x0x.LJI();
                for (int i = 0; i < iLJI; i++) {
                    c837630WtV.LIZIZ(c0x0x.LJFF(i), (String) ListProtector.get(c0x0x.LIZIZ, i));
                }
                c837630WtV.LIZIZ("aweme_caches", LIZJ(str));
                C0X0X c0x0xLIZJ = c837630WtV.LIZJ();
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZIZ(new C0XMH(c0x0xLIZJ), "POST");
                return c0xmbNewBuilder.LIZ();
            }
            return request;
        }
        return request;
    }

    public final C0X52<Object> LIZLLL(String str, C0X52<Object> c0x52) {
        ArrayList<Aweme> arrayList = new ArrayList();
        InterfaceC612880O2c interfaceC612880O2cLIZIZ = ((IAwemeCacheService) this.LL.getValue()).LIZIZ(str);
        if (interfaceC612880O2cLIZIZ != null) {
            new AwS94S1200000_9(this, (AwemeCacheNetworkInterceptor) str, (String) arrayList, (List<Aweme>) 0);
            Object objLIZ = interfaceC612880O2cLIZIZ.LIZ();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (Aweme aweme : arrayList) {
                arrayList2.add(new C0VL3(System.currentTimeMillis(), aweme, aweme.getAid(), str));
            }
            ((IAwemeCacheService) this.LL.getValue()).LIZLLL(str, arrayList2);
            if (objLIZ != null) {
                return C0X52.LIZLLL(objLIZ, c0x52.LIZ);
            }
        }
        return c0x52;
    }
}
