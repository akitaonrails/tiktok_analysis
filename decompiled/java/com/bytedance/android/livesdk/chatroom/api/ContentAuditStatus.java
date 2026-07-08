package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class ContentAuditStatus {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("content")
    public String content = "";

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("is_default_content")
    public boolean isDefaultContent;

    @C09CT("pii_content_type")
    public int piiContentType;

    @C09CT("violation_id")
    public long violationId;
}
