package com.ss.android.ugc.aweme.vibefeed.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeItemStatus {

    @C09CT("item_id")
    public final String itemId;

    @C09CT("liked_uids")
    public final List<String> likedUids;

    public VibeItemStatus() {
        this(null, null, 3, null);
    }

    public VibeItemStatus(String str, List<String> list) {
        this.itemId = str;
        this.likedUids = list;
    }

    public VibeItemStatus(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}
