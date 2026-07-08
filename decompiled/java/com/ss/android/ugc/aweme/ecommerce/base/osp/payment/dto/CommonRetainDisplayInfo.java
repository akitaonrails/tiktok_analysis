package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonRetainDisplayInfo {

    @C09CT("button_direction")
    public Integer buttonDirection;

    @C09CT("content")
    public List<ContentBlock> content;

    @C09CT("dialog_button")
    public List<DialogButton> dialogButtons;

    @C09CT("common_fail_toast")
    public String failureToast;

    @C09CT("header")
    public HeaderBlock header;

    @C09CT("common_success_toast")
    public String successToast;

    public CommonRetainDisplayInfo() {
        this(null, null, null, null, null, null);
    }

    public CommonRetainDisplayInfo(HeaderBlock headerBlock, List<ContentBlock> list, Integer num, List<DialogButton> list2, String str, String str2) {
        this.header = headerBlock;
        this.content = list;
        this.buttonDirection = num;
        this.dialogButtons = list2;
        this.successToast = str;
        this.failureToast = str2;
    }
}
