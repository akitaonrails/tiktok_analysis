package com.bytedance.globalpayment.service.manager.iap.google;

import X.AbstractC1791620wiu;
import X.AbstractC1794360wnK;
import X.C1795000woM;
import X.InterfaceC1792890wkx;
import X.InterfaceC1794400wnO;
import X.InterfaceC1794730wnv;
import X.InterfaceC1794840wo6;
import X.InterfaceC1795130woZ;
import X.InterfaceC1795140woa;
import X.InterfaceC1795150wob;
import X.InterfaceC1795160woc;
import X.InterfaceC1796280wqQ;
import android.app.Activity;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public interface GoogleIapExternalService {
    void checkExternalLinkEligibility(InterfaceC1795130woZ interfaceC1795130woZ);

    void checkPaymentEnvironment(InterfaceC1795160woc interfaceC1795160woc, Context context);

    void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener);

    String getBillingCountryCode();

    void getExternalLinkToken(InterfaceC1795140woa interfaceC1795140woa);

    AbstractC1794360wnK getGoogleState(InterfaceC1794400wnO interfaceC1794400wnO, Activity activity);

    PayloadPreferencesService getPayloadPreferencesService();

    RestoreGoogleOrderService getRestoreGoogleOrderService();

    void init(InterfaceC1796280wqQ interfaceC1796280wqQ);

    void isFeatureSupported(InterfaceC1795160woc interfaceC1795160woc);

    boolean isSupportGooglePay();

    void launchExternalLink(Activity activity, C1795000woM c1795000woM, InterfaceC1795150wob interfaceC1795150wob);

    void loadBillingConfig();

    void queryHasSubscriptionProducts(InterfaceC1794730wnv interfaceC1794730wnv);

    void queryProductDetails(List<String> list, boolean z, InterfaceC1792890wkx<AbstractC1791620wiu> interfaceC1792890wkx);

    void queryUnAckEdOrderFromChannel(InterfaceC1794840wo6 interfaceC1794840wo6, String str);

    void setBillingVersionTracking(String str, String str2);

    void setGpListener(InterfaceC1794840wo6 interfaceC1794840wo6);

    void triggerInAppMessages(Activity activity, String str);
}
