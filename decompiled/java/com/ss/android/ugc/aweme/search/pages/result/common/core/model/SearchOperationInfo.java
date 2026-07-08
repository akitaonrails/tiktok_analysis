package com.ss.android.ugc.aweme.search.pages.result.common.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchOperationInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("live_room")
    public Aweme aweme;

    @C09CT("activity")
    public SearchOperation operation;

    public int hashCode() {
        int iHashCode = this.operation.hashCode() * 31;
        Aweme aweme = this.aweme;
        return iHashCode + (aweme != null ? aweme.hashCode() : 0);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(SearchOperationInfo.class, cls)) {
            return false;
        }
        SearchOperationInfo searchOperationInfo = (SearchOperationInfo) obj;
        if (Intrinsics.LJFF(this.operation, searchOperationInfo.operation) && Intrinsics.LJFF(this.aweme, searchOperationInfo.aweme)) {
            return true;
        }
        return false;
    }

    public final void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    public final void setOperation(SearchOperation searchOperation) {
        this.operation = searchOperation;
    }

    public SearchOperationInfo(SearchOperation searchOperation, Aweme aweme) {
        this.operation = searchOperation;
        this.aweme = aweme;
    }
}
