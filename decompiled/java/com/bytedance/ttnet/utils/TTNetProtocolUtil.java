package com.bytedance.ttnet.utils;

import X.C080U;
import X.C0X9S;
import X.C1493170oxX;
import X.C1515120pWw;
import X.C2088908Gh;
import X.C2188811AlT;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501320pAg;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC820680WHi;
import android.util.Pair;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class TTNetProtocolUtil {

    public interface Service {
        @InterfaceC1501160pAQ
        @InterfaceC1501320pAg(3)
        C0X9S<TypedInput> getCall(@InterfaceC2174708fZ String str, @InterfaceC1501130pAN(encode = true) Map<String, String> map, @InterfaceC820680WHi boolean z, @InterfaceC2174808fa List<C080U> list);
    }

    public static void LIZIZ(C1493170oxX c1493170oxX) throws IOException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("multinet");
        sbLIZ.append("/activatecell");
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(C2188811AlT.LIZIZ(sbLIZ), null);
        String str = (String) pairLIZJ.first;
        String str2 = (String) pairLIZJ.second;
        Retrofit retrofitLJIILIIL = C1515120pWw.LJIILIIL(str);
        if (retrofitLJIILIIL == null) {
            return;
        }
        Service service = (Service) retrofitLJIILIIL.LIZ(Service.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("x-ttnet-protocol-handler", "1"));
        arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
        service.getCall(str2, null, false, arrayList).enqueue(c1493170oxX);
    }

    public static void LIZ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append("wifi-to-cell");
        sbLIZ.append(str);
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(C2188811AlT.LIZIZ(sbLIZ), map);
        String str2 = (String) pairLIZJ.first;
        String str3 = (String) pairLIZJ.second;
        Retrofit retrofitLJIILIIL = C1515120pWw.LJIILIIL(str2);
        if (retrofitLJIILIIL == null) {
            return;
        }
        Service service = (Service) retrofitLJIILIIL.LIZ(Service.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("x-ttnet-protocol-handler", "1"));
        arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
        C0X9S<TypedInput> call = service.getCall(str3, map, false, arrayList);
        try {
            try {
                call.execute();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            call.cancel();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            call.cancel();
            throw th;
        }
    }
}
