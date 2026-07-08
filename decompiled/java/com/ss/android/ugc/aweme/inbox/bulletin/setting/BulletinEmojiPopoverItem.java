package com.ss.android.ugc.aweme.inbox.bulletin.setting;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class BulletinEmojiPopoverItem {

    @C09CT("bulletin_popover_emoji_content")
    public final List<String> content;

    @C09CT("bulletin_popover_emoji_size")
    public final Integer size;

    public BulletinEmojiPopoverItem() {
        this(null, null);
    }

    public BulletinEmojiPopoverItem(List<String> list, Integer num) {
        this.content = list;
        this.size = num;
    }
}
