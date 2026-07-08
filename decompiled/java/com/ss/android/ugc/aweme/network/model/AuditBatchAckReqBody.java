package com.ss.android.ugc.aweme.network.model;

import X.C09CT;
import X.C13BV;
import X.EnumC1217990hnh;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditBatchAckReqBody {

    @C09CT("conversation_short_id")
    public final long conversationShortId;

    @C09CT("deselected_apply_ids")
    public final List<Long> deselectedApplyIds;

    @C09CT("operation")
    public final int operation;

    @C09CT("select_all")
    public final boolean selectAll;

    @C09CT("selected_apply_ids")
    public final List<Long> selectedApplyIds;

    public AuditBatchAckReqBody() {
        this(false, 0L, 0, null, null, 31, null);
    }

    public AuditBatchAckReqBody(boolean z, long j, int i, List<Long> list, List<Long> list2) {
        this.selectAll = z;
        this.conversationShortId = j;
        this.operation = i;
        this.selectedApplyIds = list;
        this.deselectedApplyIds = list2;
    }

    public AuditBatchAckReqBody(boolean z, long j, int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? EnumC1217990hnh.UNKNOWN.getValue() : i, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? C13BV.INSTANCE : list2);
    }
}
