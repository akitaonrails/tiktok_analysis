package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class BadgeDetail {

    @C09CT("badge")
    public Badge badge;

    @C09CT("badge_abbr_audit_info")
    public AuditInfo badgeAbbrAuditInfo;

    @C09CT("badge_abbr_audit_status")
    public int badgeAbbrAuditStatus;

    @C09CT("badge_desc_audit_info")
    public AuditInfo badgeDescAuditInfo;

    @C09CT("badge_desc_audit_status")
    public int badgeDescAuditStatus;

    @C09CT("exist")
    public boolean exist;

    @C09CT("preview_list")
    public List<BadgePreview> previewList = new ArrayList();
}
