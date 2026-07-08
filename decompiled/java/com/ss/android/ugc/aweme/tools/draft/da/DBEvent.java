package com.ss.android.ugc.aweme.tools.draft.da;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class DBEvent {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("new_db_version")
    public final int newDBVersion;

    @C09CT("old_db_version")
    public final int oldDBVersion;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("utc_time")
    public final String utcTime;

    @C09CT("update_version_code")
    public final int versionCode;

    public DBEvent() {
        this("", -1, -1, -1, 0L, "");
    }

    public DBEvent(String str, int i, int i2, int i3, long j, String str2) {
        this.eventName = str;
        this.oldDBVersion = i;
        this.newDBVersion = i2;
        this.versionCode = i3;
        this.timestamp = j;
        this.utcTime = str2;
    }
}
