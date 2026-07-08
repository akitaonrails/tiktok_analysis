package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class PublisherVideoAppealInfo {

    @C09CT("appeal_reject_reason")
    public int appealRejectReason;

    @C09CT("appeal_status")
    public int appealStatus;

    @C09CT("violation_reason")
    public int violationReason;

    @C09CT("appeal_reason")
    public String appealReason = "";

    @C09CT("violation_reason_list")
    public List<Integer> violationReasonList = new ArrayList();

    @C09CT("appeal_reject_reason_list")
    public List<Integer> appealRejectReasonList = new ArrayList();
}
