package com.bytedance.android.performanhtune;

import X.C006A;
import X.C0IKU;
import X.C319230CfJ;
import X.EnumC1101430elh;
import X.EnumC480200IsM;
import X.InterfaceC482090IvP;
import X.RunnableC519000KXa;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public interface IPTFService extends C006A {
    void FA2(EnumC1101430elh enumC1101430elh, InterfaceC482090IvP interfaceC482090IvP);

    <T> C0IKU<T> P71(String str, EnumC1101430elh enumC1101430elh, Map<String, ? extends Object> map, Class<T> cls);

    void S5(EnumC480200IsM enumC480200IsM);

    Map SA();

    long So0(RunnableC519000KXa runnableC519000KXa);

    void a70(long j);

    void ph1(EnumC1101430elh enumC1101430elh);

    void xe0(String str, C319230CfJ c319230CfJ);
}
