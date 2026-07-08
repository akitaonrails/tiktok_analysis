package com.ss.android.ugc.aweme.creatorcenter.settings;

import X.C0X52;
import X.C0X9S;
import X.C501901xR;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public interface AiStudioApi {
    public static final C501901xR LIZ = C501901xR.LIZ;

    @InterfaceC1501160pAQ("/tiktok/v1/creator_bot/settings/")
    C0X9S<String> requestAiStudioSetting();

    @InterfaceC1501160pAQ("/tiktok/v1/creator_bot/settings/")
    Object requestAiStudioSettingSuspend(InterfaceC1364105Vn<? super C0X52<String>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/v1/creator_bot/settings/update/")
    C0X9S<String> updateAiStudioSetting(@InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) int i2);
}
