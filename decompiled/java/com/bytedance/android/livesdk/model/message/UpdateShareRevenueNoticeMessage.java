package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateShareRevenueNoticeMessage extends AbstractC1136060ffY {

    @C09CT("room_id")
    public long roomId;

    @C09CT("update_shanre_revenue_content")
    public UpdateShareRevenueContent updateShanreRevenueContent;

    @C09CT("update_share_revenue_struct_content")
    public UpdateShareRevenueStructContent updateShareRevenueStructContent;

    public UpdateShareRevenueNoticeMessage() {
        this.type = C001A.UPDATE_SHARE_REVENUE_NOTICE_MESSAGE;
    }
}
