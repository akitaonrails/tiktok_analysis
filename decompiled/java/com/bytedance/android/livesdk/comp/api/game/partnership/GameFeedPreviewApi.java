package com.bytedance.android.livesdk.comp.api.game.partnership;

import X.C470590Icr;
import X.C780150Uiz;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import webcast.api.partnership.FypDropsDetailResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface GameFeedPreviewApi {
    public static final C780150Uiz LIZ = C780150Uiz.LIZ;

    @InterfaceC1501160pAQ("/webcast/partnership/reward/fyp_drops_detail/")
    Object doFypDropsDetail(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("drops_id") String str2, InterfaceC1364105Vn<? super C470590Icr<FypDropsDetailResponse.ResponseData>> interfaceC1364105Vn);
}
