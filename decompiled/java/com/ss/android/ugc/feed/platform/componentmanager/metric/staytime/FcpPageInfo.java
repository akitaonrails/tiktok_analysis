package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C18KW;
import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class FcpPageInfo implements Serializable {
    public final FcpAwemeInfo awemeInfo;
    public final String pageId;
    public final Set<String> uniqueIds;
    public boolean willEndRecordManually;
    public static final C18KW Companion = new Object() { // from class: X.18KW
    };
    public static final int $stable = 8;

    public final FcpAwemeInfo getAwemeInfo() {
        return this.awemeInfo;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final boolean getWillEndRecordManually() {
        return this.willEndRecordManually;
    }

    public final void appendUniqueId(String str) {
        this.uniqueIds.add(str);
    }

    public final boolean isUniqueIdEqual(FcpPageInfo fcpPageInfo) {
        return Intrinsics.LJFF(this.uniqueIds, fcpPageInfo.uniqueIds);
    }

    public final void setWillEndRecordManually(boolean z) {
        this.willEndRecordManually = z;
    }

    public FcpPageInfo(String str, FcpAwemeInfo fcpAwemeInfo, Set<String> set, boolean z) {
        this.pageId = str;
        this.awemeInfo = fcpAwemeInfo;
        this.uniqueIds = set;
        this.willEndRecordManually = z;
    }
}
