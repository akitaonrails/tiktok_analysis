package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class BoostCard {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long mCardId;

    @C09CT("task_id")
    public long mTaskId;

    @C09CT("task_source")
    public int mTaskSource;
}
