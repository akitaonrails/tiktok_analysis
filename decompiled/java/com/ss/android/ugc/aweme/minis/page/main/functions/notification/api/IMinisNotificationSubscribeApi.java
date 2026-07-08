package com.ss.android.ugc.aweme.minis.page.main.functions.notification.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes.dex */
public interface IMinisNotificationSubscribeApi {
    @InterfaceC1501160pAQ("/tiktok/minis/inbox/subscription/status/")
    Object queryInboxSubscriptionStatus(@InterfaceC1501070pAH("client_key") String str, InterfaceC1364105Vn<? super MinisInboxSubscriptionStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/minis/inbox/subscription/update")
    Object updateInboxSubscription(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
