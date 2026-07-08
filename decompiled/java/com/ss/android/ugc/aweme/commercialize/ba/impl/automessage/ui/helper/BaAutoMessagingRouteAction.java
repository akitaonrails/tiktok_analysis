package com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.helper;

import X.C0WZX;
import X.C1701330uNH;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.route.IRouteAction;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.ui.activity.BaMessageSettingActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes5.dex */
public final class BaAutoMessagingRouteAction implements IRouteAction {
    public static final int $stable = 0;

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_ba_impl_automessage_ui_helper_BaAutoMessagingRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYs/0JaA28T1tjxzAfk65zcGJ6MQmWQZBkNxk1o0ymWm4BLd+nuh7WVqzhRgZadiAhc=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_ba_impl_automessage_ui_helper_BaAutoMessagingRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_ba_impl_automessage_ui_helper_BaAutoMessagingRouteAction_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    @Override // com.bytedance.router.route.IRouteAction
    public Boolean open(Context context, String str, Bundle bundle) {
        BizAccountInfo bizAccountInfo;
        if (context == null) {
            return null;
        }
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ != null && (bizAccountInfo = accountUserServiceLJIIJ.getCurUser().getBizAccountInfo()) != null && bizAccountInfo.enableAutoMsg()) {
            Intent intent = new Intent(context, (Class<?>) BaMessageSettingActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_commercialize_ba_impl_automessage_ui_helper_BaAutoMessagingRouteAction_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
