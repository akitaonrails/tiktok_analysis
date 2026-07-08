package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import com.bytedance.scene.Scene;

/* JADX INFO: loaded from: classes9.dex */
public final class DraftSummaryEntry {
    public static final int $stable = 0;

    @C09CT("creationId")
    public final String creationId;

    @C09CT("duration")
    public final Long duration;

    @C09CT("errorCode")
    public final Integer errorCode;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("sourceId")
    public final String sourceId;

    @C09CT("success")
    public final Boolean success;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("type")
    public final String type;

    public DraftSummaryEntry(Long l, String str, String str2, String str3, Boolean bool, Long l2, Integer num, String str4) {
        this.timestamp = l;
        this.creationId = str;
        this.type = str2;
        this.scene = str3;
        this.success = bool;
        this.duration = l2;
        this.errorCode = num;
        this.sourceId = str4;
    }
}
