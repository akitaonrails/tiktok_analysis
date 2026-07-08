package com.ss.android.ugc.aweme.prop.impl;

import X.C2188811AlT;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.model.EffectCreatorCenterRankListConfig;
import com.ss.android.ugc.aweme.model.EffectCreatorRankListConfig;
import com.ss.android.ugc.aweme.tools.ICreatorCenterApi;
import java.net.URLEncoder;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class CreatorCenterApiImpl implements ICreatorCenterApi {
    @Override // com.ss.android.ugc.aweme.tools.ICreatorCenterApi
    public final void LIZ(Context context, int i, String str, String str2, String str3) {
        String strLIZIZ;
        StringBuilder sb = new StringBuilder("effect_source=");
        sb.append(i);
        sb.append("&effect_id=");
        sb.append(str);
        sb.append("&enter_from=");
        sb.append(str2);
        if (str3 != null && str3.length() != 0) {
            sb.append("&leaderboard_type=");
            sb.append(str3);
        }
        EffectCreatorRankListConfig effectCreatorRankListConfig = EffectCreatorCenterRankListConfig.get();
        if (u.LJIIZILJ(effectCreatorRankListConfig.url, "?", false)) {
            strLIZIZ = effectCreatorRankListConfig.url;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(effectCreatorRankListConfig.url);
            sbLIZ.append('?');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(URLEncoder.encode(sb.toString()));
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(effectCreatorRankListConfig.container);
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(effectCreatorRankListConfig.containerParam);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("openEffectCreatorRankListPage: ");
        sbLIZ4.append(strLIZIZ3);
        ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI("CreatorCenterApiImpl", C2188811AlT.LIZIZ(sbLIZ4));
        SmartRouter.buildRoute(context, strLIZIZ3).open();
    }
}
