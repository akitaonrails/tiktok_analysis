package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class SpotlightItem {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("create_time_second")
    public long createTimeSecond;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_pinned")
    public boolean isPinned;

    @C09CT("review_status")
    public int reviewStatus;
}
