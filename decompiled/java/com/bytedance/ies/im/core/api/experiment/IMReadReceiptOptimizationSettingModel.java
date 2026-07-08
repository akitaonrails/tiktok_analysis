package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMReadReceiptOptimizationSettingModel {

    @C09CT("batch_request_common_page_size")
    public final int batRequestCommonPageSize;

    @C09CT("batch_request_first_page_size")
    public final int batchRequestFirstPageSize;

    @C09CT("enable_batch_request_paging")
    public final boolean enableBatchRequestPaging;

    @C09CT("enable_direct_push_read_from_content")
    public final boolean enableDirectPushReadFromContent;

    @C09CT("enable_read_receipt_polling")
    public final boolean enableReadReceiptPolling;

    @C09CT("read_receipt_polling_max_count")
    public final int readReceiptPollingMaxCount;

    @C09CT("read_receipt_polling_time_interval")
    public final int readReceiptPollingTimeInterval;

    public IMReadReceiptOptimizationSettingModel() {
        this(false, 3, 20, true, 20, 10, true);
    }

    public IMReadReceiptOptimizationSettingModel(boolean z, int i, int i2, boolean z2, int i3, int i4, boolean z3) {
        this.enableReadReceiptPolling = z;
        this.readReceiptPollingTimeInterval = i;
        this.readReceiptPollingMaxCount = i2;
        this.enableBatchRequestPaging = z2;
        this.batchRequestFirstPageSize = i3;
        this.batRequestCommonPageSize = i4;
        this.enableDirectPushReadFromContent = z3;
    }
}
