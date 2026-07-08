package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.batchmanage.api;

import X.C01GW;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class BatchManageApiManager {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(129));

    public interface BatchManageApi {
        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/privacy/user/posts/setting/update/v1")
        C11NZ<BaseResponse> setPrivacySettingBatch(@InterfaceC1501050pAF("field") String str, @InterfaceC1501050pAF("value") long j);
    }
}
