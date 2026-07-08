package com.ss.android.ugc.aweme.plugin.tooltipprotection;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class TooltipProtectionModel$TooltipsByScene {

    @C09CT(Scene.SCENE_SERVICE)
    public final int scene;

    @C09CT("type")
    public final List<Integer> tooltips;

    public TooltipProtectionModel$TooltipsByScene(int i, List<Integer> list) {
        this.scene = i;
        this.tooltips = list;
    }
}
