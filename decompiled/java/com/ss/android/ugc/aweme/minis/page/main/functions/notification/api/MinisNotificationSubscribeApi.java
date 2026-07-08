package com.ss.android.ugc.aweme.minis.page.main.functions.notification.api;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2661011f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.MinisInboxSubscriptionStatusResponse;

/* JADX INFO: loaded from: classes.dex */
public final class MinisNotificationSubscribeApi implements IMinisNotificationSubscribeApi {
    public static final MinisNotificationSubscribeApi LIZIZ = new MinisNotificationSubscribeApi();
    public final /* synthetic */ IMinisNotificationSubscribeApi LIZ;

    @Override // com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.IMinisNotificationSubscribeApi
    @InterfaceC1501160pAQ("/tiktok/minis/inbox/subscription/status/")
    public Object queryInboxSubscriptionStatus(@InterfaceC1501070pAH("client_key") String str, InterfaceC1364105Vn<? super MinisInboxSubscriptionStatusResponse> interfaceC1364105Vn) {
        return this.LIZ.queryInboxSubscriptionStatus(str, interfaceC1364105Vn);
    }

    @Override // com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.IMinisNotificationSubscribeApi
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/minis/inbox/subscription/update")
    public Object updateInboxSubscription(@InterfaceC1501050pAF("client_key") String str, @InterfaceC1501050pAF("action") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return this.LIZ.updateInboxSubscription(str, i, interfaceC1364105Vn);
    }

    public MinisNotificationSubscribeApi() {
        InterfaceC2661011f interfaceC2661011fLIZ;
        IMinisNotificationSubscribeApi iMinisNotificationSubscribeApi;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        this.LIZ = (iRetrofitFactory == null || (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) == null || (iMinisNotificationSubscribeApi = (IMinisNotificationSubscribeApi) interfaceC2661011fLIZ.create(IMinisNotificationSubscribeApi.class)) == null) ? new IMinisNotificationSubscribeApi() { // from class: X.00CA
            @Override // com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.IMinisNotificationSubscribeApi
            public final Object queryInboxSubscriptionStatus(String str, InterfaceC1364105Vn<? super MinisInboxSubscriptionStatusResponse> interfaceC1364105Vn) {
                return new MinisInboxSubscriptionStatusResponse(null);
            }

            @Override // com.ss.android.ugc.aweme.minis.page.main.functions.notification.api.IMinisNotificationSubscribeApi
            public final Object updateInboxSubscription(String str, int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
                return new BaseResponse();
            }
        } : iMinisNotificationSubscribeApi;
    }
}
