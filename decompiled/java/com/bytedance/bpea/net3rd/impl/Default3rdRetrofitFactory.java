package com.bytedance.bpea.net3rd.impl;

import X.C0X8S;
import X.C1515130pWx;
import X.InterfaceC846390XIf;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;

/* JADX INFO: loaded from: classes24.dex */
public final class Default3rdRetrofitFactory implements I3rdRetrofitFactory {
    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final InterfaceC846390XIf LIZIZ() {
        return new C1515130pWx();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final C0X8S create() {
        return new C1515130pWx().LJFF();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final C0X8S LIZ(String str) {
        return new C1515130pWx(str).LJFF();
    }

    @Override // com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory
    public final InterfaceC846390XIf createBuilder(String str) {
        return new C1515130pWx(str);
    }
}
