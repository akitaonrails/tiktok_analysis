package com.ss.android.ugc.aweme.avatar.repo.bean;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.story.model.ClientControlParams;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class GroupRelatedInfoRequest {

    @C09CT("client_control_params")
    public final ClientControlParams clientControlParams;

    @C09CT("group_ids")
    public final List<String> groupIds;

    @C09CT("recent_viewed_ids")
    public final String recentViewedIds;

    @C09CT("caller_scene")
    public final String scene;

    public GroupRelatedInfoRequest() {
        this(null, null, null, null, 15, null);
    }

    public GroupRelatedInfoRequest(List<String> list, String str, ClientControlParams clientControlParams, String str2) {
        this.groupIds = list;
        this.scene = str;
        this.clientControlParams = clientControlParams;
        this.recentViewedIds = str2;
    }

    public GroupRelatedInfoRequest(List list, String str, ClientControlParams clientControlParams, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : clientControlParams, (i & 8) != 0 ? null : str2);
    }
}
