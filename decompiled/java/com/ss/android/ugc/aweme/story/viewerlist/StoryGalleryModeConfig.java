package com.ss.android.ugc.aweme.story.viewerlist;

import X.C07N8;
import X.C09CT;
import X.C1697810uHb;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StoryGalleryModeConfig implements Serializable {

    @C09CT("register_panel")
    public final List<Integer> registerPanel;
    public static final C07N8 Companion = new Object() { // from class: X.07N8
    };
    public static final int $stable = 8;
    public static final List<Integer> defaultInteractionList = C1697810uHb.LJIIJJI(1, 4);

    public StoryGalleryModeConfig() {
        this(defaultInteractionList);
    }

    public final boolean hasCommentPanel() {
        List<Integer> list = this.registerPanel;
        return list != null && list.contains(1);
    }

    public StoryGalleryModeConfig(List<Integer> list) {
        this.registerPanel = list;
    }
}
