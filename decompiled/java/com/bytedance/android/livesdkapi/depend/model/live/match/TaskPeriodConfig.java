package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class TaskPeriodConfig {

    @C09CT("click_action")
    public int clickAction;

    @C09CT("click_action_schema_url")
    public String clickActionSchemaUrl = "";

    @C09CT("click_prompt")
    public BattlePrompt clickToastPrompt;

    @C09CT("duration")
    public long duration;

    @C09CT("icon_image")
    public ImageModel icon;

    @C09CT("progress_target")
    public long progressTarget;

    @C09CT("prompt_type")
    public int promptType;

    @C09CT("target_start_timestamp")
    public long targetStartTimestamp;

    @C09CT("target_type")
    public int targetType;

    @C09CT("target_start_time")
    public long taskStartTime;

    @C09CT("static_prompt")
    public BattlePrompt taskStaticPrompt;
}
