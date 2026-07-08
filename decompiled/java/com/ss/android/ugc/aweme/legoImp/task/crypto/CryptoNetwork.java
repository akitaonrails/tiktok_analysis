package com.ss.android.ugc.aweme.legoImp.task.crypto;

import X.C080U;
import X.C092C;
import X.C09HQ;
import X.C0X9S;
import X.C386801es;
import X.C564610MCl;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1631620sYq;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class CryptoNetwork implements C092C {

    public interface RealApi {
        @InterfaceC1501170pAR
        C0X9S<String> doPostJson(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
    }

    @Override // X.C092C
    public final void LIZ(String str, String str2, Map map, InterfaceC1631620sYq interfaceC1631620sYq) {
        int iCode;
        RealApi realApi = (RealApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://api.tiktokv.com/").create(RealApi.class);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
        }
        try {
            interfaceC1631620sYq.invoke(null, realApi.doPostJson(-1, str, null, new TypedByteArray("application/json", str2.getBytes(Charsets.UTF_8), new String[0]), arrayList, false).execute().LIZIZ, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof C09HQ) {
                iCode = ((C09HQ) e).code() + C386801es.DEFAULT;
            } else if (e instanceof C564610MCl) {
                iCode = -9900;
            } else if (e instanceof RuntimeException) {
                iCode = -9990;
            } else {
                iCode = -9999;
            }
            interfaceC1631620sYq.invoke(Integer.valueOf(iCode), null, e);
        }
    }
}
