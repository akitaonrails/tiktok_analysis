package com.ss.android.ugc.aweme.mention.api;

import X.C0CQT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501160pAQ;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes4.dex */
public final class QuickMentionCheckApi implements IQuickMentionCheckApi {
    public static final QuickMentionCheckApi LIZIZ = new QuickMentionCheckApi();
    public final /* synthetic */ IQuickMentionCheckApi LIZ = (IQuickMentionCheckApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(IQuickMentionCheckApi.class);

    @Override // com.ss.android.ugc.aweme.mention.api.IQuickMentionCheckApi
    @InterfaceC1501160pAQ("/tiktok/v1/quick_mention/check")
    public Object quickMentionCheck(InterfaceC1364105Vn<? super QuickMentionCheckResponse> interfaceC1364105Vn) {
        return this.LIZ.quickMentionCheck(interfaceC1364105Vn);
    }
}
