package webcast.api.sub;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.AuditInfo;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceInfo {

    @C09CT("audit_status")
    public int auditStatus;

    @C09CT("violation_info")
    public AuditInfo violationInfo;

    @C09CT("title")
    public String title = "";

    @C09CT("desc")
    public String desc = "";
}
