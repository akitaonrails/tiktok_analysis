package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom;

import X.C01CU;
import X.C1005650cHD;
import X.C1005720cHK;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class CustomCheckService implements ISmartCheckService {
    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final boolean LIZIZ(C01CU c01cu) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final C1005650cHD getServiceInfo() {
        Map<String, Integer> map = C1005720cHK.LIZ;
        return new C1005650cHD("custom", C1005720cHK.LIZ.get("custom"));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService
    public final Object LIZJ(C01CU c01cu, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return false;
    }
}
