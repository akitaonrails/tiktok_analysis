package com.bytedance.goda.v2.model.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class GroupFacade implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String groupId;

    @C09CT("items")
    public final List<String> items;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupFacade)) {
            return false;
        }
        GroupFacade groupFacade = (GroupFacade) obj;
        return Intrinsics.LJFF(this.groupId, groupFacade.groupId) && Intrinsics.LJFF(this.items, groupFacade.items);
    }

    public GroupFacade(String str, List<String> list) {
        this.groupId = str;
        this.items = list;
    }
}
