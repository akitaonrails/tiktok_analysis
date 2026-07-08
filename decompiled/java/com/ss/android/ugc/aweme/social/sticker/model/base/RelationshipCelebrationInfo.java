package com.ss.android.ugc.aweme.social.sticker.model.base;

import X.C09CT;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class RelationshipCelebrationInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("celebrating_targets")
    public final List<RelationshipCelebrationTarget> celebratingTargets;

    @C09CT("celebration_end_time")
    public final Long celebrationEndTime;

    @C09CT("celebration_start_time")
    public final Long celebrationStartTime;

    @C09CT("celebration_type")
    public final Integer celebrationType;

    public RelationshipCelebrationInfo() {
        this(null, null, null, null);
    }

    public RelationshipCelebrationInfo(Integer num, List<RelationshipCelebrationTarget> list, Long l, Long l2) {
        this.celebrationType = num;
        this.celebratingTargets = list;
        this.celebrationStartTime = l;
        this.celebrationEndTime = l2;
    }
}
