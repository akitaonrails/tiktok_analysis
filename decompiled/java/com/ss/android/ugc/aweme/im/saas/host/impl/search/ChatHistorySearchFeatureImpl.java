package com.ss.android.ugc.aweme.im.saas.host.impl.search;

import X.C689060R1c;
import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature;
import com.ss.android.ugc.aweme.im.search.api.IMSearchApi;

/* JADX INFO: loaded from: classes11.dex */
public final class ChatHistorySearchFeatureImpl implements ChatHistorySearchFeature {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature
    public final void LIZIZ() {
        IMSearchApi.LIZ.getClass();
        C689060R1c.LIZ().LIZIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature
    public final boolean LIZJ() {
        IMSearchApi.LIZ.getClass();
        Boolean boolLIZIZ = C689060R1c.LIZ().LIZIZ().LIZIZ();
        if (boolLIZIZ != null) {
            return boolLIZIZ.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature
    public final void LIZ(Context context, String str, String str2, String str3) {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//im/search/history");
        smartRouteBuildRoute.withParam("history_target_group_key", str);
        smartRouteBuildRoute.withParam("enter_from_key", "chat_settings");
        smartRouteBuildRoute.withParam("chat_type_key", str2);
        smartRouteBuildRoute.withParam("to_user_id_key", str3);
        smartRouteBuildRoute.open();
    }
}
