package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class PollingInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("interval_millisecond")
    public final Long interval;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("params")
    public final String params;

    @C09CT("path")
    public final String path;

    @C09CT("timeout_millisecond")
    public final Long timeout;

    public PollingInfo() {
        this(Boolean.FALSE, 3000L, 30, 1000L, "", "");
    }

    public PollingInfo(Boolean bool, Long l, Integer num, Long l2, String str, String str2) {
        this.enable = bool;
        this.interval = l;
        this.limit = num;
        this.timeout = l2;
        this.path = str;
        this.params = str2;
    }
}
