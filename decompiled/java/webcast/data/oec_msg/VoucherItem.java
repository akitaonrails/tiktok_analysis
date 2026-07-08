package webcast.data.oec_msg;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VoucherItem {

    @C09CT("live_voucher_type")
    public int liveVoucherType;

    @C09CT("task_id")
    public long taskId;

    @C09CT("task_type")
    public int taskType;

    @C09CT("voucher_type_id")
    public long voucherTypeId;

    @C09CT("creator_operation_unique_id")
    public String creatorOperationUniqueId = "";

    @C09CT("voucher_max_face_value")
    public String voucherMaxFaceValue = "";
}
