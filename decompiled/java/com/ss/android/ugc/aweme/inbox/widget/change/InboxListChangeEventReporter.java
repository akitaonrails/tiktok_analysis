package com.ss.android.ugc.aweme.inbox.widget.change;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes29.dex */
public final class InboxListChangeEventReporter {
    public static final /* synthetic */ int LIZ = 0;

    public static final class SingleChangeDetail {
        public final int itemChangeCount;
        public CopyOnWriteArrayList<String> itemChangeIdentity;
        public final int listChangeCount;
        public Set<String> listChangeIdentity;

        public SingleChangeDetail() {
            this(0, 0, new LinkedHashSet(), new CopyOnWriteArrayList());
        }

        public final void setItemChangeIdentity(CopyOnWriteArrayList<String> copyOnWriteArrayList) {
            this.itemChangeIdentity = copyOnWriteArrayList;
        }

        public final void setListChangeIdentity(Set<String> set) {
            this.listChangeIdentity = set;
        }

        public SingleChangeDetail(int i, int i2, Set<String> set, CopyOnWriteArrayList<String> copyOnWriteArrayList) {
            this.listChangeCount = i;
            this.itemChangeCount = i2;
            this.listChangeIdentity = set;
            this.itemChangeIdentity = copyOnWriteArrayList;
        }
    }
}
