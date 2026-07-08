package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class LiveInfoAuditNoticeMessage extends AbstractC1136060ffY {

    @C09CT("audit_content_type")
    public int auditContentType;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("text_starling_key")
    public String textStarlingKey;

    public LiveInfoAuditNoticeMessage() {
        this.type = C001A.LIVE_INFO_AUDIT_NOTICE_MESSAGE;
        this.textStarlingKey = "";
    }
}
