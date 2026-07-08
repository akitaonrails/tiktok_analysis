package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.EnumC1782240wTm;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: loaded from: classes8.dex */
public final class UpdatePayment implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        if (context == null) {
            return Boolean.FALSE;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLFZ().LIZLLL(EnumC1782240wTm.PAYMENT_METHOD, context);
        return Boolean.TRUE;
    }
}
