package com.ss.android.ugc.aweme.sticker.ab;

import X.C0C64;
import X.C1630230sWb;

/* JADX INFO: loaded from: classes26.dex */
public final class ChangeImagePickerUIExperiment {
    public static final int $stable = 0;
    public static final ChangeImagePickerUIExperiment INSTANCE = new ChangeImagePickerUIExperiment();
    public static final int OFF = 0;
    public static final int VARIANT_ONE = 1;

    public static final boolean isEnabled() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "effect_upload_picker_ui_change_enabled", true) > 0 && !C1630230sWb.LIZ;
    }

    public final boolean uiOptimizeOrPickerFoldEnabled() {
        return isEnabled() || EffectUploadPickerFolderUIExperiment.isEnabled();
    }
}
