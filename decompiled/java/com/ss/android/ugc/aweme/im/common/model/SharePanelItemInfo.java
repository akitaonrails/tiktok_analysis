package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.EnumC1366980lg0;
import X.EnumC1473605pm;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePanelItemInfo {

    @C09CT("flags")
    public final List<Flag> flags;

    @C09CT("gid")
    public final Long gid;

    @C09CT("id_type")
    public final int idType;

    @C09CT("item_type")
    public final int itemType;

    @C09CT("sort_reason")
    public final String sortReason;

    @C09CT("obj_id")
    public final Long takoId;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("uid")
    public final Long uid;

    public SharePanelItemInfo() {
        this(EnumC1473605pm.SHARE_PANEL_ID_TYPE_USER.getValue(), EnumC1366980lg0.SHARE_PANEL_ITEM_TYPE_UNKNOWN.getValue(), null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePanelItemInfo)) {
            return false;
        }
        SharePanelItemInfo sharePanelItemInfo = (SharePanelItemInfo) obj;
        return this.idType == sharePanelItemInfo.idType && this.itemType == sharePanelItemInfo.itemType && Intrinsics.LJFF(this.sortReason, sharePanelItemInfo.sortReason) && Intrinsics.LJFF(this.uid, sharePanelItemInfo.uid) && Intrinsics.LJFF(this.gid, sharePanelItemInfo.gid) && Intrinsics.LJFF(this.takoId, sharePanelItemInfo.takoId) && Intrinsics.LJFF(this.timestamp, sharePanelItemInfo.timestamp) && Intrinsics.LJFF(this.flags, sharePanelItemInfo.flags);
    }

    public SharePanelItemInfo(int i, int i2, String str, Long l, Long l2, Long l3, Long l4, List<Flag> list) {
        this.idType = i;
        this.itemType = i2;
        this.sortReason = str;
        this.uid = l;
        this.gid = l2;
        this.takoId = l3;
        this.timestamp = l4;
        this.flags = list;
    }
}
