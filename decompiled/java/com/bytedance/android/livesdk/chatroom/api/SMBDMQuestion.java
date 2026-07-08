package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class SMBDMQuestion {

    @C09CT("form_id")
    public long formId;

    @C09CT("form_id_str")
    public String formIdStr = "";

    @C09CT("form_info")
    public SMBFormInfo formInfo;

    @C09CT("question")
    public ContentAuditStatus question;

    @C09CT("reply")
    public ContentAuditStatus reply;

    @C09CT("with_form")
    public boolean withForm;
}
