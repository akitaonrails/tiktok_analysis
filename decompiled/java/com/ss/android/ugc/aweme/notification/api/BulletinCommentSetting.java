package com.ss.android.ugc.aweme.notification.api;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinCommentSetting {
    public static final int $stable = 8;

    @C09CT("allow_item_types")
    public final List<BulletinCommentAllowItemType> allowItemTypes;

    @C09CT("comment_enable")
    public final Boolean commentEnable;

    public BulletinCommentSetting() {
        this(null, null);
    }

    public final BulletinCommentSetting copy(Boolean bool, List<BulletinCommentAllowItemType> list) {
        return new BulletinCommentSetting(bool, list);
    }

    public BulletinCommentSetting(Boolean bool, List<BulletinCommentAllowItemType> list) {
        this.commentEnable = bool;
        this.allowItemTypes = list;
    }
}
