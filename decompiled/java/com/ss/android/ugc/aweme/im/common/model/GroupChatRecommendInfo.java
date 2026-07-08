package com.ss.android.ugc.aweme.im.common.model;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class GroupChatRecommendInfo implements Serializable {

    @C09CT("avatar_dark_url")
    public final String avatarDarkUrl;

    @C09CT("avatar_url")
    public final String avatarUrl;

    @C09CT("button_copy")
    public final String buttonCopy;

    @C09CT("event_tracking")
    public final GroupRecEventTracking eventTracking;

    @C09CT("rec_user_ids")
    public final List<Long> recUserIds;

    @C09CT("scheme_url")
    public final String schemeUrl;

    public GroupChatRecommendInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GroupChatRecommendInfo(String str, String str2, String str3, String str4, List<Long> list, GroupRecEventTracking groupRecEventTracking) {
        this.avatarUrl = str;
        this.avatarDarkUrl = str2;
        this.schemeUrl = str3;
        this.buttonCopy = str4;
        this.recUserIds = list;
        this.eventTracking = groupRecEventTracking;
    }

    public GroupChatRecommendInfo(String str, String str2, String str3, String str4, List list, GroupRecEventTracking groupRecEventTracking, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? C13BV.INSTANCE : list, (i & 32) != 0 ? null : groupRecEventTracking);
    }
}
