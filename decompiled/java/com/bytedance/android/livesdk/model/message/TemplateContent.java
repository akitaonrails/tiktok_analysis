package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class TemplateContent {

    @C09CT("appeal_status")
    public int appealStatus;

    @C09CT("poll_kind")
    public int pollKind;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("template_id")
    public long templateId;

    @C09CT("template_id_str")
    public String templateIdStr = "";

    @C09CT("violation_id_str")
    public String violationIdStr = "";
}
