package com.ss.android.ugc.aweme.inbox.bulletin.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BulletinEmojiConfigItem implements Serializable {
    public static final int $stable = 8;

    @C09CT("emoji")
    public final List<String> emoji;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinEmojiConfigItem(emoji=");
        sbLIZ.append(this.emoji);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BulletinEmojiConfigItem(List<String> list) {
        this.emoji = list;
    }
}
