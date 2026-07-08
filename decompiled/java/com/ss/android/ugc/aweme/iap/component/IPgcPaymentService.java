package com.ss.android.ugc.aweme.iap.component;

import X.AbstractC19484711Kz;
import X.C1616830sAz;
import X.C1616880sB4;
import X.C717310SBt;
import X.C717330SBv;
import X.EnumC1615550s8v;
import X.EnumC1616780sAu;
import com.ss.android.ugc.aweme.iap.component.api.PaymentComponentResponse;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public interface IPgcPaymentService {
    void LIZ(Map<String, String> map);

    void LIZIZ(int i);

    void LIZJ(C1616880sB4 c1616880sB4);

    void LIZLLL(Object obj);

    void LJ(C1616880sB4 c1616880sB4);

    void LJFF(String str, String str2, String str3, Map<String, String> map, Map<String, ? extends Object> map2, Function0<Unit> function0);

    void LJI(String str);

    void LJII(String str, PaymentComponentResponse paymentComponentResponse);

    AbstractC19484711Kz<PaymentComponentResponse> LJIIIIZZ(C1616880sB4 c1616880sB4);

    List<C1616830sAz> LJIIIZ(int i);

    Map LJIIJ(String str);

    String LJIIJJI(EnumC1616780sAu enumC1616780sAu, EnumC1615550s8v enumC1615550s8v);

    void LJIIL(int i, List list);

    Object LJIILIIL(C1616880sB4 c1616880sB4, C717310SBt c717310SBt, C717330SBv c717330SBv);

    boolean LJIILJJIL();

    String getPriceRegion();

    List<Class<?>> provideXBridgetIDLMethodListForLynxPrefetch();
}
