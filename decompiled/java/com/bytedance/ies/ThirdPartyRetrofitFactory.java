package com.bytedance.ies;

import X.C0X8S;
import X.C1515110pWv;
import X.InterfaceC846390XIf;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;

/* JADX INFO: loaded from: classes14.dex */
public final class ThirdPartyRetrofitFactory implements I3rdRetrofitFactory {
    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final InterfaceC846390XIf LIZIZ() {
        return new C1515110pWv();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final C0X8S create() {
        return new C1515110pWv().LJFF();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final C0X8S LIZ(String str) {
        return new C1515110pWv(str).LJFF();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final InterfaceC846390XIf createBuilder(String str) {
        return new C1515110pWv(str);
    }
}
