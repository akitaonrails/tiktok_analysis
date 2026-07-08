package com.ss.android.ugc.aweme.recommend;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class RecommendCellInfo implements Serializable {

    @C09CT("user_id")
    public final String userId;

    @C09CT("view_delegate_hashcode")
    public final String viewDelegateHashcode;

    public RecommendCellInfo() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendCellInfo)) {
            return false;
        }
        RecommendCellInfo recommendCellInfo = (RecommendCellInfo) obj;
        return Intrinsics.LJFF(this.userId, recommendCellInfo.userId) && Intrinsics.LJFF(this.viewDelegateHashcode, recommendCellInfo.viewDelegateHashcode);
    }

    public RecommendCellInfo(String str, String str2) {
        this.userId = str;
        this.viewDelegateHashcode = str2;
    }
}
