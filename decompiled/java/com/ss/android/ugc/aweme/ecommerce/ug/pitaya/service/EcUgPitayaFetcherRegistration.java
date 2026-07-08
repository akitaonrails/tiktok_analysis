package com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service;

import X.C2097608Jq;
import X.InterfaceC1179204jO;
import com.ss.android.ugc.aweme.ecommerce.ug.promotion.fetcher.EcUgGetDecisionFetcher;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class EcUgPitayaFetcherRegistration implements IEcUgPitayaFetcherRegistration {
    public static final HashMap<String, Class<? extends InterfaceC1179204jO>> LIZIZ = C2097608Jq.LJI(new Pair("get_decision", EcUgGetDecisionFetcher.class));
    public final ConcurrentHashMap<String, Class<? extends InterfaceC1179204jO>> LIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.ecommerce.ug.pitaya.service.IEcUgPitayaFetcherRegistration
    public final InterfaceC1179204jO LIZ(String str) {
        Constructor<? extends InterfaceC1179204jO> declaredConstructor;
        Constructor<? extends InterfaceC1179204jO> declaredConstructor2;
        InterfaceC1179204jO interfaceC1179204jONewInstance;
        Class<? extends InterfaceC1179204jO> cls = LIZIZ.get(str);
        if (cls == null || (declaredConstructor2 = cls.getDeclaredConstructor(new Class[0])) == null || (interfaceC1179204jONewInstance = declaredConstructor2.newInstance(new Object[0])) == null) {
            Class<? extends InterfaceC1179204jO> cls2 = this.LIZ.get(str);
            if (cls2 != null && (declaredConstructor = cls2.getDeclaredConstructor(new Class[0])) != null) {
                return declaredConstructor.newInstance(new Object[0]);
            }
            return null;
        }
        return interfaceC1179204jONewInstance;
    }
}
