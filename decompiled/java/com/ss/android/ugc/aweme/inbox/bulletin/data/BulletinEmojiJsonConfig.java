package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinEmojiJsonConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("emojiList")
    public final List<BulletinEmojiGroup> group;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiJsonConfig(group=");
        sbLIZ.append(this.group);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinEmojiJsonConfig(List<BulletinEmojiGroup> list) {
        this.group = list;
    }
}
