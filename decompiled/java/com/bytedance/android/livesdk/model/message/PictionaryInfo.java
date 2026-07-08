package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PictionaryInfo {

    @C09CT("draw_url")
    public ImageModel drawUrl;

    @C09CT("end_time")
    public long endTime;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("pictionary_type")
    public int pictionaryType;

    @C09CT("session_id")
    public long sessionId;

    @C09CT("start_time")
    public long startTime;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("word")
    public String word = "";
}
