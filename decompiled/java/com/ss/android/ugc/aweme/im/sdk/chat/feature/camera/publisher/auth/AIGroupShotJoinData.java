package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AIGroupShotJoinData implements Serializable {
    public static final int $stable = 0;

    @C09CT("image_info")
    public final AIShotImageInfo imageInfo;

    @C09CT("task_id")
    public final String taskId;

    @C09CT("im_session_id")
    public final String uuid;

    public AIGroupShotJoinData(String str, AIShotImageInfo aIShotImageInfo, String str2) {
        this.taskId = str;
        this.imageInfo = aIShotImageInfo;
        this.uuid = str2;
    }
}
