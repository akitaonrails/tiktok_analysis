package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class FakeWritingConfig {

    @C09CT("max_client_generate_streak_data_day")
    public final int maxFakeWriteDays;

    @C09CT("client_interaction_record_size")
    public final int maxInteractionRecordSize;

    public FakeWritingConfig() {
        this(3, 7);
    }

    public FakeWritingConfig(int i, int i2) {
        this.maxFakeWriteDays = i;
        this.maxInteractionRecordSize = i2;
    }
}
