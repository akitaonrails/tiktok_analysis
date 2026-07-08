package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication;

import X.C1487890op1;
import X.C1757320vpa;
import X.C1757350vpd;
import X.InterfaceC1502430pCT;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC494301wD;
import X.InterfaceC634840OvC;
import com.ss.android.ugc.aweme.ecommerce.action.EcommerceActionDto;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public interface ISeaPdpCommunicationService extends InterfaceC494301wD {
    boolean EQ1(String str, Map<String, ? extends Object> map, C1757320vpa c1757320vpa);

    void H6(Object obj, String str);

    void Pd(Object obj, String str, Function0<? extends InterfaceC1502430pCT> function0);

    void Q(InterfaceC634840OvC interfaceC634840OvC, String str);

    void U0(Object obj, String str);

    boolean gV1(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends List<EcommerceActionDto>> map3, C1757320vpa c1757320vpa, C1487890op1 c1487890op1, C1757350vpd c1757350vpd);

    void hc1(String str, Map map, C1757320vpa c1757320vpa, InterfaceC1631620sYq interfaceC1631620sYq);

    void jb(Object obj);

    void kC2(Object obj, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, C1757320vpa c1757320vpa);

    void q2(int i, String str, String str2, Map map);

    void sx(Object obj, String str, InterfaceC1631630sYr<? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super C1757320vpa, Unit> interfaceC1631630sYr);
}
