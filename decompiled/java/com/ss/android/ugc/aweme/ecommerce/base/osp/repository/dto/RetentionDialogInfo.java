package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class RetentionDialogInfo {

    @C09CT("animation_style_info")
    public AnimationStyleInfo animationStyleInfo;

    @C09CT("dialog_data")
    public String dialogData;

    @C09CT("dialog_schema")
    public String dialogSchema;

    @C09CT("enable_retention_dialog")
    public Boolean enableRetentionDialog;

    @C09CT("is_need_operation")
    public Boolean isNeedOperation;

    @C09CT("retention_promotion_snap_info")
    public String retainingPromotionSnapInfo;

    public RetentionDialogInfo() {
        this(null, null, null, null, null, null);
    }

    public RetentionDialogInfo(String str, String str2, String str3, Boolean bool, Boolean bool2, AnimationStyleInfo animationStyleInfo) {
        this.dialogSchema = str;
        this.dialogData = str2;
        this.retainingPromotionSnapInfo = str3;
        this.enableRetentionDialog = bool;
        this.isNeedOperation = bool2;
        this.animationStyleInfo = animationStyleInfo;
    }
}
