package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes.dex */
public final class LinkerEnlargeStatusSynContent {

    @C09CT("is_enlarge")
    public int isEnlarge;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    @C09CT("operator_info")
    public LinkerMediaChangeOperator operatorInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("enlarge_linkmic_id")
    public String enlargeLinkmicId = "";

    @C09CT("target_linkmic_id")
    public String targetLinkmicId = "";

    @C09CT("layout_id")
    public String layoutId = "";
}
