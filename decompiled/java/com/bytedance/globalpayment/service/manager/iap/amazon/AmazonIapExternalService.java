package com.bytedance.globalpayment.service.manager.iap.amazon;

import X.AbstractC1791620wiu;
import X.AbstractC1794360wnK;
import X.InterfaceC1792890wkx;
import X.InterfaceC1794400wnO;
import X.InterfaceC1794840wo6;
import X.InterfaceC1795160woc;
import X.InterfaceC1795220woi;
import X.InterfaceC1796280wqQ;
import android.app.Activity;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public interface AmazonIapExternalService {
    void checkPaymentEnvironment(InterfaceC1795160woc interfaceC1795160woc);

    void consumeProduct(String str, ConsumeIapProductListener consumeIapProductListener);

    AbstractC1794360wnK getAmazonState(InterfaceC1794400wnO interfaceC1794400wnO, Activity activity);

    void getAmazonUserId(InterfaceC1795220woi interfaceC1795220woi);

    void init(InterfaceC1796280wqQ interfaceC1796280wqQ);

    boolean isSupportAmazonPay();

    void queryProductDetails(List<String> list, boolean z, InterfaceC1792890wkx<AbstractC1791620wiu> interfaceC1792890wkx);

    void queryUnAckEdOrderFromChannel(InterfaceC1794840wo6 interfaceC1794840wo6, String str);
}
