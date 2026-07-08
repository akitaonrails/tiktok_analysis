package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimIncentiveWithAddressResponseData {

    @C09CT("exception_ux")
    public final ExceptionUX exceptionUX;

    @C09CT("notice_dialog")
    public final NoticeDialogMessage noticeDialogMessage;

    @C09CT("result_code")
    public final Integer resultCode;

    public ClaimIncentiveWithAddressResponseData(Integer num, NoticeDialogMessage noticeDialogMessage, ExceptionUX exceptionUX) {
        this.resultCode = num;
        this.noticeDialogMessage = noticeDialogMessage;
        this.exceptionUX = exceptionUX;
    }
}
