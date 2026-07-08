package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CertificationRecord {

    @C09CT("aim_level")
    public int aimLevel;

    @C09CT("certification_result")
    public int certificationResult;

    @C09CT("certification_type")
    public int certificationType;

    @C09CT("finish_time")
    public long finishTime;

    @C09CT("manual_audit_fail_tag")
    public List<Text> manualAuditFailTag = new ArrayList();

    @C09CT("new_level")
    public int newLevel;

    @C09CT("old_level")
    public int oldLevel;

    @C09CT("record_id")
    public long recordId;

    @C09CT("start_time")
    public long startTime;

    @C09CT("trigger_source")
    public int triggerSource;
}
