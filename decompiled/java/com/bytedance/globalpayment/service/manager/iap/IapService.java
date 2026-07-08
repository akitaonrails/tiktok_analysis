package com.bytedance.globalpayment.service.manager.iap;

import X.C1792170wjn;
import X.C1792240wju;
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
public interface IapService {
    void addIapObserver(InterfaceC1794730wnv interfaceC1794730wnv);

    void checkExternalLinkEligibility(EnumC1791830wjF enumC1791830wjF, InterfaceC1795130woZ interfaceC1795130woZ);

    void checkPaymentEnvironment(EnumC1791830wjF enumC1791830wjF, InterfaceC1795160woc interfaceC1795160woc, Context context);

    String getBillingCountryCode();

    void getExternalLinkToken(EnumC1791830wjF enumC1791830wjF, InterfaceC1795140woa interfaceC1795140woa);

    boolean hasInitEd();

    boolean isSupportPaymentMethod(EnumC1791830wjF enumC1791830wjF);

    void launchExternalLink(EnumC1791830wjF enumC1791830wjF, Activity activity, String str, InterfaceC1795150wob interfaceC1795150wob);

    void newPay(Activity activity, C1792170wjn c1792170wjn, InterfaceC1794730wnv interfaceC1794730wnv);

    void onAppResume();

    void queryCommonProductDetails(List<String> list, String str, InterfaceC1791680wj0 interfaceC1791680wj0);

    void queryHasSubscriptionProducts(EnumC1791830wjF enumC1791830wjF, InterfaceC1794730wnv interfaceC1794730wnv);

    void queryProductDetails(EnumC1791830wjF enumC1791830wjF, List<String> list, String str, InterfaceC1794730wnv interfaceC1794730wnv);

    void querySubscriptionDetails(EnumC1791830wjF enumC1791830wjF, List<String> list, String str, InterfaceC1794730wnv interfaceC1794730wnv);

    void removeIapObserver(InterfaceC1794730wnv interfaceC1794730wnv);

    void subscriptionPreCheck(C1792240wju c1792240wju, InterfaceC1791550win interfaceC1791550win);

    void triggerInAppMessages(Activity activity, String str);

    void updateHost(String str);
}
