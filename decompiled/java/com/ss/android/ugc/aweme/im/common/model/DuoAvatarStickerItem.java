package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class DuoAvatarStickerItem implements Serializable {

    @C09CT("expression")
    public final String expression;

    @C09CT("user_ids")
    public final List<Long> userIdList;

    public DuoAvatarStickerItem() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuoAvatarStickerItem)) {
            return false;
        }
        DuoAvatarStickerItem duoAvatarStickerItem = (DuoAvatarStickerItem) obj;
        return Intrinsics.LJFF(this.userIdList, duoAvatarStickerItem.userIdList) && Intrinsics.LJFF(this.expression, duoAvatarStickerItem.expression);
    }

    public int hashCode() {
        List<Long> list = this.userIdList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.expression;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public DuoAvatarStickerItem(List<Long> list, String str) {
        this.userIdList = list;
        this.expression = str;
    }
}
