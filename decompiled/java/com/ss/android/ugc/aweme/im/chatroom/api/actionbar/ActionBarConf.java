package com.ss.android.ugc.aweme.im.chatroom.api.actionbar;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ActionBarConf {

    @C09CT("action_bar_button_conf")
    public final List<ActionBarButtonConf> actionBarButtonConf;

    @C09CT("animated_emoji_resource")
    public final ActionBarResource animatedEmojiResource;

    @C09CT("sticker_resource")
    public final ActionBarResource stickerResource;

    public ActionBarConf() {
        this(null, null, null);
    }

    public ActionBarConf(List<ActionBarButtonConf> list, ActionBarResource actionBarResource, ActionBarResource actionBarResource2) {
        this.actionBarButtonConf = list;
        this.animatedEmojiResource = actionBarResource;
        this.stickerResource = actionBarResource2;
    }
}
