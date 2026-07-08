package com.ss.android.ugc.aweme.setting.services;

import X.C0C64;
import X.C0WZX;
import X.C1701330uNH;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* JADX INFO: loaded from: classes5.dex */
public final class SettingDependServiceImpl implements ISettingDependService {
    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final String LIZ() {
        return C0C64.LJIILLIIL().LJJ(31744, "login_device_manager_url", "", true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final void LIZIZ(Context context, Aweme aweme) {
        String str = AdSettingsActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) AdSettingsActivity.class);
        intent.putExtra(FollowStatusChangeMethod.PARAM_UID, aweme.getAid());
        AdSettingsActivity.LLJJIJIIJIL = aweme;
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtd4vH0jV94hmuOcrtdAui+1FeyVotucBUSIaK", null));
    }
}
