package com.ss.android.ugc.aweme.tools.draft.monitor.log;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DraftLogEntry {
    public static final int $stable = 8;

    @C09CT("duration")
    public final Long duration;

    @C09CT("error")
    public final LogErrorInfo error;

    @C09CT("extra")
    public final Map<String, Object> extra;

    @C09CT("isFirstSave")
    public final Boolean isFirstSave;

    @C09CT("relation")
    public final LogRelationInfo relation;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("stackTrace")
    public final List<String> stackTrace;

    @C09CT("stage")
    public final String stage;

    @C09CT("steps")
    public final List<LogStepInfo> steps;

    @C09CT("success")
    public final Boolean success;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("type")
    public final String type;

    @C09CT("version")
    public final Integer version;

    public final Boolean isFirstSave() {
        return this.isFirstSave;
    }

    public DraftLogEntry(Long l, String str, Integer num, String str2, String str3, Boolean bool, LogErrorInfo logErrorInfo, Long l2, List<String> list, List<LogStepInfo> list2, LogRelationInfo logRelationInfo, Boolean bool2, Map<String, ? extends Object> map) {
        this.timestamp = l;
        this.type = str;
        this.version = num;
        this.scene = str2;
        this.stage = str3;
        this.success = bool;
        this.error = logErrorInfo;
        this.duration = l2;
        this.stackTrace = list;
        this.steps = list2;
        this.relation = logRelationInfo;
        this.isFirstSave = bool2;
        this.extra = map;
    }
}
