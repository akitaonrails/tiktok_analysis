package com.ss.android.ugc.aweme.im.service.impl.privacy;

import X.AbstractC19484711Kz;
import X.C894170Z5z;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;

/* JADX INFO: loaded from: classes15.dex */
public interface UserSettingService {
    public static final C894170Z5z LIZ = C894170Z5z.LIZ;

    @InterfaceC1501160pAQ("/aweme/v1/user/settings/")
    AbstractC19484711Kz<PushSettings> getUserSettings(@InterfaceC1501070pAH("last_settings_version") String str);
}
