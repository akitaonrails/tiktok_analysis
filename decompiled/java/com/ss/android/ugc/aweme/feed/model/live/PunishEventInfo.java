package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class PunishEventInfo implements Serializable {

    @C09CT("duration")
    public Long duration;

    @C09CT("punish_id")
    public String punishId;

    @C09CT("punish_reason")
    public String punishReason;

    @C09CT("punish_type")
    public String punishType;

    @C09CT("punish_type_id")
    public Integer punishTypeId;

    @C09CT("violation_uid")
    public long violationUid;
}
