package com.ss.android.ugc.tiktok.pns.utils.network.api;

import X.C102H;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* JADX INFO: loaded from: classes29.dex */
public interface UserSettingsApi {
    public static final C102H LIZ = C102H.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/user/settings/")
    Object getUserSettings(@InterfaceC1501070pAH("last_settings_version") String str, InterfaceC1364105Vn<? super PushSettings> interfaceC1364105Vn);
}
