package com.ss.android.ugc.aweme.operation;

import X.C0Y8T;
import X.C1229100i5c;

/* JADX INFO: loaded from: classes25.dex */
public final class PublicGroupRule implements GroupTypeRule {
    public final int LL = 2;

    @Override // com.ss.android.ugc.aweme.operation.GroupTypeRule
    public final int getGroupType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.operation.GroupTypeRule
    public final boolean GE2(C0Y8T c0y8t) {
        return C1229100i5c.LIZ.LJIIJJI(c0y8t.getConversationId());
    }
}
