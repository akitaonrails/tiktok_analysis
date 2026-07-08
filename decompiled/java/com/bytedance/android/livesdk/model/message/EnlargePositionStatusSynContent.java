package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.List;
import tikcast.linkmic.common.LinkerMediaChangeOperator;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class EnlargePositionStatusSynContent {

    @C09CT("is_enlarge")
    public int isEnlarge;

    @C09CT("operator_info")
    public LinkerMediaChangeOperator operatorInfo;

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("target_pos_identity")
    public PosIdentity targetPosIdentity;

    @C09CT("target_position")
    public String targetPosition = "";

    @C09CT("layout_id")
    public String layoutId = "";

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions = new ArrayList();

    @C09CT("enlarged_positions")
    public List<PosIdentity> enlargedPositions = new ArrayList();
}
