package com.ss.android.ugc.feed.platform.popupclean;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class Rule implements Serializable {
    public static final int $stable = 8;

    @C09CT(Scene.SCENE_SERVICE)
    public final List<String> scenes;

    @C09CT("show_strategy")
    public final String showStrategy;

    @C09CT("trigger_id")
    public final List<String> triggerIds;

    public Rule(List<String> list, String str, List<String> list2) {
        this.triggerIds = list;
        this.showStrategy = str;
        this.scenes = list2;
    }
}
