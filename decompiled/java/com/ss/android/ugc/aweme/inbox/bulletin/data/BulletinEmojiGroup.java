package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinEmojiGroup implements Serializable {
    public static final int $stable = 8;

    @C09CT("emojis")
    public final List<BulletinEmojiConfigItem> emojis;

    @C09CT("groupName")
    public final String groupName;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiGroup(groupName=");
        sbLIZ.append(this.groupName);
        sbLIZ.append(", emojis=");
        sbLIZ.append(this.emojis);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinEmojiGroup(String str, List<BulletinEmojiConfigItem> list) {
        this.groupName = str;
        this.emojis = list;
    }
}
