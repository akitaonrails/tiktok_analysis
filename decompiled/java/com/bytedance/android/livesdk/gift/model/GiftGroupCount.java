package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class GiftGroupCount {

    @C09CT("group_count")
    public int groupCount;

    @C09CT("group_text")
    public String groupText;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GiftGroupCount)) {
            return false;
        }
        GiftGroupCount giftGroupCount = (GiftGroupCount) obj;
        if (giftGroupCount.groupCount != this.groupCount || !TextUtils.equals(giftGroupCount.groupText, this.groupText)) {
            return false;
        }
        return true;
    }
}
