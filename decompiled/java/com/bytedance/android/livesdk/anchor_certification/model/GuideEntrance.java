package com.bytedance.android.livesdk.anchor_certification.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GuideEntrance {

    @C09CT("description")
    public Text description;

    @C09CT("level")
    public int level;

    @C09CT("level_up_info")
    public GuideEntranceLevelUpInfo levelUpInfo;

    @C09CT("style")
    public int style;

    @C09CT("task_info")
    public GuideEntranceTaskInfo taskInfo;

    @C09CT("title")
    public Text title;

    @C09CT("type")
    public int type;

    @C09CT("icons")
    public List<ImageModel> icons = new ArrayList();

    @C09CT("module_type")
    public String moduleType = "";
}
