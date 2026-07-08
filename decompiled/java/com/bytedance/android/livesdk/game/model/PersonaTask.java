package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PersonaTask {

    @C09CT("create_time")
    public long createTime;

    @C09CT("finish_time")
    public long finishTime;

    @C09CT("progress")
    public PersonaTaskProgress progress;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_type")
    public int taskType;

    @C09CT("task_id_str")
    public String taskIdStr = "";

    @C09CT("custom_images")
    public List<PersonaImage> customImages = new ArrayList();

    @C09CT("custom_prompt")
    public String customPrompt = "";

    @C09CT("regenerate_asset_id_str")
    public String regenerateAssetIdStr = "";
}
