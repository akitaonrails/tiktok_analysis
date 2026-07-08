package com.ss.android.ugc.aweme.legoImp.task.region;

import X.C080U;
import X.C0X52;
import X.C0X9S;
import X.C786410Ut5;
import X.InterfaceC1485405rg;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1797990wtB;
import X.InterfaceC2174708fZ;
import X.InterfaceC2174808fa;
import X.InterfaceC2174908fb;
import X.InterfaceC820680WHi;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.ttnet.INetworkApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class RegionNetwork implements InterfaceC1797990wtB {

    public interface RealApi {
        @InterfaceC1501170pAR
        C0X9S<String> doPostJson(@InterfaceC2174908fb int i, @InterfaceC2174708fZ String str, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1485405rg TypedOutput typedOutput, @InterfaceC2174808fa List<C080U> list, @InterfaceC820680WHi boolean z);
    }

    @Override // X.InterfaceC1797990wtB
    public final String LIZIZ(String str, Map map, byte[] bArr) {
        C0X52<String> c0x52Execute = ((INetworkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(INetworkApi.class)).postBody(-1, "region/submit", map, new TypedByteArray("application/json", bArr, new String[0]), new ArrayList()).execute();
        if (c0x52Execute.LIZ.LIZIZ == 200) {
            return c0x52Execute.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC1797990wtB
    public final String LIZ(String str, String str2, Map map, JSONObject jSONObject) {
        TypedString typedString;
        RealApi realApi = (RealApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(RealApi.class);
        if (jSONObject != null) {
            typedString = new TypedString(C786410Ut5.J3(jSONObject));
        } else {
            typedString = null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C080U("Content-Type", "application/json; charset=utf-8"));
        C0X52<String> c0x52Execute = realApi.doPostJson(-1, str2, map, typedString, arrayList, true).execute();
        if (c0x52Execute.LIZ.LIZIZ != 200) {
            return null;
        }
        return c0x52Execute.LIZIZ;
    }
}
