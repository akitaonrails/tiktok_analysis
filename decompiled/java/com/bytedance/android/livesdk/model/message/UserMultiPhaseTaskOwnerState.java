package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UserMultiPhaseTaskOwnerState {

    @C09CT("feature_meta")
    public FeatureMeta featureMeta;

    @C09CT("owner_uid")
    public long ownerUid;

    @C09CT("round_idx")
    public int roundIdx;

    @C09CT("task_repeated_times")
    public int taskRepeatedTimes;

    @C09CT("total_repeat_times")
    public int totalRepeatTimes;

    @C09CT("current_phase_idx")
    public String currentPhaseIdx = "";

    @C09CT("phases")
    public List<UserMultiPhaseTaskOwnerPhase> phases = new ArrayList();

    @C09CT("state_id")
    public String stateId = "";
}
