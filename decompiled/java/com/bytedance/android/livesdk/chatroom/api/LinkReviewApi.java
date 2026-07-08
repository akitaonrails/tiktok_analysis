package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC19484711Kz;
import X.C470590Icr;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.scene.Scene;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface LinkReviewApi {
    @InterfaceC1501160pAQ("/webcast/review/get_latest_ban_record/")
    AbstractC19484711Kz<C470590Icr<LatestBanRecordInfo>> bannedInfo(@InterfaceC1501070pAH("ban_type") int i);

    @InterfaceC1501160pAQ("/webcast/perception/violation/status/")
    AbstractC19484711Kz<C470590Icr<ViolationStatusResponse.ResponseData>> requestViolation(@InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i);
}
