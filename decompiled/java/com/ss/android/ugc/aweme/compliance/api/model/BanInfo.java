package com.ss.android.ugc.aweme.compliance.api.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class BanInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("ban_expire_time_ms")
    public final Long banExpireTimeMs;

    @C09CT("ban_platform")
    public final Integer banPlatform;

    @C09CT("ban_type")
    public final Integer banType;

    public BanInfo() {
        this(0, 0, 0L);
    }

    public BanInfo(Integer num, Integer num2, Long l) {
        this.banType = num;
        this.banPlatform = num2;
        this.banExpireTimeMs = l;
    }
}
