package com.ss.android.ugc.aweme.compliance.agegate.data;

import X.C1785210wYZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface BirthdayCelebrationSettingsApi {
    public static final C1785210wYZ LIZ = C1785210wYZ.LIZ;

    @InterfaceC1501170pAR("/tiktok/age/celebrate/birthday/update/")
    Object updateCelebrateBirthday(@InterfaceC1485405rg TikTokAgeCelebrateBirthdayUpdateRequest tikTokAgeCelebrateBirthdayUpdateRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
