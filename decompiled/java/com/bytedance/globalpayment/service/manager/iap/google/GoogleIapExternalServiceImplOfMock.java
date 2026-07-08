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
public class GoogleIapExternalServiceImplOfMock implements GoogleIapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void checkExternalLinkEligibility(InterfaceC1795130woZ interfaceC1795130woZ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void checkPaymentEnvironment(InterfaceC1795160woc interfaceC1795160woc, Context context) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void consumeProduct(boolean z, String str, ConsumeIapProductListener consumeIapProductListener) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public String getBillingCountryCode() {
        return "";
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void getExternalLinkToken(InterfaceC1795140woa interfaceC1795140woa) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public AbstractC1794360wnK getGoogleState(InterfaceC1794400wnO interfaceC1794400wnO, Activity activity) {
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void init(InterfaceC1796280wqQ interfaceC1796280wqQ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void isFeatureSupported(InterfaceC1795160woc interfaceC1795160woc) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public boolean isSupportGooglePay() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void launchExternalLink(Activity activity, C1795000woM c1795000woM, InterfaceC1795150wob interfaceC1795150wob) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void loadBillingConfig() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryHasSubscriptionProducts(InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryProductDetails(List<String> list, boolean z, InterfaceC1792890wkx<AbstractC1791620wiu> interfaceC1792890wkx) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void queryUnAckEdOrderFromChannel(InterfaceC1794840wo6 interfaceC1794840wo6, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setBillingVersionTracking(String str, String str2) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void setGpListener(InterfaceC1794840wo6 interfaceC1794840wo6) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public void triggerInAppMessages(Activity activity, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public PayloadPreferencesService getPayloadPreferencesService() {
        return new PayloadPreferencesServiceImplOfMock();
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.google.GoogleIapExternalService
    public RestoreGoogleOrderService getRestoreGoogleOrderService() {
        return new RestoreGoogleOrderServiceImplOfMock();
    }
}
