package com.ss.android.ugc.aweme.story.celebration;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CelebrationExitStrategy implements Serializable {
    public static final int $stable = 8;

    @C09CT("click_inbox_entrance_params")
    public final ClickInboxEntranceParams clickInboxEntranceParams;

    @C09CT("exit_scenes")
    public final List<Integer> exitScenes;

    public CelebrationExitStrategy() {
        this(null, null);
    }

    public CelebrationExitStrategy(List<Integer> list, ClickInboxEntranceParams clickInboxEntranceParams) {
        this.exitScenes = list;
        this.clickInboxEntranceParams = clickInboxEntranceParams;
    }
}
