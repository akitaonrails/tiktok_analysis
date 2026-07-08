package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class NoteContent {

    @C09CT("audit_info")
    public AuditInfo auditInfo;

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("note_content_display_order")
    public int noteContentDisplayOrder;

    @C09CT("note_content_image")
    public ImageModel noteContentImage;

    @C09CT("note_content_text")
    public String noteContentText = "";

    @C09CT("note_content_type")
    public int noteContentType;

    @C09CT("note_time_ms")
    public long noteTimeMs;
}
