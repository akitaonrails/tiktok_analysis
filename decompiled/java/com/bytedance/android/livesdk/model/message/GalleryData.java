package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class GalleryData {

    @C09CT("end_time_in_ms")
    public long endTimeInMs;

    @C09CT("period")
    public long period;

    @C09CT("progress")
    public Map<Long, TitleData> progress = new LinkedHashMap();

    public static final class TitleData {

        @C09CT("current_sponsor_id")
        public long currentSponsorId;

        @C09CT("goal_count")
        public long goalCount;
    }
}
