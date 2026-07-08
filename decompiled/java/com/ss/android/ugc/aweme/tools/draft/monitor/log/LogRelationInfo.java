package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class LogRelationInfo {
    public static final int $stable = 0;

    @C09CT("sourceId")
    public final String sourceId;

    @C09CT("sourceVersion")
    public final Integer sourceVersion;

    @C09CT("type")
    public final String type;

    public LogRelationInfo(String str, String str2, Integer num) {
        this.type = str;
        this.sourceId = str2;
        this.sourceVersion = num;
    }
}
