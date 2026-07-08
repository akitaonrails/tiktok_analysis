package com.bytedance.android.livesdk.replay.proto;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HighlightEventConfig {

    @C09CT("activities")
    public List<HighlightEvent> activities = new ArrayList();

    @C09CT("test_config")
    public TestConfig testConfig;

    public static final class TestConfig {

        @C09CT("uid_whitelist")
        public List<Long> uidWhitelist = new ArrayList();

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();

        @C09CT("start_end_time")
        public List<TimeRange> startEndTime = new ArrayList();
    }
}
