package com.ss.android.ugc.aweme.inbox.search.data.items;

import X.C0PGF;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class InboxSearchRecentStoreItem {
    public static final int $stable = 0;
    public final String content;
    public final long searchTime;
    public final C0PGF type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxSearchRecentStoreItem)) {
            return false;
        }
        InboxSearchRecentStoreItem inboxSearchRecentStoreItem = (InboxSearchRecentStoreItem) obj;
        return this.type == inboxSearchRecentStoreItem.type && Intrinsics.LJFF(this.content, inboxSearchRecentStoreItem.content) && this.searchTime == inboxSearchRecentStoreItem.searchTime;
    }

    public InboxSearchRecentStoreItem(C0PGF c0pgf, String str, long j) {
        this.type = c0pgf;
        this.content = str;
        this.searchTime = j;
    }
}
