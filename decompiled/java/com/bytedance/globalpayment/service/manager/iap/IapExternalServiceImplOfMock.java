package com.bytedance.globalpayment.service.manager.iap;

import X.AbstractC1794360wnK;
import X.AbstractC1794600wni;
import X.C1792170wjn;
import X.C1792240wju;
import X.C1793950wmf;
import X.EnumC1791830wjF;
import X.InterfaceC1791550win;
import X.InterfaceC1791680wj0;
import X.InterfaceC1794730wnv;
import X.InterfaceC1795130woZ;
import X.InterfaceC1795140woa;
import X.InterfaceC1795150wob;
import X.InterfaceC1795160woc;
import android.app.Activity;
import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class IapExternalServiceImplOfMock implements IapExternalService {
    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void addIapObserver(InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void checkExternalLinkEligibility(EnumC1791830wjF enumC1791830wjF, InterfaceC1795130woZ interfaceC1795130woZ) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void checkPaymentEnvironment(EnumC1791830wjF enumC1791830wjF, InterfaceC1795160woc interfaceC1795160woc, Context context) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void executeUnUploadTokenOrder(EnumC1791830wjF enumC1791830wjF, AbstractC1794600wni abstractC1794600wni, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public String getBillingCountryCode() {
        return "";
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void getExternalLinkToken(EnumC1791830wjF enumC1791830wjF, InterfaceC1795140woa interfaceC1795140woa) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public AbstractC1794360wnK getNextState(AbstractC1794360wnK abstractC1794360wnK) {
        return null;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean hasInitEd() {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void init() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public boolean isSupportPaymentMethod(EnumC1791830wjF enumC1791830wjF) {
        return false;
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void launchExternalLink(EnumC1791830wjF enumC1791830wjF, Activity activity, String str, InterfaceC1795150wob interfaceC1795150wob) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void newPay(Activity activity, C1792170wjn c1792170wjn, InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void onAppResume() {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void onOrderTimeout(C1793950wmf c1793950wmf) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryCommonProductDetails(List<String> list, String str, InterfaceC1791680wj0 interfaceC1791680wj0) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryHasSubscriptionProducts(EnumC1791830wjF enumC1791830wjF, InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void queryProductDetails(EnumC1791830wjF enumC1791830wjF, List<String> list, String str, InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void querySubscriptionDetails(EnumC1791830wjF enumC1791830wjF, List<String> list, String str, InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void removeIapObserver(InterfaceC1794730wnv interfaceC1794730wnv) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void subscriptionPreCheck(C1792240wju c1792240wju, InterfaceC1791550win interfaceC1791550win) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void triggerInAppMessages(Activity activity, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapExternalService
    public void tryRestoreUnAckOrder(EnumC1791830wjF enumC1791830wjF, String str) {
    }

    @Override // com.bytedance.globalpayment.service.manager.iap.IapService
    public void updateHost(String str) {
    }
}
