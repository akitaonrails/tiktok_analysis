package com.ss.android.ugc.aweme.tools.draft.api;

import X.C572950MdZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes9.dex */
public interface DraftNotificationApi {
    public static final C572950MdZ LIZ = C572950MdZ.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/draft/followup_notification")
    Object postDraftNotification(@InterfaceC1501050pAF("draft_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
