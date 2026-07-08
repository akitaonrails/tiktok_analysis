package com.ss.android.ugc.aweme.ecommerce.compliance;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcComplianceConfigModel {

    @C09CT("dialog_btn_color")
    public final String dialogBtnColor;

    @C09CT("dialog_close_type")
    public final Integer dialogCloseType;

    @C09CT("dialog_exposure_save")
    public final Boolean dialogExposureSave;

    @C09CT("scenes")
    public final List<ScenesConfig> scenes;

    @C09CT("toast_content")
    public final String toastContent;

    @C09CT("toast_content_id")
    public final String toastContentId;

    @C09CT("toast_icon")
    public final String toastIcon;

    @C09CT("toast_icon_v2")
    public final ToastIcon toastIconV2;

    public EcComplianceConfigModel(List<ScenesConfig> list, String str, String str2, String str3, ToastIcon toastIcon, String str4, Integer num, Boolean bool) {
        this.scenes = list;
        this.toastContent = str;
        this.toastContentId = str2;
        this.toastIcon = str3;
        this.toastIconV2 = toastIcon;
        this.dialogBtnColor = str4;
        this.dialogCloseType = num;
        this.dialogExposureSave = bool;
    }
}
