package com.bytedance.hybrid.common.autoservice;

import X.C587540N2q;
import X.InterfaceC1539450qAB;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkAioDevtool implements ISparkAioDevtool {
    public static final SparkAioDevtool INSTANCE = new SparkAioDevtool();
    public final /* synthetic */ ISparkAioDevtool $$delegate_0;

    @Override // com.bytedance.hybrid.common.autoservice.ISparkAioDevtool
    public void checkLatest(InterfaceC1539450qAB interfaceC1539450qAB) {
        this.$$delegate_0.checkLatest(interfaceC1539450qAB);
    }

    public SparkAioDevtool() {
        C587540N2q.LIZ.getClass();
        ISparkAioDevtool iSparkAioDevtool = (ISparkAioDevtool) C587540N2q.LIZ(ISparkAioDevtool.class);
        this.$$delegate_0 = iSparkAioDevtool == null ? new SparkAioDevtoolEmptyImpl() : iSparkAioDevtool;
    }
}
