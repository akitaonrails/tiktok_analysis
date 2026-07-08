package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.AbstractC1494940p0O;
import X.InterfaceC1494090oz1;
import X.InterfaceC1495580p1Q;

/* JADX INFO: loaded from: classes24.dex */
public class OkHttpEventFactory implements InterfaceC1494090oz1 {
    public InterfaceC1494090oz1 originFactory;

    public OkHttpEventFactory(InterfaceC1494090oz1 interfaceC1494090oz1) {
        this.originFactory = interfaceC1494090oz1;
    }

    @Override // X.InterfaceC1494090oz1
    public AbstractC1494940p0O create(InterfaceC1495580p1Q interfaceC1495580p1Q) {
        AbstractC1494940p0O abstractC1494940p0OCreate;
        InterfaceC1494090oz1 interfaceC1494090oz1 = this.originFactory;
        if (interfaceC1494090oz1 != null) {
            abstractC1494940p0OCreate = interfaceC1494090oz1.create(interfaceC1495580p1Q);
        } else {
            abstractC1494940p0OCreate = null;
        }
        return new OkHttpEventListener(abstractC1494940p0OCreate);
    }
}
